public class Test
{

public void m1()
{
System.out.println("m1");
}

public void m2()
{
System.out.println("m2");
m1();

}
public void m3()
{
System.out.println("m3");
m2();
}

public static void main(String[]args)
{

Test t=new Test();
t.m3();
}
}
