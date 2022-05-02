package com.iap.ac.android.common.container;

import android.content.Context;
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
import java.util.List;
import java.util.Map;

public interface IContainer {
    void closeApp(@NonNull CloseAppParams closeAppParams);

    void fetchAppInfoListByIds(List<String> list, Callback<AppInfoListData> callback);

    IContainerAuth getContainerAuth();

    boolean isJSAPIRegistered(@NonNull String str);

    boolean isMiniProgram(@NonNull String str);

    void logEvent(@NonNull String str, @NonNull Map<String, String> map);

    void registerContainerListener(IContainerListener iContainerListener);

    void registerJSAPIInterceptor(@NonNull String str, @NonNull BridgeInterceptor bridgeInterceptor);

    void registerJSAPIPlugin(BaseJSPlugin baseJSPlugin);

    void registerNotFoundJSAPIInterceptor(@NonNull NotFoundJSAPIInterceptor notFoundJSAPIInterceptor);

    boolean registerPlugin(BaseContainerPlugin baseContainerPlugin);

    void setProvider(String str, Object obj);

    void startContainer(Context context, ContainerParams containerParams);

    void startContainer(Context context, ContainerParams containerParams, IContainerListener iContainerListener);

    void startContainer(Context context, String str);

    void startContainer(Context context, String str, IContainerListener iContainerListener);

    void unregisterContainerListener(IContainerListener iContainerListener);

    void unregisterJSAPIInterceptor(@NonNull String str);

    void unregisterJSAPIPlugin(BaseJSPlugin baseJSPlugin);

    void unregisterPlugin(BaseContainerPlugin baseContainerPlugin);
}
