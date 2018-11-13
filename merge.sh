#!/bin/bash

LIST=`cat conflictedFiles`

for ITEM in $LIST; do
	git checkout --theirs  $ITEM

done
