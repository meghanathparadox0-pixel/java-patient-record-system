package training;

import java.util.Iterator;

public class Looping_statements_practicee {
	public static int i = 1;


	public Looping_statements_practicee() {// TODO Auto-generated constructor stub
	}

	/*
	 * public static void main1(String[] args) {
	 * 
	 * while (i < 100) { System.out.println(i); i++; } }
	 * 
	 * public static void main2(String[] args) { do { System.out.println(i); i++; }
	 * while (i < 100); }
	 * 
	 * public static int ii = 200; public static void main3(String[] args) {
	 * 
	 * while (ii < 500) { if (ii %2 == 0) { System.out.println(ii); } ii++; } }
	 * 
	 * public static void main4(String[] args) { do { if (ii %2 == 0) {
	 * System.out.println(ii); } ii++; } while (ii < 500);
	 * 
	 * }
	 * 
	 * public static void main5(String[] args) { int i = 150; while (i < 200) { if
	 * (i % 7 == 0) { System.out.println(i); } i++; }
	 * 
	 * }
	 * 
	 * public static void main6(String[] args) { int i = 200; while (i > 25) { if (i
	 * %2 != 0) { System.out.println(i); } i--; } }
	 * 
	 * public static void main7(String[] args) { while (i < 100) { if (i % 2 != 0) {
	 * System.out.println(i); } i++; } }
	 * 
	 * public static void main8(String[] args) { int sum = 0; while (i <= 100) { sum
	 * = sum + i; i++; } System.out.println(sum); }
	 * 
	 * public static void main9(String[] args) { int sum = 0; while (i <= 50) { sum
	 * = sum + i; i++; } System.out.println(sum); }
	 * 
	 * public static void main10(String[] args) { while (i <=10) {
	 * System.out.println("7 x " + i + " = " + 7*i ); i++; } }
	 * 
	 * public static void main(String[] args) { int i = 40; int sum = 0; while (i <=
	 * 80) { if (i %2 == 0) { sum = sum + i; } i++; } System.out.println(sum);
	 * 
	 * }
	 */
	public static void main1(String[] args) {
		for (int i = 1; i < 100; i++) {
			System.out.println(i);			
		}
	}
	
	public static void main2(String[] args) {
		for (int i = 200; i <= 500 ; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}	
	}
	
	public static void main3(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("4 x " + i + " = " + 4*i);			
		}		
	}
	
	public static void main4(String[] args) {
		// now in this part defining the i variable outside the loop statement and initialise it in the loop
		int i;
		for (i = 150 ; i <= 250; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}		
		}		
	}
	
	public static void main5(String[] args) {
		// in here i will do the updation out side the syntax loop
		 for (int i = 40; i <80;) {
			int sum = 0;
			sum = sum + i;
			 i++;
			System.out.println(sum);						
		}	
	}
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 40; i <= 80; i++) {
			if (i %2 ==0) {
				sum = sum + i;				
			}
		}System.out.println(sum);
	}
	

}
