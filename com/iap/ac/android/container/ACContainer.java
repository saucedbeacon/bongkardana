package com.iap.ac.android.container;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.container.IContainer;
import com.iap.ac.android.common.container.event.ContainerEvent;
import com.iap.ac.android.common.container.event.ContainerEventFilter;
import com.iap.ac.android.common.container.event.IContainerListener;
import com.iap.ac.android.common.container.js.plugin.BaseJSPlugin;
import com.iap.ac.android.common.container.model.ContainerParams;
import com.iap.ac.android.common.container.plugin.BaseContainerPlugin;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.container.activity.ACContainerActivity;
import com.iap.ac.android.container.constant.ContainerKeys;
import com.iap.ac.android.container.constant.LogEventKeys;
import com.iap.ac.android.container.constant.LogEventName;
import com.iap.ac.android.container.js.ACJSBridge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public enum ACContainer implements IContainer {
    INSTANCE;
    
    public static boolean DEBUG = false;
    private static final String TAG = "ACContainer";
    private Map<String, IContainerListener> containerListenerMap;
    private Map<String, CopyOnWriteArrayList<BaseContainerPlugin>> pluginMap;
    private Map<String, Object> providerMap;

    static {
        DEBUG = false;
    }

    public final void startContainer(@NonNull Context context, @NonNull String str) {
        startContainer(context, str, (IContainerListener) null);
    }

    public final void startContainer(@NonNull Context context, @NonNull String str, @Nullable IContainerListener iContainerListener) {
        Context context2 = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        int i = 0;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(2042439380, oncanceled);
                onCancelLoad.getMin(2042439380, oncanceled);
            }
        }
        if (context != null) {
            context2 = context.getApplicationContext();
        }
        if (context2 != null) {
            if (str != null) {
                i = str.length();
            }
            int min2 = dispatchOnCancelled.getMin(context2, i);
            if (i != min2) {
                onCanceled oncanceled2 = new onCanceled(i, min2, 32);
                onCancelLoad.setMax(2042439380, oncanceled2);
                onCancelLoad.getMin(2042439380, oncanceled2);
            }
        }
        startContainer(context, new ContainerParams(str), iContainerListener);
    }

    public final void startContainer(@NonNull Context context, @NonNull ContainerParams containerParams) {
        startContainer(context, containerParams, (IContainerListener) null);
    }

    public final void startContainer(@NonNull Context context, @NonNull ContainerParams containerParams, @Nullable IContainerListener iContainerListener) {
        if (TextUtils.isEmpty(containerParams.url)) {
            HashMap hashMap = new HashMap();
            hashMap.put(LogEventKeys.SDK_VERSION, BuildConfig.VERSION_NAME);
            hashMap.put("parameters", "url");
            ACMonitor.logEvent(new LogEvent(LogEventName.INVALID_CONTAINER_START_PARAMS, hashMap));
            return;
        }
        Intent intent = new Intent(context, ACContainerActivity.class);
        intent.putExtra("url", containerParams.url);
        intent.putExtra(ContainerKeys.PARAM_START_METHOD, containerParams.startMethod.value);
        intent.putExtra(ContainerKeys.PARAM_POST_PARAMS, containerParams.postParams);
        if (containerParams.containerBundle != null) {
            intent.putExtras(containerParams.containerBundle);
        }
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        String generatePageId = generatePageId(containerParams.url);
        intent.putExtra(ContainerKeys.PARAM_PAGE_ID, generatePageId);
        if (iContainerListener != null) {
            this.containerListenerMap.put(generatePageId, iContainerListener);
        }
        intent.putExtra(ContainerKeys.PARAM_START_TIME, System.currentTimeMillis());
        context.startActivity(intent);
    }

    private String generatePageId(@NonNull String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.hashCode());
        sb.append("_");
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    public final synchronized boolean registerPlugin(BaseContainerPlugin baseContainerPlugin) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (baseContainerPlugin == null) {
            ACLog.w(TAG, "Invalid plugin parameter! Plugin is null.");
            return false;
        }
        try {
            Iterator<String> actionIterator = baseContainerPlugin.onPrepare(new ContainerEventFilter()).actionIterator();
            if (!actionIterator.hasNext()) {
                ACLog.w(TAG, "Empty plugin filter!");
                return false;
            }
            while (actionIterator.hasNext()) {
                String next = actionIterator.next();
                if (TextUtils.isEmpty(next)) {
                    ACLog.w(TAG, "Event can't be empty!");
                } else {
                    if (!this.pluginMap.containsKey(next)) {
                        copyOnWriteArrayList = new CopyOnWriteArrayList();
                        this.pluginMap.put(next, copyOnWriteArrayList);
                    } else {
                        copyOnWriteArrayList = this.pluginMap.get(next);
                        if (copyOnWriteArrayList == null) {
                            copyOnWriteArrayList = new CopyOnWriteArrayList();
                        } else if (copyOnWriteArrayList.contains(baseContainerPlugin)) {
                            StringBuilder sb = new StringBuilder("Plugin already registered. Plugin: ");
                            sb.append(baseContainerPlugin.getClass().getName());
                            ACLog.w(TAG, sb.toString());
                            return false;
                        }
                    }
                    copyOnWriteArrayList.add(baseContainerPlugin);
                }
            }
            return true;
        } catch (Exception e) {
            ACLog.e(TAG, "Prepare plugin fail! ", e);
            return false;
        }
    }

    public final synchronized void unregisterPlugin(BaseContainerPlugin baseContainerPlugin) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (baseContainerPlugin == null) {
            ACLog.w(TAG, "unregisterPlugin: Invalid plugin parameter! Plugin is null.");
            return;
        }
        try {
            Iterator<String> actionIterator = baseContainerPlugin.onPrepare(new ContainerEventFilter()).actionIterator();
            if (!actionIterator.hasNext()) {
                ACLog.w(TAG, "unregisterPlugin: Empty plugin filter!");
                return;
            }
            while (actionIterator.hasNext()) {
                String next = actionIterator.next();
                if (TextUtils.isEmpty(next)) {
                    ACLog.w(TAG, "unregisterPlugin: Event can't be empty!");
                } else if (this.pluginMap.containsKey(next) && (copyOnWriteArrayList = this.pluginMap.get(next)) != null && !copyOnWriteArrayList.isEmpty() && copyOnWriteArrayList.contains(baseContainerPlugin)) {
                    copyOnWriteArrayList.remove(baseContainerPlugin);
                    this.pluginMap.put(next, copyOnWriteArrayList);
                }
            }
        } catch (Exception e) {
            ACLog.e(TAG, "unregisterPlugin: Prepare plugin fail! ", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void setProvider(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Object r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = "ACContainer"
            java.lang.String r3 = "setProvider error: providerName is empty!"
            com.iap.ac.android.common.log.ACLog.w((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r1)
            return
        L_0x0010:
            if (r3 != 0) goto L_0x0023
            java.lang.String r3 = "ACContainer"
            java.lang.String r0 = "setProvider error: provider is null for: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r0.concat(r2)     // Catch:{ all -> 0x002e }
            com.iap.ac.android.common.log.ACLog.w((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ all -> 0x002e }
            monitor-exit(r1)
            return
        L_0x0023:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.providerMap     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x002c
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.providerMap     // Catch:{ all -> 0x002e }
            r0.put(r2, r3)     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r1)
            return
        L_0x002e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.container.ACContainer.setProvider(java.lang.String, java.lang.Object):void");
    }

    public final boolean handleContainerEvent(ContainerEvent containerEvent) {
        List<BaseContainerPlugin> pluginList = getPluginList(containerEvent);
        if (pluginList == null) {
            ACLog.d(TAG, "handleContainerEvent: didn't find any plugin to handle event: ".concat(String.valueOf(containerEvent)));
            return false;
        }
        for (BaseContainerPlugin next : pluginList) {
            if (next != null && next.handleEvent(containerEvent)) {
                StringBuilder sb = new StringBuilder("ContainerEvent handled by plugin: ");
                sb.append(next.getClass().getName());
                sb.append(", action=");
                sb.append(containerEvent.action);
                ACLog.d(TAG, sb.toString());
                return true;
            }
        }
        return false;
    }

    public final boolean interceptContainerEvent(ContainerEvent containerEvent) {
        List<BaseContainerPlugin> pluginList = getPluginList(containerEvent);
        if (pluginList == null) {
            ACLog.d(TAG, "interceptContainerEvent: didn't find any plugin to intercept event: ".concat(String.valueOf(containerEvent)));
            return false;
        }
        int size = pluginList.size() - 1;
        while (size >= 0) {
            BaseContainerPlugin baseContainerPlugin = pluginList.get(size);
            if (baseContainerPlugin == null || !baseContainerPlugin.interceptorEvent(containerEvent)) {
                size--;
            } else {
                StringBuilder sb = new StringBuilder("ContainerEvent intercepted by plugin: ");
                sb.append(baseContainerPlugin.getClass().getName());
                sb.append(", action=");
                sb.append(containerEvent.action);
                ACLog.d(TAG, sb.toString());
                return true;
            }
        }
        return false;
    }

    private synchronized List<BaseContainerPlugin> getPluginList(ContainerEvent containerEvent) {
        if (containerEvent != null) {
            if (!TextUtils.isEmpty(containerEvent.action)) {
                if (this.pluginMap != null) {
                    if (!this.pluginMap.isEmpty()) {
                        List<BaseContainerPlugin> list = this.pluginMap.get(containerEvent.action);
                        if (list != null && !list.isEmpty()) {
                            return list;
                        }
                        StringBuilder sb = new StringBuilder("getPluginList error: Plugin list is empty for action: ");
                        sb.append(containerEvent.action);
                        ACLog.d(TAG, sb.toString());
                        return null;
                    }
                }
                ACLog.d(TAG, "getPluginList error: Plugin map is empty!");
                return null;
            }
        }
        ACLog.w(TAG, "getPluginList error: containerEvent is null or action is null.");
        return null;
    }

    public final synchronized Object getProvider(String str) {
        if (this.providerMap != null) {
            if (!this.providerMap.isEmpty()) {
                return this.providerMap.get(str);
            }
        }
        return null;
    }

    public final synchronized void registerJSAPIPlugin(BaseJSPlugin baseJSPlugin) {
        ACJSBridge.getInstance().registerJSAPIPlugin(baseJSPlugin);
    }

    public final synchronized void unregisterJSAPIPlugin(BaseJSPlugin baseJSPlugin) {
        ACJSBridge.getInstance().unregisterJSAPIPlugin(baseJSPlugin);
    }

    public final void onDestroy(String str, Bundle bundle) {
        IContainerListener remove;
        if (!TextUtils.isEmpty(str) && (remove = this.containerListenerMap.remove(str)) != null) {
            remove.onContainerDestroyed(bundle);
        }
    }

    public final void onCreate(String str, Bundle bundle) {
        IContainerListener iContainerListener;
        if (bundle != null && bundle.containsKey(ContainerKeys.PARAM_START_TIME)) {
            long j = bundle.getLong(ContainerKeys.PARAM_START_TIME);
            if (j > 0) {
                long currentTimeMillis = System.currentTimeMillis() - j;
                HashMap hashMap = new HashMap();
                hashMap.put(LogEventKeys.SDK_VERSION, BuildConfig.VERSION_NAME);
                hashMap.put("duration", String.valueOf(currentTimeMillis));
                ACMonitor.logEvent(new LogEvent(LogEventName.CONTAINER_START, hashMap));
            }
        }
        if (!TextUtils.isEmpty(str) && (iContainerListener = this.containerListenerMap.get(str)) != null) {
            iContainerListener.onContainerCreated(bundle);
        }
    }
}
