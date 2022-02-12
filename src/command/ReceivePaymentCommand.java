package command;

public class ReceivePaymentCommand implements Command {
	Payments payments;
	
	public ReceivePaymentCommand(Payments payments) {
		this.payments = payments;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		payments.recievePayments();
	}

}
