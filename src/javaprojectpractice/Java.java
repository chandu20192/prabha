package javaprojectpractice;



	    class id
		{
			public void Employee_id()
			{
				System.out.println("Enter employee id");
			}
		}
		class age extends id
		{
			public void Employee_age()
			{
				System.out.println("Enter employee age");
			}
		}
		class name extends age
		{
			public void Employee_name()
			{
				System.out.println("Enter employee name");
			}
		}
		class salary extends name
		{
			public void Employee_salary()
			{
				System.out.println("Enter employee salary");
			}
		}
		class Deapartment extends salary
		{
			public void Employee_Department()
			{
				System.out.println("Enter employee department");
			}
		}
		public class EmployeeDetails extends Deapartment
		{
			public static void main(String args[])
			{
				EmployeeDetails e =new EmployeeDetails();
				e.Employee_id();
				e.Employee_age();
				e.Employee_name();
				e.Employee_salary();
				e.Employee_Department();
				System.out.println("Employee Details should be displayed");
			}
		

	}


