package activities;

public class Car {
  
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	 
	Car() {
		tyres = 4;
		doors = 4;
	}
	public void displayCharacteristics() {
		
		System.out.println("The color of the care is: "+ color);
		System.out.println("The car transmission type is:" + transmission);
		System.out.println("The make year of the car is:" + make);
		System.out.println("The number of tires for the care are:"+ tyres);
		System.out.println("The number of doors for the care are:"+doors);
	} 
	public void accelarate() {
		System.out.println("Car is moving forward");
	}
	public void brake() {
		System.out.println("Car has stopped");
	}
}
