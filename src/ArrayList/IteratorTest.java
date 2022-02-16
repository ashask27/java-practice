package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorTest {

	public static void main(String[] args) {
		 //create ArrayList and initialize it
        ArrayList<String> cities=new ArrayList<String>();  
        cities.add("Mumbai");  
        cities.add("Pune");  
        cities.add("Hyderabad");  
        cities.add("Delhi");  
         
        System.out.println("\n====================");
        
        for (int i=0;i<cities.size();i++) {
        	System.out.println(cities.get(i));
        }
        
        System.out.println("====================");
        
        for(String e:cities) {
        	System.out.println(e);
        }
        
        System.out.println("====================");
        
        // After JDK 8 - lambda
        cities.stream().forEach(ele -> System.out.println(ele));
        
        System.out.println("====================");
        // iterator
        Iterator<String> iter = cities.iterator();
        while(iter.hasNext()) {
        	System.out.println(iter.next());
        }
        
	}

}
