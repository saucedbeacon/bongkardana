package com.alibaba.griver.core.webview;

import android.webkit.DownloadListener;
import com.alibaba.griver.base.api.APDownloadListener;

class a implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    private APDownloadListener f10380a;

    a(APDownloadListener aPDownloadListener) {
        this.f10380a = aPDownloadListener;
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        APDownloadListener aPDownloadListener = this.f10380a;
        if (aPDownloadListener != null) {
            aPDownloadListener.onDownloadStart(str, str2, str3, str4, j);
        }
    }
}
