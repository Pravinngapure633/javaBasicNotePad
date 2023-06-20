import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class A
{
	
	public static void main (String [] args)
	
	{
		List l=new ArrayList();

		l.add(10);
		l.add(20);

		System.out.println(l);

		Iterator itr=l.iterator();

		while(itr.hasNext())
		{
			Object i=itr.next();
			System.out.println(i);
			
		}

	}



}