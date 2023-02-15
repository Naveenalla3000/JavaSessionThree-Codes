/*
* Java program to demostrate instance of operator 
*/

public class instanceOf{
	final int x = 10;
	public static void main(String args[]) {
		instanceOf obj = new instanceOf(); 

		System.out.println(obj instanceof instanceOf);
	}
}
