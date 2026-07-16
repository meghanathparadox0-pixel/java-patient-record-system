package training;

import java.util.Scanner;

public class Array_Practic_2 {

	
	public static void main2(String[] args) {
		
		String coffee[] = new String[] {"Latte", "Mocha", "Tea", "Espresso", "Matcha",};
		int coffeePrices[] = new int[] {130,135,75,120,145};
		String milkType[] = {"whole", "Semi", "Skimmed", "Oat", "Almond"};
		int milkPrice[] = {0,0,0,40,50};
		System.out.println(coffee.length);
		System.out.println(coffeePrices.length);
		
		int firstCoffee = 0;
		int lastCoffee = coffee.length - 1;
		
		for 
		(int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);

			if (coffeePrices[i] > 120) {
				System.out.println(coffee[i] + "-" + coffeePrices[i]);
			}
		}
		System.out.println(coffee[firstCoffee]);
		System.out.println(coffee[lastCoffee]);
		
		for (int i = 0; i < milkType.length; i++) {
			if (milkPrice[i] > 0) {
				System.out.println(milkType[i] + "=" + milkPrice[i]);
			}
		}		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String patientName[] = new String [5];
		int patientAge[] = new int[5];
		String patientDisease[] = new String[5]; 
		
		System.out.println("Enter 4 patient Names & Age");
		
		for(int i = 0; i < patientName.length; i++) {
			patientName[i] = scan.next();
			patientAge[i] = scan.nextInt();
			patientDisease[i] = scan.next();
		}
		
		
		for(int i = 0; i < patientName.length; i++) {
			System.out.println(patientName[i]);
			System.out.println(patientAge[i]);
		}
		
		for(int i = 0; i < patientName.length; i++) {
			if (patientAge[i] > 60) {
				System.out.println(patientName[i] + "= " + patientAge[i] + " = " + patientDisease[i]);
			}
		}			
	}
	}


