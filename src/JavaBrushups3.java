import java.util.ArrayList;

public class JavaBrushups3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,6,8,10,17,20,100,57};
		for (int i=0; i<arr2.length; i++)
		{
			if(arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				
			}
			else 
			{
				System.out.println(arr2[i]+ "is not multiplied by 2");	
			}
		}
		// we can add n number of Values
       ArrayList<String> a = new ArrayList<String>();
       a.add("Rahul");
       a.add("Shetty");
       a.add("Academy");
       a.add("Selenium");
       //if we want delete any array give the index value
       //System.out.println(a.remove(3));
       //if we want to extract the Value
      System.out.println(a.get(2));
	}

}
