package StringTesting;

import java.util.HashMap;

public class StringOccurence {

	public static void main(String[] args) {
		String a="Jack Dull doing it like zebra";
		HashMap<Character,Integer> count =new HashMap<Character,Integer>();
		char[] charto= a.toCharArray();
		for(char b : charto) {
			if(count.containsKey(b)) {
				count.put(b,count.get(b)+1);
			}
			else {
				count.put(b,1);
			}
		}
		System.out.println("Your String Data"+ " "+count);
		String[] p=a.split(" ");
		for(String z :p) {
			System.out.print(z);
		}
	}

}
