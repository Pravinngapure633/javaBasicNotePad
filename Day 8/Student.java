public class Student
{
	int rollno;							//
	String name;						//	VARIABLE DECLARATION
	long mobileno;						//

	public static void main(String args [])
	{
	  Student s=new Student();							//1

	  System.out.println(s);							// ADDRESSS
	  System.out.println(s.rollno);
	  System.out.println(s.name);
	  System.out.println(s.mobileno);
	
	Student stu=new Student();							//2
		stu.rollno= 111;
		stu.name= "Vishal";
		stu.mobileno=9898989898l;

	System.out.println("    ");
	System.out.println(stu.toString());						//.toString()- PRIDEFINE HAI
	System.out.println("Student Roll no is="+ stu.rollno);
	System.out.println("Student name is= " + stu.name);
	System.out.println("Student mobile no is= "+ stu.mobileno);

	Student stu2=new Student();							//3   kiti pn creat kru shakto
		stu2.rollno= 33;
		stu2.name= "shital";
		stu2.mobileno=9898989898l;


	System.out.println("     ");
	System.out.println(stu2);
	System.out.println("Student Roll no is ="+ stu2.rollno);
	System.out.println("Student Name is="+ stu2.name);
	System.out.println("Student Mobile no is=" + stu2.mobileno);
	
	}





}