package OOPconceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading s = new MethodOverloading();

		s.sum();
		s.sum(10);
		s.sum(10, 15);

	}

	// Method overloading -- same name diff. parameters/arguments -- same class
	// we cannot create method inside method
	// duplicate methods i.e. same name same arguments not allowed
	// we can overlaod main method also

	public void sum() {
		System.out.println("sum method -- No paramerters");
	}

	public void sum(int i) {
		System.out.println("sum method -- One parameter");
		System.out.println(i);
	}

	public void sum(int j, int k) {
		System.out.println("sum method -- Two parameters");
		System.out.println(j + k);
	}
}
