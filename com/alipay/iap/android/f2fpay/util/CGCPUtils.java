package com.alipay.iap.android.f2fpay.util;

import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import java.util.regex.Pattern;

public class CGCPUtils {

    /* renamed from: a  reason: collision with root package name */
    private static Pattern f9327a = Pattern.compile("^[-\\+]?[\\d]*$");

    private static boolean a(String str) {
        return f9327a.matcher(str).matches();
    }

    public static String generateCGCP(int i, String str, String str2, String str3) {
        String str4;
        if (str3.length() != 16 || !a(str3)) {
            str4 = "payCode's length is not 16 or payCode is not a number";
        } else if (i < 0 || i > 9) {
            str4 = "version must be 0-9";
        } else if (str.length() != 3 || !a(str)) {
            str4 = "institutionCode's length is not 3 or institutionCode is not a number";
        } else if (str2.length() != 2 || !a(str2)) {
            str4 = "businessType's length is not 2 or businessType is not a number";
        } else {
            StringBuilder sb = new StringBuilder("28");
            sb.append(i);
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            return sb.toString();
        }
        LoggerWrapper.w(F2FPayConstants.TAG, str4);
        return null;
    }
}
