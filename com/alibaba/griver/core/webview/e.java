package com.alibaba.griver.core.webview;

import android.webkit.WebBackForwardList;
import com.alibaba.griver.base.api.APWebBackForwardList;
import com.alibaba.griver.base.api.APWebHistoryItem;
import com.alibaba.griver.base.nebula.DynamicProxy;

public class e implements APWebBackForwardList {

    /* renamed from: a  reason: collision with root package name */
    private WebBackForwardList f10385a;

    public e(WebBackForwardList webBackForwardList) {
        this.f10385a = webBackForwardList;
    }

    public int getCurrentIndex() {
        WebBackForwardList webBackForwardList = this.f10385a;
        if (webBackForwardList == null) {
            return -1;
        }
        return webBackForwardList.getCurrentIndex();
    }

    public APWebHistoryItem getCurrentItem() {
        WebBackForwardList webBackForwardList = this.f10385a;
        if (webBackForwardList == null || webBackForwardList.getCurrentItem() == null) {
            return null;
        }
        return (APWebHistoryItem) DynamicProxy.dynamicProxy(APWebHistoryItem.class, this.f10385a.getCurrentItem());
    }

    public APWebHistoryItem getItemAtIndex(int i) {
        WebBackForwardList webBackForwardList = this.f10385a;
        if (webBackForwardList == null || webBackForwardList.getItemAtIndex(i) == null) {
            return null;
        }
        return (APWebHistoryItem) DynamicProxy.dynamicProxy(APWebHistoryItem.class, this.f10385a.getItemAtIndex(i));
    }

    public int getSize() {
        WebBackForwardList webBackForwardList = this.f10385a;
        if (webBackForwardList == null) {
            return 0;
        }
        return webBackForwardList.getSize();
    }

    public String toString() {
        return super.toString();
    }
}
