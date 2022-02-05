package command;

public class AlertSendCommand implements Command {
	Alerts alerts;
	
	@Override
	public void execute() {
		alerts.sendAlerts();

	}
	public AlertSendCommand(Alerts alerts) {
		this.alerts = alerts;
	}	

}
