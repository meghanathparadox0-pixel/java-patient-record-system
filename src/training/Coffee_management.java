package training;

import java.util.Scanner;

public class Coffee_management {

	public static void main(String[] args) {
		
		int totalBill = 0;
		int totalOrders = 0;
		int discountMember = 7;
		int discountStudent = 10;
		String answer;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========================================");
		System.out.println("======     Welcome to Coffee    =========");
		System.out.println("      Sip a Coffee with your Dreams      ");
		
		do {
			System.out.println("    Choose your Drink   ");
			System.out.println("1 -  Espresso     120RPs");
			System.out.println("2 -  Latte        130RPs");
			System.out.println("3 -  Cappucino    140RPs");
			System.out.println("4 -  Mocha        135RPs");
			System.out.println("5 -  Matcha       145RPs");
			System.out.println("6 -  Egg Coffee   170RPs");
			System.out.println("7 -  Hot Choclate 150RPs");
			System.out.println("8 -  Ice Latte    145RPs");
			System.out.println("9 -  Tea           75RPs");
			System.out.println("10 - Chai Latte   110RPs");
			System.out.println("11 - Americano    125RPs");
			System.out.println("12 - Exit");
			
			System.out.println("Choose your Drink");
			int drinkChoice = scan.nextInt();

			switch (drinkChoice) {
			case 1:
				System.out.println("Espresso");
				totalBill = totalBill += 120;
				totalOrders++;
				break;			
			case 2:
				System.out.println("Latte");
				totalBill = totalBill += 130;
				totalOrders++;
				break;
			case 3:
				System.out.println("Cappucino");
				totalBill = totalBill += 140;
				totalOrders++;
				break;
			case 4:
				System.out.println("Mocha");
				totalBill = totalBill += 135;
				totalOrders++;
				break;
			case 5:
				System.out.println("Match");
				totalBill = totalBill += 145;
				totalOrders++;
				break;
			case 6:
				System.out.println("Egg Coffee");
				totalBill = totalBill += 170;
				totalOrders++;
				break;
			case 7: 
				System.out.println("Hot Choclate");
				totalBill = totalBill += 150;
				totalOrders++;
				break;
			case 8:
				System.out.println("Ice Latte");
				totalBill = totalBill += 145;
				totalOrders++;
				break;
			case 9:
				System.out.println("Tea");
				totalBill = totalBill += 75;
				totalOrders++;
				break;
			case 10: 
				System.out.println("Chai Latte");
				totalBill = totalBill += 110;
				totalOrders++;
				break;
			case 11: 
				System.out.println("Americano");
				totalBill = totalBill += 125;
				totalOrders++;
				break;
			case 12:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid Option");
			}
			
			System.out.println("    Choose Size   ");
			System.out.println("1 - small         ");
			System.out.println("2 - Regular  15RPs");
			System.out.println("3 - Large    25RPs");
			
			System.out.println("Choose your Drink Size");
			int cupSize = scan.nextInt();
			
			switch (cupSize) {
			case 1: 
				System.out.println("Small");
				break;
			case 2: 
				System.out.println("Regular");
				totalBill = totalBill += 15;
				break;
			case 3: 
				System.out.println("Large");
				totalBill = totalBill += 25;
				break;
			default:
				System.out.println("Invalid Size");
			}
			
			System.out.println("Type of Coffee Bean");
			System.out.println("1.    Arabica      ");
			System.out.println("2.    Robusta      ");
			System.out.println("3.     Decaf       ");
			
			System.out.println("Select the Coffee Bean");
			int coffeeBean = scan.nextInt();
			
			switch (coffeeBean) {
			case 1: System.out.println("Arabica");
				break;
			case 2: System.out.println("Robusta");
			break;
			case 3: System.out.println("Decaf");
			break;		
			default: System.out.println("Invalid Choice");			
			}
			
			System.out.println("Choose Milk");
			System.out.println("1 - Semi-Skimmed        ");
			System.out.println("2 - Whole Milk          ");
			System.out.println("3 - Skimmed             ");
			System.out.println("4 - Oat Milk       30RPs");
			System.out.println("5 - Almond Milk    30RPs");
			System.out.println("6 - Soya Milk      25RPs");
			System.out.println("7 - No Milk             ");
			
			System.out.println("Milk Choice");
			int milkChoice = scan.nextInt();
			
			switch (milkChoice) {
			case 1: 
				System.out.println("Semi-Skimmed      ");
				break;
			case 2: 
				System.out.println("Whole Milk        ");
				break;
			case 3: 
				System.out.println("Skimmed           ");
				break;
			case 4: 
				System.out.println("Oat Milk     15RPs");
				totalBill = totalBill + 15;
				break;
			case 5: 
				System.out.println("Almond Milk  20RPs");
				totalBill = totalBill + 20;
				break;
			case 6: 
				System.out.println("Soya Milk    20RPs");
				totalBill = totalBill + 20;
				break;
			case 7: 
				System.out.println("No Milk           ");
				break;
			default:System.out.println("Invalid Option");
				break;
			}
			
			if (drinkChoice != 12) {
				System.out.println("Do you need extra Shot? Yes/No");
				String extraShots = scan.next();
			
			if (extraShots.equalsIgnoreCase("Yes")) {
				totalBill +=25;
			}
			
			System.out.println("Are you a member? Yes/No");
			String member = scan.next();
			
			if (member.equalsIgnoreCase("Yes")) {
				int discount = (totalBill * discountMember)/100;
			}
			
			System.out.println("Are you a Student? Yes/No");
			String student = scan.next();
			
			if (student.equalsIgnoreCase("Yes")) {
				int discount = (totalBill * discountStudent)/ 100;
			}
			
			System.out.println("Are you Both? Yes/No");
			String both = scan.next();
			
			if (both.equalsIgnoreCase("Yes")) {
				int discount = (totalBill * discountStudent)/ 100;
			}
			
			System.out.println("Anything else? Yes/No");
			answer = scan.next();
			}
			
			else {
				answer = "No";
			}

			
		} while (answer.equalsIgnoreCase("Yes"));
		
		System.out.println("==================================");
		System.out.println("");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		

	}

}
