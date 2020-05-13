package daily90;

import java.util.HashMap;

public class Strig {

	public static void main(String[] args) {
	String str ="you have no choice other than following me";
	String replace = str.replaceAll("[^o]", "");
        System.out.println("Occurace of O:"+replace.length());
//+++++++++++++++++++++++++++++++++++++++
	int count=0;
	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i)=='o') {
		count++;
	}
			
			
	}
	System.out.println("Occurace of O:"+count);
	}
	}
