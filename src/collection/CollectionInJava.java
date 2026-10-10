package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionInJava{
public static void main(String[] args) {
	List <String>l=new ArrayList<String>();
	l.add("Dineshkumar");
	l.add("Aadhira");
	l.add("Ramya");
	l.add("Thangavelu");
	l.add("Maheswari");
	System.out.println(l);
	System.out.println(l.size());
	System.out.println(l.get(3));
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
}
}
