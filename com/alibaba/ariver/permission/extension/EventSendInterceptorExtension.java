package com.alibaba.ariver.permission.extension;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.security.EventSendInterceptorPoint;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import com.alibaba.fastjson.JSONObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class EventSendInterceptorExtension implements EventSendInterceptorPoint, NodeAware<Page> {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f10119a;
    private AuthenticationProxy b;
    private WeakReference<Page> c;

    public void onFinalized() {
    }

    static {
        ArrayList arrayList = new ArrayList();
        f10119a = arrayList;
        arrayList.add("JSPlugin_AlipayH5Share");
        f10119a.add(RVEvents.BEFORE_UNLOAD);
        f10119a.add("message");
        f10119a.add(RVEvents.NBCOMPONENT_CANRENDER);
    }

    public boolean needIntercept(String str, JSONObject jSONObject) {
        RVLogger.d("EventSendInterceptorExtension", "send event permission check action=".concat(String.valueOf(str)));
        Page page = this.c.get();
        if (page == null) {
            RVLogger.d("EventSendInterceptorExtension", "  page is recycle ,intercept event send");
            return true;
        }
        String string = BundleUtils.getString(page.getStartParams(), "appId");
        ApiPermissionCheckResult checkEventPermission = this.b.checkEventPermission(string, str, page);
        StringBuilder sb = new StringBuilder("app:");
        sb.append(string);
        sb.append("  send event permission check result is ");
        sb.append(checkEventPermission);
        RVLogger.d("EventSendInterceptorExtension", sb.toString());
        if (checkEventPermission == ApiPermissionCheckResult.IGNORE || f10119a.contains(str)) {
            return false;
        }
        RVLogger.d("EventSendInterceptorExtension", " event is no send permission and not in white list ,intercept");
        return true;
    }

    public void onInitialized() {
        this.b = (AuthenticationProxy) RVProxy.get(AuthenticationProxy.class);
    }

    public void setNode(WeakReference<Page> weakReference) {
        this.c = weakReference;
    }

    public Class<Page> getNodeType() {
        return Page.class;
    }
}
