public class Test
{

	public static void main(String [] args)
	{
		Address add=new Address();
			add.areaname="AKURDI";
			add.cityname="PUNE";
			add.pincode=4411033;
			System.out.println(add);
				
		
		Student stu=new Student();
			stu.rollno=101;
			stu.name="ABC";
			stu.address=add;


		System.out.println(stu.rollno);
		System.out.println(stu.name);
		System.out.println(stu.address);
		System.out.println(stu.address.areaname);
		System.out.println(stu.address.cityname);
		System.out.println(stu.address.pincode);
		
	}



}