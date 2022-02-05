package command;

public class Accountant {
	Command slot;
	
	public void setCommand(Command slot) {
		this.slot = slot;
	}
	public void takeAction() {
		slot.execute();
	}
}
