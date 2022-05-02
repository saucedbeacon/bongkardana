package o;

import android.content.Context;
import io.branch.referral.network.BranchRemoteInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

public final class syncCornerMarkingDataToUI extends BranchRemoteInterface {
    private startTinyAppAndCloseCurrent getMin;

    public syncCornerMarkingDataToUI(Context context) {
        this.getMin = startTinyAppAndCloseCurrent.length(context);
    }

    public final BranchRemoteInterface.setMax setMax(String str) throws BranchRemoteInterface.BranchRemoteException {
        return getMin(str, 0);
    }

    public final BranchRemoteInterface.setMax length(String str, JSONObject jSONObject) throws BranchRemoteInterface.BranchRemoteException {
        return setMin(str, jSONObject, 0);
    }

    private static String getMax(InputStream inputStream) {
        if (inputStream != null) {
            try {
                return new BufferedReader(new InputStreamReader(inputStream)).readLine();
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f7 A[SYNTHETIC, Splitter:B:60:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010f A[SYNTHETIC, Splitter:B:69:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private io.branch.referral.network.BranchRemoteInterface.setMax getMin(java.lang.String r11, int r12) throws io.branch.referral.network.BranchRemoteInterface.BranchRemoteException {
        /*
            r10 = this;
            java.lang.String r0 = "bnc_retry_interval"
            java.lang.String r1 = "?"
            java.lang.String r2 = "bnc_retry_count"
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = -113(0xffffffffffffff8f, float:NaN)
            r5 = 3
            r6 = 0
            java.lang.String r7 = "bnc_timeout"
            o.startTinyAppAndCloseCurrent r8 = o.startTinyAppAndCloseCurrent.setMin     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            android.content.SharedPreferences r8 = r8.setMax     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            r9 = 5500(0x157c, float:7.707E-42)
            int r7 = r8.getInt(r7, r9)     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            if (r7 > 0) goto L_0x001c
            r7 = 3000(0xbb8, float:4.204E-42)
        L_0x001c:
            boolean r8 = r11.contains(r1)     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            if (r8 == 0) goto L_0x0024
            java.lang.String r1 = "&"
        L_0x0024:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            r8.<init>()     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            r8.append(r11)     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            r8.append(r1)     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            java.lang.String r1 = "retryNumber="
            r8.append(r1)     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            r8.append(r12)     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            java.lang.String r1 = r8.toString()     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            java.net.URL r8 = new java.net.URL     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            r8.<init>(r1)     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            java.net.URLConnection r1 = r8.openConnection()     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            java.lang.Object r1 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r1)     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ SocketException -> 0x0117, SocketTimeoutException -> 0x00ed, IOException -> 0x00d1 }
            r1.setConnectTimeout(r7)     // Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c4 }
            r1.setReadTimeout(r7)     // Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c4 }
            int r7 = r1.getResponseCode()     // Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c4 }
            r8 = 500(0x1f4, float:7.0E-43)
            if (r7 < r8) goto L_0x007c
            o.startTinyAppAndCloseCurrent r8 = o.startTinyAppAndCloseCurrent.setMin     // Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c4 }
            android.content.SharedPreferences r8 = r8.setMax     // Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c4 }
            int r8 = r8.getInt(r2, r5)     // Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c4 }
            if (r12 >= r8) goto L_0x007c
            o.startTinyAppAndCloseCurrent r6 = o.startTinyAppAndCloseCurrent.setMin     // Catch:{ InterruptedException -> 0x0070 }
            android.content.SharedPreferences r6 = r6.setMax     // Catch:{ InterruptedException -> 0x0070 }
            int r6 = r6.getInt(r0, r3)     // Catch:{ InterruptedException -> 0x0070 }
            long r6 = (long) r6     // Catch:{ InterruptedException -> 0x0070 }
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x0070 }
        L_0x0070:
            int r12 = r12 + 1
            io.branch.referral.network.BranchRemoteInterface$setMax r11 = r10.getMin(r11, r12)     // Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c4 }
            if (r1 == 0) goto L_0x007b
            r1.disconnect()
        L_0x007b:
            return r11
        L_0x007c:
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 == r8) goto L_0x0099
            java.io.InputStream r8 = r1.getErrorStream()     // Catch:{ FileNotFoundException -> 0x00ac }
            if (r8 == 0) goto L_0x0099
            io.branch.referral.network.BranchRemoteInterface$setMax r8 = new io.branch.referral.network.BranchRemoteInterface$setMax     // Catch:{ FileNotFoundException -> 0x00ac }
            java.io.InputStream r9 = r1.getErrorStream()     // Catch:{ FileNotFoundException -> 0x00ac }
            java.lang.String r9 = getMax(r9)     // Catch:{ FileNotFoundException -> 0x00ac }
            r8.<init>(r9, r7)     // Catch:{ FileNotFoundException -> 0x00ac }
            if (r1 == 0) goto L_0x0098
            r1.disconnect()
        L_0x0098:
            return r8
        L_0x0099:
            io.branch.referral.network.BranchRemoteInterface$setMax r8 = new io.branch.referral.network.BranchRemoteInterface$setMax     // Catch:{ FileNotFoundException -> 0x00ac }
            java.io.InputStream r9 = r1.getInputStream()     // Catch:{ FileNotFoundException -> 0x00ac }
            java.lang.String r9 = getMax(r9)     // Catch:{ FileNotFoundException -> 0x00ac }
            r8.<init>(r9, r7)     // Catch:{ FileNotFoundException -> 0x00ac }
            if (r1 == 0) goto L_0x00ab
            r1.disconnect()
        L_0x00ab:
            return r8
        L_0x00ac:
            java.lang.String r8 = "A resource conflict occurred with this request "
            java.lang.String r9 = java.lang.String.valueOf(r11)     // Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r8 = r8.concat(r9)     // Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c4 }
            o.startTinyAppAndCloseCurrent.toFloatRange(r8)     // Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c4 }
            io.branch.referral.network.BranchRemoteInterface$setMax r8 = new io.branch.referral.network.BranchRemoteInterface$setMax     // Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c4 }
            r8.<init>(r6, r7)     // Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c4 }
            if (r1 == 0) goto L_0x00c3
            r1.disconnect()
        L_0x00c3:
            return r8
        L_0x00c4:
            r11 = move-exception
            r6 = r1
            goto L_0x0133
        L_0x00c7:
            r11 = move-exception
            r6 = r1
            goto L_0x00d2
        L_0x00ca:
            r6 = r1
            goto L_0x00ed
        L_0x00cc:
            r11 = move-exception
            r6 = r1
            goto L_0x0118
        L_0x00cf:
            r11 = move-exception
            goto L_0x0133
        L_0x00d1:
            r11 = move-exception
        L_0x00d2:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "Branch connect exception: "
            r12.<init>(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x00cf }
            r12.append(r11)     // Catch:{ all -> 0x00cf }
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x00cf }
            o.startTinyAppAndCloseCurrent.toFloatRange(r11)     // Catch:{ all -> 0x00cf }
            io.branch.referral.network.BranchRemoteInterface$BranchRemoteException r11 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException     // Catch:{ all -> 0x00cf }
            r11.<init>(r4)     // Catch:{ all -> 0x00cf }
            throw r11     // Catch:{ all -> 0x00cf }
        L_0x00ed:
            o.startTinyAppAndCloseCurrent r1 = o.startTinyAppAndCloseCurrent.setMin     // Catch:{ all -> 0x00cf }
            android.content.SharedPreferences r1 = r1.setMax     // Catch:{ all -> 0x00cf }
            int r1 = r1.getInt(r2, r5)     // Catch:{ all -> 0x00cf }
            if (r12 >= r1) goto L_0x010f
            o.startTinyAppAndCloseCurrent r1 = o.startTinyAppAndCloseCurrent.setMin     // Catch:{ InterruptedException -> 0x0103 }
            android.content.SharedPreferences r1 = r1.setMax     // Catch:{ InterruptedException -> 0x0103 }
            int r0 = r1.getInt(r0, r3)     // Catch:{ InterruptedException -> 0x0103 }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0103 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0103 }
        L_0x0103:
            int r12 = r12 + 1
            io.branch.referral.network.BranchRemoteInterface$setMax r11 = r10.getMin(r11, r12)     // Catch:{ all -> 0x00cf }
            if (r6 == 0) goto L_0x010e
            r6.disconnect()
        L_0x010e:
            return r11
        L_0x010f:
            io.branch.referral.network.BranchRemoteInterface$BranchRemoteException r11 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException     // Catch:{ all -> 0x00cf }
            r12 = -111(0xffffffffffffff91, float:NaN)
            r11.<init>(r12)     // Catch:{ all -> 0x00cf }
            throw r11     // Catch:{ all -> 0x00cf }
        L_0x0117:
            r11 = move-exception
        L_0x0118:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "Http connect exception: "
            r12.<init>(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x00cf }
            r12.append(r11)     // Catch:{ all -> 0x00cf }
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x00cf }
            o.startTinyAppAndCloseCurrent.toFloatRange(r11)     // Catch:{ all -> 0x00cf }
            io.branch.referral.network.BranchRemoteInterface$BranchRemoteException r11 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException     // Catch:{ all -> 0x00cf }
            r11.<init>(r4)     // Catch:{ all -> 0x00cf }
            throw r11     // Catch:{ all -> 0x00cf }
        L_0x0133:
            if (r6 == 0) goto L_0x0138
            r6.disconnect()
        L_0x0138:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.syncCornerMarkingDataToUI.getMin(java.lang.String, int):io.branch.referral.network.BranchRemoteInterface$setMax");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ea, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ec, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ed, code lost:
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ef, code lost:
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0121, code lost:
        r9.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x00e9 */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5 A[SYNTHETIC, Splitter:B:37:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d8 A[SYNTHETIC, Splitter:B:52:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e6 A[SYNTHETIC, Splitter:B:60:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ea A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:13:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), PHI: r15 
      PHI: (r15v7 int) = (r15v0 int), (r15v0 int), (r15v0 int), (r15v0 int), (r15v0 int), (r15v0 int), (r15v0 int), (r15v0 int), (r15v0 int), (r15v8 int) binds: [B:13:0x003e, B:62:0x00e9, B:63:?, B:60:0x00e6, B:61:?, B:52:0x00d8, B:53:?, B:37:0x00b5, B:38:?, B:22:0x008d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:13:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private io.branch.referral.network.BranchRemoteInterface.setMax setMin(java.lang.String r13, org.json.JSONObject r14, int r15) throws io.branch.referral.network.BranchRemoteInterface.BranchRemoteException {
        /*
            r12 = this;
            java.lang.String r0 = "application/json"
            java.lang.String r1 = "bnc_retry_interval"
            java.lang.String r2 = "bnc_retry_count"
            o.startTinyAppAndCloseCurrent r3 = o.startTinyAppAndCloseCurrent.setMin
            android.content.SharedPreferences r3 = r3.setMax
            java.lang.String r4 = "bnc_timeout"
            r5 = 5500(0x157c, float:7.707E-42)
            int r3 = r3.getInt(r4, r5)
            if (r3 > 0) goto L_0x0016
            r3 = 3000(0xbb8, float:4.204E-42)
        L_0x0016:
            java.lang.String r4 = "retryNumber"
            r14.put(r4, r15)     // Catch:{ JSONException -> 0x001b }
        L_0x001b:
            r4 = 500(0x1f4, float:7.0E-43)
            r5 = 1000(0x3e8, float:1.401E-42)
            r6 = 3
            r7 = 1
            r8 = 0
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ SocketTimeoutException -> 0x0146, IOException -> 0x0128, Exception -> 0x00f4 }
            r10 = 26
            if (r9 < r10) goto L_0x002d
            r9 = 102(0x66, float:1.43E-43)
            android.net.TrafficStats.setThreadStatsTag(r9)     // Catch:{ SocketTimeoutException -> 0x0146, IOException -> 0x0128, Exception -> 0x00f4 }
        L_0x002d:
            java.net.URL r9 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x0146, IOException -> 0x0128, Exception -> 0x00f4 }
            r9.<init>(r13)     // Catch:{ SocketTimeoutException -> 0x0146, IOException -> 0x0128, Exception -> 0x00f4 }
            java.net.URLConnection r9 = r9.openConnection()     // Catch:{ SocketTimeoutException -> 0x0146, IOException -> 0x0128, Exception -> 0x00f4 }
            java.lang.Object r9 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r9)     // Catch:{ SocketTimeoutException -> 0x0146, IOException -> 0x0128, Exception -> 0x00f4 }
            java.net.URLConnection r9 = (java.net.URLConnection) r9     // Catch:{ SocketTimeoutException -> 0x0146, IOException -> 0x0128, Exception -> 0x00f4 }
            javax.net.ssl.HttpsURLConnection r9 = (javax.net.ssl.HttpsURLConnection) r9     // Catch:{ SocketTimeoutException -> 0x0146, IOException -> 0x0128, Exception -> 0x00f4 }
            r9.setConnectTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            r9.setReadTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            r9.setDoInput(r7)     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            r9.setDoOutput(r7)     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            java.lang.String r3 = "Content-Type"
            r9.setRequestProperty(r3, r0)     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            java.lang.String r3 = "Accept"
            r9.setRequestProperty(r3, r0)     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            java.lang.String r0 = "POST"
            r9.setRequestMethod(r0)     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            java.io.OutputStream r3 = r9.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            r0.<init>(r3)     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            java.lang.String r3 = r14.toString()     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            r0.write(r3)     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            r0.flush()     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            r0.close()     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            int r0 = r9.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            if (r0 < r4) goto L_0x0097
            o.startTinyAppAndCloseCurrent r3 = o.startTinyAppAndCloseCurrent.setMin     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            android.content.SharedPreferences r3 = r3.setMax     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            int r3 = r3.getInt(r2, r6)     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            if (r15 >= r3) goto L_0x0097
            o.startTinyAppAndCloseCurrent r0 = o.startTinyAppAndCloseCurrent.setMin     // Catch:{ InterruptedException -> 0x008b }
            android.content.SharedPreferences r0 = r0.setMax     // Catch:{ InterruptedException -> 0x008b }
            int r0 = r0.getInt(r1, r5)     // Catch:{ InterruptedException -> 0x008b }
            long r10 = (long) r0     // Catch:{ InterruptedException -> 0x008b }
            java.lang.Thread.sleep(r10)     // Catch:{ InterruptedException -> 0x008b }
        L_0x008b:
            int r15 = r15 + 1
            io.branch.referral.network.BranchRemoteInterface$setMax r13 = r12.setMin(r13, r14, r15)     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
            if (r9 == 0) goto L_0x0096
            r9.disconnect()
        L_0x0096:
            return r13
        L_0x0097:
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 == r3) goto L_0x00a6
            java.io.InputStream r3 = r9.getErrorStream()     // Catch:{ FileNotFoundException -> 0x00c3, all -> 0x00c0 }
            if (r3 == 0) goto L_0x00a6
            java.io.InputStream r3 = r9.getErrorStream()     // Catch:{ FileNotFoundException -> 0x00c3, all -> 0x00c0 }
            goto L_0x00aa
        L_0x00a6:
            java.io.InputStream r3 = r9.getInputStream()     // Catch:{ FileNotFoundException -> 0x00c3, all -> 0x00c0 }
        L_0x00aa:
            io.branch.referral.network.BranchRemoteInterface$setMax r10 = new io.branch.referral.network.BranchRemoteInterface$setMax     // Catch:{ FileNotFoundException -> 0x00c4 }
            java.lang.String r11 = getMax(r3)     // Catch:{ FileNotFoundException -> 0x00c4 }
            r10.<init>(r11, r0)     // Catch:{ FileNotFoundException -> 0x00c4 }
            if (r3 == 0) goto L_0x00ba
            r3.close()     // Catch:{ IOException -> 0x00b9, SocketTimeoutException -> 0x00ef, Exception -> 0x00ea }
            goto L_0x00ba
        L_0x00b9:
        L_0x00ba:
            if (r9 == 0) goto L_0x00bf
            r9.disconnect()
        L_0x00bf:
            return r10
        L_0x00c0:
            r0 = move-exception
            r3 = r8
            goto L_0x00e4
        L_0x00c3:
            r3 = r8
        L_0x00c4:
            java.lang.String r10 = "A resource conflict occurred with this request "
            java.lang.String r11 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x00e3 }
            java.lang.String r10 = r10.concat(r11)     // Catch:{ all -> 0x00e3 }
            o.startTinyAppAndCloseCurrent.toFloatRange(r10)     // Catch:{ all -> 0x00e3 }
            io.branch.referral.network.BranchRemoteInterface$setMax r10 = new io.branch.referral.network.BranchRemoteInterface$setMax     // Catch:{ all -> 0x00e3 }
            r10.<init>(r8, r0)     // Catch:{ all -> 0x00e3 }
            if (r3 == 0) goto L_0x00dd
            r3.close()     // Catch:{ IOException -> 0x00dc, SocketTimeoutException -> 0x00ef, Exception -> 0x00ea }
            goto L_0x00dd
        L_0x00dc:
        L_0x00dd:
            if (r9 == 0) goto L_0x00e2
            r9.disconnect()
        L_0x00e2:
            return r10
        L_0x00e3:
            r0 = move-exception
        L_0x00e4:
            if (r3 == 0) goto L_0x00e9
            r3.close()     // Catch:{ IOException -> 0x00e9, SocketTimeoutException -> 0x00ef, Exception -> 0x00ea }
        L_0x00e9:
            throw r0     // Catch:{ SocketTimeoutException -> 0x00ef, IOException -> 0x00ec, Exception -> 0x00ea }
        L_0x00ea:
            r13 = move-exception
            goto L_0x00f6
        L_0x00ec:
            r13 = move-exception
            r8 = r9
            goto L_0x0129
        L_0x00ef:
            r8 = r9
            goto L_0x0146
        L_0x00f1:
            r13 = move-exception
            goto L_0x016f
        L_0x00f4:
            r13 = move-exception
            r9 = r8
        L_0x00f6:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0125 }
            java.lang.String r15 = "Exception: "
            r14.<init>(r15)     // Catch:{ all -> 0x0125 }
            java.lang.String r15 = r13.getMessage()     // Catch:{ all -> 0x0125 }
            r14.append(r15)     // Catch:{ all -> 0x0125 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0125 }
            o.startTinyAppAndCloseCurrent.toFloatRange(r14)     // Catch:{ all -> 0x0125 }
            int r14 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0125 }
            r15 = 11
            if (r14 < r15) goto L_0x011a
            boolean r13 = r13 instanceof android.os.NetworkOnMainThreadException     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x011a
            java.lang.String r13 = "Branch Error: Don't call our synchronous methods on the main thread!!!"
            o.startTinyAppAndCloseCurrent.toFloatRange(r13)     // Catch:{ all -> 0x0125 }
        L_0x011a:
            io.branch.referral.network.BranchRemoteInterface$setMax r13 = new io.branch.referral.network.BranchRemoteInterface$setMax     // Catch:{ all -> 0x0125 }
            r13.<init>(r8, r4)     // Catch:{ all -> 0x0125 }
            if (r9 == 0) goto L_0x0124
            r9.disconnect()
        L_0x0124:
            return r13
        L_0x0125:
            r13 = move-exception
            r8 = r9
            goto L_0x016f
        L_0x0128:
            r13 = move-exception
        L_0x0129:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r15 = "Http connect exception: "
            r14.<init>(r15)     // Catch:{ all -> 0x00f1 }
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x00f1 }
            r14.append(r13)     // Catch:{ all -> 0x00f1 }
            java.lang.String r13 = r14.toString()     // Catch:{ all -> 0x00f1 }
            o.startTinyAppAndCloseCurrent.toFloatRange(r13)     // Catch:{ all -> 0x00f1 }
            io.branch.referral.network.BranchRemoteInterface$BranchRemoteException r13 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException     // Catch:{ all -> 0x00f1 }
            r14 = -113(0xffffffffffffff8f, float:NaN)
            r13.<init>(r14)     // Catch:{ all -> 0x00f1 }
            throw r13     // Catch:{ all -> 0x00f1 }
        L_0x0146:
            o.startTinyAppAndCloseCurrent r0 = o.startTinyAppAndCloseCurrent.setMin     // Catch:{ all -> 0x00f1 }
            android.content.SharedPreferences r0 = r0.setMax     // Catch:{ all -> 0x00f1 }
            int r0 = r0.getInt(r2, r6)     // Catch:{ all -> 0x00f1 }
            if (r15 >= r0) goto L_0x0167
            o.startTinyAppAndCloseCurrent r0 = o.startTinyAppAndCloseCurrent.setMin     // Catch:{ InterruptedException -> 0x015c }
            android.content.SharedPreferences r0 = r0.setMax     // Catch:{ InterruptedException -> 0x015c }
            int r0 = r0.getInt(r1, r5)     // Catch:{ InterruptedException -> 0x015c }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x015c }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x015c }
        L_0x015c:
            int r15 = r15 + r7
            io.branch.referral.network.BranchRemoteInterface$setMax r13 = r12.setMin(r13, r14, r15)     // Catch:{ all -> 0x00f1 }
            if (r8 == 0) goto L_0x0166
            r8.disconnect()
        L_0x0166:
            return r13
        L_0x0167:
            io.branch.referral.network.BranchRemoteInterface$BranchRemoteException r13 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException     // Catch:{ all -> 0x00f1 }
            r14 = -111(0xffffffffffffff91, float:NaN)
            r13.<init>(r14)     // Catch:{ all -> 0x00f1 }
            throw r13     // Catch:{ all -> 0x00f1 }
        L_0x016f:
            if (r8 == 0) goto L_0x0174
            r8.disconnect()
        L_0x0174:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.syncCornerMarkingDataToUI.setMin(java.lang.String, org.json.JSONObject, int):io.branch.referral.network.BranchRemoteInterface$setMax");
    }
}
