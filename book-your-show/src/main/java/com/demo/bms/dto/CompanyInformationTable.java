package com.demo.bms.dto;

import java.sql.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class CompanyInformationTable {
	
	@CsvBindByName(column = "TaxablePersonNameEn")
	@CsvBindByPosition(position = 0)
	private String taxablePersonNameEn;
	@CsvBindByName(column = "TaxablePersonNameAr")
	@CsvBindByPosition(position = 1)
	private String taxablePersonNameAr;
	@CsvBindByName(column = "TaxablePersonNameAr")
	@CsvBindByPosition(position = 2)
	private String tRN;
	@CsvBindByName(column = "TaxAgencyName")
	@CsvBindByPosition(position = 3)
	private String taxAgencyName;
	@CsvBindByName(column = "TAN")
	@CsvBindByPosition(position = 4)
	private String tAN;
	@CsvBindByName(column = "TAAN")
	@CsvBindByPosition(position = 5)
	private String tAAN;
	@CsvBindByName(column = "PeriodStart")
	@CsvBindByPosition(position = 6)
	private Date periodStart;
	@CsvBindByName(column = "PeriodEnd")
	@CsvBindByPosition(position = 7)
	private Date periodEnd;
	@CsvBindByName(column = "FAFCreationDate")
	@CsvBindByPosition(position = 8)
	private String fafCreationDate;
	@CsvBindByName(column = "ProductVersion")
	@CsvBindByPosition(position = 9)
	private String productVersion;
	@CsvBindByName(column = "FAFVersion")
	@CsvBindByPosition(position = 10)
	private String fAFVersion;
	
	public String getTaxablePersonNameEn() {
		return taxablePersonNameEn;
	}
	public void setTaxablePersonNameEn(String taxablePersonNameEn) {
		this.taxablePersonNameEn = taxablePersonNameEn;
	}
	public String getTaxablePersonNameAr() {
		return taxablePersonNameAr;
	}
	public void setTaxablePersonNameAr(String taxablePersonNameAr) {
		this.taxablePersonNameAr = taxablePersonNameAr;
	}
	public String gettRN() {
		return tRN;
	}
	public void settRN(String tRN) {
		this.tRN = tRN;
	}
	public String getTaxAgencyName() {
		return taxAgencyName;
	}
	public void setTaxAgencyName(String taxAgencyName) {
		this.taxAgencyName = taxAgencyName;
	}
	public String gettAN() {
		return tAN;
	}
	public void settAN(String tAN) {
		this.tAN = tAN;
	}
	public String gettAAN() {
		return tAAN;
	}
	public void settAAN(String tAAN) {
		this.tAAN = tAAN;
	}
	public Date getPeriodStart() {
		return periodStart;
	}
	public void setPeriodStart(Date periodStart) {
		this.periodStart = periodStart;
	}
	public Date getPeriodEnd() {
		return periodEnd;
	}
	public void setPeriodEnd(Date periodEnd) {
		this.periodEnd = periodEnd;
	}
	public String getFafCreationDate() {
		return fafCreationDate;
	}
	public void setFafCreationDate(String fafCreationDate) {
		this.fafCreationDate = fafCreationDate;
	}
	public String getProductVersion() {
		return productVersion;
	}
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}
	public String getfAFVersion() {
		return fAFVersion;
	}
	public void setfAFVersion(String fAFVersion) {
		this.fAFVersion = fAFVersion;
	}
	
}
