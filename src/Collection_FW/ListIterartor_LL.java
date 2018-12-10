package Collection_FW;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterartor_LL {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add("PHP");
		ll.add("JAVA");
		ll.add("ROR");
		ll.add("Python");

		System.out.println(ll);

		System.out.println("*************************************");
		
		// Listiterator is used for all list classes
		// Its bi-directional 
		// It has more flexibility than Enumeration and Iterator
		// it has add, remove , set etc 

		ListIterator lit = ll.listIterator();
		while (lit.hasNext()) {

			String s = (String) lit.next();
		}
		System.out.println(ll);

		System.out.println("*************************************");

		ListIterator lit1 = ll.listIterator();
		while (lit1.hasNext()) {

			String s = (String) lit1.next();
			if (s.equalsIgnoreCase("PHP"))
				lit1.remove();
			else if (s.equalsIgnoreCase("JAVA"))
				lit1.set("JAVA SE");
			else if (s.equalsIgnoreCase("ROR"))
				lit1.add("SQL");
		}
		System.out.println(ll);

	}

}
