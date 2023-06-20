import java.util.Scanner;

public class Test
{
	public static void main(String[]args)
	{
	   Scanner ab=new Scanner(System.in);
	   
	   System.out.println("Enter Roll NO");
	   int rollno=ab.nextInt();

	   System.out.println("Enter Name");
	   String name=ab.next()+ab.nextLine();

	   System.out.println("Roll No is= "+rollno);
	   System.out.println("Name is = "+name);

	}




}