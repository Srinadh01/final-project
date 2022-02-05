package command;

public class CancelInvoiceCommand implements Command {
	Invoice invoice;
	public CancelInvoiceCommand(Invoice invoice) {
		this.invoice = invoice;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		invoice.cancelInvoice();
	}

}
