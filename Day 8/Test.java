public class Test
{
	int i=10;
	String s= "ABC";
	float f= 10.22f;

	public static void main(String ... arg)
	{
		Test t=new Test();
		System.out.println(t);
		System.out.println(t.i);
		System.out.println(t.s);
		System.out.println(t.f);

			t.i=20;
			t.s="PQR";
			t.f=22.022f;

		System.out.println(t);
		System.out.println(t.i);
		System.out.println(t.s);
		System.out.println(t.f);

	}



}