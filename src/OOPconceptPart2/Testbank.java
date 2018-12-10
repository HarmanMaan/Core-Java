package OOPconceptPart2;

public class Testbank {

	public static void main(String[] args) {

		// we cannot create object of interface
		// by creating child class object all methods of interfaces can be accessed

		System.out.println(USbank.min_bal); // we access the variable of interface

		// USbank.min_bal = 200; But cannot change value
		// its final/static by nature

		System.out.println("******************");

		HSBCbank b = new HSBCbank(); // static polymorphism

		b.credit();
		b.debit();
		b.transfermoney();
		b.educationloan();
		b.carlaon();

		System.out.println("******************");

		// only overridden methods can be accessed
		// When we take reference of interface
		USbank u = new HSBCbank(); // dynamic polymorphism
		u.credit();
		u.debit();
		u.transfermoney();

	}

}
