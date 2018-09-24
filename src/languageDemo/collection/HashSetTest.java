package languageDemo.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(3);
		hs.add(2);
		Iterator it = hs.iterator();
		//int i = (int)it.next();
		System.out.println((int)it.next());
		System.out.println((int)it.next());
		System.out.println((int)it.next());
	}

}
