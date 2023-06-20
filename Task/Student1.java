import java.util.*;
public class Student1
{
		int math;
		int english;
		int physcis;
		int biology;
		int computer;

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
				Student1 xx=new Student1();

		System.out.println("YOUR MATH MARK");
			xx.math=sc.nextInt();

		System.out.println("YOUR ENGLISH MARK");
			xx.english=sc.nextInt();

		System.out.println("YOUR PHYSCIS MARK");
			xx.physcis=sc.nextInt();

		System.out.println("YOUR BIO MARK");
			xx.biology=sc.nextInt();

		System.out.println("YOUR COM MARK");
			xx.computer=sc.nextInt();

		int result=xx.math+xx.english+xx.physcis+xx.biology+xx.computer;

		System.out.println("YOUR RESULT IS: "+result);

		float percentage=(result*100/500f);

		System.out.println("YOUR PERCENTAGE IS: "+percentage);


			if(percentage>=35 && percentage<60)
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