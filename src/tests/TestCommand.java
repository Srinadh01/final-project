package tests;

import command.Accountant;
import command.AlertCancelCommand;
import command.AlertSendCommand;
import command.Alerts;

public class TestCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alerts alerts = new Alerts();
		AlertSendCommand alertCommand = new AlertSendCommand(alerts);
		AlertCancelCommand alertsCancelCommand = new AlertCancelCommand(alerts);
		Accountant accountant = new Accountant();
		
		accountant.setCommand(alertCommand);
		accountant.takeAction();
	}

}
