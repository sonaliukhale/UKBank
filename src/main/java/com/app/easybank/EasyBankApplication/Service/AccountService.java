package com.app.easybank.EasyBankApplication.Service;

import com.app.easybank.EasyBankApplication.entity.AccountEntity;
import com.app.easybank.EasyBankApplication.entity.CardEntity;
import com.app.easybank.EasyBankApplication.entity.LoanEntity;
import com.app.easybank.EasyBankApplication.model.Account;
import com.app.easybank.EasyBankApplication.model.Card;
import com.app.easybank.EasyBankApplication.model.Loan;

import java.util.List;

public interface AccountService {
    public String testing();

    public List<Account> accountHoldersDetails();

    public AccountEntity insertData(Account account);

    public Long getBalance(Long accountNumber);

    public List<Loan> getAllLoanDetails();

    public LoanEntity insertLoan(Loan loan);

    public List<Card> getAllCardDetails();

    public CardEntity insertCard(Card card);
}
