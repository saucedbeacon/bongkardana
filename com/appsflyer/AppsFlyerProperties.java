package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.json.JSONObject;

public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_KEY = "AppsFlyerKey";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_FINGER_PRINT = "collectFingerPrint";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_MAC = "collectMAC";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String EXTENSION = "sdkExtension";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_EMAILS = "userEmails";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";

    /* renamed from: ॱ  reason: contains not printable characters */
    private static AppsFlyerProperties f8631 = new AppsFlyerProperties();

    /* renamed from: ˊ  reason: contains not printable characters */
    private boolean f8632;

    /* renamed from: ˋ  reason: contains not printable characters */
    private String f8633;

    /* renamed from: ˎ  reason: contains not printable characters */
    private Map<String, Object> f8634 = new HashMap();

    /* renamed from: ˏ  reason: contains not printable characters */
    private boolean f8635;

    /* renamed from: ᐝ  reason: contains not printable characters */
    private boolean f8636 = false;

    private AppsFlyerProperties() {
    }

    public static AppsFlyerProperties getInstance() {
        return f8631;
    }

    public synchronized void remove(String str) {
        this.f8634.remove(str);
    }

    public synchronized void set(String str, String str2) {
        this.f8634.put(str, str2);
    }

    public synchronized void set(String str, String[] strArr) {
        this.f8634.put(str, strArr);
    }

    public synchronized void set(String str, int i) {
        this.f8634.put(str, Integer.toString(i));
    }

    public synchronized void set(String str, long j) {
        int i;
        if (str != null) {
            try {
                i = str.length();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            i = 0;
        }
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(2077445818, oncanceled);
            onCancelLoad.getMin(2077445818, oncanceled);
        }
        this.f8634.put(str, Long.toString(j));
    }

    public synchronized void set(String str, boolean z) {
        this.f8634.put(str, Boolean.toString(z));
    }

    public synchronized void setCustomData(String str) {
        this.f8634.put(ADDITIONAL_CUSTOM_DATA, str);
    }

    public synchronized void setUserEmails(String str) {
        this.f8634.put(USER_EMAILS, str);
    }

    public synchronized String getString(String str) {
        return (String) this.f8634.get(str);
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        if (string == null) {
            return z;
        }
        return Boolean.valueOf(string).booleanValue();
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        if (string == null) {
            return i;
        }
        return Integer.valueOf(string).intValue();
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        if (string == null) {
            return j;
        }
        return Long.valueOf(string).longValue();
    }

    public synchronized Object getObject(String str) {
        return this.f8634.get(str);
    }

    /* access modifiers changed from: protected */
    public boolean isOnReceiveCalled() {
        return this.f8632;
    }

    /* access modifiers changed from: protected */
    public void setOnReceiveCalled() {
        this.f8632 = true;
    }

    /* access modifiers changed from: protected */
    public boolean isFirstLaunchCalled() {
        return this.f8635;
    }

    /* access modifiers changed from: protected */
    public void setFirstLaunchCalled(boolean z) {
        this.f8635 = z;
    }

    /* access modifiers changed from: protected */
    public void setFirstLaunchCalled() {
        this.f8635 = true;
    }

    /* access modifiers changed from: protected */
    public void setReferrer(String str) {
        set("AF_REFERRER", str);
        this.f8633 = str;
    }

    public String getReferrer(Context context) {
        String str = this.f8633;
        if (str != null) {
            return str;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return AppsFlyerLibCore.m1180(context).getString("referrer", (String) null);
    }

    public boolean isEnableLog() {
        return getBoolean("shouldLog", true);
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(DISABLE_OTHER_SDK, false);
    }

    public synchronized void saveProperties(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putString("savedProperties", new JSONObject(this.f8634).toString()).apply();
    }

    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);
        

        /* renamed from: ˊ  reason: contains not printable characters */
        private final int f8863;

        private EmailsCryptType(int i) {
            this.f8863 = i;
        }

        public final int getValue() {
            return this.f8863;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void loadProperties(android.content.Context r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f8636     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            android.content.SharedPreferences r5 = com.appsflyer.AppsFlyerLibCore.m1180((android.content.Context) r5)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "savedProperties"
            r1 = 0
            java.lang.String r5 = r5.getString(r0, r1)     // Catch:{ all -> 0x005f }
            if (r5 == 0) goto L_0x005d
            java.lang.String r0 = "Loading properties.."
            com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x005f }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0044 }
            r0.<init>(r5)     // Catch:{ JSONException -> 0x0044 }
            java.util.Iterator r5 = r0.keys()     // Catch:{ JSONException -> 0x0044 }
        L_0x0022:
            boolean r1 = r5.hasNext()     // Catch:{ JSONException -> 0x0044 }
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r5.next()     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x0044 }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.f8634     // Catch:{ JSONException -> 0x0044 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ JSONException -> 0x0044 }
            if (r2 != 0) goto L_0x0022
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.f8634     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r3 = r0.getString(r1)     // Catch:{ JSONException -> 0x0044 }
            r2.put(r1, r3)     // Catch:{ JSONException -> 0x0044 }
            goto L_0x0022
        L_0x0040:
            r5 = 1
            r4.f8636 = r5     // Catch:{ JSONException -> 0x0044 }
            goto L_0x004a
        L_0x0044:
            r5 = move-exception
            java.lang.String r0 = "Failed loading properties"
            com.appsflyer.AFLogger.afErrorLog(r0, r5)     // Catch:{ all -> 0x005f }
        L_0x004a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "Done loading properties: "
            r5.<init>(r0)     // Catch:{ all -> 0x005f }
            boolean r0 = r4.f8636     // Catch:{ all -> 0x005f }
            r5.append(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x005f }
            com.appsflyer.AFLogger.afDebugLog(r5)     // Catch:{ all -> 0x005f }
        L_0x005d:
            monitor-exit(r4)
            return
        L_0x005f:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x0063
        L_0x0062:
            throw r5
        L_0x0063:
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerProperties.loadProperties(android.content.Context):void");
    }
}
