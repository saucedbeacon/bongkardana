package com.iap.ac.android.acs.plugin.ui.utils;

import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.biz.common.callback.MultiLanguageCallback;
import com.iap.ac.android.biz.common.multilanguage.MultiLanguageManager;
import com.iap.ac.android.common.log.ACLog;
import java.util.Map;

public class MultiLanguageUtils {
    private static final String MULTI_LANGUAGE_TEXT_BIZ_SCENE = "mobilephone";
    public static String locale;
    /* access modifiers changed from: private */
    public static Map<String, String> multiLanguageTextMap;

    public interface Callback {
        void onGetMultiLanguageText(@NonNull Map<String, String> map);
    }

    private MultiLanguageUtils() {
    }

    public static void getMultiLanguageTextMap(@NonNull final Callback callback) {
        Map<String, String> map = multiLanguageTextMap;
        if (map == null || map.isEmpty()) {
            MultiLanguageManager.queryBizSceneMultiLanguage(locale, MULTI_LANGUAGE_TEXT_BIZ_SCENE, new MultiLanguageCallback<Map<String, String>>() {
                public final void onResult(@NonNull Map<String, String> map) {
                    if (map.isEmpty()) {
                        ACLog.e(Constants.TAG, "MultiLanguageUtils#getMultiLanguageTextMap, CDN string map is empty");
                        MonitorUtil.monitorError("getBizScene empty");
                        return;
                    }
                    ACLog.d(Constants.TAG, "MultiLanguageUtils#getMultiLanguageTextMap, get CDN string map successfully");
                    Map unused = MultiLanguageUtils.multiLanguageTextMap = map;
                    callback.onGetMultiLanguageText(map);
                }
            });
        } else {
            callback.onGetMultiLanguageText(multiLanguageTextMap);
        }
    }

    public static void clear() {
        ACLog.d(Constants.TAG, "MultiLanguageUtils#clear");
        Map<String, String> map = multiLanguageTextMap;
        if (map != null) {
            map.clear();
        }
    }
}
