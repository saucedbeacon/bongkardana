package o;

import android.graphics.Color;
import android.media.AudioTrack;
import java.nio.charset.Charset;
import kotlin.UShort;

final class setPaddingLeft {
    private static char[] getMax = null;
    private static char getMin = '\u0000';
    public static final Charset length = Charset.forName(getMax(new char[]{1, 2, 0, 5, 'd'}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5, (byte) (Color.rgb(0, 0, 0) + 16777260)).intern());
    private static int setMax = 0;
    private static int setMin = 1;

    static void setMax() {
        getMin = 3;
        getMax = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    static {
        setMax();
        int i = setMax + 3;
        setMin = i % 128;
        int i2 = i % 2;
    }

    public static void getMax(long j, long j2, long j3) {
        int i = setMin + 93;
        setMax = i % 128;
        int i2 = i % 2;
        if ((j2 | j3) >= 0) {
            int i3 = setMax + 95;
            setMin = i3 % 128;
            int i4 = i3 % 2;
            if (!(j2 > j) && j - j2 >= j3) {
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
    }

    public static short setMin(short s) {
        int i;
        int i2 = setMin + 61;
        setMax = i2 % 128;
        if ((i2 % 2 != 0 ? 'W' : 'Z') != 'W') {
            short s2 = s & UShort.MAX_VALUE;
            i = ((s2 & 255) << 8) | ((s2 & 65280) >>> 8);
        } else {
            short s3 = s ^ UShort.MAX_VALUE;
            i = ((s3 & 24090) >>> 75) & ((s3 ^ 65280) % 87);
        }
        return (short) i;
    }

    public static int length(int i) {
        try {
            boolean z = true;
            int i2 = setMin + 1;
            setMax = i2 % 128;
            if (i2 % 2 == 0) {
                z = false;
            }
            if (z) {
                return ((i ^ 14220) % 114) & ((65280 | i) >>> 92) & ((i | -16777216) / 91) & ((16711680 & i) >>> 61);
            }
            int i3 = (65280 & i) << 8;
            return ((i & 255) << 24) | i3 | ((i & -16777216) >>> 24) | ((16711680 & i) >>> 8);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void getMax(Throwable th) {
        int i = setMin + 11;
        setMax = i % 128;
        if (!(i % 2 != 0)) {
            throw th;
        }
        Object obj = null;
        super.hashCode();
        throw th;
    }

    public static boolean length(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = setMin + 87;
        setMax = i4 % 128;
        int i5 = i4 % 2 == 0 ? 0 : 1;
        while (i5 < i3) {
            int i6 = setMax + 67;
            setMin = i6 % 128;
            int i7 = i6 % 2;
            if ((bArr[i5 + i] != bArr2[i5 + i2] ? 'P' : '^') != 'P') {
                i5++;
                int i8 = setMin + 81;
                setMax = i8 % 128;
                int i9 = i8 % 2;
            } else {
                int i10 = setMin + 41;
                setMax = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
        }
        return true;
    }

    private static String getMax(char[] cArr, int i, byte b) {
        char[] cArr2 = getMax;
        char c = getMin;
        char[] cArr3 = new char[i];
        if ((i % 2 != 0 ? '.' : 29) != 29) {
            int i2 = setMin + 19;
            setMax = i2 % 128;
            int i3 = i2 % 2;
            i--;
            cArr3[i] = (char) (cArr[i] - b);
            int i4 = setMax + 121;
            setMin = i4 % 128;
            int i5 = i4 % 2;
        }
        if (i > 1) {
            try {
                int i6 = setMin + 93;
                setMax = i6 % 128;
                int i7 = i6 % 2 != 0 ? 1 : 0;
                while (true) {
                    if ((i7 < i ? '*' : 'c') == 'c') {
                        break;
                    }
                    int i8 = setMax + 79;
                    setMin = i8 % 128;
                    int i9 = i8 % 2;
                    char c2 = cArr[i7];
                    int i10 = i7 + 1;
                    char c3 = cArr[i10];
                    if (c2 == c3) {
                        cArr3[i7] = (char) (c2 - b);
                        cArr3[i10] = (char) (c3 - b);
                    } else {
                        int min = onActivityPreStopped.setMin(c2, c);
                        int length2 = onActivityPreStopped.length(c2, c);
                        int min2 = onActivityPreStopped.setMin(c3, c);
                        int length3 = onActivityPreStopped.length(c3, c);
                        if (length2 == length3) {
                            int i11 = setMin + 97;
                            setMax = i11 % 128;
                            int i12 = i11 % 2;
                            int max = onActivityPreStopped.setMax(min, c);
                            int max2 = onActivityPreStopped.setMax(min2, c);
                            int max3 = onActivityPreStopped.getMax(max, length2, c);
                            int max4 = onActivityPreStopped.getMax(max2, length3, c);
                            cArr3[i7] = cArr2[max3];
                            cArr3[i10] = cArr2[max4];
                            int i13 = setMin + 111;
                            setMax = i13 % 128;
                            int i14 = i13 % 2;
                        } else {
                            if (min == min2) {
                                int max5 = onActivityPreStopped.setMax(length2, c);
                                int max6 = onActivityPreStopped.setMax(length3, c);
                                int max7 = onActivityPreStopped.getMax(min, max5, c);
                                int max8 = onActivityPreStopped.getMax(min2, max6, c);
                                cArr3[i7] = cArr2[max7];
                                cArr3[i10] = cArr2[max8];
                            } else {
                                int max9 = onActivityPreStopped.getMax(min, length3, c);
                                int max10 = onActivityPreStopped.getMax(min2, length2, c);
                                cArr3[i7] = cArr2[max9];
                                cArr3[i10] = cArr2[max10];
                            }
                        }
                    }
                    i7 += 2;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return new String(cArr3);
    }
}
