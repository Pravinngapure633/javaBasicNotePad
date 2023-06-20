public class Test
{
	public static void main(String [] args)
	{
		Course c=new Course();
		c.setCid(101);
		c.setCname("JAVA");
		c.setDuration("3-mo");
		

		Faculty f=new Faculty();
		f.setFid(10);		
		f.setFname("Saurabh sir");
		f.setSalary(100000d);
		f.setCourse(c);

		Batch b=new Batch();
		b.setBid(20);
		b.setBname("sep-22");
		b.setFaculty(f);

		Student s=new Student();
		s.setRollno(30);
		s.setName("Pravin");
		s.setBatch(b);


		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getBatch());
		System.out.println(s.getBatch().getBid());
		System.out.println(s.getBatch().getBname());
		System.out.println(s.getBatch().getFaculty());
		System.out.println(s.getBatch().getFaculty().getFid());
		System.out.println(s.getBatch().getFaculty().getFname());
		System.out.println(s.getBatch().getFaculty().getSalary());
		System.out.println(s.getBatch().getFaculty().getCourse());
		System.out.println(s.getBatch().getFaculty().getCourse().getCid());
		System.out.println(s.getBatch().getFaculty().getCourse().getCname());
		System.out.println(s.getBatch().getFaculty().getCourse().getDuration());


	}






}