package o;

import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class onNestedScroll {
    private static final ThreadLocal<CharsetDecoder> getMin = new ThreadLocal<CharsetDecoder>() {
        private static int getMax = 0;
        private static long length = 4248635305990080461L;
        private static int setMax = 1;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            int i = getMax + 29;
            setMax = i % 128;
            if ((i % 2 == 0 ? (char) 8 : 17) == 17) {
                return Charset.forName(setMin(new char[]{17401, 33889, 16491, 3168, 51204, 37928}).intern()).newDecoder();
            }
            CharsetDecoder newDecoder = Charset.forName(setMin(new char[]{17401, 33889, 16491, 3168, 51204, 37928}).intern()).newDecoder();
            Object obj = null;
            super.hashCode();
            return newDecoder;
        }

        private static String setMin(char[] cArr) {
            int i;
            char[] cArr2;
            char c;
            int i2 = setMax + 37;
            getMax = i2 % 128;
            if ((i2 % 2 != 0 ? '5' : '4') != '5') {
                c = cArr[0];
                cArr2 = new char[(cArr.length - 1)];
                i = 1;
            } else {
                c = cArr[0];
                cArr2 = new char[(cArr.length / 1)];
                i = 0;
            }
            int i3 = getMax + 33;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            while (true) {
                if (!(i < cArr.length)) {
                    return new String(cArr2);
                }
                try {
                    cArr2[i - 1] = (char) ((int) (((long) (cArr[i] ^ (i * c))) ^ length));
                    i++;
                } catch (Exception e) {
                    throw e;
                }
            }
        }
    };
    private static final ThreadLocal<CharBuffer> length = new ThreadLocal<>();
    public static final ThreadLocal<Charset> setMax = new ThreadLocal<Charset>() {
        private static int getMax = 0;
        private static int length = 1;
        private static char[] setMax = {'f', 199, 206, 226, 233};

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            int i = length + 21;
            getMax = i % 128;
            if ((i % 2 != 0 ? '(' : '\'') == '\'') {
                return Charset.forName(setMin(new byte[]{1, 1, 1, 0, 1}, TextUtils.isEmpty(""), new int[]{0, 5, 149, 0}).intern());
            }
            Charset forName = Charset.forName(setMin(new byte[]{1, 1, 1, 0, 1}, TextUtils.isEmpty(""), new int[]{0, 5, 149, 0}).intern());
            Object[] objArr = null;
            int length2 = objArr.length;
            return forName;
        }

        private static String setMin(byte[] bArr, boolean z, int[] iArr) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(setMax, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                char c = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    if (bArr[i5] == 1) {
                        cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                    } else {
                        cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                    }
                    c = cArr2[i5];
                }
                int i6 = getMax + 7;
                length = i6 % 128;
                int i7 = i6 % 2;
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                try {
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i8 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i8, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i8);
                    int i9 = getMax + 9;
                    length = i9 % 128;
                    int i10 = i9 % 2;
                } catch (Exception e) {
                    throw e;
                }
            }
            if (!(!z)) {
                char[] cArr4 = new char[i2];
                for (int i11 = 0; i11 < i2; i11++) {
                    cArr4[i11] = cArr[(i2 - i11) - 1];
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                int i12 = getMax + 37;
                length = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 0;
                while (true) {
                    if (!(i14 < i2)) {
                        break;
                    }
                    cArr[i14] = (char) (cArr[i14] - iArr[2]);
                    i14++;
                }
            }
            return new String(cArr);
        }
    };
    protected int getMax;
    protected ByteBuffer setMin;

    /* access modifiers changed from: protected */
    public final int setMin(int i) {
        int i2 = this.getMax;
        int i3 = i2 - this.setMin.getInt(i2);
        if (i < this.setMin.getShort(i3)) {
            return this.setMin.getShort(i3 + i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final int getMin(int i) {
        return i + this.setMin.getInt(i);
    }

    /* access modifiers changed from: protected */
    public final int setMax(int i) {
        int i2 = i + this.getMax;
        return this.setMin.getInt(i2 + this.setMin.getInt(i2));
    }

    /* access modifiers changed from: protected */
    public final int length(int i) {
        int i2 = i + this.getMax;
        return i2 + this.setMin.getInt(i2) + 4;
    }
}
