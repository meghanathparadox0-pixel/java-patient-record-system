package training;

import java.util.Scanner;

public class Class6_Descision_making {

	public static void main1(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("what is your number");
	int number = scanner.nextInt();
	if (number % 2 == 0) {
		System.out.println("The given number is even");
	}
	else {
		System.out.println("The given numbber is odd");
	}
	scanner.close();

	}
	
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("whate is your results?");
	int results = sc.nextInt();
	if (results >= 86) {
		System.out.println("Distinction");
	}
	else if (results >= 71) {
		System.out.println("merit");
	}
	else if (results >= 36) {
		System.out.println("passed");
	}
	else  {
		System.out.println("fail");
	}
	sc.close();
	
	}
	public static void main3(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the number");
		int numbeR = sca.nextInt();
		switch (numbeR % 2) {
		case 1: System.out.println("Given number is odd");
		break;
		case 0: System.out.println("given number is even");
		break;
		default: System.out.println("given number is invalid");
		}
		sca.close();
	}
	
	public static void main4(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("first number");
		int number1 = sc1.nextInt();
		
		System.out.println("Second number");
		int number2 = sc1.nextInt();
		
		System.out.println("choose operations");
		System.out.println("1 Addition");
		System.out.println("2 Subtraction");
		System.out.println("3 Multiplication");
		System.out.println("4 division");
		System.out.println("5 Modulus");
		
		int choice = sc1.nextInt();
		
		switch (choice) {
		
		case 1: System.out.println(number1 + number2);
		break;
		case 2: System.out.println(number1 - number2);
		break;
		case 3: System.out.println(number1 * number2);
		break;
		case 4: System.out.println(number1 / number2);
		break;
		case 5: System.out.println(number1 % number2);
		break;
		default: System.out.println("Invalid choice");
		}
		sc1.close();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("what is today?");
		String day = scan.next();
		switch (day) {
		case "Monday": System.out.println("uff, its weekday");
		break;
		case "Tuesday": System.out.println("uff, its weekday");
		break;
		case "Wednesday": System.out.println("uff, its weekday");
		break;
		case "Thursday": System.out.println("uff, its weekday");
		break;
		case "Friday": System.out.println("uff, its weekday");
		break;
		case "Saturday": System.out.println("yayy, its weekend");
		break;
		case "Sunday": System.out.println("yayy, its weekend");
		break;
		default: System.out.println("invalid input");
		}
		scan.close();
	}

}
