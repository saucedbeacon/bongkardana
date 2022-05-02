package com.iap.ac.android.loglite.core;

import android.text.TextUtils;
import com.iap.ac.android.loglite.utils.BizCodeMatchUtils;
import com.iap.ac.android.loglite.utils.LoggerWrapper;

public class DefaultLogEncryptClient implements LogEncryptClient {
    public String decrypt(String str) {
        try {
            String a2 = BizCodeMatchUtils.a(str, "µµÿðæáýæÜÀáãëÐÛÐÜòÏîñúËÂ", "¹º»¼½¾¿°±¸¹º»¼½¾");
            if (TextUtils.isEmpty(a2) && !TextUtils.isEmpty(str)) {
                LoggerWrapper.w("DefaultLogEncryptClient", "decrypt value error!! value = ".concat(String.valueOf(str)));
            }
            return a2;
        } catch (Throwable th) {
            LoggerWrapper.w("DefaultLogEncryptClient", th);
            return null;
        }
    }

    public String encrypt(String str) {
        try {
            String b = BizCodeMatchUtils.b(str, "µµÿðæáýæÜÀáãëÐÛÐÜòÏîñúËÂ", "¹º»¼½¾¿°±¸¹º»¼½¾");
            if (TextUtils.isEmpty(b) && !TextUtils.isEmpty(str)) {
                LoggerWrapper.w("DefaultLogEncryptClient", "encrypt value error!! value = ".concat(String.valueOf(str)));
            }
            return b;
        } catch (Throwable th) {
            LoggerWrapper.w("DefaultLogEncryptClient", th);
            return null;
        }
    }
}
