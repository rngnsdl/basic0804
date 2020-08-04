package class0804;

public class Manager extends Employee{
	
	protected double bonus; // ���ʽ�
	
	Manager(String name, double salary, double bonus){
		super(name,salary);
		this.bonus = bonus;
	}
	
	double getBonus() {
		return this.bonus;
	}
	
	public void raiseSalary(){
		super.salary = salary*1.2;
	}
}
