package com.iap.ac.android.gradient.c;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.iap.ac.android.common.config.ACConfig;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.gradient.pluginloader.listener.OnPluginLoadedListener;
import com.iap.ac.android.gradient.pluginloader.loader.LoadFlow;
import com.iap.ac.android.gradient.pluginloader.loader.PluginLoader;
import com.iap.ac.android.gradient.proguard.model.GradientConfig;
import com.iap.ac.android.gradient.proguard.model.ModuleConfig;
import com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

public class a implements PluginLoader, LoadFlow {
    public static final byte[] getMax = {Ascii.DLE, 63, 74, -97, 13, -6, -64, 73, Ascii.ETB, -17, 6, Ascii.SI, 8, -7, 10, 3, -74, Ascii.RS, -22, 32, 13, -10, 6, 9, -30, 39, -10, 7, 5, 17, -37, 40, 7, 0};
    public static final int length = 21;
    private static int setMax = 0;
    private static int setMin = 1;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f11052a = Executors.newCachedThreadPool();
    public final Map<String, com.iap.ac.android.gradient.d.a> b = new HashMap();
    public Context c;
    public String d;
    public final String e;
    public final Map<String, Object> f;
    public final Map<String, GradientConfig> g;
    public LoadPluginResult h;
    public ModuleConfig i;
    public DexClassLoader j;
    public File k;
    public Exception l;
    public String m;

    /* renamed from: com.iap.ac.android.gradient.c.a$a  reason: collision with other inner class name */
    public class C0099a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11053a;
        public final /* synthetic */ String b;
        public final /* synthetic */ OnPluginLoadedListener c;

        public C0099a(Context context, String str, OnPluginLoadedListener onPluginLoadedListener) {
            this.f11053a = context;
            this.b = str;
            this.c = onPluginLoadedListener;
        }

        public void run() {
            LoadPluginResult loadPlugin = a.this.loadPlugin(this.f11053a, this.b);
            OnPluginLoadedListener onPluginLoadedListener = this.c;
            if (onPluginLoadedListener != null) {
                onPluginLoadedListener.onPluginLoaded(loadPlugin);
            }
        }
    }

    public a(String str, Map<String, Object> map, Map<String, GradientConfig> map2) {
        this.e = str;
        this.f = map;
        this.g = map2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int r7, short r8, int r9) {
        /*
            int r9 = r9 * 15
            int r9 = r9 + 4
            byte[] r0 = getMax
            int r8 = r8 * 21
            int r8 = r8 + 80
            int r7 = r7 * 2
            int r7 = 16 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L_0x0031
        L_0x001a:
            r3 = 0
        L_0x001b:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L_0x0028
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x0028:
            byte r3 = r0[r9]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r6
        L_0x0031:
            int r9 = r9 + r7
            int r7 = r9 + -4
            int r9 = r0 + 1
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.gradient.c.a.setMax(int, short, int):java.lang.String");
    }

    public a buildClassLoader() {
        if (this.h.resultCode != 0) {
            return this;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.k = new File(com.iap.ac.android.gradient.e.a.a(this.c, this.d), com.iap.ac.android.gradient.e.a.a((String) this.f.get(this.d), this.i.pluginVersion));
            this.j = new com.iap.ac.android.gradient.b.a(this.k.getPath(), this.c.getFilesDir().getAbsolutePath(), (String) null, getClass().getClassLoader());
        } catch (Exception e2) {
            this.l = e2;
            LoadPluginResult loadPluginResult = this.h;
            loadPluginResult.success = false;
            loadPluginResult.resultCode = 1006;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        sb.append("|cost5:");
        sb.append(currentTimeMillis2 - currentTimeMillis);
        this.m = sb.toString();
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r12.h.success == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.iap.ac.android.gradient.c.a end() {
        /*
            r12 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 33
            java.lang.Exception r3 = r12.l     // Catch:{ Exception -> 0x0147 }
            java.lang.String r4 = "pluginVersion"
            java.lang.String r5 = "moduleName"
            java.lang.String r6 = "moduleVersion"
            java.lang.String r7 = ""
            if (r3 != 0) goto L_0x0018
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r8 = r12.h     // Catch:{ Exception -> 0x0147 }
            boolean r8 = r8.success     // Catch:{ Exception -> 0x0147 }
            if (r8 != 0) goto L_0x00a5
        L_0x0018:
            if (r3 == 0) goto L_0x0096
            byte[] r3 = getMax
            byte r3 = r3[r2]
            byte r3 = (byte) r3
            byte r8 = (byte) r3
            int r9 = r8 + 1
            byte r9 = (byte) r9
            java.lang.String r3 = setMax(r3, r8, r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0147 }
            r8.<init>()     // Catch:{ Exception -> 0x0147 }
            byte[] r9 = getMax     // Catch:{ Exception -> 0x0147 }
            byte r9 = r9[r2]     // Catch:{ Exception -> 0x0147 }
            byte r9 = (byte) r9     // Catch:{ Exception -> 0x0147 }
            int r10 = r9 + 1
            byte r10 = (byte) r10     // Catch:{ Exception -> 0x0147 }
            byte[] r11 = getMax     // Catch:{ Exception -> 0x0147 }
            byte r11 = r11[r2]     // Catch:{ Exception -> 0x0147 }
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x0147 }
            java.lang.String r9 = setMax(r9, r10, r11)     // Catch:{ Exception -> 0x0147 }
            r8.append(r9)     // Catch:{ Exception -> 0x0147 }
            java.lang.Exception r9 = r12.l     // Catch:{ Exception -> 0x0147 }
            r8.append(r9)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0147 }
            com.iap.ac.android.common.log.ACLog.e(r3, r8)     // Catch:{ Exception -> 0x0147 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x0147 }
            r3.<init>()     // Catch:{ Exception -> 0x0147 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0147 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x0147 }
            java.util.Map<java.lang.String, java.lang.Object> r9 = r12.f     // Catch:{ Exception -> 0x0147 }
            java.lang.String r10 = r12.d     // Catch:{ Exception -> 0x0147 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ Exception -> 0x0147 }
            r8.append(r9)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0147 }
            r3.put(r6, r8)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r8 = r12.d     // Catch:{ Exception -> 0x0147 }
            r3.put(r5, r8)     // Catch:{ Exception -> 0x0147 }
            com.iap.ac.android.gradient.proguard.model.ModuleConfig r8 = r12.i     // Catch:{ Exception -> 0x0147 }
            if (r8 == 0) goto L_0x0074
            java.lang.String r8 = r8.pluginVersion     // Catch:{ Exception -> 0x0147 }
            goto L_0x0075
        L_0x0074:
            r8 = r7
        L_0x0075:
            r3.put(r4, r8)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r8 = "errorMessage"
            java.lang.Exception r9 = r12.l     // Catch:{ Exception -> 0x0147 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ Exception -> 0x0147 }
            r3.put(r8, r9)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r8 = r12.e     // Catch:{ Exception -> 0x0147 }
            com.iap.ac.android.common.log.IACMonitor r8 = com.iap.ac.android.common.log.ACMonitor.getInstance(r8)     // Catch:{ Exception -> 0x0147 }
            com.iap.ac.android.common.log.event.LogEvent r9 = new com.iap.ac.android.common.log.event.LogEvent     // Catch:{ Exception -> 0x0147 }
            java.lang.String r10 = "GradientExceptionInfo"
            r9.<init>(r10, r3)     // Catch:{ Exception -> 0x0147 }
            r8.logEvent(r9)     // Catch:{ Exception -> 0x0147 }
            r3 = 0
            r12.l = r3     // Catch:{ Exception -> 0x0147 }
        L_0x0096:
            java.io.File r3 = r12.k     // Catch:{ Exception -> 0x0147 }
            if (r3 == 0) goto L_0x00a5
            boolean r3 = r3.exists()     // Catch:{ Exception -> 0x0147 }
            if (r3 == 0) goto L_0x00a5
            java.io.File r3 = r12.k     // Catch:{ Exception -> 0x0147 }
            r3.delete()     // Catch:{ Exception -> 0x0147 }
        L_0x00a5:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0147 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0147 }
            r3.<init>()     // Catch:{ Exception -> 0x0147 }
            java.lang.String r10 = r12.m     // Catch:{ Exception -> 0x0147 }
            r3.append(r10)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r10 = "|cost8:"
            r3.append(r10)     // Catch:{ Exception -> 0x0147 }
            long r8 = r8 - r0
            r3.append(r8)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0147 }
            r12.m = r0     // Catch:{ Exception -> 0x0147 }
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r0 = r12.h     // Catch:{ Exception -> 0x0147 }
            int r0 = r0.resultCode     // Catch:{ Exception -> 0x0147 }
            r1 = 1001(0x3e9, float:1.403E-42)
            if (r0 == r1) goto L_0x0162
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x0147 }
            r0.<init>()     // Catch:{ Exception -> 0x0147 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0147 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x0147 }
            java.util.Map<java.lang.String, java.lang.Object> r3 = r12.f     // Catch:{ Exception -> 0x0147 }
            java.lang.String r8 = r12.d     // Catch:{ Exception -> 0x0147 }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ Exception -> 0x0147 }
            r1.append(r3)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0147 }
            r0.put(r6, r1)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r1 = r12.d     // Catch:{ Exception -> 0x0147 }
            r0.put(r5, r1)     // Catch:{ Exception -> 0x0147 }
            com.iap.ac.android.gradient.proguard.model.ModuleConfig r1 = r12.i     // Catch:{ Exception -> 0x0147 }
            if (r1 == 0) goto L_0x00f2
            java.lang.String r1 = r1.pluginVersion     // Catch:{ Exception -> 0x0147 }
            goto L_0x00f3
        L_0x00f2:
            r1 = r7
        L_0x00f3:
            r0.put(r4, r1)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r1 = "result"
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r3 = r12.h     // Catch:{ Exception -> 0x0147 }
            boolean r3 = r3.success     // Catch:{ Exception -> 0x0147 }
            if (r3 == 0) goto L_0x0101
            java.lang.String r3 = "1"
            goto L_0x0103
        L_0x0101:
            java.lang.String r3 = "0"
        L_0x0103:
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r1 = "resultCode"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0147 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x0147 }
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r4 = r12.h     // Catch:{ Exception -> 0x0147 }
            int r4 = r4.resultCode     // Catch:{ Exception -> 0x0147 }
            r3.append(r4)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0147 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r1 = "cost"
            java.lang.String r3 = r12.m     // Catch:{ Exception -> 0x0147 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r1 = r12.e     // Catch:{ Exception -> 0x0147 }
            com.iap.ac.android.common.log.IACMonitor r1 = com.iap.ac.android.common.log.ACMonitor.getInstance(r1)     // Catch:{ Exception -> 0x0147 }
            com.iap.ac.android.common.log.event.LogEvent r3 = new com.iap.ac.android.common.log.event.LogEvent     // Catch:{ Exception -> 0x0147 }
            java.lang.String r4 = "GradientLoadPlugin"
            r3.<init>(r4, r0)     // Catch:{ Exception -> 0x0147 }
            r1.logEvent(r3)     // Catch:{ Exception -> 0x0147 }
            byte[] r1 = getMax
            byte r1 = r1[r2]
            byte r1 = (byte) r1
            byte r3 = (byte) r1
            int r4 = r3 + 1
            byte r4 = (byte) r4
            java.lang.String r1 = setMax(r1, r3, r4)
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0147 }
            com.iap.ac.android.common.log.ACLog.i(r1, r0)     // Catch:{ Exception -> 0x0147 }
            goto L_0x0162
        L_0x0147:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "abort : "
            java.lang.String r0 = r1.concat(r0)
            byte[] r1 = getMax
            byte r1 = r1[r2]
            byte r1 = (byte) r1
            byte r2 = (byte) r1
            int r3 = r2 + 1
            byte r3 = (byte) r3
            java.lang.String r1 = setMax(r1, r2, r3)
            com.iap.ac.android.common.log.ACLog.e(r1, r0)
        L_0x0162:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.gradient.c.a.end():com.iap.ac.android.gradient.c.a");
    }

    public a extractPlugin() {
        if (this.h.resultCode != 0) {
            return this;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String a2 = com.iap.ac.android.gradient.e.a.a(this.c, this.d);
            String str = this.d;
            String str2 = this.i.pluginVersion;
            StringBuilder sb = new StringBuilder();
            sb.append(com.iap.ac.android.gradient.e.a.a(str));
            sb.append("gradient_");
            sb.append(str2);
            sb.append(".zip");
            com.iap.ac.android.gradient.e.a.a(this.c, sb.toString(), a2, com.iap.ac.android.gradient.e.a.a((String) this.f.get(this.d), this.i.pluginVersion));
        } catch (Exception e2) {
            this.l = e2;
            LoadPluginResult loadPluginResult = this.h;
            loadPluginResult.success = false;
            loadPluginResult.resultCode = 1002;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.m);
        sb2.append("|cost4:");
        sb2.append(currentTimeMillis2 - currentTimeMillis);
        this.m = sb2.toString();
        return this;
    }

    public a injectClassLoader() {
        if (this.h.resultCode != 0) {
            return this;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ClassLoader parent = getClass().getClassLoader().getParent();
            com.iap.ac.android.gradient.e.a.a(getClass(), getClass().getClassLoader(), this.j);
            com.iap.ac.android.gradient.e.a.a(getClass(), this.j, parent);
            this.b.get(this.d).f11054a = true;
            LoadPluginResult loadPluginResult = this.h;
            loadPluginResult.success = true;
            loadPluginResult.resultCode = 1000;
        } catch (Exception e2) {
            this.l = e2;
            LoadPluginResult loadPluginResult2 = this.h;
            loadPluginResult2.success = false;
            loadPluginResult2.resultCode = 1006;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        sb.append("|cost7:");
        sb.append(currentTimeMillis2 - currentTimeMillis);
        this.m = sb.toString();
        return this;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Object, java.lang.String, com.iap.ac.android.gradient.proguard.model.ModuleConfig] */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0459, code lost:
        if (r1.h.success == false) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fe, code lost:
        if (r5 != false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0106, code lost:
        if (r5.enable != false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0137, code lost:
        if (android.text.TextUtils.isEmpty(r2.pluginVersion) == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0143, code lost:
        if (android.text.TextUtils.isEmpty(r2.pluginVersion) == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0170, code lost:
        if (((java.lang.Boolean) java.lang.String.class.getMethod("equals", new java.lang.Class[]{java.lang.Object.class}).invoke(r2, new java.lang.Object[]{r5})).booleanValue() == false) goto L_0x017d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0399 A[Catch:{ Exception -> 0x05ff, Exception -> 0x029c, all -> 0x0173, all -> 0x013a, all -> 0x0101, Exception -> 0x00dc, all -> 0x0602 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x039c A[Catch:{ Exception -> 0x05ff, Exception -> 0x029c, all -> 0x0173, all -> 0x013a, all -> 0x0101, Exception -> 0x00dc, all -> 0x0602 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03a0 A[Catch:{ Exception -> 0x05ff, Exception -> 0x029c, all -> 0x0173, all -> 0x013a, all -> 0x0101, Exception -> 0x00dc, all -> 0x0602 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03da A[Catch:{ Exception -> 0x05ff, Exception -> 0x029c, all -> 0x0173, all -> 0x013a, all -> 0x0101, Exception -> 0x00dc, all -> 0x0602 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03dd A[Catch:{ Exception -> 0x05ff, Exception -> 0x029c, all -> 0x0173, all -> 0x013a, all -> 0x0101, Exception -> 0x00dc, all -> 0x0602 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03e1 A[Catch:{ Exception -> 0x05ff, Exception -> 0x029c, all -> 0x0173, all -> 0x013a, all -> 0x0101, Exception -> 0x00dc, all -> 0x0602 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0451 A[Catch:{ Exception -> 0x05b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0454 A[Catch:{ Exception -> 0x05b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0455 A[Catch:{ Exception -> 0x05b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x045d A[SYNTHETIC, Splitter:B:207:0x045d] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04ef A[SYNTHETIC, Splitter:B:233:0x04ef] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0528 A[Catch:{ Exception -> 0x05b0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult loadPlugin(android.content.Context r17, java.lang.String r18) {
        /*
            r16 = this;
            r1 = r16
            monitor-enter(r16)
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            r4 = r17
            r1.c = r4     // Catch:{ all -> 0x0602 }
            r4 = r18
            r1.d = r4     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r4 = new com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult     // Catch:{ all -> 0x0602 }
            r4.<init>()     // Catch:{ all -> 0x0602 }
            r1.h = r4     // Catch:{ all -> 0x0602 }
            r4 = 0
            r1.i = r4     // Catch:{ all -> 0x0602 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0602 }
            java.lang.String r8 = "cost1:"
            r7.<init>(r8)     // Catch:{ all -> 0x0602 }
            long r5 = r5 - r2
            r7.append(r5)     // Catch:{ all -> 0x0602 }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x0602 }
            r1.m = r2     // Catch:{ all -> 0x0602 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            java.util.Map<java.lang.String, com.iap.ac.android.gradient.d.a> r5 = r1.b     // Catch:{ all -> 0x0602 }
            java.lang.String r6 = r1.d     // Catch:{ all -> 0x0602 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.d.a r5 = (com.iap.ac.android.gradient.d.a) r5     // Catch:{ all -> 0x0602 }
            r6 = 57
            r7 = 2
            r8 = 0
            r9 = 1
            if (r5 != 0) goto L_0x0050
            com.iap.ac.android.gradient.d.a r5 = new com.iap.ac.android.gradient.d.a     // Catch:{ all -> 0x0602 }
            r5.<init>()     // Catch:{ all -> 0x0602 }
            java.util.Map<java.lang.String, com.iap.ac.android.gradient.d.a> r10 = r1.b     // Catch:{ all -> 0x0602 }
            java.lang.String r11 = r1.d     // Catch:{ all -> 0x0602 }
            r10.put(r11, r5)     // Catch:{ all -> 0x0602 }
            goto L_0x0078
        L_0x0050:
            boolean r5 = r5.f11054a     // Catch:{ all -> 0x0602 }
            if (r5 == 0) goto L_0x0057
            r5 = 57
            goto L_0x0059
        L_0x0057:
            r5 = 28
        L_0x0059:
            if (r5 == r6) goto L_0x005c
            goto L_0x0078
        L_0x005c:
            int r5 = setMax     // Catch:{ all -> 0x0602 }
            int r5 = r5 + 15
            int r10 = r5 % 128
            setMin = r10     // Catch:{ all -> 0x0602 }
            int r5 = r5 % r7
            if (r5 != 0) goto L_0x0070
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r5 = r1.h     // Catch:{ all -> 0x0602 }
            r5.success = r8     // Catch:{ all -> 0x0602 }
            r10 = 16626(0x40f2, float:2.3298E-41)
            r5.resultCode = r10     // Catch:{ all -> 0x0602 }
            goto L_0x0078
        L_0x0070:
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r5 = r1.h     // Catch:{ all -> 0x0602 }
            r5.success = r9     // Catch:{ all -> 0x0602 }
            r10 = 1005(0x3ed, float:1.408E-42)
            r5.resultCode = r10     // Catch:{ all -> 0x0602 }
        L_0x0078:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0602 }
            r5.<init>()     // Catch:{ all -> 0x0602 }
            java.lang.String r12 = r1.m     // Catch:{ all -> 0x0602 }
            r5.append(r12)     // Catch:{ all -> 0x0602 }
            java.lang.String r12 = "|cost2:"
            r5.append(r12)     // Catch:{ all -> 0x0602 }
            long r10 = r10 - r2
            r5.append(r10)     // Catch:{ all -> 0x0602 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0602 }
            r1.m = r2     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r2 = r1.h     // Catch:{ all -> 0x0602 }
            int r2 = r2.resultCode     // Catch:{ all -> 0x0602 }
            if (r2 != 0) goto L_0x009d
            r2 = 0
            goto L_0x009e
        L_0x009d:
            r2 = 1
        L_0x009e:
            r3 = 1001(0x3e9, float:1.403E-42)
            if (r2 == 0) goto L_0x00a4
            goto L_0x01a0
        L_0x00a4:
            int r2 = setMax     // Catch:{ all -> 0x0602 }
            int r2 = r2 + 111
            int r5 = r2 % 128
            setMin = r5     // Catch:{ all -> 0x0602 }
            int r2 = r2 % r7
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            java.lang.String r2 = r1.e     // Catch:{ Exception -> 0x00dc }
            com.iap.ac.android.common.config.IACConfig r2 = com.iap.ac.android.common.config.ACConfig.getInstance(r2)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r5 = "gradient"
            org.json.JSONObject r2 = r2.getSectionConfig(r5)     // Catch:{ Exception -> 0x00dc }
            r5 = 45
            if (r2 == 0) goto L_0x00c4
            r12 = 45
            goto L_0x00c6
        L_0x00c4:
            r12 = 83
        L_0x00c6:
            if (r12 == r5) goto L_0x00c9
            goto L_0x00e0
        L_0x00c9:
            java.lang.String r5 = r1.d     // Catch:{ Exception -> 0x00dc }
            org.json.JSONObject r2 = r2.optJSONObject(r5)     // Catch:{ Exception -> 0x00dc }
            if (r2 == 0) goto L_0x00e0
            java.lang.Class<com.iap.ac.android.gradient.proguard.model.ModuleConfig> r5 = com.iap.ac.android.gradient.proguard.model.ModuleConfig.class
            java.lang.Object r2 = com.iap.ac.android.common.json.JsonUtils.fromJson((org.json.JSONObject) r2, r5)     // Catch:{ Exception -> 0x00dc }
            com.iap.ac.android.gradient.proguard.model.ModuleConfig r2 = (com.iap.ac.android.gradient.proguard.model.ModuleConfig) r2     // Catch:{ Exception -> 0x00dc }
            r1.i = r2     // Catch:{ Exception -> 0x00dc }
            goto L_0x00e0
        L_0x00dc:
            r0 = move-exception
            r2 = r0
            r1.l = r2     // Catch:{ all -> 0x0602 }
        L_0x00e0:
            java.util.Map<java.lang.String, com.iap.ac.android.gradient.proguard.model.GradientConfig> r2 = r1.g     // Catch:{ all -> 0x0602 }
            java.lang.String r5 = r1.d     // Catch:{ all -> 0x0602 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.proguard.model.GradientConfig r2 = (com.iap.ac.android.gradient.proguard.model.GradientConfig) r2     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.proguard.model.ModuleConfig r5 = r1.i     // Catch:{ all -> 0x0602 }
            if (r5 == 0) goto L_0x017d
            int r12 = setMax     // Catch:{ all -> 0x0602 }
            int r12 = r12 + 123
            int r13 = r12 % 128
            setMin = r13     // Catch:{ all -> 0x0602 }
            int r12 = r12 % r7
            if (r12 != 0) goto L_0x0104
            boolean r5 = r5.enable     // Catch:{ all -> 0x0602 }
            super.hashCode()     // Catch:{ all -> 0x0101 }
            if (r5 == 0) goto L_0x017d
            goto L_0x0108
        L_0x0101:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0602 }
        L_0x0104:
            boolean r5 = r5.enable     // Catch:{ all -> 0x0602 }
            if (r5 == 0) goto L_0x017d
        L_0x0108:
            if (r2 == 0) goto L_0x017d
            int r5 = setMin     // Catch:{ all -> 0x0602 }
            int r5 = r5 + 95
            int r12 = r5 % 128
            setMax = r12     // Catch:{ all -> 0x0602 }
            int r5 = r5 % r7
            java.lang.String r5 = r2.moduleName     // Catch:{ all -> 0x0602 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0602 }
            if (r5 != 0) goto L_0x017d
            java.lang.String r5 = r2.moduleVersion     // Catch:{ all -> 0x0602 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0602 }
            if (r5 != 0) goto L_0x017d
            int r5 = setMin     // Catch:{ all -> 0x0602 }
            int r5 = r5 + 65
            int r12 = r5 % 128
            setMax = r12     // Catch:{ all -> 0x0602 }
            int r5 = r5 % r7
            if (r5 == 0) goto L_0x013d
            java.lang.String r5 = r2.pluginVersion     // Catch:{ all -> 0x0602 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0602 }
            r12 = 59
            int r12 = r12 / r8
            if (r5 != 0) goto L_0x017d
            goto L_0x0145
        L_0x013a:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0602 }
        L_0x013d:
            java.lang.String r5 = r2.pluginVersion     // Catch:{ all -> 0x0602 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0602 }
            if (r5 != 0) goto L_0x017d
        L_0x0145:
            java.lang.String r2 = r2.pluginVersion     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.proguard.model.ModuleConfig r5 = r1.i     // Catch:{ all -> 0x0602 }
            java.lang.String r5 = r5.pluginVersion     // Catch:{ all -> 0x0602 }
            int r12 = setMax     // Catch:{ all -> 0x0602 }
            int r12 = r12 + 59
            int r13 = r12 % 128
            setMin = r13     // Catch:{ all -> 0x0602 }
            int r12 = r12 % r7
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ all -> 0x0173 }
            r12[r8] = r5     // Catch:{ all -> 0x0173 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.String r13 = "equals"
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x0173 }
            java.lang.Class<java.lang.Object> r15 = java.lang.Object.class
            r14[r8] = r15     // Catch:{ all -> 0x0173 }
            java.lang.reflect.Method r5 = r5.getMethod(r13, r14)     // Catch:{ all -> 0x0173 }
            java.lang.Object r2 = r5.invoke(r2, r12)     // Catch:{ all -> 0x0173 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0173 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0173 }
            if (r2 != 0) goto L_0x0183
            goto L_0x017d
        L_0x0173:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x0602 }
            if (r3 == 0) goto L_0x017c
            throw r3     // Catch:{ all -> 0x0602 }
        L_0x017c:
            throw r2     // Catch:{ all -> 0x0602 }
        L_0x017d:
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r2 = r1.h     // Catch:{ Exception -> 0x05ff }
            r2.success = r8     // Catch:{ Exception -> 0x029c }
            r2.resultCode = r3     // Catch:{ Exception -> 0x029c }
        L_0x0183:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0602 }
            r2.<init>()     // Catch:{ all -> 0x0602 }
            java.lang.String r5 = r1.m     // Catch:{ all -> 0x0602 }
            r2.append(r5)     // Catch:{ all -> 0x0602 }
            java.lang.String r5 = "|cost3:"
            r2.append(r5)     // Catch:{ all -> 0x0602 }
            long r12 = r12 - r10
            r2.append(r12)     // Catch:{ all -> 0x0602 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0602 }
            r1.m = r2     // Catch:{ all -> 0x0602 }
        L_0x01a0:
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r2 = r1.h     // Catch:{ all -> 0x0602 }
            int r2 = r2.resultCode     // Catch:{ all -> 0x0602 }
            if (r2 != 0) goto L_0x0227
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            android.content.Context r2 = r1.c     // Catch:{ Exception -> 0x01fe }
            java.lang.String r5 = r1.d     // Catch:{ Exception -> 0x01fe }
            java.lang.String r2 = com.iap.ac.android.gradient.e.a.a((android.content.Context) r2, (java.lang.String) r5)     // Catch:{ Exception -> 0x01fe }
            java.lang.String r5 = r1.d     // Catch:{ Exception -> 0x01fe }
            com.iap.ac.android.gradient.proguard.model.ModuleConfig r12 = r1.i     // Catch:{ Exception -> 0x01fe }
            java.lang.String r12 = r12.pluginVersion     // Catch:{ Exception -> 0x01fe }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01fe }
            r13.<init>()     // Catch:{ Exception -> 0x01fe }
            java.lang.String r5 = com.iap.ac.android.gradient.e.a.a((java.lang.String) r5)     // Catch:{ Exception -> 0x01fe }
            r13.append(r5)     // Catch:{ Exception -> 0x01fe }
            java.lang.String r5 = "gradient_"
            r13.append(r5)     // Catch:{ Exception -> 0x01fe }
            r13.append(r12)     // Catch:{ Exception -> 0x01fe }
            java.lang.String r5 = ".zip"
            r13.append(r5)     // Catch:{ Exception -> 0x01fe }
            java.lang.String r5 = r13.toString()     // Catch:{ Exception -> 0x01fe }
            java.util.Map<java.lang.String, java.lang.Object> r12 = r1.f     // Catch:{ Exception -> 0x01fe }
            java.lang.String r13 = r1.d     // Catch:{ Exception -> 0x01fe }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ Exception -> 0x01fe }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x01fe }
            com.iap.ac.android.gradient.proguard.model.ModuleConfig r13 = r1.i     // Catch:{ Exception -> 0x01fe }
            java.lang.String r13 = r13.pluginVersion     // Catch:{ Exception -> 0x01fe }
            java.lang.String r12 = com.iap.ac.android.gradient.e.a.a((java.lang.String) r12, (java.lang.String) r13)     // Catch:{ Exception -> 0x01fe }
            android.content.Context r13 = r1.c     // Catch:{ Exception -> 0x01fe }
            com.iap.ac.android.gradient.e.a.a(r13, r5, r2, r12)     // Catch:{ Exception -> 0x01fe }
            int r2 = setMax     // Catch:{ all -> 0x0602 }
            int r2 = r2 + r6
            int r5 = r2 % 128
            setMin = r5     // Catch:{ all -> 0x0602 }
            int r2 = r2 % r7
            r5 = 93
            if (r2 != 0) goto L_0x01fb
            r2 = 40
            goto L_0x020a
        L_0x01fb:
            r2 = 93
            goto L_0x020a
        L_0x01fe:
            r0 = move-exception
            r2 = r0
            r1.l = r2     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r2 = r1.h     // Catch:{ all -> 0x0602 }
            r2.success = r8     // Catch:{ all -> 0x0602 }
            r5 = 1002(0x3ea, float:1.404E-42)
            r2.resultCode = r5     // Catch:{ all -> 0x0602 }
        L_0x020a:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0602 }
            r2.<init>()     // Catch:{ all -> 0x0602 }
            java.lang.String r12 = r1.m     // Catch:{ all -> 0x0602 }
            r2.append(r12)     // Catch:{ all -> 0x0602 }
            java.lang.String r12 = "|cost4:"
            r2.append(r12)     // Catch:{ all -> 0x0602 }
            long r5 = r5 - r10
            r2.append(r5)     // Catch:{ all -> 0x0602 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0602 }
            r1.m = r2     // Catch:{ all -> 0x0602 }
        L_0x0227:
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r2 = r1.h     // Catch:{ all -> 0x0602 }
            int r2 = r2.resultCode     // Catch:{ all -> 0x0602 }
            r5 = 1006(0x3ee, float:1.41E-42)
            if (r2 != 0) goto L_0x02a0
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            android.content.Context r2 = r1.c     // Catch:{ Exception -> 0x0274 }
            java.lang.String r6 = r1.d     // Catch:{ Exception -> 0x0274 }
            java.lang.String r2 = com.iap.ac.android.gradient.e.a.a((android.content.Context) r2, (java.lang.String) r6)     // Catch:{ Exception -> 0x0274 }
            java.util.Map<java.lang.String, java.lang.Object> r6 = r1.f     // Catch:{ Exception -> 0x0274 }
            java.lang.String r12 = r1.d     // Catch:{ Exception -> 0x0274 }
            java.lang.Object r6 = r6.get(r12)     // Catch:{ Exception -> 0x0274 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0274 }
            com.iap.ac.android.gradient.proguard.model.ModuleConfig r12 = r1.i     // Catch:{ Exception -> 0x0274 }
            java.lang.String r12 = r12.pluginVersion     // Catch:{ Exception -> 0x0274 }
            java.lang.String r6 = com.iap.ac.android.gradient.e.a.a((java.lang.String) r6, (java.lang.String) r12)     // Catch:{ Exception -> 0x0274 }
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x0274 }
            r12.<init>(r2, r6)     // Catch:{ Exception -> 0x0274 }
            r1.k = r12     // Catch:{ Exception -> 0x0274 }
            com.iap.ac.android.gradient.b.a r2 = new com.iap.ac.android.gradient.b.a     // Catch:{ Exception -> 0x0274 }
            java.io.File r6 = r1.k     // Catch:{ Exception -> 0x0274 }
            java.lang.String r6 = r6.getPath()     // Catch:{ Exception -> 0x0274 }
            android.content.Context r12 = r1.c     // Catch:{ Exception -> 0x0274 }
            java.io.File r12 = r12.getFilesDir()     // Catch:{ Exception -> 0x0274 }
            java.lang.String r12 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x0274 }
            java.lang.Class r13 = r16.getClass()     // Catch:{ Exception -> 0x0274 }
            java.lang.ClassLoader r13 = r13.getClassLoader()     // Catch:{ Exception -> 0x0274 }
            r2.<init>(r6, r12, r4, r13)     // Catch:{ Exception -> 0x0274 }
            r1.j = r2     // Catch:{ Exception -> 0x0274 }
            goto L_0x027e
        L_0x0274:
            r0 = move-exception
            r2 = r0
            r1.l = r2     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r2 = r1.h     // Catch:{ all -> 0x0602 }
            r2.success = r8     // Catch:{ all -> 0x0602 }
            r2.resultCode = r5     // Catch:{ all -> 0x0602 }
        L_0x027e:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x029c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0602 }
            r2.<init>()     // Catch:{ all -> 0x0602 }
            java.lang.String r6 = r1.m     // Catch:{ Exception -> 0x05ff }
            r2.append(r6)     // Catch:{ all -> 0x0602 }
            java.lang.String r6 = "|cost5:"
            r2.append(r6)     // Catch:{ all -> 0x0602 }
            long r12 = r12 - r10
            r2.append(r12)     // Catch:{ all -> 0x0602 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0602 }
            r1.m = r2     // Catch:{ all -> 0x0602 }
            goto L_0x02a0
        L_0x029c:
            r0 = move-exception
            r2 = r0
            goto L_0x05fe
        L_0x02a0:
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r2 = r1.h     // Catch:{ all -> 0x0602 }
            int r2 = r2.resultCode     // Catch:{ all -> 0x0602 }
            if (r2 != 0) goto L_0x03d2
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            android.content.Context r2 = r1.c     // Catch:{ all -> 0x0602 }
            dalvik.system.DexClassLoader r6 = r1.j     // Catch:{ all -> 0x0602 }
            java.lang.String r12 = r1.d     // Catch:{ all -> 0x0602 }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ Exception -> 0x0384, all -> 0x037e }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0384, all -> 0x037e }
            r13.<init>()     // Catch:{ Exception -> 0x0384, all -> 0x037e }
            java.lang.String r12 = com.iap.ac.android.gradient.e.a.a((java.lang.String) r12)     // Catch:{ Exception -> 0x0384, all -> 0x037e }
            r13.append(r12)     // Catch:{ Exception -> 0x0384, all -> 0x037e }
            java.lang.String r12 = "classList"
            r13.append(r12)     // Catch:{ Exception -> 0x0384, all -> 0x037e }
            java.lang.String r12 = r13.toString()     // Catch:{ Exception -> 0x0384, all -> 0x037e }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0374 }
            r13[r9] = r12     // Catch:{ all -> 0x0374 }
            r13[r8] = r2     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = ""
            r12 = 48
            int r2 = android.text.TextUtils.indexOf(r2, r12)     // Catch:{ all -> 0x0374 }
            int r2 = r2 + 20
            r14 = 0
            float r15 = android.util.TypedValue.complexToFraction(r8, r14, r14)     // Catch:{ all -> 0x0374 }
            int r14 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            r15 = 56347(0xdc1b, float:7.8959E-41)
            java.lang.String r3 = ""
            int r3 = android.text.TextUtils.lastIndexOf(r3, r12)     // Catch:{ all -> 0x0374 }
            int r15 = r15 - r3
            char r3 = (char) r15     // Catch:{ all -> 0x0374 }
            java.lang.Object r2 = o.upFrom.setMax(r2, r14, r3)     // Catch:{ all -> 0x0374 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x0374 }
            java.lang.String r3 = "getMin"
            java.lang.Class[] r12 = new java.lang.Class[r7]     // Catch:{ all -> 0x0374 }
            java.lang.Class<android.content.res.AssetManager> r14 = android.content.res.AssetManager.class
            r12[r8] = r14     // Catch:{ all -> 0x0374 }
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r12[r9] = r14     // Catch:{ all -> 0x0374 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r12)     // Catch:{ all -> 0x0374 }
            java.lang.Object r2 = r2.invoke(r4, r13)     // Catch:{ all -> 0x0374 }
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ all -> 0x0374 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0371, all -> 0x036e }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0371, all -> 0x036e }
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ Exception -> 0x036b, all -> 0x0368 }
            r12.<init>(r3)     // Catch:{ Exception -> 0x036b, all -> 0x0368 }
        L_0x0311:
            java.lang.String r13 = r12.readLine()     // Catch:{ Exception -> 0x0365 }
            if (r13 == 0) goto L_0x035a
            int r14 = setMax     // Catch:{ all -> 0x0602 }
            int r14 = r14 + 13
            int r15 = r14 % 128
            setMin = r15     // Catch:{ all -> 0x0602 }
            int r14 = r14 % 2
            if (r14 != 0) goto L_0x033e
            java.lang.Class r13 = r6.loadClass(r13)     // Catch:{ Exception -> 0x0365 }
            java.lang.Class r14 = r16.getClass()     // Catch:{ Exception -> 0x0365 }
            java.lang.ClassLoader r14 = r14.getClassLoader()     // Catch:{ Exception -> 0x0365 }
            java.lang.Class<java.lang.Class> r15 = java.lang.Class.class
            java.lang.String r4 = "classLoader"
            java.lang.reflect.Field r4 = r15.getDeclaredField(r4)     // Catch:{ Exception -> 0x0365 }
            r4.setAccessible(r8)     // Catch:{ Exception -> 0x0365 }
            r4.set(r13, r14)     // Catch:{ Exception -> 0x0365 }
            goto L_0x0358
        L_0x033e:
            java.lang.Class r4 = r6.loadClass(r13)     // Catch:{ Exception -> 0x0365 }
            java.lang.Class r13 = r16.getClass()     // Catch:{ Exception -> 0x0365 }
            java.lang.ClassLoader r13 = r13.getClassLoader()     // Catch:{ Exception -> 0x0365 }
            java.lang.Class<java.lang.Class> r14 = java.lang.Class.class
            java.lang.String r15 = "classLoader"
            java.lang.reflect.Field r14 = r14.getDeclaredField(r15)     // Catch:{ Exception -> 0x0365 }
            r14.setAccessible(r9)     // Catch:{ Exception -> 0x0365 }
            r14.set(r4, r13)     // Catch:{ Exception -> 0x0365 }
        L_0x0358:
            r4 = 0
            goto L_0x0311
        L_0x035a:
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r12)     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r3)     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r2)     // Catch:{ all -> 0x0602 }
            r2 = 1
            goto L_0x0395
        L_0x0365:
            r0 = move-exception
            r4 = r0
            goto L_0x0389
        L_0x0368:
            r0 = move-exception
            r4 = r0
            goto L_0x0382
        L_0x036b:
            r0 = move-exception
            r4 = r0
            goto L_0x0388
        L_0x036e:
            r0 = move-exception
            r4 = r0
            goto L_0x0381
        L_0x0371:
            r0 = move-exception
            r4 = r0
            goto L_0x0387
        L_0x0374:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ Exception -> 0x0384, all -> 0x037e }
            if (r3 == 0) goto L_0x037d
            throw r3     // Catch:{ Exception -> 0x0384, all -> 0x037e }
        L_0x037d:
            throw r2     // Catch:{ Exception -> 0x0384, all -> 0x037e }
        L_0x037e:
            r0 = move-exception
            r4 = r0
            r2 = 0
        L_0x0381:
            r3 = 0
        L_0x0382:
            r12 = 0
            goto L_0x03c8
        L_0x0384:
            r0 = move-exception
            r4 = r0
            r2 = 0
        L_0x0387:
            r3 = 0
        L_0x0388:
            r12 = 0
        L_0x0389:
            r1.l = r4     // Catch:{ all -> 0x03c6 }
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r12)     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r3)     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r2)     // Catch:{ all -> 0x0602 }
            r2 = 0
        L_0x0395:
            r3 = 69
            if (r2 != 0) goto L_0x039c
            r2 = 90
            goto L_0x039e
        L_0x039c:
            r2 = 69
        L_0x039e:
            if (r2 == r3) goto L_0x03a8
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r2 = r1.h     // Catch:{ all -> 0x0602 }
            r2.success = r8     // Catch:{ all -> 0x0602 }
            r3 = 1003(0x3eb, float:1.406E-42)
            r2.resultCode = r3     // Catch:{ all -> 0x0602 }
        L_0x03a8:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0602 }
            r4.<init>()     // Catch:{ all -> 0x0602 }
            java.lang.String r6 = r1.m     // Catch:{ all -> 0x0602 }
            r4.append(r6)     // Catch:{ all -> 0x0602 }
            java.lang.String r6 = "|cost6:"
            r4.append(r6)     // Catch:{ all -> 0x0602 }
            long r2 = r2 - r10
            r4.append(r2)     // Catch:{ all -> 0x0602 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0602 }
            r1.m = r2     // Catch:{ all -> 0x0602 }
            goto L_0x03d2
        L_0x03c6:
            r0 = move-exception
            r4 = r0
        L_0x03c8:
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r12)     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r3)     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r2)     // Catch:{ all -> 0x0602 }
            throw r4     // Catch:{ all -> 0x0602 }
        L_0x03d2:
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r2 = r1.h     // Catch:{ all -> 0x0602 }
            int r2 = r2.resultCode     // Catch:{ all -> 0x0602 }
            r3 = 29
            if (r2 != 0) goto L_0x03dd
            r2 = 12
            goto L_0x03df
        L_0x03dd:
            r2 = 29
        L_0x03df:
            if (r2 == r3) goto L_0x0447
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            java.lang.Class r4 = r16.getClass()     // Catch:{ Exception -> 0x0420 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ Exception -> 0x0420 }
            java.lang.ClassLoader r4 = r4.getParent()     // Catch:{ Exception -> 0x0420 }
            java.lang.Class r6 = r16.getClass()     // Catch:{ Exception -> 0x0420 }
            java.lang.Class r10 = r16.getClass()     // Catch:{ Exception -> 0x0420 }
            java.lang.ClassLoader r10 = r10.getClassLoader()     // Catch:{ Exception -> 0x0420 }
            dalvik.system.DexClassLoader r11 = r1.j     // Catch:{ Exception -> 0x0420 }
            com.iap.ac.android.gradient.e.a.a(r6, r10, r11)     // Catch:{ Exception -> 0x0420 }
            java.lang.Class r6 = r16.getClass()     // Catch:{ Exception -> 0x0420 }
            dalvik.system.DexClassLoader r10 = r1.j     // Catch:{ Exception -> 0x0420 }
            com.iap.ac.android.gradient.e.a.a(r6, r10, r4)     // Catch:{ Exception -> 0x0420 }
            java.util.Map<java.lang.String, com.iap.ac.android.gradient.d.a> r4 = r1.b     // Catch:{ Exception -> 0x0420 }
            java.lang.String r6 = r1.d     // Catch:{ Exception -> 0x0420 }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ Exception -> 0x0420 }
            com.iap.ac.android.gradient.d.a r4 = (com.iap.ac.android.gradient.d.a) r4     // Catch:{ Exception -> 0x0420 }
            r4.f11054a = r9     // Catch:{ Exception -> 0x0420 }
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r4 = r1.h     // Catch:{ Exception -> 0x0420 }
            r4.success = r9     // Catch:{ Exception -> 0x0420 }
            r6 = 1000(0x3e8, float:1.401E-42)
            r4.resultCode = r6     // Catch:{ Exception -> 0x0420 }
            goto L_0x042a
        L_0x0420:
            r0 = move-exception
            r4 = r0
            r1.l = r4     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r4 = r1.h     // Catch:{ all -> 0x0602 }
            r4.success = r8     // Catch:{ all -> 0x0602 }
            r4.resultCode = r5     // Catch:{ all -> 0x0602 }
        L_0x042a:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0602 }
            r6.<init>()     // Catch:{ all -> 0x0602 }
            java.lang.String r10 = r1.m     // Catch:{ all -> 0x0602 }
            r6.append(r10)     // Catch:{ all -> 0x0602 }
            java.lang.String r10 = "|cost7:"
            r6.append(r10)     // Catch:{ all -> 0x0602 }
            long r4 = r4 - r2
            r6.append(r4)     // Catch:{ all -> 0x0602 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0602 }
            r1.m = r2     // Catch:{ all -> 0x0602 }
        L_0x0447:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0602 }
            r4 = 33
            java.lang.Exception r5 = r1.l     // Catch:{ Exception -> 0x05b0 }
            if (r5 != 0) goto L_0x0452
            r8 = 1
        L_0x0452:
            if (r8 == r9) goto L_0x0455
            goto L_0x045b
        L_0x0455:
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r6 = r1.h     // Catch:{ Exception -> 0x05b0 }
            boolean r6 = r6.success     // Catch:{ Exception -> 0x05b0 }
            if (r6 != 0) goto L_0x0503
        L_0x045b:
            if (r5 == 0) goto L_0x04eb
            byte[] r5 = getMax     // Catch:{ all -> 0x0602 }
            byte r5 = r5[r4]     // Catch:{ all -> 0x0602 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x0602 }
            byte r6 = (byte) r5     // Catch:{ all -> 0x0602 }
            int r8 = r6 + 1
            byte r8 = (byte) r8     // Catch:{ all -> 0x0602 }
            java.lang.String r5 = setMax(r5, r6, r8)     // Catch:{ all -> 0x0602 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05b0 }
            r6.<init>()     // Catch:{ Exception -> 0x05b0 }
            byte[] r8 = getMax     // Catch:{ Exception -> 0x05b0 }
            byte r8 = r8[r4]     // Catch:{ Exception -> 0x05b0 }
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x05b0 }
            int r9 = r8 + 1
            byte r9 = (byte) r9     // Catch:{ Exception -> 0x05b0 }
            byte[] r10 = getMax     // Catch:{ Exception -> 0x05b0 }
            byte r10 = r10[r4]     // Catch:{ Exception -> 0x05b0 }
            byte r10 = (byte) r10     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r8 = setMax(r8, r9, r10)     // Catch:{ Exception -> 0x05b0 }
            r6.append(r8)     // Catch:{ Exception -> 0x05b0 }
            java.lang.Exception r8 = r1.l     // Catch:{ Exception -> 0x05b0 }
            r6.append(r8)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x05b0 }
            com.iap.ac.android.common.log.ACLog.e(r5, r6)     // Catch:{ Exception -> 0x05b0 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x05b0 }
            r5.<init>()     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r6 = "moduleVersion"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r9 = ""
            r8.<init>(r9)     // Catch:{ Exception -> 0x05b0 }
            java.util.Map<java.lang.String, java.lang.Object> r9 = r1.f     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r10 = r1.d     // Catch:{ Exception -> 0x05b0 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ Exception -> 0x05b0 }
            r8.append(r9)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x05b0 }
            r5.put(r6, r8)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r6 = "moduleName"
            java.lang.String r8 = r1.d     // Catch:{ Exception -> 0x05b0 }
            r5.put(r6, r8)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r6 = "pluginVersion"
            com.iap.ac.android.gradient.proguard.model.ModuleConfig r8 = r1.i     // Catch:{ Exception -> 0x05b0 }
            if (r8 == 0) goto L_0x04c8
            int r9 = setMax     // Catch:{ all -> 0x0602 }
            int r9 = r9 + 67
            int r10 = r9 % 128
            setMin = r10     // Catch:{ all -> 0x0602 }
            int r9 = r9 % r7
            java.lang.String r8 = r8.pluginVersion     // Catch:{ Exception -> 0x05b0 }
            goto L_0x04ca
        L_0x04c8:
            java.lang.String r8 = ""
        L_0x04ca:
            r5.put(r6, r8)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r6 = "errorMessage"
            java.lang.Exception r8 = r1.l     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ Exception -> 0x05b0 }
            r5.put(r6, r8)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r6 = r1.e     // Catch:{ Exception -> 0x05b0 }
            com.iap.ac.android.common.log.IACMonitor r6 = com.iap.ac.android.common.log.ACMonitor.getInstance(r6)     // Catch:{ Exception -> 0x05b0 }
            com.iap.ac.android.common.log.event.LogEvent r8 = new com.iap.ac.android.common.log.event.LogEvent     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r9 = "GradientExceptionInfo"
            r8.<init>(r9, r5)     // Catch:{ Exception -> 0x05b0 }
            r6.logEvent(r8)     // Catch:{ Exception -> 0x05b0 }
            r5 = 0
            r1.l = r5     // Catch:{ Exception -> 0x05b0 }
        L_0x04eb:
            java.io.File r5 = r1.k     // Catch:{ Exception -> 0x05b0 }
            if (r5 == 0) goto L_0x0503
            int r6 = setMax     // Catch:{ all -> 0x0602 }
            int r6 = r6 + 15
            int r8 = r6 % 128
            setMin = r8     // Catch:{ all -> 0x0602 }
            int r6 = r6 % r7
            boolean r5 = r5.exists()     // Catch:{ Exception -> 0x05b0 }
            if (r5 == 0) goto L_0x0503
            java.io.File r5 = r1.k     // Catch:{ Exception -> 0x05b0 }
            r5.delete()     // Catch:{ Exception -> 0x05b0 }
        L_0x0503:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x05b0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05b0 }
            r7.<init>()     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r8 = r1.m     // Catch:{ Exception -> 0x05b0 }
            r7.append(r8)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r8 = "|cost8:"
            r7.append(r8)     // Catch:{ Exception -> 0x05b0 }
            long r5 = r5 - r2
            r7.append(r5)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r2 = r7.toString()     // Catch:{ Exception -> 0x05b0 }
            r1.m = r2     // Catch:{ Exception -> 0x05b0 }
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r2 = r1.h     // Catch:{ Exception -> 0x05b0 }
            int r2 = r2.resultCode     // Catch:{ Exception -> 0x05b0 }
            r3 = 1001(0x3e9, float:1.403E-42)
            if (r2 == r3) goto L_0x05cc
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x05b0 }
            r2.<init>()     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r3 = "moduleVersion"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r6 = ""
            r5.<init>(r6)     // Catch:{ Exception -> 0x05b0 }
            java.util.Map<java.lang.String, java.lang.Object> r6 = r1.f     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r7 = r1.d     // Catch:{ Exception -> 0x05b0 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x05b0 }
            r5.append(r6)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x05b0 }
            r2.put(r3, r5)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r3 = "moduleName"
            java.lang.String r5 = r1.d     // Catch:{ Exception -> 0x05b0 }
            r2.put(r3, r5)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r3 = "pluginVersion"
            com.iap.ac.android.gradient.proguard.model.ModuleConfig r5 = r1.i     // Catch:{ Exception -> 0x05b0 }
            if (r5 == 0) goto L_0x0558
            java.lang.String r5 = r5.pluginVersion     // Catch:{ Exception -> 0x05b0 }
            goto L_0x055a
        L_0x0558:
            java.lang.String r5 = ""
        L_0x055a:
            r2.put(r3, r5)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r3 = "result"
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r5 = r1.h     // Catch:{ Exception -> 0x05b0 }
            boolean r5 = r5.success     // Catch:{ Exception -> 0x05b0 }
            if (r5 == 0) goto L_0x0568
            java.lang.String r5 = "1"
            goto L_0x056a
        L_0x0568:
            java.lang.String r5 = "0"
        L_0x056a:
            r2.put(r3, r5)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r3 = "resultCode"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r6 = ""
            r5.<init>(r6)     // Catch:{ Exception -> 0x05b0 }
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r6 = r1.h     // Catch:{ Exception -> 0x05b0 }
            int r6 = r6.resultCode     // Catch:{ Exception -> 0x05b0 }
            r5.append(r6)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x05b0 }
            r2.put(r3, r5)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r3 = "cost"
            java.lang.String r5 = r1.m     // Catch:{ Exception -> 0x05b0 }
            r2.put(r3, r5)     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r3 = r1.e     // Catch:{ Exception -> 0x05b0 }
            com.iap.ac.android.common.log.IACMonitor r3 = com.iap.ac.android.common.log.ACMonitor.getInstance(r3)     // Catch:{ Exception -> 0x05b0 }
            com.iap.ac.android.common.log.event.LogEvent r5 = new com.iap.ac.android.common.log.event.LogEvent     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r6 = "GradientLoadPlugin"
            r5.<init>(r6, r2)     // Catch:{ Exception -> 0x05b0 }
            r3.logEvent(r5)     // Catch:{ Exception -> 0x05b0 }
            byte[] r3 = getMax     // Catch:{ all -> 0x0602 }
            byte r3 = r3[r4]     // Catch:{ all -> 0x0602 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x0602 }
            byte r5 = (byte) r3     // Catch:{ all -> 0x0602 }
            int r6 = r5 + 1
            byte r6 = (byte) r6     // Catch:{ all -> 0x0602 }
            java.lang.String r3 = setMax(r3, r5, r6)     // Catch:{ all -> 0x0602 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x05b0 }
            com.iap.ac.android.common.log.ACLog.i(r3, r2)     // Catch:{ Exception -> 0x05b0 }
            goto L_0x05cc
        L_0x05b0:
            r0 = move-exception
            r2 = r0
            java.lang.String r3 = "abort : "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0602 }
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x0602 }
            byte[] r3 = getMax     // Catch:{ all -> 0x0602 }
            byte r3 = r3[r4]     // Catch:{ all -> 0x0602 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x0602 }
            byte r5 = (byte) r3     // Catch:{ all -> 0x0602 }
            int r6 = r5 + 1
            byte r6 = (byte) r6     // Catch:{ all -> 0x0602 }
            java.lang.String r3 = setMax(r3, r5, r6)     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.common.log.ACLog.e(r3, r2)     // Catch:{ all -> 0x0602 }
        L_0x05cc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0602 }
            java.lang.String r3 = "moduleName: "
            r2.<init>(r3)     // Catch:{ all -> 0x0602 }
            java.lang.String r3 = r1.d     // Catch:{ all -> 0x0602 }
            r2.append(r3)     // Catch:{ all -> 0x0602 }
            java.lang.String r3 = " result: "
            r2.append(r3)     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r3 = r1.h     // Catch:{ all -> 0x0602 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0602 }
            r2.append(r3)     // Catch:{ all -> 0x0602 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0602 }
            byte[] r3 = getMax     // Catch:{ all -> 0x0602 }
            byte r3 = r3[r4]     // Catch:{ all -> 0x0602 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x0602 }
            byte r4 = (byte) r3     // Catch:{ all -> 0x0602 }
            int r5 = r4 + 1
            byte r5 = (byte) r5     // Catch:{ all -> 0x0602 }
            java.lang.String r3 = setMax(r3, r4, r5)     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.common.log.ACLog.i(r3, r2)     // Catch:{ all -> 0x0602 }
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r2 = r1.h     // Catch:{ all -> 0x0602 }
            monitor-exit(r16)
            return r2
        L_0x05fe:
            throw r2     // Catch:{ all -> 0x0602 }
        L_0x05ff:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0602 }
        L_0x0602:
            r0 = move-exception
            r2 = r0
            monitor-exit(r16)
            goto L_0x0607
        L_0x0606:
            throw r2
        L_0x0607:
            goto L_0x0606
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.gradient.c.a.loadPlugin(android.content.Context, java.lang.String):com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult");
    }

    public void loadPluginAsync(Context context, String str, OnPluginLoadedListener onPluginLoadedListener) {
        this.f11052a.submit(new C0099a(context, str, onPluginLoadedListener));
    }

    public a queryModuleConfig() {
        JSONObject optJSONObject;
        if (this.h.resultCode != 0) {
            return this;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            JSONObject sectionConfig = ACConfig.getInstance(this.e).getSectionConfig("gradient");
            if (!(sectionConfig == null || (optJSONObject = sectionConfig.optJSONObject(this.d)) == null)) {
                this.i = (ModuleConfig) JsonUtils.fromJson(optJSONObject, ModuleConfig.class);
            }
        } catch (Exception e2) {
            this.l = e2;
        }
        GradientConfig gradientConfig = this.g.get(this.d);
        ModuleConfig moduleConfig = this.i;
        if (moduleConfig == null || !moduleConfig.enable || gradientConfig == null || TextUtils.isEmpty(gradientConfig.moduleName) || TextUtils.isEmpty(gradientConfig.moduleVersion) || TextUtils.isEmpty(gradientConfig.pluginVersion) || !gradientConfig.pluginVersion.equals(this.i.pluginVersion)) {
            LoadPluginResult loadPluginResult = this.h;
            loadPluginResult.success = false;
            loadPluginResult.resultCode = 1001;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        sb.append("|cost3:");
        sb.append(currentTimeMillis2 - currentTimeMillis);
        this.m = sb.toString();
        return this;
    }

    public a queryPluginRecords() {
        long currentTimeMillis = System.currentTimeMillis();
        com.iap.ac.android.gradient.d.a aVar = this.b.get(this.d);
        if (aVar == null) {
            this.b.put(this.d, new com.iap.ac.android.gradient.d.a());
        } else if (aVar.f11054a) {
            LoadPluginResult loadPluginResult = this.h;
            loadPluginResult.success = true;
            loadPluginResult.resultCode = 1005;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        sb.append("|cost2:");
        sb.append(currentTimeMillis2 - currentTimeMillis);
        this.m = sb.toString();
        return this;
    }

    public a start(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        this.c = context;
        this.d = str;
        this.h = new LoadPluginResult();
        this.i = null;
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("cost1:");
        sb.append(currentTimeMillis2 - currentTimeMillis);
        this.m = sb.toString();
        return this;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.iap.ac.android.gradient.c.a replaceClassLoader() {
        /*
            r14 = this;
            int r0 = setMin
            int r0 = r0 + 73
            int r1 = r0 % 128
            setMax = r1
            r1 = 2
            int r0 = r0 % r1
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r0 = r14.h     // Catch:{ Exception -> 0x0137 }
            int r0 = r0.resultCode     // Catch:{ Exception -> 0x0137 }
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x0026
            int r0 = setMax
            int r0 = r0 + 97
            int r5 = r0 % 128
            setMin = r5
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x001f
            r3 = 1
        L_0x001f:
            if (r3 == r2) goto L_0x0022
            return r14
        L_0x0022:
            int r0 = r4.length     // Catch:{ all -> 0x0024 }
            return r14
        L_0x0024:
            r0 = move-exception
            throw r0
        L_0x0026:
            long r5 = java.lang.System.currentTimeMillis()
            android.content.Context r0 = r14.c
            dalvik.system.DexClassLoader r7 = r14.j
            java.lang.String r8 = r14.d
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ Exception -> 0x00e0, all -> 0x00db }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e0, all -> 0x00db }
            r9.<init>()     // Catch:{ Exception -> 0x00e0, all -> 0x00db }
            java.lang.String r8 = com.iap.ac.android.gradient.e.a.a((java.lang.String) r8)     // Catch:{ Exception -> 0x00e0, all -> 0x00db }
            r9.append(r8)     // Catch:{ Exception -> 0x00e0, all -> 0x00db }
            java.lang.String r8 = "classList"
            r9.append(r8)     // Catch:{ Exception -> 0x00e0, all -> 0x00db }
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x00e0, all -> 0x00db }
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ all -> 0x00d2 }
            r9[r2] = r8     // Catch:{ all -> 0x00d2 }
            r9[r3] = r0     // Catch:{ all -> 0x00d2 }
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x00d2 }
            r8 = 22
            int r0 = r0 >> r8
            int r0 = 19 - r0
            int r10 = android.view.KeyEvent.getDeadChar(r3, r3)     // Catch:{ all -> 0x00d2 }
            r11 = 56477(0xdc9d, float:7.9141E-41)
            java.lang.String r12 = ""
            int r12 = android.telephony.PhoneNumberUtils.toaFromString(r12)     // Catch:{ all -> 0x00d2 }
            int r11 = r11 - r12
            char r11 = (char) r11     // Catch:{ all -> 0x00d2 }
            java.lang.Object r0 = o.upFrom.setMax(r0, r10, r11)     // Catch:{ all -> 0x00d2 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x00d2 }
            java.lang.String r10 = "getMin"
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch:{ all -> 0x00d2 }
            java.lang.Class<android.content.res.AssetManager> r12 = android.content.res.AssetManager.class
            r11[r3] = r12     // Catch:{ all -> 0x00d2 }
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r11[r2] = r12     // Catch:{ all -> 0x00d2 }
            java.lang.reflect.Method r0 = r0.getMethod(r10, r11)     // Catch:{ all -> 0x00d2 }
            java.lang.Object r0 = r0.invoke(r4, r9)     // Catch:{ all -> 0x00d2 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ all -> 0x00d2 }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r9.<init>(r0)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
        L_0x008d:
            java.lang.String r4 = r10.readLine()     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r11 = 10
            if (r4 == 0) goto L_0x0098
            r12 = 22
            goto L_0x009a
        L_0x0098:
            r12 = 10
        L_0x009a:
            if (r12 == r11) goto L_0x00b7
            java.lang.Class r4 = r7.loadClass(r4)     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            java.lang.Class r11 = r14.getClass()     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            java.lang.ClassLoader r11 = r11.getClassLoader()     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            java.lang.Class<java.lang.Class> r12 = java.lang.Class.class
            java.lang.String r13 = "classLoader"
            java.lang.reflect.Field r12 = r12.getDeclaredField(r13)     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r12.setAccessible(r2)     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r12.set(r4, r11)     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            goto L_0x008d
        L_0x00b7:
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r10)
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r9)
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r0)
            goto L_0x00f0
        L_0x00c1:
            r1 = move-exception
        L_0x00c2:
            r4 = r9
            goto L_0x012b
        L_0x00c5:
            r2 = move-exception
            goto L_0x00cc
        L_0x00c7:
            r1 = move-exception
            r10 = r4
            goto L_0x00c2
        L_0x00ca:
            r2 = move-exception
            r10 = r4
        L_0x00cc:
            r4 = r9
            goto L_0x00e4
        L_0x00ce:
            r1 = move-exception
            goto L_0x00de
        L_0x00d0:
            r2 = move-exception
            goto L_0x00e3
        L_0x00d2:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ Exception -> 0x00e0, all -> 0x00db }
            if (r2 == 0) goto L_0x00da
            throw r2     // Catch:{ Exception -> 0x00e0, all -> 0x00db }
        L_0x00da:
            throw r0     // Catch:{ Exception -> 0x00e0, all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            r1 = r0
            r0 = r4
        L_0x00de:
            r10 = r4
            goto L_0x012b
        L_0x00e0:
            r0 = move-exception
            r2 = r0
            r0 = r4
        L_0x00e3:
            r10 = r4
        L_0x00e4:
            r14.l = r2     // Catch:{ all -> 0x012a }
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r10)
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r4)
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r0)
            r2 = 0
        L_0x00f0:
            r0 = 98
            if (r2 != 0) goto L_0x00f7
            r2 = 34
            goto L_0x00f9
        L_0x00f7:
            r2 = 98
        L_0x00f9:
            if (r2 == r0) goto L_0x0103
            com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult r0 = r14.h
            r0.success = r3
            r2 = 1003(0x3eb, float:1.406E-42)
            r0.resultCode = r2
        L_0x0103:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r14.m
            r0.append(r4)
            java.lang.String r4 = "|cost6:"
            r0.append(r4)
            long r2 = r2 - r5
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r14.m = r0
            int r0 = setMin
            int r0 = r0 + 113
            int r2 = r0 % 128
            setMax = r2
            int r0 = r0 % r1
            return r14
        L_0x012a:
            r1 = move-exception
        L_0x012b:
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r10)     // Catch:{ Exception -> 0x0135 }
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r4)     // Catch:{ Exception -> 0x0135 }
            com.iap.ac.android.gradient.e.a.a((java.io.Closeable) r0)     // Catch:{ Exception -> 0x0135 }
            throw r1     // Catch:{ Exception -> 0x0135 }
        L_0x0135:
            r0 = move-exception
            throw r0
        L_0x0137:
            r0 = move-exception
            goto L_0x013a
        L_0x0139:
            throw r0
        L_0x013a:
            goto L_0x0139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.gradient.c.a.replaceClassLoader():com.iap.ac.android.gradient.c.a");
    }
}
