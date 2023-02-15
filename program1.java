//program to read a number and print its immediate palidrome 

import java.util.Scanner; 
public class program1 {
	static int x;


	public static int reverse(int x) {
		int rev = 0;
		while (x > 0) {
            		rev = rev * 10 + x % 10;
            		x = x / 10;
        	}
        	return rev;
	}

	public static boolean checkForPalind(int x) {
		if(x == (reverse(x))) {
			return true; 
		}
		else {
			return false; 
		}
	}

	public static void main(String deepak[]) {
		Scanner sc = new Scanner(System.in); 

		System.out.print("Input x value: ");
		x = sc.nextInt(); 
		if(((int)Math.log10(x)+1 ==1)) {
			x = 10; 
		} 
		
		while(true) {
			boolean status = checkForPalind(++x);
			if(status == true){
				System.out.println(x); 
				break;
			}
		}		 
		
	}
}
