/*
* Basic java program to demostrate static, non-static variables, Scanner class and object creation. 
*/

import java.util.Scanner; 
public class program2 {
	static int x;
	int y;


	public String toString() {
	
		return x+" "+y; 
	}

	public static void main(String arg[]) {
		
		program2 obj = new program2(); 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Input x: "); 
		x = sc.nextInt(); 
		System.out.print("Input y: ");
		obj.y = sc.nextInt();

		int sum = x+ obj.y;
		System.out.println(sum);
		
		System.out.println(obj); 
	}
}
