package com.demo.bms.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtility {

	public static String datetoString(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		return date!= null ? dateFormat.format(date) : null;
	}

}
