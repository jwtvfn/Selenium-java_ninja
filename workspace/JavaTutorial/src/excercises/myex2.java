package excercises;

import java.util.Scanner;

public class myex2 {

	public static void main(String[] args) {
		//String input = "It is a test string";
		
		System.out.println("Enter a string to reverse: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		while(input.isEmpty() || input == null){
			System.out.println("Empty or null strings are not allowed.\nPlease enter a valid string:");
			input = scanner.nextLine();
		}
		scanner.close();
				
		String output = reverseChar (input);
		System.out.println("The reversed string is:" + output);
		
	}	
		private static String reverseChar(String input) {
		
			
			String reverse = "";
			
			if(input.length() <= 1){
				reverse = input;
			} else {
			
				/*for (int i = 0; i<input.length(); i++){
					reverse = input.substring(i, i+1) + reverse;*/
				
				/*for(int i = input.length(); i>0; i--){
					reverse = reverse + input.substring(i-1, i);*/
				
				for(int i = input.length()-1; i>=0; i--){
					reverse = reverse + input.charAt(i);
				
				}
			}
			
		return reverse;	
		}

}


