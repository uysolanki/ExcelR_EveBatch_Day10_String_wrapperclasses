package day10.string;

public class StringBuiltInFunctions {

	public static void main(String[] args) {
			
//		String name="Excelr";  
//		String sf1=String.format("Company name is %s",name);
//		System.out.println(sf1);
//		double d=32.33734;
//		String sf2=String.format("Area of Circle is %.1f",areaCircle(5));  
//		String sf3=String.format("value is %.2f",d);
//		System.out.println(sf2);
//		System.out.println(sf3);


	/*	width 15        
		---------------
		Tie		    300
		Belt		500
		Trouser		1500
		Total		2300*/
//		System.out.println("------------------");
//		String line1a= String.format("%-13s", "Tie");
//		String line1b= String.format("%5d", 300);
//		
//		String line2a= String.format("%-13s", "Belt");
//		String line2b= String.format("%5d", 500);
//		
//		String line3a= String.format("%-13s", "Trouser");
//		String line3b= String.format("%5d", 1500);
//		
//		String line4a= String.format("%-13s", "Total");
//		String line4b= String.format("%5d", 2300);
//		
//		System.out.println(line1a+line1b);
//		System.out.println(line2a+line2b);
//		System.out.println(line3a+line3b);
//		System.out.println(line4a+line4b);
//		System.out.println("------------------");
		
		
//		System.out.println("------------------");		
//		System.out.println(String.format("%-13s", "Tie")+String.format("%5d", 300));
//		System.out.println(String.format("%-13s", "Belt")+String.format("%5d", 500));
//		System.out.println(String.format("%-13s", "Trouser")+String.format("%5d", 1500));
//		System.out.println(String.format("%-13s", "Total")+String.format("%5d", 2300));
//		System.out.println("------------------");
//
		
		String str1 = "Apple";
        String str2 = "Orange";
        double d=40.45;
        // %1$ represents first argument
        // %2$ second argument						1   2
       String str = String.format("Fruits name is: %1$s, %1$s and %2$s for %3$.2f Rupees", str1, str2,d);
 
        // Print and display the formatted string
        System.out.println(str);

	}
	
	public static double areaCircle(int radius)
	{
		return Math.PI * radius *radius;
	}
}
