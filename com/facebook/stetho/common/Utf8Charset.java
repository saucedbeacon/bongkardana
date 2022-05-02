package com.facebook.stetho.common;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import kotlin.text.Typography;
import o.OnLifecycleEvent;

public class Utf8Charset {
    public static final Charset INSTANCE = Charset.forName(getMax(new char[]{57931, 25021, 13910, 9201}, 1449246178 - ExpandableListView.getPackedPositionGroup(0), new char[]{51925, 6196, 15355, 62153, 53817}, new char[]{0, 0, 0, 0}, (char) (61750 - Color.red(0))).intern());
    public static final String NAME = "UTF-8";
    private static int getMax = 0;
    private static char getMin = '\u0000';
    private static int length = 0;
    private static long setMax = 0;
    private static int setMin = 1;

    static void getMax() {
        getMin = 46003;
        setMax = 0;
        getMax = 0;
    }

    static {
        getMax();
        boolean z = false;
        int i = length + 33;
        setMin = i % 128;
        if (i % 2 == 0) {
            z = true;
        }
        if (z) {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    public static byte[] encodeUTF8(String str) {
        String intern;
        String str2 = str;
        int i = length + 93;
        setMin = i % 128;
        if (!(i % 2 == 0)) {
            try {
                intern = getMax(new char[]{57931, 25021, 13910, 9201}, Drawable.resolveOpacity(0, 0) + 1449246178, new char[]{51925, 6196, 15355, 62153, 53817}, new char[]{0, 0, 0, 0}, (char) (61749 - TextUtils.lastIndexOf("", '0', 0, 0))).intern();
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } else {
            intern = getMax(new char[]{57931, 25021, 13910, 9201}, 1449246178 >> Drawable.resolveOpacity(0, 1), new char[]{51925, 6196, 15355, 62153, 53817}, new char[]{0, 0, 0, 0}, (char) (61749 >>> TextUtils.lastIndexOf("", 27, 0, 1))).intern();
        }
        byte[] bytes = str2.getBytes(intern);
        int i2 = setMin + 15;
        length = i2 % 128;
        if ((i2 % 2 != 0 ? Typography.amp : 19) == 19) {
            return bytes;
        }
        Object obj = null;
        try {
            super.hashCode();
            return bytes;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String decodeUTF8(byte[] bArr) {
        String str = new String(bArr, INSTANCE);
        int i = setMin + 59;
        length = i % 128;
        int i2 = i % 2;
        return str;
    }

    private static String getMax(char[] cArr, int i, char[] cArr2, char[] cArr3, char c) {
        int i2 = length + 101;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr4 = (char[]) cArr.clone();
        char[] cArr5 = (char[]) cArr3.clone();
        cArr4[0] = (char) (c ^ cArr4[0]);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length2 = cArr2.length;
        char[] cArr6 = new char[length2];
        int i4 = 0;
        while (true) {
            if (!(i4 < length2)) {
                return new String(cArr6);
            }
            OnLifecycleEvent.length(cArr4, cArr5, i4);
            cArr6[i4] = (char) ((int) (((((long) (cArr2[i4] ^ cArr4[(i4 + 3) % 4])) ^ setMax) ^ ((long) getMax)) ^ ((long) getMin)));
            i4++;
            try {
                int i5 = setMin + 93;
                length = i5 % 128;
                int i6 = i5 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
