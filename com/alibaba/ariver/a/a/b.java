package com.alibaba.ariver.a.a;

import com.alibaba.ariver.app.api.Page;

public class b {
    public static String a(Page page) {
        StringBuilder sb = new StringBuilder("bridge_token_");
        sb.append(page.getNodeId());
        return sb.toString();
    }
}
