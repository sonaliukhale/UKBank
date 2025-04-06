package com.app.easybank.EasyBankApplication.model;

import lombok.*;

import java.io.Serializable;

public class Account implements Serializable {
    private Long accountNumber;
    private String accHolderName;
    private String address;
    private Long amount;

    public Account() {
    }

    public Account(Long accountNumber, String accHolderName, String address, Long amount) {
        this.accountNumber = accountNumber;
        this.accHolderName = accHolderName;
        this.address = address;
        this.amount = amount;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accHolderName='" + accHolderName + '\'' +
                ", address='" + address + '\'' +
                ", amount=" + amount +
                '}';
    }
}
