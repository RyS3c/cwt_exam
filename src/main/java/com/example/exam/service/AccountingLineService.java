package com.example.exam.service;

import com.example.exam.from.AccountingLineXYZ;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountingLineService {

    List<AccountingLineXYZ> findAll();


    AccountingLineXYZ save(AccountingLineXYZ accountingLineXYZ);
}
