package com.iap.ac.android.common.data.provider;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.ACLog;

public class SpDataStorageProvider implements IDataStorageProvider {
    private static final String SP_PREFIX = "sp_";
    private static final String TAG = "SpDataStorageProvider";
    private SharedPreferences sharedPreferences;

    public SpDataStorageProvider(@NonNull Context context, @NonNull String str) {
        if (context == null) {
            ACLog.w(TAG, "Context should not be null");
        } else if (TextUtils.isEmpty(str)) {
            ACLog.w(TAG, "bizType should not be null");
        } else {
            this.sharedPreferences = context.getSharedPreferences(SP_PREFIX.concat(String.valueOf(str)), 0);
        }
    }

    public synchronized boolean save(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ACLog.e(TAG, "key should not be null, save failed");
            return false;
        }
        try {
            this.sharedPreferences.edit().putString(str, str2).apply();
            return true;
        } catch (Exception e) {
            ACLog.e(TAG, String.format("Save %s failed because of exception: %s", new Object[]{str, e.getMessage()}));
            return false;
        }
    }

    public synchronized String get(String str) {
        if (TextUtils.isEmpty(str)) {
            ACLog.e(TAG, "key should not be null, return null");
            return null;
        }
        try {
            if (!this.sharedPreferences.contains(str)) {
                ACLog.w(TAG, String.format("value of key: %s does not exist, return null", new Object[]{str}));
                return null;
            }
            return this.sharedPreferences.getString(str, "");
        } catch (Exception e) {
            ACLog.e(TAG, String.format("fetch %s failed because of exception: %s", new Object[]{str, e.getMessage()}));
            return null;
        }
    }

    public synchronized boolean delete(String str) {
        if (TextUtils.isEmpty(str)) {
            ACLog.e(TAG, "key should not be null, delete failed");
            return false;
        }
        try {
            this.sharedPreferences.edit().remove(str).apply();
            return true;
        } catch (Exception e) {
            ACLog.e(TAG, String.format("delete %s failed because of exception: %s", new Object[]{str, e.getMessage()}));
            return false;
        }
    }

    public synchronized boolean clear() {
        try {
            this.sharedPreferences.edit().clear().apply();
        } catch (Exception e) {
            ACLog.e(TAG, String.format("clear data failed because of exception: %s", new Object[]{e.getMessage()}));
            return false;
        }
        return true;
    }
}
