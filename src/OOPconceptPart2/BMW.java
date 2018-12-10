package OOPconceptPart2;

public class BMW extends Car { // has-a relationship
	
	// method overriding : when same method is present parent class and child class
	// with same name and same number of arguments
	// A class can extend only one class only
	
	public void start() {
		
		System.out.println("BMW----start");
	}
	
	public void theftsafety() {
		
		System.out.println("BMW----theftsafety");
	}

}
