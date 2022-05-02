package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

@WorkerThread
final class zzer implements Runnable {
    final /* synthetic */ zzes zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzep zzd;
    private final String zze;
    private final Map<String, String> zzf;

    public zzer(zzes zzes, String str, URL url, byte[] bArr, Map<String, String> map, zzep zzep) {
        this.zza = zzes;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzep);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzep;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d3 A[SYNTHETIC, Splitter:B:44:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f1 A[SYNTHETIC, Splitter:B:64:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0131 A[SYNTHETIC, Splitter:B:77:0x0131] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.zzes r1 = r13.zza
            r1.zzaw()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.zzes r3 = r13.zza     // Catch:{ IOException -> 0x0129, all -> 0x00ea }
            java.net.URL r4 = r13.zzb     // Catch:{ IOException -> 0x0129, all -> 0x00ea }
            java.net.HttpURLConnection r3 = r3.zzc(r4)     // Catch:{ IOException -> 0x0129, all -> 0x00ea }
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.zzf     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            if (r4 == 0) goto L_0x0039
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
        L_0x001d:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            if (r5 == 0) goto L_0x0039
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            goto L_0x001d
        L_0x0039:
            byte[] r4 = r13.zzc     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            if (r4 == 0) goto L_0x0088
            com.google.android.gms.measurement.internal.zzes r4 = r13.zza     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            com.google.android.gms.measurement.internal.zzkn r4 = r4.zzf     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            com.google.android.gms.measurement.internal.zzkp r4 = r4.zzm()     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            byte[] r5 = r13.zzc     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            byte[] r4 = r4.zzs(r5)     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            com.google.android.gms.measurement.internal.zzes r5 = r13.zza     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            com.google.android.gms.measurement.internal.zzfu r5 = r5.zzs     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            com.google.android.gms.measurement.internal.zzem r5 = r5.zzau()     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            com.google.android.gms.measurement.internal.zzek r5 = r5.zzk()     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            int r6 = r4.length     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            java.lang.String r7 = "Uploading data. size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            r5.zzb(r7, r8)     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r3.addRequestProperty(r5, r7)     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            r3.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            r3.connect()     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            r5.write(r4)     // Catch:{ IOException -> 0x0082, all -> 0x007d }
            r5.close()     // Catch:{ IOException -> 0x0082, all -> 0x007d }
            goto L_0x0088
        L_0x007d:
            r4 = move-exception
            r11 = r2
            r2 = r5
            goto L_0x00ee
        L_0x0082:
            r4 = move-exception
            r11 = r2
            r9 = r4
            r2 = r5
            goto L_0x012e
        L_0x0088:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00e7, all -> 0x00e4 }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00e0, all -> 0x00dd }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00cf }
            r4.<init>()     // Catch:{ all -> 0x00cf }
            java.io.InputStream r5 = r3.getInputStream()     // Catch:{ all -> 0x00cf }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00cd }
        L_0x009d:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00cd }
            if (r7 <= 0) goto L_0x00a7
            r4.write(r6, r1, r7)     // Catch:{ all -> 0x00cd }
            goto L_0x009d
        L_0x00a7:
            byte[] r10 = r4.toByteArray()     // Catch:{ all -> 0x00cd }
            if (r5 == 0) goto L_0x00b0
            r5.close()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
        L_0x00b0:
            if (r3 == 0) goto L_0x00b5
            r3.disconnect()
        L_0x00b5:
            com.google.android.gms.measurement.internal.zzes r0 = r13.zza
            com.google.android.gms.measurement.internal.zzfu r0 = r0.zzs
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzav()
            com.google.android.gms.measurement.internal.zzeq r1 = new com.google.android.gms.measurement.internal.zzeq
            java.lang.String r6 = r13.zze
            com.google.android.gms.measurement.internal.zzep r7 = r13.zzd
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x00c9:
            r0.zzh(r1)
            return
        L_0x00cd:
            r1 = move-exception
            goto L_0x00d1
        L_0x00cf:
            r1 = move-exception
            r5 = r2
        L_0x00d1:
            if (r5 == 0) goto L_0x00d6
            r5.close()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
        L_0x00d6:
            throw r1     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
        L_0x00d7:
            r1 = move-exception
            r4 = r1
            goto L_0x00ef
        L_0x00da:
            r1 = move-exception
            r4 = r1
            goto L_0x00e2
        L_0x00dd:
            r4 = move-exception
            r11 = r2
            goto L_0x00ef
        L_0x00e0:
            r4 = move-exception
            r11 = r2
        L_0x00e2:
            r9 = r4
            goto L_0x012f
        L_0x00e4:
            r4 = move-exception
            r11 = r2
            goto L_0x00ee
        L_0x00e7:
            r4 = move-exception
            r11 = r2
            goto L_0x012d
        L_0x00ea:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r11 = r3
        L_0x00ee:
            r8 = 0
        L_0x00ef:
            if (r2 == 0) goto L_0x010b
            r2.close()     // Catch:{ IOException -> 0x00f5 }
            goto L_0x010b
        L_0x00f5:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzes r2 = r13.zza
            com.google.android.gms.measurement.internal.zzfu r2 = r2.zzs
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()
            java.lang.String r5 = r13.zze
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzem.zzl(r5)
            r2.zzc(r0, r5, r1)
        L_0x010b:
            if (r3 == 0) goto L_0x0110
            r3.disconnect()
        L_0x0110:
            com.google.android.gms.measurement.internal.zzes r0 = r13.zza
            com.google.android.gms.measurement.internal.zzfu r0 = r0.zzs
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzav()
            com.google.android.gms.measurement.internal.zzeq r1 = new com.google.android.gms.measurement.internal.zzeq
            java.lang.String r6 = r13.zze
            com.google.android.gms.measurement.internal.zzep r7 = r13.zzd
            r9 = 0
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.zzh(r1)
            throw r4
        L_0x0129:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r11 = r3
        L_0x012d:
            r9 = r4
        L_0x012e:
            r8 = 0
        L_0x012f:
            if (r2 == 0) goto L_0x014b
            r2.close()     // Catch:{ IOException -> 0x0135 }
            goto L_0x014b
        L_0x0135:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzes r2 = r13.zza
            com.google.android.gms.measurement.internal.zzfu r2 = r2.zzs
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()
            java.lang.String r4 = r13.zze
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzem.zzl(r4)
            r2.zzc(r0, r4, r1)
        L_0x014b:
            if (r3 == 0) goto L_0x0150
            r3.disconnect()
        L_0x0150:
            com.google.android.gms.measurement.internal.zzes r0 = r13.zza
            com.google.android.gms.measurement.internal.zzfu r0 = r0.zzs
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzav()
            com.google.android.gms.measurement.internal.zzeq r1 = new com.google.android.gms.measurement.internal.zzeq
            java.lang.String r6 = r13.zze
            com.google.android.gms.measurement.internal.zzep r7 = r13.zzd
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzer.run():void");
    }
}
