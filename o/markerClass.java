package o;

import android.graphics.Path;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public final class markerClass {
    static float[] setMin(float[] fArr, int i) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i2 = i - 0;
                int min = Math.min(i2, length - 0);
                float[] fArr2 = new float[i2];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static Path getMax(String str) {
        Path path = new Path();
        setMin[] length = length(str);
        if (length == null) {
            return null;
        }
        try {
            setMin.setMin(length, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e);
        }
    }

    public static setMin[] length(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int length = length(str, i);
            String trim = str.substring(i2, length).trim();
            if (trim.length() > 0) {
                arrayList.add(new setMin(trim.charAt(0), setMax(trim)));
            }
            i2 = length;
            i = length + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            arrayList.add(new setMin(str.charAt(i2), new float[0]));
        }
        return (setMin[]) arrayList.toArray(new setMin[arrayList.size()]);
    }

    public static setMin[] setMin(setMin[] setminArr) {
        if (setminArr == null) {
            return null;
        }
        setMin[] setminArr2 = new setMin[setminArr.length];
        for (int i = 0; i < setminArr.length; i++) {
            setminArr2[i] = new setMin(setminArr[i]);
        }
        return setminArr2;
    }

    public static boolean setMax(@Nullable setMin[] setminArr, @Nullable setMin[] setminArr2) {
        if (setminArr == null || setminArr2 == null || setminArr.length != setminArr2.length) {
            return false;
        }
        for (int i = 0; i < setminArr.length; i++) {
            if (setminArr[i].length != setminArr2[i].length || setminArr[i].getMax.length != setminArr2[i].getMax.length) {
                return false;
            }
        }
        return true;
    }

    private static int length(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    static class getMax {
        int getMax;
        boolean setMin;

        getMax() {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r8 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ NumberFormatException -> 0x0082 }, LOOP:1: B:8:0x002d->B:28:0x005e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0067 A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078 A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0061 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float[] setMax(java.lang.String r13) {
        /*
            r0 = 0
            char r1 = r13.charAt(r0)
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L_0x009c
            char r1 = r13.charAt(r0)
            r2 = 90
            if (r1 != r2) goto L_0x0013
            goto L_0x009c
        L_0x0013:
            int r1 = r13.length()     // Catch:{ NumberFormatException -> 0x0082 }
            float[] r1 = new float[r1]     // Catch:{ NumberFormatException -> 0x0082 }
            o.markerClass$getMax r2 = new o.markerClass$getMax     // Catch:{ NumberFormatException -> 0x0082 }
            r2.<init>()     // Catch:{ NumberFormatException -> 0x0082 }
            int r3 = r13.length()     // Catch:{ NumberFormatException -> 0x0082 }
            r4 = 1
            r5 = 1
            r6 = 0
        L_0x0025:
            if (r5 >= r3) goto L_0x007d
            r2.setMin = r0     // Catch:{ NumberFormatException -> 0x0082 }
            r7 = r5
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x002d:
            int r11 = r13.length()     // Catch:{ NumberFormatException -> 0x0082 }
            if (r7 >= r11) goto L_0x0061
            char r11 = r13.charAt(r7)     // Catch:{ NumberFormatException -> 0x0082 }
            r12 = 32
            if (r11 == r12) goto L_0x005a
            r12 = 69
            if (r11 == r12) goto L_0x0058
            r12 = 101(0x65, float:1.42E-43)
            if (r11 == r12) goto L_0x0058
            switch(r11) {
                case 44: goto L_0x005a;
                case 45: goto L_0x004f;
                case 46: goto L_0x0047;
                default: goto L_0x0046;
            }     // Catch:{ NumberFormatException -> 0x0082 }
        L_0x0046:
            goto L_0x0056
        L_0x0047:
            if (r9 != 0) goto L_0x004c
            r8 = 0
            r9 = 1
            goto L_0x005c
        L_0x004c:
            r2.setMin = r4     // Catch:{ NumberFormatException -> 0x0082 }
            goto L_0x005a
        L_0x004f:
            if (r7 == r5) goto L_0x0056
            if (r8 != 0) goto L_0x0056
            r2.setMin = r4     // Catch:{ NumberFormatException -> 0x0082 }
            goto L_0x005a
        L_0x0056:
            r8 = 0
            goto L_0x005c
        L_0x0058:
            r8 = 1
            goto L_0x005c
        L_0x005a:
            r8 = 0
            r10 = 1
        L_0x005c:
            if (r10 != 0) goto L_0x0061
            int r7 = r7 + 1
            goto L_0x002d
        L_0x0061:
            r2.getMax = r7     // Catch:{ NumberFormatException -> 0x0082 }
            int r7 = r2.getMax     // Catch:{ NumberFormatException -> 0x0082 }
            if (r5 >= r7) goto L_0x0074
            int r8 = r6 + 1
            java.lang.String r5 = r13.substring(r5, r7)     // Catch:{ NumberFormatException -> 0x0082 }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x0082 }
            r1[r6] = r5     // Catch:{ NumberFormatException -> 0x0082 }
            r6 = r8
        L_0x0074:
            boolean r5 = r2.setMin     // Catch:{ NumberFormatException -> 0x0082 }
            if (r5 == 0) goto L_0x007a
            r5 = r7
            goto L_0x0025
        L_0x007a:
            int r5 = r7 + 1
            goto L_0x0025
        L_0x007d:
            float[] r13 = setMin(r1, r6)     // Catch:{ NumberFormatException -> 0x0082 }
            return r13
        L_0x0082:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error in parsing \""
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r13 = "\""
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r1.<init>(r13, r0)
            throw r1
        L_0x009c:
            float[] r13 = new float[r0]
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.markerClass.setMax(java.lang.String):float[]");
    }

    public static class setMin {
        public float[] getMax;
        public char length;

        setMin(char c, float[] fArr) {
            this.length = c;
            this.getMax = fArr;
        }

        setMin(setMin setmin) {
            this.length = setmin.length;
            float[] fArr = setmin.getMax;
            this.getMax = markerClass.setMin(fArr, fArr.length);
        }

        public static void setMin(setMin[] setminArr, Path path) {
            int i;
            int i2;
            int i3;
            float[] fArr;
            char c;
            int i4;
            float[] fArr2;
            char c2;
            int i5;
            float f;
            float f2;
            float f3;
            float f4;
            int i6;
            float f5;
            float f6;
            float f7;
            float f8;
            int i7;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            setMin[] setminArr2 = setminArr;
            Path path2 = path;
            float[] fArr3 = new float[6];
            char c3 = 'm';
            char c4 = 0;
            char c5 = 'm';
            int i8 = 0;
            while (i8 < setminArr2.length) {
                char c6 = setminArr2[i8].length;
                float[] fArr4 = setminArr2[i8].getMax;
                float f19 = fArr3[c4];
                float f20 = fArr3[1];
                float f21 = fArr3[2];
                float f22 = fArr3[3];
                float f23 = fArr3[4];
                float f24 = fArr3[5];
                switch (c6) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path2.moveTo(f23, f24);
                        f19 = f23;
                        f21 = f19;
                        f20 = f24;
                        f22 = f20;
                        break;
                }
                i = 2;
                float f25 = f23;
                float f26 = f24;
                float f27 = f19;
                float f28 = f20;
                int i9 = 0;
                while (i9 < fArr4.length) {
                    if (c6 != 'A') {
                        if (c6 != 'C') {
                            if (c6 == 'H') {
                                i2 = i9;
                                fArr = fArr4;
                                c = c6;
                                i3 = i8;
                                int i10 = i2 + 0;
                                path2.lineTo(fArr[i10], f28);
                                f27 = fArr[i10];
                            } else if (c6 == 'Q') {
                                i6 = i9;
                                fArr = fArr4;
                                c = c6;
                                i3 = i8;
                                int i11 = i6 + 0;
                                int i12 = i6 + 1;
                                int i13 = i6 + 2;
                                int i14 = i6 + 3;
                                path2.quadTo(fArr[i11], fArr[i12], fArr[i13], fArr[i14]);
                                f4 = fArr[i11];
                                f3 = fArr[i12];
                                f27 = fArr[i13];
                                f28 = fArr[i14];
                            } else if (c6 == 'V') {
                                i2 = i9;
                                fArr = fArr4;
                                c = c6;
                                i3 = i8;
                                int i15 = i2 + 0;
                                path2.lineTo(f27, fArr[i15]);
                                f28 = fArr[i15];
                            } else if (c6 != 'a') {
                                if (c6 != 'c') {
                                    if (c6 == 'h') {
                                        i2 = i9;
                                        float f29 = f28;
                                        int i16 = i2 + 0;
                                        path2.rLineTo(fArr4[i16], 0.0f);
                                        f27 += fArr4[i16];
                                    } else if (c6 == 'q') {
                                        i2 = i9;
                                        float f30 = f28;
                                        float f31 = f27;
                                        int i17 = i2 + 0;
                                        int i18 = i2 + 1;
                                        int i19 = i2 + 2;
                                        int i20 = i2 + 3;
                                        path2.rQuadTo(fArr4[i17], fArr4[i18], fArr4[i19], fArr4[i20]);
                                        float f32 = fArr4[i17] + f31;
                                        float f33 = f30 + fArr4[i18];
                                        f27 = f31 + fArr4[i19];
                                        f21 = f32;
                                        f22 = f33;
                                        fArr = fArr4;
                                        c = c6;
                                        i3 = i8;
                                        f28 = fArr4[i20] + f30;
                                    } else if (c6 == 'v') {
                                        i2 = i9;
                                        float f34 = f27;
                                        int i21 = i2 + 0;
                                        path2.rLineTo(0.0f, fArr4[i21]);
                                        f28 += fArr4[i21];
                                    } else if (c6 != 'L') {
                                        if (c6 == 'M') {
                                            i2 = i9;
                                            int i22 = i2 + 0;
                                            f27 = fArr4[i22];
                                            int i23 = i2 + 1;
                                            f28 = fArr4[i23];
                                            if (i2 > 0) {
                                                path2.lineTo(fArr4[i22], fArr4[i23]);
                                            } else {
                                                path2.moveTo(fArr4[i22], fArr4[i23]);
                                            }
                                        } else if (c6 == 'S') {
                                            i2 = i9;
                                            float f35 = f28;
                                            float f36 = f27;
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f13 = (f35 * 2.0f) - f22;
                                                f14 = (f36 * 2.0f) - f21;
                                            } else {
                                                f14 = f36;
                                                f13 = f35;
                                            }
                                            int i24 = i2 + 0;
                                            int i25 = i2 + 1;
                                            int i26 = i2 + 2;
                                            int i27 = i2 + 3;
                                            path.cubicTo(f14, f13, fArr4[i24], fArr4[i25], fArr4[i26], fArr4[i27]);
                                            float f37 = fArr4[i24];
                                            float f38 = fArr4[i25];
                                            f27 = fArr4[i26];
                                            f28 = fArr4[i27];
                                            f21 = f37;
                                            f22 = f38;
                                        } else if (c6 == 'T') {
                                            i7 = i9;
                                            float f39 = f28;
                                            float f40 = f27;
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f5 = (f40 * 2.0f) - f21;
                                                f6 = (f39 * 2.0f) - f22;
                                            } else {
                                                f5 = f40;
                                                f6 = f39;
                                            }
                                            int i28 = i7 + 0;
                                            int i29 = i7 + 1;
                                            path2.quadTo(f5, f6, fArr4[i28], fArr4[i29]);
                                            f8 = fArr4[i28];
                                            f7 = fArr4[i29];
                                            f22 = f6;
                                            f21 = f5;
                                            fArr = fArr4;
                                            c = c6;
                                            i3 = i8;
                                            f27 = f8;
                                            f28 = f7;
                                        } else if (c6 == 'l') {
                                            i2 = i9;
                                            int i30 = i2 + 0;
                                            int i31 = i2 + 1;
                                            path2.rLineTo(fArr4[i30], fArr4[i31]);
                                            f27 += fArr4[i30];
                                            f28 += fArr4[i31];
                                        } else if (c6 == c3) {
                                            i2 = i9;
                                            int i32 = i2 + 0;
                                            f27 += fArr4[i32];
                                            int i33 = i2 + 1;
                                            f28 += fArr4[i33];
                                            if (i2 > 0) {
                                                path2.rLineTo(fArr4[i32], fArr4[i33]);
                                            } else {
                                                path2.rMoveTo(fArr4[i32], fArr4[i33]);
                                            }
                                        } else if (c6 == 's') {
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f15 = f28 - f22;
                                                f16 = f27 - f21;
                                            } else {
                                                f16 = 0.0f;
                                                f15 = 0.0f;
                                            }
                                            int i34 = i9 + 0;
                                            int i35 = i9 + 1;
                                            int i36 = i9 + 2;
                                            int i37 = i9 + 3;
                                            i7 = i9;
                                            f9 = f28;
                                            float f41 = f27;
                                            path.rCubicTo(f16, f15, fArr4[i34], fArr4[i35], fArr4[i36], fArr4[i37]);
                                            f11 = f41 + fArr4[i34];
                                            f12 = f9 + fArr4[i35];
                                            f8 = f41 + fArr4[i36];
                                            f10 = fArr4[i37];
                                        } else if (c6 != 't') {
                                            i2 = i9;
                                        } else {
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f17 = f27 - f21;
                                                f18 = f28 - f22;
                                            } else {
                                                f18 = 0.0f;
                                                f17 = 0.0f;
                                            }
                                            int i38 = i9 + 0;
                                            int i39 = i9 + 1;
                                            path2.rQuadTo(f17, f18, fArr4[i38], fArr4[i39]);
                                            float f42 = f17 + f27;
                                            float f43 = f18 + f28;
                                            f27 += fArr4[i38];
                                            f28 += fArr4[i39];
                                            f22 = f43;
                                            i2 = i9;
                                            fArr = fArr4;
                                            c = c6;
                                            i3 = i8;
                                            f21 = f42;
                                        }
                                        f26 = f28;
                                        f25 = f27;
                                    } else {
                                        i2 = i9;
                                        int i40 = i2 + 0;
                                        int i41 = i2 + 1;
                                        path2.lineTo(fArr4[i40], fArr4[i41]);
                                        f27 = fArr4[i40];
                                        f28 = fArr4[i41];
                                    }
                                    fArr = fArr4;
                                    c = c6;
                                    i3 = i8;
                                } else {
                                    i7 = i9;
                                    f9 = f28;
                                    float f44 = f27;
                                    int i42 = i7 + 2;
                                    int i43 = i7 + 3;
                                    int i44 = i7 + 4;
                                    int i45 = i7 + 5;
                                    path.rCubicTo(fArr4[i7 + 0], fArr4[i7 + 1], fArr4[i42], fArr4[i43], fArr4[i44], fArr4[i45]);
                                    f11 = f44 + fArr4[i42];
                                    f12 = f9 + fArr4[i43];
                                    f8 = f44 + fArr4[i44];
                                    f10 = fArr4[i45];
                                }
                                f7 = f10 + f9;
                                f22 = f6;
                                f21 = f5;
                                fArr = fArr4;
                                c = c6;
                                i3 = i8;
                                f27 = f8;
                                f28 = f7;
                            } else {
                                i4 = i9;
                                float f45 = f28;
                                float f46 = f27;
                                int i46 = i4 + 5;
                                float f47 = fArr4[i46] + f46;
                                int i47 = i4 + 6;
                                float f48 = fArr4[i47] + f45;
                                float f49 = fArr4[i4 + 0];
                                float f50 = fArr4[i4 + 1];
                                float f51 = fArr4[i4 + 2];
                                boolean z = fArr4[i4 + 3] != 0.0f;
                                boolean z2 = fArr4[i4 + 4] != 0.0f;
                                fArr2 = fArr4;
                                float f52 = f51;
                                c2 = c6;
                                i5 = i8;
                                setMin(path, f46, f45, f47, f48, f49, f50, f52, z, z2);
                                f = f46 + fArr2[i46];
                                f2 = f45 + fArr2[i47];
                            }
                            i9 = i2 + i;
                            c3 = 'm';
                            setMin[] setminArr3 = setminArr;
                            c5 = c;
                            c6 = c5;
                            fArr4 = fArr;
                            i8 = i3;
                        } else {
                            i6 = i9;
                            fArr = fArr4;
                            c = c6;
                            i3 = i8;
                            int i48 = i6 + 2;
                            int i49 = i6 + 3;
                            int i50 = i6 + 4;
                            int i51 = i6 + 5;
                            path.cubicTo(fArr[i6 + 0], fArr[i6 + 1], fArr[i48], fArr[i49], fArr[i50], fArr[i51]);
                            f27 = fArr[i50];
                            f28 = fArr[i51];
                            f4 = fArr[i48];
                            f3 = fArr[i49];
                        }
                        f21 = f4;
                        f22 = f3;
                        i9 = i2 + i;
                        c3 = 'm';
                        setMin[] setminArr32 = setminArr;
                        c5 = c;
                        c6 = c5;
                        fArr4 = fArr;
                        i8 = i3;
                    } else {
                        i4 = i9;
                        fArr2 = fArr4;
                        c2 = c6;
                        i5 = i8;
                        int i52 = i4 + 5;
                        int i53 = i4 + 6;
                        setMin(path, f27, f28, fArr2[i52], fArr2[i53], fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                        f = fArr2[i52];
                        f2 = fArr2[i53];
                    }
                    f22 = f28;
                    f21 = f27;
                    i9 = i2 + i;
                    c3 = 'm';
                    setMin[] setminArr322 = setminArr;
                    c5 = c;
                    c6 = c5;
                    fArr4 = fArr;
                    i8 = i3;
                }
                int i54 = i8;
                fArr3[0] = f27;
                fArr3[1] = f28;
                fArr3[2] = f21;
                fArr3[3] = f22;
                fArr3[4] = f25;
                fArr3[5] = f26;
                i8 = i54 + 1;
                c5 = setminArr[i54].length;
                c3 = 'm';
                c4 = 0;
                setminArr2 = setminArr;
            }
        }

        public final void length(setMin setmin, setMin setmin2, float f) {
            this.length = setmin.length;
            int i = 0;
            while (true) {
                float[] fArr = setmin.getMax;
                if (i < fArr.length) {
                    this.getMax[i] = (fArr[i] * (1.0f - f)) + (setmin2.getMax[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }

        private static void setMin(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            float f8 = f;
            float f9 = f3;
            boolean z3 = z2;
            float f10 = f5;
            float f11 = f6;
            float f12 = f7;
            while (true) {
                double radians = Math.toRadians((double) f12);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d3 = (double) f8;
                Double.isNaN(d3);
                double d4 = d3 * cos;
                double d5 = d3;
                double d6 = (double) f2;
                Double.isNaN(d6);
                double d7 = (double) f10;
                Double.isNaN(d7);
                double d8 = (d4 + (d6 * sin)) / d7;
                double d9 = d7;
                double d10 = (double) (-f8);
                Double.isNaN(d10);
                Double.isNaN(d6);
                double d11 = (d10 * sin) + (d6 * cos);
                double d12 = d6;
                double d13 = (double) f11;
                Double.isNaN(d13);
                float f13 = f3;
                float f14 = f11;
                double d14 = (double) f13;
                Double.isNaN(d14);
                double d15 = d11 / d13;
                double d16 = (double) f4;
                Double.isNaN(d16);
                Double.isNaN(d9);
                float f15 = f10;
                double d17 = ((d14 * cos) + (d16 * sin)) / d9;
                double d18 = (double) (-f13);
                Double.isNaN(d18);
                Double.isNaN(d16);
                Double.isNaN(d13);
                double d19 = ((d18 * sin) + (d16 * cos)) / d13;
                double d20 = d8 - d17;
                double d21 = d15 - d19;
                double d22 = (d8 + d17) / 2.0d;
                double d23 = (d15 + d19) / 2.0d;
                double d24 = (d20 * d20) + (d21 * d21);
                if (d24 != 0.0d) {
                    double d25 = (1.0d / d24) - 0.25d;
                    if (d25 < 0.0d) {
                        float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
                        f10 = f15 * sqrt;
                        f11 = f14 * sqrt;
                        f12 = f7;
                        boolean z4 = z2;
                        float f16 = f13;
                        f8 = f;
                    } else {
                        double sqrt2 = Math.sqrt(d25);
                        double d26 = d20 * sqrt2;
                        double d27 = sqrt2 * d21;
                        boolean z5 = z2;
                        if (z == z5) {
                            d2 = d22 - d27;
                            d = d23 + d26;
                        } else {
                            d2 = d22 + d27;
                            d = d23 - d26;
                        }
                        double atan2 = Math.atan2(d15 - d, d8 - d2);
                        double atan22 = Math.atan2(d19 - d, d17 - d2) - atan2;
                        if (z5 != (atan22 >= 0.0d)) {
                            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
                        }
                        Double.isNaN(d9);
                        double d28 = d2 * d9;
                        Double.isNaN(d13);
                        double d29 = d * d13;
                        double d30 = d12;
                        setMax(path, (d28 * cos) - (d29 * sin), (d28 * sin) + (d29 * cos), d9, d13, d5, d12, radians, atan2, atan22);
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        private static void setMax(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = (double) ceil;
            Double.isNaN(d18);
            double d19 = d9 / d18;
            double d20 = d8;
            double d21 = d17;
            double d22 = d14;
            int i = 0;
            double d23 = d5;
            double d24 = d6;
            while (i < ceil) {
                double d25 = d20 + d19;
                double sin3 = Math.sin(d25);
                double cos3 = Math.cos(d25);
                double d26 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d27 = d2 + (d10 * sin * cos3) + (d16 * sin3);
                double d28 = (d12 * sin3) - (d13 * cos3);
                double d29 = (sin3 * d15) + (cos3 * d16);
                double d30 = d25 - d20;
                double tan = Math.tan(d30 / 2.0d);
                double sin4 = (Math.sin(d30) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d31 = d23 + (d22 * sin4);
                double d32 = cos;
                double d33 = sin;
                path.rLineTo(0.0f, 0.0f);
                float f = (float) (d26 - (sin4 * d28));
                float f2 = (float) (d27 - (sin4 * d29));
                path.cubicTo((float) d31, (float) (d24 + (d21 * sin4)), f, f2, (float) d26, (float) d27);
                i++;
                d19 = d19;
                sin = d33;
                d23 = d26;
                d15 = d15;
                cos = d32;
                d20 = d25;
                d21 = d29;
                d22 = d28;
                ceil = ceil;
                d24 = d27;
                d10 = d3;
            }
        }
    }
}
