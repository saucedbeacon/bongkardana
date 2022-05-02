package com.alibaba.griver.ui.blur;

import android.graphics.Bitmap;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.concurrent.Callable;

class JavaBlurProcess implements BlurProcess {

    /* renamed from: a  reason: collision with root package name */
    private static final short[] f10575a = {512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 267, 265, 263, 261, 259};
    private static final byte[] b = {9, Ascii.VT, Ascii.FF, 13, 13, Ascii.SO, Ascii.SO, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.DLE, Ascii.DLE, Ascii.DLE, Ascii.DLE, 17, 17, 17, 17, 17, 17, 17, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN};

    JavaBlurProcess() {
    }

    /* access modifiers changed from: private */
    public static void a(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        int i11 = i6;
        int i12 = i8 - 1;
        int i13 = i9 - 1;
        int i14 = (i10 * 2) + 1;
        short s = f10575a[i10];
        byte b2 = b[i10];
        int[] iArr2 = new int[i14];
        if (i11 == 1) {
            int i15 = ((i5 + 1) * i9) / i4;
            for (int i16 = (i5 * i9) / i4; i16 < i15; i16++) {
                int i17 = i8 * i16;
                int i18 = 0;
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                long j6 = 0;
                while (i18 <= i10) {
                    iArr2[i18] = iArr[i17];
                    i18++;
                    j += (long) (((iArr[i17] >>> 16) & 255) * i18);
                    j2 += (long) (((iArr[i17] >>> 8) & 255) * i18);
                    j3 += (long) ((iArr[i17] & 255) * i18);
                    j4 += (long) ((iArr[i17] >>> 16) & 255);
                    j5 += (long) ((iArr[i17] >>> 8) & 255);
                    j6 += (long) (iArr[i17] & 255);
                }
                int i19 = i17;
                long j7 = 0;
                long j8 = 0;
                long j9 = 0;
                for (int i20 = 1; i20 <= i10; i20++) {
                    if (i20 <= i12) {
                        i19++;
                    }
                    iArr2[i20 + i10] = iArr[i19];
                    int i21 = (i10 + 1) - i20;
                    j += (long) (((iArr[i19] >>> 16) & 255) * i21);
                    j2 += (long) (((iArr[i19] >>> 8) & 255) * i21);
                    j3 += (long) ((iArr[i19] & 255) * i21);
                    j9 += (long) ((iArr[i19] >>> 16) & 255);
                    j8 += (long) ((iArr[i19] >>> 8) & 255);
                    j7 += (long) (iArr[i19] & 255);
                }
                int i22 = i10 > i12 ? i12 : i10;
                int i23 = i22 + i17;
                int i24 = i10;
                int i25 = 0;
                while (i25 < i8) {
                    int i26 = i15;
                    long j10 = j7;
                    int i27 = i23;
                    int i28 = i25;
                    long j11 = (long) s;
                    iArr[i17] = (int) ((((j11 * j3) >>> b2) & 255) | ((long) (iArr[i17] & -16777216)) | ((((j * j11) >>> b2) & 255) << 16) | ((((j2 * j11) >>> b2) & 255) << 8));
                    i17++;
                    long j12 = j - j4;
                    long j13 = j2 - j5;
                    long j14 = j3 - j6;
                    int i29 = (i24 + i14) - i10;
                    if (i29 >= i14) {
                        i29 -= i14;
                    }
                    long j15 = j4 - ((long) ((iArr2[i29] >>> 16) & 255));
                    long j16 = j5 - ((long) ((iArr2[i29] >>> 8) & 255));
                    long j17 = j6 - ((long) (iArr2[i29] & 255));
                    if (i22 < i12) {
                        i7 = i27 + 1;
                        i22++;
                    } else {
                        i7 = i27;
                    }
                    iArr2[i29] = iArr[i7];
                    long j18 = j9 + ((long) ((iArr[i7] >>> 16) & 255));
                    long j19 = j8 + ((long) ((iArr[i7] >>> 8) & 255));
                    long j20 = j10 + ((long) (iArr[i7] & 255));
                    j = j12 + j18;
                    j2 = j13 + j19;
                    j3 = j14 + j20;
                    i24++;
                    if (i24 >= i14) {
                        i24 = 0;
                    }
                    int i30 = i7;
                    j4 = j15 + ((long) ((iArr2[i24] >>> 16) & 255));
                    j5 = j16 + ((long) ((iArr2[i24] >>> 8) & 255));
                    j6 = j17 + ((long) (iArr2[i24] & 255));
                    j9 = j18 - ((long) ((iArr2[i24] >>> 16) & 255));
                    j8 = j19 - ((long) ((iArr2[i24] >>> 8) & 255));
                    j7 = j20 - ((long) (iArr2[i24] & 255));
                    i25 = i28 + 1;
                    i15 = i26;
                    i23 = i30;
                }
                int i31 = i15;
            }
        } else if (i11 == 2) {
            int i32 = (i5 * i8) / i4;
            int i33 = ((i5 + 1) * i8) / i4;
            while (i32 < i33) {
                int i34 = 0;
                long j21 = 0;
                long j22 = 0;
                long j23 = 0;
                long j24 = 0;
                long j25 = 0;
                long j26 = 0;
                while (i34 <= i10) {
                    iArr2[i34] = iArr[i32];
                    i34++;
                    j21 += (long) (((iArr[i32] >>> 16) & 255) * i34);
                    j22 += (long) (((iArr[i32] >>> 8) & 255) * i34);
                    j23 += (long) ((iArr[i32] & 255) * i34);
                    j24 += (long) ((iArr[i32] >>> 16) & 255);
                    j25 += (long) ((iArr[i32] >>> 8) & 255);
                    j26 += (long) (iArr[i32] & 255);
                    s = s;
                    b2 = b2;
                }
                short s2 = s;
                byte b3 = b2;
                int i35 = i32;
                long j27 = 0;
                int i36 = 1;
                long j28 = 0;
                long j29 = 0;
                while (i36 <= i10) {
                    if (i36 <= i13) {
                        i35 += i8;
                    }
                    iArr2[i36 + i10] = iArr[i35];
                    int i37 = (i10 + 1) - i36;
                    j21 += (long) (((iArr[i35] >>> 16) & 255) * i37);
                    j22 += (long) (((iArr[i35] >>> 8) & 255) * i37);
                    j23 += (long) ((iArr[i35] & 255) * i37);
                    j29 += (long) ((iArr[i35] >>> 16) & 255);
                    j28 += (long) ((iArr[i35] >>> 8) & 255);
                    j27 += (long) (iArr[i35] & 255);
                    i36++;
                    i33 = i33;
                    i32 = i32;
                }
                int i38 = i32;
                int i39 = i33;
                int i40 = i10 > i13 ? i13 : i10;
                int i41 = i38 + (i40 * i8);
                int i42 = i10;
                int i43 = i38;
                int i44 = 0;
                while (i44 < i9) {
                    long j30 = j27;
                    int i45 = i44;
                    int i46 = i41;
                    short s3 = s2;
                    int i47 = i40;
                    long j31 = (long) s3;
                    iArr[i43] = (int) ((((j31 * j23) >>> b3) & 255) | ((long) (iArr[i43] & -16777216)) | ((((j21 * j31) >>> b3) & 255) << 16) | ((((j22 * j31) >>> b3) & 255) << 8));
                    i43 += i8;
                    long j32 = j21 - j24;
                    long j33 = j22 - j25;
                    long j34 = j23 - j26;
                    int i48 = (i42 + i14) - i10;
                    if (i48 >= i14) {
                        i48 -= i14;
                    }
                    long j35 = j24 - ((long) ((iArr2[i48] >>> 16) & 255));
                    long j36 = j25 - ((long) ((iArr2[i48] >>> 8) & 255));
                    long j37 = j26 - ((long) (iArr2[i48] & 255));
                    int i49 = i47;
                    if (i49 < i13) {
                        i49++;
                        i46 += i8;
                    }
                    iArr2[i48] = iArr[i46];
                    long j38 = j29 + ((long) ((iArr[i46] >>> 16) & 255));
                    long j39 = j28 + ((long) ((iArr[i46] >>> 8) & 255));
                    long j40 = j30 + ((long) (iArr[i46] & 255));
                    j21 = j32 + j38;
                    j22 = j33 + j39;
                    j23 = j34 + j40;
                    int i50 = i42 + 1;
                    i42 = i50 >= i14 ? 0 : i50;
                    s2 = s3;
                    j24 = j35 + ((long) ((iArr2[i42] >>> 16) & 255));
                    j25 = j36 + ((long) ((iArr2[i42] >>> 8) & 255));
                    j26 = j37 + ((long) (iArr2[i42] & 255));
                    j29 = j38 - ((long) ((iArr2[i42] >>> 16) & 255));
                    j28 = j39 - ((long) ((iArr2[i42] >>> 8) & 255));
                    long j41 = j40 - ((long) (iArr2[i42] & 255));
                    i44 = i45 + 1;
                    j27 = j41;
                    i40 = i49;
                    i41 = i46;
                    i8 = i;
                    i9 = i2;
                }
                i32 = i38 + 1;
                i8 = i;
                i9 = i2;
                i33 = i39;
                s = s2;
                b2 = b3;
            }
        }
    }

    public Bitmap blur(Bitmap bitmap, float f) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            int i2 = (int) f;
            int[] iArr2 = iArr;
            int i3 = width;
            int i4 = height;
            int i5 = i2;
            int i6 = i2;
            int i7 = i;
            arrayList.add(new BlurTask(iArr2, i3, i4, i5, 2, i7, 1));
            arrayList2.add(new BlurTask(iArr2, i3, i4, i6, 2, i7, 2));
        }
        return Bitmap.createBitmap(iArr, width, height, Bitmap.Config.ARGB_8888);
    }

    static class BlurTask implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f10576a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;

        public BlurTask(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f10576a = iArr;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
        }

        public Void call() {
            JavaBlurProcess.a(this.f10576a, this.b, this.c, this.d, this.e, this.f, this.g);
            return null;
        }
    }
}
