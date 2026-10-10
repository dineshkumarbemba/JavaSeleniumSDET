package collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CTreeMapClass {
	public static void main(String[] args) {
		Map<Integer,String>m = new TreeMap<Integer,String>();
		m.put(9500,"Dineshkumar Thangavelu Senior Associate");
		m.put(52107621, "Dineshkumar T Senior Test Engineer");
		m.put(5602676, "Dinesh CUB");
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
	Set<Entry<Integer,String>>entryS=m.entrySet();
	for(Entry<Integer,String>a:entryS) {
		System.out.println(a);
		//System.out.println(a.getKey());
		//System.out.println(a.getValue());
	}
	
	}
}
