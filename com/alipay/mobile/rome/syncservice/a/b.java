package com.alipay.mobile.rome.syncservice.a;

import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.a.a;
import com.alipay.mobile.rome.syncsdk.util.SyncThreadManager;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.j;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9466a = b.class.getName();

    public static void a() {
        j.f9463a.a(SyncThreadManager.ThreadType.SYNC_RECEIVE, new c());
    }

    static /* synthetic */ void b() {
        a a2 = a.a();
        String a3 = com.alipay.mobile.rome.syncsdk.b.a.a().a("app_id");
        String a4 = com.alipay.mobile.rome.syncsdk.b.a.a().a("workspace_id");
        if (TextUtils.isEmpty(a3) || TextUtils.isEmpty(a4)) {
            com.alipay.mobile.rome.syncsdk.b.a.a().a("app_id", a2.d());
            com.alipay.mobile.rome.syncsdk.b.a.a().a("workspace_id", a2.c.workspaceId);
        } else if (!TextUtils.equals(a3, a2.d()) || !TextUtils.equals(a4, a2.c.workspaceId)) {
            c.a(f9466a, "workspaceId or appId changed");
            com.alipay.mobile.rome.syncservice.sync.register.b.a().f9500a.edit().clear().commit();
            com.alipay.mobile.rome.syncservice.sync.a a5 = com.alipay.mobile.rome.syncservice.sync.a.a();
            com.alipay.mobile.rome.syncservice.sync.a.c.clear();
            try {
                if (a5.d == null) {
                    a5.d = a5.b.getSharedPreferences("com.alipay.android.phone.rome.syncservice.syncinfo", 0);
                }
                a5.d.edit().clear().apply();
                c.b(com.alipay.mobile.rome.syncservice.sync.a.f9483a, "clearAllKeys successfully!");
            } catch (Exception e) {
                String str = com.alipay.mobile.rome.syncservice.sync.a.f9483a;
                StringBuilder sb = new StringBuilder("clearAllKeys: [ Exception ");
                sb.append(e);
                sb.append(" ]");
                c.d(str, sb.toString());
            }
            com.alipay.mobile.rome.syncservice.sync.b.a.a a6 = com.alipay.mobile.rome.syncservice.sync.b.a.a.a(com.alipay.mobile.rome.syncservice.d.a.f9473a);
            a6.c.a("delete from sync_dispatch");
            a6.b.a("delete from syncUplink");
            com.alipay.mobile.rome.syncsdk.b.a.a().a("app_id", a2.d());
            com.alipay.mobile.rome.syncsdk.b.a.a().a("workspace_id", a2.c.workspaceId);
        }
    }
}
