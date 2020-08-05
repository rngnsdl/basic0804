package class0804;

public class Employee_Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("홍길동",14.1);
		Employee employee2 = new Employee("홍길동2",146.1);
		Manager manager = new Manager("매니저홍길동",22.2,52.3);
		Manager manager2 = new Manager("매니저홍길동2",122.2,126.3);
		Executive exe = new Executive("임원홍길동",31.3,3.4,95.5);
		Executive exe2 = new Executive("임원홍길동2",131.3,8.6,105.5);
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
			System.out.println("직원"+count+"의 이름: "+i.getName()+" 이고"+", 봉급은: "+i.getSalary());
		    count++;
		}
		for(Manager i:mgr) {
			System.out.println("부장"+count1+"의 이름: "+i.getName()+" 이고"+", 봉급은: "+i.getSalary());
			count1++;
		}
		for(Executive i:exeArr) {
			System.out.println("임원"+count2+"의 이름: "+i.getName()+" 이고"+", 봉급은 "+i.getSalary());
			count2++;
		}
	}

}
