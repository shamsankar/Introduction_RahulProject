
public class JavaBrushups4 {

	public static void main(String[] args) {
		// String is an Object //String Literal //only one Object will be created
		
		String s1 = "Rahul Shetty Acaddemy";
		String s4 = "Rahul Shetty Acaddemy";
		
		// new Memory will be allocated // 2 object will be created
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		//Split
		String s = "Rahul Shetty Acaddemy";//Split the String based on White Space
		
		String[] splittedString = s.split(" ");
		
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
	}

}
