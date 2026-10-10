package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CHashMapClass {
public static void main(String[] args) {
	Map<Integer,String>m = new HashMap<Integer,String>();
	m.put(9500,"Dineshkumar Thangavelu Senior Associate");
	m.put(52107621, "Dineshkumar T Senior Test Engineer");
	m.put(5602676, "Dinesh CUB");
	m.put(5602676, "Dinesh City Union Bank");
	System.out.println(m);
	
	Set<Integer> keySet = m.keySet();
	System.out.println(keySet);
	for(Integer a:keySet) {
		System.out.println(a);
	}
	Collection<String> values = m.values();
	System.out.println(values);
	for(String v:values) {
		System.out.println(v);
	}
	System.out.println("==============================================================");
	Set<Entry<Integer, String>> entrySet = m.entrySet();
	System.out.println(entrySet);
	for(Entry<Integer,String>k:entrySet) {
		System.out.println(k);
		//System.out.println(k.getKey());
		//System.out.println(k.getValue());
	}
}
}
