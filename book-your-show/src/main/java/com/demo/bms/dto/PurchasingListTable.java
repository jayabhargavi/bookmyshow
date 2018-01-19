package com.demo.bms.dto;

import java.sql.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class PurchasingListTable {
	
	@CsvBindByName(column = "SupplierName")
	@CsvBindByPosition(position = 0)
	private String supplierName;
	@CsvBindByName(column = "SupplierCountry")
	@CsvBindByPosition(position = 1)
	private String supplierCountry;
	@CsvBindByName(column = "SupplierTRN")
	@CsvBindByPosition(position = 2)
	private String supplierTINTRN;
	@CsvBindByName(column = "InvoiceDate")
	@CsvBindByPosition(position = 3)
	private Date invoiceDate;
	@CsvBindByName(column = "InvoiceNo")
	@CsvBindByPosition(position = 4)
	private String invoiceNo;
	@CsvBindByName(column = "PermitNo")
	@CsvBindByPosition(position = 5)
	private Integer permitNo;
	@CsvBindByName(column = "TransactionID")
	@CsvBindByPosition(position = 6)
	private Integer transactionId;
	@CsvBindByName(column = "LineNo")
	@CsvBindByPosition(position = 7)
	private long lineNo;
	@CsvBindByName(column = "ProductDescription")
	@CsvBindByPosition(position = 8)
	private String productDescription;
	@CsvBindByName(column = "PurchaseValueAED")
	@CsvBindByPosition(position = 9)
	private double purchaseValueAED;
	@CsvBindByName(column = "VATValueAED")
	@CsvBindByPosition(position = 10)
	private double vATValueAED;
	@CsvBindByName(column = "TaxCode")
	@CsvBindByPosition(position = 11)
	private String taxCode;
	@CsvBindByName(column = "FCYCode")
	@CsvBindByPosition(position = 12)
	private String fCYCodee;
	@CsvBindByName(column = "PurchaseFCY")
	@CsvBindByPosition(position = 13)
	private double purchaseFCY;
	@CsvBindByName(column = "VATFCY")
	@CsvBindByPosition(position = 14)
	private double vatFCY;
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierCountry() {
		return supplierCountry;
	}
	public void setSupplierCountry(String supplierCountry) {
		this.supplierCountry = supplierCountry;
	}
	public String getSupplierTINTRN() {
		return supplierTINTRN;
	}
	public void setSupplierTINTRN(String supplierTINTRN) {
		this.supplierTINTRN = supplierTINTRN;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Integer getPermitNo() {
		return permitNo;
	}
	public void setPermitNo(Integer permitNo) {
		this.permitNo = permitNo;
	}
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public long getLineNo() {
		return lineNo;
	}
	public void setLineNo(long lineNo) {
		this.lineNo = lineNo;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getPurchaseValueAED() {
		return purchaseValueAED;
	}
	public void setPurchaseValueAED(double purchaseValueAED) {
		this.purchaseValueAED = purchaseValueAED;
	}
	public double getvATValueAED() {
		return vATValueAED;
	}
	public void setvATValueAED(double vATValueAED) {
		this.vATValueAED = vATValueAED;
	}
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public String getfCYCodee() {
		return fCYCodee;
	}
	public void setfCYCodee(String fCYCodee) {
		this.fCYCodee = fCYCodee;
	}
	public double getPurchaseFCY() {
		return purchaseFCY;
	}
	public void setPurchaseFCY(double purchaseFCY) {
		this.purchaseFCY = purchaseFCY;
	}
	public double getVatFCY() {
		return vatFCY;
	}
	public void setVatFCY(double vatFCY) {
		this.vatFCY = vatFCY;
	}
	@Override
	public String toString() {
		return "PurchasingListTable [supplierName=" + supplierName + ", supplierCountry=" + supplierCountry
				+ ", supplierTINTRN=" + supplierTINTRN + ", invoiceDate=" + invoiceDate + ", invoiceNo=" + invoiceNo
				+ ", permitNo=" + permitNo + ", transactionId=" + transactionId + ", lineNo=" + lineNo
				+ ", productDescription=" + productDescription + ", purchaseValueAED=" + purchaseValueAED
				+ ", vATValueAED=" + vATValueAED + ", taxCode=" + taxCode + ", fCYCodee=" + fCYCodee + ", purchaseFCY="
				+ purchaseFCY + ", vatFCY=" + vatFCY + "]";
	}
	
	
}
