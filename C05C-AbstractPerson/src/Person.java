
abstract public class Person {
	String myName;
	String occupation;
	void askName() {
		System.out.println("What is your name?");
	}
	void giveName() {
		System.out.println("My name is " + myName);
	}
	void whatIDo() {
		System.out.println("I am a " + occupation);
	}
	abstract void askQuestion();
	abstract void answerQuestion();
}
