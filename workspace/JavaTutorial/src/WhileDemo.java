
public class WhileDemo {

	public static void main(String[] args) {

		int i = 10;
		
		/*boolean condition = 10 > 20;
		System.out.println(condition);*/ 
		
		while (i <= 20){
			
			if (i > 12 && i < 18) {
					
				//i++;
				continue;
			}
			
			if (i == 19){
				break;
			}
			System.out.println(i);
			i++;
			
		}
		System.out.println("Outside loop...");

	}

}
