package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		
		hs.add("test");
		hs.add("hello");
		hs.add("test");
		hs.add("test2");
		hs.add("test3");
		hs.add("test4");
		
		System.out.println(hs);
		
		hs.remove("test");
		System.out.println(hs);
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
