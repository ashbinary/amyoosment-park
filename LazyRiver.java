import java.util.Random;

public class LazyRiver extends Attraction {

	private Random rngVal = new Random();
	boolean imRiveringOutRnBros = true;
	
	public LazyRiver(String rn, int cfr, int dl, Ticket t) {
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
		
		print("\n--------------------\nYou start to float down the lazy river.\n", true);
		
		while (imRiveringOutRnBros) {
			int illusionOfChoice = Math.abs(rngVal.nextInt() % (happenstances.length));
			for (int dial = 0; dial < 3; dial++) {
				print(happenstances[illusionOfChoice][dial], true);
			}
			
			print("\nAfter a long lazy river ride, you found", true);
			print(places[Math.abs(rngVal.nextInt() % (happenstances.length))], true);
			
			print("\nKeep going? [Yes/No]\n--------------------\n>> ", false);
			
			switch (scan.next().toLowerCase()) {
				case "no":
					print("--------------------\nYou decide to stop here.\nMaybe you'll try it more later.", true);
					imRiveringOutRnBros = false;
					AmusementPark.setPhaseFromAttraction("choosing");
					break;
				case "yes":
					print("--------------------\nYou decide to keep going onward.\n", true);
					break;
			}
		}	
	}
	
	// print(text, true for line break - false for no line break)
	// printm(new String[] {text1, text2, text3})
	
	String[][] happenstances = {
			{"As you pass by, you see a cloud of red mist.",
				"Someone seems to have been unlucky with the crocodile.",
				"You decide to shrug it off and keep moving."},
			{"A floatie with rats on it floats by.",
				"They seem to have created a float out of grass.",
				"As you see them float off into the distance, \ntheir floatie pops and the rats fall into the water."},
			{"You wonder if taking the lazy river was a good idea.",
				"To your right, you see a tour bus fly into a pole.",
				"You decide to stay on the lazy river."},
			{"You feel a large sphere hit the back of your head.",
				"Looking back, you see a Pokeball and a confused man.",
				"You decide to not ask how he thought you were a Pokemon."},
			{"You realize that you might have hit the calm patch of water.",
					"As you close your eyes, you hear a rush of... swords???",
					"Opening your eyes, you see two knights\non horses\non floaties\nfighting on the water."}
		};
	
	String[] places = {
			"a wall. It's literally just a wall.",
			"a beautiful view that highlights the sun.",
			"a graveyard with a massive statue of some brown guy.",
			"a \"garden\" that is clearly being used to grow cannabis.",
			"a classroom with a room on the side.\nIt seems to be connected to a playground.",
			"a mirror room with no water in it...how did you get here?",
			"a nice looking gated community.\nIt seems that one of the houses belongs to an Asian man.",
			"a dark tunnel with a vent above you.\nWhen you peek out, you see a massive red blob in a space suit.",
			"a bunker with people in it.\nThey say they weren't able to find the exit to the river.",
			"a nice looking meth lab that's been deserted.\nThe calendar says you're in Albuquerque, New Mexico."
	};
}
