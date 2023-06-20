public class Student
{
	public static void main(String[] args)
	{
		int math=80;
		int english=82;
		int physcis=75;
		int biology=77;
		int computer=89;

		int result=math+english+physcis+biology+computer;

		System.out.println("YOUR RESULT IS: "+result);

		float percentage=(result*100/500f);

		System.out.println("YOUR PERCENTAGE IS: "+percentage);


			if(percentage>=35 && percantage<60)
			{
				System.out.println(" pass ");
			}
			else if(percentage>=60 && percentage<65)
			{
				System.out.println("1st class");
			}
			else if(percentage>=65)
			{
				System.out.println("top class");
			}
			else
			{
				System.out.println("FAIL");
			}




	}

}