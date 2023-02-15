
import java.util.Scanner;
public class program3 {
	String name;

	@Override
	public String toString() {
		return name; 
	}

	public static void main(String args[]) {
		program3 obj = new program3(); 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Input name: "); 
		obj.name = sc.nextLine();

		System.out.println(obj);  
	}
}
