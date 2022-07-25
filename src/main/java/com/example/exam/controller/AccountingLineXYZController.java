package com.example.exam.controller;


import com.example.exam.advice.ApplicationExceptionHandling;
import com.example.exam.exception.ApplicationException;
import com.example.exam.from.AccountingLineXYZ;
import com.example.exam.service.AccountingLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/accountingline/details")
public class AccountingLineXYZController {

    @Autowired
    private AccountingLineService accountingLineService;

    @Autowired
    private ApplicationExceptionHandling applicationExceptionHandling;




    @GetMapping(value = "/allDetails", consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountingLineXYZ getAllDetails(String data) throws ApplicationException {
       return (AccountingLineXYZ) accountingLineService.findAll();
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AccountingLineXYZ> createAccountingLineDetails(@RequestBody AccountingLineXYZ newAccountingLineXYZ) throws ApplicationException {
       return new ResponseEntity<>(accountingLineService.save(newAccountingLineXYZ), HttpStatus.CREATED);
    }


}
