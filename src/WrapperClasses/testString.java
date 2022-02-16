package WrapperClasses;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class testString {

	public static void main(String[] args) {

		String str = "I do not like coding";
		
		int count = findOCcurrenceCnt(str, 'i');
		System.out.println(count);
		System.out.println("*****************************");
		findDuplicateChars(str);

		System.out.println("*****************************");
		
		// find duplicates in array
		String infra[] = {"Google", "Amazon", "Micro", "Micro", "Amadeus", "Amazon"};
		
		Set<String> data = new HashSet<>();
		for(String e:infra) {
			if(!data.add(e)) {
				System.out.println("Duplicate " + e);
			}
		}
		
		System.out.println("*****************************");
		
	}

	
	public static int findOCcurrenceCnt(String str, char c) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch == c) {
				count++;
			}
		}		
		return count;
	}
	
	
	public static int charCount(String str, char c) {
		int count = 0;
		for (int i=0 ; i< str.length();i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	
	
	public static int findDuplicateChars(String str) {
		if (str == null) return 0;
		else if (str.isEmpty()) return 0;
		else if (str.length() == 1) return 0;
		else {
			char[] words = str.toCharArray();
			
			Map<Character, Integer> charMap = new HashMap<>();
			
			for (Character ch: words) {
				if (charMap.containsKey(ch)) {
					charMap.put(ch, charMap.get(ch)+1);
				} else {
					charMap.put(ch, 1);
				}
				
			}
			// print map
			Iterator<Character> it = charMap.keySet().iterator();
			while(it.hasNext()) {
				Character key = it.next();
				System.out.println(key + " " + charMap.get(key));
			}
			
			return 1;
		}
	}
}
