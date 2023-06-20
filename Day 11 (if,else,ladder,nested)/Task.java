        public class Task						//ladder
{
	public static void main(String [] args)
	{
			int amount=2000;
	
		if(amount>=2000)
			{
		  	System.out.println("Customer will get 50%"+amount);
		
			}
		else if(amount>1000 && amount>=1500)
			{
			  System.out.println("Customer will get 25%"+amount);
			}
		else if(amount<1000 && amount>=1500)
			{
			  System.out.println("Customer will get 10%"+amount);
			}
		else if(amount>300 && amount<500)
			{
			  System.out.println("Customer will get 25%"+amount);
			}
		else
			{
				System.out.println("NOT");	
			}
    }

}