public class F
{
	public static void main(String args [])
	{
	  	float first=1.20f, second=2.45f;
		
		System.out.println(" BEFOR SWAP");
		System.out.println("FIRST VALUE IS: "+first);
		System.out.println("SECOND VALUE IS: "+second);

		float temporary=first;

		first=second;

		second=temporary;

		System.out.println("AFTER SWAP");
		System.out.println("FIRST: "+first);
		System.out.println("SECOND: "+second);

		


	}


}