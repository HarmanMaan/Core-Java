package OOPconceptPart1;

public class WrapperClasses {

	public static void main (String []args) {
		
		// Basically used to convert string to int
		// while using values from website to selenium
		
		// data conversion : String to int 
		String x = "100";
		System.out.println(x+20);
		
		int i= Integer.parseInt(x);
		System.out.println(i+20);
		
		String r= "100A";
		//int k= Integer.parseInt(m);
		
		// String to double
		String y="12.33";
		double d= Double.parseDouble(y);
		System.out.println(d+10);
		
		// String to boolean
		String z="true";
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
	    System.out.println("****************");
	    
	    // data conversion : int to string
	    
	    int p= 100;
	    System.out.println(p+20);
	    
	    String s= String.valueOf(p);
	    System.out.println(s+20);

	}

}
