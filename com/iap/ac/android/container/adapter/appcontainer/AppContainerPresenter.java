package com.iap.ac.android.container.adapter.appcontainer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.alipay.mobile.framework.LauncherApplicationAgent;
import com.alipay.mobile.h5container.api.H5BridgeContext;
import com.alipay.mobile.h5container.api.H5Event;
import com.alipay.mobile.nebulacore.Nebula;
import com.alipay.mobile.nebulacore.env.H5Environment;
import com.alipay.mobile.nebulacore.ui.H5NetworkCheckActivity;
import com.iap.ac.android.common.container.IContainerPresenter;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.container.js.plugin.ACContainerJSPlugin;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import java.util.Map;

public class AppContainerPresenter implements IContainerPresenter {
    private static final String TAG = "AppContainerPresenter";
    private H5BridgeContext bridgeContext;
    private H5Event h5Event;

    public AppContainerPresenter(H5Event h5Event2, H5BridgeContext h5BridgeContext) {
        this.h5Event = h5Event2;
        this.bridgeContext = h5BridgeContext;
    }

    public void setTitle(String str) {
        H5Event h5Event2 = this.h5Event;
        if (h5Event2 != null && h5Event2.getH5page() != null) {
            this.h5Event.getH5page().setTitle(str);
        }
    }

    public void reloadPage() {
        H5Event h5Event2 = this.h5Event;
        if (h5Event2 != null && h5Event2.getH5page() != null && this.h5Event.getH5page().getWebView() != null) {
            this.h5Event.getH5page().getWebView().reload();
        }
    }

    public void loadUrl(String str) {
        H5Event h5Event2 = this.h5Event;
        if (h5Event2 != null && h5Event2.getH5page() != null) {
            this.h5Event.getH5page().loadUrl(str);
        }
    }

    public void postUrl(String str, byte[] bArr) {
        H5Event h5Event2 = this.h5Event;
        if (h5Event2 != null && h5Event2.getH5page() != null && this.h5Event.getH5page().getWebView() != null) {
            this.h5Event.getH5page().getWebView().postUrl(str, bArr);
        }
    }

    public void closeWebview() {
        if (Nebula.getService() != null) {
            Nebula.getService().exitService();
        }
    }

    public void showNetWorkCheckActivity(Map<String, String> map) {
        H5Event h5Event2;
        if (map != null && !map.isEmpty() && (h5Event2 = this.h5Event) != null && h5Event2.getActivity() != null) {
            Intent intent = new Intent(H5Environment.getContext(), H5NetworkCheckActivity.class);
            intent.putExtra("error_code", map.get("error_code"));
            intent.putExtra("url", map.get("url"));
            intent.putExtra(ZdocRecordService.REASON, map.get(ZdocRecordService.REASON));
            try {
                LauncherApplicationAgent.getInstance().getMicroApplicationContext().startActivity(LauncherApplicationAgent.getInstance().getMicroApplicationContext().findTopRunningApp(), intent);
            } catch (Exception e) {
                ACLog.e(TAG, ACContainerJSPlugin.SHOW_NETWORK_CHECK_ACTIVITY, e);
            }
        }
    }

    public Context getContext() {
        H5Event h5Event2 = this.h5Event;
        if (h5Event2 != null) {
            return h5Event2.getActivity();
        }
        return null;
    }

    @NonNull
    public Activity getActivity() {
        H5Event h5Event2 = this.h5Event;
        if (h5Event2 != null) {
            return h5Event2.getActivity();
        }
        return null;
    }
}
