package StringTesting;

import java.util.Arrays;

public class AnagramString {
	public static void anagramcheck(String s1,String s2) {
		boolean status=true;
		
		String copyS1=s1.replaceAll("\n", "");
		String copyS2=s2.replaceAll("\n", "");
		
		if(copyS1.length()!=copyS2.length()) {
			status=false;
		}
		else {
			char[] s1array=copyS1.toLowerCase().toCharArray();
			char[]s2array=copyS2.toLowerCase().toCharArray();
			
			Arrays.sort(s1array);
			Arrays.sort(s2array);
			
			status=Arrays.equals(s1array, s2array);
		}
		if(status) {
			System.out.println(s1 +" and " + s2 + " are anagram string");
		}
		else {
			System.out.println(s1 + s2 + " are not anagram string");
		}
		
	}
	public static void main(String[] args) {
		AnagramString.anagramcheck("Mother In Law"," Hitler Woman");
		AnagramString.anagramcheck("keEp"," peeK");
		AnagramString.anagramcheck("SiLeNt CAT"," LisTen AcT");
	}

}
