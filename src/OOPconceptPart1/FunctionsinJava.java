package OOPconceptPart1;

public class FunctionsinJava {

	// non - static methods

	// void -- does not return any value
	// return type -- void
	public void test() { // no input , no output
		System.out.println("Test method");
	}

	// return type -- int
	public int pqr() {// no input , some output
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a + b;

		return c;
	}

	// return type -- String
	public String qa() {// no input , some output
		System.out.println("QA method");
		String s = "Selenium";

		return s;
	}

	// return type -- int
	// x, y -- input parameters/arguments
	public int division(int x, int y) { // some input , some output
		System.out.println("Division methid");
		int z = x / y;

		return z;

	}

	// main method -- this is the execution point of the class
	public static void main(String[] args) {

		FunctionsinJava f = new FunctionsinJava();
		// one object is created, f is the reference variable of the object
		// And copy of all non static methods will be given ot the object f.

		f.test();

		int d = f.pqr();
		System.out.println(d);

		String t = f.qa();
		System.out.println(t);

		int w = f.division(30, 10);
		System.out.println(w);

		// main method is void never returns any value
	}
}
