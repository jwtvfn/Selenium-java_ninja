
public class LoopsDemo {

	public static void main(String[] args) {
		
		/*for(initialisation; boolean_expression; update){
			
		}*/

		/*for (int i=0; i<10; i++){
			System.out.println("The value of i is: " + i);
			
			
		}*/
		
		int[] numbers = {10, 20, 30, 50, 40};
		for(int i=0; i< numbers.length; i++){
			System.out.println("The value of index " + i + " is: " + numbers[i]);
			
		}
		
		for(int i: numbers){
			System.out.println("The value is: " + i);
		}
		
		
		String[] text /*cars*/ = {"bmw", "audi", "honda"};
		for(String i/*car*/:text/*cars*/ ){
			System.out.println(i/*car*/);
		}
	}

}
