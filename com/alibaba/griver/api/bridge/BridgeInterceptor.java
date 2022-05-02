package com.alibaba.griver.api.bridge;

import android.content.Context;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;

public interface BridgeInterceptor {

    public static class InterceptContext {
        public JSONObject acParams;
        public Context context;
        public JSONObject jsParameters;
        public String miniProgramAppID;
        public String miniProgramName;
        public String miniProgramPageURL;
        public Page page;
        public String sourceSite;
    }

    boolean willHandleJSAPI(String str, InterceptContext interceptContext, BridgeCallback bridgeCallback);
}
