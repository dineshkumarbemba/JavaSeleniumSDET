package assignments;

public class Assignment7_IfElse_LoanEligibility {
	public static void main(String[] args) {
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;

		if(creditScore>750) {
			System.out.println(customerName +"Your loan is approved since your credit score is >750");
		}else if(creditScore>650 && creditScore<750) {
			if(income>50000) {
				if(isEmployed) {
					if(debtToIncomeRatio<40) {
						System.out.println(customerName+"Your loan is approved since you meet all the elligible criteria");
					}else {
						System.out.println(customerName +"Loan Denied since  your DebtToIncomeRatio is greater than 40%");
					}
				}else {
					System.out.println(customerName +"Loan Denied since your are not employed");
				}
			}else {
				System.out.println(customerName +"Loan Denied since your income is less tha 50000");
			}
		}else {
			System.out.println(customerName +"Loan Denied since your credit score is less than 650");
		}
	}
}
