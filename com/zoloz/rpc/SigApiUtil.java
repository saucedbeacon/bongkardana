package com.zoloz.rpc;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class SigApiUtil {
    public static String apiSecret = "";
    public static final char[] digital = "0123456789ABCDEF".toCharArray();

    public static String generateSignature(String str, HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : hashMap.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) next.getKey());
            sb.append((String) next.getValue());
            arrayList.add(sb.toString());
        }
        String[] strArr = new String[(arrayList.size() + 1)];
        int i = 0;
        strArr[0] = str;
        Collections.sort(arrayList);
        while (i < arrayList.size()) {
            int i2 = i + 1;
            strArr[i2] = (String) arrayList.get(i);
            i = i2;
        }
        return generateSignature(strArr);
    }

    public static String generateSignature(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String append : strArr) {
            stringBuffer.append(append);
        }
        String hmacSha1 = hmacSha1(stringBuffer.toString(), apiSecret);
        return hmacSha1 != null ? hmacSha1.toUpperCase() : hmacSha1;
    }

    public static String hmacSha1(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "HmacSHA1");
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            return encodeHexStr(instance.doFinal(str.getBytes()));
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public static String encodeHexStr(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            char[] cArr2 = digital;
            cArr[i2] = cArr2[(bArr[i] & 240) >> 4];
            cArr[i2 + 1] = cArr2[bArr[i] & Ascii.SI];
        }
        return new String(cArr);
    }
}
