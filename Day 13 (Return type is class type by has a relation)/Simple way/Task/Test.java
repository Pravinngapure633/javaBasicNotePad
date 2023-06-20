public class Test
{
		public static void main(String args [])
		{
			Course c=new Course();
					c.cid=10;
					c.cname="CJC";
					c.fess=95000;
					c.duration="6 MONTH";

			Faculty f=new Faculty();
					f.fid=11;
					f.fname="SAURABH SIR";
					f.salary=100000d;
					f.course=c;

			Batch b=new Batch();
					b.bid=102;
					b.bname="SEP-22";
					b.faculty=f;

			Student s=new Student();
					s.rollno=30;
					s.name="pRAVIN";
					s.batch=b;

			System.out.println(s);
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
			System.out.println(s.batch.faculty.course.fess);
			System.out.println(s.batch.faculty.course.duration);

		}


}