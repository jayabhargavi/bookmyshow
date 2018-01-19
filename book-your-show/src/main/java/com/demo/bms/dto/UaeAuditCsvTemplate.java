package com.demo.bms.dto;

import java.sql.Date;
import java.util.List;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class UaeAuditCsvTemplate {
	
	
		@CsvBindByPosition(position = 0)
		private List<CompanyInformationTable> companyInfotale;
		
		@CsvBindByPosition(position = 1)
		private List<PurchasingListTable> purchasingListTable;

		public List<CompanyInformationTable> getCompanyInfotale() {
			return companyInfotale;
		}

		public void setCompanyInfotale(List<CompanyInformationTable> companyInfotale) {
			this.companyInfotale = companyInfotale;
		}

		public List<PurchasingListTable> getPurchasingListTable() {
			return purchasingListTable;
		}

		public void setPurchasingListTable(List<PurchasingListTable> purchasingListTable) {
			this.purchasingListTable = purchasingListTable;
		}

		@Override
		public String toString() {
			return "UaeAuditCsvTemplate [companyInfotale=" + companyInfotale + ", purchasingListTable="
					+ purchasingListTable + "]";
		}
		
}
