package command;

public class Reports {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void generateReports() {
		System.out.println("Generating reports");
	}
	public void cancelReports() {
		System.out.println("Cancel reports");
	}
}
