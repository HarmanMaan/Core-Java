package OOPconceptPart1;

public class LocalVsGlobalVariables {

	// Global Variables
	String name = "Harman";
	int age = 25;

	public static void main(String[] args) {

		// Local variables
		String name1 = "Tom";
		int age1 = 35;

		// We can access local variables directly
		System.out.println(name1);
		System.out.println(age1);
		// System.out.println(name); // But not Global variables

		System.out.println("************************");

		// We have to create object to access global variables
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();

		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.test();

	}

	public void test() {
		System.out.println("************************");
        int a = 10;
		int b = 20;
		String name = "Hello World"; // local variable of test method
		System.out.println(a + b);
		System.out.println(name);

	}
}
