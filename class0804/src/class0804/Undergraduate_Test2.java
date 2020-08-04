package class0804;

public class Undergraduate_Test2 {

	public static void main(String[] args) {
		Undergraduate person = new Undergraduate();
		
		person.setName("¼±³²");
		person.setNumber(1601);
		person.setClubName("·Îº¿");
		
		System.out.println(person.toString());
		
		Undergraduate person2 = new Undergraduate("¼±³à",1602,"µ¶¼­");
		
		System.out.println(person2.toString());
		
		if(person==person2)
			System.out.println("µÎ °´Ã¼°¡ °°´Ù");
		else
			System.out.println("µÎ °´Ã¼°¡ ´Ù¸£´Ù");
		
	}

}
