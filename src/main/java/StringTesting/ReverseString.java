package StringTesting;

public class ReverseString {
public static void main(String args[]) {

	String a="JUSTDOIT";
	int count=0;
	int l=a.length();
	for(int i=l-1;i>=0;i--) {
		System.out.print(a.charAt(i));
		count++;
	}
	System.out.println(" ");
	System.out.println(count);
	
}
}