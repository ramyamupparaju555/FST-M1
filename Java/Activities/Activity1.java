package activities;

public class Activity1 {
	
	public static void main(String[] args) {
	Car Vokswagan= new Car();
	
 
	Vokswagan.make = 2014;
	Vokswagan.color ="black";
	Vokswagan. transmission="Manual";
	
	//print the characteristics of the car
	Vokswagan.displayCharacteristics();
	Vokswagan.accelarate();
	Vokswagan.brake();
	}
}
