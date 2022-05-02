package o;

import androidx.annotation.NonNull;

public class setTrackDrawable {
    @NonNull
    private final setTrackTintList getMin;
    @NonNull
    public final setTrackResource setMax;

    public setTrackDrawable(@NonNull setTrackResource settrackresource, @NonNull setTrackTintList settracktintlist) {
        this.setMax = settrackresource;
        this.getMin = settracktintlist;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6 A[Catch:{ Exception -> 0x0100, all -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010d A[SYNTHETIC, Splitter:B:50:0x010d] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0117 A[SYNTHETIC, Splitter:B:56:0x0117] */
    @androidx.annotation.WorkerThread
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.LinearLayoutCompat.DividerMode<o.setVerticalGravity> getMax(@androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.Nullable java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "LottieFetchResult close failed "
            o.setTitleMargin.getMin()
            r1 = 0
            o.setTrackTintList r2 = r6.getMin     // Catch:{ Exception -> 0x0105 }
            o.getSwitchPadding r2 = r2.setMax(r7)     // Catch:{ Exception -> 0x0105 }
            boolean r3 = r2.getMax()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            if (r3 == 0) goto L_0x00e7
            java.io.InputStream r3 = r2.length()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.String r4 = r2.setMax()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            if (r4 != 0) goto L_0x001e
            java.lang.String r4 = "application/json"
        L_0x001e:
            java.lang.String r5 = "application/zip"
            boolean r4 = r4.contains(r5)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            if (r4 != 0) goto L_0x005f
            java.lang.String r4 = "\\?"
            java.lang.String[] r4 = r7.split(r4)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r5 = 0
            r4 = r4[r5]     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.String r5 = ".lottie"
            boolean r4 = r4.endsWith(r5)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            if (r4 == 0) goto L_0x0038
            goto L_0x005f
        L_0x0038:
            o.setTitleMargin.getMin()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            com.airbnb.lottie.network.FileExtension r4 = com.airbnb.lottie.network.FileExtension.JSON     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            if (r8 != 0) goto L_0x0044
            o.LinearLayoutCompat$DividerMode r1 = o.getOrientation.length((java.io.InputStream) r3, (java.lang.String) r1)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            goto L_0x0086
        L_0x0044:
            o.setTrackResource r1 = r6.setMax     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            com.airbnb.lottie.network.FileExtension r5 = com.airbnb.lottie.network.FileExtension.JSON     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.io.File r1 = r1.setMax((java.lang.String) r7, (java.io.InputStream) r3, (com.airbnb.lottie.network.FileExtension) r5)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            o.LinearLayoutCompat$DividerMode r1 = o.getOrientation.length((java.io.InputStream) r3, (java.lang.String) r7)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            goto L_0x0086
        L_0x005f:
            o.setTitleMargin.getMin()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            com.airbnb.lottie.network.FileExtension r4 = com.airbnb.lottie.network.FileExtension.ZIP     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            if (r8 != 0) goto L_0x0070
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            o.LinearLayoutCompat$DividerMode r1 = o.getOrientation.length((java.util.zip.ZipInputStream) r5, (java.lang.String) r1)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            goto L_0x0086
        L_0x0070:
            o.setTrackResource r1 = r6.setMax     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            com.airbnb.lottie.network.FileExtension r5 = com.airbnb.lottie.network.FileExtension.ZIP     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.io.File r1 = r1.setMax((java.lang.String) r7, (java.io.InputStream) r3, (com.airbnb.lottie.network.FileExtension) r5)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            o.LinearLayoutCompat$DividerMode r1 = o.getOrientation.length((java.util.zip.ZipInputStream) r3, (java.lang.String) r7)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
        L_0x0086:
            if (r8 == 0) goto L_0x00dc
            V r8 = r1.length     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            if (r8 == 0) goto L_0x00dc
            o.setTrackResource r8 = r6.setMax     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r3 = 1
            java.lang.String r7 = o.setTrackResource.setMax((java.lang.String) r7, (com.airbnb.lottie.network.FileExtension) r4, (boolean) r3)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.io.File r8 = r8.getMin()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r3.<init>(r8, r7)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.String r7 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.String r8 = ".temp"
            java.lang.String r4 = ""
            java.lang.String r7 = r7.replace(r8, r4)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r8.<init>(r7)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            boolean r7 = r3.renameTo(r8)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            o.setTitleMargin.getMin()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            if (r7 != 0) goto L_0x00dc
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.String r4 = "Unable to rename cache file "
            r7.<init>(r4)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r7.append(r3)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.String r3 = " to "
            r7.append(r3)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.String r8 = r8.getAbsolutePath()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r7.append(r8)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.String r8 = "."
            r7.append(r8)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            o.setTitleMargin.setMax(r7)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
        L_0x00dc:
            o.setTitleMargin.getMin()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r2.close()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00e6
        L_0x00e3:
            o.setTitleMargin.setMin(r0)
        L_0x00e6:
            return r1
        L_0x00e7:
            o.LinearLayoutCompat$DividerMode r7 = new o.LinearLayoutCompat$DividerMode     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.String r1 = r2.getMin()     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r8.<init>(r1)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r7.<init>((java.lang.Throwable) r8)     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            r2.close()     // Catch:{ IOException -> 0x00f9 }
            goto L_0x00fc
        L_0x00f9:
            o.setTitleMargin.setMin(r0)
        L_0x00fc:
            return r7
        L_0x00fd:
            r7 = move-exception
            r1 = r2
            goto L_0x0115
        L_0x0100:
            r7 = move-exception
            r1 = r2
            goto L_0x0106
        L_0x0103:
            r7 = move-exception
            goto L_0x0115
        L_0x0105:
            r7 = move-exception
        L_0x0106:
            o.LinearLayoutCompat$DividerMode r8 = new o.LinearLayoutCompat$DividerMode     // Catch:{ all -> 0x0103 }
            r8.<init>((java.lang.Throwable) r7)     // Catch:{ all -> 0x0103 }
            if (r1 == 0) goto L_0x0114
            r1.close()     // Catch:{ IOException -> 0x0111 }
            goto L_0x0114
        L_0x0111:
            o.setTitleMargin.setMin(r0)
        L_0x0114:
            return r8
        L_0x0115:
            if (r1 == 0) goto L_0x011e
            r1.close()     // Catch:{ IOException -> 0x011b }
            goto L_0x011e
        L_0x011b:
            o.setTitleMargin.setMin(r0)
        L_0x011e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTrackDrawable.getMax(java.lang.String, java.lang.String):o.LinearLayoutCompat$DividerMode");
    }
}
