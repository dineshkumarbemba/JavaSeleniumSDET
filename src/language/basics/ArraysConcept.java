package language.basics;

import java.util.Arrays;

public class ArraysConcept {
public static void main(String[] args) {
	int a[]= new int[4];
	a[0]=100;
	a[1]=200;
	a[2]=300;
	//a[3]=400;
	
	System.out.println(Arrays.toString(a));
	for(int value:a) {
		System.out.println(value);
	}
	for(int i=0;i<a.length;i++) {
		System.out.println("INDEX POSITION :"+i+"Values of Indes Position :"+a[i]);
	} 
	
	System.out.println("***********************************");
	
	int b[][]= {{1,2,3},{2,3,4},{3,4,5}};
	
	for(int k=0;k<b.length;k++) {
		for(int l=0;l<b[k].length;l++) {
			System.out.print(b[k][l]+ " ");
		}
			System.out.println();
			
		}
	}
	
}

