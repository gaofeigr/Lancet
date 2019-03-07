package com.lancet.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期工具类
 */
public final class DateUtil {

    private DateUtil(){};

    public static String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static String DAY_PATTERN = "yyyy-MM-dd";
    public static String TIME_PATTERN = "HH:mm:ss";

    /**
     * 将指定日期添加一天
     * @param date
     * @return
     */
    public static Date addOneDay(Object date) {
        if (null != date) { //如果结束日期不为空的话，则加一天，因为日期默认是当日凌晨0点
            Calendar calendar = new GregorianCalendar();
            calendar.setTime((Date)date);
            calendar.add(Calendar.DATE, 1);//把日期往后增加一天.整数往后推,负数往前移动
            return calendar.getTime();
        }
        return null;
    }

    /**
     * 将日期格式化成字符串
     * @param date
     * @return 格式化后的字符串
     */
    public static String formatDataToString(Date date, String pattern) {
        if (StringUtil.isNull(pattern)) {
            pattern = DEFAULT_PATTERN;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    /**
     * 将字符串格式化成日期
     * @param date
     * @return 格式化后的日期
     */
    public static Date formatStringToData(String date, String pattern) throws Exception {
        try {
            if (StringUtil.isNull(pattern)) {
                pattern = DEFAULT_PATTERN;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            throw new Exception("格式化日期出错！", e);
        }
    }
}
