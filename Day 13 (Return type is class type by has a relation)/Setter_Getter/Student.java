public class Student
{
	private int rollno;
	private String name;
	private Batch batch;


	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public void setBatch(Batch batch)
	{
		this.batch=batch;
	}
	public Batch getBatch()
	{
		return batch;
	}

}