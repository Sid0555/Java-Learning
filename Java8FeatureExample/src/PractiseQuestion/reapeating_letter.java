package PractiseQuestion;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class reapeating_letter {
	public static void main(String[] args) {
//		String s = "Java  Blog Alive is Awesome";
//		
//		List<String> asList = Arrays.asList(s.toLowerCase().split(""));
//		
//		Map<String,Integer>map=new LinkedHashMap();
//		
//		for(String each : asList)
//		{
//			if(map.containsKey(each))
//			{
//				map.put(each, map.get(each)+1);
//			}
//			else {
//				map.put(each,1);
//			}
//		}
//		
//		for(java.util.Map.Entry<String, Integer> each : map.entrySet())
//		{
//			
//		}
		
		String s = "Java  Blog Alive is Awesome";
		 
		Character character = s.chars().mapToObj(ch -> (char) ch).filter(ch -> ch != ' ')
				.filter(ch -> s.indexOf(ch) != s.lastIndexOf(ch)).findFirst().orElse(null);
 
		if (character != null) {
			System.out.println(character);
			return;
		}
		
		
		
		
		
	}

}
