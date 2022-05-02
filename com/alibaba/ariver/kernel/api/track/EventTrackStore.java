package com.alibaba.ariver.kernel.api.track;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EventTrackStore {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9133a = false;
    private int b = 15;
    public final Map<String, Object> fullLinkAttrMap = new ConcurrentHashMap();
    public final Map<String, Object> fullLinkOriginalUrlMap = new ConcurrentHashMap();
    public final Map<String, Object> fullLinkRequestMap = new ConcurrentHashMap();
    public boolean hasGotEmbedWebView = false;
    public boolean hasLogPageAbnormal = false;
    public boolean hasReceviedNBComponentRenderMsg = false;
    public boolean hasScriptChecked = false;
    public boolean isShowLoading = false;
    public final Map<String, JSONObject> jsapiCallDict = new ConcurrentHashMap();
    public boolean mainDocLoadFinish = false;
    public String pageToken = null;
    public final List<String> urlList = new ArrayList();
    public final Map<String, Object> whiteScreenAttrMap = new ConcurrentHashMap();

    public boolean apiCallIsFull() {
        if (!this.f9133a) {
            this.f9133a = true;
            int i = JSONUtils.getInt(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONObject("h5_fltConfig"), "apiCallCount", 0);
            if (i > 0) {
                this.b = i;
            }
        }
        return this.jsapiCallDict.size() >= this.b;
    }
}
