package com.app.easybank.EasyBankApplication.model;

import java.io.Serializable;
import java.util.Date;

public class Loan implements Serializable {
    private Long loanId;
    private String loanType;
    private Long loanAmount;
    private Long interest;
    private Date duration;

    public Loan() {
    }

    public Loan(Long loanId, String loanType, Long loanAmount, Long interest, Date duration) {
        this.loanId = loanId;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.interest = interest;
        this.duration = duration;
    }

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Long getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Long loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Long getInterest() {
        return interest;
    }

    public void setInterest(Long interest) {
        this.interest = interest;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", loanType='" + loanType + '\'' +
                ", loanAmount=" + loanAmount +
                ", interest=" + interest +
                ", duration=" + duration +
                '}';
    }
}
