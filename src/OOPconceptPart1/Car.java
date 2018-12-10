package OOPconceptPart1;

public class Car {

	// Class variables
	int model;
	int wheel;

	public static void main(String[] args) {

		// new Car() : is object of the Car Class
		// new keyword : is used to create the object of a class
		// a,b,c : are the object reference variables

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();

		a.model = 2015;
		a.wheel = 4;

		b.model = 2018;
		b.wheel = 4;

		c.model = 2016;
		c.wheel = 4;

		System.out.println(a.model);
		System.out.println(a.wheel);

		System.out.println(b.model);
		System.out.println(b.wheel);

		System.out.println(c.model);
		System.out.println(c.wheel);

		System.out.println("After swaping the variables"); // After shifting the references

		a = b;
		b = c;
		c = a;

		a.model = 10;
		System.out.println(a.model); // 10
		c.model = 20;
		System.out.println(a.model); // 20
		System.out.println(c.model); // 20

	}

}
