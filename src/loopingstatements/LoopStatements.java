package loopingstatements;

public class LoopStatements {
public static void main(String [] args) {
	String name="Aadhira";
	for(int i=0;i<=100000;i++) {
		System.out.println(name);
	}
	
	System.out.println("*****************************************************************");
	
	int num=1;
	while(num>0) {
		if(num>5) {
			break;
		}
		System.out.println("Hey welcome to the wolrd of Automation");
		num++;
	}
	
	System.out.println("*************************************************************************");
	
	int num1=1;
	do {
		if(num1>=5) {
		break;
		}
		System.out.println("Hey Automation Tester");
		num1++;
	}while(num1>0);
	
	System.out.println("************************************************************************");
	
	String veluFamily[]= {"Thangavelu","Maheswari","Dineshkumar","SowmiaDevi","Ramya","Aadhira","DevaKannan","SubhaNila"};
	for(String a:veluFamily) {
		System.out.println(a);
	
	}
	
}
}
