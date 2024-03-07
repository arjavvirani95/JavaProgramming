package day6_Java_ObjectCalling;

public class StudentMain {

	public static void main(String[] args) 
	{

		//Student stu=new Student();

		//Apprach1: using reference variable
		/*stu.sid=102;
		stu.sname="John";
		stu.grade='A';
		 */

		//Appraoch 2: using method
		//stu.setData(102,"John",'A');

		//Appraoch 3 : using constructor	
		Student stu=new Student(101,"Riddhi","A+");

		stu.show();

	}
}
