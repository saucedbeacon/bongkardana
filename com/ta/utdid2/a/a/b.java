package com.ta.utdid2.a.a;

import android.annotation.SuppressLint;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;

public class b {
    static final /* synthetic */ boolean j = (!b.class.desiredAssertionStatus());

    static abstract class a {
        public int op;
        public byte[] output;

        a() {
        }
    }

    public static byte[] decode(String str, int i) {
        return decode(str.getBytes(), i);
    }

    public static byte[] decode(byte[] bArr, int i) {
        return decode(bArr, 0, bArr.length, i);
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) {
        C0036b bVar = new C0036b(i3, new byte[((i2 * 3) / 4)]);
        if (!bVar.process(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        } else if (bVar.op == bVar.output.length) {
            return bVar.output;
        } else {
            byte[] bArr2 = new byte[bVar.op];
            System.arraycopy(bVar.output, 0, bArr2, 0, bVar.op);
            return bArr2;
        }
    }

    /* renamed from: com.ta.utdid2.a.a.b$b  reason: collision with other inner class name */
    static class C0036b extends a {

        /* renamed from: a  reason: collision with root package name */
        private static final int[] f9848a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private final int[] c;
        private int state;
        private int value;

        public C0036b(int i, byte[] bArr) {
            this.output = bArr;
            this.c = (i & 8) == 0 ? f9848a : b;
            this.state = 0;
            this.value = 0;
        }

        public boolean process(byte[] bArr, int i, int i2, boolean z) {
            int i3 = this.state;
            if (i3 == 6) {
                return false;
            }
            int i4 = i2 + i;
            int i5 = this.value;
            byte[] bArr2 = this.output;
            int[] iArr = this.c;
            int i6 = i5;
            int i7 = 0;
            int i8 = i3;
            int i9 = i;
            while (i9 < i4) {
                if (i8 == 0) {
                    while (true) {
                        int i10 = i9 + 4;
                        if (i10 > i4) {
                            break;
                        }
                        i6 = iArr[bArr[i9 + 3] & 255] | (iArr[bArr[i9 + 1] & 255] << 12) | (iArr[bArr[i9] & 255] << 18) | (iArr[bArr[i9 + 2] & 255] << 6);
                        if (i6 < 0) {
                            break;
                        }
                        bArr2[i7 + 2] = (byte) i6;
                        bArr2[i7 + 1] = (byte) (i6 >> 8);
                        bArr2[i7] = (byte) (i6 >> 16);
                        i7 += 3;
                        i9 = i10;
                    }
                    if (i9 >= i4) {
                        break;
                    }
                }
                int i11 = i9 + 1;
                int i12 = iArr[bArr[i9] & 255];
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 == 4) {
                                    if (i12 != -2) {
                                        if (i12 != -1) {
                                            this.state = 6;
                                            return false;
                                        }
                                    }
                                    i8++;
                                } else if (i8 == 5 && i12 != -1) {
                                    this.state = 6;
                                    return false;
                                }
                            } else if (i12 >= 0) {
                                i6 = (i6 << 6) | i12;
                                bArr2[i7 + 2] = (byte) i6;
                                bArr2[i7 + 1] = (byte) (i6 >> 8);
                                bArr2[i7] = (byte) (i6 >> 16);
                                i7 += 3;
                                i9 = i11;
                                i8 = 0;
                            } else if (i12 == -2) {
                                bArr2[i7 + 1] = (byte) (i6 >> 2);
                                bArr2[i7] = (byte) (i6 >> 10);
                                i7 += 2;
                                i9 = i11;
                                i8 = 5;
                            } else if (i12 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (i12 < 0) {
                            if (i12 == -2) {
                                bArr2[i7] = (byte) (i6 >> 4);
                                i7++;
                                i9 = i11;
                                i8 = 4;
                            } else if (i12 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                    } else if (i12 < 0) {
                        if (i12 != -1) {
                            this.state = 6;
                            return false;
                        }
                    }
                    i6 = (i6 << 6) | i12;
                    i8++;
                } else if (i12 >= 0) {
                    i8++;
                    i6 = i12;
                } else if (i12 != -1) {
                    this.state = 6;
                    return false;
                }
                i9 = i11;
            }
            if (!z) {
                this.state = i8;
                this.value = i6;
                this.op = i7;
                return true;
            } else if (i8 != 1) {
                if (i8 == 2) {
                    bArr2[i7] = (byte) (i6 >> 4);
                    i7++;
                } else if (i8 == 3) {
                    int i13 = i7 + 1;
                    bArr2[i7] = (byte) (i6 >> 10);
                    i7 = i13 + 1;
                    bArr2[i13] = (byte) (i6 >> 2);
                } else if (i8 == 4) {
                    this.state = 6;
                    return false;
                }
                this.state = i8;
                this.op = i7;
                return true;
            } else {
                this.state = 6;
                return false;
            }
        }
    }

    public static String encodeToString(byte[] bArr, int i) {
        try {
            return new String(encode(bArr, i), C.ASCII_NAME);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] encode(byte[] bArr, int i) {
        return encode(bArr, 0, bArr.length, i);
    }

    @SuppressLint({"Assert"})
    public static byte[] encode(byte[] bArr, int i, int i2, int i3) {
        c cVar = new c(i3, (byte[]) null);
        int i4 = (i2 / 3) * 4;
        int i5 = 2;
        if (!cVar.do_padding) {
            int i6 = i2 % 3;
            if (i6 == 1) {
                i4 += 2;
            } else if (i6 == 2) {
                i4 += 3;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (cVar.do_newline && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!cVar.do_cr) {
                i5 = 1;
            }
            i4 += i7 * i5;
        }
        cVar.output = new byte[i4];
        cVar.process(bArr, i, i2, true);
        if (j || cVar.op == i4) {
            return cVar.output;
        }
        throw new AssertionError();
    }

    static class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private static final byte[] f9849a = {65, 66, 67, 68, 69, 70, ImageFileType.HEAD_GIF_0, ImageFileType.HEAD_HEVC_0, 73, 74, 75, 76, 77, 78, 79, 80, 81, ImageFileType.HEAD_WEBP_0, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] b = {65, 66, 67, 68, 69, 70, ImageFileType.HEAD_GIF_0, ImageFileType.HEAD_HEVC_0, 73, 74, 75, 76, 77, 78, 79, 80, 81, ImageFileType.HEAD_WEBP_0, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX};
        static final /* synthetic */ boolean j = (!b.class.desiredAssertionStatus());

        /* renamed from: b  reason: collision with other field name */
        int f8838b;
        private final byte[] c;
        private int count;
        private final byte[] d;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;

        public c(int i, byte[] bArr) {
            this.output = bArr;
            boolean z = true;
            this.do_padding = (i & 1) == 0;
            this.do_newline = (i & 2) == 0;
            this.do_cr = (i & 4) == 0 ? false : z;
            this.d = (i & 8) == 0 ? f9849a : b;
            this.c = new byte[2];
            this.f8838b = 0;
            this.count = this.do_newline ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01c6  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01cc  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01d9  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x00e6 A[SYNTHETIC] */
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
            /*
                r17 = this;
                r0 = r17
                byte[] r1 = r0.d
                byte[] r2 = r0.output
                int r3 = r0.count
                int r4 = r20 + r19
                int r5 = r0.f8838b
                r6 = -1
                r7 = 2
                r8 = 0
                r9 = 1
                if (r5 == r9) goto L_0x0031
                if (r5 == r7) goto L_0x0015
                goto L_0x0050
            L_0x0015:
                int r5 = r19 + 1
                if (r5 > r4) goto L_0x0050
                byte[] r10 = r0.c
                byte r11 = r10[r8]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 16
                byte r10 = r10[r9]
                r10 = r10 & 255(0xff, float:3.57E-43)
                int r10 = r10 << 8
                r10 = r10 | r11
                byte r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r10 = r10 | r11
                r0.f8838b = r8
                r11 = r5
                goto L_0x0053
            L_0x0031:
                int r5 = r19 + 2
                if (r5 > r4) goto L_0x0050
                byte[] r5 = r0.c
                byte r5 = r5[r8]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 16
                int r10 = r19 + 1
                byte r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 8
                r5 = r5 | r11
                int r11 = r10 + 1
                byte r10 = r18[r10]
                r10 = r10 & 255(0xff, float:3.57E-43)
                r10 = r10 | r5
                r0.f8838b = r8
                goto L_0x0053
            L_0x0050:
                r11 = r19
                r10 = -1
            L_0x0053:
                r12 = 4
                r13 = 13
                r14 = 10
                if (r10 == r6) goto L_0x008f
                int r6 = r10 >> 18
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r8] = r6
                int r6 = r10 >> 12
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r9] = r6
                int r6 = r10 >> 6
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r7] = r6
                r6 = r10 & 63
                byte r6 = r1[r6]
                r10 = 3
                r2[r10] = r6
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x008d
                boolean r3 = r0.do_cr
                if (r3 == 0) goto L_0x0085
                r3 = 5
                r2[r12] = r13
                goto L_0x0086
            L_0x0085:
                r3 = 4
            L_0x0086:
                int r6 = r3 + 1
                r2[r3] = r14
            L_0x008a:
                r3 = 19
                goto L_0x0090
            L_0x008d:
                r6 = 4
                goto L_0x0090
            L_0x008f:
                r6 = 0
            L_0x0090:
                int r10 = r11 + 3
                if (r10 > r4) goto L_0x00e6
                byte r15 = r18[r11]
                r15 = r15 & 255(0xff, float:3.57E-43)
                int r15 = r15 << 16
                int r16 = r11 + 1
                byte r5 = r18[r16]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 8
                r5 = r5 | r15
                int r11 = r11 + 2
                byte r11 = r18[r11]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r5 = r5 | r11
                int r11 = r5 >> 18
                r11 = r11 & 63
                byte r11 = r1[r11]
                r2[r6] = r11
                int r11 = r6 + 1
                int r15 = r5 >> 12
                r15 = r15 & 63
                byte r15 = r1[r15]
                r2[r11] = r15
                int r11 = r6 + 2
                int r15 = r5 >> 6
                r15 = r15 & 63
                byte r15 = r1[r15]
                r2[r11] = r15
                int r11 = r6 + 3
                r5 = r5 & 63
                byte r5 = r1[r5]
                r2[r11] = r5
                int r6 = r6 + 4
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x00e4
                boolean r3 = r0.do_cr
                if (r3 == 0) goto L_0x00dd
                int r3 = r6 + 1
                r2[r6] = r13
                r6 = r3
            L_0x00dd:
                int r3 = r6 + 1
                r2[r6] = r14
                r6 = r3
                r11 = r10
                goto L_0x008a
            L_0x00e4:
                r11 = r10
                goto L_0x0090
            L_0x00e6:
                if (r21 == 0) goto L_0x01d9
                int r5 = r0.f8838b
                int r10 = r11 - r5
                int r15 = r4 + -1
                r16 = 61
                if (r10 != r15) goto L_0x0139
                if (r5 <= 0) goto L_0x00fa
                byte[] r5 = r0.c
                byte r5 = r5[r8]
                r8 = 1
                goto L_0x0100
            L_0x00fa:
                int r5 = r11 + 1
                byte r7 = r18[r11]
                r11 = r5
                r5 = r7
            L_0x0100:
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << r12
                int r7 = r0.f8838b
                int r7 = r7 - r8
                r0.f8838b = r7
                int r7 = r6 + 1
                int r8 = r5 >> 6
                r8 = r8 & 63
                byte r8 = r1[r8]
                r2[r6] = r8
                int r6 = r7 + 1
                r5 = r5 & 63
                byte r1 = r1[r5]
                r2[r7] = r1
                boolean r1 = r0.do_padding
                if (r1 == 0) goto L_0x0126
                int r1 = r6 + 1
                r2[r6] = r16
                int r6 = r1 + 1
                r2[r1] = r16
            L_0x0126:
                boolean r1 = r0.do_newline
                if (r1 == 0) goto L_0x01bd
                boolean r1 = r0.do_cr
                if (r1 == 0) goto L_0x0133
                int r1 = r6 + 1
                r2[r6] = r13
                r6 = r1
            L_0x0133:
                int r1 = r6 + 1
                r2[r6] = r14
                goto L_0x01bc
            L_0x0139:
                int r10 = r11 - r5
                int r12 = r4 + -2
                if (r10 != r12) goto L_0x01a5
                if (r5 <= r9) goto L_0x0147
                byte[] r5 = r0.c
                byte r5 = r5[r8]
                r8 = 1
                goto L_0x014d
            L_0x0147:
                int r5 = r11 + 1
                byte r10 = r18[r11]
                r11 = r5
                r5 = r10
            L_0x014d:
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << r14
                int r10 = r0.f8838b
                if (r10 <= 0) goto L_0x015b
                byte[] r10 = r0.c
                int r12 = r8 + 1
                byte r8 = r10[r8]
                goto L_0x0162
            L_0x015b:
                int r10 = r11 + 1
                byte r11 = r18[r11]
                r12 = r8
                r8 = r11
                r11 = r10
            L_0x0162:
                r8 = r8 & 255(0xff, float:3.57E-43)
                int r7 = r8 << 2
                r5 = r5 | r7
                int r7 = r0.f8838b
                int r7 = r7 - r12
                r0.f8838b = r7
                int r7 = r6 + 1
                int r8 = r5 >> 12
                r8 = r8 & 63
                byte r8 = r1[r8]
                r2[r6] = r8
                int r6 = r7 + 1
                int r8 = r5 >> 6
                r8 = r8 & 63
                byte r8 = r1[r8]
                r2[r7] = r8
                int r7 = r6 + 1
                r5 = r5 & 63
                byte r1 = r1[r5]
                r2[r6] = r1
                boolean r1 = r0.do_padding
                if (r1 == 0) goto L_0x0191
                int r1 = r7 + 1
                r2[r7] = r16
                r7 = r1
            L_0x0191:
                boolean r1 = r0.do_newline
                if (r1 == 0) goto L_0x01a3
                boolean r1 = r0.do_cr
                if (r1 == 0) goto L_0x019e
                int r1 = r7 + 1
                r2[r7] = r13
                r7 = r1
            L_0x019e:
                int r1 = r7 + 1
                r2[r7] = r14
                r7 = r1
            L_0x01a3:
                r6 = r7
                goto L_0x01bd
            L_0x01a5:
                boolean r1 = r0.do_newline
                if (r1 == 0) goto L_0x01bd
                if (r6 <= 0) goto L_0x01bd
                r1 = 19
                if (r3 == r1) goto L_0x01bd
                boolean r1 = r0.do_cr
                if (r1 == 0) goto L_0x01b8
                int r1 = r6 + 1
                r2[r6] = r13
                r6 = r1
            L_0x01b8:
                int r1 = r6 + 1
                r2[r6] = r14
            L_0x01bc:
                r6 = r1
            L_0x01bd:
                boolean r1 = j
                if (r1 != 0) goto L_0x01cc
                int r1 = r0.f8838b
                if (r1 != 0) goto L_0x01c6
                goto L_0x01cc
            L_0x01c6:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            L_0x01cc:
                boolean r1 = j
                if (r1 != 0) goto L_0x0202
                if (r11 != r4) goto L_0x01d3
                goto L_0x0202
            L_0x01d3:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            L_0x01d9:
                int r1 = r4 + -1
                if (r11 != r1) goto L_0x01ea
                byte[] r1 = r0.c
                int r2 = r0.f8838b
                int r4 = r2 + 1
                r0.f8838b = r4
                byte r4 = r18[r11]
                r1[r2] = r4
                goto L_0x0202
            L_0x01ea:
                int r4 = r4 - r7
                if (r11 != r4) goto L_0x0202
                byte[] r1 = r0.c
                int r2 = r0.f8838b
                int r4 = r2 + 1
                r0.f8838b = r4
                byte r5 = r18[r11]
                r1[r2] = r5
                int r2 = r4 + 1
                r0.f8838b = r2
                int r11 = r11 + r9
                byte r2 = r18[r11]
                r1[r4] = r2
            L_0x0202:
                r0.op = r6
                r0.count = r3
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.a.a.b.c.process(byte[], int, int, boolean):boolean");
        }
    }

    private b() {
    }
}
