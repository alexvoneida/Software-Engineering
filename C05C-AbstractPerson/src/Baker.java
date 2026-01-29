import java.util.Random;

public class Baker extends Person {
	String[] pieList = {"pumpkin", "cherry", "apple", "oreo", "blueberry"};
	int rnd = new Random().nextInt(pieList.length); // random to choose pie for each instance
	void askQuestion() {
		System.out.println("Do you like " + pieList[rnd] + "pie?");
	}
	void answerQuestion() {
		System.out.println("My favorite pie is " + pieList[rnd]);
	}
}

