package com.iap.ac.android.f;

import android.text.TextUtils;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.d.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public OAuthConfig f9710a;
    public List<String> b;

    public boolean a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            ACLog.e(Constants.TAG, "OAuthConfigModel, parse error, invalid input");
            return false;
        }
        OAuthConfig oAuthConfig = this.f9710a;
        if (oAuthConfig != null) {
            this.b = oAuthConfig.scopes;
        }
        synchronized (this) {
            this.f9710a = (OAuthConfig) e.a(str, OAuthConfig.class);
            a();
            StringBuilder sb = new StringBuilder("OAuthConfigModel, parse finish, success: ");
            sb.append(this.f9710a != null);
            ACLog.i(Constants.TAG, sb.toString());
            if (this.f9710a != null) {
                z = true;
            }
        }
        return z;
    }

    public OAuthConfig b() {
        OAuthConfig oAuthConfig;
        synchronized (this) {
            oAuthConfig = this.f9710a;
        }
        return oAuthConfig;
    }

    public boolean c() {
        return this.f9710a != null;
    }

    public final void a() {
        List<String> list;
        OAuthConfig oAuthConfig = this.f9710a;
        if (oAuthConfig != null && (list = this.b) != null && oAuthConfig.scopes != null && list.size() > 0 && this.f9710a.scopes.size() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f9710a.scopes);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.b);
            Collections.sort(arrayList);
            Collections.sort(arrayList2);
            if (!arrayList.equals(arrayList2)) {
                ACManager.getInstance().clear();
            }
        }
    }
}
