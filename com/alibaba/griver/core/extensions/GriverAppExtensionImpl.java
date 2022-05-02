package com.alibaba.griver.core.extensions;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.griver.api.ui.GriverAppExtension;
import com.alibaba.griver.core.update.GriverAsyncUpdateManagerImpl;
import java.util.LinkedList;
import java.util.List;

public class GriverAppExtensionImpl implements GriverAppExtension {

    /* renamed from: a  reason: collision with root package name */
    private static List<App> f10301a = new LinkedList();

    public void onAppStart(App app) {
        if (app != null) {
            f10301a.add(app);
        }
    }

    public void onAppExit(App app) {
        if (app != null) {
            f10301a.remove(app);
            GriverAsyncUpdateManagerImpl.unRegister(app.getAppId());
        }
    }

    public App getAppByAppId(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (App next : f10301a) {
            if (TextUtils.equals(next.getAppId(), str)) {
                return next;
            }
        }
        return null;
    }

    public App getAppByUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (App next : f10301a) {
            if (TextUtils.equals(next.getStartUrl(), str)) {
                return next;
            }
        }
        return null;
    }
}
