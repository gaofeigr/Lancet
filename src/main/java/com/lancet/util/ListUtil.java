package com.lancet.util;

import java.util.List;

/**
 * @Description 集合常用工具类
 * @Date 2019-2-20 21:46
 * @Author GaoFei
 * @Version 1.0
 **/
public final class ListUtil {
    /**
     * 当前集合是否为空
     * @param list
     * @return
     */
    public static boolean isEmpty(List list) {
        boolean result = false;
        if (null == list) {
            result = true;
        } else if (list.isEmpty()) {
            result = true;
        }
        return result;
    }

    /**
     * 当前集合是否不为空
     * @param list
     * @return
     */
    public static boolean isNotEmpty(List list) {
        return !isEmpty(list);
    }
}
