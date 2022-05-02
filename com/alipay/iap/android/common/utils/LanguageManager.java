package com.alipay.iap.android.common.utils;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.alipay.iap.android.common.log.LoggerWrapper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o.startH5OpenAuth;

public class LanguageManager {
    public static final String IAP_MYWALLETWIDGET_PRESENTATION_INTENT_ACTION_LANGUAGE_CHANGE = "IAP_MYWALLETWIDGET_PRESENTATION_INTENT_ACTION_LANGUAGE_CHANGE";
    private static final String IAP_MYWALLETWIDGET_PRESENTATION_KEY_COUNTRY = "IAP_MYWALLETWIDGET_PRESENTATION_KEY_COUNTRY";
    private static final String IAP_MYWALLETWIDGET_PRESENTATION_KEY_LANGUAGE = "IAP_MYWALLETWIDGET_PRESENTATION_KEY_LANGUAGE";
    private static final String IAP_MYWALLETWIDGET_PRESENTATION_SHARE_LANGUAGE_NAME = "IAP_MYWALLETWIDGET_PRESENTATION_SHARE_LANGUAGE_NAME";
    private static final String TAG = LanguageManager.class.getSimpleName();
    private static LocaleInfo currentLocaleInfo = new LocaleInfo("", getMultiLanguageList().get(0).language, getMultiLanguageList().get(0).country);
    private static final List<LocaleInfo> multiLanguageList;

    static {
        ArrayList arrayList = new ArrayList();
        multiLanguageList = arrayList;
        arrayList.add(new LocaleInfo("English", startH5OpenAuth.KEY_EN, "US"));
        multiLanguageList.add(new LocaleInfo("中文简体", "zh", "CN"));
    }

    public static class LocaleInfo {
        public String country;
        public String language;
        public String name;

        public LocaleInfo(String str, String str2, String str3) {
            this.name = str;
            this.language = str2;
            this.country = str3;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LocaleInfo{name='");
            sb.append(this.name);
            sb.append('\'');
            sb.append(", language='");
            sb.append(this.language);
            sb.append('\'');
            sb.append(", country='");
            sb.append(this.country);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public static List<LocaleInfo> getMultiLanguageList() {
        return multiLanguageList;
    }

    private static void saveLanguage(Context context, LocaleInfo localeInfo) {
        if (context != null && localeInfo != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences(IAP_MYWALLETWIDGET_PRESENTATION_SHARE_LANGUAGE_NAME, 0).edit();
            edit.putString(IAP_MYWALLETWIDGET_PRESENTATION_KEY_LANGUAGE, localeInfo.language);
            edit.putString(IAP_MYWALLETWIDGET_PRESENTATION_KEY_COUNTRY, localeInfo.country);
            edit.apply();
        }
    }

    public static LocaleInfo getCurrentLanguage() {
        return currentLocaleInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void switchLanguage(android.content.Context r2, com.alipay.iap.android.common.utils.LanguageManager.LocaleInfo r3) {
        /*
            java.lang.Class<com.alipay.iap.android.common.utils.LanguageManager> r0 = com.alipay.iap.android.common.utils.LanguageManager.class
            monitor-enter(r0)
            if (r2 == 0) goto L_0x0023
            if (r3 != 0) goto L_0x0008
            goto L_0x0023
        L_0x0008:
            currentLocaleInfo = r3     // Catch:{ all -> 0x0020 }
            updateLanguageConfiguration(r2, r3)     // Catch:{ all -> 0x0020 }
            saveLanguage(r2, r3)     // Catch:{ all -> 0x0020 }
            o.restorePresenterStates r2 = o.restorePresenterStates.length(r2)     // Catch:{ all -> 0x0020 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x0020 }
            java.lang.String r1 = "IAP_MYWALLETWIDGET_PRESENTATION_INTENT_ACTION_LANGUAGE_CHANGE"
            r3.<init>(r1)     // Catch:{ all -> 0x0020 }
            r2.setMin(r3)     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)
            return
        L_0x0020:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L_0x0023:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.common.utils.LanguageManager.switchLanguage(android.content.Context, com.alipay.iap.android.common.utils.LanguageManager$LocaleInfo):void");
    }

    public static synchronized void setLanguageWithLastSetting(Context context) {
        synchronized (LanguageManager.class) {
            if (context != null) {
                LocaleInfo currentLanguage = getCurrentLanguage();
                String str = TAG;
                StringBuilder sb = new StringBuilder("lastLanguage=");
                sb.append(currentLanguage.language);
                LoggerWrapper.i(str, sb.toString());
                String str2 = TAG;
                StringBuilder sb2 = new StringBuilder("lastCountry=");
                sb2.append(currentLanguage.country);
                LoggerWrapper.i(str2, sb2.toString());
                updateLanguageConfiguration(context, currentLanguage);
            }
        }
    }

    private static synchronized void updateLanguageConfiguration(Context context, LocaleInfo localeInfo) {
        synchronized (LanguageManager.class) {
            if (Build.VERSION.SDK_INT < 24) {
                Resources resources = context.getResources();
                Configuration configuration = resources.getConfiguration();
                configuration.locale = new Locale(localeInfo.language, localeInfo.country);
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        }
    }

    private static void setLocaleToResource(Application application, Locale locale) {
        try {
            Method declaredMethod = application.getClass().getDeclaredMethod("setLocaleToApplicationResources", new Class[]{Locale.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(application, new Object[]{locale});
            Method declaredMethod2 = application.getClass().getDeclaredMethod("clearCachedBundleResources", new Class[0]);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(application, new Object[0]);
        } catch (Exception e) {
            LoggerWrapper.w(TAG, "setLocaleToResource", e);
        }
    }
}
