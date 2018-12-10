package java_Interview_2;

import java.util.ArrayList;
import java.util.Collections;


public class Reverse_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		System.out.println("Before reversing : "+ar);
        Collections.reverse(ar);
		System.out.println("After reversing : "+ar);
		
	}

}
