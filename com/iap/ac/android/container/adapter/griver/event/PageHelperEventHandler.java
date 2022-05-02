package com.iap.ac.android.container.adapter.griver.event;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.page.GriverPageHelperEvent;
import com.iap.ac.android.common.container.constant.ContainerEventAction;
import com.iap.ac.android.common.container.event.ContainerEvent;
import com.iap.ac.android.common.container.plugin.BaseContainerPlugin;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.container.adapter.griver.GriverContainerPresenter;
import org.json.JSONException;
import org.json.JSONObject;

public class PageHelperEventHandler implements GriverPageHelperEvent {
    private static final String TAG = "AppEventHandler";
    private static BaseContainerPlugin plugin;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onPageBacked(Page page) {
    }

    public void onPageDestroy(Page page) {
    }

    public void onPageExit(Page page) {
    }

    public void onPagePause(Page page) {
    }

    public void onPageResume(Page page) {
    }

    public void onProgressChanged(Page page, String str, int i) {
    }

    public static void setPlugin(BaseContainerPlugin baseContainerPlugin) {
        plugin = baseContainerPlugin;
    }

    public void onPageStarted(Page page, String str) {
        ACLog.d(TAG, "onPageStarted url == ".concat(String.valueOf(str)));
        if (plugin != null) {
            ContainerEvent containerEvent = new ContainerEvent(ContainerEventAction.ACTION_WEB_PAGE_STARTED, new GriverContainerPresenter(page));
            containerEvent.params = new JSONObject();
            try {
                containerEvent.params.put("url", str);
            } catch (JSONException unused) {
            }
            plugin.interceptorEvent(containerEvent);
        }
    }

    public void onPageFinished(Page page, String str) {
        ACLog.d(TAG, "onPageFinished url == ".concat(String.valueOf(str)));
        if (plugin != null) {
            ContainerEvent containerEvent = new ContainerEvent(ContainerEventAction.ACTION_WEB_PAGE_FINISHED, new GriverContainerPresenter(page));
            containerEvent.params = new JSONObject();
            try {
                containerEvent.params.put("url", str);
            } catch (JSONException unused) {
            }
            plugin.interceptorEvent(containerEvent);
        }
    }
}
