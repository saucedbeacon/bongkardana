package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o.initCloseCode;

public final class PublicSuffixDatabase {
    private static final String[] getMax = {"*"};
    private static final byte[] getMin = {42};
    private static final PublicSuffixDatabase length = new PublicSuffixDatabase();
    private static final String[] setMax = new String[0];
    private byte[] equals;
    private byte[] isInside;
    private final AtomicBoolean setMin = new AtomicBoolean(false);
    private final CountDownLatch toFloatRange = new CountDownLatch(1);

    public static PublicSuffixDatabase length() {
        return length;
    }

    public final String setMax(String str) {
        int i;
        int i2;
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] min = getMin(split);
            if (split.length == min.length && min[0].charAt(0) != '!') {
                return null;
            }
            if (min[0].charAt(0) == '!') {
                i2 = split.length;
                i = min.length;
            } else {
                i2 = split.length;
                i = min.length + 1;
            }
            StringBuilder sb = new StringBuilder();
            String[] split2 = str.split("\\.");
            for (int i3 = i2 - i; i3 < split2.length; i3++) {
                sb.append(split2[i3]);
                sb.append('.');
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new NullPointerException("domain == null");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private java.lang.String[] getMin(java.lang.String[] r9) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.setMin
            boolean r0 = r0.get()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x007c
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.setMin
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x007c
            r0 = 0
        L_0x0013:
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r4 = "publicsuffixes.gz"
            java.io.InputStream r3 = r3.getResourceAsStream(r4)     // Catch:{ InterruptedIOException -> 0x006d, IOException -> 0x005f }
            if (r3 == 0) goto L_0x0053
            o.MonitorHelper r4 = new o.MonitorHelper     // Catch:{ InterruptedIOException -> 0x006d, IOException -> 0x005f }
            o.recordWsHsTime r3 = o.recordMonitorOfSndMsg.getMin((java.io.InputStream) r3)     // Catch:{ InterruptedIOException -> 0x006d, IOException -> 0x005f }
            r4.<init>(r3)     // Catch:{ InterruptedIOException -> 0x006d, IOException -> 0x005f }
            o.schedule r3 = o.recordMonitorOfSndMsg.setMin((o.recordWsHsTime) r4)     // Catch:{ InterruptedIOException -> 0x006d, IOException -> 0x005f }
            int r4 = r3.toIntRange()     // Catch:{ all -> 0x004e }
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x004e }
            r3.setMin((byte[]) r4)     // Catch:{ all -> 0x004e }
            int r5 = r3.toIntRange()     // Catch:{ all -> 0x004e }
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x004e }
            r3.setMin((byte[]) r5)     // Catch:{ all -> 0x004e }
            o.initCloseCode.getMin((java.io.Closeable) r3)     // Catch:{ InterruptedIOException -> 0x006d, IOException -> 0x005f }
            monitor-enter(r8)     // Catch:{ InterruptedIOException -> 0x006d, IOException -> 0x005f }
            r8.isInside = r4     // Catch:{ all -> 0x004b }
            r8.equals = r5     // Catch:{ all -> 0x004b }
            monitor-exit(r8)     // Catch:{ all -> 0x004b }
            java.util.concurrent.CountDownLatch r3 = r8.toFloatRange     // Catch:{ InterruptedIOException -> 0x006d, IOException -> 0x005f }
            r3.countDown()     // Catch:{ InterruptedIOException -> 0x006d, IOException -> 0x005f }
            goto L_0x0053
        L_0x004b:
            r3 = move-exception
            monitor-exit(r8)     // Catch:{ InterruptedIOException -> 0x006d, IOException -> 0x005f }
            throw r3     // Catch:{ InterruptedIOException -> 0x006d, IOException -> 0x005f }
        L_0x004e:
            r4 = move-exception
            o.initCloseCode.getMin((java.io.Closeable) r3)     // Catch:{ InterruptedIOException -> 0x006d, IOException -> 0x005f }
            throw r4     // Catch:{ InterruptedIOException -> 0x006d, IOException -> 0x005f }
        L_0x0053:
            if (r0 == 0) goto L_0x0089
        L_0x0055:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0089
        L_0x005d:
            r9 = move-exception
            goto L_0x0072
        L_0x005f:
            r3 = move-exception
            o.MPaaSSCLogCatImpl r4 = o.MPaaSSCLogCatImpl.toIntRange()     // Catch:{ all -> 0x005d }
            r5 = 5
            java.lang.String r6 = "Failed to read public suffix list"
            r4.setMax((int) r5, (java.lang.String) r6, (java.lang.Throwable) r3)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0089
            goto L_0x0055
        L_0x006d:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x005d }
            r0 = 1
            goto L_0x0013
        L_0x0072:
            if (r0 == 0) goto L_0x007b
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x007b:
            throw r9
        L_0x007c:
            java.util.concurrent.CountDownLatch r0 = r8.toFloatRange     // Catch:{ InterruptedException -> 0x0082 }
            r0.await()     // Catch:{ InterruptedException -> 0x0082 }
            goto L_0x0089
        L_0x0082:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0089:
            monitor-enter(r8)
            byte[] r0 = r8.isInside     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x011b
            monitor-exit(r8)     // Catch:{ all -> 0x0123 }
            int r0 = r9.length
            byte[][] r3 = new byte[r0][]
            r4 = 0
        L_0x0093:
            int r5 = r9.length
            if (r4 >= r5) goto L_0x00a3
            r5 = r9[r4]
            java.nio.charset.Charset r6 = o.initCloseCode.setMax
            byte[] r5 = r5.getBytes(r6)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L_0x0093
        L_0x00a3:
            r9 = 0
        L_0x00a4:
            r4 = 0
            if (r9 >= r0) goto L_0x00b3
            byte[] r5 = r8.isInside
            java.lang.String r5 = setMax(r5, r3, r9)
            if (r5 == 0) goto L_0x00b0
            goto L_0x00b4
        L_0x00b0:
            int r9 = r9 + 1
            goto L_0x00a4
        L_0x00b3:
            r5 = r4
        L_0x00b4:
            if (r0 <= r2) goto L_0x00d1
            java.lang.Object r9 = r3.clone()
            byte[][] r9 = (byte[][]) r9
            r6 = 0
        L_0x00bd:
            int r7 = r9.length
            int r7 = r7 - r2
            if (r6 >= r7) goto L_0x00d1
            byte[] r7 = getMin
            r9[r6] = r7
            byte[] r7 = r8.isInside
            java.lang.String r7 = setMax(r7, r9, r6)
            if (r7 == 0) goto L_0x00ce
            goto L_0x00d2
        L_0x00ce:
            int r6 = r6 + 1
            goto L_0x00bd
        L_0x00d1:
            r7 = r4
        L_0x00d2:
            if (r7 == 0) goto L_0x00e5
        L_0x00d4:
            int r9 = r0 + -1
            if (r1 >= r9) goto L_0x00e5
            byte[] r9 = r8.equals
            java.lang.String r9 = setMax(r9, r3, r1)
            if (r9 == 0) goto L_0x00e2
            r4 = r9
            goto L_0x00e5
        L_0x00e2:
            int r1 = r1 + 1
            goto L_0x00d4
        L_0x00e5:
            if (r4 == 0) goto L_0x00f8
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "!"
            java.lang.String r9 = r0.concat(r9)
            java.lang.String r0 = "\\."
            java.lang.String[] r9 = r9.split(r0)
            return r9
        L_0x00f8:
            if (r5 != 0) goto L_0x00ff
            if (r7 != 0) goto L_0x00ff
            java.lang.String[] r9 = getMax
            return r9
        L_0x00ff:
            if (r5 == 0) goto L_0x0108
            java.lang.String r9 = "\\."
            java.lang.String[] r9 = r5.split(r9)
            goto L_0x010a
        L_0x0108:
            java.lang.String[] r9 = setMax
        L_0x010a:
            if (r7 == 0) goto L_0x0113
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r7.split(r0)
            goto L_0x0115
        L_0x0113:
            java.lang.String[] r0 = setMax
        L_0x0115:
            int r1 = r9.length
            int r2 = r0.length
            if (r1 <= r2) goto L_0x011a
            return r9
        L_0x011a:
            return r0
        L_0x011b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            r9.<init>(r0)     // Catch:{ all -> 0x0123 }
            throw r9     // Catch:{ all -> 0x0123 }
        L_0x0123:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x0127
        L_0x0126:
            throw r9
        L_0x0127:
            goto L_0x0126
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.getMin(java.lang.String[]):java.lang.String[]");
    }

    private static String setMax(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        byte b;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length2 = bArr3.length;
        int i4 = 0;
        while (i4 < length2) {
            int i5 = (i4 + length2) / 2;
            while (i5 >= 0 && bArr3[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (bArr3[i2] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z2 = false;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (z2) {
                    b = 46;
                    z = false;
                } else {
                    z = z2;
                    b = bArr4[i9][i10] & 255;
                }
                i3 = b - (bArr3[i6 + i11] & 255);
                if (i3 != 0) {
                    break;
                }
                i11++;
                i10++;
                if (i11 == i8) {
                    break;
                } else if (bArr4[i9].length == i10) {
                    if (i9 == bArr4.length - 1) {
                        break;
                    }
                    i9++;
                    z2 = true;
                    i10 = -1;
                } else {
                    z2 = z;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i12 = i8 - i11;
                    int length3 = bArr4[i9].length - i10;
                    while (true) {
                        i9++;
                        if (i9 >= bArr4.length) {
                            break;
                        }
                        length3 += bArr4[i9].length;
                    }
                    if (length3 >= i12) {
                        if (length3 <= i12) {
                            return new String(bArr3, i6, i8, initCloseCode.setMax);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            length2 = i6 - 1;
        }
        return null;
    }
}
