package driver;
import command.*;
public class CommandDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alerts alerts = new Alerts();
		Invoice invoice = new Invoice();
		Notification notification = new Notification();
		Payments payments = new Payments();
		Reports reports = new Reports();
		
		AlertSendCommand alertCommand = new AlertSendCommand(alerts);
		AlertCancelCommand alertsCancelCommand = new AlertCancelCommand(alerts);
		
		Accountant accountant = new Accountant();
		
		accountant.setCommand(alertCommand);
		accountant.takeAction();
		
		accountant.setCommand(alertsCancelCommand);
		accountant.takeAction();
	}

}
