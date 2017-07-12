import java.util.*;


public class ArraysDemo {
	public static void main(String[] args) {
		
		int[] myIntArray1;
		myIntArray1 = new int[10];
		
		myIntArray1[0] = 100;
		myIntArray1[1] = 90;
		
		
		for (int i=0; i < myIntArray1.length; i++){
		
			System.out.println("myIntArray1 index " + i + " is:" + myIntArray1[i]);
		}
		
		String[] myStringArray1 =  {"three", "two", "one"};
		
		int[] myIntArray2 = {1, 2, 3};
		
		for (int i=0; i < myIntArray2.length; i++){
			
			System.out.println("myStringArray1 index " + i + " is:" + myStringArray1[i]);
			//System.out.println("myIntArray2 index " + i + " is:" + myIntArray2[i]);
		}
		
		
		Arrays.sort(myStringArray1);
		
		for (int i=0; i < myIntArray2.length; i++){
			
			System.out.println("myStringArray1 index " + i + " is:" + myStringArray1[i]);
			//System.out.println("myIntArray2 index " + i + " is:" + myIntArray2[i]);
		}
	}
}
