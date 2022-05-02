package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract class AFEvent {
    @Nullable

    /* renamed from: ʻ  reason: contains not printable characters */
    String f8533;

    /* renamed from: ʻॱ  reason: contains not printable characters */
    private final boolean f8534;

    /* renamed from: ʼ  reason: contains not printable characters */
    Map<String, Object> f8535;

    /* renamed from: ʽ  reason: contains not printable characters */
    public String f8536;

    /* renamed from: ˊ  reason: contains not printable characters */
    public Context f8537;

    /* renamed from: ˊॱ  reason: contains not printable characters */
    public int f8538;

    /* renamed from: ˋ  reason: contains not printable characters */
    public Map<String, Object> f8539;

    /* renamed from: ˋॱ  reason: contains not printable characters */
    boolean f8540;

    /* renamed from: ˎ  reason: contains not printable characters */
    public WeakReference<Context> f8541;

    /* renamed from: ˏ  reason: contains not printable characters */
    AppsFlyerTrackingRequestListener f8542;

    /* renamed from: ˏॱ  reason: contains not printable characters */
    String f8543;

    /* renamed from: ͺ  reason: contains not printable characters */
    public String f8544;
    @Nullable

    /* renamed from: ॱ  reason: contains not printable characters */
    public Intent f8545;

    /* renamed from: ॱˊ  reason: contains not printable characters */
    byte[] f8546;

    /* renamed from: ॱॱ  reason: contains not printable characters */
    String f8547;

    /* renamed from: ᐝ  reason: contains not printable characters */
    public String f8548;

    public AFEvent() {
        this(true);
    }

    public AFEvent(boolean z) {
        this.f8534 = z;
    }

    public AFEvent context(Context context) {
        this.f8537 = context;
        return this;
    }

    /* access modifiers changed from: protected */
    public AFEvent urlString(String str) {
        this.f8543 = str;
        return this;
    }

    @Nullable
    public Intent intent() {
        return this.f8545;
    }

    public AFEvent post(byte[] bArr) {
        this.f8546 = bArr;
        return this;
    }

    public AFEvent cacheKey(String str) {
        this.f8547 = str;
        return this;
    }

    public boolean isEncrypt() {
        return this.f8534;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ˊ  reason: contains not printable characters */
    public final AFEvent m1116() {
        Context context = this.f8537;
        Context context2 = null;
        if (context == null) {
            WeakReference<Context> weakReference = this.f8541;
            if (weakReference != null) {
                context = weakReference.get();
            } else {
                context = null;
            }
        }
        if (context != null) {
            Context context3 = this.f8537;
            if (context3 != null) {
                context2 = context3;
            } else {
                WeakReference<Context> weakReference2 = this.f8541;
                if (weakReference2 != null) {
                    context2 = weakReference2.get();
                }
            }
            this.f8537 = context2.getApplicationContext();
        }
        return this;
    }
}
