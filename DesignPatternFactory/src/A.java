class B 
{
	public void m1()
	{
		System.out.println("B");
	}
}

class A extends B
{
	public void m1()
	{
		System.out.println("A");
	}
	public static void main(String args[])
	{
		B b = new A();
		b.m1();
		
		A a = new A();
		a.m1();
	}

}

