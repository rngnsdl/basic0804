package class0804;

public class Employee {
	
	String name; //�̸�
	double salary; //����
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	String getName() {
		return this.name;
	}
	
	double salary() {
		return this.salary;
	}
	
	public void raiseSalary() {
		this.salary = salary*1.3;
	}
}
