
public class Engineer extends Person {
	/**
	 * Engineer class
	 *  
	 * @author Alex Voneida
	 * @author Noah Witte
	 * 
	 * Purpose: Engineer class that rotates through question/answer list, overrides whatIDo()
	 */
	static final String[] questionList = {"What is your favorite pie?", "Who is your celebrity crush?", "Do you even like Java?"};
	static final String[] answerList = {"I hate java so much", "I am partial towards apples", "My dogs name is Rowdy"};
	Integer currentQuestion;
	Integer currentAnswer;
	
	public Engineer(String myName, String occupation) {
		super(myName, occupation);
		this.currentQuestion = 0;
		this.currentAnswer = 0;
	}
	@Override
	void whatIDo() {
		super.whatIDo();
		System.out.println("I really enjoy coding");
	}
	void askQuestion() {
		System.out.println(questionList[currentQuestion]);
		currentQuestion = (currentQuestion + 1) % questionList.length;
	}
	void answerQuestion() {
		System.out.println(answerList[currentAnswer]);
		currentAnswer = (currentAnswer + 1) % answerList.length;
	}
}
