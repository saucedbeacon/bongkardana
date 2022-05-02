package o;

import java.io.File;
import java.io.IOException;
import o.setHorizontalAlign;

public final class access$300 implements getConstraintSetNames {
    private final access$800 getMax;
    private final long getMin;
    private final File length;
    private setHorizontalAlign setMax;
    private final lookUpConstraintId setMin = new lookUpConstraintId();

    @Deprecated
    access$300(File file, long j) {
        this.length = file;
        this.getMin = j;
        this.getMax = new access$800();
    }

    private synchronized setHorizontalAlign length() throws IOException {
        if (this.setMax == null) {
            this.setMax = setHorizontalAlign.getMin(this.length, this.getMin);
        }
        return this.setMax;
    }

    public final File getMin(setPivotY setpivoty) {
        try {
            setHorizontalAlign.setMin min = length().setMin(this.getMax.setMax(setpivoty));
            if (min != null) {
                return min.getMax[0];
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        if (r0.length == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0.setMin.setMax(r0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        r4.setMin.getMin(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0066 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077 A[ExcHandler: all (r6v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:9:0x002a] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:32:0x0066=Splitter:B:32:0x0066} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(o.setPivotY r5, o.getConstraintSetNames.setMax r6) {
        /*
            r4 = this;
            o.access$800 r0 = r4.getMax
            java.lang.String r5 = r0.setMax(r5)
            o.lookUpConstraintId r0 = r4.setMin
            monitor-enter(r0)
            java.util.Map<java.lang.String, o.lookUpConstraintId$getMax> r1 = r0.setMax     // Catch:{ all -> 0x007e }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x007e }
            o.lookUpConstraintId$getMax r1 = (o.lookUpConstraintId.getMax) r1     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x001e
            o.lookUpConstraintId$setMin r1 = r0.getMin     // Catch:{ all -> 0x007e }
            o.lookUpConstraintId$getMax r1 = r1.length()     // Catch:{ all -> 0x007e }
            java.util.Map<java.lang.String, o.lookUpConstraintId$getMax> r2 = r0.setMax     // Catch:{ all -> 0x007e }
            r2.put(r5, r1)     // Catch:{ all -> 0x007e }
        L_0x001e:
            int r2 = r1.length     // Catch:{ all -> 0x007e }
            r3 = 1
            int r2 = r2 + r3
            r1.length = r2     // Catch:{ all -> 0x007e }
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            java.util.concurrent.locks.Lock r0 = r1.getMax
            r0.lock()
            o.setHorizontalAlign r0 = r4.length()     // Catch:{ IOException -> 0x0034, all -> 0x0077 }
            o.setHorizontalAlign$setMin r1 = r0.setMin((java.lang.String) r5)     // Catch:{ IOException -> 0x0034, all -> 0x0077 }
            if (r1 == 0) goto L_0x003a
        L_0x0034:
            o.lookUpConstraintId r6 = r4.setMin
            r6.getMin(r5)
            return
        L_0x003a:
            o.setHorizontalAlign$getMax r0 = r0.getMax(r5)     // Catch:{ IOException -> 0x0034, all -> 0x0077 }
            if (r0 == 0) goto L_0x0067
            r1 = 0
            java.io.File r2 = r0.setMin()     // Catch:{ all -> 0x005c }
            boolean r6 = r6.getMin(r2)     // Catch:{ all -> 0x005c }
            if (r6 == 0) goto L_0x0052
            o.setHorizontalAlign r6 = o.setHorizontalAlign.this     // Catch:{ all -> 0x005c }
            r6.setMax(r0, r3)     // Catch:{ all -> 0x005c }
            r0.length = r3     // Catch:{ all -> 0x005c }
        L_0x0052:
            boolean r6 = r0.length     // Catch:{ IOException -> 0x0034, all -> 0x0077 }
            if (r6 != 0) goto L_0x0034
            o.setHorizontalAlign r6 = o.setHorizontalAlign.this     // Catch:{ IOException -> 0x0034, all -> 0x0077 }
            r6.setMax(r0, r1)     // Catch:{ IOException -> 0x0034, all -> 0x0077 }
            goto L_0x0034
        L_0x005c:
            r6 = move-exception
            boolean r2 = r0.length     // Catch:{ IOException -> 0x0034, all -> 0x0077 }
            if (r2 != 0) goto L_0x0066
            o.setHorizontalAlign r2 = o.setHorizontalAlign.this     // Catch:{ IOException -> 0x0066, all -> 0x0077 }
            r2.setMax(r0, r1)     // Catch:{ IOException -> 0x0066, all -> 0x0077 }
        L_0x0066:
            throw r6     // Catch:{ IOException -> 0x0034, all -> 0x0077 }
        L_0x0067:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0034, all -> 0x0077 }
            java.lang.String r0 = "Had two simultaneous puts for: "
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0034, all -> 0x0077 }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException -> 0x0034, all -> 0x0077 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0034, all -> 0x0077 }
            throw r6     // Catch:{ IOException -> 0x0034, all -> 0x0077 }
        L_0x0077:
            r6 = move-exception
            o.lookUpConstraintId r0 = r4.setMin
            r0.getMin(r5)
            throw r6
        L_0x007e:
            r5 = move-exception
            monitor-exit(r0)
            goto L_0x0082
        L_0x0081:
            throw r5
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: o.access$300.setMin(o.setPivotY, o.getConstraintSetNames$setMax):void");
    }
}
