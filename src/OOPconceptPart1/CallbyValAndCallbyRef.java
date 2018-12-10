package OOPconceptPart1;

public class CallbyValAndCallbyRef {

	int p;
	int q;

	public static void main(String[] args) {

		CallbyValAndCallbyRef obj = new CallbyValAndCallbyRef();

		int j = obj.Sum(10, 20);
		System.out.println(j);

		int x = 40;
		int y = 30;
		int k = obj.Sum(x, y); // Call by value OR passing value
		System.out.println(k);

		System.out.println("*************");

		obj.p = 50;
		obj.q = 60;
		System.out.println(obj.p); // 50
		System.out.println(obj.q); // 60

		System.out.println("*************");

		obj.swap(obj);
		System.out.println(obj.p); // 60
		System.out.println(obj.q); // 50

	}

	public int Sum(int a, int b) {
		int c = a + b;

		return c;

	}

	public void swap(CallbyValAndCallbyRef t) { // Call by reference
		int temp;
		temp = t.p; // temp = 50
		t.p = t.q; // t.p = 60
		t.q = temp; // t.q = 50

	}

}
