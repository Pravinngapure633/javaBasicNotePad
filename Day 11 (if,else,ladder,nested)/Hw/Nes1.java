import java.util.*;
	
public class Nes1
{
		float f;
	
	public static void main(String[] args)
	{
			Scanner s=new Scanner(System.in);
			Nes n=new Nes();
			n.f=s.nextFloat();

		
		if(n.f>500000)
		{
		  if(n.f<50000 && n.f>=40000)
			{
			  System.out.println("get 50% discount");
			  System.out.println("total bill-- "+(n.f-(n.f/2)));
			}
		  else
			{
				System.out.println("NO");
			}
		 if(n.f<40000 && n.f>=30000)
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