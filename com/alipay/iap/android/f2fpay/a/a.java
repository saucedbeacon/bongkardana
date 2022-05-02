package com.alipay.iap.android.f2fpay.a;

import com.alipay.iap.android.f2fpay.extension.IF2FPayLogger;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f9303a;
    private Map<String, String> b;

    private a(String str) {
        this.f9303a = str;
    }

    public static a a(String str) {
        return new a(str);
    }

    public a a(String str, Object obj) {
        return a(str, String.valueOf(obj));
    }

    public a a(String str, String str2) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(str, str2);
        return this;
    }

    public void a(IF2FPayLogger iF2FPayLogger) {
        if (iF2FPayLogger != null) {
            iF2FPayLogger.event(this.f9303a, this.b);
        }
    }
}
