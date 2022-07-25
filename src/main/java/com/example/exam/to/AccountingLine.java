package com.example.exam.to;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


import com.example.exam.from.AccountingLineXYZ;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.*;

import static com.example.exam.to.AccountingLineStatus.ACTIVE;

@XmlRootElement(name = "accountingLine")
@XmlAccessorType(XmlAccessType.FIELD)
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class AccountingLine implements Serializable
{
    private static final long serialVersionUID = 8768848284389900534L;

    private AccountingLineXYZ accountingLineXYZ;

    private String accountingLineID;

    private AccountingLineStatus accountingLineStatus;

    private String accountingVendorCode;

    private String airlineCode;

    private String chargeCategoryCode;

    private String formattedReceiptNumber;

    private String invoiceNumber;

    private String linkCode;

    private String numberOfConjunctedDocuments;

    private String originalTicketNumber;

    private String receiptNumber;

    private List<String> segmentRefIDList;

    private String travelerName;

    private List<String> travelerRefIDList;

    private String typeIndicator;

    private String elementNumber;

    private String fareApplication;

    private String baseFare;

    private String taxAmount;

    private String totalTaxAmount;

    private String totalTaxSurcharge;

    private String gstAmount;

    private String gstCode;

    private MonetaryAmount qstAmount;

    private MonetaryAmount qstCode;

    private MonetaryPercentage commission;

    private String freeFormText;





//    @JacksonXmlProperty(localName = "AccountingLineXYZ")
//    @JacksonXmlElementWrapper(useWrapping = false)
//
//    public String setAccountingLineID(){
//        return accountingLineID = accountingLineXYZ.getId();
//    }
//
//    public String setAccountingLineCode(){
//        return accountingVendorCode = accountingLineXYZ.getAccountingVendorCode();
//    }
//
//    public void setAccountingLineStatus(AccountingLineStatus accountingLineStatus){
//        this.accountingLineStatus = ACTIVE;
//    }
//
//    public String setChargeCategoryCode(){
//        return chargeCategoryCode = accountingLineXYZ.getChargeCategoryCoded();
//    }
//
//    public String setInvoiceNumber(){
//        return invoiceNumber = accountingLineXYZ.getOriginalInvoice();
//    }
//
//    public String setLinkCode(){
//        return linkCode = accountingLineXYZ.getLinkCode();
//    }
//
//    public String setNumberOfConjunctedDocuments(){
//        return numberOfConjunctedDocuments = accountingLineXYZ.getNumberOfConjunctedDocuments();
//    }
//
//    public String setOriginalTicketNumber(){
//        return originalTicketNumber = accountingLineXYZ.getOriginalTicketNumber();
//    }
//
//    public List<String> setSegmentIDList(){
//        return segmentRefIDList = Collections.singletonList(accountingLineXYZ.getSegmentNumber());
//    }
//
//    public String setTravelerName(){
//        return travelerName = accountingLineXYZ.getPassengerName();
//    }
//
//    public List<String> setTravelerRefIDList(){
//        return travelerRefIDList = Collections.singletonList("1");
//    }
//
//    public String setTypeIndicator(){
//        return typeIndicator = accountingLineXYZ.getTypeIndicator();
//    }
//
//    public String setElementNumber(){
//        return elementNumber = String.valueOf(accountingLineXYZ.getIndex());
//    }
//
//    public String setFareApplication(){
//        return  fareApplication = accountingLineXYZ.getFareApplication();
//    }
//
//    public String setBasFare(){
//        return baseFare = accountingLineXYZ.getBaseFare();
//    }
//
//
//    public String setTaxAmount(){
//        return taxAmount = accountingLineXYZ.getTaxAmount();
//    }
//
//
//    public String setTotalTaxSurcharge(){
//        return totalTaxSurcharge = gstAmount + qstAmount;
//    }
//
//    public String setTotalTaxAmount(){
//        return totalTaxAmount = taxAmount + totalTaxSurcharge;
//    }
//
//    public String setGstAmount(){
//        return gstAmount = accountingLineXYZ.getGSTAmount();
//    }
//
//    public String setGstCode(){
//        return gstCode = accountingLineXYZ.getGSTCode();
//    }
//
//    public String setFreeFormtext(){
//        return freeFormText = accountingLineXYZ.getFreeFormText();
//    }

}
