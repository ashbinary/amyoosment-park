public class Card {
	
	private double balance;
	private int CARD_TYPE;
	private double[] CARD_PRICE = {1,2,3};
	private double[] CARD_SAVINGS = {0.1,0.2,0.3};
	
	public Card(int ct)
	{
		this.CARD_TYPE = ct - 1;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(int b) {
		balance = b;
	}
	
	public void buyCard(int CARD_TYPE)
	{
		balance -= CARD_PRICE[CARD_TYPE];
	}
	
	public String[] getCardInfo()
	{
		String CARD_NAME = "";
		
		switch (CARD_TYPE) {
			case 0: CARD_NAME = "Basic Card";
			case 1: CARD_NAME = "Premium Card";
			case 2: CARD_NAME = "Ultra Card";
		}
		
		String[] CARD_INFO = {CARD_NAME, Double.toString(CARD_PRICE[CARD_TYPE]), Double.toString(CARD_SAVINGS[CARD_TYPE])};
		
		return CARD_INFO;
	}
	
}

