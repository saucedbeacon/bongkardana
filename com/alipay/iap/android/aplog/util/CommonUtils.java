package com.alipay.iap.android.aplog.util;

import android.text.TextUtils;
import java.util.Random;

public class CommonUtils {
    private static Random sCommonRandom;

    public static int randomInteger(int i, int i2) {
        return i + ((int) (getsCommonRandom().nextFloat() * ((float) (i2 - i))));
    }

    public static Random getsCommonRandom() {
        if (sCommonRandom == null) {
            sCommonRandom = new Random();
        }
        return sCommonRandom;
    }

    public static String concatArray(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        boolean z = true;
        if (objArr.length == 1) {
            return String.valueOf(objArr[0]);
        }
        if (objArr.length == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(objArr[0]));
            sb.append(str);
            sb.append(String.valueOf(objArr[1]));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb2.append(str);
            }
            sb2.append(obj);
        }
        return sb2.toString();
    }

    public static String getExceptionMessage(Exception exc, String str) {
        return TextUtils.isEmpty(exc.getMessage()) ? str : exc.getMessage();
    }
}
