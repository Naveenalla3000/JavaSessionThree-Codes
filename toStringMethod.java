/*
* Java program to demostrate toString method (overriding toString()) 
*/

public class toStringMethod {
	String name;
	int score;


	@Override
	public toStringMethod(String name, int score) {
		this.name = name;
		this.score = score; 
	}

	public static void main(String args[]) {
		toStringMethod obj = new toStringMethod("Deepak", 100); 
		System.out.println(obj);
		System.out.println(obj instanceof toStringMethod); 
	}

}
