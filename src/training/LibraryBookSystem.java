package training;

import java.util.Scanner;

public class LibraryBookSystem {
	String bookName;
	Long bookId;
	double bookPrice;
	String bookGenre;

	public LibraryBookSystem(String name, Long Id, Double price, String genre) {
		bookName = name;
		bookId = Id;
		bookPrice = price;
		bookGenre = genre;
	}
	
	public void displayBook() {
		System.out.println("Book Name: " + bookName);
		System.out.println("Book ID: " + bookId);
		System.out.println("Book Price; " + bookPrice);
		System.out.println("Book Genre; " + bookGenre);
	}
	
	public String checkPrice() {
		if (bookPrice < 500) {
			return "Cheap";
		}
		else if (bookPrice <= 1000) {
			return "Standard";
		}
		else { 
			return "Premium";
		}
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		LibraryBookSystem b1 = new LibraryBookSystem("Harry Potter", 518002L, 233.45, "Fiction");
		
		LibraryBookSystem b2 = new LibraryBookSystem("SuperKings", 518003L, 515.24, "Fantasy");
		
		LibraryBookSystem b3 = new LibraryBookSystem("SpaceX", 518004L, 1023.45, "Technology");
		

		System.out.println("which book do you need? 1/2/3");
		int bookSelected = scan.nextInt();
		
		LibraryBookSystem selectedBook = null;

		switch(bookSelected) {

		case 1:
		    selectedBook = b1;
		    break;

		case 2:
		    selectedBook = b2;
		    break;

		case 3:
		    selectedBook = b3;
		    break;

		default:
		    System.out.println("Invalid Choice");
		}
		
		
		System.out.println("Do you have membership? true/false");
		
		boolean hasMemberShip = scan.nextBoolean();
		
		if (selectedBook != null) {

		    selectedBook.displayBook();

		    System.out.println("Price Category: " + selectedBook.checkPrice());

		    String accessType;

		    if (selectedBook.bookPrice > 1000 || hasMemberShip) {
		    	accessType = "Priority Access";
		    } else {
		    	accessType = "Normal Access";
		    }

		    System.out.println("Access Type: " + accessType);
		}
		
		scan.close();

	}

}
