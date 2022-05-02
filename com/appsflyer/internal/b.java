package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import com.google.firebase.analytics.FirebaseAnalytics;

public final class b {

    /* renamed from: ˋ  reason: contains not printable characters */
    private IntentFilter f8724 = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    public static final class d {

        /* renamed from: ˋ  reason: contains not printable characters */
        public static final b f8727 = new b();
    }

    b() {
    }

    @NonNull
    /* renamed from: ˋ  reason: contains not printable characters */
    public final a m1254(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, this.f8724);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? H5ResourceHandlerUtil.OTHER : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (!(-1 == intExtra2 || -1 == intExtra3)) {
                    f = (((float) intExtra2) * 100.0f) / ((float) intExtra3);
                }
            }
        } catch (Throwable unused) {
        }
        return new a(f, str);
    }

    public static final class a {

        /* renamed from: ˎ  reason: contains not printable characters */
        public final float f8725;

        /* renamed from: ॱ  reason: contains not printable characters */
        public final String f8726;

        a(float f, String str) {
            this.f8725 = f;
            this.f8726 = str;
        }

        a() {
        }
    }
}
