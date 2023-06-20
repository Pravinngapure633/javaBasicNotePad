import java.util.*;

public class Test1
{
	public static void main(String[]args)
	{
		System.out.println("Data");

		Scanner xz=new Scanner(System.in);
		Employee emp=new Employee();

		System.out.println("Emplyee ID - ");
		emp.eid= xz.nextInt();

		System.out.println("Employee Name - ");
		emp.name= xz.next()+xz.nextLine();

		System.out.println("Employee Designation - ");
		emp.designation= xz.next()+xz.nextLine();

		System.out.println("Employee Salary - ");
		emp.salary= xz.nextDouble();		  

		System.out.println("Employee Shift A/B/C ");
			String s=xz.next();
			emp.shift=s.charAt(0);

		System.out.println("Employee ID is- "+emp.eid);
		System.out.println("Employee Name is- "+emp.name);	
		System.out.println("Employee Designation is- "+emp.designation);
		System.out.println("Employee  Salary- "+emp.salary);
		System.out.println("Employee Shift- "+emp.shift);

	}
}