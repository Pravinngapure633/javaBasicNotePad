public class F
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
 public static void main(String args [])
	{
	 System.out.println(args [0]);
	 System.out.println(args[1]);
	 System.out.println("Main-");
     F a=new F();
       a.m1();
       a.m2();
	}

}