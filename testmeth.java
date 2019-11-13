package getter;

public class testmeth
{
	static int i = 1;
	public static void main(String args[])
{
		/*
	System.out.println(i+ " ,");
	m(i);
	System.out.println(i);
	*/
		
		String str1 = "They are working ";
		String str2;
		str2 = str1;
		System.out.println("String object " + (str1==str2));
		System.out.println("String 1 "+ str1);
		System.out.println("String 1 "+ str2);
		
		str2 = new String(str1);
		System.out.println("String object " + (str1==str2));
		System.out.println("String object "+ (str1.equals(str2)));
		System.out.println("String 1 "+ str1);
		System.out.println("String 1 "+ str2);
	/*	
	 
	public static void m(int i)
	{
		i += 2;
	}
	*/
}
}