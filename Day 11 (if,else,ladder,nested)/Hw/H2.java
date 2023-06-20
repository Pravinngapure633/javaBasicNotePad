public class H2   											//ladder
{
	public static void main(String [] args)
	{
			float num=10000f;
		
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

	
			float num1=30000f;
		
		if(num1>40000)
		{
			System.out.println("50% disc on bill");
			System.out.println("total bill is:"+(num1-(num1/2f)));

		  if(num1>10000 && num1<=19000)
		   {
			System.out.println("30% discount on bill");
			System.out.println("total bill is:"+(num1-(num1*30)/100f));
		   }
		  else
		   {
			System.out.println("no");
		   }
		}
		else {
			System.out.println("totalbill:"+num1);
			System.out.println("no discount");
			}
	}





}