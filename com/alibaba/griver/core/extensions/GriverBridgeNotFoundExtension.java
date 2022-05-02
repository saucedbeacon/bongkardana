package com.alibaba.griver.core.extensions;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.NativeCallNotFoundPoint;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.common.bridge.internal.DefaultBridgeCallback;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.resolver.ResultResolver;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.bridge.GriverBridgeCallNotFoundEvent;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.core.utils.i;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@Keep
public class GriverBridgeNotFoundExtension implements NativeCallNotFoundPoint, NodeAware<Page> {
    private static final String TAG = "GriverBridgeNotFoundExtension";
    private WeakReference<Page> pageWeakReference;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public boolean handleNotFound(NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper) {
        String str = "";
        if ("yes".equalsIgnoreCase(GriverInnerConfig.getConfig(GriverConfigConstants.KEY_BRIDGE_NOT_FOUND_EVENT_SWITCH, str))) {
            return false;
        }
        WeakReference<Page> weakReference = this.pageWeakReference;
        if (weakReference == null || weakReference.get() == null) {
            GriverLogger.w(TAG, "page is null, return directly");
            return false;
        }
        StringBuilder sb = new StringBuilder("not found internal extension for ");
        sb.append(nativeCallContext.getName());
        GriverLogger.d(TAG, sb.toString());
        GriverBridgeCallNotFoundEvent.BridgeContext bridgeContext = new GriverBridgeCallNotFoundEvent.BridgeContext();
        bridgeContext.jsapiName = nativeCallContext.getName();
        bridgeContext.page = this.pageWeakReference.get();
        bridgeContext.miniProgramPageURL = this.pageWeakReference.get().getOriginalURI();
        i.a(this.pageWeakReference.get(), bridgeContext);
        if (nativeCallContext.getParams() != null) {
            bridgeContext.jsParameters = new JSONObject((Map<String, Object>) nativeCallContext.getParams());
        }
        if (nativeCallContext.getRender() != null) {
            bridgeContext.context = nativeCallContext.getRender().getActivity();
            String appId = nativeCallContext.getRender().getAppId();
            if (BundleUtils.getBoolean(this.pageWeakReference.get().getApp().getStartParams(), RVParams.isH5App, false) && !TextUtils.isEmpty(appId)) {
                if (!TextUtils.equals(GriverBaseConstants.H5_PURE_ONLINE_ID, appId)) {
                    if (appId.endsWith(GriverBaseConstants.H5_ONLINE_SUFFIX)) {
                        str = appId.replace(GriverBaseConstants.H5_ONLINE_SUFFIX, str);
                    }
                }
                bridgeContext.miniProgramAppID = str;
            }
            str = appId;
            bridgeContext.miniProgramAppID = str;
        }
        return ExtensionPoint.as(GriverBridgeCallNotFoundEvent.class).node(this.pageWeakReference.get()).resolve(new ResultResolver<Boolean>() {
            public Boolean resolve(List<Boolean> list) {
                if (list == null || list.size() == 0) {
                    return Boolean.FALSE;
                }
                for (Boolean booleanValue : list) {
                    if (booleanValue.booleanValue()) {
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            }
        }).create().handleBridgeCallNotFound(bridgeContext, new DefaultBridgeCallback(bridgeResponseHelper));
    }

    public void setNode(WeakReference<Page> weakReference) {
        this.pageWeakReference = weakReference;
    }

    public Class<Page> getNodeType() {
        return Page.class;
    }
}
