
public class JavaBrushupsCharTrim {

	public static void main(String[] args) {
		// Stings are Treated as Array of Character
		String s1 = "Rahul Shetty Acaddemy";
		String s4 = "Rahul Shetty Acaddemy";
		
		// new Memory will be allocated // 2 object will be created
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		//Split
		String s = "Rahul Shetty Acaddemy";//Split the String based on White Space
		
		String[] splittedString = s.split("Shetty"); //here Shetty is the delimiter
		
		System.out.println(splittedString[0]);//Rahul it will trim left and right
		//System.out.println(splittedString[1]);//Academy
		//System.out.println(splittedString[2]);
		System.out.println(splittedString[1].trim());
		
		for(int i = 0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));//this will Print all the Chars
		}

	}

}
