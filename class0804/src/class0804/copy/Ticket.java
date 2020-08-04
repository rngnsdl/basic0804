package class0804.copy;

public class Ticket {
	protected int number; //입장권 번호
	protected double price; //입장권 가격
	
	Ticket(int number){
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return ("번호: "+number+", 가격: "+price);
	}
}
