package com.alipay.alipaysecuritysdk.rds.v2.face;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import com.alibaba.griver.core.jsapi.actionsheet.ActionSheetItem;
import com.alipay.alipaysecuritysdk.apdid.bridge.JNIBridge;
import com.alipay.alipaysecuritysdk.apdid.face.APSecuritySdk;
import com.alipay.alipaysecuritysdk.common.c.b;
import com.alipay.alipaysecuritysdk.common.e.f;
import com.alipay.alipaysecuritysdk.rds.constant.DictionaryKeys;
import com.alipay.alipaysecuritysdk.rds.v2.a.a;
import com.alipay.alipaysecuritysdk.rds.v2.b.a.e;
import com.alipay.alipaysecuritysdk.rds.v2.b.c;
import com.alipay.alipaysecuritysdk.rds.v2.b.d;
import com.alipay.alipaysecuritysdk.rds.v2.b.g;
import com.alipay.alipaysecuritysdk.rds.v2.b.h;
import com.alipay.alipaysecuritysdk.rds.v2.b.j;
import com.alipay.alipaysecuritysdk.rds.v2.b.k;
import java.util.Map;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

public class RDSClient {
    private static final String RDS_VERSION = "1";
    private static final String RDS_ZIP_VERSION = "2";
    private static Context context = null;
    private static boolean debug = false;
    private static int getMin = 1;
    private static char length;
    private static char[] setMax;
    private static int setMin;
    private a manager;

    static void setMin() {
        length = 3;
        setMax = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    static {
        setMin();
        int i = getMin + 19;
        setMin = i % 128;
        int i2 = i % 2;
    }

    public static void init(final Context context2) {
        int i = setMin + 77;
        getMin = i % 128;
        if (i % 2 == 0) {
            Object obj = null;
            super.hashCode();
            if (context2 == null) {
                return;
            }
        } else if (context2 == null) {
            return;
        }
        isDebug();
        f.a().b(new Runnable() {
            public final void run() {
                try {
                    JNIBridge.getNativeProp(context2, "AD104", "");
                    JNIBridge.getNativeProp(context2, "AD107", "");
                } catch (Throwable th) {
                    b.a("SEC_SDK-rds", th);
                }
            }
        });
        try {
            int i2 = setMin + 105;
            getMin = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public synchronized boolean onPage(Context context2, Map<String, String> map, boolean z) {
        Map<String, String> map2 = map;
        synchronized (this) {
            int i = setMin + 51;
            getMin = i % 128;
            int i2 = i % 2;
            boolean z2 = false;
            if ((context2 == null ? '`' : 5) != 5) {
                try {
                    int i3 = setMin + 1;
                    getMin = i3 % 128;
                    return i3 % 2 == 0 ? false : false;
                } catch (Exception e) {
                    throw e;
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                setContext(context2);
                String str = "";
                String str2 = "";
                try {
                    APSecuritySdk.TokenResult tokenResult = APSecuritySdk.getInstance(context2).getTokenResult();
                    if (tokenResult == null) {
                        z2 = true;
                    }
                    if (!z2) {
                        int i4 = setMin + 43;
                        getMin = i4 % 128;
                        int i5 = i4 % 2;
                        str = tokenResult.apdid;
                        str2 = tokenResult.apdidToken;
                        int i6 = setMin + 101;
                        getMin = i6 % 128;
                        int i7 = i6 % 2;
                    }
                } catch (Throwable th) {
                    b.a("SEC_SDK-rds", th);
                }
                a aVar = r2;
                String str3 = map2.get(DictionaryKeys.V2_REFPAGENAME);
                a aVar2 = new a(context2, str, map2.get("umidToken"), map2.get("utdid"), map2.get("tid"), str2, map2.get("appver"), map2.get("user"), map2.get("appname"), map2.get("appkey"), map2.get(DictionaryKeys.V2_PACKAGENAME), z);
                this.manager = aVar;
                j jVar = aVar.f;
                jVar.c.incrementAndGet();
                e eVar = new e(map2.get(DictionaryKeys.V2_PAGENAME), "1", jVar.d.incrementAndGet());
                eVar.a(str3);
                jVar.e.a(eVar);
                jVar.f = eVar;
                return true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        if ((r6 != null) != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        if (r6 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String onPageEndAndZip(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = setMin     // Catch:{ all -> 0x0067 }
            int r0 = r0 + 67
            int r1 = r0 % 128
            getMin = r1     // Catch:{ all -> 0x0067 }
            int r0 = r0 % 2
            r1 = 36
            if (r0 != 0) goto L_0x0012
            r0 = 76
            goto L_0x0014
        L_0x0012:
            r0 = 36
        L_0x0014:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0025
            r0 = 66
            int r0 = r0 / r3
            if (r6 == 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r0 == 0) goto L_0x0036
            goto L_0x0027
        L_0x0023:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x0025:
            if (r6 == 0) goto L_0x0036
        L_0x0027:
            int r0 = setMin     // Catch:{ all -> 0x0067 }
            int r0 = r0 + 59
            int r1 = r0 % 128
            getMin = r1     // Catch:{ all -> 0x0067 }
            int r0 = r0 % 2
            android.content.Context r0 = r6.getApplicationContext()     // Catch:{ all -> 0x0067 }
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 == 0) goto L_0x0061
            int r1 = getMin     // Catch:{ all -> 0x0067 }
            int r1 = r1 + r2
            int r4 = r1 % 128
            setMin = r4     // Catch:{ all -> 0x0067 }
            int r1 = r1 % 2
            if (r7 == 0) goto L_0x004b
            int r3 = r7.length()     // Catch:{ Exception -> 0x0049 }
            goto L_0x004b
        L_0x0049:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x004b:
            int r0 = o.dispatchOnCancelled.setMin(r0, r3)     // Catch:{ all -> 0x0067 }
            if (r3 == r0) goto L_0x0061
            o.onCanceled r1 = new o.onCanceled     // Catch:{ all -> 0x0067 }
            r4 = 8
            r1.<init>(r3, r0, r4)     // Catch:{ all -> 0x0067 }
            r0 = 1354611408(0x50bdbad0, float:2.54650941E10)
            o.onCancelLoad.setMax(r0, r1)     // Catch:{ all -> 0x0067 }
            o.onCancelLoad.getMin(r0, r1)     // Catch:{ all -> 0x0067 }
        L_0x0061:
            java.lang.String r6 = r5.onPageEndAndZip(r6, r7, r2)     // Catch:{ all -> 0x0067 }
            monitor-exit(r5)
            return r6
        L_0x0067:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.rds.v2.face.RDSClient.onPageEndAndZip(android.content.Context, java.lang.String):java.lang.String");
    }

    public synchronized String onPageEnd(Context context2, String str) {
        try {
            int i = setMin + 77;
            getMin = i % 128;
            if (i % 2 == 0) {
            }
        } catch (Exception e) {
            throw e;
        }
        return onPageEndAndZip(context2, str, false);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.alipay.alipaysecuritysdk.rds.v2.b.b, java.lang.Object, java.lang.String] */
    private String onPageEndAndZip(Context context2, String str, boolean z) {
        String str2;
        ? r6 = 0;
        if (this.manager != null) {
            this.manager.g.b.put("user", str);
            j jVar = this.manager.f;
            Integer valueOf = Integer.valueOf(jVar.c.get());
            if (jVar.f != null) {
                int i = getMin + 119;
                setMin = i % 128;
                if (i % 2 != 0) {
                    jVar.b.put(ActionSheetItem.BadgeInfo.TYPE_NUM, String.valueOf(valueOf));
                    jVar.f = r6;
                    try {
                        super.hashCode();
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    jVar.b.put(ActionSheetItem.BadgeInfo.TYPE_NUM, String.valueOf(valueOf));
                    jVar.f = r6;
                }
            }
            if (getContext() == null) {
                int i2 = setMin + 41;
                getMin = i2 % 128;
                int i3 = i2 % 2;
                return r6;
            }
            a aVar = this.manager;
            c cVar = aVar.f9276a;
            com.alipay.alipaysecuritysdk.rds.v2.b.e eVar = aVar.c;
            d dVar = aVar.b;
            k kVar = aVar.g;
            h hVar = aVar.e;
            j jVar2 = aVar.f;
            g gVar = aVar.d;
            cVar.b = hVar;
            cVar.c.put("sensor", cVar.b);
            kVar.c = jVar2;
            kVar.b.put("ua", kVar.c);
            gVar.c = cVar;
            gVar.d = eVar;
            gVar.e = dVar;
            gVar.f = kVar;
            gVar.b.put("dev", gVar.c);
            gVar.b.put("loc", gVar.d);
            gVar.b.put("env", gVar.e);
            gVar.b.put("usr", gVar.f);
            String jSONObject = gVar.a().toString();
            String str3 = "2";
            if ((z ? 'W' : '0') != '0') {
                int i4 = getMin + 39;
                setMin = i4 % 128;
                if (i4 % 2 != 0) {
                    try {
                        int length2 = r6.length;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                str3 = "1";
            }
            try {
                str2 = new String(JNIBridge.zipAndEncryptData(getContext(), jSONObject), length(new char[]{1, 2, 0, 5, 153}, (byte) (97 - (Process.myPid() >> 22)), Color.blue(0) + 5).intern());
            } catch (Throwable th3) {
                b.a("SEC_SDK-rds", th3);
                str2 = "";
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("version", str3);
                jSONObject2.put("data", str2);
                return jSONObject2.toString();
            } catch (JSONException e) {
                b.a("SEC_SDK-rds", (Throwable) e);
                return "";
            }
        } else {
            b.b("SEC_SDK-rds", "onPageEndAndZip manager is null");
            return r6;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0027, code lost:
        if ((r3.manager == null) != true) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        com.alipay.alipaysecuritysdk.common.c.b.b("SEC_SDK-rds", "onControlClick manager is null");
        r4 = getMin + 31;
        setMin = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0045, code lost:
        if ((r4 % 2) == 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0047, code lost:
        r4 = '!';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        r4 = '=';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004c, code lost:
        if (r4 == '!') goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r4 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0052, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onControlClick(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = setMin     // Catch:{ Exception -> 0x0059 }
            int r0 = r0 + 117
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x0059 }
            int r0 = r0 % 2
            r1 = 81
            if (r0 != 0) goto L_0x0012
            r0 = 26
            goto L_0x0014
        L_0x0012:
            r0 = 81
        L_0x0014:
            r2 = 0
            if (r0 == r1) goto L_0x001f
            com.alipay.alipaysecuritysdk.rds.v2.a.a r0 = r3.manager     // Catch:{ all -> 0x0057 }
            int r1 = r2.length     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0032
            goto L_0x0029
        L_0x001d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0057 }
        L_0x001f:
            com.alipay.alipaysecuritysdk.rds.v2.a.a r0 = r3.manager     // Catch:{ Exception -> 0x0055 }
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r0 = 0
            goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            if (r0 == r1) goto L_0x0032
        L_0x0029:
            com.alipay.alipaysecuritysdk.rds.v2.a.a r0 = r3.manager     // Catch:{ Exception -> 0x0055 }
            com.alipay.alipaysecuritysdk.rds.v2.b.j r0 = r0.f     // Catch:{ Exception -> 0x0055 }
            r0.a(r4, r5)     // Catch:{ Exception -> 0x0055 }
            monitor-exit(r3)
            return
        L_0x0032:
            java.lang.String r4 = "SEC_SDK-rds"
            java.lang.String r5 = "onControlClick manager is null"
            com.alipay.alipaysecuritysdk.common.c.b.b(r4, r5)     // Catch:{ all -> 0x0057 }
            int r4 = getMin     // Catch:{ all -> 0x0057 }
            int r4 = r4 + 31
            int r5 = r4 % 128
            setMin = r5     // Catch:{ all -> 0x0057 }
            int r4 = r4 % 2
            r5 = 33
            if (r4 == 0) goto L_0x004a
            r4 = 33
            goto L_0x004c
        L_0x004a:
            r4 = 61
        L_0x004c:
            if (r4 == r5) goto L_0x0050
            monitor-exit(r3)
            return
        L_0x0050:
            int r4 = r2.length     // Catch:{ all -> 0x0053 }
            monitor-exit(r3)
            return
        L_0x0053:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0057 }
        L_0x0055:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r4 = move-exception
            goto L_0x005b
        L_0x0059:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0057 }
        L_0x005b:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.rds.v2.face.RDSClient.onControlClick(java.lang.String, java.lang.String):void");
    }

    public synchronized void onKeyDown(String str, String str2, String str3) {
        int i = getMin + 85;
        setMin = i % 128;
        int i2 = i % 2;
        if (this.manager != null) {
            this.manager.f.a(str, str2, str3);
            return;
        }
        b.b("SEC_SDK-rds", "onKeyDown manager is null");
        int i3 = setMin + 35;
        getMin = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        if ((r4.manager != null ? '-' : 'H') != 'H') goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0040, code lost:
        com.alipay.alipaysecuritysdk.common.c.b.b("SEC_SDK-rds", "onGetFocus manager is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onGetFocus(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = getMin     // Catch:{ all -> 0x0049 }
            int r0 = r0 + 67
            int r1 = r0 % 128
            setMin = r1     // Catch:{ all -> 0x0049 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            if (r0 == r2) goto L_0x0020
            com.alipay.alipaysecuritysdk.rds.v2.a.a r0 = r4.manager     // Catch:{ all -> 0x0049 }
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001b
            r1 = 1
        L_0x001b:
            if (r1 == 0) goto L_0x0040
            goto L_0x002d
        L_0x001e:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0049 }
        L_0x0020:
            com.alipay.alipaysecuritysdk.rds.v2.a.a r0 = r4.manager     // Catch:{ all -> 0x0049 }
            r1 = 72
            if (r0 == 0) goto L_0x0029
            r0 = 45
            goto L_0x002b
        L_0x0029:
            r0 = 72
        L_0x002b:
            if (r0 == r1) goto L_0x0040
        L_0x002d:
            com.alipay.alipaysecuritysdk.rds.v2.a.a r0 = r4.manager     // Catch:{ all -> 0x0049 }
            r0.a(r5, r6, r2)     // Catch:{ all -> 0x0049 }
            int r5 = setMin     // Catch:{ Exception -> 0x003e }
            int r5 = r5 + 67
            int r6 = r5 % 128
            getMin = r6     // Catch:{ Exception -> 0x003e }
            int r5 = r5 % 2
            monitor-exit(r4)
            return
        L_0x003e:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0049 }
        L_0x0040:
            java.lang.String r5 = "SEC_SDK-rds"
            java.lang.String r6 = "onGetFocus manager is null"
            com.alipay.alipaysecuritysdk.common.c.b.b(r5, r6)     // Catch:{ all -> 0x0049 }
            monitor-exit(r4)
            return
        L_0x0049:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.rds.v2.face.RDSClient.onGetFocus(java.lang.String, java.lang.String):void");
    }

    public synchronized void onLostFocus(String str, String str2) {
        int i = setMin + 43;
        getMin = i % 128;
        int i2 = i % 2;
        boolean z = false;
        if ((this.manager != null ? 4 : 'Y') != 'Y') {
            this.manager.a(str, str2, false);
            return;
        }
        b.b("SEC_SDK-rds", "onLostFocus manager is null");
        int i3 = setMin + 65;
        getMin = i3 % 128;
        if (i3 % 2 != 0) {
            z = true;
        }
        if (!z) {
            Object obj = null;
            super.hashCode();
        }
    }

    public synchronized void onLostFocus(String str, String str2, boolean z) {
        if ((this.manager != null ? '0' : ')') != '0') {
            try {
                b.b("SEC_SDK-rds", "onLostFocus manager is null");
                int i = getMin + 23;
                setMin = i % 128;
                if (i % 2 != 0) {
                    int i2 = 5 / 0;
                    return;
                }
                return;
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i3 = setMin + 111;
            getMin = i3 % 128;
            if (i3 % 2 == 0) {
                this.manager.a(str, str2, z);
                int i4 = 17 / 0;
                return;
            }
            this.manager.a(str, str2, z);
            return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if ((r9 != null ? '?' : '6') != '?') goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        if (r4.manager != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        if (r2 != '8') goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005e, code lost:
        if ((r9.f instanceof com.alipay.alipaysecuritysdk.rds.v2.b.a.f ? '+' : 31) != '+') goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        r9.e.a("", false, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        com.alipay.alipaysecuritysdk.common.c.b.b("SEC_SDK-rds", "onTouchScreen manager is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r5 = setMin + 91;
        getMin = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b1, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onTouchScreen(java.lang.String r5, java.lang.String r6, double r7, double r9) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r9 = setMin     // Catch:{ all -> 0x00b5 }
            int r9 = r9 + 7
            int r10 = r9 % 128
            getMin = r10     // Catch:{ all -> 0x00b5 }
            int r9 = r9 % 2
            r10 = 0
            if (r9 != 0) goto L_0x0020
            com.alipay.alipaysecuritysdk.rds.v2.a.a r9 = r4.manager     // Catch:{ all -> 0x00b5 }
            int r0 = r10.length     // Catch:{ all -> 0x001e }
            r0 = 63
            if (r9 == 0) goto L_0x0018
            r9 = 63
            goto L_0x001a
        L_0x0018:
            r9 = 54
        L_0x001a:
            if (r9 == r0) goto L_0x0024
            goto L_0x009e
        L_0x001e:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x00b5 }
        L_0x0020:
            com.alipay.alipaysecuritysdk.rds.v2.a.a r9 = r4.manager     // Catch:{ all -> 0x00b5 }
            if (r9 == 0) goto L_0x009e
        L_0x0024:
            com.alipay.alipaysecuritysdk.rds.v2.a.a r9 = r4.manager     // Catch:{ all -> 0x00b5 }
            com.alipay.alipaysecuritysdk.rds.v2.b.j r9 = r9.f     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = com.alipay.alipaysecuritysdk.rds.v2.b.j.b(r5, r6)     // Catch:{ all -> 0x00b5 }
            java.util.concurrent.atomic.AtomicInteger r1 = r9.c     // Catch:{ all -> 0x00b5 }
            r1.incrementAndGet()     // Catch:{ all -> 0x00b5 }
            com.alipay.alipaysecuritysdk.rds.v2.b.b r1 = r9.f     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x0080
            int r1 = setMin     // Catch:{ all -> 0x00b5 }
            int r1 = r1 + 87
            int r2 = r1 % 128
            getMin = r2     // Catch:{ all -> 0x00b5 }
            int r1 = r1 % 2
            r2 = 43
            if (r1 != 0) goto L_0x0053
            com.alipay.alipaysecuritysdk.rds.v2.b.b r1 = r9.f     // Catch:{ all -> 0x00b5 }
            boolean r1 = r1 instanceof com.alipay.alipaysecuritysdk.rds.v2.b.a.f     // Catch:{ all -> 0x00b5 }
            int r3 = r10.length     // Catch:{ all -> 0x0051 }
            r3 = 56
            if (r1 == 0) goto L_0x004e
            r2 = 56
        L_0x004e:
            if (r2 == r3) goto L_0x0076
            goto L_0x0060
        L_0x0051:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x00b5 }
        L_0x0053:
            com.alipay.alipaysecuritysdk.rds.v2.b.b r1 = r9.f     // Catch:{ all -> 0x00b5 }
            boolean r1 = r1 instanceof com.alipay.alipaysecuritysdk.rds.v2.b.a.f     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x005c
            r1 = 43
            goto L_0x005e
        L_0x005c:
            r1 = 31
        L_0x005e:
            if (r1 == r2) goto L_0x0076
        L_0x0060:
            com.alipay.alipaysecuritysdk.rds.v2.b.a.f r1 = new com.alipay.alipaysecuritysdk.rds.v2.b.a.f     // Catch:{ all -> 0x00b5 }
            java.util.concurrent.atomic.AtomicInteger r2 = r9.d     // Catch:{ all -> 0x00b5 }
            int r2 = r2.incrementAndGet()     // Catch:{ all -> 0x00b5 }
            r1.<init>(r5, r6, r0, r2)     // Catch:{ all -> 0x00b5 }
            r1.b(r7)     // Catch:{ all -> 0x00b5 }
            com.alipay.alipaysecuritysdk.rds.v2.b.a.d r5 = r9.e     // Catch:{ all -> 0x00b5 }
            r5.a(r1)     // Catch:{ all -> 0x00b5 }
            r9.f = r1     // Catch:{ all -> 0x00b5 }
            goto L_0x0080
        L_0x0076:
            com.alipay.alipaysecuritysdk.rds.v2.b.a.d r5 = r9.e     // Catch:{ all -> 0x00b5 }
            java.lang.String r6 = ""
            r9 = 0
            r5.a(r6, r9, r7)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r4)
            return
        L_0x0080:
            int r5 = getMin     // Catch:{ all -> 0x00b5 }
            int r5 = r5 + 41
            int r6 = r5 % 128
            setMin = r6     // Catch:{ all -> 0x00b5 }
            int r5 = r5 % 2
            r6 = 97
            if (r5 == 0) goto L_0x0091
            r5 = 24
            goto L_0x0093
        L_0x0091:
            r5 = 97
        L_0x0093:
            if (r5 == r6) goto L_0x009c
            super.hashCode()     // Catch:{ all -> 0x009a }
            monitor-exit(r4)
            return
        L_0x009a:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x00b5 }
        L_0x009c:
            monitor-exit(r4)
            return
        L_0x009e:
            java.lang.String r5 = "SEC_SDK-rds"
            java.lang.String r6 = "onTouchScreen manager is null"
            com.alipay.alipaysecuritysdk.common.c.b.b(r5, r6)     // Catch:{ Exception -> 0x00b1 }
            int r5 = setMin     // Catch:{ all -> 0x00b5 }
            int r5 = r5 + 91
            int r6 = r5 % 128
            getMin = r6     // Catch:{ all -> 0x00b5 }
            int r5 = r5 % 2
            monitor-exit(r4)
            return
        L_0x00b1:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x00b5 }
        L_0x00b3:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.rds.v2.face.RDSClient.onTouchScreen(java.lang.String, java.lang.String, double, double):void");
    }

    public static synchronized void enableLog() {
        synchronized (RDSClient.class) {
            try {
                int i = getMin + 37;
                setMin = i % 128;
                if (i % 2 == 0) {
                    debug = true;
                } else {
                    debug = false;
                }
                int i2 = getMin + 37;
                setMin = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Context getContext() {
        int i = setMin + 27;
        getMin = i % 128;
        if (!(i % 2 == 0)) {
            try {
                return context;
            } catch (Exception e) {
                throw e;
            }
        } else {
            Context context2 = context;
            Object[] objArr = null;
            int length2 = objArr.length;
            return context2;
        }
    }

    public static void setContext(Context context2) {
        int i = setMin + 103;
        getMin = i % 128;
        int i2 = i % 2;
        context = context2;
        int i3 = getMin + 113;
        setMin = i3 % 128;
        if ((i3 % 2 != 0 ? Typography.greater : '6') != '6') {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    public static boolean isDebug() {
        try {
            int i = getMin + 87;
            try {
                setMin = i % 128;
                int i2 = i % 2;
                boolean z = debug;
                int i3 = setMin + 45;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                return z;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if ((r14 % 2) != 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (((r14 << 4) != 0 ? '3' : '@') != '@') goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(char[] r12, byte r13, int r14) {
        /*
            int r0 = getMin     // Catch:{ Exception -> 0x010f }
            int r0 = r0 + 3
            int r1 = r0 % 128
            setMin = r1     // Catch:{ Exception -> 0x010f }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0022
            char[] r0 = setMax     // Catch:{ Exception -> 0x0020 }
            char r1 = length     // Catch:{ Exception -> 0x0020 }
            char[] r2 = new char[r14]     // Catch:{ Exception -> 0x0020 }
            int r3 = r14 << 4
            r4 = 64
            if (r3 == 0) goto L_0x001b
            r3 = 51
            goto L_0x001d
        L_0x001b:
            r3 = 64
        L_0x001d:
            if (r3 == r4) goto L_0x003e
            goto L_0x002c
        L_0x0020:
            r12 = move-exception
            throw r12
        L_0x0022:
            char[] r0 = setMax
            char r1 = length
            char[] r2 = new char[r14]
            int r3 = r14 % 2
            if (r3 == 0) goto L_0x003e
        L_0x002c:
            int r14 = r14 + -1
            char r3 = r12[r14]
            int r3 = r3 - r13
            char r3 = (char) r3
            r2[r14] = r3
            int r3 = getMin
            int r3 = r3 + 19
            int r4 = r3 % 128
            setMin = r4
            int r3 = r3 % 2
        L_0x003e:
            r3 = 1
            if (r14 <= r3) goto L_0x0109
            int r4 = setMin
            int r4 = r4 + 121
            int r5 = r4 % 128
            getMin = r5
            int r4 = r4 % 2
            r4 = 0
            r5 = 0
        L_0x004d:
            if (r5 >= r14) goto L_0x0109
            int r6 = setMin
            int r6 = r6 + 93
            int r7 = r6 % 128
            getMin = r7
            int r6 = r6 % 2
            r7 = 20
            if (r6 != 0) goto L_0x0060
            r6 = 72
            goto L_0x0062
        L_0x0060:
            r6 = 20
        L_0x0062:
            if (r6 == r7) goto L_0x006d
            char r6 = r12[r5]
            int r7 = r5 << 0
            char r7 = r12[r7]
            if (r6 != r7) goto L_0x0081
            goto L_0x0075
        L_0x006d:
            char r6 = r12[r5]
            int r7 = r5 + 1
            char r7 = r12[r7]
            if (r6 != r7) goto L_0x0081
        L_0x0075:
            int r6 = r6 - r13
            char r6 = (char) r6
            r2[r5] = r6
            int r6 = r5 + 1
            int r7 = r7 - r13
            char r7 = (char) r7
            r2[r6] = r7
            goto L_0x00fb
        L_0x0081:
            int r8 = o.onActivityPreStopped.setMin(r6, r1)
            int r6 = o.onActivityPreStopped.length(r6, r1)
            int r9 = o.onActivityPreStopped.setMin(r7, r1)
            int r7 = o.onActivityPreStopped.length(r7, r1)
            if (r6 != r7) goto L_0x0095
            r10 = 1
            goto L_0x0096
        L_0x0095:
            r10 = 0
        L_0x0096:
            if (r10 == 0) goto L_0x00b3
            int r8 = o.onActivityPreStopped.setMax(r8, r1)
            int r9 = o.onActivityPreStopped.setMax(r9, r1)
            int r6 = o.onActivityPreStopped.getMax(r8, r6, r1)
            int r7 = o.onActivityPreStopped.getMax(r9, r7, r1)
            char r6 = r0[r6]
            r2[r5] = r6
            int r6 = r5 + 1
            char r7 = r0[r7]
            r2[r6] = r7
            goto L_0x00fb
        L_0x00b3:
            if (r8 != r9) goto L_0x00b7
            r10 = 1
            goto L_0x00b8
        L_0x00b7:
            r10 = 0
        L_0x00b8:
            if (r10 == 0) goto L_0x00df
            int r10 = getMin     // Catch:{ Exception -> 0x010f }
            int r10 = r10 + 23
            int r11 = r10 % 128
            setMin = r11
            int r10 = r10 % 2
            int r6 = o.onActivityPreStopped.setMax(r6, r1)
            int r7 = o.onActivityPreStopped.setMax(r7, r1)
            int r6 = o.onActivityPreStopped.getMax(r8, r6, r1)
            int r7 = o.onActivityPreStopped.getMax(r9, r7, r1)
            char r6 = r0[r6]
            r2[r5] = r6
            int r6 = r5 + 1
            char r7 = r0[r7]
            r2[r6] = r7
            goto L_0x00fb
        L_0x00df:
            int r7 = o.onActivityPreStopped.getMax(r8, r7, r1)
            int r6 = o.onActivityPreStopped.getMax(r9, r6, r1)
            char r7 = r0[r7]
            r2[r5] = r7
            int r7 = r5 + 1
            char r6 = r0[r6]
            r2[r7] = r6
            int r6 = getMin
            int r6 = r6 + 93
            int r7 = r6 % 128
            setMin = r7
            int r6 = r6 % 2
        L_0x00fb:
            int r5 = r5 + 2
            int r6 = setMin
            int r6 = r6 + 125
            int r7 = r6 % 128
            getMin = r7
            int r6 = r6 % 2
            goto L_0x004d
        L_0x0109:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r2)
            return r12
        L_0x010f:
            r12 = move-exception
            goto L_0x0112
        L_0x0111:
            throw r12
        L_0x0112:
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.rds.v2.face.RDSClient.length(char[], byte, int):java.lang.String");
    }
}
