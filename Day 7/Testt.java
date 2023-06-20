class Calculator							//cls name file name same nhi raha to pulic nhi likhte
{
	public void addition(int num1 , int num2)
	{
	  int result = num1+num2;
	  System.out.println("Addition is :"+result);
	}

}


class Testt					//file name clss name same hoga to public likh bhi sakte ya nahi
{
	public static void main(String args[])
	{
		Calculator cal=new Calculator();
		cal.addition(50,60);
	}   
	



}