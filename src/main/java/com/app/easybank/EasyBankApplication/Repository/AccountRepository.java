package com.app.easybank.EasyBankApplication.Repository;

import com.app.easybank.EasyBankApplication.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long>, CrudRepository<AccountEntity, Long> {

}
