package training;

import java.util.Scanner;

public class Mini_00_Cafe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int totalBill = 0;
		int totalOrders = 0;
		int totalCoffees = 0;
		String answer = null;

		System.out.println("--------------------------------");
		System.out.println("          Caffe Cafe");
		System.out.println("    Sip a coffee with warmth");
		System.out.println("--------------------------------");

		do {
			int coffeePrice = 0;
			String coffeeName = "";

			System.out.println("\"Choose your Drink");
			System.out.println("1 - Espresso      120 RPs");
			System.out.println("2 - Latte         130 RPs");
			System.out.println("3 - Cappuccino    140 RPs");
			System.out.println("4 - Mocha         135 RPs");
			System.out.println("5 - Matcha        145 RPs");
			System.out.println("6 - Egg Coffee    170 RPs");
			System.out.println("7 - Hot Chocolate 150 RPs");
			System.out.println("8 - Ice Latte     145 RPs");
			System.out.println("9 - Tea            75 RPs");
			System.out.println("10 - Chai Latte   110 RPs");
			System.out.println("11 - Americano    125 RPs");
			System.out.println("\\12 - Exit");
			
			int drink = scan.nextInt();
			switch (drink) {
			case 1: 
				coffeeName = "Espresso";
				coffeePrice = 120;
				break;
			case 2: 
				coffeeName = "Latte";
				coffeePrice = 130;
				break;
			case 3: 
				coffeeName = "Cappucino";
				coffeePrice = 140;
				break;
			case 4: 
				coffeeName = "Mocha";
				coffeePrice = 135;
				break;
			case 5: 
				coffeeName = "Matcha";
				coffeePrice = 145;
				break;
			case 6: 
				coffeeName = "Egg Coffee";
				coffeePrice = 170;
				break;
			case 7: 
				coffeeName = "Hot Choclate";
				coffeePrice = 150;
				break;
			case 8: 
				coffeeName = "Ice Latte";
				coffeePrice = 145;
				break;
			case 9: 
				coffeeName = "Tea";
				coffeePrice = 75;
				break;
			case 10: 
				coffeeName = "Chai Latte";
				coffeePrice = 110;
				break;
			case 11: 
				coffeeName = "Americano";
				coffeePrice = 125;
				break;
			case 12: 
				coffeeName = "Exit";	
				answer = "No";
				continue;	
				
			default:
				System.err.println("Invalid Choice");
				answer = "Yes";
				continue;
			}
				System.out.println("How many coffees");
				int quantity = scan.nextInt();
				
				int orderBill = coffeePrice * quantity;
				
				System.out.println("what Size");
				System.out.println("small");
				System.out.println("Regular +15RPs/cup");
				System.out.println("Large +25RPs/cup");
				
				int cupSize = scan.nextInt();
				
				switch (cupSize) {
				case 1:System.out.println("Small");
					break;
				case 2:System.out.println("Regular");
				orderBill += 15 * quantity;
				break;
				case 3:System.out.println("Large");
				orderBill += 25 * quantity;
				break;	
				
				default:
					System.err.println("Invalid Size. No charges added");
				}
				
				System.out.println("Choose the roast bean");
				System.out.println("1 - Arabica");
				System.out.println("2 - Robusta");
				System.out.println("3 - Decaf + 20RPs/cup");
				
				int coffeeBean = scan.nextInt();
				
				switch (coffeeBean) {
				case 1: System.out.println("Arabica");
					break;
				case 2: System.out.println("Robusta");
				break;
				case 3: System.out.println("Decaf");
				orderBill += 20 * quantity;				
				break;
				
				default:
					System.err.println("Invaid choice. Regular roast added");
				}
				
				System.out.println("Choose Milk");
				System.out.println("1 - Semi-Skimmed");
	            System.out.println("2 - Whole Milk");
	            System.out.println("3 - Skimmed");
	            System.out.println("4 - Oat Milk +30 RPs per cup");
	            System.out.println("5 - Almond Milk +30 RPs per cup");
	            System.out.println("6 - Soya Milk +25 RPs per cup");
	            System.out.println("7 - No Milk");
	            
	            int milkChoice = scan.nextInt();
	            
	            switch (milkChoice) {
				case 1: System.out.println("Semi - Skimmed");					
					break;
				case 2: System.out.println("Whole Milk");					
				break;
				case 3: System.out.println("Skimmed");					
				break;
				case 4: System.out.println("Oat Milk");
				orderBill += 30 * quantity;
				break;
				case 5: System.out.println("Almond Milk");
				orderBill += 30 * quantity;
				break;
				case 6: System.out.println("Soya Milk");
				orderBill += 25 * quantity;
				break;
				case 7: System.out.println("No Milk");					
				break;
					
				
				default:
					System.err.println("Invalid choice. Regular milk added");
				}
	            
	            System.out.println("Choose Extra's");
	            System.out.println("Extra espresso");
	            System.out.println("Vanilla  + 20Rps/cup");
	            System.out.println("Vanilla SF +20Rps/cup");
	            System.out.println("Caramel +20Rps/cup");
	            System.out.println("Caramel SF +20Rps/cup");
	            System.out.println("Skip");
	            
	            int extras = scan.nextInt();
	            String extraShot;
	            
	            switch (extras) {
				case 1: 
					extraShot = "Espresso";
					break;
				case 2: 
					extraShot = "Vanilla";
					orderBill += 20 * quantity;
					break;
				case 3: 
					extraShot = "Vanilla SF";
					orderBill += 20 * quantity;
					break;
				case 4: 
					extraShot = "Caramel";
					orderBill += 20 * quantity;
					break;
				case 5: 
					extraShot = "Caramel SF";
					orderBill += 20 * quantity;
					break;
				case 6: 
					extraShot = "Skip";
					break;
				
				default:
					System.err.println("Invalid Choice. No Extras");				
				}
	            
	            totalBill +=orderBill;
	            totalOrders++;
	            totalCoffees +=quantity;
	            
	            System.out.println("Anything Else? Yes/No");
	            answer = scan.next();            
			
			
		} while (answer.equalsIgnoreCase("Yes"));
		
		if (totalOrders > 0) {
			
		System.out.println("Are you a Member? Yes/No");
		String member = scan.next();
		
		System.out.println("Are you a Student? Yes/No");
		String student = scan.next();
		
		int discountShip = 0;
		
		if (member.equalsIgnoreCase("Yes")) {
			discountShip = 7;
		}
		
		if (student.equalsIgnoreCase("Yes")) {
			discountShip = 10;
		}
		
		int discount = (totalBill * discountShip)/ 100;
		int finalBill = totalBill - discount;
		
		   System.out.println("========== FINAL BILL ==========");
	        System.out.println("Total Orders: " + totalOrders);
	        System.out.println("Total Coffees: " + totalCoffees);
	        System.out.println("Subtotal: " + totalBill);
	        System.out.println("Discount Percentage: " + discountShip + "%");
	        System.out.println("Discount Amount: " + discount);
	        System.out.println("Final Bill: " + finalBill);
	        System.out.println("Thank you for visiting Cafe");
	        System.out.println("Sip a Coffee with your Dreams");
		} else {
			System.out.println("Thank you for visiting the cafee");
		}
	        scan.close();
	    }		
	}

