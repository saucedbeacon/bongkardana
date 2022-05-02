package com.alibaba.griver.h5.jsapi;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.H5UrlHelper;
import java.util.List;

@Keep
public class OpenInBrowserBridgeExtension extends SimpleBridgeExtension {
    private static final String TAG = "OpenInBrowserBridgeExtension";

    @ActionFilter
    public void openInBrowser(@BindingApiContext(required = true) ApiContext apiContext, @BindingParam(name = {"url"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        Uri parseUrl = H5UrlHelper.parseUrl(str);
        if (parseUrl != null) {
            Context appContext = apiContext.getAppContext();
            String scheme = parseUrl.getScheme();
            GriverLogger.d(TAG, "openInBrowser scheme ".concat(String.valueOf(scheme)));
            String uCMPackageName = getUCMPackageName(getPackageInfos(appContext));
            GriverLogger.d(TAG, "ucmPackage: ".concat(String.valueOf(uCMPackageName)));
            if (TextUtils.isEmpty(uCMPackageName) || (!TextUtils.equals(scheme, "http") && !TextUtils.equals(scheme, "https"))) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parseUrl);
                    intent.setFlags(268435456);
                    intent.addCategory("android.intent.category.BROWSABLE");
                    GriverLogger.d(TAG, "start view activity");
                    appContext.startActivity(intent);
                    if (bridgeCallback != null) {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                    }
                } catch (Exception unused) {
                    GriverLogger.d(TAG, "resolve activity failed");
                    if (bridgeCallback != null) {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.newValue("success", Boolean.FALSE));
                    }
                }
            } else {
                startUCMIntentLoadUrl(appContext, parseUrl, uCMPackageName, bridgeCallback);
            }
        }
    }

    private String getUCMPackageName(List<PackageInfo> list) {
        if (list == null) {
            return null;
        }
        for (PackageInfo next : list) {
            if (next.packageName.equals("com.UCMobile")) {
                return "com.UCMobile";
            }
            if (next.packageName.equals("com.UCMobile.intl")) {
                return "com.UCMobile.intl";
            }
            if (next.packageName.equals("com.UCMobile.yunos")) {
                return "com.UCMobile.yunos";
            }
        }
        return null;
    }

    private List<PackageInfo> getPackageInfos(Context context) {
        try {
            return context.getPackageManager().getInstalledPackages(0);
        } catch (Throwable th) {
            GriverLogger.e(TAG, "getPackageInfo failed", th);
            return null;
        }
    }

    private void startUCMIntentLoadUrl(Context context, Uri uri, String str, BridgeCallback bridgeCallback) {
        if (str != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(uri, "text/html");
            intent.setPackage(str);
            intent.setComponent(new ComponentName(str, "com.UCMobile.main.UCMobile"));
            intent.putExtra("uc_partner", "UCM_OPEN_FROM_ALIPAY_WEBVIEWSDK");
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                if (bridgeCallback != null) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                }
            } catch (Exception e) {
                GriverLogger.e(TAG, "startActivity exception.", e);
                if (bridgeCallback != null) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.newValue("success", Boolean.FALSE));
                }
            }
        }
    }
}
