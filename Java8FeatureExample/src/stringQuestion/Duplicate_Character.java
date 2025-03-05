package stringQuestion;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaandbt";
		String arr[] = str.split("");
		Map<String,Integer> m1 = new HashMap<>();
		for (String string : arr)
		{
			if(m1.containsKey(string))
			{
				m1.put(string, m1.get(string)+1);
			}else
			{
				m1.put(string, 1);
			}
		}
		System.out.println(m1);

	}

}
