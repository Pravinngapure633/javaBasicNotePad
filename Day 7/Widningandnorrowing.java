public class Widningandnorrowing
{
	public static void main(String args [])
	{
		Widningandnorrowing q=new Widningandnorrowing();
			q.widning();
			xxxx x=new xxxx();		
			x.p1();
	}

	public void widning()
	{
      byte b= 10;
	  int i= b;
	  long l= i;
	  float f= l;
	  double d= f;
	  System.out.println("value of double:"+f);

	}
}

	 class xxxx
{
	public void p1()
	{
		double a=123.22d;
		float b=(float)a;
		long c=(long)b;
		int d=(int)c;
		short e=(short)d;
		byte f=(byte)e;
		System.out.println("value of f is:"+f);
	}
}
