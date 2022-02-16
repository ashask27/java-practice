package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("India", "Asha");
		map1.put("UK", "Usha");
		map1.put("USA", "Sasha");
		map1.put("India", "Bhasha");
		map1.put(null, "minal");
		map1.put(null, "Siri");
		map1.put("Brazil", null);
		map1.put("Sydny", null);
		//System.out.println(map1.get("A"));
		//System.out.println(map1.get(null));
		
		// iterate over the keys
		Iterator<String> it = map1.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next(); //gets next node...use it only once in loop
			System.out.println("key : " + key + " value : " + map1.get(key));
		}
		
		map1.remove("India");
		
		System.out.println("------------------------------");
		// iterate over the pair/set
		Iterator<Entry<String, String>> it1 = map1.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> entry = it1.next(); //gets next node...use it only once in loop
			System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
		}
		
		// Java 8 - lambda
		System.out.println("------------------------------");
		map1.forEach((k,v) -> System.out.println(k + " " + v));
		
	}

}

