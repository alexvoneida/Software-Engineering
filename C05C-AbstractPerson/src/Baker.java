
public class Baker extends Person {
	/**
	 * Baker class
	 *  
	 * @author Alex Voneida
	 * @author Noah Witte
	 * 
	 * Purpose: Baker class with instance variable for pie choice
	 */
	
	String favoritePie;
	
	public Baker(String myName, String occupation, String favoritePie) {
		super(myName, occupation);
		this.favoritePie = favoritePie;
	}
	
	void askQuestion() {
		System.out.println("Do you like " + favoritePie + " pie?");
	}
	
	void answerQuestion() {
		System.out.println("My favorite pie is " + favoritePie);
	}
}

