package training;

public class Hospital_Daily_Report {
	String hospitalName = "City Hospital";
	int patientCount = 25;
	int consultationFee = 50;
	int availableBeds = 20;

	public void displayHospitalInfo() {
		System.out.println("Hospital Name :" + hospitalName);
		System.out.println("Patient count :" + patientCount);
		System.out.println("Available Beds :" + availableBeds);
	}
	public void calculateCollection() {
		int collection = patientCount * consultationFee;
		System.out.println("Total collect:" + collection);
	}
	public void bedUpdate() {
		availableBeds -= 5;
		availableBeds++;
		System.out.println("Available Beds :" + availableBeds);
	}
	int patientAge = 25;
	public void patientAgeCheck () {
		System.out.println(patientAge > 18);
		System.out.println(patientAge < 18);
		System.out.println(patientAge == 25);
		System.out.println(patientAge != 25);
	}
	public void insuranceCheck() {
		boolean hasInsurance = true;
		boolean hasPassport = false;
		System.out.println(hasInsurance && hasPassport);
		System.out.println(hasInsurance || hasPassport);
		System.out.println(!hasInsurance);
		System.out.println(!hasPassport);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital_Daily_Report h1 = new Hospital_Daily_Report();
		h1.displayHospitalInfo();
		h1.calculateCollection();
		h1.bedUpdate();
		h1.patientAgeCheck();
		h1.insuranceCheck();
		
	}

}
