package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

final class onReset {
    private final String getMax;
    private final Context setMax;

    enum setMax {
        SUCCESS,
        FAILURE
    }

    onReset(Context context, String str) {
        this.setMax = context;
        this.getMax = str;
    }

    @SuppressLint({"NewApi"})
    private boolean setMin() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.setMax.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 29) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cf, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00de, code lost:
        if (r3 == null) goto L_0x00ec;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00d7 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00db A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.reset getMin(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7.setMin()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            o.reset r8 = new o.reset
            o.onReset$setMax r0 = o.onReset.setMax.FAILURE
            r8.<init>(r0, r1)
            return r8
        L_0x0010:
            o.onReset$setMax r0 = o.onReset.setMax.SUCCESS
            java.lang.String r2 = r7.getMax
            if (r2 == 0) goto L_0x00ea
            byte[] r8 = r8.getBytes()
            int r2 = r8.length
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00dc, IOException -> 0x00d7 }
            java.lang.String r5 = r7.getMax     // Catch:{ MalformedURLException -> 0x00dc, IOException -> 0x00d7 }
            r4.<init>(r5)     // Catch:{ MalformedURLException -> 0x00dc, IOException -> 0x00d7 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ MalformedURLException -> 0x00dc, IOException -> 0x00d7 }
            java.lang.Object r4 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r4)     // Catch:{ MalformedURLException -> 0x00dc, IOException -> 0x00d7 }
            java.net.URLConnection r4 = (java.net.URLConnection) r4     // Catch:{ MalformedURLException -> 0x00dc, IOException -> 0x00d7 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ MalformedURLException -> 0x00dc, IOException -> 0x00d7 }
            r3 = 1
            r4.setDoOutput(r3)     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            r4.setFixedLengthStreamingMode(r2)     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json; charset=utf-8"
            r4.setRequestProperty(r2, r3)     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            r4.connect()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            java.io.OutputStream r2 = r4.getOutputStream()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            r2.write(r8)     // Catch:{ all -> 0x00c9 }
            r2.close()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            r4.getResponseCode()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            r4.getResponseMessage()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            java.util.Map r8 = r4.getHeaderFields()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            java.util.Set r8 = r8.entrySet()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
        L_0x005c:
            boolean r2 = r8.hasNext()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r8.next()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            java.lang.Object r3 = r2.getKey()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            if (r3 == 0) goto L_0x005c
            r2.getKey()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            java.lang.Object r2 = r2.getValue()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            java.util.List r2 = (java.util.List) r2     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            boolean r3 = r2.hasNext()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            if (r3 == 0) goto L_0x005c
            r2.next()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
        L_0x0084:
            boolean r3 = r2.hasNext()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            if (r3 == 0) goto L_0x005c
            r2.next()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            goto L_0x0084
        L_0x008e:
            java.lang.String r8 = "Content-Length"
            r2 = 0
            int r8 = r4.getHeaderFieldInt(r8, r2)     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            byte[] r2 = new byte[r8]     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            r3 = 400(0x190, float:5.6E-43)
            if (r8 <= 0) goto L_0x00b1
            int r8 = r4.getResponseCode()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            if (r8 < r3) goto L_0x00a6
            java.io.InputStream r8 = r4.getErrorStream()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            goto L_0x00aa
        L_0x00a6:
            java.io.InputStream r8 = r4.getInputStream()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
        L_0x00aa:
            int r5 = r8.read(r2)     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            r6 = -1
            if (r5 != r6) goto L_0x00aa
        L_0x00b1:
            java.lang.String r8 = new java.lang.String     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            r8.<init>(r2)     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            int r1 = r4.getResponseCode()     // Catch:{ MalformedURLException -> 0x00c7, IOException -> 0x00c5, all -> 0x00ce }
            if (r1 < r3) goto L_0x00be
            o.onReset$setMax r0 = o.onReset.setMax.FAILURE     // Catch:{ MalformedURLException -> 0x00c7, IOException -> 0x00c5, all -> 0x00ce }
        L_0x00be:
            if (r4 == 0) goto L_0x00c3
            r4.disconnect()
        L_0x00c3:
            r1 = r8
            goto L_0x00ec
        L_0x00c5:
            r1 = r8
            goto L_0x00d1
        L_0x00c7:
            r1 = r8
            goto L_0x00d3
        L_0x00c9:
            r8 = move-exception
            r2.close()     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
            throw r8     // Catch:{ MalformedURLException -> 0x00d3, IOException -> 0x00d1, all -> 0x00ce }
        L_0x00ce:
            r8 = move-exception
            r3 = r4
            goto L_0x00e4
        L_0x00d1:
            r3 = r4
            goto L_0x00d7
        L_0x00d3:
            r3 = r4
            goto L_0x00dc
        L_0x00d5:
            r8 = move-exception
            goto L_0x00e4
        L_0x00d7:
            o.onReset$setMax r0 = o.onReset.setMax.FAILURE     // Catch:{ all -> 0x00d5 }
            if (r3 == 0) goto L_0x00ec
            goto L_0x00e0
        L_0x00dc:
            o.onReset$setMax r0 = o.onReset.setMax.FAILURE     // Catch:{ all -> 0x00d5 }
            if (r3 == 0) goto L_0x00ec
        L_0x00e0:
            r3.disconnect()
            goto L_0x00ec
        L_0x00e4:
            if (r3 == 0) goto L_0x00e9
            r3.disconnect()
        L_0x00e9:
            throw r8
        L_0x00ea:
            o.onReset$setMax r0 = o.onReset.setMax.FAILURE
        L_0x00ec:
            o.reset r8 = new o.reset
            r8.<init>(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onReset.getMin(java.lang.String):o.reset");
    }
}
