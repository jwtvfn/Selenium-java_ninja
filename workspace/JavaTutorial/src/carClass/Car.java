package carClass;

public class Car {
	private String make;
	int speed;
	int gear;
	
	
	public Car(){
		this.speed = 0;
		this.gear = 0;
		System.out.println("Executing constructor w/o arguments");
	}
	
	public Car(int speed, int gear){
		this();
		System.out.println(this.speed);
		System.out.println(this.gear);
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing with arguments");
	}
	
	public void setMake(String make) {
		this.make = make;
		
	}
	
	public String getMake(){
		return make;
	}

}
