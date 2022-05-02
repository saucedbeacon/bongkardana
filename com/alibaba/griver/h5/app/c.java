package com.alibaba.griver.h5.app;

import com.alibaba.griver.base.common.constants.GriverBaseConstants;

public class c {
    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(GriverBaseConstants.H5_ONLINE_SUFFIX);
        return sb.toString();
    }
}
