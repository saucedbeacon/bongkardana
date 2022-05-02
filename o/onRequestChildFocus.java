package o;

import android.view.View;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class onRequestChildFocus {
    private static int equals = 1;
    private static final byte[] getMax = "Exif\u0000\u0000".getBytes(Charset.forName(setMax(new char[]{1, 2, 0, 5, 147}, View.MeasureSpec.getMode(0) + 5, (byte) (91 - (ViewConfiguration.getScrollBarSize() >> 8))).intern()));
    private static final int[] getMin = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    private static char length;
    private static char[] setMin;
    private static int toFloatRange;
    final length setMax;

    interface length {
        int setMax() throws IOException;

        int setMax(byte[] bArr, int i) throws IOException;

        long setMax(long j) throws IOException;

        short setMin() throws IOException;
    }

    static void setMin() {
        length = 3;
        setMin = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    static boolean setMin(int i) {
        try {
            int i2 = equals + 15;
            try {
                toFloatRange = i2 % 128;
                int i3 = i2 % 2;
                if ((i & 65496) != 65496) {
                    if ((i != 19789 ? (char) 25 : 1) != 1) {
                        int i4 = equals + 115;
                        toFloatRange = i4 % 128;
                        int i5 = i4 % 2;
                        if (!(i == 18761)) {
                            return false;
                        }
                    }
                }
                int i6 = equals + 97;
                toFloatRange = i6 % 128;
                int i7 = i6 % 2;
                return true;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static {
        setMin();
        int i = equals + 57;
        toFloatRange = i % 128;
        int i2 = i % 2;
    }

    public onRequestChildFocus(InputStream inputStream) {
        this.setMax = new getMax(inputStream);
    }

    static boolean setMin(byte[] bArr, int i) {
        int i2 = equals + 77;
        toFloatRange = i2 % 128;
        int i3 = i2 % 2;
        boolean z = i > getMax.length;
        if (z) {
            int i4 = 0;
            while (i4 < getMax.length) {
                int i5 = toFloatRange + 53;
                equals = i5 % 128;
                int i6 = i5 % 2;
                try {
                    if (!(bArr[i4] != getMax[i4])) {
                        i4++;
                    } else {
                        int i7 = toFloatRange + 111;
                        equals = i7 % 128;
                        int i8 = i7 % 2;
                        return false;
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0102 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int getMin(o.onRequestChildFocus.setMin r13) {
        /*
            r0 = 6
            short r1 = r13.getMax(r0)
            r2 = 19789(0x4d4d, float:2.773E-41)
            r3 = 53
            if (r1 == r2) goto L_0x0024
            int r2 = toFloatRange
            int r2 = r2 + r3
            int r4 = r2 % 128
            equals = r4
            int r2 = r2 % 2
            r2 = 18761(0x4949, float:2.629E-41)
            r4 = 74
            if (r1 != r2) goto L_0x001d
            r1 = 93
            goto L_0x001f
        L_0x001d:
            r1 = 74
        L_0x001f:
            if (r1 == r4) goto L_0x0024
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            goto L_0x0026
        L_0x0024:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
        L_0x0026:
            java.nio.ByteBuffer r2 = r13.getMax
            r2.order(r1)
            java.nio.ByteBuffer r1 = r13.getMax
            r2 = 10
            int r1 = r1.getInt(r2)
            int r1 = r1 + r0
            short r0 = r13.getMax(r1)
            r2 = 0
            r4 = 0
        L_0x003a:
            r5 = 68
            if (r4 >= r0) goto L_0x0041
            r6 = 14
            goto L_0x0043
        L_0x0041:
            r6 = 68
        L_0x0043:
            if (r6 == r5) goto L_0x0102
            int r5 = r1 + 2
            int r6 = r4 * 12
            int r5 = r5 + r6
            short r6 = r13.getMax(r5)
            r7 = 274(0x112, float:3.84E-43)
            r8 = 90
            if (r6 != r7) goto L_0x0057
            r6 = 90
            goto L_0x0059
        L_0x0057:
            r6 = 61
        L_0x0059:
            if (r6 == r8) goto L_0x005d
            goto L_0x00f2
        L_0x005d:
            int r6 = r5 + 2
            short r6 = r13.getMax(r6)     // Catch:{ Exception -> 0x0100 }
            r7 = 3
            java.lang.String r8 = "ImageHeaderParser"
            if (r6 <= 0) goto L_0x00e2
            int r9 = equals     // Catch:{ Exception -> 0x0100 }
            int r9 = r9 + 13
            int r10 = r9 % 128
            toFloatRange = r10     // Catch:{ Exception -> 0x0100 }
            int r9 = r9 % 2
            r10 = 1
            if (r9 == 0) goto L_0x007d
            if (r6 <= r3) goto L_0x0079
            r9 = 1
            goto L_0x007a
        L_0x0079:
            r9 = 0
        L_0x007a:
            if (r9 == r10) goto L_0x00e2
            goto L_0x0082
        L_0x007d:
            r9 = 12
            if (r6 <= r9) goto L_0x0082
            goto L_0x00e2
        L_0x0082:
            int r9 = r5 + 4
            java.nio.ByteBuffer r11 = r13.getMax     // Catch:{ Exception -> 0x0100 }
            int r9 = r11.getInt(r9)     // Catch:{ Exception -> 0x0100 }
            r11 = 92
            if (r9 >= 0) goto L_0x0091
            r12 = 40
            goto L_0x0093
        L_0x0091:
            r12 = 92
        L_0x0093:
            if (r12 == r11) goto L_0x009a
            boolean r5 = android.util.Log.isLoggable(r8, r7)
            goto L_0x00f2
        L_0x009a:
            int[] r11 = getMin
            r6 = r11[r6]
            int r9 = r9 + r6
            r6 = 4
            if (r9 <= r6) goto L_0x00a7
            boolean r5 = android.util.Log.isLoggable(r8, r7)
            goto L_0x00f2
        L_0x00a7:
            int r5 = r5 + 8
            if (r5 < 0) goto L_0x00ad
            r6 = 0
            goto L_0x00ae
        L_0x00ad:
            r6 = 1
        L_0x00ae:
            if (r6 == 0) goto L_0x00b1
            goto L_0x00c3
        L_0x00b1:
            int r6 = equals
            int r6 = r6 + 35
            int r11 = r6 % 128
            toFloatRange = r11
            int r6 = r6 % 2
            java.nio.ByteBuffer r6 = r13.getMax
            int r6 = r6.remaining()
            if (r5 <= r6) goto L_0x00c8
        L_0x00c3:
            boolean r5 = android.util.Log.isLoggable(r8, r7)
            goto L_0x00f2
        L_0x00c8:
            if (r9 < 0) goto L_0x00dd
            int r9 = r9 + r5
            java.nio.ByteBuffer r6 = r13.getMax
            int r6 = r6.remaining()
            if (r9 <= r6) goto L_0x00d5
            r6 = 1
            goto L_0x00d6
        L_0x00d5:
            r6 = 0
        L_0x00d6:
            if (r6 == r10) goto L_0x00dd
            short r13 = r13.getMax(r5)
            return r13
        L_0x00dd:
            boolean r5 = android.util.Log.isLoggable(r8, r7)
            goto L_0x00f2
        L_0x00e2:
            boolean r5 = android.util.Log.isLoggable(r8, r7)
            if (r5 == 0) goto L_0x00f2
            int r5 = equals
            int r5 = r5 + 79
            int r6 = r5 % 128
            toFloatRange = r6
            int r5 = r5 % 2
        L_0x00f2:
            int r4 = r4 + 1
            int r5 = toFloatRange
            int r5 = r5 + 23
            int r6 = r5 % 128
            equals = r6
            int r5 = r5 % 2
            goto L_0x003a
        L_0x0100:
            r13 = move-exception
            throw r13
        L_0x0102:
            r13 = -1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRequestChildFocus.getMin(o.onRequestChildFocus$setMin):int");
    }

    static class setMin {
        final ByteBuffer getMax;

        public setMin(byte[] bArr, int i) {
            this.getMax = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public final short getMax(int i) {
            return this.getMax.getShort(i);
        }
    }

    static class getMax implements length {
        private final InputStream getMin;

        public getMax(InputStream inputStream) {
            this.getMin = inputStream;
        }

        public final int setMax() throws IOException {
            return ((this.getMin.read() << 8) & 65280) | (this.getMin.read() & 255);
        }

        public final short setMin() throws IOException {
            return (short) (this.getMin.read() & 255);
        }

        public final long setMax(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.getMin.skip(j2);
                if (skip <= 0) {
                    if (this.getMin.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        public final int setMax(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.getMin.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void length(android.media.ExifInterface r23, int r24, int r25, java.lang.String r26) {
        /*
            java.lang.String r1 = "FNumber"
            java.lang.String r2 = "DateTime"
            java.lang.String r3 = "DateTimeDigitized"
            java.lang.String r4 = "ExposureTime"
            java.lang.String r5 = "Flash"
            java.lang.String r6 = "FocalLength"
            java.lang.String r7 = "GPSAltitude"
            java.lang.String r8 = "GPSAltitudeRef"
            java.lang.String r9 = "GPSDateStamp"
            java.lang.String r10 = "GPSLatitude"
            java.lang.String r11 = "GPSLatitudeRef"
            java.lang.String r12 = "GPSLongitude"
            java.lang.String r13 = "GPSLongitudeRef"
            java.lang.String r14 = "GPSProcessingMethod"
            java.lang.String r15 = "GPSTimeStamp"
            java.lang.String r16 = "ISOSpeedRatings"
            java.lang.String r17 = "Make"
            java.lang.String r18 = "Model"
            java.lang.String r19 = "SubSecTime"
            java.lang.String r20 = "SubSecTimeDigitized"
            java.lang.String r21 = "SubSecTimeOriginal"
            java.lang.String r22 = "WhiteBalance"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}     // Catch:{ Exception -> 0x00b0 }
            android.media.ExifInterface r1 = new android.media.ExifInterface     // Catch:{ IOException -> 0x00ab }
            r2 = r26
            r1.<init>(r2)     // Catch:{ IOException -> 0x00ab }
            int r2 = toFloatRange
            int r2 = r2 + 119
            int r3 = r2 % 128
            equals = r3
            int r2 = r2 % 2
            r2 = 0
            r3 = 0
        L_0x0043:
            r4 = 22
            if (r3 >= r4) goto L_0x008e
            int r4 = equals
            int r4 = r4 + 25
            int r5 = r4 % 128
            toFloatRange = r5
            int r4 = r4 % 2
            r4 = r0[r3]     // Catch:{  }
            r5 = r23
            java.lang.String r6 = r5.getAttribute(r4)     // Catch:{  }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{  }
            r8 = 1
            if (r7 != 0) goto L_0x0062
            r7 = 0
            goto L_0x0063
        L_0x0062:
            r7 = 1
        L_0x0063:
            if (r7 == 0) goto L_0x0066
            goto L_0x007e
        L_0x0066:
            int r7 = equals
            int r7 = r7 + 77
            int r9 = r7 % 128
            toFloatRange = r9
            int r7 = r7 % 2
            if (r7 == 0) goto L_0x0073
            r8 = 0
        L_0x0073:
            if (r8 == 0) goto L_0x0079
            r1.setAttribute(r4, r6)     // Catch:{  }
            goto L_0x007e
        L_0x0079:
            r1.setAttribute(r4, r6)     // Catch:{  }
            r4 = 0
            int r4 = r4.length     // Catch:{ all -> 0x008b }
        L_0x007e:
            int r3 = r3 + 1
            int r4 = toFloatRange
            int r4 = r4 + 35
            int r6 = r4 % 128
            equals = r6
            int r4 = r4 % 2
            goto L_0x0043
        L_0x008b:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x008e:
            java.lang.String r0 = "ImageWidth"
            java.lang.String r2 = java.lang.String.valueOf(r24)     // Catch:{  }
            r1.setAttribute(r0, r2)     // Catch:{  }
            java.lang.String r0 = "ImageLength"
            java.lang.String r2 = java.lang.String.valueOf(r25)     // Catch:{  }
            r1.setAttribute(r0, r2)     // Catch:{  }
            java.lang.String r0 = "Orientation"
            java.lang.String r2 = "0"
            r1.setAttribute(r0, r2)     // Catch:{  }
            r1.saveAttributes()     // Catch:{  }
            return
        L_0x00ab:
            r0 = move-exception
            r0.getMessage()
            return
        L_0x00b0:
            r0 = move-exception
            goto L_0x00b3
        L_0x00b2:
            throw r0
        L_0x00b3:
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRequestChildFocus.length(android.media.ExifInterface, int, int, java.lang.String):void");
    }

    private static String setMax(char[] cArr, int i, byte b) {
        char[] cArr2 = setMin;
        char c = length;
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i--;
            cArr3[i] = (char) (cArr[i] - b);
        }
        if (i > 1) {
            int i2 = 0;
            while (true) {
                if (!(i2 < i)) {
                    break;
                }
                char c2 = cArr[i2];
                int i3 = i2 + 1;
                char c3 = cArr[i3];
                if (!(c2 != c3)) {
                    int i4 = toFloatRange + 47;
                    equals = i4 % 128;
                    if (i4 % 2 == 0) {
                        cArr3[i2] = (char) (c2 >>> b);
                        cArr3[i2 * 0] = (char) (c3 / b);
                    } else {
                        cArr3[i2] = (char) (c2 - b);
                        cArr3[i3] = (char) (c3 - b);
                    }
                } else {
                    int min = onActivityPreStopped.setMin(c2, c);
                    int length2 = onActivityPreStopped.length(c2, c);
                    int min2 = onActivityPreStopped.setMin(c3, c);
                    int length3 = onActivityPreStopped.length(c3, c);
                    if (length2 == length3) {
                        try {
                            int max = onActivityPreStopped.setMax(min, c);
                            int max2 = onActivityPreStopped.setMax(min2, c);
                            int max3 = onActivityPreStopped.getMax(max, length2, c);
                            int max4 = onActivityPreStopped.getMax(max2, length3, c);
                            cArr3[i2] = cArr2[max3];
                            cArr3[i3] = cArr2[max4];
                        } catch (Exception e) {
                            throw e;
                        }
                    } else if (min == min2) {
                        int i5 = toFloatRange + 73;
                        equals = i5 % 128;
                        int i6 = i5 % 2;
                        int max5 = onActivityPreStopped.setMax(length2, c);
                        int max6 = onActivityPreStopped.setMax(length3, c);
                        int max7 = onActivityPreStopped.getMax(min, max5, c);
                        int max8 = onActivityPreStopped.getMax(min2, max6, c);
                        cArr3[i2] = cArr2[max7];
                        cArr3[i3] = cArr2[max8];
                    } else {
                        int max9 = onActivityPreStopped.getMax(min, length3, c);
                        int max10 = onActivityPreStopped.getMax(min2, length2, c);
                        cArr3[i2] = cArr2[max9];
                        cArr3[i3] = cArr2[max10];
                    }
                }
                i2 += 2;
            }
        }
        return new String(cArr3);
    }
}
