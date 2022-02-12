package tests;

import command.Accountant;
import command.Notification;
import state.OtrMachine;

public class TestState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accountant accountant =  new Accountant();
		
		OtrMachine otrMachine = new OtrMachine(accountant);
		
		System.out.println(otrMachine.getState().getClass());

		otrMachine.sendAlerts();
		
		if (otrMachine.getState().getClass() == Notification.class) {
			System.out.println("State pattern command passed");
		}
		else {
			System.out.println("State pattern unit test failed");
		}

	}

}
