package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class PrintStatement {
public static void main(String [] args) throws FileNotFoundException {
	System.out.println("Hello ! World....");
	System.out.print("Hi Hello");
	System.out.print(" Hi Hello");
	System.out.println();
	System.out.print("Hi Hello");
	System.out.printf("Dineshkumar completed BE MBA,Employee id is 52107621,Currently he is searching for a job");
	System.out.printf("He will definitely become SDET because of his hardwork and effort.");
	System.out.println();
	String name="Dineshkumar";
	int salary=2400000;
	System.out.printf("%s is going to get place in top mnc with salary package of %d", name,salary);
	System.out.println();
	System.err.println("Hey there is error in line no 16");
	Logger logger =Logger.getLogger("Hello world!>>");
	logger.info("Hey till line 21 everything fine its going welll");
	System.out.println();
	logger.warning("Hey Dinesh it seems there is some issue in line no 22"); 
	PrintWriter logs = new PrintWriter("Helloworld.txt");
	logs.println("Currently line no 27 executing successfully");
	logs.println("Currently line no 28 executing successfully");
	logs.println("Program is successfully completed without any issues....!");
	
	logs.close();
}
}
