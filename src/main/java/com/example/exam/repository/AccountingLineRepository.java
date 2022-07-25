package com.example.exam.repository;

import com.example.exam.from.AccountingLineXYZ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface AccountingLineRepository extends JpaRepository<AccountingLineXYZ, String> {

}
