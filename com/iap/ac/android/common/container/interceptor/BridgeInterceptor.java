package com.iap.ac.android.common.container.interceptor;

import android.app.Activity;
import android.content.Context;
import org.json.JSONObject;

public interface BridgeInterceptor {

    public static class InterceptContext {
        public JSONObject acParams;
        public Activity activity;
        public Context context;
        public boolean isMiniProgram;
        public JSONObject jsParameters;
        public String miniProgramAppID;
        public String miniProgramName;
        public String miniProgramPageURL;
        public String sourceSite;
    }

    boolean willHandleJSAPI(String str, InterceptContext interceptContext, BridgeCallback bridgeCallback);
}
