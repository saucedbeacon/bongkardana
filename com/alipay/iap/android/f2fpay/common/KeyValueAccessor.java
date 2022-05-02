package com.alipay.iap.android.f2fpay.common;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

public class KeyValueAccessor {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f9314a;
    private String b;

    public KeyValueAccessor(SharedPreferences sharedPreferences, String str) {
        this.f9314a = sharedPreferences;
        this.b = str;
    }

    /* access modifiers changed from: protected */
    public String generateKey(String str) {
        if (this.b == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    public boolean getBoolean(String str, boolean z) {
        boolean z2;
        synchronized (this.f9314a) {
            z2 = this.f9314a.getBoolean(generateKey(str), z);
        }
        return z2;
    }

    public int getInt(String str, int i) {
        int i2;
        synchronized (this.f9314a) {
            i2 = this.f9314a.getInt(generateKey(str), i);
        }
        return i2;
    }

    public String getString(String str, String str2) {
        String string;
        synchronized (this.f9314a) {
            string = this.f9314a.getString(generateKey(str), str2);
        }
        return string;
    }

    @SuppressLint({"CommitPrefEdits"})
    public void save(String str, int i) {
        synchronized (this.f9314a) {
            this.f9314a.edit().putInt(generateKey(str), i).commit();
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    public void save(String str, String str2) {
        synchronized (this.f9314a) {
            this.f9314a.edit().putString(generateKey(str), str2).commit();
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    public void save(String str, boolean z) {
        synchronized (this.f9314a) {
            this.f9314a.edit().putBoolean(generateKey(str), z).commit();
        }
    }
}
