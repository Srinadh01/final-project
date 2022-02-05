package command;

public class SendInvoiceCommand implements Command {
	Invoice invoice;
	public SendInvoiceCommand(Invoice invoice) {
		this.invoice = invoice;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		invoice.sendInvoice();
	}

}
