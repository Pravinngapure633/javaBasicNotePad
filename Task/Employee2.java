   


public class Employee2
{
	int eid;
     String ename;
     String address;
     double salary;
   public Employee2()								//construtor
  {
     
	System.out.println("value");     
}

   public void pravin()									//user define method
 {

     int eid=225;
     String ename="pravin";
     String address="pune";
     double salary=20000.251d;
    System.out.println("EID"+eid);
    System.out.println("ENAME"+ename);
    System.out.println("ADDRESS"+address);
    System.out.println("SALARY"+salary); 
 }

  public static void main(String args [])					//main method
  {
     	
   Employee2 e=new  Employee2();
             e.pravin();

  
   
   

   }



		
}