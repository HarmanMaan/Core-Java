package Collection_FW;

import java.util.Comparator;

class Comparator_Book implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Book book1 = (Book) o1;
		Book book2 = (Book) o2;

		if (book1.price > book2.price) {
			return 1;
		} else {
			return -1;
		}

	}

}
