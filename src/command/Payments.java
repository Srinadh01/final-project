package command;

public class Payments {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void sendPayments() {
		System.out.println("Send Payments");
	}
	public void recievePayments() {
		System.out.println("Recieve Payments");
	}
	public void cancelPayments() {
		System.out.println("Cancel Payments");
	}
}
