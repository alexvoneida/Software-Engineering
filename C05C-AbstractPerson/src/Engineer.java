
public class Engineer extends Person {
	String[] questionList = {"What is your favorite pie?", "Who is your celebrity crush?", "Do you even like Java?"};
	String[] answerList = {"I hate java so much", "I am partial towards apples", "My dogs name is Rowdy"};
	Integer currentQuestion = 0;
	Integer currentAnswer = 0;
	void askQuestion() {
		System.out.println(questionList[currentQuestion]);
		currentQuestion = (currentQuestion + 1) % questionList.length;
	}
	void answerQuestion() {
		System.out.println(answerList[currentAnswer]);
		currentAnswer = (currentAnswer + 1) % answerList.length;
	}
}
