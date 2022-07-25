package com.example.exam.to;

import java.io.Serializable;
import java.math.BigDecimal;

import com.example.exam.from.AccountingLineXYZ;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "monetaryPercentage")
@XmlAccessorType(XmlAccessType.FIELD)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MonetaryPercentage implements Serializable
{
    private static final long serialVersionUID = 273943458886964984L;

    AccountingLineXYZ accountingLineXYZ = new AccountingLineXYZ();

    private String code;
    private String amount;
    private String percentage;

    public String setAmount(){
        return amount = accountingLineXYZ.getCommissionPercentage();
    }

    public String setPercentage(){
        return percentage = accountingLineXYZ.getCommissionAmount();
    }
}
