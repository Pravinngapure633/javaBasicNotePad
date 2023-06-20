   import java.util.*;

public class All
{

	public static void main(String[]args)
	{
		Scanner ss=new Scanner(System.in);
		 State aa=new State();
				aa.User();
				aa.Bank();
				aa.Laptop();

		System.out.println("USER:");

		System.out.println("USER ID");
				aa.id=ss.nextInt();
		System.out.println("USER NAME");
				aa.name=ss.next()+ss.nextLine();
		System.out.println("USER ADDRESS");
				aa.address=ss.next()+ss.nextLine();

		
		System.out.println("BANK:");
		System.out.println("ACCOUNT NO");
				aa.accno=ss.nextLong();
		System.out.println("ACCOUNT NAME");
				aa.acname=ss.next()+ss.nextLine();
		System.out.println("BALANCE");
				aa.amount=ss.nextDouble();


		System.out.println("LAPTOP:");
		System.out.println("LAPTOP NAME");
				aa.laptopname=ss.next();
		System.out.println("PRICE");
				aa.price=ss.nextDouble();
		System.out.println("FEATURES");
				aa.feature=ss.next()+ss.nextLine();


		
		System.out.println("USER DETAILS");
		System.out.println("USER ID IS-- "+aa.id);
		System.out.println("USER NAME IS-- "+aa.name);
		System.out.println("USER ADDRESS IS-- "+aa.address);
		System.out.println("    ");
		System.out.println("BANK DETAILS");
		System.out.println("ACCOUNT NO-- "+aa.accno);
		System.out.println("ACCOUNT NAME IS-- "+aa.acname);
		System.out.println("ACCOUNT BALANCE IS--"+aa.amount);
		System.out.println("   ");
		System.out.println("LAPTOP DETAILS");
		System.out.println("LAPTOP NAME-- "+aa.laptopname);
		System.out.println("LAPTOP PRICE-- "+aa.price);
		System.out.println("LAPTOP FEATURE-- "+aa.feature);










	}
}