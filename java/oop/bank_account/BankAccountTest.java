public class BankAccountTest{
    public static void main(String[] args){
        String checking = "checking"; 
        String savings = "savings";


        BankAccount member1 = new BankAccount();
        member1.welcome();
        System.out.println("*-----New Transaction-----*");
        member1.balanceOfAccounts();
        System.out.println("*-----End of Transaction-----*" + "\n");

        System.out.println("*-----New Transaction-----*");
        member1.depositFunds(checking, 30.15);
        member1.balanceOfAccounts();
        System.out.println("*-----End of Transaction-----*" + "\n");

        System.out.println("*-----New Transaction-----*");
        member1.withdrawFunds(checking, 10.00);
        member1.balanceOfAccounts();
        System.out.println("*-----End of Transaction-----*" + "\n");

        System.out.println("*-----New Transaction-----*");
        member1.withdrawFunds(savings, 10.00);
        member1.balanceOfAccounts();
        System.out.println("*-----End of Transaction-----*" + "\n");



        BankAccount member2 = new BankAccount();
        member2.welcome();
        System.out.println("*-----New Transaction-----*");
        member2.balanceOfAccounts();
        System.out.println("*-----End of Transaction-----*" + "\n");

        System.out.println("*-----New Transaction-----*");
        member2.depositFunds(checking, 200.15);
        member2.balanceOfAccounts();
        System.out.println("*-----End of Transaction-----*" + "\n");

        System.out.println("*-----New Transaction-----*");
        member2.withdrawFunds(checking, 1000.00);
        member2.balanceOfAccounts();
        System.out.println("*-----End of Transaction-----*" + "\n");

        System.out.println("*-----New Transaction-----*");
        member2.withdrawFunds(savings, 100.00);
        member2.balanceOfAccounts();
        System.out.println("*-----End of Transaction-----*" + "\n");
    }
}