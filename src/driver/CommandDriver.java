package driver;
import command.*;
import state.*;
public class CommandDriver {

	public static void main(String[] args) {

		
		Accountant accountant =  new Accountant();
		
		OtrMachine otrMachine = new OtrMachine(accountant);
		

		System.out.println();
		otrMachine.sendAlerts();
		System.out.println();
		otrMachine.sendNotifications();
		System.out.println();
		otrMachine.sendInvoices();
		System.out.println();
		otrMachine.receivePayments();
		System.out.println();
		otrMachine.generateReports();
		
	}

}
