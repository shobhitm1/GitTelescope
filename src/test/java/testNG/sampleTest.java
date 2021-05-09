package testNG;

import java.io.IOException;
import java.util.ArrayList;

public class sampleTest {

	public static void main(String[] args) throws IOException {
		String a="Name";
		datadrivenTest dr =new datadrivenTest();
		ArrayList arp=dr.getData(a);
		System.out.println(arp);
		System.out.println(arp.get(0));
		System.out.println(arp.get(1));
		System.out.println(arp.get(2));
		
		

	}

}
