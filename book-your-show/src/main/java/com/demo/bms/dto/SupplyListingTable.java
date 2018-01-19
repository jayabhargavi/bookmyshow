package com.demo.bms.dto;

import java.sql.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class SupplyListingTable {
	
		// Supply Listing table
			@CsvBindByName(column = "CustomerName")
			@CsvBindByPosition(position = 0)
			private String customerName;
			@CsvBindByName(column = "CustomerCountry")
			@CsvBindByPosition(position = 1)
			private String customerCountry;
			@CsvBindByName(column = "CustomerTRN")
			@CsvBindByPosition(position = 2)
			private String customerTIN;

			// InvoiceDate,InvoiceNo,LineNo,ProductDescription
			@CsvBindByName(column = "InvoiceDate")
			@CsvBindByPosition(position = 3)
			private Date invoiceDateSLT;
			@CsvBindByName(column = "InvoiceNo")
			@CsvBindByPosition(position = 4)
			private String invoiceNoSTL;
			@CsvBindByName(column = "TransactionID")
			@CsvBindByPosition(position = 5)
			private Date transactionIdSLT;
			@CsvBindByName(column = "LineNo")
			@CsvBindByPosition(position = 6)
			private long lineNoSLT;
			@CsvBindByName(column = "ProductDescription")
			@CsvBindByPosition(position = 7)
			private String productDescriptionSLT;

			@CsvBindByName(column = "SupplyValueAED")
			@CsvBindByPosition(position = 8)
			private double supplyValueAED;

			// VATValueAED, TaxCode

			@CsvBindByName(column = "VATValueAED")
			@CsvBindByPosition(position = 9)
			private double vATValueAEDSLT;

			@CsvBindByName(column = "TaxCode")
			@CsvBindByPosition(position = 10)
			private String taxCodeSLT;

			@CsvBindByName(column = "Country")
			@CsvBindByPosition(position = 11)
			private String country;
			@CsvBindByName(column = "FCYCode")
			@CsvBindByPosition(position = 12)
			private String fCYCode;
			@CsvBindByName(column = "SupplyFCY")
			@CsvBindByPosition(position = 13)
			private double supplyFCY;
			@CsvBindByName(column = "VATFCY")
			@CsvBindByPosition(position = 14)
			private double vATFCY;
			public String getCustomerName() {
				return customerName;
			}
			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}
			public String getCustomerCountry() {
				return customerCountry;
			}
			public void setCustomerCountry(String customerCountry) {
				this.customerCountry = customerCountry;
			}
			public String getCustomerTIN() {
				return customerTIN;
			}
			public void setCustomerTIN(String customerTIN) {
				this.customerTIN = customerTIN;
			}
			public Date getInvoiceDateSLT() {
				return invoiceDateSLT;
			}
			public void setInvoiceDateSLT(Date invoiceDateSLT) {
				this.invoiceDateSLT = invoiceDateSLT;
			}
			public String getInvoiceNoSTL() {
				return invoiceNoSTL;
			}
			public void setInvoiceNoSTL(String invoiceNoSTL) {
				this.invoiceNoSTL = invoiceNoSTL;
			}
			public Date getTransactionIdSLT() {
				return transactionIdSLT;
			}
			public void setTransactionIdSLT(Date transactionIdSLT) {
				this.transactionIdSLT = transactionIdSLT;
			}
			public long getLineNoSLT() {
				return lineNoSLT;
			}
			public void setLineNoSLT(long lineNoSLT) {
				this.lineNoSLT = lineNoSLT;
			}
			public String getProductDescriptionSLT() {
				return productDescriptionSLT;
			}
			public void setProductDescriptionSLT(String productDescriptionSLT) {
				this.productDescriptionSLT = productDescriptionSLT;
			}
			public double getSupplyValueAED() {
				return supplyValueAED;
			}
			public void setSupplyValueAED(double supplyValueAED) {
				this.supplyValueAED = supplyValueAED;
			}
			public double getvATValueAEDSLT() {
				return vATValueAEDSLT;
			}
			public void setvATValueAEDSLT(double vATValueAEDSLT) {
				this.vATValueAEDSLT = vATValueAEDSLT;
			}
			public String getTaxCodeSLT() {
				return taxCodeSLT;
			}
			public void setTaxCodeSLT(String taxCodeSLT) {
				this.taxCodeSLT = taxCodeSLT;
			}
			public String getCountry() {
				return country;
			}
			public void setCountry(String country) {
				this.country = country;
			}
			public String getfCYCode() {
				return fCYCode;
			}
			public void setfCYCode(String fCYCode) {
				this.fCYCode = fCYCode;
			}
			public double getSupplyFCY() {
				return supplyFCY;
			}
			public void setSupplyFCY(double supplyFCY) {
				this.supplyFCY = supplyFCY;
			}
			public double getvATFCY() {
				return vATFCY;
			}
			public void setvATFCY(double vATFCY) {
				this.vATFCY = vATFCY;
			}
			
}
