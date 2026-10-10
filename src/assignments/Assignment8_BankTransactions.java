package assignments;

public class Assignment8_BankTransactions {
public static void main(String[] args) {
	int bankTransactions[]= {50000,-2000,3000,-15000,-200,-300,4000,-3000};
	int totalCreditTransactions=0;
	int totalCreditTransactionAmount=0;
	int totalCreditSuspeciousTransactions=0;
	int totalCreditSuspeciousTransactionAmount=0;
	int totalDebitTransactions=0;
	int totalDebitTransactionAmount=0;
	int totalDebitSuspeciousTransactions=0;
	int totalDebitSuspeciousTransactionAmount=0;
	
	for(int i=0;i<bankTransactions.length;i++) {
		if(bankTransactions[i]>0) {
			totalCreditTransactions++;
			totalCreditTransactionAmount+=bankTransactions[i];
			if(bankTransactions[i]>10000) {
				totalCreditSuspeciousTransactions++;
				totalCreditSuspeciousTransactionAmount+=bankTransactions[i];				
			}			
		}else {
			totalDebitTransactions++;
			totalDebitTransactionAmount+=bankTransactions[i];
			if(bankTransactions[i]<-10000) {
				totalDebitSuspeciousTransactions++;
				totalDebitSuspeciousTransactionAmount+=bankTransactions[i];				
			}			
		}
			}
	System.out.println( totalCreditTransactions);
	System.out.println( totalCreditTransactionAmount);
	System.out.println(totalCreditSuspeciousTransactions);
	System.out.println( totalCreditSuspeciousTransactionAmount);
	System.out.println( totalDebitTransactions);
	System.out.println(totalDebitTransactionAmount);
	System.out.println(totalDebitSuspeciousTransactions);
	System.out.println( totalDebitSuspeciousTransactionAmount);
}
}
