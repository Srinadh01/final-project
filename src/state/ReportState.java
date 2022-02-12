package state;

import command.Accountant;
import command.Command;
import command.Payments;
import command.ReceivePaymentCommand;
import command.Reports;
import command.GenerateReportsCommand;

public class ReportState implements State {
	OtrMachine otrMachine; 
	Accountant accountant;
	
	
	public ReportState(OtrMachine otrMachine, Accountant accountant) {
		this.otrMachine = otrMachine;
		this.accountant = accountant;
	}

	@Override
	public void sendAlerts() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendNotifications() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendPayments() {
		// TODO Auto-generated method stub

	}

	@Override
	public void generateReports() {
		// TODO Auto-generated method stub
		System.out.println("Generating Reports");
		Reports reports = new Reports();
		Command generateReportsCommand = new GenerateReportsCommand(reports);
		accountant.setCommand(generateReportsCommand);
		accountant.takeAction();

	}

	@Override
	public void sendInvoices() {
		// TODO Auto-generated method stub

	}

}
