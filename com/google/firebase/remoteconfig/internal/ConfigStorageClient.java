package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.webkit.URLUtil;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;

@AnyThread
public class ConfigStorageClient {
    private static final String JSON_STRING_ENCODING = "UTF-8";
    @GuardedBy("ConfigStorageClient.class")
    private static final Map<String, ConfigStorageClient> clientInstances = new HashMap();
    private static int length = 0;
    private static int setMax = 1;
    private static char[] setMin;
    private final Context context;
    private final String fileName;

    static void getMax() {
        setMin = new char[]{'*', 'T', 'M', '9', '2'};
    }

    static {
        getMax();
        int i = setMax + 41;
        length = i % 128;
        int i2 = i % 2;
    }

    private ConfigStorageClient(Context context2, String str) {
        try {
            this.context = context2;
            this.fileName = str;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX INFO: finally extract failed */
    public synchronized Void write(ConfigContainer configContainer) throws IOException {
        int i = length + 117;
        setMax = i % 128;
        int i2 = i % 2;
        FileOutputStream openFileOutput = this.context.openFileOutput(this.fileName, 0);
        try {
            openFileOutput.write(configContainer.toString().getBytes(getMax(new int[]{0, 5, 0, 0}, new byte[]{1, 1, 0, 1, 1}, !URLUtil.isDataUrl("data:")).intern()));
            openFileOutput.close();
            int i3 = setMax + 125;
            length = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            openFileOutput.close();
            throw th;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[SYNTHETIC, Splitter:B:20:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072 A[Catch:{ FileNotFoundException | JSONException -> 0x006f, all -> 0x0066 }] */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.firebase.remoteconfig.internal.ConfigContainer read() throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            r1 = 3
            r2 = 2
            android.content.Context r3 = r11.context     // Catch:{ FileNotFoundException | JSONException -> 0x006f, all -> 0x0066 }
            java.lang.String r4 = r11.fileName     // Catch:{ FileNotFoundException | JSONException -> 0x006f, all -> 0x0066 }
            java.io.FileInputStream r3 = r3.openFileInput(r4)     // Catch:{ FileNotFoundException | JSONException -> 0x006f, all -> 0x0066 }
            int r4 = r3.available()     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            byte[] r5 = new byte[r4]     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r6 = 0
            r3.read(r5, r6, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            java.lang.String r4 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r7 = 4
            int[] r8 = new int[r7]     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r8[r6] = r6     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r9 = 5
            r10 = 1
            r8[r10] = r9     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r8[r2] = r6     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r8[r1] = r6     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            byte[] r9 = new byte[r9]     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r9[r6] = r10     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r9[r10] = r10     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r9[r2] = r6     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r9[r1] = r10     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r9[r7] = r10     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            boolean r6 = android.graphics.PixelFormat.formatHasAlpha(r6)     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            java.lang.String r6 = getMax(r8, r9, r6)     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            java.lang.String r6 = r6.intern()     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r4.<init>(r5, r6)     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r5.<init>(r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            com.google.firebase.remoteconfig.internal.ConfigContainer r0 = com.google.firebase.remoteconfig.internal.ConfigContainer.copyOf(r5)     // Catch:{ FileNotFoundException | JSONException -> 0x0064, all -> 0x0062 }
            r1 = 99
            if (r3 == 0) goto L_0x0050
            r4 = 74
            goto L_0x0052
        L_0x0050:
            r4 = 99
        L_0x0052:
            if (r4 == r1) goto L_0x0060
            int r1 = setMax     // Catch:{ all -> 0x007e }
            int r1 = r1 + 93
            int r4 = r1 % 128
            length = r4     // Catch:{ all -> 0x007e }
            int r1 = r1 % r2
            r3.close()     // Catch:{ all -> 0x007e }
        L_0x0060:
            monitor-exit(r11)
            return r0
        L_0x0062:
            r0 = move-exception
            goto L_0x0069
        L_0x0064:
            goto L_0x0070
        L_0x0066:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L_0x0069:
            if (r3 == 0) goto L_0x006e
            r3.close()     // Catch:{ all -> 0x007e }
        L_0x006e:
            throw r0     // Catch:{ all -> 0x007e }
        L_0x006f:
            r3 = r0
        L_0x0070:
            if (r3 == 0) goto L_0x0081
            r3.close()     // Catch:{ all -> 0x007e }
            int r3 = setMax     // Catch:{ all -> 0x007e }
            int r3 = r3 + r1
            int r1 = r3 % 128
            length = r1     // Catch:{ all -> 0x007e }
            int r3 = r3 % r2
            goto L_0x0081
        L_0x007e:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x0081:
            monitor-exit(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigStorageClient.read():com.google.firebase.remoteconfig.internal.ConfigContainer");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Void] */
    public synchronized Void clear() {
        ? r2;
        int i = length + 21;
        setMax = i % 128;
        r2 = 0;
        if ((i % 2 == 0 ? 'P' : Typography.quote) != 'P') {
            try {
                this.context.deleteFile(this.fileName);
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            this.context.deleteFile(this.fileName);
            int length2 = r2.length;
        }
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0022, code lost:
        if (r1 == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002d, code lost:
        if (clientInstances.containsKey(r5) == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.google.firebase.remoteconfig.internal.ConfigStorageClient getInstance(android.content.Context r4, java.lang.String r5) {
        /*
            java.lang.Class<com.google.firebase.remoteconfig.internal.ConfigStorageClient> r0 = com.google.firebase.remoteconfig.internal.ConfigStorageClient.class
            monitor-enter(r0)
            int r1 = length     // Catch:{ Exception -> 0x005f }
            int r1 = r1 + 29
            int r2 = r1 % 128
            setMax = r2     // Catch:{ Exception -> 0x005b }
            int r1 = r1 % 2
            r2 = 55
            if (r1 != 0) goto L_0x0014
            r1 = 62
            goto L_0x0016
        L_0x0014:
            r1 = 55
        L_0x0016:
            r3 = 0
            if (r1 == r2) goto L_0x0027
            java.util.Map<java.lang.String, com.google.firebase.remoteconfig.internal.ConfigStorageClient> r1 = clientInstances     // Catch:{ all -> 0x005d }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x005d }
            super.hashCode()     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0039
            goto L_0x002f
        L_0x0025:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005d }
        L_0x0027:
            java.util.Map<java.lang.String, com.google.firebase.remoteconfig.internal.ConfigStorageClient> r1 = clientInstances     // Catch:{ all -> 0x005d }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x005d }
            if (r1 != 0) goto L_0x0039
        L_0x002f:
            java.util.Map<java.lang.String, com.google.firebase.remoteconfig.internal.ConfigStorageClient> r1 = clientInstances     // Catch:{ all -> 0x005d }
            com.google.firebase.remoteconfig.internal.ConfigStorageClient r2 = new com.google.firebase.remoteconfig.internal.ConfigStorageClient     // Catch:{ all -> 0x005d }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x005d }
            r1.put(r5, r2)     // Catch:{ all -> 0x005d }
        L_0x0039:
            java.util.Map<java.lang.String, com.google.firebase.remoteconfig.internal.ConfigStorageClient> r4 = clientInstances     // Catch:{ all -> 0x005d }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x005d }
            com.google.firebase.remoteconfig.internal.ConfigStorageClient r4 = (com.google.firebase.remoteconfig.internal.ConfigStorageClient) r4     // Catch:{ all -> 0x005d }
            int r5 = setMax     // Catch:{ Exception -> 0x005b }
            int r5 = r5 + 71
            int r1 = r5 % 128
            length = r1     // Catch:{ Exception -> 0x005b }
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            if (r5 == 0) goto L_0x0059
            super.hashCode()     // Catch:{ all -> 0x0057 }
            monitor-exit(r0)
            return r4
        L_0x0057:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005d }
        L_0x0059:
            monitor-exit(r0)
            return r4
        L_0x005b:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005d }
        L_0x005d:
            r4 = move-exception
            goto L_0x0061
        L_0x005f:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005d }
        L_0x0061:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigStorageClient.getInstance(android.content.Context, java.lang.String):com.google.firebase.remoteconfig.internal.ConfigStorageClient");
    }

    @VisibleForTesting
    public static synchronized void clearInstancesForTest() {
        synchronized (ConfigStorageClient.class) {
            int i = setMax + 67;
            length = i % 128;
            if (i % 2 != 0) {
                clientInstances.clear();
                Object obj = null;
                super.hashCode();
            } else {
                clientInstances.clear();
            }
            int i2 = setMax + 1;
            length = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    /* access modifiers changed from: package-private */
    public String getFileName() {
        int i = setMax + 7;
        length = i % 128;
        if (!(i % 2 != 0)) {
            return this.fileName;
        }
        String str = this.fileName;
        Object obj = null;
        super.hashCode();
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if ((r14[r8] != 0) != true) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r14[r8] == 1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r2[r8] = (char) ((r9[r8] << 1) - r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(int[] r13, byte[] r14, boolean r15) {
        /*
            int r0 = setMax
            int r0 = r0 + 25
            int r1 = r0 % 128
            length = r1
            r1 = 2
            int r0 = r0 % r1
            r0 = 0
            r2 = r13[r0]
            r3 = 1
            r4 = r13[r3]
            r5 = r13[r1]
            r6 = 3
            r7 = r13[r6]
            char[] r8 = setMin     // Catch:{ Exception -> 0x00ca }
            char[] r9 = new char[r4]
            java.lang.System.arraycopy(r8, r2, r9, r0, r4)     // Catch:{ Exception -> 0x00ca }
            if (r14 == 0) goto L_0x0020
            r2 = 0
            goto L_0x0021
        L_0x0020:
            r2 = 1
        L_0x0021:
            if (r2 == 0) goto L_0x0024
            goto L_0x005a
        L_0x0024:
            char[] r2 = new char[r4]
            r8 = 0
            r10 = 0
        L_0x0028:
            if (r8 >= r4) goto L_0x0059
            int r11 = length     // Catch:{ Exception -> 0x00ca }
            int r11 = r11 + 17
            int r12 = r11 % 128
            setMax = r12     // Catch:{ Exception -> 0x00ca }
            int r11 = r11 % 2
            if (r11 != 0) goto L_0x0040
            byte r11 = r14[r8]
            if (r11 != 0) goto L_0x003c
            r11 = 0
            goto L_0x003d
        L_0x003c:
            r11 = 1
        L_0x003d:
            if (r11 == r3) goto L_0x004d
            goto L_0x0044
        L_0x0040:
            byte r11 = r14[r8]
            if (r11 != r3) goto L_0x004d
        L_0x0044:
            char r11 = r9[r8]
            int r11 = r11 << r3
            int r11 = r11 + r3
            int r11 = r11 - r10
            char r10 = (char) r11
            r2[r8] = r10
            goto L_0x0054
        L_0x004d:
            char r11 = r9[r8]
            int r11 = r11 << r3
            int r11 = r11 - r10
            char r10 = (char) r11
            r2[r8] = r10
        L_0x0054:
            char r10 = r2[r8]
            int r8 = r8 + 1
            goto L_0x0028
        L_0x0059:
            r9 = r2
        L_0x005a:
            r14 = 30
            if (r7 <= 0) goto L_0x0061
            r2 = 30
            goto L_0x0062
        L_0x0061:
            r2 = 2
        L_0x0062:
            if (r2 == r14) goto L_0x0065
            goto L_0x0072
        L_0x0065:
            char[] r14 = new char[r4]
            java.lang.System.arraycopy(r9, r0, r14, r0, r4)
            int r2 = r4 - r7
            java.lang.System.arraycopy(r14, r0, r9, r2, r7)
            java.lang.System.arraycopy(r14, r7, r9, r0, r2)
        L_0x0072:
            if (r15 == 0) goto L_0x008d
            int r14 = setMax
            int r14 = r14 + 87
            int r15 = r14 % 128
            length = r15
            int r14 = r14 % r1
            char[] r14 = new char[r4]
            r15 = 0
        L_0x0080:
            if (r15 >= r4) goto L_0x008c
            int r2 = r4 - r15
            int r2 = r2 - r3
            char r2 = r9[r2]
            r14[r15] = r2
            int r15 = r15 + 1
            goto L_0x0080
        L_0x008c:
            r9 = r14
        L_0x008d:
            r14 = 23
            if (r5 <= 0) goto L_0x0094
            r15 = 20
            goto L_0x0096
        L_0x0094:
            r15 = 23
        L_0x0096:
            if (r15 == r14) goto L_0x00c4
            int r14 = setMax
            int r14 = r14 + 61
            int r15 = r14 % 128
            length = r15
            int r14 = r14 % r1
        L_0x00a1:
            if (r0 >= r4) goto L_0x00c4
            int r14 = length
            int r14 = r14 + 59
            int r15 = r14 % 128
            setMax = r15
            int r14 = r14 % r1
            if (r14 != 0) goto L_0x00b9
            char r14 = r9[r0]
            r15 = r13[r6]
            int r14 = r14 >>> r15
            char r14 = (char) r14
            r9[r0] = r14
            int r0 = r0 + 3
            goto L_0x00a1
        L_0x00b9:
            char r14 = r9[r0]
            r15 = r13[r1]
            int r14 = r14 - r15
            char r14 = (char) r14
            r9[r0] = r14
            int r0 = r0 + 1
            goto L_0x00a1
        L_0x00c4:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r9)
            return r13
        L_0x00ca:
            r13 = move-exception
            goto L_0x00cd
        L_0x00cc:
            throw r13
        L_0x00cd:
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigStorageClient.getMax(int[], byte[], boolean):java.lang.String");
    }
}
