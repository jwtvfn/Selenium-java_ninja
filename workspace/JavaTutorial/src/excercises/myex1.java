package excercises;

public class myex1 {

	public static void main(String[] args) {
		
		String sourceStr = "this is a test string";
					
		String[] sourceArray = splitString(sourceStr);
		
		
		String reverseStr = reverseString(sourceArray);
		System.out.println(reverseStr);
		
		
	}
		

	
	static String reverseString(String[] sourceArray) {
		
		String reversedStr = "";
		
		for (int i=sourceArray.length-1; i>=0; i--){

			//try with multiple parameters "for" loop
			reversedStr = reversedStr.concat(sourceArray[i] + " ");
			
			}
		
		return reversedStr.trim();
		}

	



	static String[] splitString(String sourceString){
		//String[] strArray = sourceString.split(" ");
		//try hard way instead:
		
		//move to another method?? *
		int arrayLength = 1;
		for (int i=0; i<sourceString.length(); i++){
			if (sourceString.charAt(i) == ' '){
				arrayLength++;
			}
		}	
		String[] strArray = new String[arrayLength];
		//and change to return string *
		
		
		int wordStartIndex = 0;
		int wordEndIndex = 0;
		int arrayIndex = 0;
		
		for (int i=0; i<sourceString.length(); i++){
			//wordEndIndex++;
			if (sourceString.charAt(i) == ' '){
				
				wordEndIndex = i;
				
				strArray[arrayIndex] = sourceString.substring(wordStartIndex, wordEndIndex);
				System.out.println(strArray[arrayIndex]);
				arrayIndex++;
				wordStartIndex = wordEndIndex+1;
			}			
			else if (i == sourceString.length()-1){
				wordEndIndex = sourceString.length();
				strArray[arrayIndex] = sourceString.substring(wordStartIndex, wordEndIndex);
				System.out.println(strArray[arrayIndex]);
				arrayIndex++;
				wordStartIndex = wordEndIndex+1;
			}
			
		}
								
		
		return strArray;
	}

}
