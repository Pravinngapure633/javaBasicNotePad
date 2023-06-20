import java.util.*;
public class Discount
{
			float num;
	public static void main(String args [])
	{
			
		System.out.println("D-MART");
		Scanner s=new Scanner(System.in);
			Discount a=new Discount();
				a.num=s.nextFloat();
		
		if(a.num>10000)
		{
			System.out.println("Get 50% DISCOUNT on bill");
			System.out.println("YOUR TOTAL BILL IS-- "+(a.num-(a.num/2f)));
		}

		else if(a.num>8000 && a.num<=10000)
		{
  			System.out.println("GET 30% DISCOUNT on bill");
			System.out.println("YOUR TOTAL BILL IS-- "+(a.num-(a.num*30)/100f));

		}
		else if(a.num>5000  && a.num<=8000)
		{
			System.out.println("GET 25% DISCOUNT on bill");
			System.out.println("YOUR TOTAL BILL IS-- "+(a.num-(a.num*25)/100f));
		}
	
		else if(a.num>500  && a.num<=5000)
		{
			System.out.println("GET 5% DISCOUNT on bill-- ");
			System.out.println("YOUR TOTAL BILL IS-- "+(a.num-(a.num*5)/100f));
		}
	
	else
		{
			System.out.println("YOOU HAVE NO DISCOUNT");
		}
	
	}





}