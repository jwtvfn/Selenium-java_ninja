
public class ClassDemo {
	
	static String str2 = "Hi";
	
	public static void main(String[] args) {
		
		String str1 = "there";
		
		System.out.println(str2);
		
		str2 = str2 + " " + str1;
				//str2.concat(str1);
		
		
		System.out.println(str2);
		
		for (int i=0; i<args.length; i++){
			System.out.println(args[i]);
		
		}
		
		System.out.println("*************************");
		
		Car c1 = new Car();
		
		c1.model = "Subaru";
		c1.year = 2017;
		
		System.out.println(c1.year);
		System.out.println(c1.getYear());
	}

}

class Car {
	
	int year;
	String model;
	
	public int getYear(){
		return this.year;
		
	}
	
}