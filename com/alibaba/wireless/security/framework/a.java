package com.alibaba.wireless.security.framework;

import android.content.pm.PackageInfo;
import com.alibaba.wireless.security.framework.utils.b;
import java.io.File;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public PackageInfo f9207a = null;
    private JSONObject b = null;
    private String c;

    public a(String str) {
        this.c = str;
    }

    public String a(String str) {
        try {
            return b().getString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    public boolean a() {
        try {
            return new File(this.c).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c A[SYNTHETIC, Splitter:B:18:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.content.pm.PackageInfo r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "thirdpartyso"
            java.lang.String r1 = "reversedependencies"
            java.lang.String r2 = "weakdependencies"
            java.lang.String r3 = "dependencies"
            java.lang.String r4 = "pluginclass"
            java.lang.String r5 = "pluginname"
            java.lang.String r6 = "hasso"
            r7 = 0
            if (r11 == 0) goto L_0x009c
            if (r12 != 0) goto L_0x0017
            goto L_0x009c
        L_0x0017:
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            java.lang.String r8 = "version"
            java.lang.String r9 = r11.versionName     // Catch:{ Exception -> 0x009b }
            r12.put(r8, r9)     // Catch:{ Exception -> 0x009b }
            android.content.pm.ApplicationInfo r8 = r11.applicationInfo     // Catch:{ Exception -> 0x009b }
            android.os.Bundle r8 = r8.metaData     // Catch:{ Exception -> 0x009b }
            boolean r8 = r8.getBoolean(r6, r7)     // Catch:{ Exception -> 0x009b }
            r12.put(r6, r8)     // Catch:{ Exception -> 0x009b }
            android.content.pm.ApplicationInfo r6 = r11.applicationInfo     // Catch:{ Exception -> 0x009b }
            android.os.Bundle r6 = r6.metaData     // Catch:{ Exception -> 0x009b }
            java.lang.String r6 = r6.getString(r5)     // Catch:{ Exception -> 0x009b }
            r12.put(r5, r6)     // Catch:{ Exception -> 0x009b }
            android.content.pm.ApplicationInfo r5 = r11.applicationInfo     // Catch:{ Exception -> 0x009b }
            android.os.Bundle r5 = r5.metaData     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = r5.getString(r4)     // Catch:{ Exception -> 0x009b }
            r12.put(r4, r5)     // Catch:{ Exception -> 0x009b }
            android.content.pm.ApplicationInfo r4 = r11.applicationInfo     // Catch:{ Exception -> 0x009b }
            android.os.Bundle r4 = r4.metaData     // Catch:{ Exception -> 0x009b }
            java.lang.String r4 = r4.getString(r3)     // Catch:{ Exception -> 0x009b }
            r12.put(r3, r4)     // Catch:{ Exception -> 0x009b }
            android.content.pm.ApplicationInfo r3 = r11.applicationInfo     // Catch:{ Exception -> 0x009b }
            android.os.Bundle r3 = r3.metaData     // Catch:{ Exception -> 0x009b }
            java.lang.String r3 = r3.getString(r2)     // Catch:{ Exception -> 0x009b }
            r12.put(r2, r3)     // Catch:{ Exception -> 0x009b }
            android.content.pm.ApplicationInfo r2 = r11.applicationInfo     // Catch:{ Exception -> 0x009b }
            android.os.Bundle r2 = r2.metaData     // Catch:{ Exception -> 0x009b }
            java.lang.String r2 = r2.getString(r1)     // Catch:{ Exception -> 0x009b }
            r12.put(r1, r2)     // Catch:{ Exception -> 0x009b }
            android.content.pm.ApplicationInfo r11 = r11.applicationInfo     // Catch:{ Exception -> 0x009b }
            android.os.Bundle r11 = r11.metaData     // Catch:{ Exception -> 0x009b }
            boolean r11 = r11.getBoolean(r0)     // Catch:{ Exception -> 0x009b }
            r12.put(r0, r11)     // Catch:{ Exception -> 0x009b }
            r11 = 0
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0085 }
            java.lang.String r1 = r10.c     // Catch:{ Exception -> 0x0085 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0085 }
            boolean r11 = r0.exists()     // Catch:{ Exception -> 0x0083 }
            if (r11 != 0) goto L_0x0090
            r0.createNewFile()     // Catch:{ Exception -> 0x0083 }
            goto L_0x0090
        L_0x0083:
            r11 = r0
            goto L_0x0086
        L_0x0085:
        L_0x0086:
            boolean r0 = r11.exists()
            if (r0 != 0) goto L_0x008f
            r11.createNewFile()     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            r0 = r11
        L_0x0090:
            java.lang.String r11 = r12.toString()
            boolean r11 = com.alibaba.wireless.security.framework.utils.b.a(r0, r11)
            if (r11 != 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r7 = 1
        L_0x009c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.a.a(android.content.pm.PackageInfo, java.lang.String):boolean");
    }

    public JSONObject b() {
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = null;
        try {
            String a2 = b.a(new File(this.c));
            if (a2 != null && a2.length() > 0) {
                jSONObject2 = new JSONObject(a2);
            }
        } catch (Exception unused) {
        }
        this.b = jSONObject2;
        return jSONObject2;
    }
}
