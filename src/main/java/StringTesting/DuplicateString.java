package StringTesting;

import java.util.HashMap;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		String s= "JAVAEEERRRTBNMAAAs";
		HashMap<Character,Integer> countHash =new HashMap<Character,Integer>();
		HashMap<Character,Integer> hashin =new HashMap<Character,Integer>();
		char[] inputArray=s.toCharArray();
		for(char d: inputArray) {
			if(countHash.containsKey(d)) {
				countHash.put(d, countHash.get(d)+1);
			}
			else {
				countHash.put(d,1);
			}
		}
		
		System.out.println(countHash);
		Set<Character> charSet=countHash.keySet();
		System.out.println(charSet);
		for(char ch : charSet) {
			if(countHash.get(ch)>1) {
				System.out.println(ch+"=="+countHash.get(ch));
			}
			else {
				hashin.put(ch,countHash.get(ch));
			}
		}	System.out.print("New HashMap with Unique Char == "+ hashin);
		
	}

}
