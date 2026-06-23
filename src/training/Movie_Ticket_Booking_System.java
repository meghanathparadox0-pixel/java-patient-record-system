package training;

import java.util.Scanner;

public class Movie_Ticket_Booking_System {
	String movieName;
	int seatNumber;
	double ticketPrice;
	String movieGenre;

	public Movie_Ticket_Booking_System(String name, int Number, double price, String genre) {
		movieName = name;
		seatNumber = Number;
		ticketPrice = price;
		movieGenre = genre;
	}

	public void displayMovie() {
		System.out.println("Movie Name: " + movieName);
		System.out.println("Seat Number: " + seatNumber);
		System.out.println("Ticket Price: " + ticketPrice);
		System.out.println("Movie Genre: " + movieGenre);
	}

	public String checkTicket() {
		if (ticketPrice < 200) {
			return "Budget";
		}
		else if (ticketPrice <= 500) {
			return "Standard";
		}
		else {
			return "Premium";
		}
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Movie_Ticket_Booking_System m1 = new Movie_Ticket_Booking_System("Avenger", 24, 185.10, "Action");

		Movie_Ticket_Booking_System m2 = new Movie_Ticket_Booking_System("Interstellar", 33, 375.00, "Technology" );

		Movie_Ticket_Booking_System m3 = new Movie_Ticket_Booking_System("Bahubali", 44, 501.02, "Indian");

		System.out.println("which movie do you want? 1/2/3");

		int chooseMovie = scan.nextInt();

		Movie_Ticket_Booking_System selectedMovie = null;

		switch (chooseMovie) {
		case 1: selectedMovie = m1;
		break;
		case 2: selectedMovie = m2;
		break;
		case 3: selectedMovie = m3;
		break;
		default : System.out.println("Invalid choice");
		}

		if (selectedMovie != null) {
			System.out.println("Do you have VIP Access? true/false");

			boolean vipMember = scan.nextBoolean();

			String accessType;

			if(selectedMovie.ticketPrice > 500 || vipMember) {
				accessType = "Priority";
			}
			else {
				accessType = "Normal";
			}

			selectedMovie.displayMovie();
			System.out.println("Price Category: " + selectedMovie.checkTicket());
			System.out.println("Access Type: " + accessType);
		}


		scan.close();

	}

}
