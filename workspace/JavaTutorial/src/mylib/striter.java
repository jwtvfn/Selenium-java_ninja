package mylib;

public class striter {

	
	public static int len (String input){
		//int len = 0;
		
		String trim = input.trim();
		if (trim.isEmpty())
		    return 0;
		return trim.split("\\s+").length; // separate string around spaces
		
		//return len;
	}
}
