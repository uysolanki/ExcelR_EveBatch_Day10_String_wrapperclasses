package day10.string;

public class StringBufferMutableDemo {

	public static void main(String[] args) {
		StringBuffer firstName=new StringBuffer("Alice");
		
		StringBuffer fullName=firstName.append(" Fernandes");
		
		System.out.println(firstName==fullName);
		
		System.out.println(firstName);
	}

}
