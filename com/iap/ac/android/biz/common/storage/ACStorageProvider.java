package com.iap.ac.android.biz.common.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.common.log.ACLog;

public class ACStorageProvider {

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f9688a;

    public ACStorageProvider(@NonNull Context context, @NonNull String str) {
        if (context == null) {
            ACLog.e(Constants.TAG, "ACStorageProvider, Context should not be null");
        } else if (TextUtils.isEmpty(str)) {
            ACLog.e(Constants.TAG, "ACStorageProvider, bizType should not be null");
        } else {
            this.f9688a = context.getSharedPreferences("ACConnect_sp".concat(String.valueOf(str)), 0);
        }
    }

    public synchronized boolean clear() {
        try {
            this.f9688a.edit().clear().apply();
        } catch (Exception e) {
            ACLog.e(Constants.TAG, "ACStorageProvider, clear exception: ".concat(String.valueOf(e)));
            return false;
        }
        return true;
    }

    public synchronized boolean delete(String str) {
        if (TextUtils.isEmpty(str)) {
            ACLog.e(Constants.TAG, "ACStorageProvider, delete, key should not be null, delete failed.");
            return false;
        }
        try {
            this.f9688a.edit().remove(str).apply();
            return true;
        } catch (Exception e) {
            ACLog.e(Constants.TAG, "ACStorageProvider, delete exception: ".concat(String.valueOf(e)));
            return false;
        }
    }

    public synchronized String fetch(String str) {
        if (TextUtils.isEmpty(str)) {
            ACLog.e(Constants.TAG, "ACStorageProvider, fetch, key should not be null, return null");
            return null;
        }
        try {
            if (!this.f9688a.contains(str)) {
                StringBuilder sb = new StringBuilder("ACStorageProvider, fetch, value of key ");
                sb.append(str);
                sb.append(" does not exist, return null");
                ACLog.e(Constants.TAG, sb.toString());
                return null;
            }
            return this.f9688a.getString(str, "");
        } catch (Exception e) {
            ACLog.e(Constants.TAG, "ACStorageProvider, fetch exception: ".concat(String.valueOf(e)));
            return null;
        }
    }

    public synchronized boolean save(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("ACStorageProvider, key should not be null, save fail for key: ");
            sb.append(str);
            sb.append(", value: ");
            sb.append(str2);
            ACLog.e(Constants.TAG, sb.toString());
            return false;
        }
        try {
            this.f9688a.edit().putString(str, str2).apply();
            return true;
        } catch (Exception e) {
            ACLog.e(Constants.TAG, "ACStorageProvider, save exception: ".concat(String.valueOf(e)));
            return false;
        }
    }
}
