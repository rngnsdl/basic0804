package class0804;

public class Employee_Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("ȫ�浿",14.1);
		Employee employee2 = new Employee("ȫ�浿2",146.1);
		Manager manager = new Manager("�Ŵ���ȫ�浿",22.2,52.3);
		Manager manager2 = new Manager("�Ŵ���ȫ�浿2",122.2,126.3);
		Executive exe = new Executive("�ӿ�ȫ�浿",31.3,3.4,95.5);
		Executive exe2 = new Executive("�ӿ�ȫ�浿2",131.3,8.6,105.5);
		Employee[] emp = new Employee[2];
		Manager[] mgr = new Manager[2];
		Executive[] exeArr = new Executive[2];
		
		emp[0] = employee;
		emp[1] = employee2;
		mgr[0] = manager;
		mgr[1] = manager2;
		
		exeArr[0] = exe;
		exeArr[1] = exe2;
		
		emp[0].raiseSalary();
		emp[1].raiseSalary();
		mgr[0].raiseSalary();
		mgr[1].raiseSalary();
		exeArr[0].raiseSalary();
		exeArr[1].raiseSalary();
		
		int count=1;
		int count1=1;
		int count2=1;
		
		for(Employee i:emp) {
			System.out.println("����"+count+"�� �̸�: "+i.getName()+" �̰�"+", ������: "+i.getSalary());
		    count++;
		}
		for(Manager i:mgr) {
			System.out.println("����"+count1+"�� �̸�: "+i.getName()+" �̰�"+", ������: "+i.getSalary());
			count1++;
		}
		for(Executive i:exeArr) {
			System.out.println("�ӿ�"+count2+"�� �̸�: "+i.getName()+" �̰�"+", ������ "+i.getSalary());
			count2++;
		}
	}

}
