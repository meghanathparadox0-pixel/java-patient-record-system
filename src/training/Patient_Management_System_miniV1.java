package training;

import java.util.Scanner;

public class Patient_Management_System_miniV1 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Patient Management System");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Patient Name:");
		String patientName = scanner.nextLine();
		
		System.out.println("Patient Age");
		int patientAge = scanner.nextInt();
		
		System.out.println("Patient Regestration ID");
		long patientId = scanner.nextLong();
		
		System.out.println("Patient Name " + patientName);
		System.out.println("Patient Age " + patientAge);
		System.out.println("Patient Registration ID " + patientId);
		
		System.out.println("Choose Department");
		System.out.println("1 - Emergency");
		System.out.println("2 - General");
		System.out.println("3 - Cardiology");
		System.out.println("4 - Dental");
		System.out.println("5 - Gynecology");
		
		int departmentChoice = scanner.nextInt();
		
		String departmentName;
		
		switch (departmentChoice) {
		case 1: System.out.println("Emergency Department");
		break;
		case 2: System.out.println("General Department");
		break;
		case 3: System.out.println("Cardiology Department");
		break;
		case 4: System.out.println("Dental Department");
		break;
		case 5: System.out.println("Gynecology Department");
		break;
		default: System.out.println("Invalid Department");
		}
		
		int consultationFee = 500;
		
		int serviceCharge = 100;
		
		int totalFee = consultationFee + serviceCharge;
		
		System.out.println("Do you have insurance? true/false");
		boolean hasInsurance = scanner.nextBoolean();
		
		String patientType;

		if (patientAge >= 60 || hasInsurance) {
			patientType = "Priority Patient";}
		
		else { patientType = "General Patient";
		}
		
		String ageStatus;
		
		if (patientAge >= 18) {
		   ageStatus = "Adult Patient";
		}
		else {
			ageStatus ="Minor Patient";
		}
		
		System.out.println("----- Registratiojn Summary -----");
		System.out.println("Patient Name: " + patientName);
		System.out.println("Patient Age: " + patientAge);
		System.out.println("Patient ID: " + patientId);
		System.out.println("Department: " + departmentChoice);
		System.out.println("Total Fee: " + totalFee);
		System.out.println("Patient Type: " + patientType);
		
		scanner.close();
		}
		

	}

