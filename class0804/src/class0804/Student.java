package class0804;

public class Student {

	protected String name;//�̸�
	protected int number;//�й�
	
	Student(){
		
	}
	
	Student(String name, int number){
		this.name=name;
		this.number=number;
	}
	
	@Override
	public String toString() {
		return ("��Ʃ��Ʈ Ŭ������ ����Ʈ��...\n"+"�̸�: "+this.name+",�й�: "+this.number);
	}
	
	public boolean equals(Student other) {
		return (this.name.equals(other.name))&&(this.number == other.number);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
