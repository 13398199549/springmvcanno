package org.framestudy.springmvcanno.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.framestudy.springmvcanno.util.DateUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;
/**
 * 定义全局类型转换器
 * @author puxubo
 *
 */
public class UtilDateContextConverter implements Converter<String, Date> {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public Date convert(String text) {
		// TODO Auto-generated method stub
		Date date = null;
		try {
			if (StringUtils.hasLength(text)) {
				int lenth = text.length();
				switch (lenth) {
				// yyyy-MM-dd
				case 10:
					date = DateUtils.str2Date(new SimpleDateFormat("yyyy-MM-dd"), text);
					break;
				// yyyy-MM-dd hh:mm:ss
				default:
					date = DateUtils.str2Date(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"), text);
					break;
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error("UtilDatePropertyEditor-------setAsText()", e);
		}
		return date;
	}

}
