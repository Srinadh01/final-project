package command;

public class Notification {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void sendNotifications() {
		System.out.println("Send Notifications");
	}
	public void cancelNotifications() {
		System.out.println("Cancel Notifications");
	}
}
