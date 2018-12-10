package Collection_FW;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Enumeration {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement("One");
		v.addElement("Two");
		v.addElement("Three");
		v.addElement("four");

		System.out.println(v.size());

		System.out.println(v);

		System.out.println("*******************");

		// Using enumeration cursor
		// Only for Vector and Stack

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {

			String s = (String) e.nextElement();
			System.out.println(s);
		}

		System.out.println("*******************");

		Enumeration e1 = v.elements();
		while (e1.hasMoreElements()) {

			String s = (String) e1.nextElement();
			System.out.println(s + " " + s.length());
		}

		System.out.println("*******************");
		v.add("One");
		v.add("Two");
		v.add("Three");
		v.add("four");

		System.out.println(v.size());

		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));

	}

}
