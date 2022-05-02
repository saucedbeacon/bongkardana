package com.alipay.mobile.rome.syncsdk.util;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.securesignature.SecureSignatureDefine;
import java.util.HashMap;
import java.util.StringTokenizer;

public final class g {
    public static String[] a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        String[] strArr = new String[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            strArr[i] = stringTokenizer.nextToken();
            i++;
        }
        return strArr;
    }

    public static String a(String[] strArr) {
        String str = "";
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(",");
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(strArr[i]);
            str = sb2.toString();
        }
        return str;
    }

    public static boolean a(String[] strArr, String str) {
        for (String equals : strArr) {
            if (TextUtils.equals(str, equals)) {
                return true;
            }
        }
        return false;
    }

    public static String a(Context context, String str, String str2, String str3) {
        ISecureSignatureComponent secureSignatureComp;
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance == null || (secureSignatureComp = instance.getSecureSignatureComp()) == null) {
                return "";
            }
            HashMap hashMap = new HashMap();
            hashMap.put(SecureSignatureDefine.OPEN_KEY_SIGN_INPUT, str3);
            SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
            securityGuardParamContext.paramMap = hashMap;
            securityGuardParamContext.appKey = str;
            securityGuardParamContext.requestType = 4;
            if (str2 == null) {
                str2 = "";
            }
            String signRequest = secureSignatureComp.signRequest(securityGuardParamContext, str2);
            StringBuilder sb = new StringBuilder("signature content:");
            sb.append(str3);
            sb.append("  signature:");
            sb.append(signRequest);
            c.a("StringUtilsLink", sb.toString());
            return signRequest;
        } catch (SecException e) {
            StringBuilder sb2 = new StringBuilder("signature content:");
            sb2.append(str3);
            sb2.append(" Exception[");
            sb2.append(e);
            sb2.append("]");
            sb2.append(e.getMessage());
            sb2.append(e.getErrorCode());
            c.d("StringUtilsLink", sb2.toString());
            return "";
        }
    }
}
