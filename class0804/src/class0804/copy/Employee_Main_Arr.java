package class0804.copy;

import java.util.ArrayList;
import java.util.List;

public class Employee_Main {

	public static void main(String[] args) {
		
	
		//Employee[] emp = new Employee[2];
		List<Employee>emp = new ArrayList<Employee>();
		//Manager[] mgr = new Manager[2];
		List<Manager>mgr = new ArrayList<Manager>();
		//Executive[] exeArr = new Executive[2];
		List<Executive>exeArr = new ArrayList<Executive>();
		
		
		emp.add(new Employee("홍길동",14.1));
		emp.add(new Employee("홍길동2",146.1));
		mgr.add(new Manager("매니저홍길동",22.2,52.3));
		mgr.add(new Manager("매니저홍길동2",122.2,126.3));
		exeArr.add(new Executive("임원홍길동",31.3,3.4,95.5));
		exeArr.add(new Executive("임원홍길동2",131.3,8.6,105.5));
		
		emp.get(0).raiseSalary();
		emp.get(1).raiseSalary();
		mgr.get(0).raiseSalary();
		mgr.get(1).raiseSalary();
		exeArr.get(0).raiseSalary();
		exeArr.get(1).raiseSalary();
		for(Employee i:emp)i.raiseSalary();
		/*
		 * emp.get(0).raiseSalary(); emp.get(1).raiseSalary();
		 */
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
