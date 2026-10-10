package methods;

public class BankAccount {
	String accountType;
    int balance;

    // கன்ஸ்ட்ரக்டர் 1: வெறும் அக்கவுண்ட் டைப் மட்டும் வந்தால்
    public BankAccount(String accountType) {
    	this("Savings",100000);
        this.accountType = accountType;
        System.out.println(this.accountType);
    }

    // கன்ஸ்ட்ரக்டர் 2: அக்கவுண்ட் டைப் மற்றும் பேலன்ஸ் இரண்டுமே வந்தால்
    public BankAccount(String accountType, int balance) {
        // 🌟 மேஜிக்: கன்ஸ்ட்ரக்டர் 1-ஐ இங்கே கட்டாயமாக அழைக்க 'this()' பயன்படுகிறது!
        //this(accountType); 
    	this.accountType=accountType;
        this.balance = balance;
        System.out.println(this.accountType + this.balance);
    }
    public static void main(String[] args) {
		BankAccount ba = new BankAccount("Savings");
	}
}
