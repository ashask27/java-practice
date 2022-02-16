package ConstructorConcepts;
import java.util.ArrayList;

public class Company {
	String name;
	int empCount;
	ArrayList<String> catList;
	boolean isFunded;
	double sharePrice;
	
	public Company(String name) {
		this.name = name;
	}
	
	public Company(String name, int empCount) {
		this.name = name;
		this.empCount = empCount;
	}
	
	
	public Company(String name, int empCount, ArrayList<String> catList) {
		this.name = name;
		this.empCount = empCount;
		this.catList = catList;
	}
	
	public Company(String name, int empCount, ArrayList<String> catList, boolean isFunded, double sharePrice) {
		this.name = name;
		this.empCount = empCount;
		this.catList = catList;
		this.isFunded = isFunded;
		this.sharePrice = sharePrice;
	}
	
	public String getCompanyInfo() {
		System.out.println("getCompanyInfo");
		return "compInfo";
	}
}
