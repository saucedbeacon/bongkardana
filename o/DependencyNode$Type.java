package o;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.InputStream;

public final class DependencyNode$Type implements setPivotX<InputStream> {
    private final setOnHide getMax;

    public final /* synthetic */ boolean setMax(@NonNull Object obj, @NonNull File file, @NonNull MotionHelper motionHelper) {
        return getMin((InputStream) obj, file);
    }

    public DependencyNode$Type(setOnHide setonhide) {
        this.getMax = setonhide;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e A[SYNTHETIC, Splitter:B:17:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a A[SYNTHETIC, Splitter:B:24:0x003a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean getMin(@androidx.annotation.NonNull java.io.InputStream r5, @androidx.annotation.NonNull java.io.File r6) {
        /*
            r4 = this;
            o.setOnHide r0 = r4.getMax
            java.lang.Class<byte[]> r1 = byte[].class
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r0 = r0.length(r2, r1)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0037, all -> 0x002b }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0037, all -> 0x002b }
        L_0x0013:
            int r6 = r5.read(r0)     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            r2 = -1
            if (r6 == r2) goto L_0x001e
            r3.write(r0, r1, r6)     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            goto L_0x0013
        L_0x001e:
            r3.close()     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            r1 = 1
            r3.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x003d
        L_0x0026:
            r5 = move-exception
            r2 = r3
            goto L_0x002c
        L_0x0029:
            r2 = r3
            goto L_0x0038
        L_0x002b:
            r5 = move-exception
        L_0x002c:
            if (r2 == 0) goto L_0x0031
            r2.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            o.setOnHide r6 = r4.getMax
            r6.setMin(r0)
            throw r5
        L_0x0037:
        L_0x0038:
            if (r2 == 0) goto L_0x003d
            r2.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            o.setOnHide r5 = r4.getMax
            r5.setMin(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DependencyNode$Type.getMin(java.io.InputStream, java.io.File):boolean");
    }
}
