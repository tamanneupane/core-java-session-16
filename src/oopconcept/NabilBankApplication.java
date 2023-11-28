package oopconcept;

public class NabilBankApplication {

    public static void main(String[] args) {

        BankAccount tamanAccount = new BankAccount();

//        tamanAccount.accountHolderName = "Taman Neupane";
        tamanAccount.setAccountHolderName("Taman Neupane");

//        tamanAccount.accountNumber = "123456789";
        tamanAccount.setAccountNumber("123456789");

//        tamanAccount.accountHolderGender = Gender.MALE;
        tamanAccount.setAccountHolderGender(Gender.MALE);

        tamanAccount.setSocialSecurityNumber("123456789");

        System.out.println(tamanAccount.getPublicSocialSecurityNumber());

        BankAccount abcAccount = new BankAccount();

//        abcAccount.accountHolderName = "ABC Neupane";
        abcAccount.setAccountHolderName("ABC Neupane");

//        abcAccount.accountNumber = "987654321";
//        abcAccount.accountHolderGender = Gender.PREFER_NOT_TO_SAY;

        String ahn = tamanAccount.getAccountHolderName();
        String ahn1 = abcAccount.getAccountHolderName();

        System.out.println(ahn);
    }
}
