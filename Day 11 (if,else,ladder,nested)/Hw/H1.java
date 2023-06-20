public class H1											//ladder
{
	public static void main(String [] args)
	{
		float num=3500f;

		System.out.println("Shopping bill");


		if(num>8000)										//8000+
		{
		  System.out.println("50% disccount on bill");
		  System.out.println("Total bill is:"+(num-(num/2f)));
		}

		else if(num>5000 && num<=8000)							//5000-8000
		{
		  System.out.println("30% disccount on bill");
		  System.out.println("Total bill is:"+(num-(num*30)/100f));
		}   
		else if(num>3000 && num<=5000)							//3000-5000
		{
		  System.out.println("20% disccount on bill");
		  System.out.println("Total bill is:"+(num-(num*20)/100f));
		}   
		else if(num>1000 && num<=3000)							//1000-3000
		{
		  System.out.println("10% disccount on bill");
		  System.out.println("Total bill is:"+(num-(num*10)/100f));
		}   
		else
		{
		  System.out.println("No discount - "+num);
		}	
		  
			

	}
}