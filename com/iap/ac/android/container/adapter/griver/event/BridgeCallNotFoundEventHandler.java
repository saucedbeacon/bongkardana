package com.iap.ac.android.container.adapter.griver.event;

import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.griver.api.bridge.GriverBridgeCallNotFoundEvent;
import com.iap.ac.android.common.container.interceptor.NotFoundJSAPIInterceptor;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.container.adapter.griver.IAPBridgeCallbackAdapter;
import com.iap.ac.android.container.adapter.griver.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BridgeCallNotFoundEventHandler implements GriverBridgeCallNotFoundEvent {
    private static final String TAG = "BridgeCallNotFoundEventHandler";
    @NonNull
    private static final List<NotFoundJSAPIInterceptor> sNotFoundJSAPIInterceptors = Collections.synchronizedList(new ArrayList());

    public static void registerNotFoundJSAPIInterceptor(@NonNull NotFoundJSAPIInterceptor notFoundJSAPIInterceptor) {
        sNotFoundJSAPIInterceptors.add(notFoundJSAPIInterceptor);
    }

    public void onInitialized() {
        ACLog.d(TAG, "onInitialized");
    }

    public void onFinalized() {
        ACLog.d(TAG, "onFinalized");
    }

    public boolean handleBridgeCallNotFound(GriverBridgeCallNotFoundEvent.BridgeContext bridgeContext, BridgeCallback bridgeCallback) {
        ACLog.i(TAG, String.format("handleBridgeCallNotFound: appId = %s, jsapiName = %s, params = %s", new Object[]{bridgeContext.miniProgramAppID, bridgeContext.jsapiName, bridgeContext.jsParameters}));
        NotFoundJSAPIInterceptor.NotFoundJSAPIContext createBridgeContext = createBridgeContext(bridgeContext);
        IAPBridgeCallbackAdapter from = IAPBridgeCallbackAdapter.from(bridgeCallback);
        synchronized (sNotFoundJSAPIInterceptors) {
            for (NotFoundJSAPIInterceptor next : sNotFoundJSAPIInterceptors) {
                if (next.handleNotFoundJSAPI(createBridgeContext, from)) {
                    ACLog.i(TAG, String.format("[handleNotFoundJSAPI] interceptor success: appId = %s, jsapiName = %s, interceptor = %s", new Object[]{bridgeContext.miniProgramAppID, bridgeContext.jsapiName, next.getClass().getName()}));
                    return true;
                }
            }
            ACLog.e(TAG, String.format("[handleNotFoundJSAPI] interceptor failure: appId = %s, jsapiName = %s", new Object[]{bridgeContext.miniProgramAppID, bridgeContext.jsapiName}));
            return false;
        }
    }

    @NonNull
    private NotFoundJSAPIInterceptor.NotFoundJSAPIContext createBridgeContext(@NonNull GriverBridgeCallNotFoundEvent.BridgeContext bridgeContext) {
        NotFoundJSAPIInterceptor.NotFoundJSAPIContext notFoundJSAPIContext = new NotFoundJSAPIInterceptor.NotFoundJSAPIContext();
        notFoundJSAPIContext.context = bridgeContext.context;
        notFoundJSAPIContext.jsParameters = Utils.fastJsonToJson(bridgeContext.jsParameters);
        notFoundJSAPIContext.miniProgramAppID = bridgeContext.miniProgramAppID;
        notFoundJSAPIContext.miniProgramPageURL = bridgeContext.miniProgramPageURL;
        notFoundJSAPIContext.sourceSite = bridgeContext.sourceSite;
        notFoundJSAPIContext.acParams = Utils.fastJsonToJson(bridgeContext.acParams);
        notFoundJSAPIContext.miniProgramName = bridgeContext.miniProgramName;
        notFoundJSAPIContext.jsapiName = bridgeContext.jsapiName;
        PageContext pageContext = bridgeContext.page.getPageContext();
        if (pageContext != null) {
            notFoundJSAPIContext.activity = pageContext.getActivity();
        }
        return notFoundJSAPIContext;
    }
}
