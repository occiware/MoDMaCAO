package org.modmacao.cm.ansible;

public class AnsibleReturnState {
	private int exitValue;
	private String stateMessage;
	
	public String getStateMessage() {
		return stateMessage;
	}

	public int getExitValue() {
		return exitValue;
	}

	public AnsibleReturnState(int exitValue, String stateMessage) {
		this.exitValue = exitValue;
		this.stateMessage = stateMessage;
	}
	
	
	
	
}
