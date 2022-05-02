package com.google.zxing.common;

import android.os.SystemClock;
import android.view.Gravity;
import android.view.View;
import com.google.android.exoplayer2.C;
import java.util.HashMap;
import java.util.Map;

public enum CharacterSetECI {
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
    SJIS((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{setMin(View.resolveSizeAndState(0, 0, 0), (char) (1787 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1))), 5 - Gravity.getAbsoluteGravity(0, 0)).intern()}),
    ASCII((String) new int[]{27, 170}, (int) new String[]{C.ASCII_NAME}),
    Big5(28),
    GB18030((String) 29, (int) new String[]{StringUtils.GB2312, "EUC_CN", "GBK"}),
    EUC_KR((String) 30, (int) new String[]{"EUC-KR"});
    
    private static final Map<String, CharacterSetECI> NAME_TO_ECI = null;
    private static final Map<Integer, CharacterSetECI> VALUE_TO_ECI = null;
    private static int getMax = 0;
    private static long length = 0;
    private static int setMax = 1;
    private static char[] setMin;
    private final String[] otherEncodingNames;
    private final int[] values;

    static void setMax() {
        setMin = new char[]{1711, 27838, 53916, 14567, 44674};
        length = 3311644872022845968L;
    }

    static {
        VALUE_TO_ECI = new HashMap();
        NAME_TO_ECI = new HashMap();
        CharacterSetECI[] values2 = values();
        int length2 = values2.length;
        int i = getMax + 17;
        setMax = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        while (true) {
            if ((i3 < length2 ? 'U' : '8') != '8') {
                CharacterSetECI characterSetECI = values2[i3];
                int[] iArr = characterSetECI.values;
                int length3 = iArr.length;
                int i4 = 0;
                while (true) {
                    if ((i4 < length3 ? 'X' : 'E') != 'X') {
                        break;
                    }
                    int i5 = getMax + 69;
                    setMax = i5 % 128;
                    int i6 = i5 % 2;
                    VALUE_TO_ECI.put(Integer.valueOf(iArr[i4]), characterSetECI);
                    i4++;
                }
                NAME_TO_ECI.put(characterSetECI.name(), characterSetECI);
                String[] strArr = characterSetECI.otherEncodingNames;
                int length4 = strArr.length;
                int i7 = 0;
                while (i7 < length4) {
                    int i8 = setMax + 93;
                    getMax = i8 % 128;
                    if (i8 % 2 != 0) {
                        NAME_TO_ECI.put(strArr[i7], characterSetECI);
                        i7 += 59;
                    } else {
                        NAME_TO_ECI.put(strArr[i7], characterSetECI);
                        i7++;
                    }
                }
                i3++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private CharacterSetECI(int i) {
        this(r3, r4, new int[]{i}, new String[0]);
        try {
        } catch (Exception e) {
            throw e;
        }
    }

    private CharacterSetECI(int i, String... strArr) {
        this.values = new int[]{i};
        this.otherEncodingNames = strArr;
    }

    private CharacterSetECI(int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }

    public final int getValue() {
        int i = getMax + 121;
        setMax = i % 128;
        return (i % 2 == 0 ? 'a' : 28) != 'a' ? this.values[0] : this.values[1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r3 < 5561) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if ((r3 >= 900 ? 24 : 'a') != 24) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.zxing.common.CharacterSetECI getCharacterSetECIByValue(int r3) throws com.google.zxing.FormatException {
        /*
            r0 = 3
            if (r3 < 0) goto L_0x0006
            r1 = 54
            goto L_0x0007
        L_0x0006:
            r1 = 3
        L_0x0007:
            if (r1 == r0) goto L_0x004e
            int r0 = getMax
            int r0 = r0 + 87
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 50
            if (r0 != 0) goto L_0x001a
            r0 = 38
            goto L_0x001c
        L_0x001a:
            r0 = 50
        L_0x001c:
            r2 = 24
            if (r0 == r1) goto L_0x0025
            r0 = 5561(0x15b9, float:7.793E-42)
            if (r3 >= r0) goto L_0x004e
            goto L_0x0030
        L_0x0025:
            r0 = 900(0x384, float:1.261E-42)
            if (r3 < r0) goto L_0x002c
            r0 = 24
            goto L_0x002e
        L_0x002c:
            r0 = 97
        L_0x002e:
            if (r0 == r2) goto L_0x004e
        L_0x0030:
            java.util.Map<java.lang.Integer, com.google.zxing.common.CharacterSetECI> r0 = VALUE_TO_ECI
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            com.google.zxing.common.CharacterSetECI r3 = (com.google.zxing.common.CharacterSetECI) r3
            int r0 = setMax
            int r0 = r0 + 17
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x004d
            int r2 = r2 / 0
            return r3
        L_0x004b:
            r3 = move-exception
            throw r3
        L_0x004d:
            return r3
        L_0x004e:
            com.google.zxing.FormatException r3 = com.google.zxing.FormatException.getFormatInstance()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(int):com.google.zxing.common.CharacterSetECI");
    }

    public static CharacterSetECI getCharacterSetECIByName(String str) {
        int i = setMax + 53;
        getMax = i % 128;
        if ((i % 2 != 0 ? '2' : 'Q') != '2') {
            try {
                try {
                    return NAME_TO_ECI.get(str);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            CharacterSetECI characterSetECI = NAME_TO_ECI.get(str);
            Object obj = null;
            super.hashCode();
            return characterSetECI;
        }
    }

    private static String setMin(int i, char c, int i2) {
        try {
            int i3 = setMax + 97;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (true) {
                if (i5 >= i2) {
                    break;
                }
                int i6 = getMax + 85;
                setMax = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr[i5] = (char) ((int) ((((long) setMin[i >> i5]) & (((long) i5) + length)) | ((long) c)));
                    i5 += 17;
                } else {
                    cArr[i5] = (char) ((int) ((((long) setMin[i + i5]) ^ (((long) i5) * length)) ^ ((long) c)));
                    i5++;
                }
            }
            String str = new String(cArr);
            int i7 = setMax + 99;
            getMax = i7 % 128;
            if ((i7 % 2 != 0 ? '.' : ',') == ',') {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }
}
