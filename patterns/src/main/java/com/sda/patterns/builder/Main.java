package com.sda.patterns.builder;


public class Main {

    public static void main(String[] args) {
        BankAccount accountBgd = new BankAccount(123, "Bogdan", 100.00);
        BankAccount accountLev = new BankAccount(124, "Levi", 10000);

        BankAccount accountAna = new BankAccount(125, "Ana", 10000, "ING", 1.2);

        BankAccount account2 = new BankAccount.Builder()
                .withOwner("Marge")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();
        
        System.out.println(accountBgd);
    }


}
