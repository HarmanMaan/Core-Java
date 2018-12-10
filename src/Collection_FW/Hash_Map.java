package Collection_FW;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {

		HashMap hm= new HashMap<>();
		
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		hm.put(null, null);
		hm.put(null, null); // second null will not be returned
		
		System.out.println(hm);
		System.out.println(hm.size());

		
	}

}
