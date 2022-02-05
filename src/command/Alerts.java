package command;

public class Alerts {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void sendAlerts() {
		System.out.println("Send Alerts");
	}
	public void cancelAlerts() {
		System.out.println("Cancel Alerts");
	}
}
