package com.demo.bms.util;

import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

//@Component
public class CSVGeneratorUtil {

	/**
	 * Converts {@link contentList} to csv
	 * string
	 * 
	 * @param templateClazz
	 * @param contentList
	 *            -- list object that needs to be converted to csv
	 * @return
	 * @throws BaseException
	 */
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CSVGeneratorUtil.class);
	
	public <T> String generateCSV(Class<T> templateClazz, T contentList) throws Exception {

		StringWriter stringWriter = new StringWriter();
		final CustomMappingStrategy<T> mappingStrategy = new CustomMappingStrategy<>();
		mappingStrategy.setType(templateClazz);

		final StatefulBeanToCsv<T> beanToCsv = new StatefulBeanToCsvBuilder<T>(stringWriter)
				.withSeparator('|')
				.withMappingStrategy(mappingStrategy).build();
		try {
			beanToCsv.write(contentList);
		} catch (CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
			LOGGER.error("Error occurred in converting bean to CSV"+ e.getMessage());
			throw new Exception("Exception occurred : " + e.getMessage());
		}

		String data = stringWriter.toString().replace("\"", "");
		/*String encoded = Base64.getEncoder().encodeToString(data.getBytes());*/
		return data;
		
		
	}

}
