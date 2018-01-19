package com.demo.bms.dto;

import java.sql.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class GeneralLedgerTable {
	
	//dd-mm-yyyy
	@CsvBindByName(column = "TransactionDate")
	@CsvBindByPosition(position = 0)
	private Date transactionDate;
	@CsvBindByName(column = "AccountID")
	@CsvBindByPosition(position = 1)
	private String accountID;
	@CsvBindByName(column = "AccountName")
	@CsvBindByPosition(position = 2)
	private String accountName;
	@CsvBindByName(column = "TransactionDescription")
	@CsvBindByPosition(position = 3)
	private String transactionDescription;
	@CsvBindByName(column = "Name")
	@CsvBindByPosition(position = 4)
	private String name;
	@CsvBindByName(column = "TransactionID")
	@CsvBindByPosition(position = 5)
	private String transactionID;
	@CsvBindByName(column = "SourceDocumentID")
	@CsvBindByPosition(position = 6)
	private String sourceDocumentID;
	@CsvBindByName(column = "SourceType")
	@CsvBindByPosition(position = 7)
	private String sourceType;
	@CsvBindByName(column = "Debit")
	@CsvBindByPosition(position = 8)
	private double debit;
	@CsvBindByName(column = "Credit")
	@CsvBindByPosition(position = 9)
	private double credit;
	@CsvBindByName(column = "Balance")
	@CsvBindByPosition(position = 10)
	private double balance;
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getTransactionDescription() {
		return transactionDescription;
	}
	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getSourceDocumentID() {
		return sourceDocumentID;
	}
	public void setSourceDocumentID(String sourceDocumentID) {
		this.sourceDocumentID = sourceDocumentID;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public double getDebit() {
		return debit;
	}
	public void setDebit(double debit) {
		this.debit = debit;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
