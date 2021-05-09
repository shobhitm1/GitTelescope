package com.taskcom.telescope;

import java.util.ArrayList;
import java.util.List;

public class ArrayListexample {

	public static void main(String[] args) throws ClassNotFoundException {
		List<String> lista = new ArrayList<String>();
		String c="Shobhit";
		Object b="Mahesh";
	   
	    lista.add(c);
	   // lista.add((String) b);
	    System.out.println(lista);
	    System.out.println(Class.forName("String").getName());

	}

}
