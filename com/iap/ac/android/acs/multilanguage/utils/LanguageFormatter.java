package com.iap.ac.android.acs.multilanguage.utils;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.RVParams;
import com.iap.ac.android.common.log.ACLog;
import java.util.HashMap;
import java.util.Map;
import o.startH5OpenAuth;

public class LanguageFormatter {
    private static final String TAG = LanguagePackageUtil.logTag("LanguageFormatter");
    private static final Map<String, String> mapConvertPattern;

    static {
        HashMap hashMap = new HashMap();
        mapConvertPattern = hashMap;
        hashMap.put(startH5OpenAuth.KEY_EN, "en-US");
        mapConvertPattern.put("de", "de-DE");
        mapConvertPattern.put(RVParams.ENABLE_SCROLLBAR, "es-ES");
        mapConvertPattern.put("fr", "fr-FR");
        mapConvertPattern.put("id", "id-ID");
        mapConvertPattern.put("it", "it-IT");
        mapConvertPattern.put("ja", "ja-JP");
        mapConvertPattern.put("ko", "ko-KR");
        mapConvertPattern.put("nl", "nl-NL");
        mapConvertPattern.put("pt", "pt-PT");
        mapConvertPattern.put("ru", "ru-RU");
        mapConvertPattern.put("th", "th-TH");
        mapConvertPattern.put(RVParams.SHOW_TITLE_LOADING, "tl-PH");
        mapConvertPattern.put("tr", "tr-TR");
        mapConvertPattern.put("uk", "uk-UA");
        mapConvertPattern.put("vi", "vi-VN");
        mapConvertPattern.put("zh", "zh-CN");
        mapConvertPattern.put("zh-Hans", "zh-CN");
        mapConvertPattern.put("zh-Hant", "zh-TW");
        mapConvertPattern.put("zh-tw", "zh-TW");
        mapConvertPattern.put("zh-TW", "zh-TW");
        mapConvertPattern.put("zh-hk", "zh-TW");
        mapConvertPattern.put("zh-HK", "zh-TW");
        mapConvertPattern.put("zh-MO", "zh-TW");
        mapConvertPattern.put("zh-mo", "zh-TW");
        mapConvertPattern.put("zh-SG", "zh-CN");
        mapConvertPattern.put("zh-sg", "zh-CN");
    }

    @Nullable
    public static String formatWithPattern(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            MultiLanguageLogger.newLogger(MultiLanguageLogger.BL_AC_LANG_CODE_MATCHER).addParams("errorMessage", "rawLanguageCode is empty").event();
            ACLog.d(TAG, "rawLanguageCode is empty");
            return null;
        } else if (mapConvertPattern.containsKey(str)) {
            StringBuilder sb = new StringBuilder("language ");
            sb.append(str);
            sb.append(" changed to ");
            sb.append(mapConvertPattern.get(str));
            String obj = sb.toString();
            MultiLanguageLogger.newLogger(MultiLanguageLogger.BL_AC_LANG_CODE_MATCHER).addParams("message", obj).event();
            ACLog.d(TAG, obj);
            return mapConvertPattern.get(str);
        } else {
            String splitPrefix = LanguagePackageUtil.splitPrefix(str);
            if (!mapConvertPattern.containsKey(splitPrefix)) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder("language code ");
            sb2.append(str);
            sb2.append(" changed to ");
            sb2.append(mapConvertPattern.get(splitPrefix));
            String obj2 = sb2.toString();
            MultiLanguageLogger.newLogger(MultiLanguageLogger.BL_AC_LANG_CODE_MATCHER).addParams("message", obj2).event();
            ACLog.d(TAG, obj2);
            return mapConvertPattern.get(splitPrefix);
        }
    }
}
