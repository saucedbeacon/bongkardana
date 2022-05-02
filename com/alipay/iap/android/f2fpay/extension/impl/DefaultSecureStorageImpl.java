package com.alipay.iap.android.f2fpay.extension.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alipay.iap.android.f2fpay.extension.IF2FPaySecureStorage;
import com.alipay.iap.android.f2fpay.otp.F2FPayOtpInfo;
import com.alipay.secotp.SecOtpGenerator;

public class DefaultSecureStorageImpl implements IF2FPaySecureStorage {

    /* renamed from: a  reason: collision with root package name */
    protected SharedPreferences f9323a;
    protected String b;
    protected int c;

    public boolean checkOtpInfoExist(String str) {
        return SecOtpGeneratorManager.getInstance().getGenerator().checkConfigure("f2fpay") && TextUtils.equals(str, this.b);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void clear() {
        this.c = 0;
        this.b = null;
        this.f9323a.edit().clear().commit();
        SecOtpGeneratorManager.getInstance().getGenerator().deleteConfigure("f2fpay");
    }

    @Nullable
    public F2FPayOtpInfo getOtpInfoByIdentity(String str) {
        if (TextUtils.equals(str, this.b)) {
            return new F2FPayOtpInfo((String) null, (String) null, this.c);
        }
        return null;
    }

    public void initialize(Context context) {
        SecOtpGeneratorManager.getInstance().initialize(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("f2fpay_security_storage", 0);
        this.f9323a = sharedPreferences;
        this.b = sharedPreferences.getString("CurrentIdentity", "");
        this.c = this.f9323a.getInt("CurrentOtpInfoInterval", 0);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void saveOtpInfo(F2FPayOtpInfo f2FPayOtpInfo, String str) {
        long j;
        String str2;
        String str3;
        int i = f2FPayOtpInfo != null ? f2FPayOtpInfo.interval : 0;
        this.b = str;
        this.c = i;
        SecOtpGenerator generator = SecOtpGeneratorManager.getInstance().getGenerator();
        if (f2FPayOtpInfo != null) {
            str3 = f2FPayOtpInfo.index;
            str2 = f2FPayOtpInfo.otpSeed;
            j = (long) f2FPayOtpInfo.interval;
        } else {
            str3 = null;
            str2 = null;
            j = 0;
        }
        generator.saveConfigure("f2fpay", str3, str2, j);
        this.f9323a.edit().putString("CurrentIdentity", str).putInt("CurrentOtpInfoInterval", i).commit();
    }
}
