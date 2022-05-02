package com.iap.ac.android.container.adapter.appcontainer;

import android.content.Context;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.iap.android.webapp.sdk.kit.AppContainerKit;
import com.alipay.mobile.h5container.service.H5Service;
import com.alipay.mobile.nebula.provider.H5JSApiPermissionProvider;
import com.alipay.mobile.nebula.provider.H5ReceivedSslErrorHandler;
import com.alipay.mobile.nebula.provider.H5UaProvider;
import com.alipay.mobile.nebula.util.H5Utils;
import com.alipay.mobile.nebula.webview.APSslErrorHandler;
import com.alipay.mobile.nebula.webview.APWebView;
import com.iap.ac.android.common.container.IContainer;
import com.iap.ac.android.common.container.event.IContainerListener;
import com.iap.ac.android.common.container.js.plugin.BaseJSPlugin;
import com.iap.ac.android.common.container.model.ContainerParams;
import com.iap.ac.android.common.container.plugin.BaseContainerPlugin;
import com.iap.ac.android.common.container.provider.ContainerUaProvider;
import com.iap.ac.android.common.container.provider.JsApiPermissionProvider;
import com.iap.ac.android.common.container.provider.ReceivedSslErrorHandler;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.container.adapter.appcontainer.provider.AppJSApiPermissionProvider;
import com.iap.ac.android.container.adapter.appcontainer.provider.AppSslErrorHandler;
import com.iap.ac.android.container.adapter.appcontainer.provider.AppUaProvider;
import java.util.HashMap;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class AppContainerImpl implements IContainer {
    private static final String TAG = "AppContainerImpl";
    private Map<BaseJSPlugin, AppContainerJSPlugin> base2JSPlugin = new HashMap();
    private Map<BaseContainerPlugin, AppContainerPlugin> base2Plugin = new HashMap();

    public void startContainer(Context context, String str) {
        startContainer(context, str, (IContainerListener) null);
    }

    public void startContainer(Context context, String str, IContainerListener iContainerListener) {
        Context context2 = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        int i = 0;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(802456136, oncanceled);
                onCancelLoad.getMin(802456136, oncanceled);
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
                onCancelLoad.setMax(802456136, oncanceled2);
                onCancelLoad.getMin(802456136, oncanceled2);
            }
        }
        startContainer(context, new ContainerParams(str), iContainerListener);
    }

    public void startContainer(Context context, ContainerParams containerParams) {
        startContainer(context, containerParams, (IContainerListener) null);
    }

    public void startContainer(Context context, ContainerParams containerParams, IContainerListener iContainerListener) {
        if (!ContainerUtils.isAppContainerInit()) {
            ACLog.e(TAG, "startContainer error! AppContainer not initialized.");
        } else if (containerParams == null) {
            ACLog.e(TAG, "startContainer error! containerParams is null!");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("url", containerParams.url);
            bundle.putString("openUrlMethod", containerParams.startMethod.value);
            bundle.putString("openUrlPostParams", containerParams.postParams);
            if (containerParams.containerBundle != null) {
                bundle.putAll(containerParams.containerBundle);
            }
            AppContainerKit.getInstance().startContainerActivity(context, bundle, new AppContainerWebListener(iContainerListener));
        }
    }

    public void setProvider(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            H5Service h5Service = (H5Service) H5Utils.findServiceByInterface(H5Service.class.getName());
            if (h5Service == null) {
                ACLog.e(TAG, "setProvider error! AppContainer not initialized.");
            } else if (str.equals(ContainerUaProvider.class.getName())) {
                AppContainerKit.getInstance().setProvider(H5UaProvider.class.getName(), new AppUaProvider((H5UaProvider) h5Service.getProviderManager().getProvider(H5UaProvider.class.getName()), (ContainerUaProvider) obj) {
                });
            } else if (str.equals(JsApiPermissionProvider.class.getName())) {
                AppContainerKit.getInstance().setProvider(H5JSApiPermissionProvider.class.getName(), new AppJSApiPermissionProvider((H5JSApiPermissionProvider) h5Service.getProviderManager().getProvider(H5JSApiPermissionProvider.class.getName()), (JsApiPermissionProvider) obj) {
                });
            } else if (str.equals(ReceivedSslErrorHandler.class.getName())) {
                final ReceivedSslErrorHandler receivedSslErrorHandler = (ReceivedSslErrorHandler) obj;
                AppContainerKit.getInstance().setProvider(H5ReceivedSslErrorHandler.class.getName(), new H5ReceivedSslErrorHandler() {
                    public void onReceivedSslError(APWebView aPWebView, APSslErrorHandler aPSslErrorHandler, SslError sslError) {
                        receivedSslErrorHandler.onReceivedSslError(new AppContainerWebView(aPWebView), new AppSslErrorHandler(aPSslErrorHandler), sslError);
                    }
                });
            } else {
                AppContainerKit.getInstance().setProvider(str, obj);
            }
        }
    }

    public synchronized void registerJSAPIPlugin(BaseJSPlugin baseJSPlugin) {
        if (baseJSPlugin != null) {
            if (!ContainerUtils.isAppContainerInit()) {
                ACLog.e(TAG, "registerJSAPIPlugin error! AppContainer not initialized.");
                return;
            }
            AppContainerJSPlugin appContainerJSPlugin = new AppContainerJSPlugin(baseJSPlugin);
            this.base2JSPlugin.put(baseJSPlugin, appContainerJSPlugin);
            AppContainerKit.getInstance().registerPlugin(appContainerJSPlugin);
        }
    }

    public synchronized void unregisterJSAPIPlugin(BaseJSPlugin baseJSPlugin) {
        if (baseJSPlugin != null) {
            if (!ContainerUtils.isAppContainerInit()) {
                ACLog.e(TAG, "unregisterJSAPIPlugin error! AppContainer not initialized.");
                return;
            }
            if (this.base2JSPlugin != null && !this.base2JSPlugin.isEmpty()) {
                if (this.base2JSPlugin.get(baseJSPlugin) != null) {
                    AppContainerKit.getInstance().unRegisterPlugin(this.base2JSPlugin.get(baseJSPlugin));
                    return;
                }
            }
            ACLog.w(TAG, "unregisterJSAPIPlugin fail: Cannot find plugin. ".concat(String.valueOf(baseJSPlugin)));
        }
    }

    public synchronized boolean registerPlugin(BaseContainerPlugin baseContainerPlugin) {
        if (baseContainerPlugin == null) {
            return false;
        }
        if (!ContainerUtils.isAppContainerInit()) {
            ACLog.e(TAG, "registerPlugin error! AppContainer not initialized.");
            return false;
        }
        AppContainerPlugin appContainerPlugin = new AppContainerPlugin(baseContainerPlugin);
        this.base2Plugin.put(baseContainerPlugin, appContainerPlugin);
        AppContainerKit.getInstance().registerPlugin(appContainerPlugin);
        return true;
    }

    public synchronized void unregisterPlugin(BaseContainerPlugin baseContainerPlugin) {
        if (baseContainerPlugin != null) {
            if (!ContainerUtils.isAppContainerInit()) {
                ACLog.e(TAG, "unregisterPlugin error! AppContainer not initialized.");
                return;
            }
            if (this.base2Plugin != null && !this.base2Plugin.isEmpty()) {
                if (this.base2Plugin.get(baseContainerPlugin) != null) {
                    AppContainerKit.getInstance().unRegisterPlugin(this.base2Plugin.get(baseContainerPlugin));
                    return;
                }
            }
            ACLog.w(TAG, "unregisterPlugin fail: Cannot find plugin. ".concat(String.valueOf(baseContainerPlugin)));
        }
    }
}
