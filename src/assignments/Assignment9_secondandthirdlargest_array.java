package assignments;

public class Assignment9_secondandthirdlargest_array {
public static void main(String[] args) {
	int initial[]= {12,34,11,36,87,98,93};
	int temp=0;
	
	for(int i=0;i<initial.length;i++) {
		for(int j=i+1;j<initial.length;j++) {
			if(initial[i]<initial[j]) {
				temp = initial[i];     // Store array[i] in temp
				initial[i] = initial[j]; // Replace array[i] with array[j]
				initial[j] = temp;
			}
		}
		System.out.print(initial[i] +" ");
	}
	System.out.println();
	System.out.println("Second largest no is :"+ initial[1]);
	System.out.println("Third Largest no is : "+ initial[2]);
}
}
