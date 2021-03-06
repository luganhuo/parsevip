package com.pibigstar.parsevip.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式工具类
 * @author pibigstar
 *
 */
public class DateUtils {
	
    private final static long minute = 60 * 1000;// 1分钟
    private final static long hour = 60 * minute;// 1小时
    private final static long day = 24 * hour;// 1天
    private final static long month = 31 * day;// 月
    private final static long year = 12 * month;// 年
	
	public final static String YYYYMMDDHHMMSS = "yyyyMMddHHmmssSSS";
	
	/**
	 * 得到当前时间
	 * @return 2018-06-08 21:52:30
	 */
	public String now() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(new Date());
	}
	
	/**
	 * 格式化当前时间
	 * @param date
	 * @param str
	 * @return
	 */
	public String getFormatDate(Date date,String strFormat) {
		SimpleDateFormat format = new SimpleDateFormat(strFormat);
		return format.format(date);
	}
	public String getFormatDate(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(date);
	}
	
	
    /**
     * @return
     * @author neo
     * @date 2015-5-21
     */
    public static String getDateSequence() {
        return new SimpleDateFormat(YYYYMMDDHHMMSS).format(new Date());
    }


	/**
	 * @author neo
	 * @date 2016年8月10日
	 * @return
	 */
	public static long getCurrentTime() {
		return System.currentTimeMillis();
	}
	
	
    public static String getTimeFormatText(Long date) {
        if (date == null) {
            return null;
        }
        long diff = new Date().getTime() - date;
        long r = 0;
        if (diff > year) {
            r = (diff / year);
            return r + "年前";
        }
        if (diff > month) {
            r = (diff / month);
            return r + "个月前";
        }
        if (diff > day) {
            r = (diff / day);
            return r + "天前";
        }
        if (diff > hour) {
            r = (diff / hour);
            return r + "个小时前";
        }
        if (diff > minute) {
            r = (diff / minute);
            return r + "分钟前";
        }
        return "刚刚";
    }

}
