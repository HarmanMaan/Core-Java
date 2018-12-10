package OOPconceptPart1;

public class StaticNonStaticConcept {

	// global variables will be available across all methods
	String name = "Tom"; // non- static global var.
	static int age = 24; // static global var.

	public static void main(String[] args) {

		// Calling static methods and variables
		// 1 -- calling directly
		Sum2();

		System.out.println(age);

		// 2 -- calling by classname
		StaticNonStaticConcept.Sum2();

		System.out.println(StaticNonStaticConcept.age);

		// calling non-static methods and variables
		StaticNonStaticConcept obj = new StaticNonStaticConcept();

		obj.sum1();
		System.out.println(obj.name);

		// we can access static methods by object reference
		obj.Sum2(); // But not good practice -- gives warning

	}

	public void sum1() { // non- static method
		System.out.println("Sum1 non-static method");

	}

	public static void Sum2() { // static method
		System.out.println("Sum2 static method");

	}
}
