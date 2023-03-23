
public class WhackAMole extends Attraction {

	public WhackAMole(String rn, int cfr, int dl, Ticket t) {
		super(rn, cfr, dl, t);
		// TODO Auto-generated constructor stub
	}
	
	public void describeAttraction() {
		super.describeAttraction();
		printm(new String[] {
				"Brave the long rivers with only your tube and your body--",
				"attempting to run through piles of rocks, and garbage,",
				"and fecal matter, and toxic waste, and sewer water, just",
				"for some views of the park walls!",
				"DISCLAIMER: ARM AMUSEMENT PARK CO. LTD. IS NOT AT FAULT",
				"FOR ANY INTERACTION WITH TOXIC WASTE AND/OR RADIOCATIVE",
				"CHEMICALS."
		});
	}
	
	public void play() {
		super.play();
	}
	
	// print(text, true for line break - false for no line break)
	// printm(new String[] {text1, text2, text3})

}
