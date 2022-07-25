package com.example.exam;

import com.example.exam.from.AccountingLineXYZ;
import com.example.exam.repository.AccountingLineRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ExamApplicationTests {

	@Autowired
	AccountingLineRepository accountingLineRepository;

	@Test
	public void test(){
		AccountingLineXYZ accountingLineXYZ = new AccountingLineXYZ();
		accountingLineXYZ.setPassengerName("Thanos");
		accountingLineXYZ.setAccountingVendorCode("ABC");
		accountingLineXYZ.setChargeCategoryCoded("TEST");
		accountingLineXYZ.setCommissionAmount("2");
		accountingLineXYZ.setCommissionPercentage("2");
		accountingLineXYZ.setBaseFare("1252.00");
		accountingLineXYZ.setCreditCardCode("AX0");
		accountingLineXYZ.setCreditCardNumber("123456789");
		accountingLineXYZ.setGSTCode("GST");
		accountingLineXYZ.setGSTAmount("10");
		accountingLineXYZ.setGSTPercent("1");
		accountingLineXYZ.setQSTCode("QST");
		accountingLineXYZ.setQSTAmount("10");
		accountingLineXYZ.setQSTPercent("1");
		accountingLineXYZ.setTaxAmount("201.38");
		accountingLineXYZ.setTaxPercentage("1");
		accountingLineXYZ.setTaxSurchargeCode2("VAT");
		accountingLineXYZ.setDocumentNumber("3889081143");
		accountingLineXYZ.setAirlineDesignator("AA");
		accountingLineXYZ.setLinkCode("01");
		accountingLineXYZ.setFormOfPaymentCode("FormOfPaymentCode0");
		accountingLineXYZ.setFareApplication("ONE");
		accountingLineXYZ.setTypeIndicator("TYPE-01");
		accountingLineXYZ.setNumberOfConjunctedDocuments("15-FEE-EXP$08");
		accountingLineXYZ.setNumberOfCoupons("1");
		accountingLineXYZ.setOriginalTicketNumber("123456");
		accountingLineXYZ.setOriginalDateOfIssue("2021-01-28");
		accountingLineXYZ.setOriginalPlaceOfIssue("MNL");
		accountingLineXYZ.setFullPartialExchangeIndicator("PART");
		accountingLineXYZ.setOriginalInvoice("00001");
		accountingLineXYZ.setTarriffBasis("TarriffBasis0");
		accountingLineXYZ.setFreeFormText("HELLO WORlD");
		accountingLineXYZ.setCurrencyCode("USD");
		accountingLineXYZ.setSegmentType("AIR");
		accountingLineXYZ.setSegmentNumber("1");
		accountingLineXYZ.setId("572");

		accountingLineRepository.save(accountingLineXYZ);
		assertNotNull(accountingLineRepository.findById(String.valueOf(572)).get());
	}

	@Test
	public void testReadAll(){
		List<AccountingLineXYZ> list = accountingLineRepository.findAll();
		assertThat(list).size();
	}

}
