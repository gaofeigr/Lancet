package com.lancet.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期工具类
 */
public final class DateUtil {

    private DateUtil(){};

    /**
     * 将指定日期添加一天
     * @param date
     * @return
     */
    public static Date AddOneDay(Object date) {
        if (null != date) { //如果结束日期不为空的话，则加一天，因为日期默认是当日凌晨0点
            Calendar calendar = new GregorianCalendar();
            calendar.setTime((Date)date);
            calendar.add(Calendar.DATE, 1);//把日期往后增加一天.整数往后推,负数往前移动
            return calendar.getTime();
        }
        return null;
    }

    /**
     * 格式化日期  yyyy-MM-dd HH:mm:ss
     * @param date
     * @return
     */
    public static String FormatData(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }
}
