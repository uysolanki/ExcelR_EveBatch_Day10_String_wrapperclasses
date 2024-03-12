package day10.string;

public class CharSequenceDemo {

	public static void main(String[] args) {
		String firstName=new String("Alice");
		CharSequence secondName =new String("Ben");
		System.out.println(firstName);
		
		test(firstName);

	}

	private static void test(CharSequence firstName) {
		System.out.println("My Name is"+firstName);
		
	}

}
