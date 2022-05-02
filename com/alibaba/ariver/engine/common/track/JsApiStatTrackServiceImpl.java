package com.alibaba.ariver.engine.common.track;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.proxy.RVJsStatTrackService;
import com.alibaba.ariver.engine.common.track.JsApiStatTrackStore;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.RVKernelUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class JsApiStatTrackServiceImpl implements RVJsStatTrackService {

    /* renamed from: a  reason: collision with root package name */
    private List<String> f10061a = Collections.synchronizedList(new ArrayList());
    public boolean sEnableTinyAppJsApiStat = false;

    public JsApiStatTrackServiceImpl() {
        boolean z = false;
        List<String> a2 = a();
        if (a2 != null) {
            this.f10061a.addAll(a2);
        }
        this.sEnableTinyAppJsApiStat = this.f10061a.size() > 0 ? true : z;
    }

    private List<String> a() {
        String[] split;
        RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
        String configWithProcessCache = rVConfigService != null ? rVConfigService.getConfigWithProcessCache("tinyapp_jsapi_whitelist_for_monitor", "") : null;
        if (TextUtils.isEmpty(configWithProcessCache) || (split = configWithProcessCache.split("\\|")) == null) {
            return null;
        }
        if (split.length != 1 || !"no".equalsIgnoreCase(split[0])) {
            return Arrays.asList(split);
        }
        return Collections.emptyList();
    }

    private boolean a(NativeCallContext nativeCallContext) {
        try {
            if (!this.sEnableTinyAppJsApiStat || nativeCallContext == null || !(nativeCallContext.getNode() instanceof Page) || ((Page) nativeCallContext.getNode()).getApp() == null || !((Page) nativeCallContext.getNode()).getApp().isTinyApp() || !((Page) nativeCallContext.getNode()).getApp().isFirstPage() || !this.f10061a.contains(nativeCallContext.getName())) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            RVLogger.e("AriverEngine:JsApiStatTrackServcieImpl", "recordJsApiInfoIfNeeded exception", th);
            return false;
        }
    }

    public void onCallDispatch(NativeCallContext nativeCallContext) {
        if (a(nativeCallContext)) {
            try {
                JsApiStatTrackStore jsApiStatTrackStore = (JsApiStatTrackStore) ((Page) nativeCallContext.getNode()).getData(JsApiStatTrackStore.class, true);
                if (!jsApiStatTrackStore.isJsApiDetail4TinyWithinT2Uploaded()) {
                    jsApiStatTrackStore.jsapiStatMap.put(nativeCallContext.getId(), new JsApiStatTrackStore.TinyAppJsApiStatInfo(nativeCallContext.getName(), System.currentTimeMillis(), 0));
                }
            } catch (Throwable th) {
                RVLogger.e("AriverEngine:JsApiStatTrackServcieImpl", "onCallDispatch exception", th);
            }
        }
    }

    public void onInvoke(NativeCallContext nativeCallContext) {
        JsApiStatTrackStore.TinyAppJsApiStatInfo tinyAppJsApiStatInfo;
        if (a(nativeCallContext)) {
            try {
                JsApiStatTrackStore jsApiStatTrackStore = (JsApiStatTrackStore) ((Page) nativeCallContext.getNode()).getData(JsApiStatTrackStore.class, true);
                if (!jsApiStatTrackStore.isJsApiDetail4TinyWithinT2Uploaded() && (tinyAppJsApiStatInfo = (JsApiStatTrackStore.TinyAppJsApiStatInfo) jsApiStatTrackStore.jsapiStatMap.get(nativeCallContext.getId())) != null) {
                    tinyAppJsApiStatInfo.invokeTs = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                RVLogger.e("AriverEngine:JsApiStatTrackServcieImpl", "onInvoke exception", th);
            }
        }
    }

    public void onSendBack(NativeCallContext nativeCallContext) {
        JsApiStatTrackStore.TinyAppJsApiStatInfo tinyAppJsApiStatInfo;
        if (a(nativeCallContext)) {
            try {
                JsApiStatTrackStore jsApiStatTrackStore = (JsApiStatTrackStore) ((Page) nativeCallContext.getNode()).getData(JsApiStatTrackStore.class, true);
                if (!jsApiStatTrackStore.isJsApiDetail4TinyWithinT2Uploaded() && (tinyAppJsApiStatInfo = (JsApiStatTrackStore.TinyAppJsApiStatInfo) jsApiStatTrackStore.jsapiStatMap.get(nativeCallContext.getId())) != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    jsApiStatTrackStore.appendJsApiDetail4TinyWithT2(tinyAppJsApiStatInfo.name, currentTimeMillis - tinyAppJsApiStatInfo.callTs, tinyAppJsApiStatInfo.invokeTs - tinyAppJsApiStatInfo.callTs, currentTimeMillis, elapsedRealtime);
                }
            } catch (Throwable th) {
                RVLogger.e("AriverEngine:JsApiStatTrackServcieImpl", "onSendBack exception", th);
            }
        }
    }

    public void writeJsApiStatToMap(Node node, Map<String, String> map) {
        JsApiStatTrackStore jsApiStatTrackStore;
        if (this.sEnableTinyAppJsApiStat && map != null && node != null) {
            try {
                if ((node instanceof Page) && (jsApiStatTrackStore = (JsApiStatTrackStore) ((Page) node).getData(JsApiStatTrackStore.class, false)) != null) {
                    String jsApiDetail4TinyWithT2 = jsApiStatTrackStore.getJsApiDetail4TinyWithT2();
                    if (!TextUtils.isEmpty(jsApiDetail4TinyWithT2)) {
                        map.put("tinyapp_jsapi_stat_within_t2", jsApiDetail4TinyWithT2);
                        if (RVKernelUtils.isDebug()) {
                            RVLogger.d("AriverEngine:JsApiStatTrackServcieImpl", "tinyapp_jsapi_stat_within_t2: ".concat(String.valueOf(jsApiDetail4TinyWithT2)));
                        }
                        jsApiStatTrackStore.setJsApiDetail4TinyWithinT2Uploaded(true);
                        jsApiStatTrackStore.clear();
                    }
                }
            } catch (Throwable th) {
                RVLogger.e("AriverEngine:JsApiStatTrackServcieImpl", "writeJsApiStatToMap exception", th);
            }
        }
    }
}
