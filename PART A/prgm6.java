import java.util.*;

class demonetization extends Exception {
    float amt;

    demonetization(float a) {
        amt = a;
    }

    public String toString() {
        return ("Deposit of old currency of Rs." + amt + " crosses the Rs.5,000 limit");
    }
}

class Account {
    float balance, dep;

    Account() {
        balance = 0;
    }

    void deposit(float dep, String type) {
        try {
            if (type.equals("NEW")) {
                balance += dep;
                System.out.println("Amount of Rs." + dep + " successfully deposited.");
            } else {
                if (dep <= 5000) {
                    balance += dep;
                    System.out.println("Amount of Rs." + dep + " successfully deposited.");
                } else {
                    throw new demonetization(dep);
                }
            }
        } catch (demonetization e) {
            System.out.println("" + e);
        }
    }

    void withdraw(float a) {
        if (balance - a >= 500) {
            System.out.println("Amount of Rs." + a + " successfully withdrawn");
            balance -= a;
        } else {
            System.out.println("Withdrawal of Rs." + a + " leads to low balance!!! Failed....");
        }
    }

    void currbal() {
        System.out.println("The current account balance is Rs." + balance);
    }
}

public class prgm6{
    public static void main(String[] args){
        int ch;
        Scanner in=new Scanner(System.in);
        Account a=new Account();
        while(true){
            System.out.print("\n1. Deposit\n2. Withdraw\n3.Current balance\n4.Exit\nEnter your choice: ");
            ch=in.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter the amount to be deposited: ");
                    float x=in.nextFloat();
                    System.out.print("Enter the type of currency: ");
                    String type=in.next();
                    a.deposit(x,type.toUpperCase());
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount: ");
                    x=in.nextFloat();
                    a.withdraw(x);
                    break;
                case 3:
                    a.currbal();
                    break;
                default: System.exit(0);
            }
        }
    }
}
