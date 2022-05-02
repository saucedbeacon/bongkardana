package o;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.exoplayer2.C;
import java.io.Closeable;
import java.nio.charset.Charset;

final class updatePreDraw {
    static final Charset getMax = Charset.forName(C.ASCII_NAME);
    static final Charset getMin = Charset.forName(getMax(107 - View.resolveSizeAndState(0, 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 5, new char[]{65513, 2, 16, 17, 65524}, !KeyEvent.isModifierKey(0), TextUtils.lastIndexOf("", '0', 0) + 6).intern());
    private static int length = 0;
    private static int setMax = 1;
    private static int setMin;

    static void setMin() {
        setMin = 39;
    }

    static {
        setMin();
        int i = length + 31;
        setMax = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        if ((r5) != true) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004b, code lost:
        if ((r4.isDirectory() ? 10 : 'E') != 'E') goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void setMax(java.io.File r7) throws java.io.IOException {
        /*
            java.io.File[] r0 = r7.listFiles()
            if (r0 == 0) goto L_0x006b
            int r7 = r0.length
            r1 = 0
            r2 = 0
        L_0x0009:
            r3 = 1
            if (r2 >= r7) goto L_0x000e
            r4 = 0
            goto L_0x000f
        L_0x000e:
            r4 = 1
        L_0x000f:
            if (r4 == 0) goto L_0x001c
            int r7 = length
            int r7 = r7 + 109
            int r0 = r7 % 128
            setMax = r0
            int r7 = r7 % 2
            return
        L_0x001c:
            int r4 = length     // Catch:{ Exception -> 0x0069 }
            int r4 = r4 + 63
            int r5 = r4 % 128
            setMax = r5     // Catch:{ Exception -> 0x0069 }
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x003c
            r4 = r0[r2]
            boolean r5 = r4.isDirectory()     // Catch:{ Exception -> 0x003a }
            r6 = 0
            int r6 = r6.length     // Catch:{ all -> 0x0038 }
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            if (r5 == r3) goto L_0x004d
            goto L_0x0050
        L_0x0038:
            r7 = move-exception
            throw r7
        L_0x003a:
            r7 = move-exception
            throw r7
        L_0x003c:
            r4 = r0[r2]
            boolean r3 = r4.isDirectory()
            r5 = 69
            if (r3 == 0) goto L_0x0049
            r3 = 10
            goto L_0x004b
        L_0x0049:
            r3 = 69
        L_0x004b:
            if (r3 == r5) goto L_0x0050
        L_0x004d:
            setMax(r4)
        L_0x0050:
            boolean r3 = r4.delete()
            if (r3 == 0) goto L_0x0059
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0059:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "failed to delete file: "
            java.lang.String r0 = r1.concat(r0)
            r7.<init>(r0)
            throw r7
        L_0x0069:
            r7 = move-exception
            throw r7
        L_0x006b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "not a readable directory: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            goto L_0x007c
        L_0x007b:
            throw r0
        L_0x007c:
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.updatePreDraw.setMax(java.io.File):void");
    }

    static void length(Closeable closeable) {
        int i = setMax + 105;
        length = i % 128;
        int i2 = i % 2;
        try {
            closeable.close();
            try {
                int i3 = setMax + 67;
                try {
                    length = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    private static String getMax(int i, int i2, char[] cArr, boolean z, int i3) {
        int i4;
        char[] cArr2;
        int i5;
        char[] cArr3 = new char[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = setMax + 45;
            length = i7 % 128;
            int i8 = i7 % 2;
            cArr3[i6] = (char) (cArr[i6] + i);
            cArr3[i6] = (char) (cArr3[i6] - setMin);
        }
        if ((i2 > 0 ? (char) 13 : 14) != 14) {
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr3, 0, cArr4, 0, i3);
            int i9 = i3 - i2;
            System.arraycopy(cArr4, 0, cArr3, i9, i2);
            System.arraycopy(cArr4, i2, cArr3, 0, i9);
            int i10 = length + 51;
            setMax = i10 % 128;
            int i11 = i10 % 2;
        }
        if (z) {
            try {
                int i12 = setMax + 17;
                length = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr2 = new char[i3];
                    i4 = 1;
                } else {
                    cArr2 = new char[i3];
                    i4 = 0;
                }
                while (true) {
                    if (i4 >= i3) {
                        break;
                    }
                    int i13 = setMax + 37;
                    length = i13 % 128;
                    if (!(i13 % 2 != 0)) {
                        cArr2[i4] = cArr3[(i3 - i4) - 1];
                        i5 = i4 + 1;
                    } else {
                        cArr2[i4] = cArr3[(i3 >>> i4) << 0];
                        i5 = i4 + 19;
                    }
                }
                int i14 = setMax + 79;
                length = i14 % 128;
                int i15 = i14 % 2;
                cArr3 = cArr2;
            } catch (Exception e) {
                throw e;
            }
        }
        return new String(cArr3);
    }
}
