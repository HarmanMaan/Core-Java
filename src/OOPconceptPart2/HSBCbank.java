package OOPconceptPart2;

public class HSBCbank implements USbank {

	// we have to give body to all interface overridden methods
	// if a class implements any interface
	// then is mandatory to define all interface

	public void credit() {

		System.out.println("HSBC----credit");
	}

	public void debit() {

		System.out.println("HSBC----debit");
	}

	public void transfermoney() {

		System.out.println("HSBC----transfermoney");
	}

	// HSBC class own methods

	public void educationloan() {

		System.out.println("HSBC--education loan");
	}

	public void carlaon() {

		System.out.println("HSBC--car loan");
	}

}
