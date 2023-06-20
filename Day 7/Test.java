public class Test
{
	public void m1(int i)
	{
	  System.out.println("Value of i is:"+i);
	}

	public void m2(String s)
	{
	  System.out.println("Value of s is:"+s);
	}

	public void m3(boolean b , char c)
	{
	  System.out.println("Value of b is:"+b+"  "+"Value of c is:"+c);
	}

	public static void main(String args[])
	{
	  Test test=new Test();
		test.m1(10);
		test.m2("ABC");
		test.m3(true , 'C');
	}



}