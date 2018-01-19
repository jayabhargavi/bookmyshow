package com.demo.bms.util;

import com.opencsv.bean.BeanField;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvBindByName;

import antlr.StringUtils;

/**
 * This class enables to do both column ordering and custom headers
 * 
 * @author I333634
 *
 * @param <T>
 */
public class CustomMappingStrategy<T> extends ColumnPositionMappingStrategy<T> {
	@Override
	public String[] generateHeader() {
		final int numColumns = findMaxFieldIndex();
		if (!isAnnotationDriven() || numColumns == -1) {
			return super.generateHeader();
		}

		header = new String[numColumns + 1];

		BeanField beanField;
		for (int i = 0; i <= numColumns; i++) {
			beanField = findField(i);
			String columnHeaderName = extractHeaderName(beanField);
			header[i] = columnHeaderName;
		}
		return header;
	}

	private String extractHeaderName(final BeanField beanField) {
		if (beanField == null || beanField.getField() == null
				|| beanField.getField().getDeclaredAnnotationsByType(CsvBindByName.class).length == 0) {
			return "";
		}

		final CsvBindByName bindByNameAnnotation = beanField.getField()
				.getDeclaredAnnotationsByType(CsvBindByName.class)[0];
		return bindByNameAnnotation.column();
	}
}
