import java.util.Scanner;

public class Attraction {
	private String RIDE_NAME;
	private int COST_FOR_RIDE;
	private Ticket TICKETS;
	private int DANGER_LEVEL;
	private boolean ATTRACTION_ON;
	
	private boolean FOUND_OFF_SWITCH;
	protected Scanner scan = new Scanner(System.in);
	
	public Attraction(String rn, int cfr, int dl, Ticket t) {
		RIDE_NAME = rn;
		COST_FOR_RIDE = cfr;
		DANGER_LEVEL = dl;
		TICKETS = t;
	}
	
	public void play() {
		if (TICKETS.getTickets() <= COST_FOR_RIDE) {
			System.err.print("You don't have enough tickets!\nCome back when you're less poor.");
			System.exit(0);
		} else {
			TICKETS.setTickets(TICKETS.getTickets() - COST_FOR_RIDE);
		}
		
		System.out.print("Entering " + RIDE_NAME.replace("&", " ") + "...");
	}
	
	public void describeAttraction() {
		System.out.print("\n > " + RIDE_NAME.split(" | ", 2)[0].replace("&", " ") + "\n > [Danger Level: ");
		
		for (int i = 0; i < DANGER_LEVEL; i++) {
			System.out.print("✪");
		}
		
		System.out.print("]\n");
	}
	
	public String getName() {
		return RIDE_NAME;
	}
	
	public void turnOffRide() {
		if (FOUND_OFF_SWITCH) {
			System.out.print("You turned off the ride. ");
		}
	}
	
	static void print(String str, boolean lb) {
		if (lb == true) {
			System.out.println(str);
		} else {
			System.out.print(str);
		}
	}
	
	static void printm(String[] strM) {
		for (int str = 0; str < strM.length; str++)
			System.out.println(strM[str]);
	}
}
