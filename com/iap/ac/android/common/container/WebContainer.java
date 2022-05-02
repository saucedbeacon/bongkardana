package com.iap.ac.android.common.container;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.container.auth.IContainerAuth;
import com.iap.ac.android.common.container.callback.Callback;
import com.iap.ac.android.common.container.event.IContainerListener;
import com.iap.ac.android.common.container.interceptor.BridgeInterceptor;
import com.iap.ac.android.common.container.interceptor.NotFoundJSAPIInterceptor;
import com.iap.ac.android.common.container.js.plugin.BaseJSPlugin;
import com.iap.ac.android.common.container.model.AppInfoListData;
import com.iap.ac.android.common.container.model.CloseAppParams;
import com.iap.ac.android.common.container.model.ContainerParams;
import com.iap.ac.android.common.container.plugin.BaseContainerPlugin;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.common.log.event.LogEventType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public enum WebContainer implements IContainer {
    INSTANCE;
    
    private static final String EVENT_GET_DEFAULT_IMPL = "ac_common_get_container_defalut_impl";
    private static final String EVENT_GET_IMPL_ERROR = "ac_common_get_container_impl_error";
    private static final String TAG = "WebContainer";
    private static final Map<String, IContainer> containerMap = null;
    private static IContainer mContainer;

    public final IContainerAuth getContainerAuth() {
        return null;
    }

    static {
        containerMap = new HashMap();
    }

    public static IContainer getInstance(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return getInstance();
        }
        IContainer iContainer = containerMap.get(str);
        if (iContainer == null && (iContainer = mContainer) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("bizCode", str);
            hashMap.put("msg", "Cannot find the implemetation for this bizCode. Using default instead.");
            LogEvent logEvent = new LogEvent(EVENT_GET_DEFAULT_IMPL, hashMap);
            logEvent.bizCode = str;
            ACMonitor.getInstance(str).logEvent(logEvent);
        }
        if (iContainer == null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("bizCode", str);
            hashMap2.put(ACMonitor.EVENT_PARAM_KEY_ERROR_MSG, "Cannot find the implemetation for this bizCode.");
            LogEvent logEvent2 = new LogEvent(EVENT_GET_IMPL_ERROR, hashMap2);
            logEvent2.bizCode = str;
            logEvent2.eventType = LogEventType.CRUCIAL_LOG;
            ACMonitor.getInstance(str).logEvent(logEvent2);
        }
        return iContainer;
    }

    public static IContainer getInstance() {
        return mContainer;
    }

    public final void startContainer(Context context, String str) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.startContainer(context, str);
        }
    }

    public final void startContainer(Context context, String str, IContainerListener iContainerListener) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.startContainer(context, str, iContainerListener);
        }
    }

    public final void startContainer(Context context, ContainerParams containerParams) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(-1253381038, oncanceled);
            onCancelLoad.getMin(-1253381038, oncanceled);
        }
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.startContainer(context, containerParams);
        }
    }

    public final void startContainer(Context context, ContainerParams containerParams, IContainerListener iContainerListener) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.startContainer(context, containerParams, iContainerListener);
        }
    }

    public final void registerContainerListener(IContainerListener iContainerListener) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.registerContainerListener(iContainerListener);
        }
    }

    public final void unregisterContainerListener(IContainerListener iContainerListener) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.unregisterContainerListener(iContainerListener);
        }
    }

    public final boolean registerPlugin(BaseContainerPlugin baseContainerPlugin) {
        IContainer iContainer = mContainer;
        if (iContainer != null) {
            return iContainer.registerPlugin(baseContainerPlugin);
        }
        noImplementationError();
        return false;
    }

    public final void unregisterPlugin(BaseContainerPlugin baseContainerPlugin) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.unregisterPlugin(baseContainerPlugin);
        }
    }

    public final void setProvider(String str, Object obj) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.setProvider(str, obj);
        }
    }

    public final void registerJSAPIPlugin(BaseJSPlugin baseJSPlugin) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.registerJSAPIPlugin(baseJSPlugin);
        }
    }

    public final void unregisterJSAPIPlugin(BaseJSPlugin baseJSPlugin) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.unregisterJSAPIPlugin(baseJSPlugin);
        }
    }

    public final boolean isMiniProgram(@NonNull String str) {
        IContainer iContainer = mContainer;
        if (iContainer != null) {
            return iContainer.isMiniProgram(str);
        }
        noImplementationError();
        return false;
    }

    public final void registerJSAPIInterceptor(@NonNull String str, @NonNull BridgeInterceptor bridgeInterceptor) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.registerJSAPIInterceptor(str, bridgeInterceptor);
        }
    }

    public final void unregisterJSAPIInterceptor(@NonNull String str) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.unregisterJSAPIInterceptor(str);
        }
    }

    public final boolean isJSAPIRegistered(@NonNull String str) {
        IContainer iContainer = mContainer;
        if (iContainer != null) {
            return iContainer.isJSAPIRegistered(str);
        }
        noImplementationError();
        return false;
    }

    public final void closeApp(@NonNull CloseAppParams closeAppParams) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.closeApp(closeAppParams);
        }
    }

    public final void registerNotFoundJSAPIInterceptor(NotFoundJSAPIInterceptor notFoundJSAPIInterceptor) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.registerNotFoundJSAPIInterceptor(notFoundJSAPIInterceptor);
        }
    }

    public final void logEvent(@NonNull String str, @NonNull Map<String, String> map) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.logEvent(str, map);
        }
    }

    private void noImplementationError() {
        ACLog.e(TAG, "No implementation of IContainer found. Please setContainer before use!");
    }

    public final IContainer getContainer() {
        return mContainer;
    }

    public final void setContainer(IContainer iContainer) {
        mContainer = iContainer;
    }

    public final void setContainer(@NonNull IContainer iContainer, @NonNull String str) {
        containerMap.put(str, iContainer);
    }

    public final void fetchAppInfoListByIds(List<String> list, Callback<AppInfoListData> callback) {
        IContainer iContainer = mContainer;
        if (iContainer == null) {
            noImplementationError();
        } else {
            iContainer.fetchAppInfoListByIds(list, callback);
        }
    }
}
