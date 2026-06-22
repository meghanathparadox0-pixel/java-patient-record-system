package training;

import java.util.Scanner;

public class HospitalPatientSystemV2 { 
	String patientName;
	int patientAge;
	Long patientId;
	
	public HospitalPatientSystemV2 (String name, int age, Long Id) {
		patientName = name;
		patientAge = age;
		patientId = Id;
	}
	
	public void displayPatient() {
		System.out.println("Patient Name: " + patientName);
		System.out.println("Patient Age " + patientAge);
		System.out.println("Patient ID: " + patientId);		
	}
	public String checkAge() {
		if (patientAge <18) {
			return "minor";
		}
		else if (patientAge <= 59) {
			return "Adult";			
		}
		else {
			return "Senior";
		}
		
	}
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		HospitalPatientSystemV2 p1 = new HospitalPatientSystemV2("nikhil", 65, 22082182L);
		
		HospitalPatientSystemV2 p2 = new HospitalPatientSystemV2("Manasa", 30, 22082183L);
		
		System.out.println("Patient 1");
		p1.displayPatient();
		
		System.out.println("Patient 2");
		p2.displayPatient();
		
		System.out.println("Department Options");
		System.out.println("1 - Emergency");
		System.out.println("2 - General");
		System.out.println("3 - Cardiology");
		System.out.println("4 - Dental");
		System.out.println("5 - Gynecology");
		
		int departmentChoice = scan.nextInt();
		String departmentName;
		
		switch(departmentChoice) {
		case 1: departmentName = "Emergency";
		break;
		case 2: departmentName = "General";
		break;
		case 3: departmentName = "Cardiology";
		break;
		case 4: departmentName = "Dental";
		break;
		case 5: departmentName = "Gynecology";
		break;
		default : departmentName = "Invalid choice";
		}
		
		int consultationFee = 500;
		int serviceCharge = 100;
		
		int totalFee = consultationFee + serviceCharge;
		
		System.out.println("Do you have Insurance? true/false");
		boolean hasInsurance = scan.nextBoolean();
		
		String patientType;
		
		if (p1.patientAge >= 59 || hasInsurance) {
			patientType = "Priority";
			
		}
		else {
			patientType = "General";
			
		}
		
		if (p2.patientAge >= 59 || hasInsurance) {
			patientType = "Priority";
			
		}
		else {
			patientType = "General";
			
		}
		
		int tokenNumber = 100;
		++tokenNumber;
		tokenNumber++;
		--tokenNumber;
		tokenNumber--;
		
		int availableBeds = 25;
		availableBeds +=5;
		availableBeds -=3;
		availableBeds *=3;
		availableBeds /=4;
		availableBeds %=3;
		
		System.out.println("Hospital Record");
		System.out.println("patient Name: " + p1.patientName);
		System.out.println("Patient Age: " + p1.patientAge);
		System.out.println("Patient ID: " + p1.patientId);
		System.out.println("Department: " + departmentName);
		System.out.println("Age Category: " + p1.checkAge());
		System.out.println("Patient Type: " + patientType);
		System.out.println("Total Fee: " + totalFee);
		System.out.println("Token Number: " + tokenNumber);
		System.out.println("Available Beds: " + availableBeds);
		
		System.out.println("Hospital Record");
		System.out.println("patient Name: " + p2.patientName);
		System.out.println("Patient Age: " + p2.patientAge);
		System.out.println("Patient ID: " + p2.patientId);
		System.out.println("Department: " + departmentName);
		System.out.println("Age Category: " + p2.checkAge());
		System.out.println("Patient Type: " + patientType);
		System.out.println("Total Fee: " + totalFee);
		System.out.println("Token Number: " + tokenNumber);
		System.out.println("Available Beds: " + availableBeds);
		
		scan.close();
	}
	
}
