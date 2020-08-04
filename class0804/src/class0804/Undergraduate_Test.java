package class0804;

public class Undergraduate_Test {

	public static void main(String[] args) {
		Undergraduate student1 = new Undergraduate("1번", 555, "1-1번");
		Undergraduate student2 = new Undergraduate("2번", 555, "2-1번");
		
		System.out.println(student1.toString());
		
		System.out.println(student1.equals(student1));
		}
}
