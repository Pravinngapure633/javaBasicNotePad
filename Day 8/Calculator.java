public class Calculator
{
	public void Addition()
	{
		int a=10;
		int b=20;
		int result=a+b;
		System.out.println("Addition is ="+ result);
	}

	public void Addition(int a, int b)
	{
		int result=a+b;
		System.out.println("Addition is="+a+" + "+b+" = "+result);
	}

	public static void main(String ... args)
	{
		Calculator c=new Calculator();
		c.Addition();
		c.Addition(40,30);
	}



}