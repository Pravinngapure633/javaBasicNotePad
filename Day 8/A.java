public class A
{

  
	byte b;
	short s;
	int i;
	

	public static void main(String ... args)
	{
	   A a=new A();
	   System.out.println(a.b);
	   System.out.println(a.s);
	   System.out.println(a.i);

		M m=new M();

	   System.out.println(m.l);
	   System.out.println(m.f);
	   System.out.println(m.d);
	   System.out.println(m.c);
	   System.out.println(m.x);
	  


	}
}
	class M
	{
		long l;
		float f;
		double d;
		char c;
		boolean x;
	}

