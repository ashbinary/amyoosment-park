
public class LazyRiver extends Attraction {

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
		
		while (true) {
			int illusionOfChoice = (int) (Math.random() * (happenstances.length - 1));
			for (int dial = 0; dial < 3; dial++) {
				print(happenstances[illusionOfChoice][dial], true);
			}
			
			print("\nAfter a long lazy river ride, you found", true);
			print(places[(int) (Math.random() * (places.length - 1))], true);
			
			print("\nKeep going? [Yes/No]\n--------------------\n>> ", false);
			
			switch (scan.next().toLowerCase()) {
				case "no":
					print("--------------------\nYou decide to stop here.\nMaybe you'll try it more later.", true);
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
			{"A floatie made of rats floats by.",
				"They seem to have created a float out of grass.",
				"As you see them float off into the distance, \ntheir floatie pops and the rats fall into the water."},
			{"You wonder if taking the lazy river was a good idea.",
				"To your right, you see a tour bus fly into a pole.",
				"You decide to stay on the lazy river."
			}
		};
	
	String[] places = {
			"a wall. It's literally just a wall.",
			"a beautiful view that highlights the sun.",
			"a graveyard with a massive statue of some brown guy.",
			"a \"garden\" that is clearly being used to grow cannabis."
	};
}
