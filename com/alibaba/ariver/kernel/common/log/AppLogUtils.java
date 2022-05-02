package com.alibaba.ariver.kernel.common.log;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.api.node.DataNode;
import com.alibaba.ariver.kernel.api.node.Node;

public class AppLogUtils {
    public static String getParentId(Node node) {
        AppLogContext appLogContext;
        if (node == null) {
            return "";
        }
        if ((node instanceof DataNode) && (appLogContext = (AppLogContext) ((DataNode) node).getData(AppLogContext.class)) != null) {
            String pageLogToken = appLogContext.getPageLogToken();
            if (!TextUtils.isEmpty(pageLogToken)) {
                return pageLogToken;
            }
        }
        StringBuilder sb = new StringBuilder("");
        sb.append(node.getNodeId());
        return sb.toString();
    }
}
