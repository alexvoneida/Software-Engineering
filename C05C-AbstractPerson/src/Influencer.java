import java.util.Random;

public class Influencer extends Person {
	/**
	 * Influencer class
	 *  
	 * @author Alex Voneida
	 * @author Noah Witte
	 * 
	 * Purpose: Influencer class that answers and asks questions randomly, overrides whatIDo()
	 */
	
	String[] questionList = {"Do you follow me on TikTok", "Do you know who I am???", "Can I have a free coffee if I promote your store?"};
	String[] answerList = {"I have 100,000 followers", "You're banned", "Don't forget to like and subscribe"};
	
	public Influencer(String myName, String occupation) {
		super(myName, occupation);
	}
	
	@Override
	void whatIDo() {
		super.whatIDo();
		System.out.println("Obviously, how could you not know that!");
	}
	
	void askQuestion() {
		int rnd = new Random().nextInt(questionList.length);
		System.out.println(questionList[rnd]);
	}
	
	void answerQuestion() {
		int rnd = new Random().nextInt(answerList.length);
		System.out.println(answerList[rnd]);
	}
	
	
}
