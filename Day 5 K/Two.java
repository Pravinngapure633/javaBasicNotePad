public class Two
{
	
	public Two()
	{
	  System.out.println("Hey");
	}

	public void sum1()
	{
	  System.out.println("Hello");
	}

	public void sum2()
	{
	  System.out.println("Ok");
	  sum1();
	}

	public static void main(String args [])
	{
	  System.out.println("Main");
	   Two t=new Two();
	     t.sum2();

		Tcom x=new Tcom();
		   x.sum3();

		T3 y=new T3();
	}




}