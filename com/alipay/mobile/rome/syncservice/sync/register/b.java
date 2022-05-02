package com.alipay.mobile.rome.syncservice.sync.register;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncservice.d.a;
import com.alipay.mobile.rome.syncservice.sync.register.Biz;
import java.util.HashMap;
import java.util.Map;

public class b {
    private static b b;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f9500a = a.f9473a.getSharedPreferences("sync_biz_config", 0);

    private b() {
    }

    public static b a() {
        b bVar = b;
        if (bVar != null) {
            return bVar;
        }
        synchronized (b.class) {
            if (b != null) {
                b bVar2 = b;
                return bVar2;
            }
            b bVar3 = new b();
            b = bVar3;
            return bVar3;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Integer num, String str, Boolean bool, Integer num2, boolean z, Boolean bool2) {
        boolean z2;
        if (num == null) {
            c.a("DynamicBizConfigStorage", "saveSyncConfig: bizIndex is null");
        } else if (!TextUtils.isEmpty(str)) {
            if (num2 == null || !(num2.intValue() == 1 || num2.intValue() == 2)) {
                c.a("DynamicBizConfigStorage", "saveSyncConfig: illegal principalIdType rule: ".concat(String.valueOf(num2)));
                return;
            }
            try {
                Biz biz = new Biz();
                biz.b = num;
                biz.f9498a = str;
                boolean z3 = false;
                if (bool == null) {
                    z2 = false;
                } else {
                    z2 = bool.booleanValue();
                }
                biz.d = z2;
                biz.f = Biz.BizDimeEnum.getDime(num2.intValue());
                biz.c = z;
                if (bool2 != null) {
                    z3 = bool2.booleanValue();
                }
                biz.e = z3;
                Biz biz2 = a.a().b.get(str);
                if (biz2 == null) {
                    c.a("DynamicBizConfigStorage", "saveSyncConfig...new biz=".concat(String.valueOf(biz)));
                    a a2 = a.a();
                    String str2 = a.f9499a;
                    StringBuilder sb = new StringBuilder("addBizConfig: ");
                    sb.append(biz.toString());
                    c.a(str2, sb.toString());
                    a2.c.put(biz.b, biz);
                    a2.b.put(biz.f9498a, biz);
                    a2.a(biz);
                } else if (!biz2.equals(biz)) {
                    biz.f = biz2.f;
                    biz.b = biz2.b;
                    c.a("DynamicBizConfigStorage", "saveSyncConfig...modify biz=".concat(String.valueOf(biz)));
                    a a3 = a.a();
                    String str3 = a.f9499a;
                    StringBuilder sb2 = new StringBuilder("modifyBizConfig: ");
                    sb2.append(biz.toString());
                    c.a(str3, sb2.toString());
                    a3.c.put(biz.b, biz);
                    a3.b.put(biz.f9498a, biz);
                    Integer num3 = biz.b;
                    if (num3 != null) {
                        a3.i.remove(num3);
                        a3.d.remove(num3);
                        a3.h.remove(num3);
                        a3.g.remove(num3);
                        a3.f.remove(num3);
                    }
                    a3.a(biz);
                } else {
                    return;
                }
                this.f9500a.edit().putString(str, biz.toString()).commit();
            } catch (Exception e) {
                c.d("DynamicBizConfigStorage", "saveSyncConfig...error=".concat(String.valueOf(e)));
                String str4 = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
                if (TextUtils.isEmpty(str4)) {
                    str4 = com.alipay.mobile.rome.syncsdk.a.a.a().e();
                }
                com.alipay.mobile.rome.syncservice.sync.b.a().a(String.valueOf(e), str, str4, "3018");
            }
        }
    }

    public final Map<String, Biz> b() {
        HashMap hashMap;
        try {
            Map<String, ?> all = this.f9500a.getAll();
            if (all != null) {
                if (!all.isEmpty()) {
                    hashMap = new HashMap();
                    try {
                        for (Map.Entry next : all.entrySet()) {
                            try {
                                hashMap.put(next.getKey(), Biz.a((String) next.getValue()));
                            } catch (Exception e) {
                                c.d("DynamicBizConfigStorage", "readAllBizConfig item e:".concat(String.valueOf(e)));
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                    c.a("DynamicBizConfigStorage", "readAllBizConfig...bizConfigMap=".concat(String.valueOf(hashMap)));
                    return hashMap;
                }
            }
            return null;
        } catch (Exception e3) {
            e = e3;
            hashMap = null;
            c.d("DynamicBizConfigStorage", "readAllBizConfig e:".concat(String.valueOf(e)));
            String str = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
            if (TextUtils.isEmpty(str)) {
                str = com.alipay.mobile.rome.syncsdk.a.a.a().e();
            }
            com.alipay.mobile.rome.syncservice.sync.b.a().a(String.valueOf(e), (String) null, str, "3014");
            c.a("DynamicBizConfigStorage", "readAllBizConfig...bizConfigMap=".concat(String.valueOf(hashMap)));
            return hashMap;
        }
    }
}
