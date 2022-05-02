package com.alipay.alipaysecuritysdk.rds.v2.b;

import android.content.Context;
import com.alipay.alipaysecuritysdk.common.c.b;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class h extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f9289a = {SecurityConstants.KEY_TEXT, "data"};
    private Map<String, Object> b;
    /* access modifiers changed from: private */
    public String c;
    /* access modifiers changed from: private */
    public LinkedList<a> d;
    /* access modifiers changed from: private */
    public Thread e;

    class a {

        /* renamed from: a  reason: collision with root package name */
        String f9292a = "";
        private Context c;

        public a(Context context) {
            this.c = context;
        }
    }

    public h() {
        this((byte) 0);
    }

    private h(byte b2) {
        this.c = "";
        this.d = new LinkedList<>();
        this.b = new HashMap();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        this.b.put("data", this.c);
        for (String str : f9289a) {
            Object obj = this.b.get(str);
            if (obj != null && (obj instanceof String)) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException e2) {
                    b.a("SEC_SDK-rds", (Throwable) e2);
                }
            } else if (obj != null && (obj instanceof b)) {
                try {
                    jSONObject.put(str, ((b) obj).a());
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.b     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "t"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x004d }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x004d }
            r0.put(r1, r2)     // Catch:{ all -> 0x004d }
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.b     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "data"
            java.lang.String r2 = r4.c     // Catch:{ all -> 0x004d }
            r0.put(r1, r2)     // Catch:{ all -> 0x004d }
            java.util.LinkedList<com.alipay.alipaysecuritysdk.rds.v2.b.h$a> r0 = r4.d     // Catch:{ all -> 0x004d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0024
            monitor-exit(r4)
            return
        L_0x0024:
            java.util.LinkedList<com.alipay.alipaysecuritysdk.rds.v2.b.h$a> r0 = r4.d     // Catch:{ all -> 0x004d }
            com.alipay.alipaysecuritysdk.rds.v2.b.h$a r1 = new com.alipay.alipaysecuritysdk.rds.v2.b.h$a     // Catch:{ all -> 0x004d }
            r1.<init>(r5)     // Catch:{ all -> 0x004d }
            r0.addLast(r1)     // Catch:{ all -> 0x004d }
            java.lang.Thread r5 = r4.e     // Catch:{ all -> 0x004d }
            if (r5 != 0) goto L_0x004b
            java.lang.Thread r5 = new java.lang.Thread     // Catch:{ all -> 0x004d }
            com.alipay.alipaysecuritysdk.rds.v2.b.h$1 r0 = new com.alipay.alipaysecuritysdk.rds.v2.b.h$1     // Catch:{ all -> 0x004d }
            r0.<init>()     // Catch:{ all -> 0x004d }
            r5.<init>(r0)     // Catch:{ all -> 0x004d }
            r4.e = r5     // Catch:{ all -> 0x004d }
            com.alipay.alipaysecuritysdk.rds.v2.b.h$2 r0 = new com.alipay.alipaysecuritysdk.rds.v2.b.h$2     // Catch:{ all -> 0x004d }
            r0.<init>()     // Catch:{ all -> 0x004d }
            r5.setUncaughtExceptionHandler(r0)     // Catch:{ all -> 0x004d }
            java.lang.Thread r5 = r4.e     // Catch:{ all -> 0x004d }
            r5.start()     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r4)
            return
        L_0x004d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.rds.v2.b.h.a(android.content.Context):void");
    }
}
