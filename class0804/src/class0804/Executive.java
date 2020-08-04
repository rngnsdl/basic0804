package class0804;

public class Executive extends Manager{
	
	private double stockOption; //¸â¹öº¯¼ö
	
	Executive(String name, double salary, double bonus, double stockOption){
		super(name,salary,bonus);
		this.stockOption = stockOption;
	}

	double getStockOption() {
		return this.stockOption;
	}
	
	public void raiseSalary() {
		super.salary *= 1.1;
	}
}
