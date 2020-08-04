package class0804.copy;

public class WalkupTicket extends Ticket{
	private boolean payByCredit;
	
	WalkupTicket(int number, boolean payByCredit){
		super(number);
		this.payByCredit = payByCredit;
	}

	public boolean getPayByCredit() {
		return payByCredit;
	}
	
	@Override
	public String toString() {
		String sum = ""+getNumber()+getPayByCredit()+getPrice();
		return sum;
	}
	
	
	
}
