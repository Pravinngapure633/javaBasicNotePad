public class Emp1
{
    public void Pravin( int eid, String ename, String address, double salary)
	{
		System.out.println("EID IS:"+eid+"  "+"NAME:"+ename+"  "+"ADD:"+address+" "+"SALARY"+salary);
	}
	public static void main(String [] args)
	{
		Pravin p=new Pravin();
		p.eid=8789;
		p.ename="pravin";
		p.address="pune";
		p.salary=65664.665d;
	}


}