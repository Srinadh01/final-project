package state;
import command.*;
public class OtrMachine {
	State alertState;
	State invoiceState;
	State notificationState;
	State paymentState;
	State reportState;
	
	State state;
	
	public OtrMachine(Accountant accountant) {
		alertState = new AlertState(this, accountant);
		invoiceState = new InvoiceState(this, accountant);
		notificationState = new NotificationState(this, accountant);
		paymentState = new PaymentState(this, accountant);
		reportState = new ReportState(this, accountant);
		
		state = alertState;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public State getAlertState() {
		return alertState;
	}
	public State getNotificationState() {
		return notificationState;
	}
	public State getInvoiceState() {
		return invoiceState;
	}
	public State getPaymentState() {
		return paymentState;
	}
	public State getReportState() {
		return reportState;
	}
	public void generateReports() {
		state.generateReports();
	}
	public void sendAlerts() {
		state.sendAlerts();
	}
	public void sendInvoices() {
		state.sendInvoices();
	}
	public void sendNotifications() {
		state.sendNotifications();
	}
	public void receivePayments() {
		state.sendPayments();
	}
	public String toString() {
		return "OTR machine in " + state;
	}
}
