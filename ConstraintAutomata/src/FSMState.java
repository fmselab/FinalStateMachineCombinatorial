
public class FSMState {
	private String startStateName;
	private String finalStateName;
	private String receivedMsg;
	private String sentMsg;
	
	public FSMState(String startStateName, String finalStateName, String receivedMsg, String sentMsg) {
		this.startStateName = startStateName;
		this.finalStateName = finalStateName;
		this.receivedMsg = receivedMsg;
		this.sentMsg = sentMsg;
	}
	
	public String getStartStateName() {
		return startStateName;
	}

	public void setStartStateName(String startStateName) {
		this.startStateName = startStateName;
	}

	public String getFinalStateName() {
		return finalStateName;
	}

	public void setFinalStateName(String finalStateName) {
		this.finalStateName = finalStateName;
	}

	public String getReceivedMsg() {
		return receivedMsg;
	}

	public void setReceivedMsg(String receivedMsg) {
		this.receivedMsg = receivedMsg;
	}

	public String getSentMsg() {
		return sentMsg;
	}

	public void setSentMsg(String sentMsg) {
		this.sentMsg = sentMsg;
	}
	
	
}
