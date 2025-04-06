package com.app.easybank.EasyBankApplication.Repository;

import com.app.easybank.EasyBankApplication.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepo extends CrudRepository<LoanEntity, Long>, JpaRepository<LoanEntity, Long> {
}
