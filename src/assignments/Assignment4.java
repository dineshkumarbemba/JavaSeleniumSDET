package assignments;

import java.util.LinkedList;
import java.util.List;

public class Assignment4 {
public static void main(String[] args) {
	List<Double>area = new LinkedList<Double>();
	area.add(1234.0);
	area.add(2344.23);
	area.add(3455.9);
	area.add(4566.9);
	area.add(5677.9);
	double totalArea=area.get(2)+area.get(3);
	System.out.println(totalArea);
	//2
	List<String>cities= new LinkedList<String>();
	cities.add("Salem");
	cities.add("Sabarimala");
	cities.add("Tirumala");
	cities.add("Chennai");
	cities.add("Bengaluru");
	cities.add("Tiruvannamalai");
	cities.add("Vilupuram");
	cities.add("Trichy");
	cities.add("Erode");
	cities.add("Coimbatore");
	System.out.println(cities);
	System.out.println(cities.size());
	//3
	
	int averageNum[]= {100,200,300,400,500,600,700,800,900,1000};
	int average=(averageNum[4]+averageNum[5])/2;
	System.out.println(average);
	
	
	
}
}
