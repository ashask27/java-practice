package OOP_Interface;

public class FortisHospital extends UNHG implements USMedical, UKMedical, IndianMedical{

	@Override
	public void radiology() {
		// TODO Auto-generated method stub
		System.out.println("FH -- radiology");
		
	}

	@Override
	public void physio() {
		// TODO Auto-generated method stub
		System.out.println("FH -- physio");
	}

	@Override
	public void oncology() {
		// TODO Auto-generated method stub
		System.out.println("FH -- oncology");
	}


	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- emergencyServices");
	}

	@Override
	public void medicalFunds() {
		// TODO Auto-generated method stub
		System.out.println("FH -- medicalFunds");
	}

	@Override
	public void cardio() {
		// TODO Auto-generated method stub
		System.out.println("FH -- cardio");
	}
	
	//Individual methods
	public void medicalTraining() {
		System.out.println("FH -- medicalTraining");
	}

	@Override
	public void covidTest() {
		// TODO Auto-generated method stub
		System.out.println("FH -- covidTest");
	}

	@Override
	public void vaccination() {
		// TODO Auto-generated method stub
		System.out.println("FH -- vaccination");
	}

	@Override
	public void covidReport(String version) {
		// TODO Auto-generated method stub
		System.out.println("FH -- covidReport " + version);
	}

	@Override
	public void medicalFunds(int fees) {
		// TODO Auto-generated method stub
		System.out.println("FH -- medicalFunds " + fees);
	}
	
	// method hiding
	//@Override
	public static void billing() {
		System.out.println("FH -- billing");
	}

	@Override
	public void optServices() {
		System.out.println("FH -- OPT");
	}


}
