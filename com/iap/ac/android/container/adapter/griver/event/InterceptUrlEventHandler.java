package com.iap.ac.android.container.adapter.griver.event;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.common.page.GriverInterceptUrlEvent;
import com.iap.ac.android.common.container.constant.ContainerEventAction;
import com.iap.ac.android.common.container.event.ContainerEvent;
import com.iap.ac.android.common.container.plugin.BaseContainerPlugin;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.container.adapter.griver.GriverContainerPresenter;
import org.json.JSONException;
import org.json.JSONObject;

public class InterceptUrlEventHandler implements GriverInterceptUrlEvent {
    private static final String TAG = "InterceptUrlEventHandler";
    private static BaseContainerPlugin plugin;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public static void setPlugin(BaseContainerPlugin baseContainerPlugin) {
        plugin = baseContainerPlugin;
    }

    public boolean interceptUrl(Page page, String str) {
        ACLog.d(TAG, "interceptUrl url == ".concat(String.valueOf(str)));
        if (plugin == null) {
            return false;
        }
        ContainerEvent containerEvent = new ContainerEvent(ContainerEventAction.ACTION_WEB_PAGE_SHOULD_OVERRIDE_URL, new GriverContainerPresenter(page));
        containerEvent.params = new JSONObject();
        try {
            containerEvent.params.put("url", str);
        } catch (JSONException e) {
            ACLog.e(TAG, String.valueOf(e));
        }
        boolean interceptorEvent = plugin.interceptorEvent(containerEvent);
        RVLogger.d(TAG, "interceptUrl == result ".concat(String.valueOf(interceptorEvent)));
        return interceptorEvent;
    }
}
