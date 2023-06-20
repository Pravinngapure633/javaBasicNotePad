        public class Test
{
	public static void main(String args [])
	{
		Course c=new Course(101, "JAVA", 95000d, "6-Month" );

		Faculty f=new Faculty(10, "Saurabh Sir", 100000d, c);

		Batch b=new Batch(20, "Sep-22", f);
	
		Student s=new Student(30, "Pravin", b);


		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(s.batch);
		System.out.println(s.batch.bid);
		System.out.println(s.batch.bname);
		System.out.println(s.batch.faculty);
		System.out.println(s.batch.faculty.fid);
		System.out.println(s.batch.faculty.fname);
		System.out.println(s.batch.faculty.salary);
		System.out.println(s.batch.faculty.course);
		System.out.println(s.batch.faculty.course.cid);
		System.out.println(s.batch.faculty.course.cname);
		System.out.println(s.batch.faculty.course.fees);
		System.out.println(s.batch.faculty.course.duration);
		
		


				

	}


}