package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.List;
import java.util.Map;

@WorkerThread
final class zzhz implements Runnable {
    final /* synthetic */ zzia zza;
    private final URL zzb;
    private final String zzc;
    private final zzfs zzd;

    public zzhz(zzia zzia, String str, URL url, byte[] bArr, Map map, zzfs zzfs, byte[] bArr2) {
        this.zza = zzia;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfs);
        this.zzb = url;
        this.zzd = zzfs;
        this.zzc = str;
    }

    private final void zzb(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.zza.zzs.zzav().zzh(new zzhy(this, i, exc, bArr, map));
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0046 A[SYNTHETIC, Splitter:B:27:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.zzia r0 = r9.zza
            r0.zzaw()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.zzia r2 = r9.zza     // Catch:{ IOException -> 0x006c, all -> 0x005e }
            java.net.URL r3 = r9.zzb     // Catch:{ IOException -> 0x006c, all -> 0x005e }
            java.net.HttpURLConnection r2 = r2.zzd(r3)     // Catch:{ IOException -> 0x006c, all -> 0x005e }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x0059, all -> 0x0054 }
            java.util.Map r4 = r2.getHeaderFields()     // Catch:{ IOException -> 0x0051, all -> 0x004e }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0042 }
            r5.<init>()     // Catch:{ all -> 0x0042 }
            java.io.InputStream r6 = r2.getInputStream()     // Catch:{ all -> 0x0042 }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0040 }
        L_0x0024:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x0040 }
            if (r8 <= 0) goto L_0x002e
            r5.write(r7, r0, r8)     // Catch:{ all -> 0x0040 }
            goto L_0x0024
        L_0x002e:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x0040 }
            if (r6 == 0) goto L_0x0037
            r6.close()     // Catch:{ IOException -> 0x004c, all -> 0x004a }
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.disconnect()
        L_0x003c:
            r9.zzb(r3, r1, r0, r4)
            return
        L_0x0040:
            r0 = move-exception
            goto L_0x0044
        L_0x0042:
            r0 = move-exception
            r6 = r1
        L_0x0044:
            if (r6 == 0) goto L_0x0049
            r6.close()     // Catch:{ IOException -> 0x004c, all -> 0x004a }
        L_0x0049:
            throw r0     // Catch:{ IOException -> 0x004c, all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            goto L_0x0063
        L_0x004c:
            r0 = move-exception
            goto L_0x0071
        L_0x004e:
            r0 = move-exception
            r4 = r1
            goto L_0x0063
        L_0x0051:
            r0 = move-exception
            r4 = r1
            goto L_0x0071
        L_0x0054:
            r3 = move-exception
            r4 = r1
            r0 = r3
            r3 = 0
            goto L_0x0063
        L_0x0059:
            r3 = move-exception
            r4 = r1
            r0 = r3
            r3 = 0
            goto L_0x0071
        L_0x005e:
            r2 = move-exception
            r4 = r1
            r0 = r2
            r3 = 0
            r2 = r4
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.disconnect()
        L_0x0068:
            r9.zzb(r3, r1, r1, r4)
            throw r0
        L_0x006c:
            r2 = move-exception
            r4 = r1
            r0 = r2
            r3 = 0
            r2 = r4
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r2.disconnect()
        L_0x0076:
            r9.zzb(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhz.run():void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, Exception exc, byte[] bArr, Map map) {
        this.zzd.zza(this.zzc, i, exc, bArr, map);
    }
}
