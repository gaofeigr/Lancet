package com.lancet.util;

import java.util.ResourceBundle;

/**
 * @Description 资源文件工具类
 * @Date 2019-2-28 20:53
 * @Author GaoFei
 * @Version 1.0
 **/
public class ResourceUtil {

    private static String PREFIX = "com.lancet.";

    private static String SUFFIX = ".Application";

    /**
     * 获取资源
     * @param key
     * @return
     */
    public static String getResource(String key, String bundle) throws Exception {
        if (StringUtil.isNull(key)) {
            throw new Exception("key 不能为空！");
        }
        String resource = PREFIX + bundle + key + SUFFIX;
        return ResourceBundle.getBundle(resource).getString(key);
    }
}
