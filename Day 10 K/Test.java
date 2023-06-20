package Studentinfo;
import Studentinfo.Student;
public class Test 
{
	public static void main(String args [])
	{
		Student priyanka=new Student(1,"XYZ");
		Student gauri=new Student(2,"PQR");

		System.out.println(priyanka.rollno);
		System.out.println(priyanka.name);
		System.out.println(gauri.rollno);
		System.out.println(gauri.name);
	}
}