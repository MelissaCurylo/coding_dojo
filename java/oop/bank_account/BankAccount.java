import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class BankAccount{

    // BankAccount Attributes 
    // acounts created static class member to start set to default zero - no accounts yet
    public static int totalAccountsCreated = 0;

    private String welcome = ""; 
    private String accountNumber = ""; // Converting Random generator number into string for account #
    private double checkingBalance;
    private double savingsBalance;
    // private double checkingAccount; // aligning later to add acct specific acct #
    // private double savingsAccount;  // aligning later to add acct specific acct #    



    // BankAccount Constructor 
    // set/declare based on new account features
    // ie. new accounts start with zero dollars
    public BankAccount(){      
        String accountNumber = newAccountNumber();
        totalAccountsCreated += 1; // incrementing accounts created

        // set initial balances
        double checkingBalance = 0.00;
        double savingsBalance = 0.00;

        System.out.println("Total accounts: " + totalAccountsCreated + "\n");
        System.out.println("New account number created: " + accountNumber + "\n");
    }

    // Getter/Setter for Checking balances
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance += checkingBalance;
    }


    // Getter/Setter for Savings balances
    public double getSavingsBalance(){
        return savingsBalance;
    }
    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }


    // Methods

    public String welcome(){
        
        System.out.println("***Welcome to Bank You can have Whatever You Like!***" + "\n");
        return welcome;
    }

    // Creating a new account number with Random method
    private String newAccountNumber(){
        Random rand = new Random();

        for( int i = 0; i < 10; i++ ){
            int temp = rand.nextInt(10) + 1;
            accountNumber += Integer.toString(temp);
        }  
        System.out.println(accountNumber + "\n");
        return accountNumber + welcome;
    }



    // Deposit Money Method with total amount stored for both checking and savings
    public void depositFunds(String accounts, double depositAmount){
        // System.out.println(accounts);
        if (accounts.equals("checking")){  // when comparing strings, needs to be .equals
            this.checkingBalance += depositAmount;
        }else if(accounts.equals("savings")){
            this.savingsBalance += depositAmount;
        }
    }

    // simpler method used to debug pointer null error
    // public void depositChecking(double depositAmount){
    //     this.checkingBalance += depositAmount;
    // }


    // Withdraw Money Method from Checking?savings
    public void withdrawFunds(String name, double withdrawAmount){
        if (name.equals("checking")){
            if( this.checkingBalance >= withdrawAmount) {
                this.checkingBalance -= withdrawAmount;
                System.out.println("Current Balance for " + name + " " + checkingBalance + "\n");

            }else{
                System.out.println("Insufficient Funds" + " " + withdrawAmount + " is greater than " + name +  "account balance" + " " + checkingBalance + "." + "\n");
            }

        }else if (name.equals("savings")) {
            if( this.savingsBalance >= withdrawAmount) {
                this.savingsBalance -= withdrawAmount;
                System.out.println("Current Balance for " + name + savingsBalance + "\n");

            }else{
                System.out.println("Insufficient Funds " + withdrawAmount + " is greater than " + name + " account balance" + " " + savingsBalance + "." + "\n");
            }
        }
    }


    // viewing balance of both accounts
    public void balanceOfAccounts(){
        double allAccountsBalance = checkingBalance + savingsBalance;

        System.out.println("Checking Balance: " + this.checkingBalance );
        System.out.println("Savings Balance: " + this.savingsBalance);
        System.out.println("Total Available Funds Between All Accounts: " + allAccountsBalance );
    }
}