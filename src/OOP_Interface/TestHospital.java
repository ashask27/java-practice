package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FortisHospital ff = new FortisHospital();
		
		ff.cardio();
		ff.covidReport("Omicron");
		ff.medicalFunds(1000);
		ff.optServices();
		
		System.out.println(FortisHospital.min_fee);
		
		USMedical us = new FortisHospital();
		USMedical.billing();
		us.optServices();

		
		IndianMedical ii = new FortisHospital();
		ii.covidReport("1.0");
		ii.covidTest();
		ii.emergencyServices();
		ii.medicalFunds();
		ii.medicalFunds(1234);
		
		
		UKMedical uk = new FortisHospital();
		
		uk.radiology();
		uk.emergencyServices();
		
	}

}
