public class Bank
{
	int acno;
	String acname;
	String address;
	double amount;

	public static void main(String args [])
	{
		System.out.println("BANK DETAILS");
			Bank b=new Bank();
		System.out.println(b.acno);
		System.out.println(b.acname);
		System.out.println(b.address);
		System.out.println(b.amount);

			b.acno=98568;
			b.acname="Pravin Nagpure";
			b.address="Bhandara";
			b.amount=7112313.254d;
		System.out.println(b.acno);
		System.out.println(b.acname);
		System.out.println(b.address);
		System.out.println(b.amount);

	}

}