package test;

import com.github.esrrhs.fakescript.fakescript;

public class A
{
	public static class AA
	{
		public static AA aa0()
		{
			System.out.println("aa0");
			return new AA();
		}

		public void aa1()
		{
			System.out.println("aa1");
		}
	}

	public A()
	{

	}

	@fakescript
	public int a0(int a)
	{
		System.out.println("a0 " + a);
		return 0;
	}

	@fakescript
	public int a1(int a)
	{
		System.out.println("a1 " + a);
		return 0;
	}

	@fakescript(name = "a2ex")
	public double a2()
	{
		System.out.println("a2");
		return 0.2;
	}

	@fakescript
	public static void a3()
	{
		System.out.println("a3");
	}

	public long a4(long uid, String aa)
	{
		return uid;
	}

	public A a5()
	{
		return null;
	}

	public void a6(int a)
	{
		System.out.println("a6 int " + a);
	}

	public void a6(int a, int b)
	{
		System.out.println("a6 int int " + a + " " + b);
	}

	public void a6(int a, String b)
	{
		System.out.println("a6 int String " + a + " " + b);
	}
}
