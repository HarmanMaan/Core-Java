package Collection_FW;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_Book {

	public static void main(String[] args) {

		Book b1 = new Book("PHP ", 200);
		Book b2 = new Book("JAVA", 400);
		Book b3 = new Book("SQL ", 300);

		TreeSet t = new TreeSet(new Comparator_Book());

		t.add(b1);
		t.add(b2);
		t.add(b3);

		Iterator<Book> it = t.iterator();
		while (it.hasNext()) {

			Book b = (Book) it.next();
			System.out.println(b.getTitle() + "  " + b.getPrice());

		}

	}

}
