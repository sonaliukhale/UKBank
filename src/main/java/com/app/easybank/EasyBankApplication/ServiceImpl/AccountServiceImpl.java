package com.app.easybank.EasyBankApplication.ServiceImpl;

import com.app.easybank.EasyBankApplication.Repository.AccountRepository;
import com.app.easybank.EasyBankApplication.Repository.CardRepo;
import com.app.easybank.EasyBankApplication.Repository.LoanRepo;
import com.app.easybank.EasyBankApplication.Service.AccountService;
import com.app.easybank.EasyBankApplication.entity.AccountEntity;
import com.app.easybank.EasyBankApplication.entity.CardEntity;
import com.app.easybank.EasyBankApplication.entity.LoanEntity;
import com.app.easybank.EasyBankApplication.model.Account;
import com.app.easybank.EasyBankApplication.model.Card;
import com.app.easybank.EasyBankApplication.model.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    LoanRepo loanRepo;

    @Autowired
    CardRepo cardRepo;

    @Override
    public String testing() {
        return "testing of the account";
    }

    @Override
    public List<Account> accountHoldersDetails() {
        List<AccountEntity> details = accountRepository.findAll();
        Account model = new Account();
        List<Account> accountList = new ArrayList<>();
        details.forEach(account -> {
            model.setAccountNumber(account.getAccountNumber());
            model.setAddress(account.getAddress());
            model.setAccHolderName(account.getAccHolderName());
            model.setAmount(account.getAmount());
            accountList.add(model);
        });
        return accountList;
    }

    @Override
    public AccountEntity insertData(Account account) {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setAccountNumber(account.getAccountNumber());
        accountEntity.setAddress(account.getAddress());
        accountEntity.setAmount(account.getAmount());
        accountEntity.setAccHolderName(account.getAccHolderName());
        return accountRepository.save(accountEntity);
    }

    @Override
    public Long getBalance(Long accountNumber) {
        Optional<AccountEntity> account = accountRepository.findById(accountNumber);
        return account.get().getAmount();
    }

    @Override
    public List<Loan> getAllLoanDetails() {
        List<LoanEntity> loans = loanRepo.findAll();
        Loan loan = new Loan();
        List<Loan> loanList = new ArrayList<>();
        loans.forEach(l -> {
            loan.setLoanId(l.getLoanId());
            loan.setLoanAmount(l.getLoanAmount());
            loan.setLoanType(l.getLoanType());
            loan.setDuration(l.getDuration());
            loan.setInterest(l.getInterest());
            loanList.add(loan);
        });
        return loanList;
    }

    @Override
    public LoanEntity insertLoan(Loan loan) {
        LoanEntity loanEntity = new LoanEntity();
        loanEntity.setDuration(loan.getDuration());
        loanEntity.setLoanAmount(loan.getLoanAmount());
        loanEntity.setLoanId(loan.getLoanId());
        loanEntity.setLoanType(loan.getLoanType());
        loanEntity.setInterest(loan.getInterest());
        return loanRepo.save(loanEntity);
    }

    @Override
    public List<Card> getAllCardDetails() {
        List<CardEntity> cardEntities = cardRepo.findAll();
        Card card = new Card();
        List<Card> cardList = new ArrayList<>();
        cardEntities.forEach(c -> {
            card.setCardNumber(c.getCardNumber());
            card.setCardHolderName(c.getCardHolderName());
            card.setCvv(c.getCvv());
            card.setExpiryDate(c.getExpiryDate());
            card.setStartDate(c.getStartDate());
            cardList.add(card);
        });
        return cardList;
    }

    @Override
    public CardEntity insertCard(Card c) {
        CardEntity card = new CardEntity();
        card.setCardNumber(c.getCardNumber());
        card.setCardHolderName(c.getCardHolderName());
        card.setCvv(c.getCvv());
        card.setExpiryDate(c.getExpiryDate());
        card.setStartDate(c.getStartDate());
        return cardRepo.save(card);
    }
}
