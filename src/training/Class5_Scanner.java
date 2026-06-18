package training;

import java.util.Scanner;

public class Class5_Scanner {

	public static void main(String[] args) {
		System.out.println("Welcome to Patient Registration System");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name");
		String patientName = scanner.nextLine();
		System.out.println("Hey " + patientName + ", what is your age?");
		int patientAge = scanner.nextInt();
		System.out.println("Now please enter your Id");
		int patientID = scanner.nextInt();
		System.out.println("Thank you");
		System.out.println("------ Patient Details -----");
		System.out.println("Patient Name : " + patientName);
		System.out.println("Patient Age : " + patientAge);
		System.out.println("Patient ID : " + patientID);
		System.out.println("Registration Sucessful");
		
		scanner.close();

	}

}
