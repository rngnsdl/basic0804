package class0804.copy;

public class Ticket {
	protected int number; //����� ��ȣ
	protected double price; //����� ����
	
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
		return ("��ȣ: "+number+", ����: "+price);
	}
}
