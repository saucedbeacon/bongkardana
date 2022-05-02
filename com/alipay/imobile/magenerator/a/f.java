package com.alipay.imobile.magenerator.a;

import android.os.SystemClock;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.google.zxing.common.StringUtils;
import java.util.HashMap;
import java.util.Map;

public enum f {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{"ISO-8859-1"}),
    ISO8859_2((String) 4, (int) new String[]{"ISO-8859-2"}),
    ISO8859_3((String) 5, (int) new String[]{"ISO-8859-3"}),
    ISO8859_4((String) 6, (int) new String[]{"ISO-8859-4"}),
    ISO8859_5((String) 7, (int) new String[]{"ISO-8859-5"}),
    ISO8859_6((String) 8, (int) new String[]{"ISO-8859-6"}),
    ISO8859_7((String) 9, (int) new String[]{"ISO-8859-7"}),
    ISO8859_8((String) 10, (int) new String[]{"ISO-8859-8"}),
    ISO8859_9((String) 11, (int) new String[]{"ISO-8859-9"}),
    ISO8859_10((String) 12, (int) new String[]{"ISO-8859-10"}),
    ISO8859_11((String) 13, (int) new String[]{"ISO-8859-11"}),
    ISO8859_13((String) 15, (int) new String[]{"ISO-8859-13"}),
    ISO8859_14((String) 16, (int) new String[]{"ISO-8859-14"}),
    ISO8859_15((String) 17, (int) new String[]{"ISO-8859-15"}),
    ISO8859_16((String) 18, (int) new String[]{"ISO-8859-16"}),
    q((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{getMin(ExpandableListView.getPackedPositionChild(0) + 201, (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)), new char[]{65524, 17, 16, 2, 65513}, !WindowManager.LayoutParams.mayUseInputMethod(0), 5 - Gravity.getAbsoluteGravity(0, 0)).intern()}),
    ASCII((String) new int[]{27, 170}, (int) new String[]{C.ASCII_NAME}),
    Big5(28),
    GB18030((String) 29, (int) new String[]{StringUtils.GB2312, "EUC_CN", "GBK"}),
    EUC_KR((String) 30, (int) new String[]{"EUC-KR"});
    
    private static final Map B = null;
    private static final Map C = null;
    private static int length = 1;
    private static int setMax;
    private static int setMin;
    private final int[] D;
    private final String[] E;

    static {
        B = new HashMap();
        C = new HashMap();
        f[] values = values();
        int length2 = values.length;
        int i = 0;
        while (true) {
            if ((i < length2 ? 29 : ',') != ',') {
                f fVar = values[i];
                for (int valueOf : fVar.D) {
                    B.put(Integer.valueOf(valueOf), fVar);
                }
                C.put(fVar.name(), fVar);
                String[] strArr = fVar.E;
                int length3 = strArr.length;
                int i2 = 0;
                while (i2 < length3) {
                    int i3 = setMin + 83;
                    length = i3 % 128;
                    if (i3 % 2 == 0) {
                        C.put(strArr[i2], fVar);
                        i2 += 34;
                    } else {
                        C.put(strArr[i2], fVar);
                        i2++;
                    }
                }
                i++;
                int i4 = setMin + 71;
                length = i4 % 128;
                int i5 = i4 % 2;
            } else {
                return;
            }
        }
    }

    private f(int i) {
        this(r3, r4, new int[]{i}, new String[0]);
    }

    private f(int i, String... strArr) {
        this.D = new int[]{i};
        this.E = strArr;
    }

    private f(int[] iArr, String... strArr) {
        this.D = iArr;
        this.E = strArr;
    }

    public static f a(String str) {
        int i = length + 123;
        setMin = i % 128;
        int i2 = i % 2;
        f fVar = (f) C.get(str);
        int i3 = setMin + 27;
        length = i3 % 128;
        if ((i3 % 2 == 0 ? 17 : 'K') == 'K') {
            return fVar;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return fVar;
    }

    static void setMax() {
        setMax = 132;
    }

    public final int a() {
        int i;
        int i2 = setMin + 85;
        length = i2 % 128;
        if (i2 % 2 == 0) {
            try {
                i = this.D[0];
            } catch (Exception e) {
                throw e;
            }
        } else {
            i = this.D[0];
        }
        int i3 = setMin + 13;
        length = i3 % 128;
        int i4 = i3 % 2;
        return i;
    }

    private static String getMin(int i, int i2, char[] cArr, boolean z, int i3) {
        int i4;
        char[] cArr2;
        int i5;
        int i6 = length + 99;
        setMin = i6 % 128;
        boolean z2 = true;
        if (i6 % 2 != 0) {
            cArr2 = new char[i3];
            i4 = 1;
        } else {
            cArr2 = new char[i3];
            i4 = 0;
        }
        while (i4 < i3) {
            int i7 = length + 21;
            setMin = i7 % 128;
            if (i7 % 2 != 0) {
                cArr2[i4] = (char) (i >>> cArr[i4]);
                cArr2[i4] = (char) (cArr2[i4] >>> setMax);
                i5 = i4 + 123;
            } else {
                cArr2[i4] = (char) (cArr[i4] + i);
                cArr2[i4] = (char) (cArr2[i4] - setMax);
                i5 = i4 + 1;
            }
        }
        if (i2 > 0) {
            char[] cArr3 = new char[i3];
            try {
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                int i8 = i3 - i2;
                System.arraycopy(cArr3, 0, cArr2, i8, i2);
                System.arraycopy(cArr3, i2, cArr2, 0, i8);
            } catch (Exception e) {
                throw e;
            }
        }
        if ((z ? 'K' : 'Z') != 'Z') {
            try {
                int i9 = length + 77;
                setMin = i9 % 128;
                int i10 = i9 % 2;
                char[] cArr4 = new char[i3];
                for (int i11 = 0; i11 < i3; i11++) {
                    cArr4[i11] = cArr2[(i3 - i11) - 1];
                }
                cArr2 = cArr4;
            } catch (Exception e2) {
                throw e2;
            }
        }
        String str = new String(cArr2);
        int i12 = length + 33;
        setMin = i12 % 128;
        if (i12 % 2 == 0) {
            z2 = false;
        }
        if (!z2) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }
}
