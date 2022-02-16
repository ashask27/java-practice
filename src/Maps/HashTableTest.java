package Maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {

	public static void main(String[] args) {
		
		Map<String, Integer> marks = new Hashtable<String, Integer>();
		
		marks.put("asha", 200);
		marks.put("Sudha", 200);
		marks.put("Meera", 300);
		marks.put("Robby", 500);
		//marks.put(null, 200);
		//marks.put("test", null);
		

		System.out.println(marks.get("asha"));
	}

}
