package com.alibaba.ariver.kernel.common.network.download;

import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class RVDownloadRequest {

    /* renamed from: a  reason: collision with root package name */
    private String f10105a;
    private String b;
    private String c;
    private boolean d;

    public String getDownloadDir() {
        return this.b;
    }

    public void setDownloadDir(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1223471245, oncanceled);
            onCancelLoad.getMin(1223471245, oncanceled);
        }
        this.b = str;
    }

    public String getDownloadFileName() {
        return this.c;
    }

    public void setDownloadFileName(String str) {
        this.c = str;
    }

    public String getDownloadUrl() {
        return this.f10105a;
    }

    public void setDownloadUrl(String str) {
        this.f10105a = str;
    }

    public boolean isUrgentResource() {
        return this.d;
    }

    public void setIsUrgentResource(boolean z) {
        this.d = z;
    }
}
