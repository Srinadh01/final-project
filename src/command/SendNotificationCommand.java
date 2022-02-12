package command;

public class SendNotificationCommand implements Command {
	Notification notification;
	
	public SendNotificationCommand(Notification notification) {
		this.notification = notification;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		notification.sendNotifications();
	}

}
