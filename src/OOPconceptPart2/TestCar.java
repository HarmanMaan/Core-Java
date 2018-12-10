package OOPconceptPart2;

public class TestCar {

	public static void main(String[] args) {

		// STATIC polymorphism -- Compile time polymporphism
		// All methods from child and parents class will be called 
		// Except overriden method will be called from child class 
		BMW b = new BMW(); 

		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		
		System.out.println("**********");
        
		// Only Car and parent class methods will be called 
		Car d= new Car();
		d.start();
		d.stop();
		d.refuel();
		d.engine();
		
		System.out.println("**********");
        // DYNAMIC polymorphism -- runtime polymorphism
		// Child class object with parent class reference variable
		// Only overriden method from child class will be called
		// And remaining parent class methods will be called 
		Car c= new BMW(); // TOP CASTING
		c.start();
		c.stop();
		c.refuel();
		d.engine();
		
		System.out.println("**********");
		
		BMW e=(BMW) new Car(); // DOWN CASTING -- not allowed
		
		// by type casting with BMW still give exception
		// ClasscastException

		
		
		
	}

}
