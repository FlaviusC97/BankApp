package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankApp {
    public static void main(String[] args) {


//        Checking chkacc1 = new Checking("Popa Alexandru","439234850", 1500);
//
//        Savings savacc1 = new Savings("Popescu Pavel","234857120", 500);
//
//
//        savacc1.compound();
//        System.out.println("**************");
//        savacc1.showInfo();
//        System.out.println("**************");
//        chkacc1.showInfo();


    List<Account> accounts = new LinkedList<Account>();

    // Read a CSV file then create new accounts based on that data
        String file = "C:\\Users\\Flavius\\Downloads\\NewBankAccounts.csv";
    List<String[]> newAccountHolder = utilities.CSV.read(file);
    for (String[] accountHolders : newAccountHolder) {
        String name = accountHolders[0];
        String sSN = accountHolders[1];
        String accountType = accountHolders[2];
        double initDeposit = Double.parseDouble(accountHolders[3]);
        System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);

        if(accountType.equals("Savings")) {
            System.out.println("Open a savings account");
            accounts.add(new Savings(name, sSN, initDeposit));
        } else if (accountType.equals("Checking")) {
            System.out.println("Open a checking account");
            accounts.add(new Checking(name, sSN, initDeposit));
        } else {
            System.out.println("Error reading account type");
        }
    }

    for(Account acc : accounts) {
        System.out.println("\n********************************");
        acc.showInfo();
    }




    }
}
