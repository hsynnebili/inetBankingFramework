package Oops;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpAge(32);
		emp.setEmpName("Jake");
		emp.setSsn(123456);

		System.out.println(emp.getEmpAge());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSsn());
	}

}
