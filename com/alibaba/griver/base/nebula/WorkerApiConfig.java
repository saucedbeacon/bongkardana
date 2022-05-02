package com.alibaba.griver.base.nebula;

import com.alipay.iap.android.aplog.api.LogCategory;
import com.iap.ac.android.acs.plugin.utils.Constants;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WorkerApiConfig {

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f10234a;
    private static List<String> b;

    public static synchronized Set<String> getDefaultSyncJsApiSet() {
        Set<String> set;
        synchronized (WorkerApiConfig.class) {
            if (f10234a == null) {
                HashSet hashSet = new HashSet();
                f10234a = hashSet;
                hashSet.add("getSystemInfo");
                f10234a.add("setAPDataStorage");
                f10234a.add("getAPDataStorage");
                f10234a.add("removeAPDataStorage");
                f10234a.add("clearAPDataStorage");
                f10234a.add("setTinyLocalStorage");
                f10234a.add("getTinyLocalStorage");
                f10234a.add("removeTinyLocalStorage");
                f10234a.add("clearTinyLocalStorage");
                f10234a.add("getTinyLocalStorageInfo");
                f10234a.add("getStartupParams");
                f10234a.add("internalAPI");
                f10234a.add("measureText");
                f10234a.add("getBackgroundAudioOption");
                f10234a.add("getForegroundAudioOption");
                f10234a.add("NBComponent.sendMessage");
                f10234a.add("getBatteryInfo");
                f10234a.add("tyroRequest");
                f10234a.add("bindUDPSocket");
            }
            set = f10234a;
        }
        return set;
    }

    public static synchronized List<String> getDefaultAsyncJsApiList() {
        List<String> list;
        synchronized (WorkerApiConfig.class) {
            if (b == null) {
                ArrayList arrayList = new ArrayList();
                b = arrayList;
                arrayList.add("getSystemInfo");
                b.add("remoteLog");
                b.add("httpRequest");
                b.add(RequestPermissionsEvent.REQUEST);
                b.add(LogCategory.LOG_SPM);
                b.add("reportData");
                b.add(Constants.JS_API_GET_AUTH_CODE);
                b.add("setTinyLocalStorage");
                b.add("getTinyLocalStorage");
                b.add("removeTinyLocalStorage");
                b.add("trackerConfig");
                b.add("configService.getConfig");
                b.add("getAuthUserInfo");
                b.add("localLog");
            }
            list = b;
        }
        return list;
    }
}
