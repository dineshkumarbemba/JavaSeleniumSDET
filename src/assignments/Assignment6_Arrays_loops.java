package assignments;

public class Assignment6_Arrays_loops {
public static void main(String[] args) {
	String studentNames[]={"Suresh","Mahesh","Naresh"};
	int studentMarks[]= {75,80,82};
	int updatedMarks[]= new int [studentMarks.length];
	int average = 0;
	for(int i=0;i<studentMarks.length;i++) {
		updatedMarks[i]=studentMarks[i]+10;
		System.out.println(studentNames[i]+":"+updatedMarks[i]);
		
		average+=(updatedMarks[i])/studentMarks.length;
	}
	System.out.println(average);
}
}
