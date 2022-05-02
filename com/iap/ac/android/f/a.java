package com.iap.ac.android.f;

import android.text.TextUtils;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9709a = true;

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            ACLog.e(Constants.TAG, "AMCSConfigModel, parse error, invalid input");
            return false;
        }
        try {
            this.f9709a = new JSONObject(str).getBoolean("mainSwitchOn");
            return true;
        } catch (Throwable th) {
            com.iap.ac.android.a.a.a("AMCSConfigModel, parseFromJson exception: ", th, Constants.TAG);
            return false;
        }
    }
}
