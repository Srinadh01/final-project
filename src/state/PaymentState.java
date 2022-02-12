package state;

import command.Accountant;
import command.Command;
import command.Invoice;
import command.Payments;
import command.ReceivePaymentCommand;
import command.SendInvoiceCommand;

public class PaymentState implements State {
	OtrMachine otrMachine; 
	Accountant accountant;
	
	
	public PaymentState(OtrMachine otrMachine, Accountant accountant) {
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
		// TODO Auto-generated method stub
		System.out.println("Processing Payments");
		Payments payments = new Payments();
		Command receivePaymentsCommand = new ReceivePaymentCommand(payments);
		accountant.setCommand(receivePaymentsCommand);
		accountant.takeAction();
		otrMachine.setState(otrMachine.getReportState());
	}

	@Override
	public void generateReports() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendInvoices() {
		// TODO Auto-generated method stub

	}

}
