import java.util.Scanner;

class BankAccount {
    private int balance = 6000;
    private int pin = 4321;
    private String accType = "Saving";

    private String history[] = new String[5];
    private int index = 0;

    private int transactionCount = 0;

    public boolean checkPin(int p) {
        return p == pin;
    }

    public void setAccountType(String type) {
        accType = type;
    }

    public String getAccountType() {
        return accType;
    }

    public void changePin(int oldPin, int newPin) {
        if(oldPin == pin) {
            pin = newPin;
            System.out.println("PIN changed");
        } else {
            System.out.println("Wrong old PIN");
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void deposit(int amt) {
        if(amt > 0) {
            balance += amt;
            transactionCount++;
            addHistory("Deposited " + amt);
            System.out.println("Money deposited");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(int amt) {
        if(amt > 0 && amt <= balance) {
            balance -= amt;
            transactionCount++;
            addHistory("Withdrawn " + amt);
            System.out.println("Collect your cash");
        } else {
            System.out.println("Transaction failed");
        }
    }

    public void transfer(int amt) {
        if(amt > 0 && amt <= balance) {
            balance -= amt;
            transactionCount++;
            addHistory("Transferred " + amt);
            System.out.println("Transfer done");
        } else {
            System.out.println("Transfer failed");
        }
    }

    public void showHistory() {
        System.out.println("Previous Transactions:");
        for(int i = 0; i < history.length; i++) {
            if(history[i] != null) {
                System.out.println(history[i]);
            }
        }
    }

    private void addHistory(String msg) {
        history[index % 5] = msg;
        index++;
    }
}

abstract class ATMOperations {
    abstract void deposit(BankAccount b, int amt);
    abstract void withdraw(BankAccount b, int amt);
    abstract void balance(BankAccount b);
    abstract void transfer(BankAccount b, int amt);
    abstract void statement(BankAccount b);
}

class ATMImpl extends ATMOperations {

    void deposit(BankAccount b, int amt) {
        b.deposit(amt);
    }

    void withdraw(BankAccount b, int amt) {
        b.withdraw(amt);
    }

    void balance(BankAccount b) {
        System.out.println("Balance: " + b.getBalance());
    }

    void transfer(BankAccount b, int amt) {
        b.transfer(amt);
    }

    void statement(BankAccount b) {
        b.showHistory();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount();
        ATMOperations atm = new ATMImpl();

        System.out.println("\n==================================");
        System.out.println("         WELCOME TO ATM");
        System.out.println("==================================");

        // PIN check
        int attempts = 0;
        boolean ok = false;

        while(attempts < 3) {
            System.out.print("Enter PIN: ");
            int p = sc.nextInt();

            if(acc.checkPin(p)) {
                ok = true;
                break;
            } else {
                System.out.println("Wrong PIN");
                attempts++;
            }
        }

        if(!ok) {
            System.out.println("Card blocked");
            return;
        }


        System.out.println("\nSelect Account Type:");
        System.out.println("1. Saving    2. Current");
        int type = sc.nextInt();

        if(type == 2) {
            acc.setAccountType("Current");
        } else {
            acc.setAccountType("Saving");
        }

        int ch = 0;

        while(ch != 8) {

            System.out.println("\n=========== ATM MENU ===========");
            System.out.println("Select an option:");
            System.out.println("1. Deposit        2. Withdraw");
            System.out.println("3. Balance        4. Passbook");
            System.out.println("5. Change PIN     6. Transfer");
            System.out.println("7. Account Info   8. Exit");
            System.out.println("================================");
            System.out.print("Enter choice: ");

            ch = sc.nextInt();

            switch(ch) {

                case 1:
                    System.out.println("\n--- DEPOSIT ---");
                    System.out.print("Enter amount: ");
                    atm.deposit(acc, sc.nextInt());
                    break;

                case 2:
                    System.out.println("\n--- WITHDRAW ---");
                    System.out.print("Enter amount: ");
                    atm.withdraw(acc, sc.nextInt());
                    break;

                case 3:
                    System.out.println("\n--- BALANCE ---");
                    atm.balance(acc);
                    break;

                case 4:
                    System.out.println("\n--- PASSBOOK ---");
                    atm.statement(acc);
                    break;

                case 5:
                    System.out.println("\n--- CHANGE PIN ---");

                    System.out.print("Old PIN: ");
                    int oldp = sc.nextInt();

                    System.out.print("New PIN: ");
                    int newp = sc.nextInt();

                    System.out.print("Confirm PIN: ");
                    int conf = sc.nextInt();

                    if(newp == conf) {
                        acc.changePin(oldp, newp);
                    } else {
                        System.out.println("PIN mismatch");
                    }
                    break;

                case 6:
                    System.out.println("\n--- TRANSFER ---");
                    System.out.print("Enter amount: ");
                    atm.transfer(acc, sc.nextInt());
                    break;

                case 7:
                    System.out.println("\n--- ACCOUNT INFO ---");
                    System.out.println("Account Type: " + acc.getAccountType());
                    System.out.println("Balance: " + acc.getBalance());
                    System.out.println("Transactions done: " + acc.getTransactionCount());
                    break;

                case 8:
                    System.out.print("\nPrint receipt? (1.Yes 2.No): ");
                    int n = sc.nextInt();

                    if(n == 1) {
                        System.out.println("Receipt printed");
                    }

                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}