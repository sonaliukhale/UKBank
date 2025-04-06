package com.app.easybank.EasyBankApplication.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountNumber;
    @Column(name = "holderName")
    private String accHolderName;
    @Column(name = "address")
    private String address;
    @Column(name = "amount")
    private Long amount;

    public AccountEntity() {
    }

    public AccountEntity(Long accountNumber, String accHolderName, String address, Long amount) {
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
        return "AccountEntity{" +
                "accountNumber=" + accountNumber +
                ", accHolderName='" + accHolderName + '\'' +
                ", address='" + address + '\'' +
                ", amount=" + amount +
                '}';
    }
}
