package stringQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
	public static void main(String[] args) {
		
		String str = "anaat";
		
		String s1 = new StringBuilder(str).reverse().toString();
		System.out.println(s1.equalsIgnoreCase(str)? "is panlandrome" : "not palindrome");
		//s1.reverse().toString();
		
		String arr[] = str.split("");
		
		
//		Collections.sort(Arrays.asList(arr));
//		for (String string : arr) {
//			System.out.println(string);
//		}
		
		StringBuffer s2 = new StringBuffer();
			
//		
		for(int i =arr.length-1; i>=0; i--) {
			s2.append(arr[i]);
			
		}
		
		System.out.println(s2);
		
		
		
	}

}
