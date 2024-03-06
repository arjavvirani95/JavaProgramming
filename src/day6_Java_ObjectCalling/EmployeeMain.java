package day6_Java_ObjectCalling;

public class EmployeeMain {

	public static void main(String[] args)
	{
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="Arjav";
		emp1.job="QA Analyst java selenium";
		emp1.esal=65000;
			
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Bhopal";
		emp2.job="Fullstack Engineer Javascrpt node";
		emp2.esal=11000;
				
		emp2.display();
	}
}
