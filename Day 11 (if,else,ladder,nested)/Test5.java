public class Test5      				// NESTED 
{
	public static void main(String [] args)
	{
			int age=20;
			int hb=14;
		
		if(age>=18)
		{
			if(hb>=12)
			{
				System.out.println("Eligible for blood donation");
			}
			else
			{
				System.out.println("Not eligible hb below 12");
			}
		}
		else
			{
			  System.out.println("your age is below 18:"+age);
			}
    }
}