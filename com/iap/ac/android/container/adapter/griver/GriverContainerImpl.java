package com.iap.ac.android.container.adapter.griver;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.integration.RVInitializer;
import com.alibaba.griver.api.bridge.BridgeInterceptor;
import com.alibaba.griver.api.bridge.GriverBridgeCallNotFoundEvent;
import com.alibaba.griver.api.common.GriverExtensionManifest;
import com.alibaba.griver.api.common.menu.GriverACMenuExtension;
import com.alibaba.griver.api.common.page.GriverAppEvent;
import com.alibaba.griver.api.common.page.GriverInterceptUrlEvent;
import com.alibaba.griver.api.common.page.GriverPageHelperEvent;
import com.alibaba.griver.api.common.webview.GriverUserAgentExtension;
import com.alibaba.griver.api.h5.permission.GriverH5JSAPIPermissionExtension;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.rpc.OnRpcResultListener;
import com.alibaba.griver.core.Griver;
import com.alibaba.griver.core.bridge.BridgeInterceptorManager;
import com.alibaba.griver.core.model.applist.AppInfosResult;
import com.alibaba.griver.core.model.applist.FetchAppsByIdsRequest;
import com.alibaba.griver.core.point.GriverEventManifest;
import com.iap.ac.android.common.container.IContainer;
import com.iap.ac.android.common.container.auth.IContainerAuth;
import com.iap.ac.android.common.container.callback.Callback;
import com.iap.ac.android.common.container.constant.ContainerEventAction;
import com.iap.ac.android.common.container.event.ContainerEventFilter;
import com.iap.ac.android.common.container.event.IContainerListener;
import com.iap.ac.android.common.container.interceptor.BridgeInterceptor;
import com.iap.ac.android.common.container.interceptor.NotFoundJSAPIInterceptor;
import com.iap.ac.android.common.container.model.AppInfoListData;
import com.iap.ac.android.common.container.model.CloseAppParams;
import com.iap.ac.android.common.container.model.ContainerParams;
import com.iap.ac.android.common.container.plugin.BaseContainerPlugin;
import com.iap.ac.android.common.container.provider.ContainerUaProvider;
import com.iap.ac.android.common.container.provider.JsApiPermissionProvider;
import com.iap.ac.android.common.container.provider.ui.ContainerUIProvider;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.container.adapter.griver.constant.GriverAdapterKeys;
import com.iap.ac.android.container.adapter.griver.event.AppEventHandler;
import com.iap.ac.android.container.adapter.griver.event.BridgeCallNotFoundEventHandler;
import com.iap.ac.android.container.adapter.griver.event.InterceptUrlEventHandler;
import com.iap.ac.android.container.adapter.griver.event.PageHelperEventHandler;
import com.iap.ac.android.container.adapter.griver.extension.CustomMenuExtensionImpl;
import com.iap.ac.android.container.adapter.griver.extension.JSPermissionExtensionImpl;
import com.iap.ac.android.container.adapter.griver.extension.UserAgentExtensionImpl;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class GriverContainerImpl implements IContainer {
    private static final String TAG = "GriverContainerImpl";
    private static boolean isEventHandlerRegistered = false;

    public void startContainer(Context context, String str) {
        startContainer(context, str, (IContainerListener) null);
    }

    public void startContainer(Context context, String str, IContainerListener iContainerListener) {
        startContainer(context, new ContainerParams(str), iContainerListener);
    }

    public void startContainer(Context context, ContainerParams containerParams) {
        startContainer(context, containerParams, (IContainerListener) null);
    }

    public void startContainer(Context context, ContainerParams containerParams, IContainerListener iContainerListener) {
        if (!Utils.isGriverContainerInit()) {
            ACLog.e(TAG, "startContainer error! AppContainer not initialized.");
        } else if (containerParams == null) {
            ACLog.e(TAG, "startContainer error! containerParams is null!");
        } else {
            Bundle bundle = new Bundle();
            if (containerParams.containerBundle != null) {
                bundle.putAll(containerParams.containerBundle);
            }
            if (!isEventHandlerRegistered) {
                isEventHandlerRegistered = true;
                Griver.registerEventHandler(new GriverEventManifest(AppEventHandler.class.getName(), Collections.singletonList(GriverAppEvent.class.getName()), App.class));
                Griver.registerEventHandler(new GriverEventManifest(BridgeCallNotFoundEventHandler.class.getName(), Collections.singletonList(GriverBridgeCallNotFoundEvent.class.getName()), App.class));
            }
            String str = containerParams.appId;
            if (!TextUtils.isEmpty(str)) {
                String generateUniquePageId = generateUniquePageId(str);
                bundle.putString(GriverAdapterKeys.PARAM_PAGE_ID, generateUniquePageId);
                AppEventHandler.addContainerListener(generateUniquePageId, iContainerListener);
                Griver.openApp(context, str, bundle);
                return;
            }
            String str2 = containerParams.url;
            if (!TextUtils.isEmpty(str2)) {
                String generateUniquePageId2 = generateUniquePageId(str2);
                bundle.putString(GriverAdapterKeys.PARAM_PAGE_ID, generateUniquePageId2);
                AppEventHandler.addContainerListener(generateUniquePageId2, iContainerListener);
                Griver.openUrl(context, str2, bundle);
            }
        }
    }

    public void registerContainerListener(IContainerListener iContainerListener) {
        AppEventHandler.addContainerListener(iContainerListener);
    }

    public void unregisterContainerListener(IContainerListener iContainerListener) {
        AppEventHandler.removeContainerListener(iContainerListener);
    }

    public synchronized boolean registerPlugin(BaseContainerPlugin baseContainerPlugin) {
        if (baseContainerPlugin == null) {
            return false;
        }
        Iterator<String> actionIterator = baseContainerPlugin.onPrepare(new ContainerEventFilter()).actionIterator();
        while (actionIterator.hasNext()) {
            String next = actionIterator.next();
            ACLog.d(TAG, "registerPlugin! event == ".concat(String.valueOf(next)));
            if (!TextUtils.equals(next, ContainerEventAction.ACTION_WEB_PAGE_STARTED)) {
                if (!TextUtils.equals(next, ContainerEventAction.ACTION_WEB_PAGE_FINISHED)) {
                    if (TextUtils.equals(next, ContainerEventAction.ACTION_WEB_PAGE_SHOULD_OVERRIDE_URL)) {
                        InterceptUrlEventHandler.setPlugin(baseContainerPlugin);
                        Griver.registerEventHandler(new GriverEventManifest(InterceptUrlEventHandler.class.getName(), Arrays.asList(new String[]{GriverInterceptUrlEvent.class.getName()}), Page.class));
                    } else {
                        StringBuilder sb = new StringBuilder("unregisterPlugin error!");
                        sb.append(next);
                        sb.append(" not support.");
                        ACLog.e(TAG, sb.toString());
                    }
                }
            }
            InterceptUrlEventHandler.setPlugin(baseContainerPlugin);
            Griver.registerEventHandler(new GriverEventManifest(PageHelperEventHandler.class.getName(), Arrays.asList(new String[]{GriverPageHelperEvent.class.getName()}), Page.class));
        }
        return true;
    }

    public synchronized void unregisterPlugin(BaseContainerPlugin baseContainerPlugin) {
        if (baseContainerPlugin != null) {
            Iterator<String> actionIterator = baseContainerPlugin.onPrepare(new ContainerEventFilter()).actionIterator();
            while (actionIterator.hasNext()) {
                String next = actionIterator.next();
                ACLog.d(TAG, "unregisterPlugin! event == ".concat(String.valueOf(next)));
                if (!TextUtils.equals(next, ContainerEventAction.ACTION_WEB_PAGE_STARTED)) {
                    if (!TextUtils.equals(next, ContainerEventAction.ACTION_WEB_PAGE_FINISHED)) {
                        if (TextUtils.equals(next, ContainerEventAction.ACTION_WEB_PAGE_SHOULD_OVERRIDE_URL)) {
                            InterceptUrlEventHandler.setPlugin((BaseContainerPlugin) null);
                        } else {
                            StringBuilder sb = new StringBuilder("unregisterPlugin error!");
                            sb.append(next);
                            sb.append(" not support.");
                            ACLog.e(TAG, sb.toString());
                        }
                    }
                }
                InterceptUrlEventHandler.setPlugin((BaseContainerPlugin) null);
            }
        }
    }

    public void setProvider(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            ACLog.d(TAG, "setProvider! name == ".concat(String.valueOf(str)));
            if (str.equals(ContainerUaProvider.class.getName())) {
                Griver.registerExtension(new GriverExtensionManifest(GriverUserAgentExtension.class, new UserAgentExtensionImpl((ContainerUaProvider) obj)));
            } else if (str.equals(JsApiPermissionProvider.class.getName())) {
                Griver.registerExtension(new GriverExtensionManifest(GriverH5JSAPIPermissionExtension.class, new JSPermissionExtensionImpl((JsApiPermissionProvider) obj)));
            } else if (str.equals(ContainerUIProvider.class.getName())) {
                Griver.registerExtension(new GriverExtensionManifest(GriverACMenuExtension.class, new CustomMenuExtensionImpl((ContainerUIProvider) obj)));
            } else {
                StringBuilder sb = new StringBuilder("setProvider error!");
                sb.append(str);
                sb.append(" not support.");
                ACLog.e(TAG, sb.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void registerJSAPIPlugin(final com.iap.ac.android.common.container.js.plugin.BaseJSPlugin r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 != 0) goto L_0x0005
            monitor-exit(r5)
            return
        L_0x0005:
            java.util.List r0 = r6.getJsApiList()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            java.util.List r0 = r6.getJsApiList()     // Catch:{ all -> 0x004a }
            int r0 = r0.size()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0016
            goto L_0x0048
        L_0x0016:
            java.util.List r0 = r6.getJsApiList()     // Catch:{ all -> 0x004a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x004a }
        L_0x001e:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0046
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x004a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "GriverContainerImpl"
            java.lang.String r3 = "registerJSAPIPlugin! jsapi == "
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x004a }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x004a }
            com.iap.ac.android.common.log.ACLog.d(r2, r3)     // Catch:{ all -> 0x004a }
            com.iap.ac.android.container.adapter.griver.GriverContainerImpl$1 r2 = new com.iap.ac.android.container.adapter.griver.GriverContainerImpl$1     // Catch:{ all -> 0x004a }
            r2.<init>(r6)     // Catch:{ all -> 0x004a }
            com.alibaba.griver.core.bridge.BridgeInterceptorManager r3 = com.alibaba.griver.core.bridge.BridgeInterceptorManager.getInstance()     // Catch:{ all -> 0x004a }
            r3.register(r1, r2)     // Catch:{ all -> 0x004a }
            goto L_0x001e
        L_0x0046:
            monitor-exit(r5)
            return
        L_0x0048:
            monitor-exit(r5)
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x004e
        L_0x004d:
            throw r6
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.container.adapter.griver.GriverContainerImpl.registerJSAPIPlugin(com.iap.ac.android.common.container.js.plugin.BaseJSPlugin):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void unregisterJSAPIPlugin(com.iap.ac.android.common.container.js.plugin.BaseJSPlugin r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            java.util.List r0 = r5.getJsApiList()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0044
            java.util.List r0 = r5.getJsApiList()     // Catch:{ all -> 0x0046 }
            int r0 = r0.size()     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0016
            goto L_0x0044
        L_0x0016:
            java.util.List r5 = r5.getJsApiList()     // Catch:{ all -> 0x0046 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0046 }
        L_0x001e:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "GriverContainerImpl"
            java.lang.String r2 = "unregisterJSAPIPlugin! jsapi == "
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x0046 }
            com.iap.ac.android.common.log.ACLog.d(r1, r2)     // Catch:{ all -> 0x0046 }
            com.alibaba.griver.core.bridge.BridgeInterceptorManager r1 = com.alibaba.griver.core.bridge.BridgeInterceptorManager.getInstance()     // Catch:{ all -> 0x0046 }
            r1.unregister(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x001e
        L_0x0042:
            monitor-exit(r4)
            return
        L_0x0044:
            monitor-exit(r4)
            return
        L_0x0046:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x004a
        L_0x0049:
            throw r5
        L_0x004a:
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.container.adapter.griver.GriverContainerImpl.unregisterJSAPIPlugin(com.iap.ac.android.common.container.js.plugin.BaseJSPlugin):void");
    }

    public boolean isMiniProgram(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("\\d{16}").matcher(str).matches();
    }

    public void registerJSAPIInterceptor(@NonNull String str, @NonNull final BridgeInterceptor bridgeInterceptor) {
        ACLog.d(TAG, "registerJSAPIPlugin! jsapi == ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            ACLog.e(TAG, "registerJSAPIInterceptor error! jsapi name is empty.");
        } else if (bridgeInterceptor == null) {
            ACLog.e(TAG, "registerJSAPIInterceptor error! bridgeInterceptor is null.");
        } else {
            BridgeInterceptorManager.getInstance().register(str, new com.alibaba.griver.api.bridge.BridgeInterceptor() {
                public boolean willHandleJSAPI(String str, BridgeInterceptor.InterceptContext interceptContext, BridgeCallback bridgeCallback) {
                    BridgeInterceptor.InterceptContext interceptContext2 = new BridgeInterceptor.InterceptContext();
                    interceptContext2.context = interceptContext.context;
                    interceptContext2.jsParameters = Utils.fastJsonToJson(interceptContext.jsParameters);
                    interceptContext2.miniProgramAppID = interceptContext.miniProgramAppID;
                    interceptContext2.miniProgramPageURL = interceptContext.miniProgramPageURL;
                    interceptContext2.sourceSite = interceptContext.sourceSite;
                    interceptContext2.acParams = Utils.fastJsonToJson(interceptContext.acParams);
                    interceptContext2.miniProgramName = interceptContext.miniProgramName;
                    ACLog.d(GriverContainerImpl.TAG, "interceptor proxy called == ".concat(String.valueOf(str)));
                    return bridgeInterceptor.willHandleJSAPI(str, interceptContext2, IAPBridgeCallbackAdapter.from(bridgeCallback));
                }
            });
        }
    }

    public void unregisterJSAPIInterceptor(@NonNull String str) {
        ACLog.d(TAG, "unregisterJSAPIInterceptor! jsapi == ".concat(String.valueOf(str)));
        BridgeInterceptorManager.getInstance().unregister(str);
    }

    public boolean isJSAPIRegistered(@NonNull String str) {
        if (RVInitializer.getExtensionManager() == null || RVInitializer.getExtensionManager().findActionMeta(str) == null) {
            return false;
        }
        return true;
    }

    public IContainerAuth getContainerAuth() {
        return new GriverContainerAuthImpl();
    }

    public void closeApp(@NonNull CloseAppParams closeAppParams) {
        if (closeAppParams == null) {
            ACLog.e(TAG, "closeApp error! closeAppParams is null!");
        } else {
            Griver.closeApp(closeAppParams.appId);
        }
    }

    public void registerNotFoundJSAPIInterceptor(@NonNull NotFoundJSAPIInterceptor notFoundJSAPIInterceptor) {
        BridgeCallNotFoundEventHandler.registerNotFoundJSAPIInterceptor(notFoundJSAPIInterceptor);
    }

    public void logEvent(@NonNull String str, @NonNull Map<String, String> map) {
        GriverMonitor.event(str, "GriverAppContainer", map);
    }

    private String generateUniquePageId(@NonNull String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.hashCode());
        sb.append("_");
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    public void fetchAppInfoListByIds(List<String> list, final Callback<AppInfoListData> callback) {
        Griver.fetchAppInfoListByIds(new FetchAppsByIdsRequest(list), new OnRpcResultListener<AppInfosResult>() {
            public void onResultSuccess(AppInfosResult appInfosResult) {
                Callback callback = callback;
                if (callback != null) {
                    callback.onResultSuccess(DataProcessor.convertAppListResult(appInfosResult));
                }
            }

            public void onResultFailed(int i, String str) {
                Callback callback = callback;
                if (callback != null) {
                    callback.onResultFailed(i, str);
                }
            }
        });
    }
}
