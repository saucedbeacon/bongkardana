package com.alipay.alipaysecuritysdk.rds.v2.a;

import android.content.Context;
import com.alipay.alipaysecuritysdk.rds.v2.b.c;
import com.alipay.alipaysecuritysdk.rds.v2.b.d;
import com.alipay.alipaysecuritysdk.rds.v2.b.e;
import com.alipay.alipaysecuritysdk.rds.v2.b.f;
import com.alipay.alipaysecuritysdk.rds.v2.b.g;
import com.alipay.alipaysecuritysdk.rds.v2.b.h;
import com.alipay.alipaysecuritysdk.rds.v2.b.i;
import com.alipay.alipaysecuritysdk.rds.v2.b.j;
import com.alipay.alipaysecuritysdk.rds.v2.b.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public c f9276a;
    public d b;
    public e c;
    public g d;
    public h e;
    public j f;
    public k g;
    private com.alipay.alipaysecuritysdk.rds.v2.b.a h = new com.alipay.alipaysecuritysdk.rds.v2.b.a();
    private f i;
    private i j;
    private boolean k;

    public a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        Context context2 = context;
        boolean z2 = z;
        Context context3 = context;
        this.f9276a = new c(context3, str, str2, str3, str4, str5);
        this.b = new d(context);
        this.c = new e(context);
        this.i = new f();
        this.d = new g();
        this.e = new h();
        this.j = new i();
        this.f = new j();
        this.g = new k(context3, str6, str7, str8, str9, str10);
        this.k = z2;
        if (z2) {
            this.e.a(context);
        }
    }

    public final void a(String str, String str2, boolean z) {
        this.f.a(str, str2, z);
    }
}
