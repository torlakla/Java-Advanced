package Lab.DefiningClasses.BankAccount_03;

public class BankAccount {

    private static int accountCount=1;
    private static double interestRate=0.02;

    private int id;
    private double balance;

    public BankAccount(){
        this.id=accountCount;
        accountCount++;
    }

    public static void setInterestRate(double interestRate){
        BankAccount.interestRate=interestRate;
    }
    public double getInterest(int years){
        return this.balance*interestRate*years;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }




    public int getId() {
        return id;
    }
    public boolean isValid(int id){
        return id<=accountCount;
    }


}


