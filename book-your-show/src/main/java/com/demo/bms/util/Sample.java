package com.demo.bms.util;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {

	public static int PRETTY_PRINT_INDENT_FACTOR = 4;
	public static String TEST_XML_STRING = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ConnectionProperties name=\"configurations\">\n  <PropertyGroup name=\"database\">\n      <PropertyEntry name=\"host\">10.96.4.170</PropertyEntry>\n      <PropertyEntry name=\"port\">30215</PropertyEntry>\n      <PropertyEntry name=\"database_name\"></PropertyEntry>\n      <PropertyEntry name=\"schema\"></PropertyEntry>\n  </PropertyGroup>\n  <PropertyGroup name=\"schema_alias_replacements\">\n      <PropertyEntry name=\"schema_alias\"></PropertyEntry>\n      <PropertyEntry name=\"schema_alias_replacement\"></PropertyEntry>\n  </PropertyGroup>\n  <PropertyGroup name=\"cdc_properties\">\n      <PropertyEntry name=\"prefix\">HADP_</PropertyEntry>\n      <PropertyEntry name=\"conn_pool_size\">8</PropertyEntry>\n      <PropertyEntry name=\"min_scan_interval\">0</PropertyEntry>\n      <PropertyEntry name=\"max_scan_interval\">10</PropertyEntry>\n      <PropertyEntry name=\"ddl_scan_interval\">10</PropertyEntry>\n      <PropertyEntry name=\"max_batch_size\">128</PropertyEntry>\n      <PropertyEntry name=\"batch_queue_size\">64</PropertyEntry>\n      <PropertyEntry name=\"max_scan_size\">50000</PropertyEntry>\n      <PropertyEntry name=\"_lr_maint_id\"></PropertyEntry>\n  </PropertyGroup>\n  <PropertyGroup name=\"security\">\n      <PropertyEntry name=\"encrypt\">false</PropertyEntry>\n      <PropertyEntry name=\"validate_certificate\">false</PropertyEntry>\n      <PropertyEntry name=\"host_name_in_certificate\">*</PropertyEntry>\n  </PropertyGroup>\n</ConnectionProperties>\n";
			//"<?xml version=\"1.0\" encoding=\"UTF-8\"?><ConnectionProperties name=\"configurations\">  <PropertyGroup name=\"database\">      <PropertyEntry name=\"host\">10.96.4.170</PropertyEntry>      <PropertyEntry name=\"port\">30215</PropertyEntry>      <PropertyEntry name=\"database_name\"></PropertyEntry>      <PropertyEntry name=\"schema\"></PropertyEntry>  </PropertyGroup>  <PropertyGroup name=\"schema_alias_replacements\">      <PropertyEntry name=\"schema_alias\"></PropertyEntry>      <PropertyEntry name=\"schema_alias_replacement\"></PropertyEntry>  </PropertyGroup>  <PropertyGroup name=\"cdc_properties\">      <PropertyEntry name=\"prefix\">HADP_</PropertyEntry>      <PropertyEntry name=\"conn_pool_size\">8</PropertyEntry>      <PropertyEntry name=\"min_scan_interval\">0</PropertyEntry>      <PropertyEntry name=\"max_scan_interval\">10</PropertyEntry>      <PropertyEntry name=\"ddl_scan_interval\">10</PropertyEntry>      <PropertyEntry name=\"max_batch_size\">128</PropertyEntry>      <PropertyEntry name=\"batch_queue_size\">64</PropertyEntry>      <PropertyEntry name=\"max_scan_size\">50000</PropertyEntry>      <PropertyEntry name=\"_lr_maint_id\"></PropertyEntry>  </PropertyGroup>  <PropertyGroup name=\"security\">      <PropertyEntry name=\"encrypt\">false</PropertyEntry>      <PropertyEntry name=\"validate_certificate\">false</PropertyEntry>      <PropertyEntry name=\"host_name_in_certificate\">*</PropertyEntry>  </PropertyGroup></ConnectionProperties>";
	static String w = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ConnectionProperties><PropertyEntry name=\"host\" displayName=\"Host\" isRequired=\"true\">10.96.4.170</PropertyEntry><PropertyEntry name=\"client\" displayName=\"Client\" isRequired=\"true\">714</PropertyEntry><PropertyEntry name=\"systemnumber\" displayName=\"System Number\" isRequired=\"true\">00</PropertyEntry></ConnectionProperties>";
	
	static String jsonPrettyPrintString = "";
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		try {
			JSONObject xmlJSONObj = XML.toJSONObject(w);
			jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
			System.out.println(jsonPrettyPrintString);
		} catch (JSONException je) {
			System.out.println(je.toString());
		}
		//ConnProps ronaldo = new ObjectMapper().readValue(jsonPrettyPrintString, ConnProps.class);
		/*ronaldo.getConnectionProperties().getPropertyGroup().stream().forEach(p ->{
			p.getName()
		});*/
		//ronaldo.toString();
	}

	/*
	 * public static void main(String[] args) { String csvContent = ""; String
	 * csvContent1=""; String csvContent2=""; String csvContent3="";
	 * CSVGeneratorUtil csvGeneratorUtil= new CSVGeneratorUtil();
	 * UaeAuditCsvTemplate cc = new UaeAuditCsvTemplate();
	 * List<CompanyInformationTable> companyInfotale = new ArrayList<>();
	 * CompanyInformationTable ct = new CompanyInformationTable();
	 * ct.setProductVersion("productVersion");//tCompInfoEnd("compInfoEnd");
	 * companyInfotale.add(ct); CompanyInformationTable ct1 = new
	 * CompanyInformationTable(); companyInfotale.add(ct1);
	 * cc.setCompanyInfotale(companyInfotale ); List<PurchasingListTable>
	 * purchasingListTables = new ArrayList<>(); PurchasingListTable pt= new
	 * PurchasingListTable(); pt.setVatFCY(98.0987);
	 * purchasingListTables.add(pt);
	 * cc.setPurchasingListTable(purchasingListTables); List<SupplyListingTable>
	 * st1 = new ArrayList<>(); SupplyListingTable st =new SupplyListingTable();
	 * st.setCountry("AE"); st.setCustomerName("ATSR"); SupplyListingTable st2
	 * =new SupplyListingTable(); st2.setCountry("AE");
	 * st2.setCustomerName("ATSR"); st1.add(st); st1.add(st2);
	 * 
	 * List<GeneralLedgerTable> gt1 = new ArrayList<>(); GeneralLedgerTable gt
	 * =new GeneralLedgerTable(); gt.setAccountID("accountID");
	 * GeneralLedgerTable gt2 =new GeneralLedgerTable();
	 * gt2.setAccountName("accountName"); gt1.add(gt); gt1.add(gt2); try {
	 * csvContent = csvGeneratorUtil.generateCSV(UaeAuditCsvTemplate.class, cc);
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * try { // csvContent1 =
	 * csvGeneratorUtil.generateCSV(PurchasingListTable.class,
	 * purchasingListTables); } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * try { // csvContent2 =
	 * csvGeneratorUtil.generateCSV(SupplyListingTable.class, st1); } catch
	 * (Exception e) { e.printStackTrace(); }
	 * 
	 * try { // csvContent3 =
	 * csvGeneratorUtil.generateCSV(GeneralLedgerTable.class, gt1); } catch
	 * (Exception e) { e.printStackTrace(); }
	 * 
	 * System.out.println(csvContent.toString()+csvContent1+csvContent2+
	 * csvContent3); }
	 */

}
