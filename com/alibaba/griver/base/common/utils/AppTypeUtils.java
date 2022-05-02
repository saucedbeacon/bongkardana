package com.alibaba.griver.base.common.utils;

import com.alibaba.ariver.app.api.Page;

public class AppTypeUtils {
    public static final String TYPE_H5 = "H5";
    public static final String TYPE_TINY = "TINY";

    public static boolean isTiny(String str) {
        return TYPE_TINY.equals(str);
    }

    public static boolean isH5(String str) {
        return "H5".equals(str);
    }

    public static boolean isEmbedPage(Page page) {
        if (page == null) {
            return false;
        }
        return page.getEmbedType().isEmbedPage();
    }
}
