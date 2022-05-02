package com.iap.ac.android.container.adapter.griver.event;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.App;
import com.alibaba.griver.api.common.page.GriverAppEvent;
import com.iap.ac.android.common.container.event.IContainerListener;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.container.adapter.griver.constant.GriverAdapterKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppEventHandler implements GriverAppEvent {
    private static final String TAG = "AppEventHandler";
    private static Map<String, IContainerListener> containerListenerMap = new HashMap();
    private static List<IContainerListener> globalContainerListenerMap = new ArrayList();

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public static void addContainerListener(@NonNull String str, IContainerListener iContainerListener) {
        if (iContainerListener != null) {
            containerListenerMap.put(str, iContainerListener);
        }
    }

    public static void addContainerListener(IContainerListener iContainerListener) {
        if (iContainerListener != null && !globalContainerListenerMap.contains(iContainerListener)) {
            globalContainerListenerMap.add(iContainerListener);
        }
    }

    public static void removeContainerListener(IContainerListener iContainerListener) {
        if (iContainerListener != null) {
            globalContainerListenerMap.remove(iContainerListener);
        }
    }

    public void onAppStart(App app) {
        ACLog.d(TAG, "onAppStart");
        Bundle startParams = app.getStartParams();
        if (startParams == null) {
            ACLog.d(TAG, "onAppExit bundle is null");
            return;
        }
        List<IContainerListener> list = globalContainerListenerMap;
        if (list != null) {
            for (IContainerListener onContainerCreated : list) {
                onContainerCreated.onContainerCreated(app.getStartParams());
            }
        }
        String string = startParams.getString(GriverAdapterKeys.PARAM_PAGE_ID);
        if (TextUtils.isEmpty(string)) {
            ACLog.d(TAG, "onAppExit pageId is empty");
            return;
        }
        IContainerListener iContainerListener = containerListenerMap.get(string);
        if (iContainerListener != null) {
            iContainerListener.onContainerCreated(app.getStartParams());
        }
    }

    public void onAppExit(App app) {
        ACLog.d(TAG, "onAppExit");
        Bundle startParams = app.getStartParams();
        if (startParams == null) {
            ACLog.d(TAG, "onAppExit bundle is null");
            return;
        }
        String string = startParams.getString(GriverAdapterKeys.PARAM_PAGE_ID);
        if (TextUtils.isEmpty(string)) {
            ACLog.d(TAG, "onAppExit pageId is empty");
            return;
        }
        IContainerListener remove = containerListenerMap.remove(string);
        if (remove != null) {
            remove.onContainerDestroyed(app.getStartParams());
        }
        for (IContainerListener onContainerDestroyed : globalContainerListenerMap) {
            onContainerDestroyed.onContainerDestroyed(app.getStartParams());
        }
    }
}
