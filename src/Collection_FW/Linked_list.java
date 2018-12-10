package Collection_FW;

import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {

		LinkedList ll= new LinkedList();
		
		ll.addFirst("First"); // add element at beggining of the list
		ll.addLast("Last"); // add element at last of the list
		ll.add(0, "Index 0"); 
		ll.add(1, "Index 1");
		ll.add(2, "Index 2");
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));

	}

}
