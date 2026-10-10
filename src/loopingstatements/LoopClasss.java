package loopingstatements;

public class LoopClasss {
public static void main(String[] args) {
	int i=1;
	while(i<=100) {
		if(i%2==0) {
			System.out.println(i+" Is a Even Number");
		}else {
			System.out.println(i+" Is a Odd Number");
		}
		System.out.println(i);
		i++;
	}
	
	for(char ch='a';ch<='z';ch++) {
		System.out.println(ch +" ");
	}
	int k=1;
	do {
		System.out.println("Welcome to World of Automation Testing" + k);
		k++;
	}while(k<=10);
	
	for(int m=0;m<=4;m++) {
		for(int n=0;n<=3;n++) {
			for(int o=0;o<=2;o++) {
				System.out.print(m+""+n+""+o+""+" ");
			}
		}System.out.println();
		
	}
}
}
