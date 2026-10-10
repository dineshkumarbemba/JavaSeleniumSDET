package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CHashSetClass {
	public static void main(String[] args) {
		Set <String>l=new HashSet<String>();
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
