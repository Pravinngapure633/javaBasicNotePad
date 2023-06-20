 public class Calculator
{
	public void Addition()
	{
	  int a = 90;
	  int b = 90;
	  int c = 20;
	  int result = a+b+c;
	  System.out.println("Addition is= " + result);   // += concat   addiation is = this is string
	}

	public void Subtraction()
	{
	  int x = 200;
	  int y = 100;
	  int z = 100;
	  int result = x-y-z;
	  System.out.println("Subtraction is = " + result);
	}

	public void Multiplication()
	{
	  int d = 20;
	  int e = 10;
	  int f = 30;
	  int result = d*e*f;
	  System.out.println("Multiplication is = " + result);
	}

	public void Division()
	{
	  int p = 20;
	  int q = 10;
	  int r = 30;
	  int result = p/q/r;
	  System.out.println("Multiplication is = " + result);
	}
	
	public static void main(String args [])
	{
	  System.out.println("CALCULATOR");
		Calculator a=new Calculator();
      	   	 a.Addition();
			a.Subtraction();
			a.Multiplication();
			a.Division();
	}

	




}