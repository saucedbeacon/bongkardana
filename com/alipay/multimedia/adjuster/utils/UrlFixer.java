package com.alipay.multimedia.adjuster.utils;

import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import java.net.URLEncoder;
import java.util.BitSet;
import kotlin.text.Typography;
import o.OnLifecycleEvent;

public class UrlFixer {
    static BitSet allowedChars = new BitSet() {
        {
            for (int i = 0; i < 85; i++) {
                set(":/?#[]@!$&'()*+,;=abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%".charAt(i));
            }
        }
    };
    private static char getMax = '\u0000';
    private static int getMin = 0;
    private static int length = 1;
    private static long setMax;
    private static int setMin;

    static void length() {
        getMax = 62053;
        setMax = 0;
        getMin = 0;
    }

    static {
        length();
        int i = setMin + 39;
        length = i % 128;
        int i2 = i % 2;
    }

    public static String fixUrl(String str) {
        StringBuilder sb = new StringBuilder();
        String replaceAll = str.replaceAll("%(?![0-9A-Fa-f]{2})", "%25");
        int length2 = replaceAll.length();
        int i = 0;
        while (i < length2) {
            int i2 = length + 5;
            setMin = i2 % 128;
            int i3 = i2 % 2;
            char charAt = replaceAll.charAt(i);
            if (allowedChars.get(charAt)) {
                sb.append(charAt);
                int i4 = setMin + 75;
                length = i4 % 128;
                int i5 = i4 % 2;
            } else {
                String ch = Character.toString(charAt);
                try {
                    sb.append(URLEncoder.encode(ch, setMax(new char[]{61568, 813, 23365, 16046}, Drawable.resolveOpacity(0, 0) + 1157836272, new char[]{42165, 61478, 64337, 13445, 46144}, new char[]{0, 0, 0, 0}, (char) (44635 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern()));
                } catch (Exception unused) {
                    sb.append(ch);
                }
            }
            i++;
            int i6 = length + 121;
            setMin = i6 % 128;
            int i7 = i6 % 2;
        }
        int indexOf = sb.indexOf("#");
        while (indexOf >= 0) {
            int i8 = length + 85;
            setMin = i8 % 128;
            if (i8 % 2 != 0) {
                indexOf = sb.indexOf("#", indexOf << 1);
                if (!(indexOf > 0)) {
                }
            } else {
                indexOf = sb.indexOf("#", indexOf + 1);
                if ((indexOf > 0 ? '_' : 10) != '_') {
                }
            }
            sb.replace(indexOf, indexOf + 1, "%23");
        }
        return sb.toString();
    }

    private static String setMax(char[] cArr, int i, char[] cArr2, char[] cArr3, char c) {
        try {
            int i2 = setMin + 81;
            length = i2 % 128;
            int i3 = i2 % 2;
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr3.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length2 = cArr2.length;
            char[] cArr6 = new char[length2];
            int i4 = length + 107;
            setMin = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (true) {
                if (!(i6 < length2)) {
                    return new String(cArr6);
                }
                int i7 = setMin + 3;
                length = i7 % 128;
                if ((i7 % 2 == 0 ? 28 : Typography.dollar) != 28) {
                    OnLifecycleEvent.length(cArr4, cArr5, i6);
                    cArr6[i6] = (char) ((int) (((((long) (cArr2[i6] ^ cArr4[(i6 + 3) % 4])) ^ setMax) ^ ((long) getMin)) ^ ((long) getMax)));
                    i6++;
                } else {
                    try {
                        OnLifecycleEvent.length(cArr4, cArr5, i6);
                        cArr6[i6] = (char) ((int) (((((long) (cArr2[i6] ^ cArr4[(i6 >>> 4) / 5])) | setMax) ^ ((long) getMin)) - ((long) getMax)));
                        i6 += 108;
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
