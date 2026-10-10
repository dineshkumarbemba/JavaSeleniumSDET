package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CTreeSetClas {
	public static void main(String[] args) {
		Set <String>l=new TreeSet<String>();
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
