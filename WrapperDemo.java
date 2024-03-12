package day10.wrapperclasses;

public class WrapperDemo {

	public static void main(String[] args) {
//		int a=10;
//
//		Integer aObject = new Integer(a); //autoboxing
//
//		System.out.println(a);
//		System.out.println(aObject);
//		
//		int x=aObject.intValue();  //unboxing
//		System.out.println(x);
		
//		String str = "Hello, World!";
//		int index = str.indexOf("World");
//		System.out.println(index);
//		
//		str.substring(index);
		
		String str = "Java";
		str.concat("Programming");
		System.out.println(str);
		
		String s1="   Apple   ";
		String s2="Mango";
		System.out.println(s1.trim()+s2);
		
		String s7=new String();
		System.out.println(s7);
	}

}
