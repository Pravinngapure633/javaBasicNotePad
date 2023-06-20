import java.util.*;

public class Add
{
	int i;
	int j;
	int result=i+j;
	
	public static void main(String [] args)
	{
		Scanner ss=new Scanner(System.in);
		Add a=new Add();
			
		
		System.out.println("value of i");
			a.i=ss.nextInt();
		System.out.println("value of j");
			a.j=ss.nextInt();
		System.out.println("resut is");
			a.result=a.i+a.j;
		System.out.println("valalu of reslut"+a.i+"+"+a.j+"="+a.result);
			
	}



}