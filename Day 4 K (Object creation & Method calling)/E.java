public class E
{
 public void m1()
 {
	System.out.println("m1-");
   m2();
 }
 public void m2()
 {
   System.out.println("m2-");
 }
  public static void main(String abc [])
	{
	  System.out.println("HELLO");
	  E b=new E();
	  b.m1();
	 // b.m2();    
	}

}