package com.lancet.util;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description 字符串工具类
 * @Date 2019-2-28 21:17
 * @Author GaoFei
 * @Version 1.0
 **/
public class StringUtil {
    /**
     * 判断字符串是否为空，去除两端空白字符
     * @param content
     * @return
     */
    public static boolean isNull(String content) {
        if (null == content) {
            return true;
        }
        if (content.trim().length() == 0) {
            return true;
        }
        return false;
    }

    /**
     * 判断字符串是否非空，去除两端空白字符
     * @param content
     * @return
     */
    public static boolean isNotNull(String content) {
        return !isNull(content);
    }

    /**
     * 根据正则获取字符串中包含的所有子字符串
     * @param content 完整字符串
     * @param patternStr 正则
     * @return
     */
    public static String[] findAllStr(String content, String patternStr) {
        List<String> resultList = new ArrayList<String>();
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            resultList.add(matcher.group());
        }
        String[] resultArray = new String[resultList.size()];
        return resultList.toArray(resultArray);
    }

    /**
     * 根据正则获取字符串中包含的子字符串
     * @param content 完整字符串
     * @param patternStr 正则
     * @return
     */
    public static String findStr(String content, String patternStr) {
        String resultStr = "";
        List<String> resultList = new ArrayList<String>();
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            resultList.add(matcher.group());
        }
        resultStr = ListUtil.isEmpty(resultList) ? "" : resultList.get(0);
        return resultStr;
    }

    /**
     * 根据正则判断字符串中手否包含子字符串
     * @param content 完整字符串
     * @param patternStr 正则
     * @return
     */
    public static boolean isContainsStr(String content, String patternStr) {
        return Pattern.matches(patternStr, content);
    }
}
