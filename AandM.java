/*
* Java Program to demostrate Accessors and Mutators (Getters and Setters) 
*/

import java.util.Scanner;

public class AandM {
	String name;
	public AandM() {}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name; 
	}
	public static void main(String args[]) {
		AandM obj = new AandM(); 
		Scanner sc = new Scanner(System.in); 
		obj.setName("codeforcause"); 
		System.out.println(obj.getName()); 
		
	}
}
