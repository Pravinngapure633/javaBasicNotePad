import java.util.*;
	
public class Nes
{
		float f;
	
	public static void main(String[] args)
	{
			Scanner s=new Scanner(System.in);
			Nes n=new Nes();
			n.f=s.nextFloat();

		
		if(n.f>5000)
		{
		  if(n.f>6000 && n.f<8000)
			{
			  System.out.println("get 50% discount");
			  System.out.println("total bill-- "+(n.f-(n.f/2)));
			}
		  else
			{
				System.out.println("NO");
			}
		 if(n.f>8000 && n.f<=10000)
			{
				System.out.println(" get 30%disccount");
				System.out.println("total bill-- "+(n.f-(n.f*30)/100f));
			}
		 else
			{
				System.out.println("noooo");
			}
		}
		else
		{
			System.out.println("xxxxx");
		}
					


	}



}