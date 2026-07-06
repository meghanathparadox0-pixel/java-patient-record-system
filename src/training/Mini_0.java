package training;

import java.util.Scanner;

public class Mini_0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int totalBill = 0;
		int totalOrders = 0;
		String answer = null;
		
		System.out.println("Welcome to Bubblology");
		System.out.println("Pop the pearls & enjoy the thrills");
		
		do {
			System.out.println("======== BUBBLE ========");
			System.out.println("1 - Classic - 120Rupees");
			System.out.println("2 - Taro - 130Rupees");
			System.out.println("3 - Honey Comb - 140Rupees");
			System.out.println("4 - Exit");
			
			System.out.println("Choose you tea");
			int teaChoice = scan.nextInt();
			
			switch (teaChoice) {
			case 1:
				System.out.println("Classic");
				totalBill = totalBill + 120;
				totalOrders++;
				break;
				
			case 2:
				System.out.println("Taro");
				totalBill = totalBill + 130;
				totalOrders++;
				break;
			case 3:
				System.out.println("Honey Comb");
				totalBill = totalBill + 140;
				totalOrders++;
				break;
			case 4:
				System.out.println("Exit");
				break;							
			default: System.out.println("Invalid Selection");
			}			

			if (teaChoice != 4) {
								
			System.out.println("Do you need extra pearls? Yes/No ");
			String pearls = scan.next();
		
			
			if(pearls.equalsIgnoreCase("yes")) {
			    totalBill += 30;
			}
			
			System.out.println("Do you need the cream on top? Yes/No");
			String cream = scan.next();
			
			if (cream.equalsIgnoreCase("yes")) {
				totalBill +=40;
			}
			
			System.out.println("Anything else? Yes/No");
			answer = scan.next();
			}
			
			else {
				answer = "no";
			}
			
		} while (answer.equalsIgnoreCase("yes"));
		
		 System.out.println("========== BILL ==========");
	        System.out.println("Total Tea Ordered: " + totalOrders);
	        System.out.println("Total Amount: " + totalBill);
	        System.out.println("Thank you for visiting Bubble");

	        scan.close();		
	}

}
