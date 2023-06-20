public class Bank1
{
   
	public void State(int acno, String acname, String address, double amount)
	{
		
		System.out.println("A/C NO:"+acno+" "+"A/C NAME:"+acname+" "+"ADDRESS:"+address+" "+"AMMOUNT:"+amount);
		System.out.println("passbook");
	}
	 public static void main(String [] args)
	{
		System.out.println("STATE BANK OF INDIA");
		Bank1 s=new Bank1();
		s.State(989797979,"PRAVIN NAGPURE","Bhandara",786446.254d);
	}

}