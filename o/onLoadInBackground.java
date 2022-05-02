package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.google.common.base.Ascii;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import o.unregisterListener;

public final class onLoadInBackground {
    public static final int getMax = 0;
    private static int getMin = 1;
    private static int length;
    private static byte[] setMax;
    static int setMin = 0;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(int r7, short r8, short r9) {
        /*
            int r0 = getMin
            int r0 = r0 + 117
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            int r7 = 116 - r7
            int r8 = r8 + 4
            byte[] r0 = setMax
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            int r9 = r9 + -1
            r2 = 16
            if (r0 == 0) goto L_0x001d
            r3 = 85
            goto L_0x001f
        L_0x001d:
            r3 = 16
        L_0x001f:
            r4 = 0
            if (r3 == r2) goto L_0x0029
            r2 = r1
            r3 = 0
            r1 = r0
            r0 = r9
            r9 = r7
            r7 = r8
            goto L_0x003e
        L_0x0029:
            r7 = r8
            r2 = r1
            r3 = 0
            r1 = r0
            r0 = r9
        L_0x002e:
            int r9 = r9 - r8
            int r7 = r7 + 1
            int r8 = r9 + -1
            int r9 = length
            int r9 = r9 + 25
            int r5 = r9 % 128
            getMin = r5
            int r9 = r9 % 2
            r9 = r8
        L_0x003e:
            byte r8 = (byte) r9
            r2[r3] = r8
            int r8 = r3 + 1
            if (r3 != r0) goto L_0x0055
            java.lang.String r7 = new java.lang.String
            r7.<init>(r2, r4)
            int r8 = getMin
            int r8 = r8 + 113
            int r9 = r8 % 128
            length = r9
            int r8 = r8 % 2
            return r7
        L_0x0055:
            byte r3 = r1[r7]
            r6 = r3
            r3 = r8
            r8 = r6
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onLoadInBackground.getMin(int, short, short):java.lang.String");
    }

    private static void getMin() {
        byte[] bArr = new byte[648];
        System.arraycopy("\u000b£\fÀ\u0005ç\u0001&Ü\u0011ûÒ\tñ\u0002\u0005\u00047èô\u0010ûÒ\tñ\u0002\u0005\u0004CÛÞ\u0002ì\r\u0001ö\bò\u0010ì\u000e!Ýòý\n\u0002ü\u0005\u0001ì\u000e\bê\u00142º\r\u0001í\u0002\bôúJÊýòýEÕ\"\u0004öõÝòý\n\u0002ü\u0005\u0001ì\u000eò\tñ\u0002\u0005\u00045Êó\u0000ù\u000eöùEêÓ\u0000ù\u000eì\u0003ñ\u0001\u0010ýý\u0005ùö\fþõ\u0006\u0000Cå\u0019»ù\u0005CÃ\u0005ò\u0003\bø<Êþ\u0002ì\r7º\u0001\u0010ýùú\u00067º\u0001\u0010ýùú\u0006\u0007ï\u0000\u0001ð Ý\u0012÷\u0004\u0001î\u001b\"\u0004ÿßÝ\bú\nùø\u000eô¾ý\u0002\u000b3»\rø\u00056»þ\u0012ìþ\u0001\bê\u0014èIº\r\u0001í\u0002\bôúJÌë\u0000\u000b9µB\u0004ÿ\u0001Õ\"\u0004ÿßÝ\bú\nùø\u000eô\bê\u00142º\r\u0001í\u0002\bôúJÊýòýEêÝòý\n\u0002ü\u0005\u0001ì\u000e\u001eäýî\u0004üøò\tñ\u0002\u0005\u00045Êó\u0000ù\u000eöùE½\u0002>Ýîý÷\tù\u0001\u0017ëò\fù\u0001ò)ø\u0004ö»ù\u0005CÃ\u0005ò\u0003\bø<Êþ\u0002ì\r7º\u0001\u0010ýùú\u00067Ëí\u0002ÿ\föù\u0014ê\u0001\u0010ýýòò\tñ\u0002\u0005\u00045Êó\u0000ù\u000eöùE½\u0002>Ýîý÷\tù\u0001\u001bÚ\u0007öþþ\t\u0001ø\fìþ\u0002\fñ¾ý\u0002\u000b3»ù\u0005CÃ\u0005ò\u0003\bø<Èñ\u0001\u0010ýý\u0005ùö\fþõ\u0006\u0000ò\tñ\u0002\u0005\u00045¾ûDéÞ\u0002ì\rõ.Þ\u0002ì\rÿ\u0001ò.Ó\u0000ÿ\b\u0001î\u000e\u0000\u0001ð#îý÷\tù\u0001\u001bÚ\u0007ö\u0001\u0010ýùú\u0006\u0007ï\u0000Må\u0019Üü\u0006D±þúS­\f\u0003ü\u0002þõ\u0006Dí\u0002ÿ\föù\u0014ê\u0001\u0010ýýòQå\u0019\u0001\u0010ýýò\u0001\u0006\u0004\u0001ð2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000$Ú\u0007ö\u0002@Éþ\u0002ì\rÿ\u0005þõ\u0006ô\u0010ûÒ\tñ\u0002\u0005\u0004CÛÞ\u0002ì\r:Ü\u0011ûÒ\tñ\u0002\u0005\u00047è\u0005ç\u0001\u0004,È\u0004\u000e#Îÿ\u0010ç\u0001ð#îý÷\tù\u0001\u0017ëò\fù\u0001ò\u0001ð#îý÷\tù\u0001\u0016ìó\u0007\u0001ð*Úúþ\u0012ò\nýò\tñ\u0002\u0005\u00045Êó\u0000ù\u000eöùE½\u0002>Úé\u0001ø\fìþ\u0002\f".getBytes("ISO-8859-1"), 0, bArr, 0, 648);
        setMax = bArr;
        getMax = 109;
    }

    static {
        getMin();
        int i = getMin;
        int i2 = (i ^ 19) + ((i & 19) << 1);
        length = i2 % 128;
        int i3 = i2 % 2;
    }

    public static int length(Context context, int i) {
        boolean z;
        int i2 = getMin + 97;
        length = i2 % 128;
        int i3 = i2 % 2;
        try {
            Class<?> cls = Class.forName(getMin((byte) (-setMax[59]), (short) setMax[502], (byte) setMax[607]));
            byte b = (byte) setMax[33];
            Class[] clsArr = null;
            boolean z2 = false;
            if (((((ApplicationInfo) cls.getMethod(getMin(b, (short) ((b ^ 496) | (b & 496)), (byte) setMax[9]), clsArr).invoke(context, clsArr)).flags & 2) == 0 ? 'N' : 'R') != 'R') {
                int i4 = getMin;
                int i5 = (i4 ^ 71) + ((i4 & 71) << 1);
                length = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            } else {
                int i7 = (getMin + 66) - 1;
                length = i7 % 128;
                if (i7 % 2 == 0) {
                }
                z = true;
            }
            if (!(z)) {
                unregisterListener.length length2 = new unregisterListener.length();
                if ((setMax(context, length2) ? 'C' : '4') != 'C') {
                    int i8 = getMin + 9;
                    length = i8 % 128;
                    int i9 = i8 % 2;
                    if (length2.setMin()) {
                        z2 = true;
                    }
                    if (!z2) {
                        int i10 = length;
                        int i11 = (i10 ^ 49) + ((i10 & 49) << 1);
                        getMin = i11 % 128;
                        if ((i11 % 2 != 0 ? '\\' : JSONLexer.EOI) == '\\') {
                            return i;
                        }
                        super.hashCode();
                        return i;
                    }
                }
                return length2.getMin((i & -11) | ((i ^ -1) & 10));
            }
            int i12 = length;
            int i13 = (i12 ^ 1) + ((i12 & 1) << 1);
            getMin = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i ^ 1;
            int i16 = (getMin + 52) - 1;
            length = i16 % 128;
            if (i16 % 2 == 0) {
                z2 = true;
            }
            if (z2) {
                return i15;
            }
            super.hashCode();
            return i15;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r3 != r6) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e2, code lost:
        if (setMin(r1) == false) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int setMax(int r8) {
        /*
            r0 = 2
            o.unregisterListener$length r1 = new o.unregisterListener$length     // Catch:{ Exception -> 0x0135 }
            r1.<init>()     // Catch:{ Exception -> 0x0135 }
            byte[] r2 = setMax     // Catch:{ Exception -> 0x0135 }
            r3 = 0
            byte r2 = r2[r3]     // Catch:{ Exception -> 0x0135 }
            byte r2 = (byte) r2     // Catch:{ Exception -> 0x0135 }
            r4 = 425(0x1a9, float:5.96E-43)
            byte[] r5 = setMax     // Catch:{ Exception -> 0x0135 }
            r6 = 162(0xa2, float:2.27E-43)
            byte r5 = r5[r6]     // Catch:{ Exception -> 0x0135 }
            byte r5 = (byte) r5     // Catch:{ Exception -> 0x0135 }
            java.lang.String r2 = getMin(r2, r4, r5)     // Catch:{ Exception -> 0x0135 }
            byte[] r4 = setMax     // Catch:{ Exception -> 0x0135 }
            r5 = 59
            byte r4 = r4[r5]     // Catch:{ Exception -> 0x0135 }
            int r4 = -r4
            byte r4 = (byte) r4     // Catch:{ Exception -> 0x0135 }
            r5 = 410(0x19a, float:5.75E-43)
            byte[] r6 = setMax     // Catch:{ Exception -> 0x0135 }
            r7 = 13
            byte r6 = r6[r7]     // Catch:{ Exception -> 0x0135 }
            int r6 = -r6
            byte r6 = (byte) r6     // Catch:{ Exception -> 0x0135 }
            java.lang.String r4 = getMin(r4, r5, r6)     // Catch:{ Exception -> 0x0135 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x0135 }
            java.lang.Object r2 = o.unregisterListener.setMax((java.lang.String) r2, (java.lang.Object) r4, (o.unregisterListener.length) r1)     // Catch:{ Exception -> 0x0135 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0135 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0135 }
            r4 = 0
            if (r2 != 0) goto L_0x0115
            boolean r2 = r1.setMin()     // Catch:{ Exception -> 0x0135 }
            r5 = 1
            if (r2 != 0) goto L_0x0049
            r2 = 1
            goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            if (r2 == r5) goto L_0x004e
            goto L_0x0115
        L_0x004e:
            boolean r2 = setMax((o.unregisterListener.length) r1)     // Catch:{ Exception -> 0x0135 }
            if (r2 != 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r3 = 1
        L_0x0056:
            r2 = 36
            if (r3 == r5) goto L_0x005b
            goto L_0x008c
        L_0x005b:
            int r3 = getMin
            r6 = r3 | 85
            int r6 = r6 << r5
            r3 = r3 ^ 85
            int r6 = r6 - r3
            int r3 = r6 % 128
            length = r3
            int r6 = r6 % r0
            r3 = 73
            if (r6 != 0) goto L_0x006f
            r6 = 73
            goto L_0x0070
        L_0x006f:
            r6 = 2
        L_0x0070:
            if (r6 == r3) goto L_0x007e
            int r3 = o.loadInBackground.setMax     // Catch:{ Exception -> 0x0135 }
            int r6 = setMin     // Catch:{ Exception -> 0x0135 }
            super.hashCode()     // Catch:{ all -> 0x007c }
            if (r3 == r6) goto L_0x008c
            goto L_0x0092
        L_0x007c:
            r8 = move-exception
            throw r8
        L_0x007e:
            int r3 = o.loadInBackground.setMax     // Catch:{ Exception -> 0x0135 }
            int r4 = setMin     // Catch:{ Exception -> 0x0135 }
            if (r3 == r4) goto L_0x0087
            r3 = 58
            goto L_0x0089
        L_0x0087:
            r3 = 36
        L_0x0089:
            if (r3 == r2) goto L_0x008c
            goto L_0x0092
        L_0x008c:
            boolean r3 = r1.setMin()     // Catch:{ Exception -> 0x0135 }
            if (r3 == 0) goto L_0x00a2
        L_0x0092:
            r2 = r8 ^ 10
            int r8 = r1.getMin(r2)     // Catch:{ Exception -> 0x0135 }
            int r1 = getMin
            int r1 = r1 + 63
            int r2 = r1 % 128
            length = r2
            int r1 = r1 % r0
            return r8
        L_0x00a2:
            boolean r3 = length(r1)     // Catch:{ Exception -> 0x0135 }
            r4 = 26
            r6 = 25
            if (r3 != 0) goto L_0x00af
            r3 = 26
            goto L_0x00b1
        L_0x00af:
            r3 = 25
        L_0x00b1:
            if (r3 == r4) goto L_0x00e4
            int r3 = length
            r4 = r3 & 45
            r3 = r3 | 45
            int r4 = r4 + r3
            int r3 = r4 % 128
            getMin = r3
            int r4 = r4 % r0
            boolean r3 = getMin(r1)     // Catch:{ Exception -> 0x0135 }
            r4 = 28
            if (r3 != 0) goto L_0x00c9
            r2 = 28
        L_0x00c9:
            if (r2 == r4) goto L_0x00e4
            int r2 = getMin
            int r2 = r2 + 70
            int r2 = r2 - r5
            int r3 = r2 % 128
            length = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L_0x00de
            boolean r2 = setMin(r1)     // Catch:{ Exception -> 0x0135 }
            if (r2 == 0) goto L_0x00e4
            goto L_0x00f3
        L_0x00de:
            boolean r2 = setMin(r1)     // Catch:{ Exception -> 0x0135 }
            if (r2 != 0) goto L_0x00f3
        L_0x00e4:
            boolean r2 = r1.setMin()     // Catch:{ Exception -> 0x0135 }
            r3 = 90
            if (r2 != 0) goto L_0x00ef
            r2 = 90
            goto L_0x00f1
        L_0x00ef:
            r2 = 39
        L_0x00f1:
            if (r2 == r3) goto L_0x010c
        L_0x00f3:
            r2 = r8 & -21
            r3 = r8 ^ -1
            r3 = r3 & 20
            r2 = r2 | r3
            int r8 = r1.getMin(r2)     // Catch:{ Exception -> 0x0135 }
            int r1 = getMin
            r2 = r1 | 17
            int r2 = r2 << r5
            r1 = r1 ^ 17
            int r2 = r2 - r1
            int r1 = r2 % 128
            length = r1
            int r2 = r2 % r0
            return r8
        L_0x010c:
            int r1 = getMin
            int r1 = r1 + r6
            int r2 = r1 % 128
            length = r2
            int r1 = r1 % r0
            return r8
        L_0x0115:
            r2 = r8 & 1
            r2 = r2 ^ -1
            r3 = r8 | 1
            r2 = r2 & r3
            int r8 = r1.getMin(r2)     // Catch:{ Exception -> 0x0135 }
            int r1 = getMin
            r2 = r1 & 9
            r1 = r1 | 9
            int r2 = r2 + r1
            int r1 = r2 % 128
            length = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L_0x012f
            return r8
        L_0x012f:
            super.hashCode()     // Catch:{ all -> 0x0133 }
            return r8
        L_0x0133:
            r8 = move-exception
            throw r8
        L_0x0135:
            r1 = r8 & 2
            r1 = r1 ^ -1
            r8 = r8 | r0
            r8 = r8 & r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onLoadInBackground.setMax(int):int");
    }

    private static boolean length(unregisterListener.length length2) {
        BufferedReader bufferedReader;
        int i = length;
        int i2 = (i & 31) + (i | 31);
        getMin = i2 % 128;
        int i3 = i2 % 2;
        try {
            File file = (File) unregisterListener.getMin(File.class, new Class[]{String.class}, new Object[]{getMin((byte) setMax[69], 380, (byte) setMax[262])}, length2);
            if ((file.canRead() ? 12 : '_') != 12) {
                int i4 = length;
                int i5 = (i4 ^ 69) + ((i4 & 69) << 1);
                getMin = i5 % 128;
                int i6 = i5 % 2;
                file.getAbsolutePath();
                return false;
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            if (!bufferedReader.readLine().equals(getMin((byte) setMax[28], 538, (byte) setMax[94]))) {
                bufferedReader.close();
                int i7 = length + 3;
                getMin = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            int i9 = getMin;
            int i10 = (i9 ^ 17) + ((i9 & 17) << 1);
            length = i10 % 128;
            if ((i10 % 2 == 0 ? (char) 30 : 31) != 31) {
                bufferedReader.close();
                return true;
            }
            bufferedReader.close();
            return true;
        } catch (Exception unused) {
        } catch (Throwable th) {
            bufferedReader.close();
            throw th;
        }
    }

    private static boolean getMin(unregisterListener.length length2) {
        BufferedReader bufferedReader;
        int i = getMin + 103;
        length = i % 128;
        int i2 = i % 2;
        Class<File> cls = File.class;
        try {
            byte b = (byte) setMax[69];
            File file = (File) unregisterListener.getMin((Class) cls, new Class[]{String.class}, new Object[]{getMin(b, (short) (b | Framer.STDERR_FRAME_PREFIX), (byte) setMax[449])}, length2);
            if ((file.canRead() ? '.' : '8') != '8') {
                bufferedReader = new BufferedReader(new FileReader(file));
                if ((!bufferedReader.readLine().equals(getMin((byte) setMax[28], 538, (byte) setMax[94])) ? 'H' : 28) != 28) {
                    bufferedReader.close();
                    int i3 = getMin + 109;
                    length = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                int i5 = length + 1;
                getMin = i5 % 128;
                int i6 = i5 % 2;
                bufferedReader.close();
                int i7 = length + 73;
                getMin = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
            int i9 = getMin;
            int i10 = ((i9 | 103) << 1) - (i9 ^ 103);
            length = i10 % 128;
            if (!(i10 % 2 == 0)) {
                file.getAbsolutePath();
                return true;
            }
            file.getAbsolutePath();
            return false;
        } catch (Exception unused) {
        } catch (Throwable th) {
            bufferedReader.close();
            throw th;
        }
    }

    private static boolean setMin(unregisterListener.length length2) {
        BufferedReader bufferedReader;
        int i = getMin;
        int i2 = (i & 17) + (i | 17);
        length = i2 % 128;
        int i3 = i2 % 2;
        Class<File> cls = File.class;
        try {
            byte b = setMax[7];
            File file = (File) unregisterListener.getMin((Class) cls, new Class[]{String.class}, new Object[]{getMin((byte) setMax[69], 301, (byte) (((b | 1) << 1) - (b ^ 1)))}, length2);
            char c = 'F';
            if ((file.canRead() ? ']' : '[') != '[') {
                bufferedReader = new BufferedReader(new FileReader(file));
                if ((bufferedReader.readLine().equals(getMin((byte) setMax[118], 369, (byte) setMax[14])) ? 'O' : 7) != 7) {
                    bufferedReader.close();
                    return false;
                }
                int i4 = getMin;
                int i5 = (i4 ^ 39) + ((i4 & 39) << 1);
                length = i5 % 128;
                if (i5 % 2 == 0) {
                }
                bufferedReader.close();
                int i6 = length;
                int i7 = (i6 & 39) + (i6 | 39);
                getMin = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
            int i9 = getMin + 121;
            length = i9 % 128;
            if (i9 % 2 == 0) {
                c = ')';
            }
            if (c != ')') {
                file.getAbsolutePath();
                return false;
            }
            file.getAbsolutePath();
            return false;
        } catch (Exception unused) {
        } catch (Throwable th) {
            bufferedReader.close();
            throw th;
        }
    }

    private static boolean setMax(Context context, unregisterListener.length length2) {
        int i = (getMin + 92) - 1;
        length = i % 128;
        int i2 = i % 2;
        try {
            byte b = (byte) setMax[14];
            if ((Integer.valueOf(unregisterListener.getMax(context, getMin(b, (short) ((b ^ Ascii.FF) | (b & Ascii.FF)), (byte) setMax[2]), length2)).intValue() != 1 ? 'H' : 4) != 4) {
                int i3 = (getMin + 94) - 1;
                length = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = length;
            int i6 = (i5 ^ 69) + ((i5 & 69) << 1);
            getMin = i6 % 128;
            if (i6 % 2 != 0) {
            }
            int i7 = getMin;
            int i8 = ((i7 | 121) << 1) - (i7 ^ 121);
            length = i8 % 128;
            int i9 = i8 % 2;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:66|67|(2:70|71)|72|73) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0161 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015e A[SYNTHETIC, Splitter:B:70:0x015e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean setMax(o.unregisterListener.length r11) {
        /*
            r0 = 27
            r1 = 0
            java.lang.Class<java.io.File> r2 = java.io.File.class
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r1] = r5     // Catch:{  }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{  }
            byte[] r6 = setMax     // Catch:{  }
            r7 = 69
            byte r6 = r6[r7]     // Catch:{  }
            byte r6 = (byte) r6     // Catch:{  }
            r7 = 176(0xb0, float:2.47E-43)
            byte[] r8 = setMax     // Catch:{  }
            r9 = 20
            byte r8 = r8[r9]     // Catch:{  }
            byte r8 = (byte) r8     // Catch:{  }
            java.lang.String r6 = getMin(r6, r7, r8)     // Catch:{  }
            r5[r1] = r6     // Catch:{  }
            java.lang.Object r11 = o.unregisterListener.getMin((java.lang.Class) r2, (java.lang.Class[]) r4, (java.lang.Object[]) r5, (o.unregisterListener.length) r11)     // Catch:{  }
            java.io.File r11 = (java.io.File) r11     // Catch:{  }
            r2 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x015b }
            java.io.FileReader r5 = new java.io.FileReader     // Catch:{ all -> 0x015b }
            r5.<init>(r11)     // Catch:{ all -> 0x015b }
            r4.<init>(r5)     // Catch:{ all -> 0x015b }
            int r11 = getMin
            int r11 = r11 + 37
        L_0x0039:
            int r2 = r11 % 128
            length = r2
            int r11 = r11 % 2
        L_0x003f:
            java.lang.String r11 = r4.readLine()     // Catch:{ all -> 0x0158 }
            if (r11 != 0) goto L_0x0047
            r2 = 0
            goto L_0x0048
        L_0x0047:
            r2 = 1
        L_0x0048:
            if (r2 == r3) goto L_0x005d
            r4.close()     // Catch:{ Exception -> 0x0162 }
            int r11 = length
            r2 = r11 | 55
            int r2 = r2 << r3
            r11 = r11 ^ 55
            int r2 = r2 - r11
            int r11 = r2 % 128
            getMin = r11
            int r2 = r2 % 2
            goto L_0x0162
        L_0x005d:
            int r2 = getMin
            r5 = r2 ^ 29
            r2 = r2 & 29
            int r2 = r2 << r3
            int r5 = r5 + r2
            int r2 = r5 % 128
            length = r2
            int r5 = r5 % 2
            r2 = 113(0x71, float:1.58E-43)
            r6 = 94
            if (r5 == 0) goto L_0x008f
            java.lang.String r5 = r11.toLowerCase()     // Catch:{ all -> 0x0158 }
            byte[] r7 = setMax     // Catch:{ all -> 0x0158 }
            byte r7 = r7[r2]     // Catch:{ all -> 0x0158 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x0158 }
            r8 = r7 & 570(0x23a, float:7.99E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x0158 }
            byte[] r9 = setMax     // Catch:{ all -> 0x0158 }
            r10 = 74
            byte r9 = r9[r10]     // Catch:{ all -> 0x0158 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0158 }
            java.lang.String r7 = getMin(r7, r8, r9)     // Catch:{ all -> 0x0158 }
            boolean r5 = r5.contains(r7)     // Catch:{ all -> 0x0158 }
            if (r5 != 0) goto L_0x00b8
            goto L_0x003f
        L_0x008f:
            java.lang.String r5 = r11.toLowerCase()     // Catch:{ all -> 0x0158 }
            byte[] r7 = setMax     // Catch:{ all -> 0x0158 }
            byte r7 = r7[r6]     // Catch:{ all -> 0x0158 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x0158 }
            r8 = r7 ^ 501(0x1f5, float:7.02E-43)
            r9 = r7 & 501(0x1f5, float:7.02E-43)
            r8 = r8 | r9
            short r8 = (short) r8     // Catch:{ all -> 0x0158 }
            byte[] r9 = setMax     // Catch:{ all -> 0x0158 }
            r10 = 36
            byte r9 = r9[r10]     // Catch:{ all -> 0x0158 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0158 }
            java.lang.String r7 = getMin(r7, r8, r9)     // Catch:{ all -> 0x0158 }
            boolean r5 = r5.contains(r7)     // Catch:{ all -> 0x0158 }
            r7 = 53
            if (r5 != 0) goto L_0x00b4
            r5 = 53
            goto L_0x00b6
        L_0x00b4:
            r5 = 81
        L_0x00b6:
            if (r5 == r7) goto L_0x003f
        L_0x00b8:
            int r5 = length
            int r5 = r5 + r2
            int r2 = r5 % 128
            getMin = r2
            int r5 = r5 % 2
            byte[] r2 = setMax     // Catch:{ all -> 0x0158 }
            r5 = 557(0x22d, float:7.8E-43)
            byte r2 = r2[r5]     // Catch:{ all -> 0x0158 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x0158 }
            r5 = 594(0x252, float:8.32E-43)
            byte[] r7 = setMax     // Catch:{ all -> 0x0158 }
            byte r6 = r7[r6]     // Catch:{ all -> 0x0158 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = getMin(r2, r5, r6)     // Catch:{ all -> 0x0158 }
            int r2 = r11.lastIndexOf(r2)     // Catch:{ all -> 0x0158 }
            if (r2 > 0) goto L_0x00db
            r5 = 1
            goto L_0x00dc
        L_0x00db:
            r5 = 0
        L_0x00dc:
            if (r5 == r3) goto L_0x0152
            int r5 = length
            r6 = r5 ^ 101(0x65, float:1.42E-43)
            r5 = r5 & 101(0x65, float:1.42E-43)
            int r5 = r5 << r3
            int r6 = r6 + r5
            int r5 = r6 % 128
            getMin = r5
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x00f1
            r5 = 27
            goto L_0x00f3
        L_0x00f1:
            r5 = 86
        L_0x00f3:
            if (r5 == r0) goto L_0x00fe
            int r2 = r2 >> 0
            java.lang.String r11 = r11.substring(r2)     // Catch:{ all -> 0x0158 }
            if (r11 != 0) goto L_0x0112
            goto L_0x0152
        L_0x00fe:
            r5 = r2 & 1
            r2 = r2 | 1
            int r5 = r5 + r2
            java.lang.String r11 = r11.substring(r5)     // Catch:{ all -> 0x0158 }
            r2 = 56
            if (r11 != 0) goto L_0x010e
            r5 = 56
            goto L_0x0110
        L_0x010e:
            r5 = 15
        L_0x0110:
            if (r5 == r2) goto L_0x0152
        L_0x0112:
            int r2 = length
            r5 = r2 | 79
            int r5 = r5 << r3
            r2 = r2 ^ 79
            int r5 = r5 - r2
            int r2 = r5 % 128
            getMin = r2
            int r5 = r5 % 2
            java.lang.String r11 = r11.trim()     // Catch:{ all -> 0x0158 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0158 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0158 }
            r5 = 35
            if (r2 > 0) goto L_0x0133
            r2 = 35
            goto L_0x0135
        L_0x0133:
            r2 = 47
        L_0x0135:
            if (r2 == r5) goto L_0x0152
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0158 }
            int r11 = r11.intValue()     // Catch:{ all -> 0x0158 }
            setMin = r11     // Catch:{ all -> 0x0158 }
            r4.close()     // Catch:{ IOException -> 0x0144 }
        L_0x0144:
            int r11 = getMin
            r0 = r11 & 11
            r11 = r11 | 11
            int r0 = r0 + r11
            int r11 = r0 % 128
            length = r11
            int r0 = r0 % 2
            return r3
        L_0x0152:
            int r11 = getMin
            int r11 = r11 + 39
            goto L_0x0039
        L_0x0158:
            r11 = move-exception
            r2 = r4
            goto L_0x015c
        L_0x015b:
            r11 = move-exception
        L_0x015c:
            if (r2 == 0) goto L_0x0161
            r2.close()     // Catch:{ IOException -> 0x0161 }
        L_0x0161:
            throw r11     // Catch:{  }
        L_0x0162:
            int r11 = getMin
            int r11 = r11 + r0
            int r0 = r11 % 128
            length = r0
            int r11 = r11 % 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onLoadInBackground.setMax(o.unregisterListener$length):boolean");
    }

    public static int setMax(Context context, int i) {
        Context context2 = context;
        try {
            Object[] objArr = new Object[2];
            char c = 0;
            char c2 = '-';
            objArr[0] = Class.forName(getMin((byte) setMax[45], 192, (byte) (-setMax[29]))).getDeclaredConstructor(new Class[]{String.class}).newInstance(new Object[]{getMin((byte) ((setMax[55] - 0) - 1), 538, (byte) setMax[262])});
            char c3 = '^';
            objArr[1] = Class.forName(getMin((byte) setMax[45], 192, (byte) (-setMax[29]))).getDeclaredConstructor(new Class[]{String.class}).newInstance(new Object[]{getMin((byte) ((setMax[55] - 0) - 1), (short) setMax[94], (byte) setMax[262])});
            char c4 = ';';
            char c5 = '!';
            Object invoke = Class.forName(getMin((byte) (-setMax[59]), (short) setMax[502], (byte) setMax[607])).getMethod(getMin((byte) setMax[33], 578, (byte) setMax[20]), (Class[]) null).invoke(context2, (Object[]) null);
            Object invoke2 = Class.forName(getMin((byte) (-setMax[59]), (short) setMax[502], (byte) setMax[607])).getMethod(getMin((byte) setMax[33], 594, (byte) setMax[33]), (Class[]) null).invoke(context2, (Object[]) null);
            Object[] objArr2 = new Object[2];
            objArr2[1] = 64;
            objArr2[0] = invoke2;
            Object invoke3 = Class.forName(getMin((byte) (-setMax[59]), 265, (byte) setMax[160])).getMethod(getMin((byte) setMax[33], 443, (byte) setMax[33]), new Class[]{String.class, Integer.TYPE}).invoke(invoke, objArr2);
            byte b = setMax[262];
            Class<?> cls = Class.forName(getMin((byte) (-setMax[59]), 340, (byte) (((b | -1) << 1) - (b ^ -1))));
            byte b2 = (byte) setMax[6];
            Object[] objArr3 = (Object[]) cls.getField(getMin(b2, (short) ((b2 ^ 370) | (b2 & 370)), (byte) setMax[12])).get(invoke3);
            int length2 = objArr3.length;
            int i2 = 0;
            while (i2 < length2) {
                Object obj = objArr3[i2];
                Object[] objArr4 = new Object[1];
                objArr4[c] = getMin((byte) (-setMax[263]), 297, (byte) setMax[16]);
                Class<?> cls2 = Class.forName(getMin((byte) setMax[c2], 229, (byte) setMax[526]));
                byte b3 = (byte) setMax[c5];
                String min = getMin(b3, (short) ((b3 & ImageFileType.HEAD_WEBP_0) | (b3 ^ ImageFileType.HEAD_WEBP_0)), (byte) setMax[c2]);
                Class[] clsArr = new Class[1];
                clsArr[c] = String.class;
                Object invoke4 = cls2.getMethod(min, clsArr).invoke((Object) null, objArr4);
                Class<?> cls3 = Class.forName(getMin((byte) (-setMax[c4]), 617, (byte) setMax[167]));
                byte b4 = (byte) setMax[c3];
                Object[] objArr5 = new Object[1];
                objArr5[c] = new ByteArrayInputStream((byte[]) cls3.getMethod(getMin(b4, (short) ((b4 & 568) | (b4 ^ 568)), (byte) setMax[c2]), (Class[]) null).invoke(obj, (Object[]) null));
                Class<?> cls4 = Class.forName(getMin((byte) setMax[c2], 229, (byte) setMax[526]));
                String min2 = getMin((byte) setMax[33], (short) setMax[262], (byte) setMax[162]);
                Class[] clsArr2 = new Class[1];
                clsArr2[c] = InputStream.class;
                Object invoke5 = cls4.getMethod(min2, clsArr2).invoke(invoke4, objArr5);
                int i3 = 0;
                while (i3 < 2) {
                    if (objArr[i3].equals(Class.forName(getMin((byte) setMax[c2], (short) (-setMax[516]), (byte) setMax[41])).getMethod(getMin((byte) setMax[33], 154, (byte) setMax[607]), (Class[]) null).invoke(invoke5, (Object[]) null))) {
                        return ((i & 1) ^ -1) & (i | 1);
                    }
                    i3++;
                    c2 = '-';
                }
                i2 = ((i2 | 1) << 1) - (i2 ^ 1);
                c4 = ';';
                c = 0;
                c3 = '^';
                c2 = '-';
                c5 = '!';
            }
        } catch (Throwable unused) {
        }
        return i;
    }
}
