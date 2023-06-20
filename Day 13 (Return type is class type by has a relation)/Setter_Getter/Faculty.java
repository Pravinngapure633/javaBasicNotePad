public class Faculty
{
		private int fid;  
		private String fname;
		private double salary;
		private Course course;

	public void setFid(int fid)
	{
		this.fid=fid;
	}
	public int getFid()
	{
		return fid;
	}

	public void setFname(String fname)
	{
		this.fname=fname;
	}
	public String getFname()
	{
		return fname;
	}

	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}

	public void setCourse(Course course)
	{
		this.course=course;
	}
	public Course getCourse()
	{
		return course;
	}






}