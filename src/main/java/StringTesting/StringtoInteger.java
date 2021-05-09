package StringTesting;

public class StringtoInteger {

	public static void main(String[] args) {
		String a="2015";
		
		//String to Integer  parseInt() and valueof()
		int b=Integer.parseInt(a);
		//System.out.println(a);
		System.out.println(b);
		
		String c="2021";
		int d=Integer.valueOf(c);
		System.out.println(d);
		
		//IntegertoString -->Integer.toString(), String.valueOf(i)
		
		int i=10;
		String s=String.valueOf(i);
		System.out.println(s);
		
		double a1=100;
		System.out.println(a1);
	}

}
