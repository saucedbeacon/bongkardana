package com.alipay.iap.android.common.securitydata.storage.provider;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class SpDataStorageProvider implements IDataStorageProvider {
    private static final String SP_PREFIX = "sp_";
    private static final String TAG = "SpDataStorageProvider";
    private SharedPreferences sharedPreferences;

    public SpDataStorageProvider(@NonNull Context context, @NonNull String str) {
        if (context == null) {
            LoggerWrapper.w(TAG, "Context should not be null");
        } else if (TextUtils.isEmpty(str)) {
            LoggerWrapper.w(TAG, "bizType should not be null");
        } else {
            this.sharedPreferences = context.getSharedPreferences(SP_PREFIX.concat(String.valueOf(str)), 0);
        }
    }

    public synchronized boolean save(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LoggerWrapper.e(TAG, "key should not be null, save failed");
            return false;
        }
        try {
            this.sharedPreferences.edit().putString(str, str2).apply();
            return true;
        } catch (Exception e) {
            LoggerWrapper.e(TAG, LoggerWrapper.buildMessage("Save %s failed because of exception: %s", str, e.getMessage()));
            return false;
        }
    }

    public synchronized String fetch(String str) {
        int i;
        if (str != null) {
            try {
                i = str.length();
            } catch (Exception e) {
                LoggerWrapper.e(TAG, LoggerWrapper.buildMessage("fetch %s failed because of exception: %s", str, e.getMessage()));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            i = 0;
        }
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-576032214, oncanceled);
            onCancelLoad.getMin(-576032214, oncanceled);
        }
        if (TextUtils.isEmpty(str)) {
            LoggerWrapper.e(TAG, "key should not be null, return null");
            return null;
        } else if (!this.sharedPreferences.contains(str)) {
            LoggerWrapper.w(TAG, LoggerWrapper.buildMessage("value of key: %s does not exist, return null", str));
            return null;
        } else {
            return this.sharedPreferences.getString(str, "");
        }
    }

    public synchronized boolean delete(String str) {
        if (TextUtils.isEmpty(str)) {
            LoggerWrapper.e(TAG, "key should not be null, delete failed");
            return false;
        }
        try {
            this.sharedPreferences.edit().remove(str).apply();
            return true;
        } catch (Exception e) {
            LoggerWrapper.e(TAG, LoggerWrapper.buildMessage("delete %s failed because of exception: %s", str, e.getMessage()));
            return false;
        }
    }

    public synchronized boolean clear() {
        try {
            this.sharedPreferences.edit().clear().apply();
        } catch (Exception e) {
            LoggerWrapper.e(TAG, LoggerWrapper.buildMessage("clear data failed because of exception: %s", e.getMessage()));
            return false;
        }
        return true;
    }
}
