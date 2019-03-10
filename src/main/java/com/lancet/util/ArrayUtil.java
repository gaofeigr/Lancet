package com.lancet.util;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description 常用数组操作工具类
 * @Date 2019-3-7 22:52
 * @Author GaoFei
 * @Version 1.0
 **/
public class ArrayUtil {

    /**
     * 数组是否为空
     * @param array
     * @return
     */
    public static boolean isEmpty(Object[] array) {
        if (null == array || array.length == 0) {
            return true;
        }
        return false;
    }

    /**
     * 数组是否不为空
     * @param array
     * @return
     */
    public static boolean isNotEmpty(Object[] array) {
        return !isEmpty(array);
    }

    /**
     * 数组是否不为空
     * @param array
     * @return
     */
    public static Object[] clearEmptyItem(Object[] array) {
        if (ArrayUtil.isNotEmpty(array)) {
            List result = new ArrayList();
            for (Object item : array) {
                if (null != item && StringUtil.isNotNull(item.toString())) {
                    result.add(item);
                }
            }
            return result.toArray();
        } else {
            return new Object[]{};
        }
    }
}
