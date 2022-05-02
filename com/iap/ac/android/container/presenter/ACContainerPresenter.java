package com.iap.ac.android.container.presenter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.container.IContainerPresenter;
import com.iap.ac.android.common.container.provider.ContainerUaProvider;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.container.ACContainer;
import com.iap.ac.android.container.BuildConfig;
import com.iap.ac.android.container.R;
import com.iap.ac.android.container.activity.ACContainerActivity;
import com.iap.ac.android.container.activity.H5NetworkCheckActivity;
import com.iap.ac.android.container.constant.LogEventKeys;
import com.iap.ac.android.container.constant.LogEventName;
import com.iap.ac.android.container.js.plugin.ACContainerJSPlugin;
import com.iap.ac.android.container.utils.ResourceUtils;
import com.iap.ac.android.container.view.IContainerView;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import java.util.HashMap;
import java.util.Map;
import o.getTabbarModel;

public class ACContainerPresenter implements IContainerPresenter {
    private static final String TAG = "ContainerPresenter";
    private IContainerView containerView;
    private ACContainerActivity mContext;
    private WebView mWebView;

    public ACContainerPresenter(@NonNull ACContainerActivity aCContainerActivity, IContainerView iContainerView) {
        this.mContext = aCContainerActivity;
        this.containerView = iContainerView;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void setWebView() {
        WebView webView = this.mWebView;
        if (webView != null) {
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDefaultTextEncodingName(getTabbarModel.ENC);
            settings.setSupportZoom(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setAllowFileAccess(false);
            settings.setDomStorageEnabled(true);
            if (Build.VERSION.SDK_INT >= 16) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
            try {
                ContainerUaProvider containerUaProvider = (ContainerUaProvider) ACContainer.INSTANCE.getProvider(ContainerUaProvider.class.getName());
                if (containerUaProvider != null) {
                    settings.setUserAgentString(containerUaProvider.getUa(settings.getUserAgentString()));
                }
                StringBuilder sb = new StringBuilder("setWebView: UA = ");
                sb.append(settings.getUserAgentString());
                ACLog.d(TAG, sb.toString());
            } catch (ClassCastException e) {
                ACLog.e(TAG, "get UA provider error! ", e);
                HashMap hashMap = new HashMap();
                hashMap.put(LogEventKeys.SDK_VERSION, BuildConfig.VERSION_NAME);
                ACContainerActivity aCContainerActivity = this.mContext;
                if (!(aCContainerActivity == null || aCContainerActivity.getIntent() == null)) {
                    hashMap.put("url", this.mContext.getIntent().getStringExtra("url"));
                }
                ACMonitor.logEvent(new LogEvent(LogEventName.SET_UA_FAIL, hashMap));
            }
            this.mWebView.setWebViewClient(new ACWebViewClient(this.mContext, this.mWebView, this));
            this.mWebView.setWebChromeClient(new ACWebChromeClient(this.mWebView, this));
            if (Build.VERSION.SDK_INT < 17) {
                this.mWebView.removeJavascriptInterface("searchBoxJavaBridge_");
                this.mWebView.removeJavascriptInterface("accessibility");
                this.mWebView.removeJavascriptInterface("accessibilityTraversal");
            }
        }
    }

    private void showDefaultErrorPage(String str, int i, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ACContainerActivity aCContainerActivity = this.mContext;
        if (aCContainerActivity != null && this.mWebView != null) {
            Resources resources = aCContainerActivity.getResources();
            if (resources != null) {
                str6 = resources.getString(R.string.h5_loading_failed);
                str5 = resources.getString(R.string.h5_menu_refresh);
                str4 = resources.getString(R.string.h5_network_check);
                str3 = resources.getString(R.string.h5_close);
            } else {
                str6 = "";
                str5 = str6;
                str4 = str5;
                str3 = str4;
            }
            ACLog.d(TAG, "showDefaultErrorPage buttonText ".concat(String.valueOf(str5)));
            String readRawFromResource = ResourceUtils.readRawFromResource(R.raw.h5_page_error, resources);
            if (!TextUtils.isEmpty(readRawFromResource)) {
                if (!ACContainer.DEBUG) {
                    readRawFromResource = removeDebugStub(readRawFromResource);
                }
                String replace = readRawFromResource.replace("####", str5).replace("****", str4);
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(": ");
                sb.append(str2);
                String replace2 = replace.replaceAll("&&&&", sb.toString()).replace("!!!!", str6).replace("$$$$", String.valueOf(i)).replace("^^^^", str3);
                if (!TextUtils.isEmpty(str)) {
                    str7 = replace2.replace("%%%%", str);
                } else {
                    str7 = replace2.replace("%%%%", "");
                }
                this.mWebView.loadDataWithBaseURL(str, str7.replace("@@@@", ACContainerJSPlugin.SHOW_NETWORK_CHECK_ACTIVITY), "text/html", getTabbarModel.ENC, str);
            }
        }
    }

    private String removeDebugStub(String str) {
        return str.replace("id=\"networkCheck\"", "id=\"networkCheck\" style=\"display: none\" ");
    }

    public void loadUrl(String str) {
        if (this.mWebView == null || this.mContext == null) {
            ACLog.e(TAG, "loadUrl error: mWebView or mContext is null!");
        } else if (!TextUtils.isEmpty(str)) {
            this.mWebView.loadUrl(str);
        } else {
            showDefaultErrorPage(str, -12, this.mContext.getResources().getString(R.string.h5_url_error));
        }
    }

    public void postUrl(String str, byte[] bArr) {
        if (this.mWebView == null) {
            ACLog.e(TAG, "postUrl error: mWebView is null!");
        } else if (!TextUtils.isEmpty(str)) {
            this.mWebView.postUrl(str, bArr);
        } else {
            showDefaultErrorPage(str, -12, this.mContext.getResources().getString(R.string.h5_url_error));
        }
    }

    public void reloadPage() {
        WebView webView = this.mWebView;
        if (webView == null) {
            ACLog.e(TAG, "reloadPage error: mWebView is null!");
        } else {
            webView.reload();
        }
    }

    public void closeWebview() {
        ACContainerActivity aCContainerActivity = this.mContext;
        if (aCContainerActivity != null) {
            aCContainerActivity.finish();
        }
    }

    public void showNetWorkCheckActivity(Map<String, String> map) {
        if (map != null && !map.isEmpty() && this.mContext != null) {
            Intent intent = new Intent(this.mContext, H5NetworkCheckActivity.class);
            intent.putExtra("error_code", map.get("error_code"));
            intent.putExtra("url", map.get("url"));
            intent.putExtra(ZdocRecordService.REASON, map.get(ZdocRecordService.REASON));
            this.mContext.startActivity(intent);
        }
    }

    public void setTitle(String str) {
        IContainerView iContainerView;
        if (!TextUtils.isEmpty(str) && (iContainerView = this.containerView) != null) {
            iContainerView.setTitle(str);
        }
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    @NonNull
    public Activity getActivity() {
        return this.mContext;
    }

    public void setWebView(WebView webView) {
        this.mWebView = webView;
        setWebView();
    }
}
