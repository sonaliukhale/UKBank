package com.app.easybank.EasyBankApplication.controller;

import com.app.easybank.EasyBankApplication.Service.AccountService;
import com.app.easybank.EasyBankApplication.entity.AccountEntity;
import com.app.easybank.EasyBankApplication.entity.CardEntity;
import com.app.easybank.EasyBankApplication.entity.LoanEntity;
import com.app.easybank.EasyBankApplication.model.Account;
import com.app.easybank.EasyBankApplication.model.Card;
import com.app.easybank.EasyBankApplication.model.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/demo")
    public String testing() {
        return accountService.testing();
    }

    @GetMapping("/myAccount")
    public List<Account> getMyAccountDetails() {
        return accountService.accountHoldersDetails();
    }

    @PostMapping("/insert")
    public AccountEntity insertData(@RequestBody Account account) {
        return accountService.insertData(account);
    }

    @GetMapping("/myBalance/{accountNumber}")
    public Long getMyBalance(@PathVariable(name = "accountNumber") Long accountNumber) {
        return accountService.getBalance(accountNumber);
    }

    @GetMapping("/myLoans")
    public List<Loan> getMyAllLoans() {
        return accountService.getAllLoanDetails();
    }

    @PostMapping("/insertLoan")
    public LoanEntity insertLoan(@RequestBody Loan loan) {
        return accountService.insertLoan(loan);
    }

    @GetMapping("/myCards")
    public List<Card> getMyAllCards() {
        return accountService.getAllCardDetails();
    }

    @PostMapping("/insertCard")
    public CardEntity insertCard(@RequestBody Card card) {
        return accountService.insertCard(card);
    }
}
