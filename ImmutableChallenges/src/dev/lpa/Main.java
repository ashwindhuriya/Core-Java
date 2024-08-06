package dev.lpa;

import dev.bank.Bank;
import dev.bank.BankAccount;
import dev.bank.BankCustomer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        BankAccount account = new BankAccount(BankAccount.AccountType.CHECKING, 500);
//        System.out.println(account);
//        BankCustomer joe = new BankCustomer("Joe", 500.00, 10000.00);
//        System.out.println(joe);

        Bank bank = new Bank(3214567);
        bank.adCustomer("Joe", 500.00, 10000.00);

        BankCustomer joe = bank.getCustomer("000000010000000");
        System.out.println(joe);
        List<BankAccount> accounts = joe.getAccounts();

        if(bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHECKING, 35)) {
            System.out.println(joe);
        }

        BankAccount checking = joe.getAccount(BankAccount.AccountType.CHECKING);
        var transactions = checking.getTransactions();
        transactions.forEach((k, v) -> System.out.println(k + ": " + v));

//        accounts.add(new BankAccount(BankAccount.AccountType.CHECKING, 150000));
//        System.out.println(joe);

//        System.out.println("--------------------");
//        for(var tx: transactions.values()) {
//            tx.setCustomerId(2);
//            tx.setAmount(10000.00);
//        }
//        transactions.forEach((k, v) -> System.out.println(k + ": " + v));

        joe.getAccount(BankAccount.AccountType.CHECKING).getTransactions().clear();
        System.out.println("---------------------");
        joe.getAccount(BankAccount.AccountType.CHECKING).getTransactions().forEach((k, v) -> System.out.println(k + ": " + v));
    }
}