package bankaccountapp;

public class Savings extends Account {
    // List properties specific to the Savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize settings for the Savings properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox () {
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10 , 3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10 , 4));
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    // List any methods specific to savings account

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Savings Account Features: " +
                "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                "\nSafety Deposit Box Key: " + safetyDepositBoxKey);
    }

}
