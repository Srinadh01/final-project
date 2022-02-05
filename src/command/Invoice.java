package command;

public class Invoice {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void sendInvoice() {
		System.out.println("Send Invoice");
	}
	public void cancelInvoice() {
		System.out.println("Cancel Invoice");
	}
}
