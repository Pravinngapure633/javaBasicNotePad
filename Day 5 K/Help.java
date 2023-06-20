public class Help
{
	public void sum()
	{
	   System.out.println("123");
	   System.out.println("456");
	}

	public Help()
	{
	  System.out.println("ABC");
	  System.out.println("DEF");
	  sum();
	}

	public static void main(String args [])
	{
	   System.out.println("TABLE");
	      Help h=new Help();
	}	


}