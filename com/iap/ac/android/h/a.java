package com.iap.ac.android.h;

import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.remoteconfig.mpm.HookUrlConfig;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public List<HookUrlConfig> f9715a = new ArrayList();

    public synchronized boolean a(String str) {
        List<HookUrlConfig> list;
        try {
            list = Arrays.asList((HookUrlConfig[]) JsonUtils.fromJson(str, HookUrlConfig[].class));
        } catch (Throwable th) {
            com.iap.ac.android.a.a.a("parseHookUrlConfigList exception: ", th, Constants.TAG);
            list = null;
        }
        if (list == null || list.size() <= 0) {
            ACLog.e(Constants.TAG, "HookDecodeUrlConfigModel error, invalid input");
            return false;
        }
        this.f9715a = list;
        StringBuilder a2 = com.iap.ac.android.a.a.a("HookUrlConfigModel, finish, size: ");
        a2.append(this.f9715a.size());
        ACLog.i(Constants.TAG, a2.toString());
        if (this.f9715a.size() > 0) {
            return true;
        }
        return false;
    }

    public synchronized boolean b() {
        return this.f9715a.size() > 0;
    }

    public List<HookUrlConfig> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f9715a);
        return arrayList;
    }
}
