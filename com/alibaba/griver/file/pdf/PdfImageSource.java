package com.alibaba.griver.file.pdf;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

public class PdfImageSource {

    /* renamed from: a  reason: collision with root package name */
    private List<Bitmap> f10434a = new ArrayList();
    private int b = 0;

    /* JADX WARNING: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0086 A[SYNTHETIC, Splitter:B:45:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0098 A[SYNTHETIC, Splitter:B:56:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void open(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x008a, all -> 0x0076 }
            r1.<init>(r8)     // Catch:{ Exception -> 0x008a, all -> 0x0076 }
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r8 = android.os.ParcelFileDescriptor.open(r1, r8)     // Catch:{ Exception -> 0x008a, all -> 0x0076 }
            if (r8 == 0) goto L_0x001c
            android.graphics.pdf.PdfRenderer r1 = new android.graphics.pdf.PdfRenderer     // Catch:{ Exception -> 0x0019, all -> 0x0014 }
            r1.<init>(r8)     // Catch:{ Exception -> 0x0019, all -> 0x0014 }
            goto L_0x001d
        L_0x0014:
            r1 = move-exception
            r2 = r1
            r1 = r0
            goto L_0x007a
        L_0x0019:
            r1 = r0
            goto L_0x008c
        L_0x001c:
            r1 = r0
        L_0x001d:
            int r2 = r1.getPageCount()     // Catch:{ Exception -> 0x0074, all -> 0x0072 }
            r7.b = r2     // Catch:{ Exception -> 0x0074, all -> 0x0072 }
            int r2 = r1.getPageCount()     // Catch:{ Exception -> 0x0074, all -> 0x0072 }
            if (r2 <= 0) goto L_0x0062
            int r2 = r1.getPageCount()     // Catch:{ Exception -> 0x0074, all -> 0x0072 }
            r7.b = r2     // Catch:{ Exception -> 0x0074, all -> 0x0072 }
            r2 = 0
            r3 = r0
        L_0x0031:
            int r4 = r1.getPageCount()     // Catch:{ Exception -> 0x0060, all -> 0x005c }
            if (r2 >= r4) goto L_0x005a
            if (r3 == 0) goto L_0x003c
            r3.close()     // Catch:{ Exception -> 0x0060, all -> 0x005c }
        L_0x003c:
            android.graphics.pdf.PdfRenderer$Page r3 = r1.openPage(r2)     // Catch:{ Exception -> 0x0060, all -> 0x005c }
            int r4 = r3.getWidth()     // Catch:{ Exception -> 0x0060, all -> 0x005c }
            int r5 = r3.getHeight()     // Catch:{ Exception -> 0x0060, all -> 0x005c }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0060, all -> 0x005c }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch:{ Exception -> 0x0060, all -> 0x005c }
            r5 = 1
            r3.render(r4, r0, r0, r5)     // Catch:{ Exception -> 0x0060, all -> 0x005c }
            java.util.List<android.graphics.Bitmap> r5 = r7.f10434a     // Catch:{ Exception -> 0x0060, all -> 0x005c }
            r5.add(r4)     // Catch:{ Exception -> 0x0060, all -> 0x005c }
            int r2 = r2 + 1
            goto L_0x0031
        L_0x005a:
            r0 = r3
            goto L_0x0062
        L_0x005c:
            r0 = move-exception
            r2 = r0
            r0 = r3
            goto L_0x007a
        L_0x0060:
            r0 = r3
            goto L_0x008c
        L_0x0062:
            if (r0 == 0) goto L_0x0067
            r0.close()
        L_0x0067:
            if (r1 == 0) goto L_0x006c
            r1.close()
        L_0x006c:
            if (r8 == 0) goto L_0x009b
            r8.close()     // Catch:{ IOException -> 0x0071 }
        L_0x0071:
            return
        L_0x0072:
            r2 = move-exception
            goto L_0x007a
        L_0x0074:
            goto L_0x008c
        L_0x0076:
            r1 = move-exception
            r8 = r0
            r2 = r1
            r1 = r8
        L_0x007a:
            if (r0 == 0) goto L_0x007f
            r0.close()
        L_0x007f:
            if (r1 == 0) goto L_0x0084
            r1.close()
        L_0x0084:
            if (r8 == 0) goto L_0x0089
            r8.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            throw r2
        L_0x008a:
            r8 = r0
            r1 = r8
        L_0x008c:
            if (r0 == 0) goto L_0x0091
            r0.close()
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r1.close()
        L_0x0096:
            if (r8 == 0) goto L_0x009b
            r8.close()     // Catch:{ IOException -> 0x009b }
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.file.pdf.PdfImageSource.open(java.lang.String):void");
    }

    public int getTotalCount() {
        return this.b;
    }

    public Bitmap getItem(int i) {
        if (i >= 0 && i < this.b && !this.f10434a.isEmpty()) {
            return this.f10434a.get(i);
        }
        return null;
    }

    public synchronized void close() {
        for (Bitmap next : this.f10434a) {
            if (!next.isRecycled()) {
                next.recycle();
            }
        }
        this.f10434a.clear();
    }
}
