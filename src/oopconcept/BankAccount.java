package oopconcept;

public class BankAccount {

    // States

    // Account Holder Name - String - variable
    String accountHolderName;

    // Account Number - String - variable
    String accountNumber;

    // Account Balance - double - variable
    double accountBalance;

    // Routing Number - String - variable
    String routingNumber;

    // SSN - String - variable
    String socialSecurityNumber;

    // Account Holder Address - String - variable
    String accountHolderAddress;

    // Account Holder DOB - String - variable
    String accountHolderDOB;

    // Account Holder Gender - String - variable
    String accountHolderGender;

    // Account Holder Phone Number - String - variable
    String accountHolderPhoneNumber;

    // Account Holder Email - String - variable
    String accountHolderEmail;

    // is Minor Account - boolean - variable
    boolean isMinorAccount;

    // Bank Name - String - Constant (If we are just talking about single bank)
    final String BANK_NAME = "NABIL";

    // Behaviour

    public static void main(String[] args) {

        new BankAccount();

        new BankAccount();

    }


}
