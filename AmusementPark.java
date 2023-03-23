import java.util.Scanner;

public class AmusementPark {

	public static void main(String[] args) {
		
		String phase = "entering";
		Scanner input = new Scanner(System.in);
		Ticket tickets = new Ticket(0, false);
		
		// Welcome + Buying Tickets
		
		while (phase.equalsIgnoreCase("entering")) {
			printm(new String[] {"Welcome to ARM Amusement Park!", 
					 "(Type the text in the []s to interact)", 
					 "What would you like to do?\n", 
			"> Enter the Park [enter]",
			"> Buy Tickets to the Park [ticket]",
			"> Buy a Card to the Park [card]"});
	
			print("--------------------\n>> ");
			switch(input.next().toLowerCase()) {
				default:
					printerr("Try again.\n");
					break;
				case "enter":
					println("--------------------");	
					printerr("Sorry, we don't accept poor people here!\nCome back when you have tickets.");
					//phase = "choosing";
					//break;
					System.exit(0);
				case "ticket":
					print("--------------------");	
					println("\nYou walk over to the ticket counter.");
					tickets.buyTickets(false, 0);
					phase = "choosing";
					break;
				case "card":
					println("--------------------");	
					println("(You walk over to the card machine.) \n(It's broken.)\n");
					break;
			}
		}
		
		// Choosing an Attraction
		
		println("Welcome inside ARM Amusement Park!");
		while (phase == "choosing") {
			println("Which attraction would you like to use?\n");
			Attraction[] games = {
					new LazyRiver("Lazily&Built&River [river]", 3, 5, tickets),
					new WhackAMole("Whack-A-Mole&(w/&Darryl) [mole]", 5, 1, tickets),
					new Slingshot("Slingshot&Golf [sling]", 3, 15, tickets)
			};
			
			for (int game = 0; game < games.length; game++) {
				print("> " + games[game].getName().replace("&", " ")); println("");
			}
			print("> Leave the park [leave]\n--------------------\n>> ");
			String attr = input.next().toLowerCase(); // temporary variable
			switch(attr) {
				default:
					println("--------------------");
					printerr("You left the park, despite having \n$" + (float) Math.round(((tickets.getTickets() * 31) * 1.056) * 100) / 100 + " left worth of tickets???");
					System.exit(0);
				case "river", "mole", "sling":
					print("--------------------\n");
					for (int i = 0; i < games.length; i++) {
						if (games[i].getName().contains(attr)) {
							games[i].describeAttraction();
							printm(new String[] {
									"\nWhat would you like to do?",
									"> Play [play]",
									"> Go Back [back]"
							});
							print("--------------------\n>> ");
							switch (input.next().toLowerCase()) {
								case "play":
									phase = "playing";
									games[i].play();
								case "back":
									break;
							}
						}
					}
			}
		}
		
		
	}
	
	// convenience functions (god so help me i am NOT typing System.out.print 1 billion times
	
	static void print(String str) {
		System.out.print(str);
	}
	
	static void println(String str) {
		System.out.println(str);
	}
	
	static void printerr(String str) {
		System.err.print(str);
	}
	
	static void printm(String[] strM) {
		for (int str = 0; str < strM.length; str++)
			System.out.println(strM[str]);
	}

}
