package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CArrayListClass {
	public static void main(String[] args) {
		List <String>l=new ArrayList<String>();
		l.add("Dineshkumar");
		l.add("Aadhira");
		l.add("Ramya");
		l.add("Thangavelu");
		l.add("Maheswari");
		l.add("Dineshkumar");
		System.out.println(l);
		System.out.println(l.get(4));
		System.out.println(l.indexOf("Dineshkumar"));
		System.out.println(l.lastIndexOf("Dineshkumar"));
		
		List<String>anotherList = new ArrayList<String>();
		anotherList.addAll(l);
		System.out.println(anotherList);
		anotherList.add("Hello Automation Test Engineer");
		anotherList.clear();
		System.out.println(anotherList);
		l.remove(l.lastIndexOf("Dineshkumar"));
		//l.remove(l.get(0));
		System.out.println(l);
		l.add(0, "Aadhira Chellam");
		System.out.println(l);
		
		System.out.println("*******************************************************************");
		//iteration using foreach loop
		for(String s:l) {
			System.out.println(s);
		}
		//iterate using for loop
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("**********************************************************************");
		//iterate using list iterator
		ListIterator iterator= l.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("***************************Reverse*******************************************");
		//iterate using reverse list iterator
				//ListIterator iterator1= l.listIterator();
				while(iterator.hasPrevious()) {
					System.out.println(iterator.previous());
				}
				System.out.println("*******************Iterator****************");
				Iterator<String> iterate = l.iterator();
				while(iterate.hasNext()) {
					System.out.println(iterate.next());
				}
	}
}
