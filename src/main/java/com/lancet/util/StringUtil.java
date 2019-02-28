package com.lancet.util;


/**
 * @Description 字符串工具类
 * @Date 2019-2-28 21:17
 * @Author GaoFei
 * @Version 1.0
 **/
public class StringUtil {
    /**
     * 判断字符串是否为空，去除两端空白字符
     * @param str
     * @return
     */
    public static boolean isNull(String str) {
        if (null == str) {
            return true;
        }
        if (str.trim().length() == 0) {
            return true;
        }
        return false;
    }

    /**
     * 判断字符串是否非空，去除两端空白字符
     * @param str
     * @return
     */
    public static boolean isNotNull(String str) {
        return !isNull(str);
    }
}
