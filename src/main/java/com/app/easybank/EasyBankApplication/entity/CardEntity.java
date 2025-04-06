package com.app.easybank.EasyBankApplication.entity;

import com.app.easybank.EasyBankApplication.model.Loan;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "card")
public class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cardNumber;
    private String cardHolderName;
    private Date startDate;
    private Date expiryDate;
    private long cvv;

    public CardEntity() {
    }

    public CardEntity(Long cardNumber, String cardHolderName, Date startDate, Date expiryDate, long cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.startDate = startDate;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public long getCvv() {
        return cvv;
    }

    public void setCvv(long cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CardEntity{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", startDate=" + startDate +
                ", expiryDate=" + expiryDate +
                ", cvv=" + cvv +
                '}';
    }
}
