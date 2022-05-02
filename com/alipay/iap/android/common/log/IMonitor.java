package com.alipay.iap.android.common.log;

import java.util.Map;

public interface IMonitor {
    void aliveReport();

    void behaviour(String str, String str2, Map<String, String> map);

    @Deprecated
    void behaviour(String str, Map<String, String> map);

    @Deprecated
    void exception(String str, String str2, Map<String, String> map);

    void exception(String str, Map<String, String> map);

    @Deprecated
    void flush();

    void pageOnDestroy(Object obj);

    void pageOnEnd(Object obj, String str, String str2, Map<String, String> map);

    void pageOnStart(Object obj, String str);

    @Deprecated
    void performance(String str, String str2, String str3, Map<String, String> map);

    void performance(String str, String str2, Map<String, String> map);

    void spmClick(Object obj, String str, String str2, Map<String, String> map);

    void spmExpose(Object obj, String str, String str2, Map<String, String> map);
}
