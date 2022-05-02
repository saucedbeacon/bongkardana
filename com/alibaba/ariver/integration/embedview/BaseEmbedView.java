package com.alibaba.ariver.integration.embedview;

import android.view.Surface;
import android.webkit.ValueCallback;
import androidx.annotation.CallSuper;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.TypeUtils;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.runtime.ResourceContextManager;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

@Keep
public abstract class BaseEmbedView implements IEmbedView {
    protected App mOuterApp;
    protected Page mOuterPage;
    protected String mViewId;

    public void onSurfaceAvailable(Surface surface, int i, int i2, ValueCallback<Integer> valueCallback) {
    }

    public boolean onSurfaceDestroyed(Surface surface) {
        return false;
    }

    public void onSurfaceSizeChanged(Surface surface, int i, int i2) {
    }

    public void triggerPreSnapshot() {
    }

    @CallSuper
    public void onCreate(Map<String, String> map) {
        this.mOuterApp = ((AppManager) RVProxy.get(AppManager.class)).findApp(TypeUtils.parseLong(map.get(RVConstants.EXTRA_APP_INSTANCE_ID)));
        this.mOuterPage = this.mOuterApp.getPageByNodeId(TypeUtils.parseLong(map.get(RVConstants.EXTRA_PAGE_INSTANCE_ID)));
        this.mViewId = map.get(RVConstants.EXTRA_EMBED_VIEW_ID);
    }

    public void onParamChanged(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length == strArr2.length) {
            for (int i = 0; i < strArr.length; i++) {
                if ("id".equals(strArr[i])) {
                    this.mViewId = strArr2[i];
                }
            }
        }
    }

    public void sendEvent(String str, JSONObject jSONObject, final IEmbedCallback iEmbedCallback) {
        if (this.mOuterPage != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (!str.equals(RVEvents.ON_TO_WEBVIEW_MESSAGE)) {
                StringBuilder sb = new StringBuilder("nbcomponent.");
                sb.append(getType());
                sb.append(".");
                sb.append(str);
                str = sb.toString();
            }
            if (jSONObject != null) {
                jSONObject.put("element", (Object) this.mViewId);
                jSONObject2.put("data", (Object) jSONObject);
            }
            EngineUtils.sendToRender(this.mOuterPage.getRender(), str, jSONObject2, new SendToRenderCallback() {
                public void onCallBack(JSONObject jSONObject) {
                    IEmbedCallback iEmbedCallback = iEmbedCallback;
                    if (iEmbedCallback != null) {
                        iEmbedCallback.onResponse(jSONObject);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("You should call super.onCreate first!!!");
    }

    @Nullable
    public Resource getResource(String str) {
        ResourceContext resourceContext = ResourceContextManager.getInstance().get(this.mOuterPage.getApp().getAppId());
        if (resourceContext == null || resourceContext.getContentProvider() == null) {
            return null;
        }
        return resourceContext.getContentProvider().getContent(str);
    }

    @CallSuper
    public void onDestroy() {
        this.mOuterPage = null;
    }

    public Page getOuterPage() {
        return this.mOuterPage;
    }

    public String getViewId() {
        return this.mViewId;
    }
}
