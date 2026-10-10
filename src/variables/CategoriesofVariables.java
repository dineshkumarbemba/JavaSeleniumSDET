package variables;

public class CategoriesofVariables {
	
	 String name="Dineshkumar"; //instance variable
public static void sumOfNumbers(int a,int b) {
	int sum=(a+b);
	System.out.println(sum);
	String name1="Helo";
}

public static void main(String[] args) {
	CategoriesofVariables c= new CategoriesofVariables();
	sumOfNumbers(100, 100000);
	System.out.println(c.name);
}
}
