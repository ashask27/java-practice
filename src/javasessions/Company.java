package javasessions;
import java.util.ArrayList;
import java.util.Arrays;

public class Company {

	// name : getProductList
	// Input: company name
	// return: different products of company
	public ArrayList<String> getProductList(String compName) {
		ArrayList<String> ll = new ArrayList<String>();
		
		switch (compName.toLowerCase()) {
		case "amazon":
			ll.add("macbook");
			ll.add("samsung");
			ll.add("imac");
			break;
			
		case "apple":
			ll.add("ipad");
			ll.add("iphone");
			ll.add("ipro");
			break;
			
		default:
			System.out.println("Company name does not exist");
		}
		
		return ll;
	}

	public Object[] getCompInfo(String compName) {
		Object info[] = new Object[4];
		
		if (compName.equals("IBM")) {
			info[0] = compName;
			info[1] = "Bangalore";
			info[2] = 100;
			info[3] = 100.89;
		}
		else if (compName.equals("INTEL")) {
			info[0] = compName;
			info[1] = "Pune";
			info[2] = 1000;
			info[3] = 1004.89;	
		} else 
		{
			System.out.println("company name not found");
		}
		return info;
	}
	
	public static void main(String[] args) {
		Company c = new Company();

		// return static array of objects
		Object comp[] = c.getCompInfo("IBM");
		System.out.println(Arrays.toString(comp));
		
		
		Object cc[] = c.getCompInfo("NAL");
		System.out.println(Arrays.toString(cc));
	
		// return Arraylist of string
		ArrayList<String> pdlist = c.getProductList("ert");
		System.out.println(pdlist);
		
		ArrayList<String> splist = c.getProductList("amazon");
		System.out.println(splist);
	}

}
 