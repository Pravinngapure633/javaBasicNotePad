public class Calsi    
{ 
	public void Addition()
	{
	  float a=100f;
	  float b=200f;
	  float result=a+b-a;
	  System.out.println(result);
	  Mix();
	}
	public static void main(String args [])
	{
	  System.out.println("Clasi");
	   Calsi c=new Calsi();
		c.Addition();
		
	}
	
	public void Mix()
	{
	  int d=1000;
	  float e=2000.5f;
	  float f=1000f;
	 float result=d+e+f;
	 float g=result/2;
	  System.out.println(g);
	}




}