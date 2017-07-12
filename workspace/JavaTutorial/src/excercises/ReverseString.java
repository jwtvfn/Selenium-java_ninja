package excercises;

public class ReverseString {

	public static void main(String[] args) {
		String input = "this is a test string";
		String output = reverse(input);
		System.out.println(output);
	}
	
	private static String reverse (String input){
		String reverse = "";
		
		if(input.isEmpty() || input == null){
			System.out.println("Empty and null strings are not accepted");
		}
		
		if(input.length() <= 1){//because in this case 
			reverse = input;	//only one instruction is executed
								//but it would work without it anyway 
		}else{
			String[] originalArray = input.split("\\s+");
			
			for(String item : originalArray){
				reverse = item + " " +  reverse;
			}
		}
		return reverse.trim();
	}
}
