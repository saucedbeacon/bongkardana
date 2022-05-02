package com.alipay.iap.android.aplog.log.spm;

import java.util.Map;

public interface ISpmMonitor {
    Object getTopPage();

    void pageOnDestroy(Object obj);

    void pageOnEnd(Object obj, String str, String str2, Map<String, String> map);

    void pageOnStart(Object obj, String str);

    void spmClick(Object obj, String str, String str2, Map<String, String> map);

    void spmExpose(Object obj, String str, String str2, Map<String, String> map);
}
