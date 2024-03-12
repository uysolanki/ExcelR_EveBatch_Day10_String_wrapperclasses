package day10.string;

public class StringImmutableDemo {

	public static void main(String[] args) {
		String firstName="Alice";
		
		String fullName=firstName.concat(" Fernades");
				
		System.out.println(firstName);
		System.out.println(fullName);
		
		System.out.println(firstName==fullName);

	}

}
