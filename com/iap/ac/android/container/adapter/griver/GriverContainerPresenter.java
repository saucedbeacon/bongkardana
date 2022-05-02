package com.iap.ac.android.container.adapter.griver;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.model.LoadParams;
import com.iap.ac.android.common.container.IContainerPresenter;
import com.iap.ac.android.common.log.ACLog;
import java.util.Map;

public class GriverContainerPresenter implements IContainerPresenter {
    private static final String TAG = "GriverContainerPresenter";
    private Page page;

    public GriverContainerPresenter(Page page2) {
        this.page = page2;
    }

    public void setTitle(String str) {
        Page page2 = this.page;
        if (page2 != null) {
            page2.getPageContext().getTitleBar().setTitle(str, "", "", "", false);
        }
    }

    public void reloadPage() {
        Page page2 = this.page;
        if (page2 != null) {
            page2.getRender().reload();
        }
    }

    public void loadUrl(String str) {
        if (this.page != null) {
            LoadParams loadParams = new LoadParams();
            loadParams.url = str;
            this.page.getRender().load(loadParams);
        }
    }

    public void postUrl(String str, byte[] bArr) {
        ACLog.e(TAG, "postUrl not support.");
    }

    public void closeWebview() {
        Page page2 = this.page;
        if (page2 != null) {
            page2.getApp().exit();
        }
    }

    public void showNetWorkCheckActivity(Map<String, String> map) {
        Page page2;
        if (map != null && !map.isEmpty() && (page2 = this.page) != null && page2.getPageContext().getActivity() != null) {
            ACLog.e(TAG, "showNetWorkCheckActivity not support.");
        }
    }

    public Context getContext() {
        Page page2 = this.page;
        if (page2 != null) {
            return page2.getPageContext().getActivity();
        }
        return null;
    }

    @NonNull
    public Activity getActivity() {
        Page page2 = this.page;
        if (page2 != null) {
            return page2.getPageContext().getActivity();
        }
        return null;
    }
}
