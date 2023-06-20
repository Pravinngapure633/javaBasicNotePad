public class Task1						//NESTED
{
	public static void main(String args [])
	{
		int num=2000;

		if(num>=2000)
		{
			System.out.println("50%");
			if(num>=1000 && num<=1500 )
			{
			   System.out.println("Discount is 25%="+num);
			}
			else
			{
			   System.out.println("no discount");
			}
			if(num<1000 && num>=500)
			{
			  System.out.println("Discount is 10%");
			}
			else
			{
			   System.out.println("no discount");
			}
			if(num>300 && num<500)
			{
			  System.out.println("Discount is 2%");
			}
			else
			{
			   System.out.println("no discount");
			} 
		}
		else
		{
		 System.out.println("no");
		}
	}
}
