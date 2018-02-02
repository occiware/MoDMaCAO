/**
 * 
 */
package org.modmacao.ansible.connector;

import java.util.List;
import java.util.Optional;

import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.emf.common.util.EList;

public class MixinUtils {
	 /**
     * Get the mixin base instance tClass to apply on
     * instance.
     */
    public static <T extends MixinBase> Optional<T> getMixin(EList<MixinBase> mixins, Class<T> tClass){
        List<MixinBase> mixinBase = mixins;
        return mixinBase.stream()
                .filter(mixinB -> tClass.isInstance(mixinB))
                .findFirst()
                .map(mixin -> (T) mixin);
    }

    /**
     * Get the mixin base instance tClass to apply on
     * instance.
     */
    public static <T extends MixinBase> Optional<T> getMixin(EList<MixinBase> mixins, List<Class<T>> tClasses){
        List<MixinBase> mixinBases = mixins;
        return mixinBases.stream()
                .filter(mixinB -> tClasses.stream()
                        .anyMatch(tClass -> tClass.isInstance(mixinB)))
                .findFirst()
                .map(mixin -> (T) mixin);
    }
}
