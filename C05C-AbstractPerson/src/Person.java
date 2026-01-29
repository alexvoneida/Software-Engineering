
abstract public class Person {
	/**
	 * Person class. 
	 *  
	 * @author Alex Voneida
	 * @author Noah Witte
	 * 
	 * Purpose: Abstract parent class for children
	 */
	private String myName;
	private String occupation;
	
	public Person(String myName, String occupation) {
		this.myName = myName;
		this.occupation = occupation;
	}
	
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
