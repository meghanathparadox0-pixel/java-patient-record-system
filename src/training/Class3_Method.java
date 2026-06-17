package training;

public class Class3_Method {
static String name= "Name";
static int id = 1;
	public static void greetCustomer() {
		System.out.println("Hello welcome to the patients form");
	}
	public void patientName(String name) {
		name = name + name;
		System.out.println("name saved.");
	}
	public static void patientId (int id) {
		id = id + id;
		System.out.println("id saved.");
	}
	
	public void age(String age) {
		age = age + name;
		System.out.println("age saved"); 
	}
	
	public static void main1(String[] args) {
		Class3_Method Class3_Method = new Class3_Method();
		greetCustomer();
		Class3_Method.patientName("nikhil");
		System.out.println("name : nikhil");
		patientId(007);
		System.out.println("Id : 007");
		Class3_Method.age("twenty one");
		System.out.println("age : 21");
		
		
		// TODO Auto-generated method stub


	}
public String patientName;
public int patientAge;
public int patientId;
public void displayPatient() {
	System.out.println("patient name :" + patientName);
	System.out.println("patient age :" + patientAge);
	System.out.println("patient Id:" + patientId);
}
public void updateName(String string) {
	patientName = string;
}
public void updateAge(int i) {
	patientAge = i;
}
public void updatePatientId(int Id1) {
	patientId = Id1;
}
public static void main(String[] args) {
	Class3_Method p1 = new Class3_Method();
	Class3_Method p2 = new Class3_Method();
	p1.updateAge(29);
	p1.updateName("ravi");
	p1.updatePatientId(7);
	p1.displayPatient();	
	p2.updateAge(22);
	p2.updateName("sita");
	p2.updatePatientId(9);
	p2.displayPatient();
	
}	
}
