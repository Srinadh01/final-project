package state;

import command.Accountant;
import command.AlertSendCommand;
import command.Alerts;
import command.Command;
import command.Invoice;
import command.SendInvoiceCommand;

public class InvoiceState implements State{
	OtrMachine otrMachine; 
	Accountant accountant;
	
	public InvoiceState(OtrMachine otrMachine, Accountant accountant) {
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
		
	}

	@Override
	public void sendInvoices() {
		// TODO Auto-generated method stub
		System.out.println("Sending Invoices");
		Invoice invoice = new Invoice();
		Command sendInvoiceCommand = new SendInvoiceCommand(invoice);
		accountant.setCommand(sendInvoiceCommand);
		accountant.takeAction();
		otrMachine.setState(otrMachine.getPaymentState());
	}

}
