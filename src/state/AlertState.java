package state;

import command.Accountant;
import command.Alerts;
import command.*;
public class AlertState implements State {
	OtrMachine otrMachine; 
	Accountant accountant;

	

	public AlertState(OtrMachine otrMachine, Accountant accountant) {
		this.otrMachine = otrMachine;
		this.accountant = accountant;
	}

	@Override
	public void sendAlerts() {
		// TODO Auto-generated method stub
		System.out.println("Sending alerts");
		Alerts alerts = new Alerts();
		Command alertsSendCommand = new AlertSendCommand(alerts);
		accountant.setCommand(alertsSendCommand);
		accountant.takeAction();
		otrMachine.setState(otrMachine.getNotificationState());
	}

	@Override
	public void sendNotifications() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendPayments() {
		// TODO Auto-generated method stub
		System.out.println("Send alerts first");
	}

	@Override
	public void generateReports() {
		// TODO Auto-generated method stub
		System.out.println("Generate reports after receiving payments");
	}

	@Override
	public void sendInvoices() {
		// TODO Auto-generated method stub

	}

}
