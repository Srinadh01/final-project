package command;

public class AlertCancelCommand implements Command {
	Alerts alerts;
	
	public AlertCancelCommand(Alerts alerts) {
		this.alerts = alerts;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		alerts.cancelAlerts();
	}

}
