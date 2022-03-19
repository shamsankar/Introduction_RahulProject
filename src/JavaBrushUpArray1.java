
public class JavaBrushUpArray1 {

	public static void main(String[] args) {
		int[] arr = new int[5];//one Type
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//int[] arr2 = {1,2,3,4,5};
		//if you want to Access the array Value use for loop
		for (int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
			
		}
		String[] name = {"Jas","Lealiya","Kishore"};
		
		for (int i =0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
			// enhanced for loop Syntax
		
		for(String s:name)
			
		{
			System.out.println(s);
		}
		
	


	}

}
