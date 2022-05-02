package com.alipay.mobile.rome.syncsdk.msg;

import android.content.Context;
import com.alipay.mobile.rome.syncsdk.util.c;
import java.io.File;

public abstract class a {
    private static final String b = a.class.getSimpleName();
    private static String c = "com.alipay.android.phone.rome.syncsdk";

    /* renamed from: a  reason: collision with root package name */
    protected String f9411a = "";
    private Context d;

    public abstract void a(String str);

    public abstract boolean a(MsgInfo msgInfo);

    public abstract void b(MsgInfo msgInfo);

    public a(Context context) {
        this.d = context;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.getFilesDir().getPath());
        sb.append("/");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(c);
        sb2.append(File.separatorChar);
        String obj2 = sb2.toString();
        c.a(b, "getMsgDir() strLonglink=".concat(String.valueOf(obj2)));
        new File(obj).mkdir();
        new File(obj2).mkdir();
        return obj2;
    }
}
