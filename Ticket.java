import java.util.Scanner;

public class Ticket 
{
	private int BALANCE;
	private int AMOUNT;
	private boolean HAS_CARD;
	
	Card CARD = new Card(1);
	String[] CARD_INFO = CARD.getCardInfo();
	Scanner scan = new Scanner(System.in);
	
	public Ticket(int a, boolean hc)
	{
		this.AMOUNT = a;
		this.HAS_CARD = hc;
	}
	
	public void buyTickets(boolean HAS_CARD, int AGE)
	{
		if(HAS_CARD == true)
		{
			CARD.getCardInfo();
		}
		
		System.out.print("How many tickets do you want to buy?\n--------------------\n>> ");
		AMOUNT += Integer.parseInt(scan.next());
		
		System.out.println("--------------------\nThat will cost $" + 
				(float) Math.round(((AMOUNT * 31) * 1.056) * 100) / 100 + " in total.\nWill you purchase the tickets? [Yes/No]"); // arizona tax rate lolll
		System.out.print("--------------------\n>> ");
		switch (scan.next().toLowerCase()) {
			case "yes": 
				System.out.println("You bought the tickets and entered the park.\n");
				break;
			case "no":
				System.err.println("You didn't buy the tickets and left the park.");
				System.exit(0);
		}
	}
	
	public void setTickets(int a) {
		AMOUNT = a;
	}
	
	public int getTickets() {
		return AMOUNT;
	}
}
