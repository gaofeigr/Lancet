package com.lancet.util;

import java.util.Collection;
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
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection collection) {
        if (null == collection) {
            return true;
        }
        return collection.isEmpty();
    }

    /**
     * 当前集合是否不为空
     * @param collection
     * @return
     */
    public static boolean isNotEmpty(Collection collection) {
        return !isEmpty(collection);
    }
}
