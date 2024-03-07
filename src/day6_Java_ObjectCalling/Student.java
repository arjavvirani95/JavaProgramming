package day6_Java_ObjectCalling;

public class Student {

	int sid;
	String sname;
	String grade;

	void show()
	{
		System.out.println(sid+"   "+sname+"   "+grade);
	}

	void setData(int id, String name, String g)
	{
		sid=id;
		sname=name;
		grade=g;

	}

	Student(int id, String name, String g)
	{
		sid=id;
		sname=name;
		grade=g;

	}
}
