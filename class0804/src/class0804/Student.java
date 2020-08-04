package class0804;

public class Student {

	protected String name;//이름
	protected int number;//학번
	
	Student(){
		
	}
	
	Student(String name, int number){
		this.name=name;
		this.number=number;
	}
	
	@Override
	public String toString() {
		return ("스튜던트 클래스의 투스트링...\n"+"이름: "+this.name+",학번: "+this.number);
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
