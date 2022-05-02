package com.alibaba.griver.core.worker;

import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.api.H5Event;
import com.alibaba.griver.base.api.H5ServiceWorkerHook4Bridge;
import com.alibaba.griver.core.worker.H5Worker;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;

public class b {
    protected static String c = "H5WorkerControllerProvider";
    private static int getMax = 0;
    private static short[] getMin = null;
    private static Set<String> h = null;
    private static List<String> i = null;
    private static int isInside = 1;
    private static int length;
    private static byte[] setMax;
    private static int setMin;
    private static int toIntRange;

    /* renamed from: a  reason: collision with root package name */
    protected boolean f10400a = true;
    protected H5Worker b;
    protected App d;
    private final int e = 100;
    private boolean f = true;
    private WeakReference<Page> g;
    private boolean j;
    private Handler k;
    private boolean l;

    static void getMin() {
        length = 1797200206;
        getMax = 751198141;
        setMax = new byte[]{Ascii.VT, -25, -14, -1, 0};
        setMin = 56;
    }

    static /* synthetic */ void a(b bVar, JSONObject jSONObject) {
        int i2 = isInside + 83;
        toIntRange = i2 % 128;
        int i3 = i2 % 2;
        bVar.a(jSONObject);
        try {
            int i4 = toIntRange + 43;
            try {
                isInside = i4 % 128;
                if (i4 % 2 == 0) {
                    Object obj = null;
                    super.hashCode();
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    static {
        getMin();
        int i2 = toIntRange + 51;
        isInside = i2 % 128;
        int i3 = i2 % 2;
    }

    public b(H5Worker h5Worker, App app) {
        this.b = h5Worker;
        this.d = app;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if ((r2 != null ? ']' : 0) != 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r2 != null) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r8) {
        /*
            java.lang.String r0 = c
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r2 = "hasSyncApiPermission == "
            java.lang.String r1 = r2.concat(r1)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r1)
            java.util.Set<java.lang.String> r0 = h
            r1 = 0
            if (r0 != 0) goto L_0x00a8
            int r0 = toIntRange
            int r0 = r0 + 83
            int r2 = r0 % 128
            isInside = r2
            int r0 = r0 % 2
            java.lang.String r2 = "added"
            java.lang.String r3 = ""
            java.lang.String r4 = "h5_swSyncJsApiConfig"
            r5 = 0
            if (r0 != 0) goto L_0x0047
            java.util.Set r0 = com.alibaba.griver.base.nebula.WorkerApiConfig.getDefaultSyncJsApiSet()
            h = r0
            java.lang.String r0 = com.alibaba.griver.base.common.config.GriverConfig.getConfigWithProcessCache(r4, r3)
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.ariver.kernel.common.utils.JSONUtils.parseObject((java.lang.String) r0)
            com.alibaba.fastjson.JSONArray r2 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getJSONArray(r0, r2, r5)
            super.hashCode()     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0041
            r3 = 93
            goto L_0x0042
        L_0x0041:
            r3 = 0
        L_0x0042:
            if (r3 == 0) goto L_0x0078
            goto L_0x005b
        L_0x0045:
            r8 = move-exception
            throw r8
        L_0x0047:
            java.util.Set r0 = com.alibaba.griver.base.nebula.WorkerApiConfig.getDefaultSyncJsApiSet()     // Catch:{ Exception -> 0x00a6 }
            h = r0     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r0 = com.alibaba.griver.base.common.config.GriverConfig.getConfigWithProcessCache(r4, r3)     // Catch:{ Exception -> 0x00a6 }
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.ariver.kernel.common.utils.JSONUtils.parseObject((java.lang.String) r0)     // Catch:{ Exception -> 0x00a6 }
            com.alibaba.fastjson.JSONArray r2 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getJSONArray(r0, r2, r5)     // Catch:{ Exception -> 0x00a6 }
            if (r2 == 0) goto L_0x0078
        L_0x005b:
            int r3 = r2.size()
            int r4 = toIntRange
            int r4 = r4 + 63
            int r6 = r4 % 128
            isInside = r6
            int r4 = r4 % 2
            r4 = 0
        L_0x006a:
            if (r4 >= r3) goto L_0x0078
            java.lang.String r6 = r2.getString(r4)
            java.util.Set<java.lang.String> r7 = h
            r7.add(r6)
            int r4 = r4 + 1
            goto L_0x006a
        L_0x0078:
            java.lang.String r3 = "black_list"
            com.alibaba.fastjson.JSONArray r0 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getJSONArray(r0, r3, r5)     // Catch:{ Exception -> 0x00a6 }
            r3 = 24
            if (r2 == 0) goto L_0x0085
            r4 = 80
            goto L_0x0087
        L_0x0085:
            r4 = 24
        L_0x0087:
            if (r4 == r3) goto L_0x00a8
            int r2 = r2.size()
            r3 = 0
        L_0x008e:
            if (r3 >= r2) goto L_0x00a8
            int r4 = isInside
            int r4 = r4 + 83
            int r5 = r4 % 128
            toIntRange = r5
            int r4 = r4 % 2
            java.lang.String r4 = r0.getString(r3)
            java.util.Set<java.lang.String> r5 = h
            r5.remove(r4)
            int r3 = r3 + 1
            goto L_0x008e
        L_0x00a6:
            r8 = move-exception
            throw r8
        L_0x00a8:
            java.util.Set<java.lang.String> r0 = h
            if (r0 == 0) goto L_0x00ca
            int r0 = toIntRange
            int r0 = r0 + 99
            int r2 = r0 % 128
            isInside = r2
            int r0 = r0 % 2
            java.util.Set<java.lang.String> r0 = h
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 != 0) goto L_0x00c1
            r0 = 0
            goto L_0x00c2
        L_0x00c1:
            r0 = 1
        L_0x00c2:
            if (r0 == r2) goto L_0x00ca
            java.util.Set<java.lang.String> r0 = h
            boolean r1 = r0.contains(r8)
        L_0x00ca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.worker.b.a(java.lang.String):boolean");
    }

    private void e(String str) {
        if (this.f) {
            int i2 = isInside + 75;
            toIntRange = i2 % 128;
            if (i2 % 2 != 0) {
            }
            this.f = false;
            RVEvents.BRIDGE_READY.equals(str);
        }
        int i3 = toIntRange + 75;
        isInside = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 49 / 0;
        }
    }

    private static boolean a() {
        int i2 = isInside + 23;
        toIntRange = i2 % 128;
        int i3 = i2 % 2;
        int i4 = toIntRange + 93;
        isInside = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x033f, code lost:
        if (r1 != null) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0258, code lost:
        if (r1.contains("alipay.worker.com") != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0296, code lost:
        if ((!r2.startsWith(".") ? '5' : 'U') != 'U') goto L_0x0298;
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02da A[SYNTHETIC, Splitter:B:91:0x02da] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.webkit.WebResourceResponse b(java.lang.String r21) {
        /*
            r20 = this;
            r7 = r20
            java.lang.String r0 = "index.worker.js"
            r1 = r21
            r1.contains(r0)
            android.net.Uri r0 = android.net.Uri.parse(r21)     // Catch:{ all -> 0x039f }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x039f }
            java.lang.String r2 = c     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r1)     // Catch:{ all -> 0x039f }
            java.lang.String r2 = r0.getScheme()     // Catch:{ all -> 0x039f }
            java.lang.String r3 = r0.getHost()     // Catch:{ all -> 0x039f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x039f }
            r4.<init>()     // Catch:{ all -> 0x039f }
            r4.append(r2)     // Catch:{ all -> 0x039f }
            java.lang.String r2 = "://"
            r4.append(r2)     // Catch:{ all -> 0x039f }
            r4.append(r3)     // Catch:{ all -> 0x039f }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x039f }
            java.lang.String r3 = "https://alipay.kylinBridge"
            boolean r2 = r3.equalsIgnoreCase(r2)     // Catch:{ all -> 0x039f }
            r3 = 88
            r4 = 37
            r9 = 0
            if (r2 == 0) goto L_0x01fe
            boolean r1 = r7.f10400a     // Catch:{ all -> 0x039f }
            r2 = 17
            if (r1 == 0) goto L_0x0047
            r4 = 17
        L_0x0047:
            if (r4 == r2) goto L_0x004a
            goto L_0x0052
        L_0x004a:
            r7.f10400a = r9     // Catch:{ all -> 0x039f }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x039f }
            com.alibaba.griver.base.nebula.GriverWebViewFlag.swFirstJsApiCallTime = r1     // Catch:{ all -> 0x039f }
        L_0x0052:
            java.lang.String r1 = "data"
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch:{ all -> 0x039f }
            java.lang.String r1 = c     // Catch:{ all -> 0x039f }
            java.lang.String r2 = "JSONUtils data "
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x039f }
            java.lang.String r2 = r2.concat(r4)     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r2)     // Catch:{ all -> 0x039f }
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.ariver.kernel.common.utils.JSONUtils.parseObject((java.lang.String) r0)     // Catch:{ all -> 0x039f }
            r1 = 84
            if (r0 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r3 = 84
        L_0x0072:
            if (r3 == r1) goto L_0x01fc
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x039f }
            r2 = 57
            if (r1 == 0) goto L_0x007e
            r1 = 5
            goto L_0x0080
        L_0x007e:
            r1 = 57
        L_0x0080:
            if (r1 == r2) goto L_0x0084
            goto L_0x01fc
        L_0x0084:
            java.lang.String r1 = "action"
            java.lang.String r10 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getString(r0, r1)     // Catch:{ all -> 0x039f }
            java.lang.String r1 = "requestId"
            int r1 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getInt(r0, r1)     // Catch:{ all -> 0x039f }
            java.lang.String r2 = "applicationId"
            java.lang.String r11 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getString(r0, r2)     // Catch:{ all -> 0x039f }
            java.lang.String r2 = "callback"
            java.lang.String r2 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getString(r0, r2)     // Catch:{ all -> 0x039f }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x039f }
            r4 = 23
            if (r3 != 0) goto L_0x00a7
            r3 = 23
            goto L_0x00a8
        L_0x00a7:
            r3 = 1
        L_0x00a8:
            java.lang.String r12 = "utf-8"
            java.lang.String r13 = ""
            r14 = -751198141(0xffffffffd339a043, float:-7.972577E11)
            r15 = 0
            if (r3 == r4) goto L_0x0104
            java.lang.String r2 = c     // Catch:{ all -> 0x039f }
            java.lang.String r3 = "caution!!! shouldn't be here!!!!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r3)     // Catch:{ all -> 0x039f }
            com.alibaba.griver.core.worker.b$2 r4 = new com.alibaba.griver.core.worker.b$2     // Catch:{ all -> 0x039f }
            r4.<init>(r1, r11, r10)     // Catch:{ all -> 0x039f }
            r6 = 8000(0x1f40, float:1.121E-41)
            r1 = r20
            r2 = r10
            r3 = r0
            r5 = r11
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x039f }
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse     // Catch:{ all -> 0x039f }
            java.lang.String r1 = "application/json"
            r2 = -1797200125(0xffffffff94e0e703, float:-2.2709338E-26)
            r3 = 48
            int r3 = android.text.AndroidCharacter.getEastAsianWidth(r3)     // Catch:{ all -> 0x039f }
            int r3 = r3 + r2
            int r2 = android.view.View.resolveSize(r9, r9)     // Catch:{ all -> 0x039f }
            short r2 = (short) r2     // Catch:{ all -> 0x039f }
            float r4 = android.util.TypedValue.complexToFloat(r9)     // Catch:{ all -> 0x039f }
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            int r4 = -51 - r4
            int r5 = android.view.View.resolveSizeAndState(r9, r9, r9)     // Catch:{ all -> 0x039f }
            byte r5 = (byte) r5     // Catch:{ all -> 0x039f }
            int r6 = android.view.ViewConfiguration.getKeyRepeatDelay()     // Catch:{ all -> 0x039f }
            int r6 = r6 >> 16
            int r14 = r14 - r6
            java.lang.String r2 = setMax(r3, r2, r4, r5, r14)     // Catch:{ all -> 0x039f }
            java.lang.String r2 = r2.intern()     // Catch:{ all -> 0x039f }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x039f }
            byte[] r4 = r13.getBytes(r12)     // Catch:{ all -> 0x039f }
            r3.<init>(r4)     // Catch:{ all -> 0x039f }
            r0.<init>(r1, r2, r3)     // Catch:{ all -> 0x039f }
            return r0
        L_0x0104:
            boolean r1 = a((java.lang.String) r10)     // Catch:{ all -> 0x039f }
            java.lang.String r3 = c     // Catch:{ all -> 0x039f }
            java.lang.String r4 = "sync hasPermission "
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x039f }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r4)     // Catch:{ all -> 0x039f }
            r16 = 0
            if (r1 == 0) goto L_0x01b5
            com.alibaba.griver.core.worker.H5Worker r1 = r7.b     // Catch:{ all -> 0x039f }
            boolean r1 = r1.e()     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x0126
            r1 = 97
            goto L_0x0128
        L_0x0126:
            r1 = 79
        L_0x0128:
            r3 = 79
            if (r1 == r3) goto L_0x0131
            r1 = 2000(0x7d0, float:2.803E-42)
            r6 = 2000(0x7d0, float:2.803E-42)
            goto L_0x0135
        L_0x0131:
            r1 = 8000(0x1f40, float:1.121E-41)
            r6 = 8000(0x1f40, float:1.121E-41)
        L_0x0135:
            android.os.ConditionVariable r5 = new android.os.ConditionVariable     // Catch:{ all -> 0x039f }
            r5.<init>()     // Catch:{ all -> 0x039f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x039f }
            r4.<init>()     // Catch:{ all -> 0x039f }
            r4.append(r2)     // Catch:{ all -> 0x039f }
            java.lang.String r1 = "("
            r4.append(r1)     // Catch:{ all -> 0x039f }
            com.alibaba.griver.core.worker.b$1 r18 = new com.alibaba.griver.core.worker.b$1     // Catch:{ all -> 0x039f }
            r1 = r18
            r2 = r20
            r3 = r10
            r21 = r4
            r4 = r6
            r19 = r5
            r5 = r21
            r8 = r6
            r6 = r19
            r1.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x039f }
            int r6 = r8 / 100
            r1 = r20
            r2 = r10
            r3 = r0
            r4 = r18
            r5 = r11
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x039f }
            r19.close()     // Catch:{ all -> 0x039f }
            long r0 = (long) r8     // Catch:{ all -> 0x039f }
            r2 = r19
            r2.block(r0)     // Catch:{ all -> 0x039f }
            java.lang.String r0 = ")"
            r1 = r21
            r1.append(r0)     // Catch:{ all -> 0x039f }
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse     // Catch:{ all -> 0x039f }
            java.lang.String r2 = "application/javascript"
            r3 = -1797200121(0xffffffff94e0e707, float:-2.2709344E-26)
            int r4 = android.widget.ExpandableListView.getPackedPositionGroup(r16)     // Catch:{ all -> 0x039f }
            int r4 = r4 + r3
            int r3 = android.text.TextUtils.indexOf(r13, r13, r9, r9)     // Catch:{ all -> 0x039f }
            short r3 = (short) r3     // Catch:{ all -> 0x039f }
            int r5 = android.view.ViewConfiguration.getScrollBarFadeDuration()     // Catch:{ all -> 0x039f }
            int r5 = r5 >> 16
            int r5 = -51 - r5
            float r6 = android.util.TypedValue.complexToFraction(r9, r15, r15)     // Catch:{ all -> 0x039f }
            int r6 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            byte r6 = (byte) r6     // Catch:{ all -> 0x039f }
            int r8 = android.graphics.Color.argb(r9, r9, r9, r9)     // Catch:{ all -> 0x039f }
            int r14 = r14 - r8
            java.lang.String r3 = setMax(r4, r3, r5, r6, r14)     // Catch:{ all -> 0x039f }
            java.lang.String r3 = r3.intern()     // Catch:{ all -> 0x039f }
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x039f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x039f }
            byte[] r1 = r1.getBytes(r12)     // Catch:{ all -> 0x039f }
            r4.<init>(r1)     // Catch:{ all -> 0x039f }
            r0.<init>(r2, r3, r4)     // Catch:{ all -> 0x039f }
            return r0
        L_0x01b5:
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse     // Catch:{ all -> 0x039f }
            java.lang.String r1 = "application/javascript"
            r3 = -1797200121(0xffffffff94e0e707, float:-2.2709344E-26)
            int r4 = android.widget.ExpandableListView.getPackedPositionType(r16)     // Catch:{ all -> 0x039f }
            int r3 = r3 - r4
            int r4 = android.view.View.combineMeasuredStates(r9, r9)     // Catch:{ all -> 0x039f }
            short r4 = (short) r4     // Catch:{ all -> 0x039f }
            int r5 = android.widget.ExpandableListView.getPackedPositionChild(r16)     // Catch:{ all -> 0x039f }
            int r5 = -52 - r5
            int r6 = android.view.View.combineMeasuredStates(r9, r9)     // Catch:{ all -> 0x039f }
            byte r6 = (byte) r6     // Catch:{ all -> 0x039f }
            int r8 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x039f }
            int r8 = r8 + r14
            java.lang.String r3 = setMax(r3, r4, r5, r6, r8)     // Catch:{ all -> 0x039f }
            java.lang.String r3 = r3.intern()     // Catch:{ all -> 0x039f }
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x039f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x039f }
            r5.<init>()     // Catch:{ all -> 0x039f }
            r5.append(r2)     // Catch:{ all -> 0x039f }
            java.lang.String r2 = "('not in H5_SWSYNCAPILIST')"
            r5.append(r2)     // Catch:{ all -> 0x039f }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x039f }
            byte[] r2 = r2.getBytes(r12)     // Catch:{ all -> 0x039f }
            r4.<init>(r2)     // Catch:{ all -> 0x039f }
            r0.<init>(r1, r3, r4)     // Catch:{ all -> 0x039f }
            return r0
        L_0x01fc:
            r1 = 0
            return r1
        L_0x01fe:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x039f }
            if (r2 != 0) goto L_0x03a7
            java.lang.String r2 = "blob"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x039f }
            r5 = 76
            if (r2 != 0) goto L_0x0211
            r2 = 76
            goto L_0x0213
        L_0x0211:
            r2 = 43
        L_0x0213:
            if (r2 == r5) goto L_0x0217
            goto L_0x03a7
        L_0x0217:
            int r2 = toIntRange
            int r2 = r2 + 75
            int r5 = r2 % 128
            isInside = r5
            int r2 = r2 % 2
            java.lang.String r5 = "work load url begin:"
            r6 = 51
            java.lang.String r8 = "alipay.worker.com"
            if (r2 != 0) goto L_0x0247
            java.lang.String r2 = c     // Catch:{ all -> 0x039f }
            java.lang.String r10 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x039f }
            java.lang.String r5 = r5.concat(r10)     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r5)     // Catch:{ all -> 0x039f }
            boolean r2 = r1.contains(r8)     // Catch:{ all -> 0x039f }
            r5 = 93
            int r5 = r5 / r9
            if (r2 == 0) goto L_0x0242
            r2 = 56
            goto L_0x0244
        L_0x0242:
            r2 = 51
        L_0x0244:
            if (r2 == r6) goto L_0x02cb
            goto L_0x025a
        L_0x0247:
            java.lang.String r2 = c     // Catch:{ all -> 0x039f }
            java.lang.String r10 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x039f }
            java.lang.String r5 = r5.concat(r10)     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r5)     // Catch:{ all -> 0x039f }
            boolean r2 = r1.contains(r8)     // Catch:{ all -> 0x039f }
            if (r2 == 0) goto L_0x02cb
        L_0x025a:
            int r2 = toIntRange
            int r2 = r2 + r4
            int r4 = r2 % 128
            isInside = r4
            int r2 = r2 % 2
            com.alibaba.griver.api.resource.appinfo.GriverAppVirtualHostProxy r2 = com.alibaba.griver.base.common.utils.AppInfoUtils.getVhostProxy()     // Catch:{ all -> 0x039f }
            java.lang.String r2 = r2.getHost()     // Catch:{ all -> 0x039f }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x039f }
            if (r4 != 0) goto L_0x02a1
            int r4 = isInside     // Catch:{ Exception -> 0x039a }
            int r4 = r4 + 15
            int r5 = r4 % 128
            toIntRange = r5     // Catch:{ Exception -> 0x039a }
            int r4 = r4 % 2
            java.lang.String r5 = "."
            if (r4 == 0) goto L_0x0289
            boolean r4 = r2.startsWith(r5)     // Catch:{ all -> 0x039f }
            r10 = 20
            int r10 = r10 / r9
            if (r4 != 0) goto L_0x02a3
            goto L_0x0298
        L_0x0289:
            boolean r4 = r2.startsWith(r5)     // Catch:{ all -> 0x039f }
            if (r4 != 0) goto L_0x0292
            r4 = 53
            goto L_0x0294
        L_0x0292:
            r4 = 85
        L_0x0294:
            r9 = 85
            if (r4 == r9) goto L_0x02a3
        L_0x0298:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x039f }
            java.lang.String r2 = r5.concat(r2)     // Catch:{ all -> 0x039f }
            goto L_0x02a3
        L_0x02a1:
            java.lang.String r2 = ".saas.mini-program.com"
        L_0x02a3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x039f }
            r4.<init>()     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.app.api.App r5 = r7.d     // Catch:{ all -> 0x039f }
            java.lang.String r5 = r5.getAppId()     // Catch:{ all -> 0x039f }
            r4.append(r5)     // Catch:{ all -> 0x039f }
            r4.append(r2)     // Catch:{ all -> 0x039f }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x039f }
            java.lang.String r1 = r1.replace(r8, r2)     // Catch:{ all -> 0x039f }
            java.lang.String r2 = c     // Catch:{ all -> 0x039f }
            java.lang.String r4 = "work load final url begin:"
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x039f }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r4)     // Catch:{ all -> 0x039f }
        L_0x02cb:
            com.alibaba.ariver.app.api.App r2 = r7.d     // Catch:{ all -> 0x039f }
            r4 = 21
            if (r2 == 0) goto L_0x02d4
            r2 = 21
            goto L_0x02d6
        L_0x02d4:
            r2 = 44
        L_0x02d6:
            if (r2 == r4) goto L_0x02da
            goto L_0x038a
        L_0x02da:
            int r2 = isInside     // Catch:{ Exception -> 0x039c }
            int r2 = r2 + 31
            int r5 = r2 % 128
            toIntRange = r5     // Catch:{ Exception -> 0x039a }
            int r2 = r2 % 2
            r5 = 11
            if (r2 == 0) goto L_0x02ea
            r3 = 11
        L_0x02ea:
            if (r3 == r5) goto L_0x0315
            java.lang.Class<com.alibaba.ariver.engine.api.resources.ResourceLoadPoint> r2 = com.alibaba.ariver.engine.api.resources.ResourceLoadPoint.class
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r2 = com.alibaba.ariver.kernel.api.extension.ExtensionPoint.as(r2)     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.app.api.App r3 = r7.d     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.app.api.Page r3 = r3.getActivePage()     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r2 = r2.node(r3)     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.kernel.api.extension.Extension r2 = r2.create()     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.engine.api.resources.ResourceLoadPoint r2 = (com.alibaba.ariver.engine.api.resources.ResourceLoadPoint) r2     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext$Builder r3 = com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext.newBuilder()     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext$Builder r1 = r3.originUrl(r1)     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext r1 = r1.build()     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.engine.api.resources.Resource r1 = r2.load(r1)     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x038a
            goto L_0x0341
        L_0x0315:
            java.lang.Class<com.alibaba.ariver.engine.api.resources.ResourceLoadPoint> r2 = com.alibaba.ariver.engine.api.resources.ResourceLoadPoint.class
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r2 = com.alibaba.ariver.kernel.api.extension.ExtensionPoint.as(r2)     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.app.api.App r3 = r7.d     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.app.api.Page r3 = r3.getActivePage()     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r2 = r2.node(r3)     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.kernel.api.extension.Extension r2 = r2.create()     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.engine.api.resources.ResourceLoadPoint r2 = (com.alibaba.ariver.engine.api.resources.ResourceLoadPoint) r2     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext$Builder r3 = com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext.newBuilder()     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext$Builder r1 = r3.originUrl(r1)     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext r1 = r1.build()     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.engine.api.resources.Resource r1 = r2.load(r1)     // Catch:{ all -> 0x039f }
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x038a
        L_0x0341:
            java.lang.String r0 = c     // Catch:{ all -> 0x039f }
            java.lang.String r2 = "shouldInterceptRequest got resource: "
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x039f }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r2)     // Catch:{ all -> 0x039f }
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse     // Catch:{ all -> 0x039f }
            java.lang.String r2 = r1.getMimeType()     // Catch:{ all -> 0x039f }
            java.lang.String r3 = r1.getEncoding()     // Catch:{ all -> 0x039f }
            java.io.InputStream r1 = r1.getStream()     // Catch:{ all -> 0x039f }
            r0.<init>(r2, r3, r1)     // Catch:{ all -> 0x039f }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x039f }
            if (r1 < r4) goto L_0x0389
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x039f }
            r1.<init>()     // Catch:{ all -> 0x039f }
            java.lang.String r2 = "Access-Control-Allow-Origin"
            com.alibaba.ariver.app.api.App r3 = r7.d     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.app.api.Page r3 = r3.getActivePage()     // Catch:{ all -> 0x039f }
            java.lang.String r3 = r3.getPageURI()     // Catch:{ all -> 0x039f }
            java.lang.String r3 = com.alibaba.ariver.kernel.common.utils.UrlUtils.getCORSUrl(r3)     // Catch:{ all -> 0x039f }
            r1.put(r2, r3)     // Catch:{ all -> 0x039f }
            r0.setResponseHeaders(r1)     // Catch:{ all -> 0x039f }
            int r1 = isInside
            int r1 = r1 + r6
            int r2 = r1 % 128
            toIntRange = r2
            int r1 = r1 % 2
        L_0x0389:
            return r0
        L_0x038a:
            java.lang.String r1 = c     // Catch:{ all -> 0x039f }
            java.lang.String r2 = "work load url form online:"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x039f }
            java.lang.String r0 = r2.concat(r0)     // Catch:{ all -> 0x039f }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r0)     // Catch:{ all -> 0x039f }
            goto L_0x03a7
        L_0x039a:
            r0 = move-exception
            throw r0
        L_0x039c:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x039f:
            r0 = move-exception
            java.lang.String r1 = c
            java.lang.String r2 = "catch exception "
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r1, r2, r0)
        L_0x03a7:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.worker.b.b(java.lang.String):android.webkit.WebResourceResponse");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.alibaba.ariver.app.api.Page] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0016, code lost:
        if (r6 != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0026, code lost:
        if ((r4.j ? (char) 16 : 19) != 19) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0038, code lost:
        if (r4.g != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x003f, code lost:
        if (r4.g != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0054, code lost:
        r6 = isInside + 7;
        toIntRange = r6 % 128;
        r6 = r6 % 2;
        r6 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.ariver.app.api.Page a(int r5, java.lang.String r6) {
        /*
            r4 = this;
            int r6 = isInside     // Catch:{ Exception -> 0x009d }
            int r6 = r6 + 25
            int r0 = r6 % 128
            toIntRange = r0     // Catch:{ Exception -> 0x009b }
            int r6 = r6 % 2
            r0 = 0
            if (r6 == 0) goto L_0x000f
            r6 = 1
            goto L_0x0010
        L_0x000f:
            r6 = 0
        L_0x0010:
            r1 = 0
            if (r6 == 0) goto L_0x001b
            boolean r6 = r4.j
            int r2 = r1.length     // Catch:{ all -> 0x0019 }
            if (r6 == 0) goto L_0x0054
            goto L_0x0028
        L_0x0019:
            r5 = move-exception
            throw r5
        L_0x001b:
            boolean r6 = r4.j
            r2 = 19
            if (r6 == 0) goto L_0x0024
            r6 = 16
            goto L_0x0026
        L_0x0024:
            r6 = 19
        L_0x0026:
            if (r6 == r2) goto L_0x0054
        L_0x0028:
            int r6 = toIntRange     // Catch:{ Exception -> 0x009d }
            int r6 = r6 + 11
            int r2 = r6 % 128
            isInside = r2     // Catch:{ Exception -> 0x009d }
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x003d
            java.lang.ref.WeakReference<com.alibaba.ariver.app.api.Page> r6 = r4.g     // Catch:{ Exception -> 0x009b }
            r2 = 7
            int r2 = r2 / r0
            if (r6 == 0) goto L_0x0054
            goto L_0x0041
        L_0x003b:
            r5 = move-exception
            throw r5
        L_0x003d:
            java.lang.ref.WeakReference<com.alibaba.ariver.app.api.Page> r6 = r4.g
            if (r6 == 0) goto L_0x0054
        L_0x0041:
            java.lang.ref.WeakReference<com.alibaba.ariver.app.api.Page> r6 = r4.g
            java.lang.Object r6 = r6.get()
            com.alibaba.ariver.app.api.Page r6 = (com.alibaba.ariver.app.api.Page) r6
            int r2 = isInside
            int r2 = r2 + 33
            int r3 = r2 % 128
            toIntRange = r3
            int r2 = r2 % 2
            goto L_0x005f
        L_0x0054:
            int r6 = isInside
            int r6 = r6 + 7
            int r2 = r6 % 128
            toIntRange = r2
            int r6 = r6 % 2
            r6 = r1
        L_0x005f:
            if (r6 == 0) goto L_0x009a
            int r2 = isInside
            int r2 = r2 + 83
            int r3 = r2 % 128
            toIntRange = r3
            int r2 = r2 % 2
            r3 = 89
            if (r2 == 0) goto L_0x0072
            r2 = 89
            goto L_0x0074
        L_0x0072:
            r2 = 96
        L_0x0074:
            if (r2 == r3) goto L_0x008a
            com.alibaba.ariver.engine.api.Render r0 = r6.getRender()
            int r0 = r0.getPageId()
            r2 = 55
            if (r0 != r5) goto L_0x0085
            r5 = 55
            goto L_0x0087
        L_0x0085:
            r5 = 20
        L_0x0087:
            if (r5 == r2) goto L_0x0097
            goto L_0x009a
        L_0x008a:
            com.alibaba.ariver.engine.api.Render r2 = r6.getRender()
            int r2 = r2.getPageId()
            r3 = 64
            int r3 = r3 / r0
            if (r2 != r5) goto L_0x009a
        L_0x0097:
            return r6
        L_0x0098:
            r5 = move-exception
            throw r5
        L_0x009a:
            return r1
        L_0x009b:
            r5 = move-exception
            throw r5
        L_0x009d:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.worker.b.a(int, java.lang.String):com.alibaba.ariver.app.api.Page");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.alibaba.fastjson.JSONObject] */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (r0 >= 0) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0143, code lost:
        if ((r0 >= 0 ? 24 : 'N') != 24) goto L_0x0169;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(java.lang.String r13) {
        /*
            r12 = this;
            int r0 = toIntRange
            int r0 = r0 + 105
            int r1 = r0 % 128
            isInside = r1
            int r0 = r0 % 2
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r1 = 56
            if (r0 == 0) goto L_0x0015
            r0 = 54
            goto L_0x0017
        L_0x0015:
            r0 = 56
        L_0x0017:
            r2 = 0
            if (r0 == r1) goto L_0x001b
            return r2
        L_0x001b:
            r12.e(r13)
            java.lang.String r0 = "AlipayJSBridgeReady"
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x016c }
            r1 = 1
            if (r0 == 0) goto L_0x0037
            int r13 = isInside
            int r13 = r13 + 111
            int r0 = r13 % 128
            toIntRange = r0
            int r13 = r13 % 2
            com.alibaba.griver.core.worker.H5Worker r13 = r12.b
            r13.b()
            return r1
        L_0x0037:
            java.lang.String r0 = c
            java.lang.String r3 = java.lang.String.valueOf(r13)
            java.lang.String r4 = "handleMsgFromWorker msg = "
            java.lang.String r3 = r4.concat(r3)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.alibaba.griver.core.worker.H5Worker r3 = r12.b
            com.alibaba.griver.core.worker.c r3 = (com.alibaba.griver.core.worker.c) r3
            java.lang.String r3 = r3.p()
            r0.append(r3)
            java.lang.String r3 = "h5container.message: "
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r4 = r13.startsWith(r0)
            r5 = 0
            if (r4 == 0) goto L_0x0067
            goto L_0x0081
        L_0x0067:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r6 = "jserror:"
            java.lang.String r4 = r6.concat(r4)
            boolean r4 = r13.startsWith(r4)
            if (r4 == 0) goto L_0x0080
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r6.concat(r0)
            goto L_0x0081
        L_0x0080:
            r0 = r5
        L_0x0081:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x0088
            return r2
        L_0x0088:
            java.lang.String r4 = ""
            java.lang.String r0 = r13.replaceFirst(r0, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x0096
            r4 = 1
            goto L_0x0097
        L_0x0096:
            r4 = 0
        L_0x0097:
            if (r4 == r1) goto L_0x0119
            com.alibaba.fastjson.JSONObject r8 = com.alibaba.ariver.kernel.common.utils.JSONUtils.parseObject((java.lang.String) r0)
            if (r8 == 0) goto L_0x0118
            int r13 = isInside
            int r13 = r13 + 97
            int r0 = r13 % 128
            toIntRange = r0
            int r13 = r13 % 2
            boolean r13 = r8.isEmpty()
            if (r13 == 0) goto L_0x00b0
            goto L_0x0118
        L_0x00b0:
            java.lang.String r13 = "data"
            com.alibaba.fastjson.JSONObject r13 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getJSONObject(r8, r13, r5)
            if (r13 != 0) goto L_0x00ca
            int r13 = isInside
            int r13 = r13 + 3
            int r0 = r13 % 128
            toIntRange = r0
            int r13 = r13 % 2
            java.lang.String r0 = "invalid param, handleMsgFromWorker data = null"
            java.lang.String r13 = c
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r13, (java.lang.String) r0)
            return r2
        L_0x00ca:
            java.lang.String r13 = "handlerName"
            java.lang.String r0 = r8.getString(r13)
            java.lang.String r3 = "postMessage"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r12.a((com.alibaba.fastjson.JSONObject) r8)
            goto L_0x0117
        L_0x00dc:
            java.lang.String r0 = "callbackId"
            java.lang.String r0 = r8.getString(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0102
            int r13 = toIntRange
            int r13 = r13 + 43
            int r0 = r13 % 128
            isInside = r0
            int r13 = r13 % 2
            java.lang.String r0 = "invalid callbackId"
            if (r13 != 0) goto L_0x00fc
            java.lang.String r13 = c     // Catch:{ Exception -> 0x016c }
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r13, (java.lang.String) r0)     // Catch:{ Exception -> 0x016c }
            return r1
        L_0x00fc:
            java.lang.String r13 = c
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r13, (java.lang.String) r0)
            return r2
        L_0x0102:
            java.lang.String r7 = r8.getString(r13)
            com.alibaba.griver.core.worker.b$3 r9 = new com.alibaba.griver.core.worker.b$3
            r9.<init>(r0)
            com.alibaba.griver.core.worker.H5Worker r13 = r12.b
            java.lang.String r10 = r13.c()
            r11 = 80
            r6 = r12
            r6.a(r7, r8, r9, r10, r11)
        L_0x0117:
            return r1
        L_0x0118:
            return r2
        L_0x0119:
            int r0 = isInside
            int r0 = r0 + 29
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            r1 = 49
            if (r0 == 0) goto L_0x012a
            r0 = 49
            goto L_0x012c
        L_0x012a:
            r0 = 62
        L_0x012c:
            if (r0 == r1) goto L_0x0135
            int r0 = r13.indexOf(r3)
            if (r0 < 0) goto L_0x0169
            goto L_0x0146
        L_0x0135:
            int r0 = r13.indexOf(r3)
            int r1 = r5.length     // Catch:{ all -> 0x016a }
            r1 = 24
            if (r0 < 0) goto L_0x0141
            r3 = 24
            goto L_0x0143
        L_0x0141:
            r3 = 78
        L_0x0143:
            if (r3 == r1) goto L_0x0146
            goto L_0x0169
        L_0x0146:
            int r1 = r13.length()
            if (r1 <= r0) goto L_0x0169
            int r1 = toIntRange
            int r1 = r1 + 79
            int r3 = r1 % 128
            isInside = r3
            int r1 = r1 % 2
            java.lang.String r13 = r13.substring(r2, r0)
            java.lang.String r0 = c
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r1 = "handleMsgFromJS token invalid! prefixStr = "
            java.lang.String r13 = r1.concat(r13)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r13)
        L_0x0169:
            return r2
        L_0x016a:
            r13 = move-exception
            throw r13
        L_0x016c:
            r13 = move-exception
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.worker.b.c(java.lang.String):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.alibaba.fastjson.JSONObject] */
    private void a(final JSONObject jSONObject) {
        int i2;
        try {
            if (!this.b.e()) {
                this.b.a((H5Worker.RenderReadyListener) new H5Worker.RenderReadyListener() {
                    public void onRenderReady() {
                        b.a(b.this, jSONObject);
                    }
                });
                return;
            }
            ? r0 = 0;
            JSONObject jSONObject2 = JSONUtils.getJSONObject(jSONObject, "data", r0);
            if (!(!jSONObject2.containsKey("viewId"))) {
                int i3 = isInside + 119;
                toIntRange = i3 % 128;
                if ((i3 % 2 != 0 ? '6' : '(') != '6') {
                    i2 = JSONUtils.getInt(jSONObject2, "viewId");
                } else {
                    int i4 = JSONUtils.getInt(jSONObject2, "viewId");
                    int length2 = r0.length;
                    i2 = i4;
                }
            } else {
                i2 = -1;
            }
            if (a(i2, this.b.c()) == null) {
                int i5 = toIntRange + 17;
                isInside = i5 % 128;
                if (i5 % 2 == 0) {
                    RVLogger.e(c, "error! can't find target H5Page");
                    int i6 = 15 / 0;
                    return;
                }
                RVLogger.e(c, "error! can't find target H5Page");
                return;
            }
            new H5Event.Builder().action("message").param(jSONObject).type("call").build();
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r0 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        if (i != null) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Handler d(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = toIntRange
            int r0 = r0 + 71
            int r1 = r0 % 128
            isInside = r1
            int r0 = r0 % 2
            java.util.List<java.lang.String> r0 = i
            if (r0 != 0) goto L_0x0024
            int r0 = isInside
            int r0 = r0 + 9
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            java.util.List r0 = com.alibaba.griver.base.nebula.WorkerApiConfig.getDefaultAsyncJsApiList()
            i = r0
            boolean r0 = a()
            r4.l = r0
        L_0x0024:
            boolean r0 = r4.l
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 == r2) goto L_0x0030
            goto L_0x0063
        L_0x0030:
            int r0 = toIntRange     // Catch:{ Exception -> 0x0087 }
            int r0 = r0 + 69
            int r3 = r0 % 128
            isInside = r3     // Catch:{ Exception -> 0x0087 }
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x004c
            java.util.List<java.lang.String> r0 = i     // Catch:{ Exception -> 0x004a }
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0063
            goto L_0x0050
        L_0x0048:
            r5 = move-exception
            throw r5
        L_0x004a:
            r5 = move-exception
            goto L_0x0062
        L_0x004c:
            java.util.List<java.lang.String> r0 = i
            if (r0 == 0) goto L_0x0063
        L_0x0050:
            java.util.List<java.lang.String> r0 = i     // Catch:{ Exception -> 0x0087 }
            boolean r5 = r0.contains(r5)     // Catch:{ Exception -> 0x004a }
            if (r5 == 0) goto L_0x005a
            r5 = 0
            goto L_0x005b
        L_0x005a:
            r5 = 1
        L_0x005b:
            if (r5 == r2) goto L_0x0063
            android.os.Handler r5 = com.alibaba.griver.base.nebula.H5EventDispatchHandler.getAsyncHandler()
            return r5
        L_0x0062:
            throw r5
        L_0x0063:
            android.os.Handler r5 = r4.k
            if (r5 != 0) goto L_0x0072
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0)
            r4.k = r5
        L_0x0072:
            android.os.Handler r5 = r4.k
            int r0 = toIntRange
            int r0 = r0 + 3
            int r2 = r0 % 128
            isInside = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0086
            r0 = 11
            int r0 = r0 / r1
            return r5
        L_0x0084:
            r5 = move-exception
            throw r5
        L_0x0086:
            return r5
        L_0x0087:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.worker.b.d(java.lang.String):android.os.Handler");
    }

    /* access modifiers changed from: protected */
    public void a(String str, JSONObject jSONObject, H5ServiceWorkerHook4Bridge h5ServiceWorkerHook4Bridge, String str2, int i2) {
        Handler d2 = d(str);
        final JSONObject jSONObject2 = jSONObject;
        final String str3 = str2;
        final int i3 = i2;
        final Handler handler = d2;
        final String str4 = str;
        final H5ServiceWorkerHook4Bridge h5ServiceWorkerHook4Bridge2 = h5ServiceWorkerHook4Bridge;
        d2.post(new Runnable() {
            public void run() {
                Page page;
                try {
                    if (!jSONObject2.containsKey("viewId")) {
                        page = b.this.a(-1, str3);
                    } else {
                        page = b.this.a(JSONUtils.getInt(jSONObject2, "viewId", -1), str3);
                    }
                    if (page != null) {
                        JSONObject jSONObject = JSONUtils.getJSONObject(jSONObject2, "data", (JSONObject) null);
                        String string = JSONUtils.getString(jSONObject2, "clientId", (String) null);
                        if (TextUtils.isEmpty(string)) {
                            string = Long.toString(System.nanoTime());
                        }
                        RVLogger.d(b.c, "clientId is ".concat(String.valueOf(string)));
                        H5Event.Builder builder = new H5Event.Builder();
                        if (ProcessUtils.isMainProcess()) {
                            builder.action(str4).param(jSONObject).target(page).type("call").id(string).keepCallback(false).eventSource(H5Event.FROM_WORK);
                        } else {
                            builder.action(str4).param(jSONObject).target(page).type("call").id(string).keepCallback(false).dispatcherOnWorkerThread(true).eventSource(H5Event.FROM_WORK);
                        }
                        builder.build();
                    } else if (i3 <= 0) {
                        RVLogger.e(b.c, "handleMsgFromJs h5Page == null return");
                    } else {
                        RVLogger.w(b.c, "handleMsgFromJs h5Page == null, try again in 100ms");
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                b.this.a(str4, jSONObject2, h5ServiceWorkerHook4Bridge2, str3, i3 - 1);
                            }
                        }, 100);
                    }
                } catch (Throwable th) {
                    RVLogger.e(b.c, th);
                }
            }
        });
        int i4 = isInside + 89;
        toIntRange = i4 % 128;
        int i5 = i4 % 2;
    }

    private static String setMax(int i2, short s, int i3, byte b2, int i4) {
        short s2;
        int i5;
        StringBuilder sb = new StringBuilder();
        try {
            int i6 = i3 + setMin;
            int i7 = 0;
            boolean z = i6 == -1;
            if (z) {
                int i8 = isInside + 47;
                toIntRange = i8 % 128;
                int i9 = i8 % 2;
                if ((setMax != null ? 'L' : 15) != 15) {
                    i6 = (byte) (setMax[getMax + i4] + setMin);
                    int i10 = toIntRange + 3;
                    isInside = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    try {
                        i6 = (short) (getMin[getMax + i4] + setMin);
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            }
            if (i6 > 0) {
                int i12 = ((i4 + i6) - 2) + getMax;
                if ((z ? 'A' : 'a') != 'a') {
                    i7 = 1;
                }
                int i13 = i12 + i7;
                char c2 = (char) (i2 + length);
                sb.append(c2);
                for (int i14 = 1; i14 < i6; i14++) {
                    if (setMax != null) {
                        int i15 = toIntRange + 79;
                        isInside = i15 % 128;
                        int i16 = i15 % 2;
                        i5 = i13 - 1;
                        s2 = (byte) (setMax[i13] + s);
                    } else {
                        i5 = i13 - 1;
                        s2 = (short) (getMin[i13] + s);
                    }
                    c2 = (char) (c2 + (s2 ^ b2));
                    i13 = i5;
                    sb.append(c2);
                }
            }
            return sb.toString();
        } catch (Exception e3) {
            throw e3;
        }
    }
}
