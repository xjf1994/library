package com.xc.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SqlUtil {

	/**
	 * 
	 * @param date 格式�?yyyy-MM-dd"的字符串
	 * @return
	 * @throws ParseException
	 */
	public static java.sql.Date toSqlDate(String date) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date dd=sdf.parse(date);
		return new java.sql.Date(dd.getTime());
	}
}
