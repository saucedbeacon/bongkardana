package com.alipay.androidinter.app.safepaybase.util;

import com.alipay.androidinter.app.safepaybase.EncryptRandomType;
import com.alipay.androidinter.app.safepaybase.encrypt.Rsa;
import com.alipay.androidinter.app.safepaybase.log.LogTracer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EditTextUtil {
    private Map<Integer, String> textMap = new ConcurrentHashMap();

    public void OnTextChanged(int i, String str, int i2, int i3, int i4) {
        String str2 = this.textMap.get(Integer.valueOf(i));
        if (str2 == null) {
            str2 = "";
        }
        try {
            String substring = str2.substring(0, i2);
            String substring2 = str2.substring(i3 + i2, str2.length());
            String substring3 = str.substring(i2, i4 + i2);
            Map<Integer, String> map = this.textMap;
            Integer valueOf = Integer.valueOf(i);
            StringBuilder sb = new StringBuilder();
            sb.append(substring);
            sb.append(substring3);
            sb.append(substring2);
            map.put(valueOf, sb.toString());
        } catch (Throwable th) {
            LogTracer.getInstance().printExceptionStackTrace(th);
        }
    }

    public String getText(int i, String str, String str2, EncryptRandomType encryptRandomType) {
        String str3;
        String str4 = this.textMap.get(Integer.valueOf(i));
        if (str4 == null) {
            return "";
        }
        if (encryptRandomType == EncryptRandomType.randombefore) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str4);
            str3 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(str2);
            str3 = sb2.toString();
        }
        return Rsa.encrypt(str3, str);
    }

    public void clear(int i) {
        this.textMap.remove(Integer.valueOf(i));
    }
}
