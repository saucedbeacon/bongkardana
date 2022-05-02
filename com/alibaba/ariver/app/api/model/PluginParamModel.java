package com.alibaba.ariver.app.api.model;

import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;

public class PluginParamModel {
    public static final String PLUGIN_PAGE_PREFIX = "plugin-private://";

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f9955a = new JSONObject();

    public void putPluginConfig(String str, AppConfigModel appConfigModel) {
        for (String next : appConfigModel.getPageLaunchParams().keySet()) {
            String combinePath = FileUtils.combinePath(PLUGIN_PAGE_PREFIX.concat(String.valueOf(str)), next);
            Object obj = appConfigModel.getPageLaunchParams().get(next);
            StringBuilder sb = new StringBuilder("put plugin page param: ");
            sb.append(combinePath);
            sb.append(", ");
            sb.append(obj);
            RVLogger.d(RVConstants.RESOURCE_TAG, sb.toString());
            this.f9955a.put(combinePath, obj);
        }
    }

    public JSONObject getStartupParams() {
        return this.f9955a;
    }
}
