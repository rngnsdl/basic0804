package class0804;

public class Undergraduate_Test {

	public static void main(String[] args) {
		Undergraduate student1 = new Undergraduate("1��", 555, "1-1��");
		Undergraduate student2 = new Undergraduate("2��", 555, "2-1��");
		
		System.out.println(student1.toString());
		
		System.out.println(student1.equals(student1));
		}
}
