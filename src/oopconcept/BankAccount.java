package oopconcept;

public class BankAccount {

    // States

    // Account Holder Name - String - variable
    private String accountHolderName;

    // Account Number - String - variable
    private String accountNumber;

    private String accountType;

    // Account Balance - double - variable
    private double accountBalance;

    // Routing Number - String - variable
    private String routingNumber;

    // SSN - String - variable
    private String socialSecurityNumber;

    // Account Holder Address - String - variable
    private String accountHolderAddress;

    // Account Holder DOB - String - variable
    private String accountHolderDOB;

    // Account Holder Gender - String - variable
    private Gender accountHolderGender;

    // Account Holder Phone Number - String - variable
    private String accountHolderPhoneNumber;

    // Account Holder Email - String - variable
    private String accountHolderEmail;

    // is Minor Account - boolean - variable
    private boolean isMinorAccount;

    // Bank Name - String - Constant (If we are just talking about single bank)
    private final String BANK_NAME = "NABIL Bank Limited";

    // Behaviour

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName =  accountHolderName;
    }

    public String getAccountHolderName(){
        return this.accountHolderName;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountHolderGender(Gender accountHolderGender){
        this.accountHolderGender = accountHolderGender;
    }

    public Gender getAccountHolderGender(){
        return this.accountHolderGender;
    }


}
