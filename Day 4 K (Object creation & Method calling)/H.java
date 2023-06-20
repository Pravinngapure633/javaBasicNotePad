public class H
{
	public static void m1()		// static rahila t direct call kru shakto class name ani direct
	{

		int a=10;
  		int b=20;
		int result=a+b;
	
		System.out.println(result);

	}

	public static void m2()
	{
	System.out.println("m2___");

	}
	public static void main(String args[] )
	{
		H a=new H();
  		a.m1();			
   		a.m2();

		H.m1();		//  class name*method 
		H.m2();

		m1();			//direct
		m2();
	}


}