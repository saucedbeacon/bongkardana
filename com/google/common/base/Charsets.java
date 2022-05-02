package com.google.common.base;

import android.os.SystemClock;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.C;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.nio.charset.Charset;
import kotlin.text.Typography;

@GwtCompatible(emulated = true)
public final class Charsets {
    public static final Charset ISO_8859_1;
    @GwtIncompatible
    public static final Charset US_ASCII;
    @GwtIncompatible
    public static final Charset UTF_16;
    @GwtIncompatible
    public static final Charset UTF_16BE;
    @GwtIncompatible
    public static final Charset UTF_16LE;
    public static final Charset UTF_8;
    private static int equals = 0;
    private static int getMax = 0;
    private static int getMin = 0;
    private static int isInside = 1;
    private static short[] length;
    private static byte[] setMax;
    private static int setMin;

    static void setMax() {
        getMin = -1258443107;
        getMax = 1653968183;
        setMax = new byte[]{-7, -79, -115, -104, -91};
        setMin = 12;
    }

    private Charsets() {
    }

    static {
        try {
            setMax();
            US_ASCII = Charset.forName(C.ASCII_NAME);
            ISO_8859_1 = Charset.forName("ISO-8859-1");
            boolean z = false;
            UTF_8 = Charset.forName(setMin(-13 - Gravity.getAbsoluteGravity(0, 0), (byte) ((SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) - 1), -1653968183 - View.resolveSizeAndState(0, 0, 0), 1258443192 - (ViewConfiguration.getLongPressTimeout() >> 16), (short) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 90)).intern());
            UTF_16BE = Charset.forName("UTF-16BE");
            UTF_16LE = Charset.forName("UTF-16LE");
            UTF_16 = Charset.forName(C.UTF16_NAME);
            int i = isInside + 43;
            equals = i % 128;
            if (i % 2 != 0) {
                z = true;
            }
            if (z) {
                Object obj = null;
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private static String setMin(int i, byte b, int i2, int i3, short s) {
        int i4;
        int i5;
        StringBuilder sb = new StringBuilder();
        try {
            int i6 = i + setMin;
            boolean z = i6 == -1;
            if (z) {
                byte[] bArr = setMax;
                if (bArr != null) {
                    i6 = (byte) (bArr[getMax + i2] + setMin);
                } else {
                    i6 = (short) (length[getMax + i2] + setMin);
                }
            }
            if (i6 > 0) {
                try {
                    int i7 = ((i2 + i6) - 2) + getMax + ((z ? Typography.greater : 'L') != 'L' ? 1 : 0);
                    char c = (char) (i3 + getMin);
                    sb.append(c);
                    int i8 = equals + 77;
                    isInside = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 1;
                    while (true) {
                        if (i10 >= i6) {
                            break;
                        }
                        if ((setMax != null ? 'D' : 29) != 29) {
                            int i11 = isInside + 117;
                            equals = i11 % 128;
                            if (i11 % 2 != 0) {
                                i5 = i7 + 102;
                                i4 = c - (((byte) (setMax[i7] - s)) ^ b);
                            } else {
                                i5 = i7 - 1;
                                i4 = c + (((byte) (setMax[i7] + s)) ^ b);
                            }
                        } else {
                            i5 = i7 - 1;
                            i4 = c + (((short) (length[i7] + s)) ^ b);
                        }
                        c = (char) i4;
                        i7 = i5;
                        sb.append(c);
                        i10++;
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            return sb.toString();
        } catch (Exception e2) {
            throw e2;
        }
    }
}
