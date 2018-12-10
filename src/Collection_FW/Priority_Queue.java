package Collection_FW;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		
		// null value not allowed
		// not thread safe . non synchronized
		// duplicate values are not allowed 
		// works like FIFO (First in First out)

		PriorityQueue p= new PriorityQueue<>();
		
		p.add("C");
		p.offer("A");
		p.add("D");
		p.offer("B");
		
		System.out.println(p);
		
		// Will store in any order
		// but deletes in natural sorting  order
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		
		
		
	}

}
