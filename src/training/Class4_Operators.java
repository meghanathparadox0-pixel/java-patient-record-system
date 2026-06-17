package training;

public class Class4_Operators {
	// Arithmetic oop
	//unary oop
	//relational oop
	//conditional oop
	//Assignment oop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int patientFee = 50;
		int patient = 8;
		
	 
		System.out.println(patientFee * patient);
		System.out.println(patientFee + patient);
		System.out.println(patientFee - patient);
		System.out.println(patientFee / patient);
		System.out.println(patientFee % patient);
		
		int availableBeds = 20;
		availableBeds += 5; // 25
		availableBeds -= 3; // 22
		availableBeds *= 2; // 44
		availableBeds /= 4; // 11
		availableBeds %=3; // 2
		System.out.println(availableBeds);
		
		int patientCount = 10;
		System.out.println(++patientCount);
		System.out.println(patientCount++);
		System.out.println(--patientCount);
		System.out.println(patientCount--);
		System.out.println(patientCount);
		
		int patientAge = 25;
		System.out.println(patientAge > 18);  // true
		System.out.println(patientAge < 18);  // false
		System.out.println(patientAge >= 25); // true
		System.out.println(patientAge <= 30); // true
		System.out.println(patientAge == 25); // true
		System.out.println(patientAge != 25); // false
		
		
		int x = 10;
		x += 5; //15
		x++; // 15
		x *=2; // 32
		x--; //32
		x %= 4; //3
		System.out.println(x);
		
		boolean hasInsurance = true;
		boolean hasPassport = false;
		System.out.println(hasInsurance && hasPassport);
		System.out.println(hasInsurance || hasPassport);
			
				
	}

}
