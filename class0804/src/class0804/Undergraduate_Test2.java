package class0804;

public class Undergraduate_Test2 {

	public static void main(String[] args) {
		Undergraduate person = new Undergraduate();
		
		person.setName("����");
		person.setNumber(1601);
		person.setClubName("�κ�");
		
		System.out.println(person.toString());
		
		Undergraduate person2 = new Undergraduate("����",1602,"����");
		
		System.out.println(person2.toString());
		
		if(person==person2)
			System.out.println("�� ��ü�� ����");
		else
			System.out.println("�� ��ü�� �ٸ���");
		
	}

}
