//java program to demostrate set and get methods

class Demo {
	private String name = "Deepak";
	public static void setName(String str) {
		this.name = str;
	}
	public static String getName() {
		return name; 
	}
}
public class Accessors {
	public static void main(String args[]) {

		Demo obj = new Demo();
		System.out.println(obj.getName()); 
	}
}
