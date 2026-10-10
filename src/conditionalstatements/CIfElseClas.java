package conditionalstatements;

public class CIfElseClas {
public static void main(String[] args) {
	boolean rajiniMovieTicketAvailable=false;
	boolean sivaMovieTicketAvailable=false;
	boolean pradeepMovieTicketAvailable=true;
	boolean balconyAvailable=false;
	boolean firstClassAvailable=true;
	boolean frontrowAvailable=true;
	if(rajiniMovieTicketAvailable) {
		if(balconyAvailable) {
			System.out.println("Book Balcony ticket and enjoy the movie");
		}else if(firstClassAvailable){
			System.out.println("Atleast First class abailable watch movie in firstclass");
		}else {
			System.out.println(frontrowAvailable+"atleast you have first day first show movie ticket you can enjoy the thalaivar show");
		}
	}else if(sivaMovieTicketAvailable) {
		if(balconyAvailable) {
			System.out.println("Book Balcony ticket and enjoy the movie");
		}else if(firstClassAvailable){
			System.out.println("Atleast First class abailable watch movie in firstclass");
		}else {
			System.out.println(frontrowAvailable+"atleast you have first day first show movie ticket you can enjoy the sivakarthikeyan show");
		}
	}else if(pradeepMovieTicketAvailable) {
		if(balconyAvailable) {
			System.out.println("Book Balcony ticket and enjoy the movie");
		}else if(firstClassAvailable){
			System.out.println("Atleast First class abailable watch movie in firstclass");
		}else {
			System.out.println(frontrowAvailable+"atleast you have first day first show movie ticket you can enjoy the pradeepranganathan show");
		}
	}else {
		System.out.println("Go to restaurant and have nice food and go to home and watch some insta reels and sleep.");
	}
	
	System.out.println("===============================================================");
	
	String env="    QA    ";
	switch(env.toLowerCase().trim()) {
	case "uat":
		System.out.println("Launch application in UAT env");
		break;
		
	case "qa":
		System.out.println("Launch application in qa env");
		break;
		
	case "stage":
		System.out.println("Launch appliation in stage env");
		break;
		
		default :
			System.out.println("Please pass the Right Env");
			break;
	}
}
}
