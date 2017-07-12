package carClass;

public class ConditionalStatement {
	
	public static void main(String[] args) {
		
		int score = 90;
		String grade;
				
		//boolean condition = val1 == val2;
		
		if (score > 90){
			grade = "A";
		}
		else if (score > 80){
			grade = "B";
				
		}
		else {
			grade = "C";
			
		}
		
		System.out.println("Score is:" + score);
		System.out.println("Grade is:" + grade);
	}

}
