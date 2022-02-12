package state;

import command.Accountant;
import command.AlertSendCommand;
import command.Alerts;
import command.Command;
import command.Notification;
import command.SendNotificationCommand;

public class NotificationState implements State {
	OtrMachine otrMachine; 
	Accountant accountant;
	
	public NotificationState(OtrMachine otrMachine, Accountant accountant) {
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
		System.out.println("Sending notifications");
		Notification notification = new Notification();
		Command sendNotificationCommand = new SendNotificationCommand(notification);
		accountant.setCommand(sendNotificationCommand);
		accountant.takeAction();
		otrMachine.setState(otrMachine.getInvoiceState());
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
		
	}



}
