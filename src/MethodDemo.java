
public class MethodDemo {

	public static void main(String[] args) {
		// Calling Method inside Main Method
		//Creating an Object of the Class
		MethodDemo d = new MethodDemo();
		String name = d.getData();
		System.out.println(name); // name is Variable name
		
		//Accessing method from Reusable methods
		//Creating an object for that Method Class
		
		MethodDemo2 d1 = new MethodDemo2();
		String name2 = d1.getUserData();
		System.out.println(name2);
		//without Creating an Object how to Access Method by Declaring Static
		// Simply call that method
		getData2();
		System.out.println(getData2());
		
		
	}
	
	//cannot create Method inside Main method so creating out of main method
	
	public String getData()
	{
		System.out.println("Hello World");
		return "Rahul Shetty";
	}
	//Declaring Static
	public static String getData2()
	{
		System.out.println("Hello World");
		return "Rahul Shetty without Creating an Object calling Method";
	}


}
