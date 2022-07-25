package com.example.exam.service;

import com.example.exam.from.AccountingLineXYZ;
import com.example.exam.repository.AccountingLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountingLineServiceImpl implements AccountingLineService{


    private AccountingLineRepository repository;

    @Override
    public List<AccountingLineXYZ> findAll() {
        AccountingLineXYZ accountingLineXYZ = new AccountingLineXYZ();
        return repository.findAll();
    }

    @Override
    public AccountingLineXYZ save(AccountingLineXYZ accountingLineXYZ) {
        return repository.save(accountingLineXYZ);
    }


//    List<AccountingLineXYZ> AccountingLineXYZList = accountingLineRepository.findAll();
//    AccountingLineXYZ accountingLine = new AccountingLineXYZ();
//    accountingLine.

}
