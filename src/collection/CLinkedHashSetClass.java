package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CLinkedHashSetClass {
	public static void main(String[] args) {
		Set <String>l=new LinkedHashSet<String>();
		l.add("Dineshkumar");
		l.add("Aadhira");
		l.add("Ramya");
		l.add("Thangavelu");
		l.add("Maheswari");
		//l.add("Dineshkumar");
		System.out.println(l);
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
