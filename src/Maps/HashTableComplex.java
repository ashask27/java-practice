package Maps;

import java.util.Hashtable;

public class HashTableComplex {

	    public static void main (String a[])
	    {
	        Hashtable < Employee, String > tm = new Hashtable < Employee, String > ();
	        tm.put (new Employee (134, "Ram", 3000), "RAM");
	        tm.put (new Employee (235, "John", 6000), "JOHN");
	        tm.put (new Employee (876, "Crish", 2000), "CRISH");
	        tm.put (new Employee (512, "Tom", 2400), "TOM");
	        System.out.println ("Fecthing value by creating new key:");
	        Employee e = new Employee (512, "Tom", 2400);
	        System.out.println (e + " ==> " + tm.get (e));
	    }


}
