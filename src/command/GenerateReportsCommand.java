package command;

public class GenerateReportsCommand implements Command {
	Reports reports;
	
	public GenerateReportsCommand(Reports reports) {
		this.reports = reports;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		reports.generateReports();
	}

}
