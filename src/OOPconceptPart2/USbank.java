package OOPconceptPart2;

public interface USbank {

	int min_bal = 100;

	public void credit();

	public void debit();

	public void transfermoney();

	// only method declaration -- no method body -- prototype
	// In interface all variables are by default static by nature
	// Value of variables cannot be changed
	// No main method in interface
	// we cannot create the object of the interface
	// interfaces re abstract in nature
}
