package com.example.exam.to;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@XmlRootElement(name = "monetaryAmount")
@XmlAccessorType(XmlAccessType.FIELD)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MonetaryAmount implements Serializable
{
    private static final long serialVersionUID = 6498027380354019510L;


    private String formattedValue;


    private String currencyCode;


    private Long value;
    

    private Integer numberOfDecimals;
}
