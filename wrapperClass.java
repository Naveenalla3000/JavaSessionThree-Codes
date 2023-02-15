public class wrapperClass {
	public static void main(String args[]) {
		Integer i = 10;
		int x = i.intValue();	
		System.out.println(x);
		System.out.println(i);

		System.out.println(((Object)i).getClass().getSimpleName());
		System.out.println(((Object)x).getClass().getSimpleName());

	}
}
