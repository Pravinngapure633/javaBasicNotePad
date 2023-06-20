   public class User1
{
		int uid;
		String uname;
		String address;
	public static void main(String args [])
	{
	    System.out.println("USER DETAIL:");
	    User1 u=new User1();
	    System.out.println(u.uid);
	    System.out.println(u.uname);
	    System.out.println(u.address);
	    System.out.println("  ");

		u.uid=784512;
		u.uname="pravin";
		u.address="bhandara";
		System.out.println(u.uid);
	    System.out.println(u.uname);
	    System.out.println(u.address);
	    System.out.println(u);
	} 
	




}