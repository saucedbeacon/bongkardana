package kotlin.reflect.jvm.internal.impl.protobuf;

import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class Internal {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    private static int equals = 1;
    private static boolean getMax;
    private static int getMin;
    private static boolean length;
    private static char[] setMax;
    private static int setMin;

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i);
    }

    static void getMax() {
        setMin = 298;
        length = true;
        getMax = true;
        setMax = new char[]{383, 382, 368, 343, 354};
    }

    public static boolean isValidUtf8(byte[] bArr) {
        int i = equals + 35;
        getMin = i % 128;
        if ((i % 2 != 0 ? 'Y' : 29) != 'Y') {
            try {
                return Utf8.isValidUtf8(bArr);
            } catch (Exception e) {
                throw e;
            }
        } else {
            boolean isValidUtf8 = Utf8.isValidUtf8(bArr);
            Object obj = null;
            super.hashCode();
            return isValidUtf8;
        }
    }

    public static String toStringUtf8(byte[] bArr) {
        try {
            char[] cArr = null;
            String str = new String(bArr, getMin(new byte[]{-123, -124, -125, -126, -127}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, cArr, cArr).intern());
            char c = 13;
            int i = equals + 13;
            getMin = i % 128;
            if (i % 2 == 0) {
                c = '0';
            }
            if (c == '0') {
                return str;
            }
            super.hashCode();
            return str;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    static {
        getMax();
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        int i = equals + 69;
        getMin = i % 128;
        int i2 = i % 2;
    }

    private static String getMin(byte[] bArr, int i, int[] iArr, char[] cArr) {
        int i2;
        char[] cArr2;
        int i3;
        try {
            char[] cArr3 = setMax;
            int i4 = setMin;
            int i5 = 0;
            if ((getMax ? (char) 17 : 25) != 25) {
                int i6 = getMin + 81;
                equals = i6 % 128;
                int i7 = i6 % 2;
                int length2 = bArr.length;
                char[] cArr4 = new char[length2];
                while (i5 < length2) {
                    int i8 = equals + 21;
                    getMin = i8 % 128;
                    if ((i8 % 2 != 0 ? ';' : 'K') != ';') {
                        cArr4[i5] = (char) (cArr3[bArr[(length2 - 1) - i5] + i] - i4);
                        i5++;
                    } else {
                        cArr4[i5] = (char) (cArr3[bArr[(length2 * 1) % i5] * i] >>> i4);
                        i5 += 83;
                    }
                }
                return new String(cArr4);
            }
            if ((length ? '9' : 'R') != 'R') {
                int i9 = equals + 41;
                getMin = i9 % 128;
                if (!(i9 % 2 != 0)) {
                    i3 = cArr.length;
                    cArr2 = new char[i3];
                } else {
                    i3 = cArr.length;
                    cArr2 = new char[i3];
                    i5 = 1;
                }
                while (i5 < i3) {
                    cArr2[i5] = (char) (cArr3[cArr[(i3 - 1) - i5] - i] - i4);
                    i5++;
                }
                return new String(cArr2);
            }
            int length3 = iArr.length;
            char[] cArr5 = new char[length3];
            while (i5 < length3) {
                int i10 = equals + 97;
                try {
                    getMin = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr5[i5] = (char) (cArr3[iArr[(length3 + 0) << i5] / i] * i4);
                        i2 = i5 + 95;
                    } else {
                        cArr5[i5] = (char) (cArr3[iArr[(length3 - 1) - i5] - i] - i4);
                        i2 = i5 + 1;
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            return new String(cArr5);
        } catch (Exception e2) {
            throw e2;
        }
    }
}
