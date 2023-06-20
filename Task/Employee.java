  public class Employee
{
 		int eid;
		String ename;
		String designation;
		double salary;

	public static void main(String [] args)
	{
		Employee e=new Employee();
		e.eid=3246;
		e.ename="pravin";
		e.designation="Pune";
		e.salary=644656.216d;
		System.out.println("EID IS:"+e.eid);
		System.out.println("ENAME IS:"+e.ename);
		System.out.println("DESIGNATON IS:"+e.designation);
		System.out.println("SALARY IS:"+e.salary);
	} 
}