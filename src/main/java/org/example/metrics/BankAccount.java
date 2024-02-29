package org.example.metrics;

public class BankAccount {
    //constructor with too many parameters in custom scope 'MyScope'
    @SuppressWarnings("unused")
    public BankAccount(long accountNumber,
                       String owner,
                       double balance,
                       double interestRate,
                       double overdraftLimit,
                       double transactionFee,
                       double minimumBalance,
                       double maximumBalance,
                       double minimumTransactionAmount) {
        // fields initialization
    }
}
