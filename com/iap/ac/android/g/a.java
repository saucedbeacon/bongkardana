package com.iap.ac.android.g;

import android.text.TextUtils;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.remoteconfig.cpm.CPMConfig;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public List<CPMConfig> f9711a = new ArrayList();

    public synchronized CPMConfig a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (CPMConfig next : this.f9711a) {
            if (next != null && TextUtils.equals(str, next.codeType)) {
                return next;
            }
        }
        return null;
    }

    public synchronized boolean b(String str) {
        List<CPMConfig> list;
        try {
            list = Arrays.asList((CPMConfig[]) JsonUtils.fromJson(str, CPMConfig[].class));
        } catch (Throwable th) {
            com.iap.ac.android.a.a.a("parseCpmConfigList exception: ", th, Constants.TAG);
            list = null;
        }
        if (list == null || list.size() <= 0) {
            ACLog.e(Constants.TAG, "CPMConfigModel parse error, invalid input");
            return false;
        }
        this.f9711a = list;
        StringBuilder a2 = com.iap.ac.android.a.a.a("CPMConfigModel parse finish, size: ");
        a2.append(this.f9711a.size());
        ACLog.i(Constants.TAG, a2.toString());
        if (this.f9711a.size() > 0) {
            return true;
        }
        return false;
    }

    public synchronized boolean a() {
        return this.f9711a.size() > 0;
    }
}
