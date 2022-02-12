package state;

public interface State {
	public void sendAlerts();
	public void sendNotifications();
	public void sendPayments();
	public void generateReports();
	public void sendInvoices();
}
