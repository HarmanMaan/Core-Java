package Collection_FW;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Emp {

	public static void main(String[] args) {

		Emp e1 = new Emp("Naveen", 32, "QA");
		Emp e2 = new Emp("Mukesh", 35, "Selenium");
		Emp e3 = new Emp("Parker", 23, "JAVA");

		ArrayList<Emp> al = new ArrayList<Emp>();

		al.add(e1);
		al.add(e2);
		al.add(e3);

		// Iterator to traverse the values

		Iterator<Emp> it = al.iterator();
		while (it.hasNext()) {

			Emp e = it.next();

			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.dept);
		}
		
		System.out.println("**********************");

		Iterator<Emp> it1 = al.iterator();
		while (it1.hasNext()) {

			Emp e = it1.next();

			System.out.println(e.name + "  " + e.age + "  " + e.dept);
		}

	}

}
