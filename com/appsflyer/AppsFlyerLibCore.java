package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.griver.h5.permission.GriverJSAPIPermission;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncCommand;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFFacebookDeferredDeeplink;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.internal.aa;
import com.appsflyer.internal.ab;
import com.appsflyer.internal.ac;
import com.appsflyer.internal.ad;
import com.appsflyer.internal.ae;
import com.appsflyer.internal.af;
import com.appsflyer.internal.ag;
import com.appsflyer.internal.ah;
import com.appsflyer.internal.ai;
import com.appsflyer.internal.am;
import com.appsflyer.internal.f;
import com.appsflyer.internal.j;
import com.appsflyer.internal.m;
import com.appsflyer.internal.model.event.AdRevenue;
import com.appsflyer.internal.model.event.BackgroundReferrerLaunch;
import com.appsflyer.internal.model.event.CachedEvent;
import com.appsflyer.internal.model.event.InAppEvent;
import com.appsflyer.internal.model.event.Launch;
import com.appsflyer.internal.model.event.NewGPReferrer;
import com.appsflyer.internal.r;
import com.appsflyer.internal.s;
import com.appsflyer.internal.u;
import com.appsflyer.internal.w;
import com.appsflyer.internal.x;
import com.appsflyer.internal.z;
import com.appsflyer.share.Constants;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.constants.AnalyticEventConstant;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.profilemenu.MyProfileMenuAction;
import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import id.dana.sendmoney.summary.SummaryActivity;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerLibCore extends AppsFlyerLib {
    public static final String AF_PRE_INSTALL_PATH = "AF_PRE_INSTALL_PATH";
    public static final String IS_STOP_TRACKING_USED = "is_stop_tracking_used";
    public static final String LOG_TAG = "AppsFlyer_5.1.1";
    public static final String PRE_INSTALL_SYSTEM_DEFAULT = "/data/local/tmp/pre_install.appsflyer";
    public static final String PRE_INSTALL_SYSTEM_DEFAULT_ETC = "/etc/pre_install.appsflyer";
    public static final String PRE_INSTALL_SYSTEM_RO_PROP = "ro.appsflyer.preinstall.path";

    /* renamed from: ʻ  reason: contains not printable characters */
    private static String f8573 = "https://%slaunches.%s/api/v4.11/androidevent?app_id=";

    /* renamed from: ʽ  reason: contains not printable characters */
    private static String f8574 = "https://%sconversions.%s/api/v4.11/androidevent?app_id=";

    /* renamed from: ˊ  reason: contains not printable characters */
    public static final String f8575 = "292";
    @VisibleForTesting

    /* renamed from: ˊॱ  reason: contains not printable characters */
    private static AppsFlyerLibCore f8576 = new AppsFlyerLibCore();

    /* renamed from: ˋ  reason: contains not printable characters */
    public static AppsFlyerInAppPurchaseValidatorListener f8577 = null;

    /* renamed from: ˏॱ  reason: contains not printable characters */
    private static final List<String> f8578 = Arrays.asList(new String[]{"is_cache"});
    /* access modifiers changed from: private */

    /* renamed from: ॱˊ  reason: contains not printable characters */
    public static AppsFlyerConversionListener f8579 = null;
    public Uri latestDeepLink = null;

    /* renamed from: ʻॱ  reason: contains not printable characters */
    private long f8580 = -1;

    /* renamed from: ʼ  reason: contains not printable characters */
    public long f8581;

    /* renamed from: ʼॱ  reason: contains not printable characters */
    private ah.d f8582;

    /* renamed from: ʽॱ  reason: contains not printable characters */
    private boolean f8583 = false;
    /* access modifiers changed from: private */

    /* renamed from: ʾ  reason: contains not printable characters */
    public ScheduledExecutorService f8584 = null;

    /* renamed from: ʿ  reason: contains not printable characters */
    private long f8585;

    /* renamed from: ˈ  reason: contains not printable characters */
    private boolean f8586 = false;

    /* renamed from: ˉ  reason: contains not printable characters */
    private boolean f8587;

    /* renamed from: ˊˊ  reason: contains not printable characters */
    private String f8588;

    /* renamed from: ˊˋ  reason: contains not printable characters */
    private Map<Long, String> f8589;

    /* renamed from: ˊᐝ  reason: contains not printable characters */
    private boolean f8590;

    /* renamed from: ˋˊ  reason: contains not printable characters */
    private ae f8591 = new ae();

    /* renamed from: ˋˋ  reason: contains not printable characters */
    private boolean f8592 = false;

    /* renamed from: ˋॱ  reason: contains not printable characters */
    private long f8593 = -1;

    /* renamed from: ˋᐝ  reason: contains not printable characters */
    private Application f8594;
    /* access modifiers changed from: private */

    /* renamed from: ˌ  reason: contains not printable characters */
    public Map<String, Object> f8595;

    /* renamed from: ˍ  reason: contains not printable characters */
    private boolean f8596 = false;
    @VisibleForTesting

    /* renamed from: ˎ  reason: contains not printable characters */
    long f8597;
    /* access modifiers changed from: private */

    /* renamed from: ˎˎ  reason: contains not printable characters */
    public Map<String, Object> f8598;

    /* renamed from: ˏ  reason: contains not printable characters */
    public String f8599;

    /* renamed from: ˏˏ  reason: contains not printable characters */
    private String f8600;
    /* access modifiers changed from: private */

    /* renamed from: ˑ  reason: contains not printable characters */
    public boolean f8601 = false;

    /* renamed from: ͺ  reason: contains not printable characters */
    private String f8602;

    /* renamed from: ॱ  reason: contains not printable characters */
    public String f8603;
    /* access modifiers changed from: private */

    /* renamed from: ॱˋ  reason: contains not printable characters */
    public boolean f8604 = false;
    /* access modifiers changed from: private */

    /* renamed from: ॱˎ  reason: contains not printable characters */
    public Map<String, Object> f8605;

    /* renamed from: ॱॱ  reason: contains not printable characters */
    public boolean f8606 = false;

    /* renamed from: ॱᐝ  reason: contains not printable characters */
    private long f8607 = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: ᐝ  reason: contains not printable characters */
    public long f8608;

    /* renamed from: ᐝॱ  reason: contains not printable characters */
    private j f8609 = null;

    @VisibleForTesting
    AppsFlyerLibCore() {
        AFVersionDeclaration.init();
    }

    public static AppsFlyerLibCore getInstance() {
        return f8576;
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    private static void m1173(Context context, String str) {
        Intent intent = new Intent("com.appsflyer.testIntgrationBroadcast");
        intent.putExtra("params", str);
        if (Build.VERSION.SDK_INT < 26) {
            context.sendBroadcast(intent);
        } else if (context.getPackageManager().queryBroadcastReceivers(intent, 0).toString().contains("com.appsflyer.referrerSender")) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName("com.appsflyer.referrerSender", "com.appsflyer.referrerSender.Receiver"));
            context.sendBroadcast(intent2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ˎ  reason: contains not printable characters */
    public final void m1199(Context context, Intent intent) {
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            getInstance();
            String stringExtra = intent.getStringExtra("appsflyer_preinstall");
            try {
                if (new JSONObject(stringExtra).has(Constants.URL_MEDIA_SOURCE)) {
                    AppsFlyerProperties.getInstance().set("preInstallName", stringExtra);
                } else {
                    AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                }
            } catch (JSONException e) {
                AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
            }
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance().setOnReceiveCalled();
        String stringExtra2 = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra2)));
        if (stringExtra2 != null) {
            if ("AppsFlyer_Test".equals(intent.getStringExtra("TestIntegrationMode"))) {
                SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
                edit.clear();
                edit.apply();
                AppsFlyerProperties.getInstance().setFirstLaunchCalled(false);
                AFLogger.afInfoLog("Test mode started..");
                this.f8585 = System.currentTimeMillis();
            }
            SharedPreferences.Editor edit2 = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
            edit2.putString("referrer", stringExtra2);
            edit2.apply();
            AppsFlyerProperties.getInstance().setReferrer(stringExtra2);
            if (AppsFlyerProperties.getInstance().isFirstLaunchCalled()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                if (stringExtra2 != null && stringExtra2.length() > 5) {
                    ScheduledThreadPoolExecutor r0 = AFExecutor.getInstance().m1118();
                    AFEvent r8 = new BackgroundReferrerLaunch().context(context).m1116();
                    r8.f8541 = new WeakReference<>(r8.f8537);
                    r8.f8537 = null;
                    r8.f8544 = stringExtra2;
                    r8.f8545 = intent;
                    m1150(r0, new d(this, r8, (byte) 0), 5, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* renamed from: ॱ  reason: contains not printable characters */
    private static void m1190(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2:
        while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i2) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            i2++;
                            str = next;
                        }
                    }
                    continue;
                } catch (JSONException unused2) {
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    /* renamed from: ˊ  reason: contains not printable characters */
    static void m1145(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getString("extraReferrers", (String) null);
            if (string == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(string);
                if (jSONObject2.has(str)) {
                    jSONArray2 = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray2 = new JSONArray();
                }
                JSONObject jSONObject3 = jSONObject2;
                jSONArray = jSONArray2;
                jSONObject = jSONObject3;
            }
            if (((long) jSONArray.length()) < 5) {
                jSONArray.put(currentTimeMillis);
            }
            if (((long) jSONObject.length()) >= 4) {
                m1190(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            String jSONObject4 = jSONObject.toString();
            SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
            edit.putString("extraReferrers", jSONObject4);
            edit.apply();
        } catch (JSONException unused) {
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    public void stopTracking(boolean z, Context context) {
        this.f8592 = z;
        z.m1303();
        try {
            File r0 = z.m1304(context);
            if (!r0.exists()) {
                r0.mkdir();
            } else {
                for (File file : r0.listFiles()) {
                    file.getName();
                    z.m1305(z.m1306(file).f8557, context);
                }
            }
        } catch (Exception unused) {
        }
        if (this.f8592) {
            SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
            edit.putBoolean(IS_STOP_TRACKING_USED, true);
            edit.apply();
        }
    }

    public void onPause(Context context) {
        f.AnonymousClass5.m1275(context);
        w r2 = w.m1292(context);
        r2.f8790.post(r2.f8798);
    }

    public void updateServerUninstallToken(Context context, String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-427571868, oncanceled);
                onCancelLoad.getMin(-427571868, oncanceled);
            }
        }
        r.AnonymousClass3.m1282(context, str);
    }

    public AppsFlyerLib enableLocationCollection(boolean z) {
        this.f8583 = z;
        return this;
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    public static String m1155(String str) {
        return AppsFlyerProperties.getInstance().getString(str);
    }

    public void waitForCustomerUserId(boolean z) {
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
    }

    public String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        String r3 = m1165((WeakReference<Context>) new WeakReference(context), "AF_STORE");
        if (r3 != null) {
            return r3;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    public void setOutOfStore(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.m1133("Cannot set setOutOfStore with null");
    }

    public void sendDeepLinkData(Activity activity) {
        if (activity != null && activity.getIntent() != null) {
            if (am.f8691 == null) {
                am.f8691 = new am();
            }
            am amVar = am.f8691;
            StringBuilder sb = new StringBuilder("activity_intent_");
            sb.append(activity.getIntent().toString());
            amVar.m1247("public_api_call", "sendDeepLinkData", activity.getLocalClassName(), sb.toString());
        } else if (activity != null) {
            if (am.f8691 == null) {
                am.f8691 = new am();
            }
            am.f8691.m1247("public_api_call", "sendDeepLinkData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            if (am.f8691 == null) {
                am.f8691 = new am();
            }
            am.f8691.m1247("public_api_call", "sendDeepLinkData", "activity_null");
        }
        try {
            m1187(new Launch().context(activity.getApplication()));
            StringBuilder sb2 = new StringBuilder("getDeepLinkData with activity ");
            sb2.append(activity.getIntent().getDataString());
            AFLogger.afInfoLog(sb2.toString());
        } catch (Exception e) {
            AFLogger.afInfoLog("getDeepLinkData Exception: ".concat(String.valueOf(e)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendPushNotificationData(android.app.Activity r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "c"
            java.lang.String r3 = "pid"
            r4 = 1
            r5 = 0
            r6 = 2
            java.lang.String r7 = "public_api_call"
            java.lang.String r8 = "sendPushNotificationData"
            if (r2 == 0) goto L_0x0048
            android.content.Intent r9 = r17.getIntent()
            if (r9 == 0) goto L_0x0048
            com.appsflyer.internal.am r9 = com.appsflyer.internal.am.f8691
            if (r9 != 0) goto L_0x0022
            com.appsflyer.internal.am r9 = new com.appsflyer.internal.am
            r9.<init>()
            com.appsflyer.internal.am.f8691 = r9
        L_0x0022:
            com.appsflyer.internal.am r9 = com.appsflyer.internal.am.f8691
            java.lang.String[] r10 = new java.lang.String[r6]
            java.lang.String r11 = r17.getLocalClassName()
            r10[r5] = r11
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r11 = "activity_intent_"
            r5.<init>(r11)
            android.content.Intent r11 = r17.getIntent()
            java.lang.String r11 = r11.toString()
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r10[r4] = r5
            r9.m1247(r7, r8, r10)
            goto L_0x007d
        L_0x0048:
            if (r2 == 0) goto L_0x0067
            com.appsflyer.internal.am r9 = com.appsflyer.internal.am.f8691
            if (r9 != 0) goto L_0x0055
            com.appsflyer.internal.am r9 = new com.appsflyer.internal.am
            r9.<init>()
            com.appsflyer.internal.am.f8691 = r9
        L_0x0055:
            com.appsflyer.internal.am r9 = com.appsflyer.internal.am.f8691
            java.lang.String[] r10 = new java.lang.String[r6]
            java.lang.String r11 = r17.getLocalClassName()
            r10[r5] = r11
            java.lang.String r5 = "activity_intent_null"
            r10[r4] = r5
            r9.m1247(r7, r8, r10)
            goto L_0x007d
        L_0x0067:
            com.appsflyer.internal.am r4 = com.appsflyer.internal.am.f8691
            if (r4 != 0) goto L_0x0072
            com.appsflyer.internal.am r4 = new com.appsflyer.internal.am
            r4.<init>()
            com.appsflyer.internal.am.f8691 = r4
        L_0x0072:
            com.appsflyer.internal.am r4 = com.appsflyer.internal.am.f8691
            java.lang.String r5 = "activity_null"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r4.m1247(r7, r8, r5)
        L_0x007d:
            boolean r4 = r2 instanceof android.app.Activity
            if (r4 == 0) goto L_0x00b0
            r4 = r2
            android.app.Activity r4 = (android.app.Activity) r4
            android.content.Intent r7 = r4.getIntent()
            if (r7 == 0) goto L_0x00b0
            android.os.Bundle r8 = r7.getExtras()
            if (r8 == 0) goto L_0x00b0
            java.lang.String r9 = "af"
            java.lang.String r10 = r8.getString(r9)
            if (r10 == 0) goto L_0x00b1
            java.lang.String r11 = java.lang.String.valueOf(r10)
            java.lang.String r12 = "Push Notification received af payload = "
            java.lang.String r11 = r12.concat(r11)
            com.appsflyer.AFLogger.afInfoLog(r11)
            r8.remove(r9)
            android.content.Intent r7 = r7.putExtras(r8)
            r4.setIntent(r7)
            goto L_0x00b1
        L_0x00b0:
            r10 = 0
        L_0x00b1:
            r1.f8588 = r10
            if (r10 == 0) goto L_0x01ca
            long r7 = java.lang.System.currentTimeMillis()
            java.util.Map<java.lang.Long, java.lang.String> r4 = r1.f8589
            java.lang.String r9 = ")"
            if (r4 != 0) goto L_0x00ce
            java.lang.String r0 = "pushes: initializing pushes history.."
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f8589 = r0
            r12 = r7
            goto L_0x017f
        L_0x00ce:
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0164 }
            java.lang.String r10 = "pushPayloadMaxAging"
            r11 = 1800000(0x1b7740, double:8.89318E-318)
            long r10 = r4.getLong(r10, r11)     // Catch:{ all -> 0x0164 }
            java.util.Map<java.lang.Long, java.lang.String> r4 = r1.f8589     // Catch:{ all -> 0x0164 }
            java.util.Set r4 = r4.keySet()     // Catch:{ all -> 0x0164 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0164 }
            r12 = r7
        L_0x00e6:
            boolean r14 = r4.hasNext()     // Catch:{ all -> 0x0162 }
            if (r14 == 0) goto L_0x017f
            java.lang.Object r14 = r4.next()     // Catch:{ all -> 0x0162 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x0162 }
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ all -> 0x0162 }
            java.lang.String r6 = r1.f8588     // Catch:{ all -> 0x0162 }
            r15.<init>(r6)     // Catch:{ all -> 0x0162 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x0162 }
            java.util.Map<java.lang.Long, java.lang.String> r5 = r1.f8589     // Catch:{ all -> 0x0162 }
            java.lang.Object r5 = r5.get(r14)     // Catch:{ all -> 0x0162 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0162 }
            r6.<init>(r5)     // Catch:{ all -> 0x0162 }
            java.lang.Object r5 = r15.get(r3)     // Catch:{ all -> 0x0162 }
            java.lang.Object r2 = r6.get(r3)     // Catch:{ all -> 0x0162 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x0142
            java.lang.Object r2 = r15.get(r0)     // Catch:{ all -> 0x0162 }
            java.lang.Object r5 = r6.get(r0)     // Catch:{ all -> 0x0162 }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x0142
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = "PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: "
            r0.<init>(r2)     // Catch:{ all -> 0x0162 }
            r0.append(r6)     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = ", new: "
            r0.append(r2)     // Catch:{ all -> 0x0162 }
            r0.append(r15)     // Catch:{ all -> 0x0162 }
            r0.append(r9)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0162 }
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch:{ all -> 0x0162 }
            r2 = 0
            r1.f8588 = r2     // Catch:{ all -> 0x0162 }
            return
        L_0x0142:
            r2 = 0
            long r5 = r14.longValue()     // Catch:{ all -> 0x0162 }
            long r5 = r7 - r5
            int r15 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x0152
            java.util.Map<java.lang.Long, java.lang.String> r5 = r1.f8589     // Catch:{ all -> 0x0162 }
            r5.remove(r14)     // Catch:{ all -> 0x0162 }
        L_0x0152:
            long r5 = r14.longValue()     // Catch:{ all -> 0x0162 }
            int r15 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r15 > 0) goto L_0x015e
            long r12 = r14.longValue()     // Catch:{ all -> 0x0162 }
        L_0x015e:
            r2 = r17
            r6 = 2
            goto L_0x00e6
        L_0x0162:
            r0 = move-exception
            goto L_0x0166
        L_0x0164:
            r0 = move-exception
            r12 = r7
        L_0x0166:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error while handling push notification measurement: "
            r2.<init>(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.appsflyer.AFLogger.afErrorLog(r2, r0)
        L_0x017f:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "pushPayloadHistorySize"
            r3 = 2
            int r0 = r0.getInt(r2, r3)
            java.util.Map<java.lang.Long, java.lang.String> r2 = r1.f8589
            int r2 = r2.size()
            if (r2 != r0) goto L_0x01af
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "pushes: removing oldest overflowing push (oldest push:"
            r0.<init>(r2)
            r0.append(r12)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.f8589
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            r0.remove(r2)
        L_0x01af:
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.f8589
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = r1.f8588
            r0.put(r2, r3)
            android.app.Application r0 = r17.getApplication()
            com.appsflyer.internal.model.event.Launch r2 = new com.appsflyer.internal.model.event.Launch
            r2.<init>()
            com.appsflyer.AFEvent r0 = r2.context(r0)
            r1.m1187((com.appsflyer.AFEvent) r0)
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.sendPushNotificationData(android.app.Activity):void");
    }

    public void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setUserEmails", (String[]) arrayList.toArray(new String[(strArr.length + 1)]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        String str = null;
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : strArr) {
            if (AnonymousClass10.f8855[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(af.m1226(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$10  reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {

        /* renamed from: ˎ  reason: contains not printable characters */
        static final /* synthetic */ int[] f8855;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.appsflyer.AppsFlyerProperties$EmailsCryptType[] r0 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8855 = r0
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r1 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.SHA256     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8855     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r1 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.AnonymousClass10.<clinit>():void");
        }
    }

    public void setResolveDeepLinkURLs(String... strArr) {
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", new Object[]{Arrays.toString(strArr)}));
        f.f8746 = strArr;
    }

    public void setOneLinkCustomDomain(String... strArr) {
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", new Object[]{Arrays.toString(strArr)}));
        f.f8742 = strArr;
    }

    public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1105503320, oncanceled);
            onCancelLoad.getMin(-1105503320, oncanceled);
        }
        if (context != null) {
            this.f8594 = (Application) context.getApplicationContext();
            if (m1152(context)) {
                if (this.f8609 == null) {
                    j jVar = new j();
                    this.f8609 = jVar;
                    jVar.m1278(context, new m() {
                        /* renamed from: ˏ  reason: contains not printable characters */
                        public final void m1331(Map<String, Object> map) {
                            Map unused = AppsFlyerLibCore.this.f8605 = map;
                            AppsFlyerLibCore.m1159(AppsFlyerLibCore.this, (Map) map);
                        }
                    });
                } else {
                    AFLogger.afWarnLog("AFInstallReferrer instance already created");
                }
            }
            this.f8601 = m1179(context);
        } else {
            AFLogger.afWarnLog("init :: context is null, Google Install Referrer will be not initialized!");
        }
        return init(str, appsFlyerConversionListener);
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    private boolean m1179(Context context) {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            this.f8598 = new ConcurrentHashMap();
            AnonymousClass4 r4 = new r.c() {
                /* renamed from: ॱ  reason: contains not printable characters */
                public final void m1333(@NonNull String str, @NonNull String str2) {
                    AppsFlyerLibCore.this.f8598.put("signedData", str);
                    AppsFlyerLibCore.this.f8598.put(BranchLinkConstant.OauthParams.SIGNATURE, str2);
                    AppsFlyerLibCore.this.f8598.put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                }

                /* renamed from: ॱ  reason: contains not printable characters */
                public final void m1332(String str, Exception exc) {
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    AppsFlyerLibCore.this.f8598.put("error", message);
                    AFLogger.afErrorLog(str, exc, true);
                }
            };
            try {
                Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                Method method = cls.getMethod("checkLicense", new Class[]{Long.TYPE, Context.class, cls2});
                r.AnonymousClass3 r7 = new r.AnonymousClass3(r4);
                method.invoke((Object) null, new Object[]{Long.valueOf(currentTimeMillis), context, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, r7)});
            } catch (ClassNotFoundException e) {
                r4.m1284(e.getClass().getSimpleName(), (Exception) e);
            } catch (NoSuchMethodException e2) {
                r4.m1284(e2.getClass().getSimpleName(), (Exception) e2);
            } catch (IllegalAccessException e3) {
                r4.m1284(e3.getClass().getSimpleName(), (Exception) e3);
            } catch (InvocationTargetException e4) {
                r4.m1284(e4.getClass().getSimpleName(), (Exception) e4);
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void enableFacebookDeferredApplinks(boolean z) {
        this.f8596 = z;
    }

    public void startTracking(Application application) {
        if (!this.f8587) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'startTracking(Application)' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        } else {
            startTracking(application, (String) null);
        }
    }

    public void startTracking(Application application, String str) {
        startTracking(application, str, (AppsFlyerTrackingRequestListener) null);
    }

    public void startTracking(Application application, String str, AppsFlyerTrackingRequestListener appsFlyerTrackingRequestListener) {
        Application application2 = application;
        String str2 = str;
        this.f8594 = application2;
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "startTracking", str2);
        AFLogger.afInfoLog(String.format("Starting AppsFlyer Tracking: (v%s.%s)", new Object[]{BuildConfig.VERSION_NAME, f8575}));
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(f8575);
        AFLogger.afInfoLog(sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(application.getApplicationContext());
        if (!TextUtils.isEmpty(str)) {
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_KEY, str2);
            AFFacebookDeferredDeeplink.AnonymousClass4.m1123(str);
        } else if (TextUtils.isEmpty(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY))) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the startTracking API method (should be called on Activity's onCreate).");
            return;
        }
        Context baseContext = application.getBaseContext();
        try {
            if ((baseContext.getPackageManager().getPackageInfo(baseContext.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("checkBackupRules Exception: ");
            sb2.append(e.toString());
            AFLogger.afRDLog(sb2.toString());
        }
        if (this.f8596) {
            Context applicationContext = application.getApplicationContext();
            this.f8595 = new HashMap();
            final long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass1 r9 = new AFFacebookDeferredDeeplink.AppLinkFetchEvents() {
                public final void onAppLinkFetchFinished(String str, String str2, String str3) {
                    if (str != null) {
                        AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(String.valueOf(str)));
                        AppsFlyerLibCore.this.f8595.put("link", str);
                        if (str2 != null) {
                            AppsFlyerLibCore.this.f8595.put("target_url", str2);
                        }
                        if (str3 != null) {
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(MyProfileMenuAction.PROMO_CODE, str3);
                            hashMap.put("deeplink_context", hashMap2);
                            AppsFlyerLibCore.this.f8595.put("extras", hashMap);
                        }
                    } else {
                        AppsFlyerLibCore.this.f8595.put("link", "");
                    }
                    AppsFlyerLibCore.this.f8595.put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }

                public final void onAppLinkFetchFailed(String str) {
                    AppsFlyerLibCore.this.f8595.put("error", str);
                }
            };
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{applicationContext});
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", new Class[]{Context.class, String.class, cls2});
                AFFacebookDeferredDeeplink.AnonymousClass4 r13 = new AFFacebookDeferredDeeplink.AnonymousClass4(cls, r9);
                Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, r13);
                String string = applicationContext.getString(applicationContext.getResources().getIdentifier("facebook_app_id", "string", applicationContext.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    r9.onAppLinkFetchFailed("Facebook app id not defined in resources");
                } else {
                    method.invoke((Object) null, new Object[]{applicationContext, string, newProxyInstance});
                }
            } catch (NoSuchMethodException e2) {
                r9.onAppLinkFetchFailed(e2.toString());
            } catch (InvocationTargetException e3) {
                r9.onAppLinkFetchFailed(e3.toString());
            } catch (ClassNotFoundException e4) {
                r9.onAppLinkFetchFailed(e4.toString());
            } catch (IllegalAccessException e5) {
                r9.onAppLinkFetchFailed(e5.toString());
            }
        }
        AFEvent context = new Launch().context(application2);
        context.f8536 = str2;
        context.f8542 = appsFlyerTrackingRequestListener;
        m1187(context);
    }

    public void setPhoneNumber(String str) {
        this.f8600 = af.m1226(str);
    }

    public void trackAppLaunch(Context context, String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-1325616248, oncanceled);
                onCancelLoad.getMin(-1325616248, oncanceled);
            }
        }
        if (m1152(context)) {
            if (this.f8609 == null) {
                j jVar = new j();
                this.f8609 = jVar;
                jVar.m1278(context, new m() {
                    /* renamed from: ˏ  reason: contains not printable characters */
                    public final void m1330(Map<String, Object> map) {
                        Map unused = AppsFlyerLibCore.this.f8605 = map;
                        AppsFlyerLibCore.m1159(AppsFlyerLibCore.this, (Map) map);
                    }
                });
            } else {
                AFLogger.afWarnLog("AFInstallReferrer instance already created");
            }
        }
        m1186(context, str, "", (Intent) null);
    }

    /* access modifiers changed from: protected */
    public void setDeepLinkData(Intent intent) {
        if (intent != null) {
            try {
                if ("android.intent.action.VIEW".equals(intent.getAction())) {
                    this.latestDeepLink = intent.getData();
                    StringBuilder sb = new StringBuilder("Unity setDeepLinkData = ");
                    sb.append(this.latestDeepLink);
                    AFLogger.afDebugLog(sb.toString());
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while setting deeplink data (unity). ", th);
            }
        }
    }

    public void setPluginDeepLinkData(Intent intent) {
        setDeepLinkData(intent);
    }

    public void trackEvent(Context context, String str, Map<String, Object> map, AppsFlyerTrackingRequestListener appsFlyerTrackingRequestListener) {
        JSONObject jSONObject = new JSONObject(map == null ? new HashMap<>() : map);
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "trackEvent", str, jSONObject.toString());
        if (str != null) {
            w r0 = w.m1292(context);
            long currentTimeMillis = System.currentTimeMillis();
            if (r0.f8792 != 0) {
                r0.f8793++;
                if (r0.f8792 - currentTimeMillis < 500) {
                    r0.f8790.removeCallbacks(r0.f8788);
                    r0.f8790.post(r0.f8797);
                }
            } else {
                r0.f8790.post(r0.f8798);
                r0.f8790.post(r0.f8797);
            }
            r0.f8792 = currentTimeMillis;
        }
        AFEvent context2 = new InAppEvent().context(context);
        context2.f8548 = str;
        context2.f8535 = map;
        context2.f8542 = appsFlyerTrackingRequestListener;
        m1197(context2);
    }

    public void sendAdRevenue(Context context, Map<String, Object> map) {
        Context context2;
        AFEvent context3 = new AdRevenue().context(context);
        context3.f8535 = map;
        if (context3.f8537 != null) {
            context2 = context3.f8537;
        } else {
            context2 = context3.f8541 != null ? context3.f8541.get() : null;
        }
        String url = ServerConfigHandler.getUrl("https://%sadrevenue.%s/api/v5.1/android?buildnumber=5.1.1&app_id=");
        StringBuilder sb = new StringBuilder();
        sb.append(url);
        sb.append(context2.getPackageName());
        String obj = sb.toString();
        SharedPreferences sharedPreferences = context2.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        int r4 = m1161(sharedPreferences, "appsFlyerCount", false);
        int r5 = m1161(sharedPreferences, "appsFlyerAdRevenueCount", true);
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", context3.f8535);
        hashMap.put("adrevenue_counter", Integer.valueOf(r5));
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
        hashMap.put("af_key", string);
        hashMap.put("launch_counter", Integer.valueOf(r4));
        hashMap.put("af_timestamp", Long.toString(new Date().getTime()));
        hashMap.put("uid", ag.m1231(new WeakReference(context2)));
        String string2 = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
        hashMap.put("advertiserIdEnabled", AppsFlyerProperties.getInstance().getString("advertiserIdEnabled"));
        if (string2 != null) {
            hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, string2);
        }
        hashMap.put(TwilioIdentityVerificationActivity.CHALLENGE_INFO_DEVICE, Build.DEVICE);
        m1148(context2, (Map<String, Object>) hashMap);
        try {
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            long j = packageInfo.firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("install_date", simpleDateFormat.format(new Date(j)));
            String string3 = sharedPreferences.getString("appsFlyerFirstInstall", (String) null);
            if (string3 == null) {
                string3 = m1156(simpleDateFormat, context2);
            }
            hashMap.put("first_launch_date", string3);
        } catch (Throwable th) {
            AFLogger.afErrorLog("AdRevenue - Exception while collecting app version data ", th);
        }
        AFEvent urlString = context3.urlString(obj);
        urlString.f8539 = hashMap;
        AFEvent r13 = urlString.m1116();
        r13.f8538 = r4;
        r13.f8536 = string;
        m1150(AFExecutor.getInstance().m1118(), new b(this, r13, (byte) 0), 1, TimeUnit.MILLISECONDS);
    }

    public void trackEvent(Context context, String str, Map<String, Object> map) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        int i = 0;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-311585033, oncanceled);
                onCancelLoad.getMin(-311585033, oncanceled);
            }
        }
        Context applicationContext2 = context != null ? context.getApplicationContext() : null;
        if (applicationContext2 != null) {
            if (str != null) {
                i = str.length();
            }
            int min2 = dispatchOnCancelled.getMin(applicationContext2, i);
            if (i != min2) {
                onCanceled oncanceled2 = new onCanceled(i, min2, 32);
                onCancelLoad.setMax(-311585033, oncanceled2);
                onCancelLoad.getMin(-311585033, oncanceled2);
            }
        }
        trackEvent(context, str, map, (AppsFlyerTrackingRequestListener) null);
    }

    /* access modifiers changed from: protected */
    public void getConversionData(Context context, final ConversionDataListener conversionDataListener) {
        f8579 = new AppsFlyerConversionListener() {
            public final void onAppOpenAttribution(Map<String, String> map) {
            }

            public final void onAttributionFailure(String str) {
            }

            public final void onConversionDataSuccess(Map<String, Object> map) {
                StringBuilder sb = new StringBuilder("Calling onConversionDataLoaded with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                conversionDataListener.onConversionDataLoaded(map);
            }

            public final void onConversionDataFail(String str) {
                AFLogger.afDebugLog("Calling onConversionFailure with:\n".concat(String.valueOf(str)));
                conversionDataListener.onConversionFailure(str);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: ˏ  reason: contains not printable characters */
    public static Map<String, Object> m1172(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!f8578.contains(next)) {
                    hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: ॱ  reason: contains not printable characters */
    private void m1186(Context context, String str, String str2, Intent intent) {
        AFEvent context2 = new Launch().context(context);
        context2.f8548 = null;
        context2.f8536 = str;
        context2.f8535 = null;
        context2.f8544 = str2;
        context2.f8545 = intent;
        context2.f8533 = null;
        m1149(context2);
    }

    /* renamed from: ˊ  reason: contains not printable characters */
    private void m1149(AFEvent aFEvent) {
        aFEvent.m1116();
        boolean z = aFEvent.f8548 == null;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) && AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) == null) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        if (z) {
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else if (m1178()) {
                return;
            }
            this.f8593 = System.currentTimeMillis();
        }
        ScheduledThreadPoolExecutor r0 = AFExecutor.getInstance().m1118();
        aFEvent.f8541 = new WeakReference<>(aFEvent.f8537);
        aFEvent.f8537 = null;
        m1150(r0, new d(this, aFEvent, (byte) 0), 150, TimeUnit.MILLISECONDS);
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    private boolean m1178() {
        if (this.f8593 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f8593;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            long j = this.f8593;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date(j));
            long j2 = this.f8580;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format2 = simpleDateFormat.format(new Date(j2));
            if (currentTimeMillis < this.f8607 && !isTrackingStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.f8607)}));
                return true;
            } else if (!isTrackingStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{format, format2, Long.valueOf(currentTimeMillis)}));
            }
        } else if (!isTrackingStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        return false;
    }

    /* renamed from: ॱ  reason: contains not printable characters */
    public static boolean m1191(@NonNull SharedPreferences sharedPreferences) {
        return Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", (String) null));
    }

    /* renamed from: ˊ  reason: contains not printable characters */
    private static void m1148(Context context, Map<String, Object> map) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            map.put("sc_o", rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? "" : "lr" : RVParams.PULL_REFRESH : "l" : "p");
        }
    }

    public void setConsumeAFDeepLinks(boolean z) {
        AppsFlyerProperties.getInstance().set("consumeAfDeepLink", z);
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setConsumeAFDeepLinks: ".concat(String.valueOf(z)), new String[0]);
    }

    public void handleDeepLinkCallback(Context context, Map<String, Object> map, Uri uri) {
        String str;
        String obj = uri.toString();
        if (obj == null) {
            obj = null;
        } else if (obj.matches("fb\\d*?://authorize.*") && obj.contains("access_token")) {
            int indexOf = obj.indexOf(63);
            if (indexOf == -1) {
                str = "";
            } else {
                str = obj.substring(indexOf);
            }
            if (str.length() != 0) {
                ArrayList arrayList = new ArrayList();
                if (str.contains("&")) {
                    arrayList = new ArrayList(Arrays.asList(str.split("&")));
                } else {
                    arrayList.add(str);
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (str2.contains("access_token")) {
                        it.remove();
                    } else {
                        if (sb.length() != 0) {
                            sb.append("&");
                        } else if (!str2.startsWith("?")) {
                            sb.append("?");
                        }
                        sb.append(str2);
                    }
                }
                obj = obj.replace(str, sb.toString());
            }
        }
        boolean z = true;
        if (!map.containsKey("af_deeplink")) {
            map.put("af_deeplink", obj);
        } else {
            this.f8586 = "AppsFlyer_Test".equals(uri.getQueryParameter(AnalyticEventConstant.AE_MEDIA_SOURCE)) && Boolean.parseBoolean(uri.getQueryParameter("is_retargeting"));
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        final WeakReference weakReference = new WeakReference(context);
        ai aiVar = new ai(uri, this);
        aiVar.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
        if (TextUtils.isEmpty(aiVar.f8639) || TextUtils.isEmpty(aiVar.f8683) || aiVar.f8639.equals("app")) {
            z = false;
        }
        if (z) {
            aiVar.f8682 = new ai.e() {
                /* renamed from: ˋ  reason: contains not printable characters */
                public final void m1204(String str) {
                    if (AppsFlyerLibCore.f8579 != null) {
                        m1203(hashMap);
                        AFLogger.afDebugLog("Calling onAttributionFailure with:\n".concat(String.valueOf(str)));
                        AppsFlyerLibCore.f8579.onAttributionFailure(str);
                    }
                }

                /* renamed from: ˏ  reason: contains not printable characters */
                private void m1203(Map<String, String> map) {
                    if (weakReference.get() != null) {
                        AppsFlyerLibCore.m1174((Context) weakReference.get(), "deeplinkAttribution", new JSONObject(map).toString());
                    }
                }

                /* renamed from: ˎ  reason: contains not printable characters */
                public final void m1205(Map<String, String> map) {
                    for (String next : map.keySet()) {
                        hashMap.put(next, map.get(next));
                    }
                    m1203(hashMap);
                    AppsFlyerLibCore.m1177((Map<String, String>) hashMap);
                }
            };
            AFExecutor.getInstance().getThreadPoolExecutor().execute(aiVar);
            return;
        }
        m1177(AFExecutor.AnonymousClass5.AnonymousClass3.m1120(context, hashMap, uri));
    }

    /* access modifiers changed from: private */
    /* renamed from: ˏ  reason: contains not printable characters */
    public static void m1177(Map<String, String> map) {
        if (f8579 != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                f8579.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    /* renamed from: ʽ  reason: contains not printable characters */
    private static boolean m1139(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    /* renamed from: ᐝ  reason: contains not printable characters */
    private static boolean m1196(Context context) {
        if ((AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) || !m1139(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: ʼ  reason: contains not printable characters */
    private static String m1137(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        String r2 = m1165((WeakReference<Context>) new WeakReference(context), "AF_STORE");
        if (r2 != null) {
            return r2;
        }
        return null;
    }

    /* renamed from: ˎ  reason: contains not printable characters */
    private static String m1163(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(ContactEventType.CONTACT_GET, new Class[]{String.class}).invoke((Object) null, new Object[]{str});
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    @Nullable
    /* renamed from: ˎ  reason: contains not printable characters */
    private static String m1165(WeakReference<Context> weakReference, String str) {
        if (weakReference.get() == null) {
            return null;
        }
        return m1164(str, weakReference.get().getPackageManager(), weakReference.get().getPackageName());
    }

    @Nullable
    /* renamed from: ˎ  reason: contains not printable characters */
    private static String m1164(String str, PackageManager packageManager, String str2) {
        Object obj;
        try {
            Bundle bundle = packageManager.getApplicationInfo(str2, 128).metaData;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not find ");
            sb.append(str);
            sb.append(" value in the manifest");
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    public void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put(Constants.URL_MEDIA_SOURCE, str);
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            jSONObject.put(Constants.URL_SITE_ID, str3);
        }
        if (jSONObject.has(Constants.URL_MEDIA_SOURCE)) {
            AppsFlyerProperties.getInstance().set("preInstallName", jSONObject.toString());
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC, Splitter:B:16:0x0031] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0028=Splitter:B:13:0x0028, B:22:0x003f=Splitter:B:22:0x003f} */
    /* renamed from: ˎ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m1162(java.io.File r4, java.lang.String r5) {
        /*
            r0 = 0
            java.util.Properties r1 = new java.util.Properties     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r1.load(r2)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            java.lang.String r3 = "Found PreInstall property!"
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            java.lang.String r4 = r1.getProperty(r5)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            r2.close()     // Catch:{ all -> 0x001b }
            goto L_0x0023
        L_0x001b:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r5)
        L_0x0023:
            return r4
        L_0x0024:
            r4 = move-exception
            goto L_0x0028
        L_0x0026:
            r4 = move-exception
            r2 = r0
        L_0x0028:
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x005a }
            com.appsflyer.AFLogger.afErrorLog(r5, r4)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0035 }
            goto L_0x0059
        L_0x0035:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r5, r4)
            goto L_0x0059
        L_0x003e:
            r2 = r0
        L_0x003f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "PreInstall file wasn't found: "
            r5.<init>(r1)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x005a }
            r5.append(r4)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x005a }
            com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0035 }
        L_0x0059:
            return r0
        L_0x005a:
            r4 = move-exception
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r5)
        L_0x0069:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m1162(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: ʻ  reason: contains not printable characters */
    private static File m1135(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.trim().length() > 0) {
                return new File(str.trim());
            }
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    @Nullable
    /* renamed from: ॱ  reason: contains not printable characters */
    public static String m1182(WeakReference<Context> weakReference) {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string == null) {
            string = m1165(weakReference, "CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public boolean isPreInstalledApp(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
    }

    public String getAttributionId(Context context) {
        try {
            return new ad(context).m1219();
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    /* renamed from: ॱ  reason: contains not printable characters */
    public static SharedPreferences m1180(Context context) {
        return context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
    }

    /* renamed from: ˎ  reason: contains not printable characters */
    public static int m1161(SharedPreferences sharedPreferences, String str, boolean z) {
        int i = sharedPreferences.getInt(str, 0);
        if (z) {
            i++;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            edit.apply();
        }
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        if (am.f8691.f8702) {
            if (am.f8691 == null) {
                am.f8691 = new am();
            }
            am.f8691.m1250(String.valueOf(i));
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: ˊ  reason: contains not printable characters */
    public static void m1150(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, j, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e) {
                AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.afWarnLog("scheduler is null, shut downed or terminated");
    }

    public boolean isTrackingStopped() {
        return this.f8592;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r3 != null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054 A[SYNTHETIC, Splitter:B:23:0x0054] */
    @androidx.annotation.NonNull
    /* renamed from: ˏ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1170(java.net.HttpURLConnection r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.InputStream r2 = r7.getErrorStream()     // Catch:{ all -> 0x0037 }
            if (r2 != 0) goto L_0x0010
            java.io.InputStream r2 = r7.getInputStream()     // Catch:{ all -> 0x0037 }
        L_0x0010:
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0037 }
            r3.<init>(r2)     // Catch:{ all -> 0x0037 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0035 }
            r2.<init>(r3)     // Catch:{ all -> 0x0035 }
        L_0x001a:
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0029
            r0.append(r1)     // Catch:{ all -> 0x0030 }
            r1 = 10
            r0.append(r1)     // Catch:{ all -> 0x0030 }
            goto L_0x001a
        L_0x0029:
            r2.close()     // Catch:{ all -> 0x005a }
        L_0x002c:
            r3.close()     // Catch:{ all -> 0x005a }
            goto L_0x005a
        L_0x0030:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0039
        L_0x0035:
            r2 = move-exception
            goto L_0x0039
        L_0x0037:
            r2 = move-exception
            r3 = r1
        L_0x0039:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            java.lang.String r5 = "Could not read connection response from: "
            r4.<init>(r5)     // Catch:{ all -> 0x007e }
            java.net.URL r7 = r7.getURL()     // Catch:{ all -> 0x007e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x007e }
            r4.append(r7)     // Catch:{ all -> 0x007e }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x007e }
            com.appsflyer.AFLogger.afErrorLog(r7, r2)     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ all -> 0x005a }
        L_0x0057:
            if (r3 == 0) goto L_0x005a
            goto L_0x002c
        L_0x005a:
            java.lang.String r7 = r0.toString()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0064 }
            r0.<init>(r7)     // Catch:{ JSONException -> 0x0064 }
            return r7
        L_0x0064:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "string_response"
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r7 = r0.toString()     // Catch:{ JSONException -> 0x0074 }
            return r7
        L_0x0074:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r7 = r7.toString()
            return r7
        L_0x007e:
            r7 = move-exception
            if (r1 == 0) goto L_0x0084
            r1.close()     // Catch:{ all -> 0x0089 }
        L_0x0084:
            if (r3 == 0) goto L_0x0089
            r3.close()     // Catch:{ all -> 0x0089 }
        L_0x0089:
            goto L_0x008b
        L_0x008a:
            throw r7
        L_0x008b:
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m1170(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: ʻ  reason: contains not printable characters */
    private static float m1134(Context context) {
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            return (((float) intExtra) / ((float) intExtra2)) * 100.0f;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return 1.0f;
        }
    }

    /* renamed from: ˊॱ  reason: contains not printable characters */
    private static boolean m1153(Context context) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    for (Network networkCapabilities : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(networkCapabilities);
                        if (networkCapabilities2.hasTransport(4) && !networkCapabilities2.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e);
                }
            } else if (Build.VERSION.SDK_INT >= 16) {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e2);
                }
            }
        }
        return false;
    }

    public void setLogLevel(AFLogger.LogLevel logLevel) {
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }

    public void setMinTimeBetweenSessions(int i) {
        this.f8607 = TimeUnit.SECONDS.toMillis((long) i);
    }

    class d implements Runnable {

        /* renamed from: ˋ  reason: contains not printable characters */
        private AFEvent f8630;

        /* synthetic */ d(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent, byte b) {
            this(aFEvent);
        }

        private d(AFEvent aFEvent) {
            this.f8630 = aFEvent;
        }

        public final void run() {
            AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
            AFEvent aFEvent = this.f8630;
            aFEvent.f8537 = aFEvent.f8541.get();
            appsFlyerLibCore.m1175(aFEvent);
        }
    }

    class b implements Runnable {

        /* renamed from: ˏ  reason: contains not printable characters */
        private final AFEvent f8625;

        /* synthetic */ b(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent, byte b) {
            this(aFEvent);
        }

        private b(AFEvent aFEvent) {
            aFEvent.f8541 = new WeakReference<>(aFEvent.f8537);
            aFEvent.f8537 = null;
            this.f8625 = aFEvent;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ca, code lost:
            if (r6 != null) goto L_0x01cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
            r6.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x01cf, code lost:
            com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0126, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0127, code lost:
            com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x012e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x012f, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0141, code lost:
            com.appsflyer.internal.z.m1303();
            r1 = new com.appsflyer.AFFacebookDeferredDeeplink(r2, r7, com.appsflyer.BuildConfig.VERSION_NAME);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
            r2 = com.appsflyer.internal.z.m1304(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0153, code lost:
            if (r2.exists() == false) goto L_0x0155;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0155, code lost:
            r2.mkdir();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x015a, code lost:
            r2 = r2.listFiles();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x015e, code lost:
            if (r2 == null) goto L_0x0166;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0166, code lost:
            r2 = new java.io.File(com.appsflyer.internal.z.m1304(r4), java.lang.Long.toString(java.lang.System.currentTimeMillis()));
            r2.createNewFile();
            r3 = new java.io.OutputStreamWriter(new java.io.FileOutputStream(r2.getPath(), true));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
            r3.write("version=");
            r3.write(r1.f8560);
            r3.write(10);
            r3.write("url=");
            r3.write(r1.f8558);
            r3.write(10);
            r3.write("data=");
            r3.write(android.util.Base64.encodeToString(r1.f8559, 2));
            r3.write(10);
            r3.flush();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x01be, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x01bf, code lost:
            r6 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c1, code lost:
            r6 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x01c3, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c4, code lost:
            if (r6 != null) goto L_0x01c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
            r6.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c9, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x01cc A[SYNTHETIC, Splitter:B:102:0x01cc] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0126 A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:35:0x00c8] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x01c6 A[SYNTHETIC, Splitter:B:96:0x01c6] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                com.appsflyer.AFEvent r0 = r13.f8625
                java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f8539
                com.appsflyer.AFEvent r1 = r13.f8625
                boolean r1 = r1.f8540
                com.appsflyer.AFEvent r2 = r13.f8625
                java.lang.String r2 = r2.f8543
                com.appsflyer.AFEvent r3 = r13.f8625
                int r3 = r3.f8538
                com.appsflyer.AFEvent r4 = r13.f8625
                android.content.Context r5 = r4.f8537
                r6 = 0
                if (r5 == 0) goto L_0x001a
                android.content.Context r4 = r4.f8537
                goto L_0x0028
            L_0x001a:
                java.lang.ref.WeakReference<android.content.Context> r5 = r4.f8541
                if (r5 == 0) goto L_0x0027
                java.lang.ref.WeakReference<android.content.Context> r4 = r4.f8541
                java.lang.Object r4 = r4.get()
                android.content.Context r4 = (android.content.Context) r4
                goto L_0x0028
            L_0x0027:
                r4 = r6
            L_0x0028:
                com.appsflyer.AppsFlyerLibCore r5 = com.appsflyer.AppsFlyerLibCore.this
                boolean r5 = r5.isTrackingStopped()
                if (r5 == 0) goto L_0x0031
                return
            L_0x0031:
                r5 = 0
                byte[] r7 = new byte[r5]
                r8 = 2
                r9 = 1
                if (r1 == 0) goto L_0x00ba
                if (r3 > r8) goto L_0x00ba
                com.appsflyer.AppsFlyerLibCore r1 = com.appsflyer.AppsFlyerLibCore.this
                boolean r1 = com.appsflyer.AppsFlyerLibCore.m1168((com.appsflyer.AppsFlyerLibCore) r1)
                if (r1 == 0) goto L_0x0074
                com.appsflyer.AppsFlyerLibCore r1 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r1 = r1.f8605
                java.lang.String r3 = "rfr"
                r0.put(r3, r1)
                com.appsflyer.AFEvent r1 = r13.f8625
                android.content.Context r3 = r1.f8537
                if (r3 == 0) goto L_0x0056
                android.content.Context r1 = r1.f8537
                goto L_0x0064
            L_0x0056:
                java.lang.ref.WeakReference<android.content.Context> r3 = r1.f8541
                if (r3 == 0) goto L_0x0063
                java.lang.ref.WeakReference<android.content.Context> r1 = r1.f8541
                java.lang.Object r1 = r1.get()
                android.content.Context r1 = (android.content.Context) r1
                goto L_0x0064
            L_0x0063:
                r1 = r6
            L_0x0064:
                android.content.SharedPreferences r1 = com.appsflyer.AppsFlyerLibCore.m1180((android.content.Context) r1)
                android.content.SharedPreferences$Editor r1 = r1.edit()
                java.lang.String r3 = "newGPReferrerSent"
                r1.putBoolean(r3, r9)
                r1.apply()
            L_0x0074:
                com.appsflyer.AppsFlyerLibCore r1 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r1 = r1.f8595
                if (r1 == 0) goto L_0x0087
                com.appsflyer.AppsFlyerLibCore r1 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r1 = r1.f8595
                java.lang.String r3 = "fb_ddl"
                r0.put(r3, r1)
            L_0x0087:
                com.appsflyer.AppsFlyerLibCore r1 = com.appsflyer.AppsFlyerLibCore.this
                boolean r1 = com.appsflyer.AppsFlyerLibCore.m1160((com.appsflyer.AppsFlyerLibCore) r1)
                if (r1 == 0) goto L_0x009b
                com.appsflyer.AppsFlyerLibCore r1 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r1 = r1.f8598
                java.lang.String r3 = "lvl"
                r0.put(r3, r1)
                goto L_0x00ba
            L_0x009b:
                com.appsflyer.AppsFlyerLibCore r1 = com.appsflyer.AppsFlyerLibCore.this
                boolean r1 = r1.f8601
                if (r1 == 0) goto L_0x00ba
                com.appsflyer.AppsFlyerLibCore r1 = com.appsflyer.AppsFlyerLibCore.this
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.util.Map unused = r1.f8598 = r3
                com.appsflyer.AppsFlyerLibCore r1 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r1 = r1.f8598
                java.lang.String r3 = "error"
                java.lang.String r10 = "operation timed out."
                r1.put(r3, r10)
            L_0x00ba:
                com.appsflyer.AFEvent r1 = r13.f8625
                boolean r1 = r1 instanceof com.appsflyer.internal.model.event.AdRevenue
                if (r1 != 0) goto L_0x00c8
                com.appsflyer.internal.d$b r1 = new com.appsflyer.internal.d$b
                r1.<init>(r0, r4)
                r0.putAll(r1)
            L_0x00c8:
                com.appsflyer.AFEvent r1 = r13.f8625     // Catch:{ IOException -> 0x012f, all -> 0x0126 }
                com.appsflyer.AFEvent r3 = r13.f8625     // Catch:{ IOException -> 0x012f, all -> 0x0126 }
                boolean r3 = r3 instanceof com.appsflyer.internal.model.event.AdRevenue     // Catch:{ IOException -> 0x012f, all -> 0x0126 }
                if (r3 == 0) goto L_0x00d9
                java.lang.String r3 = "af_key"
                java.lang.Object r3 = r0.get(r3)     // Catch:{ IOException -> 0x012f, all -> 0x0126 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x012f, all -> 0x0126 }
                goto L_0x00e1
            L_0x00d9:
                java.lang.String r3 = "appsflyerKey"
                java.lang.Object r3 = r0.get(r3)     // Catch:{ IOException -> 0x012f, all -> 0x0126 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x012f, all -> 0x0126 }
            L_0x00e1:
                r1.f8536 = r3     // Catch:{ IOException -> 0x012f, all -> 0x0126 }
                monitor-enter(r0)     // Catch:{ IOException -> 0x012f, all -> 0x0126 }
                com.appsflyer.AFEvent r1 = r13.f8625     // Catch:{ all -> 0x0123 }
                java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ all -> 0x011a }
                r3[r5] = r1     // Catch:{ all -> 0x011a }
                r1 = 48
                r10 = 24
                java.lang.Object r1 = com.appsflyer.internal.a.m1215(r1, r10, r5)     // Catch:{ all -> 0x011a }
                java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ all -> 0x011a }
                java.lang.String r10 = "ˊ"
                java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch:{ all -> 0x011a }
                java.lang.Class<com.appsflyer.AFEvent> r12 = com.appsflyer.AFEvent.class
                r11[r5] = r12     // Catch:{ all -> 0x011a }
                java.lang.reflect.Method r1 = r1.getMethod(r10, r11)     // Catch:{ all -> 0x011a }
                java.lang.Object r1 = r1.invoke(r6, r3)     // Catch:{ all -> 0x011a }
                byte[] r1 = (byte[]) r1     // Catch:{ all -> 0x011a }
                monitor-exit(r0)     // Catch:{ all -> 0x0117 }
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this     // Catch:{ IOException -> 0x0114, all -> 0x0126 }
                com.appsflyer.AFEvent r3 = r13.f8625     // Catch:{ IOException -> 0x0114, all -> 0x0126 }
                com.appsflyer.AFEvent r3 = r3.post(r1)     // Catch:{ IOException -> 0x0114, all -> 0x0126 }
                com.appsflyer.AppsFlyerLibCore.m1176((com.appsflyer.AppsFlyerLibCore) r0, (com.appsflyer.AFEvent) r3)     // Catch:{ IOException -> 0x0114, all -> 0x0126 }
                return
            L_0x0114:
                r0 = move-exception
                r7 = r1
                goto L_0x0130
            L_0x0117:
                r3 = move-exception
                r7 = r1
                goto L_0x0124
            L_0x011a:
                r1 = move-exception
                java.lang.Throwable r3 = r1.getCause()     // Catch:{ all -> 0x0123 }
                if (r3 == 0) goto L_0x0122
                throw r3     // Catch:{ all -> 0x0123 }
            L_0x0122:
                throw r1     // Catch:{ all -> 0x0123 }
            L_0x0123:
                r3 = move-exception
            L_0x0124:
                monitor-exit(r0)     // Catch:{ IOException -> 0x012f, all -> 0x0126 }
                throw r3     // Catch:{ IOException -> 0x012f, all -> 0x0126 }
            L_0x0126:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                com.appsflyer.AFLogger.afErrorLog(r1, r0)
                return
            L_0x012f:
                r0 = move-exception
            L_0x0130:
                java.lang.String r1 = "Exception while sending request to server. "
                com.appsflyer.AFLogger.afErrorLog(r1, r0)
                if (r7 == 0) goto L_0x01d6
                if (r4 == 0) goto L_0x01d6
                java.lang.String r1 = "&isCachedRequest=true&timeincache="
                boolean r1 = r2.contains(r1)
                if (r1 != 0) goto L_0x01d6
                com.appsflyer.internal.z.m1303()
                com.appsflyer.AFFacebookDeferredDeeplink r1 = new com.appsflyer.AFFacebookDeferredDeeplink
                java.lang.String r3 = "5.1.1"
                r1.<init>(r2, r7, r3)
                java.io.File r2 = com.appsflyer.internal.z.m1304(r4)     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                boolean r3 = r2.exists()     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                if (r3 != 0) goto L_0x015a
                r2.mkdir()     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                goto L_0x01cf
            L_0x015a:
                java.io.File[] r2 = r2.listFiles()     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                if (r2 == 0) goto L_0x0166
                int r2 = r2.length     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                r3 = 40
                if (r2 <= r3) goto L_0x0166
                goto L_0x01cf
            L_0x0166:
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                java.io.File r3 = com.appsflyer.internal.z.m1304(r4)     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                r2.<init>(r3, r4)     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                r2.createNewFile()     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                r4.<init>(r2, r9)     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x01ca, all -> 0x01c3 }
                java.lang.String r2 = "version="
                r3.write(r2)     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                java.lang.String r2 = r1.f8560     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                r3.write(r2)     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                r2 = 10
                r3.write(r2)     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                java.lang.String r4 = "url="
                r3.write(r4)     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                java.lang.String r4 = r1.f8558     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                r3.write(r4)     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                r3.write(r2)     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                java.lang.String r4 = "data="
                r3.write(r4)     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                byte[] r1 = r1.f8559     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                java.lang.String r1 = android.util.Base64.encodeToString(r1, r8)     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                r3.write(r1)     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                r3.write(r2)     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                r3.flush()     // Catch:{ Exception -> 0x01c1, all -> 0x01be }
                r3.close()     // Catch:{ IOException -> 0x01cf }
                goto L_0x01cf
            L_0x01be:
                r0 = move-exception
                r6 = r3
                goto L_0x01c4
            L_0x01c1:
                r6 = r3
                goto L_0x01ca
            L_0x01c3:
                r0 = move-exception
            L_0x01c4:
                if (r6 == 0) goto L_0x01c9
                r6.close()     // Catch:{ IOException -> 0x01c9 }
            L_0x01c9:
                throw r0
            L_0x01ca:
                if (r6 == 0) goto L_0x01cf
                r6.close()     // Catch:{ IOException -> 0x01cf }
            L_0x01cf:
                java.lang.String r1 = r0.getMessage()
                com.appsflyer.AFLogger.afErrorLog(r1, r0)
            L_0x01d6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.b.run():void");
        }
    }

    @VisibleForTesting
    static class a implements Runnable {

        /* renamed from: ˋ  reason: contains not printable characters */
        private static final List<String> f8617 = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});
        @VisibleForTesting

        /* renamed from: ˏ  reason: contains not printable characters */
        private static String f8618 = "https://%sgcdsdk.%s/install_data/v4.0/";

        /* renamed from: ʽ  reason: contains not printable characters */
        private AppsFlyerLibCore f8619;

        /* renamed from: ˊ  reason: contains not printable characters */
        private final String f8620;

        /* renamed from: ˎ  reason: contains not printable characters */
        final ScheduledExecutorService f8621;

        /* renamed from: ॱ  reason: contains not printable characters */
        private final Application f8622;

        /* renamed from: ॱॱ  reason: contains not printable characters */
        private final int f8623;

        /* renamed from: ᐝ  reason: contains not printable characters */
        private final AtomicInteger f8624;

        /* synthetic */ a(AppsFlyerLibCore appsFlyerLibCore, Application application, String str, byte b) {
            this(appsFlyerLibCore, application, str);
        }

        private a(AppsFlyerLibCore appsFlyerLibCore, Application application, String str) {
            this.f8621 = AFExecutor.getInstance().m1118();
            this.f8624 = new AtomicInteger(0);
            this.f8619 = appsFlyerLibCore;
            this.f8622 = application;
            this.f8620 = str;
            this.f8623 = 0;
        }

        private a(a aVar) {
            this.f8621 = AFExecutor.getInstance().m1118();
            this.f8624 = new AtomicInteger(0);
            this.f8619 = aVar.f8619;
            this.f8622 = aVar.f8622;
            this.f8620 = aVar.f8620;
            this.f8623 = aVar.f8623 + 1;
        }

        /* renamed from: ˏ  reason: contains not printable characters */
        private void m1206(String str, int i) {
            if (500 > i || i >= 600) {
                AFLogger.afDebugLog("Calling onConversionFailure with:\n".concat(String.valueOf(str)));
                AppsFlyerLibCore.f8579.onConversionDataFail(str);
            } else if (this.f8623 == 2) {
                AFLogger.afDebugLog("Calling onConversionFailure with:\n".concat(String.valueOf(str)));
                AppsFlyerLibCore.f8579.onConversionDataFail(str);
            } else {
                a aVar = new a(this);
                AppsFlyerLibCore.m1150(aVar.f8621, aVar, 10, TimeUnit.MILLISECONDS);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8 A[Catch:{ all -> 0x027c }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00f8 A[Catch:{ ab -> 0x024c, all -> 0x0279 }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0117 A[Catch:{ ab -> 0x024c, all -> 0x0279 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0167 A[Catch:{ ab -> 0x024c, all -> 0x0279 }] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0275  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0283 A[Catch:{ all -> 0x02a1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0298 A[DONT_GENERATE] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r14 = this;
                java.lang.String r0 = "is_first_launch"
                java.lang.String r1 = "af_siteid"
                java.lang.String r2 = r14.f8620
                if (r2 == 0) goto L_0x02ad
                int r2 = r2.length()
                if (r2 != 0) goto L_0x0010
                goto L_0x02ad
            L_0x0010:
                com.appsflyer.AppsFlyerLibCore r2 = r14.f8619
                boolean r2 = r2.isTrackingStopped()
                if (r2 == 0) goto L_0x0019
                return
            L_0x0019:
                java.util.concurrent.atomic.AtomicInteger r2 = r14.f8624
                r2.incrementAndGet()
                r2 = 0
                r3 = 0
                android.app.Application r4 = r14.f8622     // Catch:{ all -> 0x027c }
                if (r4 != 0) goto L_0x002a
                java.util.concurrent.atomic.AtomicInteger r0 = r14.f8624
                r0.decrementAndGet()
                return
            L_0x002a:
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x027c }
                android.app.Application r6 = r14.f8622     // Catch:{ all -> 0x027c }
                java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x027c }
                android.app.Application r8 = r14.f8622     // Catch:{ all -> 0x027c }
                r7.<init>(r8)     // Catch:{ all -> 0x027c }
                java.lang.String r7 = com.appsflyer.AppsFlyerLibCore.m1182((java.lang.ref.WeakReference<android.content.Context>) r7)     // Catch:{ all -> 0x027c }
                java.lang.String r6 = com.appsflyer.AppsFlyerLibCore.m1154((android.content.Context) r6, (java.lang.String) r7)     // Catch:{ all -> 0x027c }
                java.lang.String r7 = ""
                r8 = 1
                if (r6 == 0) goto L_0x0068
                java.util.List<java.lang.String> r9 = f8617     // Catch:{ all -> 0x027c }
                java.lang.String r10 = r6.toLowerCase()     // Catch:{ all -> 0x027c }
                boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x027c }
                if (r9 != 0) goto L_0x005b
                java.lang.String r9 = "-"
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x027c }
                java.lang.String r6 = r9.concat(r6)     // Catch:{ all -> 0x027c }
                goto L_0x0069
            L_0x005b:
                java.lang.String r9 = "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix."
                java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x027c }
                r10[r3] = r6     // Catch:{ all -> 0x027c }
                java.lang.String r6 = java.lang.String.format(r9, r10)     // Catch:{ all -> 0x027c }
                com.appsflyer.AFLogger.afWarnLog(r6)     // Catch:{ all -> 0x027c }
            L_0x0068:
                r6 = r7
            L_0x0069:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
                r9.<init>()     // Catch:{ all -> 0x027c }
                java.lang.String r10 = f8618     // Catch:{ all -> 0x027c }
                java.lang.String r10 = com.appsflyer.ServerConfigHandler.getUrl(r10)     // Catch:{ all -> 0x027c }
                r9.append(r10)     // Catch:{ all -> 0x027c }
                android.app.Application r10 = r14.f8622     // Catch:{ all -> 0x027c }
                java.lang.String r10 = r10.getPackageName()     // Catch:{ all -> 0x027c }
                r9.append(r10)     // Catch:{ all -> 0x027c }
                r9.append(r6)     // Catch:{ all -> 0x027c }
                java.lang.String r6 = "?devkey="
                r9.append(r6)     // Catch:{ all -> 0x027c }
                java.lang.String r6 = r14.f8620     // Catch:{ all -> 0x027c }
                r9.append(r6)     // Catch:{ all -> 0x027c }
                java.lang.String r6 = "&device_id="
                r9.append(r6)     // Catch:{ all -> 0x027c }
                java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x027c }
                android.app.Application r10 = r14.f8622     // Catch:{ all -> 0x027c }
                r6.<init>(r10)     // Catch:{ all -> 0x027c }
                java.lang.String r6 = com.appsflyer.internal.ag.m1231(r6)     // Catch:{ all -> 0x027c }
                r9.append(r6)     // Catch:{ all -> 0x027c }
                java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x027c }
                com.appsflyer.internal.am r9 = com.appsflyer.internal.am.f8691     // Catch:{ all -> 0x027c }
                if (r9 != 0) goto L_0x00af
                com.appsflyer.internal.am r9 = new com.appsflyer.internal.am     // Catch:{ all -> 0x027c }
                r9.<init>()     // Catch:{ all -> 0x027c }
                com.appsflyer.internal.am.f8691 = r9     // Catch:{ all -> 0x027c }
            L_0x00af:
                com.appsflyer.internal.am r9 = com.appsflyer.internal.am.f8691     // Catch:{ all -> 0x027c }
                java.lang.String r10 = "server_request"
                java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch:{ all -> 0x027c }
                r9.m1247(r10, r6, r7)     // Catch:{ all -> 0x027c }
                java.lang.String r7 = "Calling server for attribution url: "
                java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x027c }
                java.lang.String r7 = r7.concat(r9)     // Catch:{ all -> 0x027c }
                com.appsflyer.AFFacebookDeferredDeeplink.AnonymousClass4.m1122(r7)     // Catch:{ all -> 0x027c }
                java.net.URL r7 = new java.net.URL     // Catch:{ all -> 0x027c }
                r7.<init>(r6)     // Catch:{ all -> 0x027c }
                java.net.URLConnection r7 = r7.openConnection()     // Catch:{ all -> 0x027c }
                java.lang.Object r7 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r7)     // Catch:{ all -> 0x027c }
                java.net.URLConnection r7 = (java.net.URLConnection) r7     // Catch:{ all -> 0x027c }
                java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ all -> 0x027c }
                java.lang.String r2 = "GET"
                r7.setRequestMethod(r2)     // Catch:{ all -> 0x0279 }
                r2 = 10000(0x2710, float:1.4013E-41)
                r7.setConnectTimeout(r2)     // Catch:{ all -> 0x0279 }
                java.lang.String r2 = "Connection"
                java.lang.String r9 = "close"
                r7.setRequestProperty(r2, r9)     // Catch:{ all -> 0x0279 }
                r7.connect()     // Catch:{ all -> 0x0279 }
                int r2 = r7.getResponseCode()     // Catch:{ all -> 0x0279 }
                java.lang.String r9 = com.appsflyer.AppsFlyerLibCore.m1170((java.net.HttpURLConnection) r7)     // Catch:{ all -> 0x0279 }
                com.appsflyer.internal.am r10 = com.appsflyer.internal.am.f8691     // Catch:{ all -> 0x0279 }
                if (r10 != 0) goto L_0x00ff
                com.appsflyer.internal.am r10 = new com.appsflyer.internal.am     // Catch:{ all -> 0x0279 }
                r10.<init>()     // Catch:{ all -> 0x0279 }
                com.appsflyer.internal.am.f8691 = r10     // Catch:{ all -> 0x0279 }
            L_0x00ff:
                com.appsflyer.internal.am r10 = com.appsflyer.internal.am.f8691     // Catch:{ all -> 0x0279 }
                java.lang.String r11 = "server_response"
                r12 = 2
                java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ all -> 0x0279 }
                java.lang.String r13 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0279 }
                r12[r3] = r13     // Catch:{ all -> 0x0279 }
                r12[r8] = r9     // Catch:{ all -> 0x0279 }
                r10.m1247(r11, r6, r12)     // Catch:{ all -> 0x0279 }
                r10 = 200(0xc8, float:2.8E-43)
                r11 = 404(0x194, float:5.66E-43)
                if (r2 == r10) goto L_0x0148
                if (r2 != r11) goto L_0x011a
                goto L_0x0148
            L_0x011a:
                com.appsflyer.AppsFlyerConversionListener r0 = com.appsflyer.AppsFlyerLibCore.f8579     // Catch:{ all -> 0x0279 }
                if (r0 == 0) goto L_0x012d
                java.lang.String r0 = "Error connection to server: "
                java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0279 }
                java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x0279 }
                r14.m1206(r0, r2)     // Catch:{ all -> 0x0279 }
            L_0x012d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
                java.lang.String r1 = "AttributionIdFetcher response code: "
                r0.<init>(r1)     // Catch:{ all -> 0x0279 }
                r0.append(r2)     // Catch:{ all -> 0x0279 }
                java.lang.String r1 = "  url: "
                r0.append(r1)     // Catch:{ all -> 0x0279 }
                r0.append(r6)     // Catch:{ all -> 0x0279 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0279 }
                com.appsflyer.AFFacebookDeferredDeeplink.AnonymousClass4.m1122(r0)     // Catch:{ all -> 0x0279 }
                goto L_0x026e
            L_0x0148:
                long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0279 }
                android.app.Application r6 = r14.f8622     // Catch:{ all -> 0x0279 }
                java.lang.String r10 = "appsflyerGetConversionDataTiming"
                long r12 = r12 - r4
                com.appsflyer.AppsFlyerLibCore.m1146((android.content.Context) r6, (java.lang.String) r10, (long) r12)     // Catch:{ all -> 0x0279 }
                java.lang.String r4 = "Attribution data: "
                java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0279 }
                java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0279 }
                com.appsflyer.AFFacebookDeferredDeeplink.AnonymousClass4.m1122(r4)     // Catch:{ all -> 0x0279 }
                int r4 = r9.length()     // Catch:{ all -> 0x0279 }
                if (r4 <= 0) goto L_0x026e
                java.util.Map r4 = com.appsflyer.AppsFlyerLibCore.m1172((java.lang.String) r9)     // Catch:{ all -> 0x0279 }
                java.lang.String r5 = "iscache"
                java.lang.Object r5 = r4.get(r5)     // Catch:{ all -> 0x0279 }
                java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0279 }
                if (r2 != r11) goto L_0x018e
                java.lang.String r2 = "error_reason"
                r4.remove(r2)     // Catch:{ all -> 0x0279 }
                java.lang.String r2 = "status_code"
                r4.remove(r2)     // Catch:{ all -> 0x0279 }
                java.lang.String r2 = "af_status"
                java.lang.String r6 = "Organic"
                r4.put(r2, r6)     // Catch:{ all -> 0x0279 }
                java.lang.String r2 = "af_message"
                java.lang.String r6 = "organic install"
                r4.put(r2, r6)     // Catch:{ all -> 0x0279 }
            L_0x018e:
                if (r5 == 0) goto L_0x01a1
                boolean r2 = r5.booleanValue()     // Catch:{ all -> 0x0279 }
                if (r2 != 0) goto L_0x01a1
                android.app.Application r2 = r14.f8622     // Catch:{ all -> 0x0279 }
                java.lang.String r6 = "appsflyerConversionDataCacheExpiration"
                long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0279 }
                com.appsflyer.AppsFlyerLibCore.m1146((android.content.Context) r2, (java.lang.String) r6, (long) r10)     // Catch:{ all -> 0x0279 }
            L_0x01a1:
                boolean r2 = r4.containsKey(r1)     // Catch:{ all -> 0x0279 }
                java.lang.String r6 = "[Invite] Detected App-Invite via channel: "
                java.lang.String r10 = "af_channel"
                if (r2 == 0) goto L_0x01d6
                boolean r2 = r4.containsKey(r10)     // Catch:{ all -> 0x0279 }
                if (r2 == 0) goto L_0x01c5
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
                r2.<init>(r6)     // Catch:{ all -> 0x0279 }
                java.lang.Object r11 = r4.get(r10)     // Catch:{ all -> 0x0279 }
                r2.append(r11)     // Catch:{ all -> 0x0279 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0279 }
                com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x0279 }
                goto L_0x01d6
            L_0x01c5:
                java.lang.String r2 = "[CrossPromotion] App was installed via %s's Cross Promotion"
                java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ all -> 0x0279 }
                java.lang.Object r12 = r4.get(r1)     // Catch:{ all -> 0x0279 }
                r11[r3] = r12     // Catch:{ all -> 0x0279 }
                java.lang.String r2 = java.lang.String.format(r2, r11)     // Catch:{ all -> 0x0279 }
                com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x0279 }
            L_0x01d6:
                boolean r1 = r4.containsKey(r1)     // Catch:{ all -> 0x0279 }
                if (r1 == 0) goto L_0x01ef
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
                r1.<init>(r6)     // Catch:{ all -> 0x0279 }
                java.lang.Object r2 = r4.get(r10)     // Catch:{ all -> 0x0279 }
                r1.append(r2)     // Catch:{ all -> 0x0279 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0279 }
                com.appsflyer.AFLogger.afDebugLog(r1)     // Catch:{ all -> 0x0279 }
            L_0x01ef:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0279 }
                r4.put(r0, r1)     // Catch:{ all -> 0x0279 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0279 }
                r1.<init>(r4)     // Catch:{ all -> 0x0279 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0279 }
                java.lang.String r2 = "attributionId"
                if (r1 == 0) goto L_0x0207
                android.app.Application r6 = r14.f8622     // Catch:{ all -> 0x0279 }
                com.appsflyer.AppsFlyerLibCore.m1174(r6, r2, r1)     // Catch:{ all -> 0x0279 }
                goto L_0x020c
            L_0x0207:
                android.app.Application r1 = r14.f8622     // Catch:{ all -> 0x0279 }
                com.appsflyer.AppsFlyerLibCore.m1174(r1, r2, r9)     // Catch:{ all -> 0x0279 }
            L_0x020c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
                java.lang.String r2 = "iscache="
                r1.<init>(r2)     // Catch:{ all -> 0x0279 }
                r1.append(r5)     // Catch:{ all -> 0x0279 }
                java.lang.String r2 = " caching conversion data"
                r1.append(r2)     // Catch:{ all -> 0x0279 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0279 }
                com.appsflyer.AFLogger.afDebugLog(r1)     // Catch:{ all -> 0x0279 }
                com.appsflyer.AppsFlyerConversionListener r1 = com.appsflyer.AppsFlyerLibCore.f8579     // Catch:{ all -> 0x0279 }
                if (r1 == 0) goto L_0x026e
                java.util.concurrent.atomic.AtomicInteger r1 = r14.f8624     // Catch:{ all -> 0x0279 }
                int r1 = r1.intValue()     // Catch:{ all -> 0x0279 }
                if (r1 > r8) goto L_0x026e
                android.app.Application r1 = r14.f8622     // Catch:{ ab -> 0x024c }
                java.util.Map r1 = com.appsflyer.AppsFlyerLibCore.m1192((android.content.Context) r1)     // Catch:{ ab -> 0x024c }
                android.app.Application r2 = r14.f8622     // Catch:{ ab -> 0x024c }
                android.content.SharedPreferences r2 = com.appsflyer.AppsFlyerLibCore.m1180((android.content.Context) r2)     // Catch:{ ab -> 0x024c }
                java.lang.String r5 = "sixtyDayConversionData"
                boolean r2 = r2.getBoolean(r5, r3)     // Catch:{ ab -> 0x024c }
                if (r2 != 0) goto L_0x024a
                java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ ab -> 0x024c }
                r1.put(r0, r2)     // Catch:{ ab -> 0x024c }
            L_0x024a:
                r4 = r1
                goto L_0x0252
            L_0x024c:
                r0 = move-exception
                java.lang.String r1 = "Exception while trying to fetch attribution data. "
                com.appsflyer.AFLogger.afErrorLog(r1, r0)     // Catch:{ all -> 0x0279 }
            L_0x0252:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
                java.lang.String r1 = "Calling onConversionDataSuccess with:\n"
                r0.<init>(r1)     // Catch:{ all -> 0x0279 }
                java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0279 }
                r0.append(r1)     // Catch:{ all -> 0x0279 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0279 }
                com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x0279 }
                com.appsflyer.AppsFlyerConversionListener r0 = com.appsflyer.AppsFlyerLibCore.f8579     // Catch:{ all -> 0x0279 }
                r0.onConversionDataSuccess(r4)     // Catch:{ all -> 0x0279 }
            L_0x026e:
                java.util.concurrent.atomic.AtomicInteger r0 = r14.f8624
                r0.decrementAndGet()
                if (r7 == 0) goto L_0x029b
                r7.disconnect()
                goto L_0x029b
            L_0x0279:
                r0 = move-exception
                r2 = r7
                goto L_0x027d
            L_0x027c:
                r0 = move-exception
            L_0x027d:
                com.appsflyer.AppsFlyerConversionListener r1 = com.appsflyer.AppsFlyerLibCore.f8579     // Catch:{ all -> 0x02a1 }
                if (r1 == 0) goto L_0x028a
                java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x02a1 }
                r14.m1206(r1, r3)     // Catch:{ all -> 0x02a1 }
            L_0x028a:
                java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x02a1 }
                com.appsflyer.AFLogger.afErrorLog(r1, r0)     // Catch:{ all -> 0x02a1 }
                java.util.concurrent.atomic.AtomicInteger r0 = r14.f8624
                r0.decrementAndGet()
                if (r2 == 0) goto L_0x029b
                r2.disconnect()
            L_0x029b:
                java.util.concurrent.ScheduledExecutorService r0 = r14.f8621
                r0.shutdown()
                return
            L_0x02a1:
                r0 = move-exception
                java.util.concurrent.atomic.AtomicInteger r1 = r14.f8624
                r1.decrementAndGet()
                if (r2 == 0) goto L_0x02ac
                r2.disconnect()
            L_0x02ac:
                throw r0
            L_0x02ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.a.run():void");
        }
    }

    class c implements Runnable {

        /* renamed from: ˏ  reason: contains not printable characters */
        private WeakReference<Context> f8628 = null;

        public c(Context context) {
            this.f8628 = new WeakReference<>(context);
        }

        public final void run() {
            if (!AppsFlyerLibCore.this.f8604) {
                AppsFlyerLibCore.this.f8597 = System.currentTimeMillis();
                if (this.f8628 != null) {
                    boolean unused = AppsFlyerLibCore.this.f8604 = true;
                    try {
                        String r1 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
                        synchronized (this.f8628) {
                            z.m1303();
                            for (AFFacebookDeferredDeeplink next : z.m1307(this.f8628.get())) {
                                StringBuilder sb = new StringBuilder("resending request: ");
                                sb.append(next.f8558);
                                AFLogger.afInfoLog(sb.toString());
                                try {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long parseLong = Long.parseLong(next.f8557, 10);
                                    AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
                                    CachedEvent cachedEvent = new CachedEvent();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(next.f8558);
                                    sb2.append("&isCachedRequest=true&timeincache=");
                                    sb2.append((currentTimeMillis - parseLong) / 1000);
                                    AFEvent post = cachedEvent.urlString(sb2.toString()).post(next.f8559);
                                    post.f8536 = r1;
                                    post.f8541 = this.f8628;
                                    AFEvent cacheKey = post.cacheKey(next.f8557);
                                    cacheKey.f8540 = false;
                                    AppsFlyerLibCore.m1176(appsFlyerLibCore, cacheKey);
                                } catch (Exception e) {
                                    AFLogger.afErrorLog("Failed to resend cached request", e);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        try {
                            AFLogger.afErrorLog("failed to check cache. ", e2);
                        } catch (Throwable th) {
                            boolean unused2 = AppsFlyerLibCore.this.f8604 = false;
                            throw th;
                        }
                    }
                    boolean unused3 = AppsFlyerLibCore.this.f8604 = false;
                    AppsFlyerLibCore.this.f8584.shutdown();
                    ScheduledExecutorService unused4 = AppsFlyerLibCore.this.f8584 = null;
                }
            }
        }
    }

    public String getSdkVersion() {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "getSdkVersion", new String[0]);
        StringBuilder sb = new StringBuilder("version: 5.1.1 (build ");
        sb.append(f8575);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: ॱ  reason: contains not printable characters */
    private void m1187(final AFEvent aFEvent) {
        Context context;
        if (aFEvent.f8537 != null) {
            context = aFEvent.f8537;
        } else {
            context = aFEvent.f8541 != null ? aFEvent.f8541.get() : null;
        }
        Application application = (Application) context;
        AppsFlyerProperties.getInstance().loadProperties(application.getApplicationContext());
        if (this.f8582 == null) {
            if (ah.f8675 == null) {
                ah.f8675 = new ah();
            }
            this.f8582 = new ah.d() {
                /* renamed from: ˏ  reason: contains not printable characters */
                public final void m1202(Activity activity) {
                    if (AppsFlyerLibCore.m1161(AppsFlyerLibCore.m1180((Context) activity), "appsFlyerCount", false) < 2) {
                        w r0 = w.m1292((Context) activity);
                        r0.f8790.post(r0.f8798);
                        r0.f8790.post(r0.f8797);
                    }
                    AFEvent context = aFEvent.context(activity);
                    AFLogger.afInfoLog("onBecameForeground");
                    AppsFlyerLibCore.getInstance().f8608 = System.currentTimeMillis();
                    AppsFlyerLibCore.getInstance().m1197(context);
                    AFLogger.resetDeltaTime();
                }

                /* renamed from: ˋ  reason: contains not printable characters */
                public final void m1201(WeakReference<Context> weakReference) {
                    f.AnonymousClass5.m1275(weakReference.get());
                    w r2 = w.m1292(weakReference.get());
                    r2.f8790.post(r2.f8798);
                }
            };
            if (ah.f8675 != null) {
                ah.f8675.f8678 = this.f8582;
                application.registerActivityLifecycleCallbacks(ah.f8675);
                return;
            }
            throw new IllegalStateException("Foreground is not initialised - invoke at least once with parameter init/get");
        }
    }

    public void setDebugLog(boolean z) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setDebugLog", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("shouldLog", z);
        AppsFlyerProperties.getInstance().set("logLevel", (z ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE).getLevel());
    }

    public void setImeiData(String str) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setImeiData", str);
        this.f8599 = str;
    }

    public void setOaidData(String str) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setOaidData", str);
        this.f8602 = str;
    }

    public void setAndroidIdData(String str) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setAndroidIdData", str);
        this.f8603 = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: ˏ  reason: contains not printable characters */
    public static void m1174(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: ˊ  reason: contains not printable characters */
    public static void m1146(Context context, String str, long j) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public void setCustomerIdAndTrack(String str, @NonNull Context context) {
        Intent intent = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-1747495564, oncanceled);
                onCancelLoad.getMin(-1747495564, oncanceled);
            }
        }
        if (context != null) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) && AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) == null) {
                setCustomerUserId(str);
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
                StringBuilder sb = new StringBuilder("CustomerUserId set: ");
                sb.append(str);
                sb.append(" - Initializing AppsFlyer Tacking");
                AFLogger.afInfoLog(sb.toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
                String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
                if (referrer == null) {
                    referrer = "";
                }
                if (context instanceof Activity) {
                    intent = ((Activity) context).getIntent();
                }
                m1186(context, string, referrer, intent);
                if (AppsFlyerProperties.getInstance().getString("afUninstallToken") != null) {
                    m1200(context, AppsFlyerProperties.getInstance().getString("afUninstallToken"));
                    return;
                }
                return;
            }
            setCustomerUserId(str);
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
    }

    public void setAppInviteOneLink(String str) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_ID, str);
    }

    public void setAdditionalData(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            if (am.f8691 == null) {
                am.f8691 = new am();
            }
            am.f8691.m1247("public_api_call", "setAdditionalData", hashMap.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(hashMap).toString());
        }
    }

    public void setUserEmails(String... strArr) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
    }

    public void setCollectAndroidID(boolean z) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setCollectAndroidID", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
    }

    public void setCollectIMEI(boolean z) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setCollectIMEI", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
    }

    public void setCollectOaid(boolean z) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setCollectOaid", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
    }

    @Deprecated
    public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am amVar = am.f8691;
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = appsFlyerConversionListener == null ? "null" : "conversionDataListener";
        amVar.m1247("public_api_call", IAPSyncCommand.COMMAND_INIT, strArr);
        AFLogger.m1129(String.format("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{BuildConfig.VERSION_NAME, f8575}));
        this.f8587 = true;
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_KEY, str);
        AFFacebookDeferredDeeplink.AnonymousClass4.m1123(str);
        f8579 = appsFlyerConversionListener;
        return this;
    }

    /* renamed from: ˊ  reason: contains not printable characters */
    private static boolean m1152(@NonNull Context context) {
        if (m1161(context.getApplicationContext().getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false) > 2) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 2, ");
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (AFExecutor.AnonymousClass5.AnonymousClass3.m1121(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            AFLogger.afRDLog("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : com.android.installreferrer.api.InstallReferrerClient", th);
            return false;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: ˎ  reason: contains not printable characters */
    private static void m1166(android.content.Context r4) {
        /*
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "OPPO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            r0 = 23
            java.lang.String r1 = "OPPO device found"
            com.appsflyer.AFLogger.afRDLog(r1)
            goto L_0x0014
        L_0x0012:
            r0 = 18
        L_0x0014:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L_0x00c9
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            r1 = 0
            java.lang.String r2 = "keyPropDisableAFKeystore"
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 != 0) goto L_0x00c9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "OS SDK is="
            r0.<init>(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0.append(r2)
            java.lang.String r2 = "; use KeyStore"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afRDLog(r0)
            com.appsflyer.AFKeystoreWrapper r0 = new com.appsflyer.AFKeystoreWrapper
            r0.<init>(r4)
            boolean r2 = r0.m1124()
            if (r2 != 0) goto L_0x005d
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r4)
            java.lang.String r4 = com.appsflyer.internal.ag.m1231(r2)
            r0.f8566 = r4
            r0.f8569 = r1
            java.lang.String r4 = r0.m1125()
            r0.m1126(r4)
            goto L_0x00a7
        L_0x005d:
            java.lang.String r4 = r0.m1125()
            java.lang.Object r1 = r0.f8568
            monitor-enter(r1)
            int r2 = r0.f8569     // Catch:{ all -> 0x00c6 }
            int r2 = r2 + 1
            r0.f8569 = r2     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "Deleting key with alias: "
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x00c6 }
            com.appsflyer.AFLogger.afInfoLog(r2)     // Catch:{ all -> 0x00c6 }
            java.lang.Object r2 = r0.f8568     // Catch:{ KeyStoreException -> 0x0084 }
            monitor-enter(r2)     // Catch:{ KeyStoreException -> 0x0084 }
            java.security.KeyStore r3 = r0.f8565     // Catch:{ all -> 0x0081 }
            r3.deleteEntry(r4)     // Catch:{ all -> 0x0081 }
            monitor-exit(r2)     // Catch:{ all -> 0x0081 }
            goto L_0x009f
        L_0x0081:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ KeyStoreException -> 0x0084 }
            throw r4     // Catch:{ KeyStoreException -> 0x0084 }
        L_0x0084:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = "Exception "
            r2.<init>(r3)     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x00c6 }
            r2.append(r3)     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = " occurred"
            r2.append(r3)     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00c6 }
            com.appsflyer.AFLogger.afErrorLog(r2, r4)     // Catch:{ all -> 0x00c6 }
        L_0x009f:
            monitor-exit(r1)     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = r0.m1125()
            r0.m1126(r4)
        L_0x00a7:
            java.lang.String r4 = r0.m1128()
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "KSAppsFlyerId"
            r1.set((java.lang.String) r2, (java.lang.String) r4)
            int r4 = r0.m1127()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "KSAppsFlyerRICounter"
            r0.set((java.lang.String) r1, (java.lang.String) r4)
            return
        L_0x00c6:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L_0x00c9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "OS SDK is="
            r4.<init>(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r4.append(r0)
            java.lang.String r0 = "; no KeyStore usage"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.appsflyer.AFLogger.afRDLog(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m1166(android.content.Context):void");
    }

    public void setCustomerUserId(String str) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_USER_ID, str);
    }

    public void setAppId(String str) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setAppId", str);
        AppsFlyerProperties.getInstance().set("appid", str);
    }

    public void setExtension(String str) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    public void setIsUpdate(boolean z) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
    }

    public void setCurrencyCode(String str) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    public void trackLocation(Context context, double d2, double d3) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "trackLocation", String.valueOf(d2), String.valueOf(d3));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d3));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d2));
        AFEvent context2 = new InAppEvent().context(context);
        context2.f8548 = AFInAppEventType.LOCATION_COORDINATES;
        context2.f8535 = hashMap;
        m1197(context2);
    }

    public void reportTrackSession(Context context) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "reportTrackSession", new String[0]);
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.f8712 = false;
        AFEvent context2 = new InAppEvent().context(context);
        context2.f8548 = null;
        context2.f8535 = null;
        m1197(context2);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.net.Uri] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ˋ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1197(com.appsflyer.AFEvent r7) {
        /*
            r6 = this;
            android.content.Context r0 = r7.f8537
            r1 = 0
            if (r0 == 0) goto L_0x0008
            android.content.Context r0 = r7.f8537
            goto L_0x0016
        L_0x0008:
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f8541
            if (r0 == 0) goto L_0x0015
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f8541
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            boolean r2 = r0 instanceof android.app.Activity
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x003b
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.Intent r4 = r2.getIntent()
            android.net.Uri r1 = o.FontRes.setMin(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r2 = move-exception
            java.lang.String r5 = r2.getLocalizedMessage()
            com.appsflyer.AFLogger.afErrorLog(r5, r2)
        L_0x0030:
            if (r1 == 0) goto L_0x0038
            java.lang.String r1 = r1.toString()
            r2 = r1
            goto L_0x0039
        L_0x0038:
            r2 = r3
        L_0x0039:
            r1 = r4
            goto L_0x003c
        L_0x003b:
            r2 = r3
        L_0x003c:
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r5 = "AppsFlyerKey"
            java.lang.String r4 = r4.getString(r5)
            if (r4 != 0) goto L_0x004e
            java.lang.String r7 = "[TrackEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey."
            com.appsflyer.AFLogger.afWarnLog(r7)
            return
        L_0x004e:
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r4.getReferrer(r0)
            if (r0 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r3 = r0
        L_0x005a:
            r7.f8544 = r3
            r7.f8545 = r1
            r7.f8533 = r2
            r6.m1149((com.appsflyer.AFEvent) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m1197(com.appsflyer.AFEvent):void");
    }

    /* renamed from: ˎ  reason: contains not printable characters */
    public final void m1200(Context context, String str) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) && AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) == null) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        HashMap hashMap = new HashMap();
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
        if (string == null) {
            AFLogger.afWarnLog("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            hashMap.put("app_version_name", packageInfo.versionName);
            hashMap.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            long j = packageInfo.firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("installDate", simpleDateFormat.format(new Date(j)));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        m1167(context, (Map<String, ? super String>) hashMap);
        String string2 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string2 != null) {
            hashMap.put("appUserId", string2);
        }
        try {
            hashMap.put(H5GetLogInfoBridge.RESULT_MODEL, Build.MODEL);
            hashMap.put(H5GetLogInfoBridge.RESULT_BRAND, Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, SummaryActivity.CHECKED);
        }
        x r3 = aa.m1216(context.getContentResolver());
        if (r3 != null) {
            hashMap.put("amazon_aid", r3.f8805);
            hashMap.put("amazon_aid_limit", String.valueOf(r3.f8804));
        }
        String string3 = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
        if (string3 != null) {
            hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, string3);
        }
        hashMap.put("devkey", string);
        hashMap.put("uid", ag.m1231(new WeakReference(context)));
        hashMap.put("af_gcm_token", str);
        hashMap.put("launch_counter", Integer.toString(m1161(context.getApplicationContext().getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false)));
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String r12 = m1182((WeakReference<Context>) new WeakReference(context));
        if (r12 != null) {
            hashMap.put("channel", r12);
        }
        try {
            ac acVar = new ac(context, isTrackingStopped());
            acVar.f8653 = new JSONObject(hashMap).toString();
            StringBuilder sb = new StringBuilder();
            sb.append(ServerConfigHandler.getUrl("https://%sregister.%s/api/v4.11/androidevent?buildnumber=5.1.1&app_id="));
            sb.append(packageName);
            new Thread(new Runnable(sb.toString()) {

                /* renamed from: ॱ */
                private /* synthetic */ String f8659;

                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.ac.2.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                /*  JADX ERROR: Method generation error: Method args not loaded: com.appsflyer.internal.ac.2.run():void, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.ac.2.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                public final void run(
/*
Method generation error in method: com.appsflyer.internal.ac.2.run():void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.ac.2.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }).start();
        } catch (Throwable th3) {
            AFLogger.afErrorLog(th3.getMessage(), th3);
        }
    }

    public void setDeviceTrackingDisabled(boolean z) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "setDeviceTrackingDisabled", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: ॱॱ  reason: contains not printable characters */
    public static Map<String, Object> m1192(Context context) throws ab {
        String string = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getString("attributionId", (String) null);
        if (string != null && string.length() > 0) {
            return m1172(string);
        }
        throw new ab();
    }

    public void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "registerConversionListener", new String[0]);
        if (appsFlyerConversionListener != null) {
            f8579 = appsFlyerConversionListener;
        }
    }

    public void unregisterConversionListener() {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "unregisterConversionListener", new String[0]);
        f8579 = null;
    }

    public void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
        } else {
            f8577 = appsFlyerInAppPurchaseValidatorListener;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01cb, code lost:
        if (r3 != false) goto L_0x01ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ae  */
    /* renamed from: ˏ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1175(com.appsflyer.AFEvent r12) {
        /*
            r11 = this;
            android.content.Context r0 = r12.f8537
            if (r0 == 0) goto L_0x0007
            android.content.Context r0 = r12.f8537
            goto L_0x0015
        L_0x0007:
            java.lang.ref.WeakReference<android.content.Context> r0 = r12.f8541
            if (r0 == 0) goto L_0x0014
            java.lang.ref.WeakReference<android.content.Context> r0 = r12.f8541
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            java.lang.String r1 = r12.f8548
            if (r0 != 0) goto L_0x001f
            java.lang.String r12 = "sendTrackingWithEvent - got null context. skipping event/launch."
            com.appsflyer.AFLogger.afDebugLog(r12)
            return
        L_0x001f:
            android.content.Context r2 = r0.getApplicationContext()
            r3 = 0
            java.lang.String r4 = "appsflyer-data"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r3)
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()
            r4.saveProperties(r2)
            boolean r4 = r11.isTrackingStopped()
            if (r4 != 0) goto L_0x0050
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "sendTrackingWithEvent from activity: "
            r4.<init>(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.appsflyer.AFLogger.afInfoLog(r4)
        L_0x0050:
            r4 = 1
            if (r1 != 0) goto L_0x0055
            r1 = 1
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            boolean r5 = r12 instanceof com.appsflyer.internal.model.event.BackgroundReferrerLaunch
            boolean r6 = r12 instanceof com.appsflyer.internal.model.event.NewGPReferrer
            java.lang.String r7 = "appsFlyerCount"
            if (r6 != 0) goto L_0x0060
            if (r5 == 0) goto L_0x0083
        L_0x0060:
            int r8 = m1161((android.content.SharedPreferences) r2, (java.lang.String) r7, (boolean) r3)
            if (r8 != r4) goto L_0x006a
            if (r6 != 0) goto L_0x006a
            r9 = 1
            goto L_0x006b
        L_0x006a:
            r9 = 0
        L_0x006b:
            java.lang.String r10 = "newGPReferrerSent"
            boolean r10 = r2.getBoolean(r10, r3)
            if (r10 != 0) goto L_0x0077
            if (r8 != r4) goto L_0x0077
            r8 = 1
            goto L_0x0078
        L_0x0077:
            r8 = 0
        L_0x0078:
            if (r8 != 0) goto L_0x007f
            if (r9 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r8 = 0
            goto L_0x0080
        L_0x007f:
            r8 = 1
        L_0x0080:
            if (r8 != 0) goto L_0x0083
            return
        L_0x0083:
            r12.f8540 = r1
            java.util.Map r8 = r11.m1198((com.appsflyer.AFEvent) r12)
            java.lang.String r9 = "appsflyerKey"
            java.lang.Object r9 = r8.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x01fa
            int r9 = r9.length()
            if (r9 != 0) goto L_0x009b
            goto L_0x01fa
        L_0x009b:
            boolean r9 = r11.isTrackingStopped()
            if (r9 != 0) goto L_0x00a6
            java.lang.String r9 = "AppsFlyerLib.sendTrackingWithEvent"
            com.appsflyer.AFLogger.afInfoLog(r9)
        L_0x00a6:
            int r2 = m1161((android.content.SharedPreferences) r2, (java.lang.String) r7, (boolean) r3)
            if (r6 != 0) goto L_0x00c9
            if (r5 == 0) goto L_0x00af
            goto L_0x00c9
        L_0x00af:
            if (r1 == 0) goto L_0x00c2
            r5 = 2
            if (r2 >= r5) goto L_0x00bb
            java.lang.String r5 = f8574
            java.lang.String r5 = com.appsflyer.ServerConfigHandler.getUrl(r5)
            goto L_0x00cf
        L_0x00bb:
            java.lang.String r5 = f8573
            java.lang.String r5 = com.appsflyer.ServerConfigHandler.getUrl(r5)
            goto L_0x00cf
        L_0x00c2:
            java.lang.String r5 = "https://%sinapps.%s/api/v4.11/androidevent?app_id="
            java.lang.String r5 = com.appsflyer.ServerConfigHandler.getUrl(r5)
            goto L_0x00cf
        L_0x00c9:
            java.lang.String r5 = "https://%sattr.%s/api/v4.11/androidevent?app_id="
            java.lang.String r5 = com.appsflyer.ServerConfigHandler.getUrl(r5)
        L_0x00cf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r0.getPackageName()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "&buildnumber=5.1.1"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r0)
            java.lang.String r6 = m1182((java.lang.ref.WeakReference<android.content.Context>) r6)
            if (r6 == 0) goto L_0x0112
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = "&channel="
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
        L_0x0112:
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r7 = "collectAndroidIdForceByUser"
            boolean r6 = r6.getBoolean(r7, r3)
            if (r6 != 0) goto L_0x012d
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r7 = "collectIMEIForceByUser"
            boolean r6 = r6.getBoolean(r7, r3)
            if (r6 == 0) goto L_0x012b
            goto L_0x012d
        L_0x012b:
            r6 = 0
            goto L_0x012e
        L_0x012d:
            r6 = 1
        L_0x012e:
            if (r6 != 0) goto L_0x016b
            java.lang.String r6 = "advertiserId"
            java.lang.Object r6 = r8.get(r6)
            if (r6 == 0) goto L_0x016b
            java.lang.String r6 = r11.f8603     // Catch:{ Exception -> 0x0165 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0165 }
            if (r6 == 0) goto L_0x014e
            java.lang.String r6 = "android_id"
            java.lang.Object r6 = r8.remove(r6)     // Catch:{ Exception -> 0x0165 }
            if (r6 == 0) goto L_0x014e
            java.lang.String r6 = "validateGaidAndIMEI :: removing: android_id"
            com.appsflyer.AFLogger.afInfoLog(r6)     // Catch:{ Exception -> 0x0165 }
        L_0x014e:
            java.lang.String r6 = r11.f8599     // Catch:{ Exception -> 0x0165 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0165 }
            if (r6 == 0) goto L_0x016b
            java.lang.String r6 = "imei"
            java.lang.Object r6 = r8.remove(r6)     // Catch:{ Exception -> 0x0165 }
            if (r6 == 0) goto L_0x016b
            java.lang.String r6 = "validateGaidAndIMEI :: removing: imei"
            com.appsflyer.AFLogger.afInfoLog(r6)     // Catch:{ Exception -> 0x0165 }
            goto L_0x016b
        L_0x0165:
            r6 = move-exception
            java.lang.String r7 = "failed to remove IMEI or AndroidID key from params; "
            com.appsflyer.AFLogger.afErrorLog(r7, r6)
        L_0x016b:
            com.appsflyer.AppsFlyerLibCore$b r6 = new com.appsflyer.AppsFlyerLibCore$b
            com.appsflyer.AFEvent r12 = r12.urlString(r5)
            r12.f8539 = r8
            com.appsflyer.AFEvent r12 = r12.m1116()
            r12.f8538 = r2
            r6.<init>(r11, r12, r3)
            r12 = 500(0x1f4, float:7.0E-43)
            if (r1 == 0) goto L_0x019d
            boolean r0 = m1152((android.content.Context) r0)
            if (r0 == 0) goto L_0x019d
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.f8605
            if (r0 == 0) goto L_0x0192
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0192
            r0 = 1
            goto L_0x0193
        L_0x0192:
            r0 = 0
        L_0x0193:
            if (r0 != 0) goto L_0x019d
            java.lang.String r0 = "Failed to get new referrer, wait ..."
            com.appsflyer.AFLogger.afDebugLog(r0)
            r0 = 500(0x1f4, float:7.0E-43)
            goto L_0x019e
        L_0x019d:
            r0 = 0
        L_0x019e:
            if (r1 == 0) goto L_0x01ba
            boolean r2 = r11.f8596
            if (r2 == 0) goto L_0x01ba
            java.util.Map<java.lang.String, java.lang.Object> r2 = r11.f8595
            if (r2 == 0) goto L_0x01b0
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01b0
            r2 = 1
            goto L_0x01b1
        L_0x01b0:
            r2 = 0
        L_0x01b1:
            if (r2 != 0) goto L_0x01ba
            java.lang.String r0 = "fetching Facebook deferred AppLink data, wait ..."
            com.appsflyer.AFLogger.afDebugLog(r0)
            r0 = 500(0x1f4, float:7.0E-43)
        L_0x01ba:
            if (r1 == 0) goto L_0x01ce
            boolean r1 = r11.f8601
            if (r1 == 0) goto L_0x01ce
            java.util.Map<java.lang.String, java.lang.Object> r1 = r11.f8598
            if (r1 == 0) goto L_0x01cb
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01cb
            r3 = 1
        L_0x01cb:
            if (r3 != 0) goto L_0x01ce
            goto L_0x01cf
        L_0x01ce:
            r12 = r0
        L_0x01cf:
            boolean r0 = com.appsflyer.internal.f.f8745
            if (r0 == 0) goto L_0x01eb
            java.lang.String r0 = "ESP deeplink: execute launch on SerialExecutor"
            com.appsflyer.AFLogger.afRDLog(r0)
            com.appsflyer.AFExecutor r0 = com.appsflyer.AFExecutor.getInstance()
            java.util.concurrent.ScheduledExecutorService r1 = r0.f8553
            if (r1 != 0) goto L_0x01e8
            java.util.concurrent.ThreadFactory r1 = r0.f8551
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r1)
            r0.f8553 = r1
        L_0x01e8:
            java.util.concurrent.ScheduledExecutorService r0 = r0.f8553
            goto L_0x01f3
        L_0x01eb:
            com.appsflyer.AFExecutor r0 = com.appsflyer.AFExecutor.getInstance()
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.m1118()
        L_0x01f3:
            long r1 = (long) r12
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            m1150(r0, r6, r1, r12)
            return
        L_0x01fa:
            java.lang.String r12 = "Not sending data yet, waiting for dev key"
            com.appsflyer.AFLogger.afDebugLog(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m1175(com.appsflyer.AFEvent):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(1:2)(2:3|(1:5)(1:6))|7|(1:9)(1:10)|11|(1:13)|14|15|(3:17|(1:19)(1:20)|21)(1:22)|23|24|25|(1:27)|28|29|(1:31)|32|(1:34)|35|(1:37)|42|43|(20:45|46|(7:48|(1:50)|51|(1:53)(1:54)|(1:58)|59|(1:61))|62|(1:64)(1:65)|66|(1:68)|(1:70)|71|(1:73)(1:74)|75|(1:77)|78|79|(2:81|82)|83|(1:85)|86|(1:90)|91)(11:92|93|94|95|96|(9:98|99|100|101|102|103|104|105|106)(1:113)|114|115|116|117|118)|128|(1:133)|134|(1:136)|137|138|(1:140)|145|(1:149)|150|(1:156)|157|(1:159)(3:160|(1:162)(1:163)|164)|(1:166)|167|(3:169|(1:171)(3:172|(14:174|(2:176|(1:178)(12:179|(1:182)|(2:184|(1:186)(9:187|(1:190)|(2:192|(1:194)(6:195|(1:198)|(2:200|(1:202)(3:203|(1:209)(1:208)|(1:211)(1:212)))|204|(0)(0)|(0)(0)))|196|(0)|(0)|204|(0)(0)|(0)(0)))|188|(0)|(0)|196|(0)|(0)|204|(0)(0)|(0)(0)))|180|(0)|(0)|188|(0)|(0)|196|(0)|(0)|204|(0)(0)|(0)(0))|(1:214))|(1:216))|(1:218)|219|(1:221)|222|(3:224|225|(74:227|233|(1:235)|236|(1:238)(2:239|(1:241))|(2:243|(1:245))|246|(1:248)|249|(3:251|(1:253)|254)|255|(1:257)|258|(3:260|261|(1:270))|271|272|(3:274|275|276)(12:277|(12:317|(1:319)|321|(1:323)(1:324)|325|(2:347|(6:349|(1:352)(1:353)|354|(1:356)(1:357)|(1:359)(3:360|(3:362|363|(4:365|366|367|(1:369)))|376)|(1:378)))(2:329|(3:331|332|(6:334|(0)(0)|354|(0)(0)|(0)(0)|(0))(7:(1:336)(1:337)|346|(0)(0)|354|(0)(0)|(0)(0)|(0))))|350|(0)(0)|354|(0)(0)|(0)(0)|(0))(12:281|(7:283|284|285|286|287|288|(1:290)(1:(13:292|293|294|295|(0)(0)|325|(0)(0)|350|(0)(0)|354|(0)(0)|(0)(0)|(0))))(1:316)|321|(0)(0)|325|(0)(0)|350|(0)(0)|354|(0)(0)|(0)(0)|(0))|320|(0)(0)|325|(0)(0)|350|(0)(0)|354|(0)(0)|(0)(0)|(0))|379|380|381|(2:383|384)|391|392|393|398|399|400|405|406|407|412|413|414|419|420|421|422|423|(6:425|426|427|428|429|430)(1:435)|436|437|438|439|440|441|453|(1:455)|(3:457|(1:459)|460)|461|(4:463|464|(1:466)(1:467)|468)|473|(1:475)|476|(1:482)(1:481)|(1:484)|485|(2:487|(1:489)(1:490))|491|(1:493)|494|(1:496)(1:497)|498|(2:502|(11:504|506|(1:508)(1:509)|510|(6:512|(4:514|(1:516)|517|(1:519))|520|(1:522)|523|(3:525|(1:527)(2:528|(1:530))|531))|532|(1:534)|535|(1:537)|538|543))|505|506|(0)(0)|510|(0)|532|(0)|535|(0)|538|543))|228|(2:539|540)(77:232|233|(0)|236|(0)(0)|(0)|246|(0)|249|(0)|255|(0)|258|(0)|271|272|(0)(0)|379|380|381|(0)|391|392|393|398|399|400|405|406|407|412|413|414|419|420|421|422|423|(0)(0)|436|437|438|439|440|441|453|(0)|(0)|461|(0)|473|(0)|476|(0)|482|(0)|485|(0)|491|(0)|494|(0)(0)|498|500|502|(0)|505|506|(0)(0)|510|(0)|532|(0)|535|(0)|538|543)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00c8 */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0331 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0344 A[Catch:{ Exception -> 0x034a }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0395 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x039d A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03bb A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03d9 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0410 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0424 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0430 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0438 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0444 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x044c A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0462 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0463 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0466 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0468 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0483 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0492 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x049f A[SYNTHETIC, Splitter:B:224:0x049f] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04bd A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x04cc A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x04da A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04e1 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04fa A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0512 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0529 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0557 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0572 A[SYNTHETIC, Splitter:B:260:0x0572] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0592 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05b2 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x061e A[SYNTHETIC, Splitter:B:304:0x061e] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x062a A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0639 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0645 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e4 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0660 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x066b A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0688 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x06cb A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f1 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x06d5 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x06e0 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x06ee A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x06f0 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x06f3 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x06f7 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0720 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fe A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0741 A[SYNTHETIC, Splitter:B:383:0x0741] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x07fe  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0822  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x08a4 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x08ae A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014e A[SYNTHETIC, Splitter:B:45:0x014e] */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x08de A[SYNTHETIC, Splitter:B:463:0x08de] */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0922 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x094e A[ADDED_TO_REGION, Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x095d A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0989 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x09af A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x09e4 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x09e6 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x0a0a A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:508:0x0a26 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0a27 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x0a62 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x0bd8 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:537:0x0bf2 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x0c42 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0267 A[Catch:{ Exception -> 0x0104, all -> 0x0c4e }] */
    /* renamed from: ˎ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> m1198(com.appsflyer.AFEvent r33) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            java.lang.String r3 = "AppsFlyerTimePassedSincePrevLaunch"
            java.lang.String r4 = "yyyy-MM-dd_HHmmssZ"
            java.lang.String r5 = "use cached IMEI: "
            java.lang.String r6 = "uid"
            java.lang.String r7 = "appid"
            java.lang.String r8 = "INSTALL_STORE"
            java.lang.String r9 = "prev_event_name"
            java.lang.String r10 = "preInstallName"
            android.content.Context r11 = r2.f8537
            if (r11 == 0) goto L_0x001e
            android.content.Context r11 = r2.f8537
            goto L_0x002c
        L_0x001e:
            java.lang.ref.WeakReference<android.content.Context> r11 = r2.f8541
            if (r11 == 0) goto L_0x002b
            java.lang.ref.WeakReference<android.content.Context> r11 = r2.f8541
            java.lang.Object r11 = r11.get()
            android.content.Context r11 = (android.content.Context) r11
            goto L_0x002c
        L_0x002b:
            r11 = 0
        L_0x002c:
            java.lang.String r13 = r2.f8536
            java.lang.String r14 = r2.f8548
            org.json.JSONObject r15 = new org.json.JSONObject
            java.util.Map<java.lang.String, java.lang.Object> r12 = r2.f8535
            if (r12 != 0) goto L_0x003c
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            goto L_0x003e
        L_0x003c:
            java.util.Map<java.lang.String, java.lang.Object> r12 = r2.f8535
        L_0x003e:
            r15.<init>(r12)
            java.lang.String r12 = r15.toString()
            java.lang.String r15 = r2.f8544
            r16 = r4
            android.content.Context r4 = r11.getApplicationContext()
            r17 = r6
            java.lang.String r6 = "appsflyer-data"
            r18 = r5
            r5 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r6, r5)
            boolean r5 = r2.f8540
            r19 = r7
            android.content.Intent r7 = r33.intent()
            java.lang.String r2 = r2.f8533
            r33 = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.appsflyer.internal.aa.m1217(r11, r2)
            java.util.Date r20 = new java.util.Date
            r20.<init>()
            r22 = r7
            r21 = r8
            long r7 = r20.getTime()
            r20 = r13
            java.lang.String r13 = java.lang.Long.toString(r7)
            r23 = r10
            java.lang.String r10 = "af_timestamp"
            r2.put(r10, r13)
            java.lang.String r7 = com.appsflyer.internal.d.m1256(r11, r7)
            if (r7 == 0) goto L_0x0091
            java.lang.String r8 = "cksm_v1"
            r2.put(r8, r7)
        L_0x0091:
            boolean r7 = r32.isTrackingStopped()     // Catch:{ all -> 0x0c4e }
            if (r7 != 0) goto L_0x00af
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4e }
            java.lang.String r8 = "******* sendTrackingWithEvent: "
            r7.<init>(r8)     // Catch:{ all -> 0x0c4e }
            if (r5 == 0) goto L_0x00a3
            java.lang.String r8 = "Launch"
            goto L_0x00a4
        L_0x00a3:
            r8 = r14
        L_0x00a4:
            r7.append(r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0c4e }
            com.appsflyer.AFLogger.afInfoLog(r7)     // Catch:{ all -> 0x0c4e }
            goto L_0x00b4
        L_0x00af:
            java.lang.String r7 = "SDK tracking has been stopped"
            com.appsflyer.AFLogger.afInfoLog(r7)     // Catch:{ all -> 0x0c4e }
        L_0x00b4:
            com.appsflyer.internal.z.m1303()     // Catch:{ all -> 0x0c4e }
            java.io.File r7 = com.appsflyer.internal.z.m1304(r11)     // Catch:{ Exception -> 0x00c8 }
            boolean r7 = r7.exists()     // Catch:{ Exception -> 0x00c8 }
            if (r7 != 0) goto L_0x00c8
            java.io.File r7 = com.appsflyer.internal.z.m1304(r11)     // Catch:{ Exception -> 0x00c8 }
            r7.mkdir()     // Catch:{ Exception -> 0x00c8 }
        L_0x00c8:
            android.content.pm.PackageManager r7 = r11.getPackageManager()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r8 = r11.getPackageName()     // Catch:{ Exception -> 0x0104 }
            r13 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r13)     // Catch:{ Exception -> 0x0104 }
            java.lang.String[] r7 = r7.requestedPermissions     // Catch:{ Exception -> 0x0104 }
            java.util.List r7 = java.util.Arrays.asList(r7)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r8 = "android.permission.INTERNET"
            boolean r8 = r7.contains(r8)     // Catch:{ Exception -> 0x0104 }
            if (r8 != 0) goto L_0x00e9
            java.lang.String r8 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r8)     // Catch:{ Exception -> 0x0104 }
        L_0x00e9:
            java.lang.String r8 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r8 = r7.contains(r8)     // Catch:{ Exception -> 0x0104 }
            if (r8 != 0) goto L_0x00f6
            java.lang.String r8 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r8)     // Catch:{ Exception -> 0x0104 }
        L_0x00f6:
            java.lang.String r8 = "android.permission.ACCESS_WIFI_STATE"
            boolean r7 = r7.contains(r8)     // Catch:{ Exception -> 0x0104 }
            if (r7 != 0) goto L_0x010b
            java.lang.String r7 = "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r7)     // Catch:{ Exception -> 0x0104 }
            goto L_0x010b
        L_0x0104:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "Exception while validation permissions. "
            com.appsflyer.AFLogger.afErrorLog(r8, r7)     // Catch:{ all -> 0x0c4e }
        L_0x010b:
            java.lang.String r7 = "af_events_api"
            java.lang.String r8 = "1"
            r2.put(r7, r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = "brand"
            java.lang.String r8 = android.os.Build.BRAND     // Catch:{ all -> 0x0c4e }
            r2.put(r7, r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = "device"
            java.lang.String r8 = android.os.Build.DEVICE     // Catch:{ all -> 0x0c4e }
            r2.put(r7, r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = "product"
            java.lang.String r8 = android.os.Build.PRODUCT     // Catch:{ all -> 0x0c4e }
            r2.put(r7, r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = "sdk"
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0c4e }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x0c4e }
            r2.put(r7, r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = "model"
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ all -> 0x0c4e }
            r2.put(r7, r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = "deviceType"
            java.lang.String r8 = android.os.Build.TYPE     // Catch:{ all -> 0x0c4e }
            r2.put(r7, r8)     // Catch:{ all -> 0x0c4e }
            m1148((android.content.Context) r11, (java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0c4e }
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r8 = "appsFlyerCount"
            r24 = r12
            r12 = 1
            if (r5 == 0) goto L_0x0267
            android.content.Context r9 = r11.getApplicationContext()     // Catch:{ all -> 0x0c4e }
            r13 = 0
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r6, r13)     // Catch:{ all -> 0x0c4e }
            boolean r9 = r9.contains(r8)     // Catch:{ all -> 0x0c4e }
            r9 = r9 ^ r12
            if (r9 == 0) goto L_0x01aa
            boolean r9 = r7.isOtherSdkStringDisabled()     // Catch:{ all -> 0x0c4e }
            if (r9 != 0) goto L_0x0171
            float r9 = m1134((android.content.Context) r11)     // Catch:{ all -> 0x0c4e }
            java.lang.String r13 = "batteryLevel"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0c4e }
            r2.put(r13, r9)     // Catch:{ all -> 0x0c4e }
        L_0x0171:
            m1166((android.content.Context) r11)     // Catch:{ all -> 0x0c4e }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0c4e }
            r13 = 23
            if (r9 < r13) goto L_0x0183
            java.lang.Class<android.app.UiModeManager> r9 = android.app.UiModeManager.class
            java.lang.Object r9 = r11.getSystemService(r9)     // Catch:{ all -> 0x0c4e }
            android.app.UiModeManager r9 = (android.app.UiModeManager) r9     // Catch:{ all -> 0x0c4e }
            goto L_0x018c
        L_0x0183:
            java.lang.String r9 = "uimode"
            java.lang.Object r9 = r11.getSystemService(r9)     // Catch:{ all -> 0x0c4e }
            android.app.UiModeManager r9 = (android.app.UiModeManager) r9     // Catch:{ all -> 0x0c4e }
        L_0x018c:
            if (r9 == 0) goto L_0x019d
            int r9 = r9.getCurrentModeType()     // Catch:{ all -> 0x0c4e }
            r13 = 4
            if (r9 != r13) goto L_0x019d
            java.lang.String r9 = "tv"
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0c4e }
            r2.put(r9, r13)     // Catch:{ all -> 0x0c4e }
        L_0x019d:
            boolean r9 = com.appsflyer.internal.instant.AFInstantApps.isInstantApp(r11)     // Catch:{ all -> 0x0c4e }
            if (r9 == 0) goto L_0x01aa
            java.lang.String r9 = "inst_app"
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0c4e }
            r2.put(r9, r13)     // Catch:{ all -> 0x0c4e }
        L_0x01aa:
            java.lang.String r9 = "timepassedsincelastlaunch"
            android.content.Context r13 = r11.getApplicationContext()     // Catch:{ all -> 0x0c4e }
            r12 = 0
            android.content.SharedPreferences r13 = r13.getSharedPreferences(r6, r12)     // Catch:{ all -> 0x0c4e }
            r27 = r5
            r12 = r6
            r5 = 0
            long r28 = r13.getLong(r3, r5)     // Catch:{ all -> 0x0c4e }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0c4e }
            m1146((android.content.Context) r11, (java.lang.String) r3, (long) r5)     // Catch:{ all -> 0x0c4e }
            r25 = 0
            int r3 = (r28 > r25 ? 1 : (r28 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x01d3
            long r5 = r5 - r28
            r28 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r28
            goto L_0x01d5
        L_0x01d3:
            r5 = -1
        L_0x01d5:
            java.lang.String r3 = java.lang.Long.toString(r5)     // Catch:{ all -> 0x0c4e }
            r2.put(r9, r3)     // Catch:{ all -> 0x0c4e }
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r5 = "oneLinkSlug"
            java.lang.String r3 = r3.getString(r5)     // Catch:{ all -> 0x0c4e }
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = "onelinkVersion"
            java.lang.String r5 = r5.getString(r6)     // Catch:{ all -> 0x0c4e }
            if (r3 == 0) goto L_0x01f7
            java.lang.String r6 = "onelink_id"
            r2.put(r6, r3)     // Catch:{ all -> 0x0c4e }
        L_0x01f7:
            if (r5 == 0) goto L_0x01fe
            java.lang.String r3 = "onelink_ver"
            r2.put(r3, r5)     // Catch:{ all -> 0x0c4e }
        L_0x01fe:
            java.lang.String r3 = "appsflyerGetConversionDataTiming"
            r5 = 0
            long r28 = r4.getLong(r3, r5)     // Catch:{ all -> 0x0c4e }
            int r3 = (r28 > r5 ? 1 : (r28 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0223
            java.lang.String r3 = "gcd_timing"
            java.lang.String r5 = java.lang.Long.toString(r28)     // Catch:{ all -> 0x0c4e }
            r2.put(r3, r5)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = "appsflyerGetConversionDataTiming"
            android.content.SharedPreferences$Editor r5 = r4.edit()     // Catch:{ all -> 0x0c4e }
            r6 = r10
            r9 = 0
            r5.putLong(r3, r9)     // Catch:{ all -> 0x0c4e }
            r5.apply()     // Catch:{ all -> 0x0c4e }
            goto L_0x0224
        L_0x0223:
            r6 = r10
        L_0x0224:
            java.lang.String r3 = r1.f8600     // Catch:{ all -> 0x0c4e }
            if (r3 == 0) goto L_0x022f
            java.lang.String r3 = "phone"
            java.lang.String r5 = r1.f8600     // Catch:{ all -> 0x0c4e }
            r2.put(r3, r5)     // Catch:{ all -> 0x0c4e }
        L_0x022f:
            boolean r3 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0c4e }
            java.lang.String r5 = "referrer"
            if (r3 != 0) goto L_0x023a
            r2.put(r5, r15)     // Catch:{ all -> 0x0c4e }
        L_0x023a:
            java.lang.String r3 = "extraReferrers"
            r9 = 0
            java.lang.String r3 = r4.getString(r3, r9)     // Catch:{ all -> 0x0c4e }
            if (r3 == 0) goto L_0x0248
            java.lang.String r9 = "extraReferrers"
            r2.put(r9, r3)     // Catch:{ all -> 0x0c4e }
        L_0x0248:
            java.lang.String r3 = r7.getReferrer(r11)     // Catch:{ all -> 0x0c4e }
            boolean r9 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0c4e }
            if (r9 != 0) goto L_0x025b
            java.lang.Object r9 = r2.get(r5)     // Catch:{ all -> 0x0c4e }
            if (r9 != 0) goto L_0x025b
            r2.put(r5, r3)     // Catch:{ all -> 0x0c4e }
        L_0x025b:
            r29 = r4
            r28 = r6
            r30 = r7
            r31 = r8
            r3 = r24
            goto L_0x02f9
        L_0x0267:
            r27 = r5
            r12 = r6
            r6 = r10
            android.content.Context r3 = r11.getApplicationContext()     // Catch:{ all -> 0x0c4e }
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r12, r5)     // Catch:{ all -> 0x0c4e }
            android.content.SharedPreferences$Editor r5 = r3.edit()     // Catch:{ all -> 0x0c4e }
            r10 = 0
            java.lang.String r13 = r3.getString(r9, r10)     // Catch:{ Exception -> 0x02e8 }
            java.lang.String r10 = "prev_event_timestamp"
            java.lang.String r15 = "prev_event_value"
            if (r13 == 0) goto L_0x02c9
            r28 = r6
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x02be }
            r6.<init>()     // Catch:{ Exception -> 0x02be }
            r29 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02bc }
            r4.<init>()     // Catch:{ Exception -> 0x02bc }
            r30 = r7
            r31 = r8
            r7 = -1
            long r7 = r3.getLong(r10, r7)     // Catch:{ Exception -> 0x02ba }
            r4.append(r7)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x02ba }
            r6.put(r10, r4)     // Catch:{ Exception -> 0x02ba }
            r4 = 0
            java.lang.String r3 = r3.getString(r15, r4)     // Catch:{ Exception -> 0x02ba }
            r6.put(r15, r3)     // Catch:{ Exception -> 0x02ba }
            r6.put(r9, r13)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r3 = "prev_event"
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x02ba }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x02ba }
            goto L_0x02d1
        L_0x02ba:
            r0 = move-exception
            goto L_0x02c5
        L_0x02bc:
            r0 = move-exception
            goto L_0x02c1
        L_0x02be:
            r0 = move-exception
            r29 = r4
        L_0x02c1:
            r30 = r7
            r31 = r8
        L_0x02c5:
            r4 = r0
            r3 = r24
            goto L_0x02f4
        L_0x02c9:
            r29 = r4
            r28 = r6
            r30 = r7
            r31 = r8
        L_0x02d1:
            r5.putString(r9, r14)     // Catch:{ Exception -> 0x02e6 }
            r3 = r24
            r5.putString(r15, r3)     // Catch:{ Exception -> 0x02e4 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02e4 }
            r5.putLong(r10, r6)     // Catch:{ Exception -> 0x02e4 }
            r5.apply()     // Catch:{ Exception -> 0x02e4 }
            goto L_0x02f9
        L_0x02e4:
            r0 = move-exception
            goto L_0x02f3
        L_0x02e6:
            r0 = move-exception
            goto L_0x02f1
        L_0x02e8:
            r0 = move-exception
            r29 = r4
            r28 = r6
            r30 = r7
            r31 = r8
        L_0x02f1:
            r3 = r24
        L_0x02f3:
            r4 = r0
        L_0x02f4:
            java.lang.String r5 = "Error while processing previous event."
            com.appsflyer.AFLogger.afErrorLog(r5, r4)     // Catch:{ all -> 0x0c4e }
        L_0x02f9:
            java.lang.String r4 = "KSAppsFlyerId"
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = r5.getString(r4)     // Catch:{ all -> 0x0c4e }
            java.lang.String r5 = "KSAppsFlyerRICounter"
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r5 = r6.getString(r5)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x0325
            if (r5 == 0) goto L_0x0325
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0c4e }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0c4e }
            if (r6 <= 0) goto L_0x0325
            java.lang.String r6 = "reinstallCounter"
            r2.put(r6, r5)     // Catch:{ all -> 0x0c4e }
            java.lang.String r5 = "originalAppsflyerId"
            r2.put(r5, r4)     // Catch:{ all -> 0x0c4e }
        L_0x0325:
            java.lang.String r4 = "additionalCustomData"
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = r5.getString(r4)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x0336
            java.lang.String r5 = "customData"
            r2.put(r5, r4)     // Catch:{ all -> 0x0c4e }
        L_0x0336:
            android.content.pm.PackageManager r4 = r11.getPackageManager()     // Catch:{ Exception -> 0x034a }
            java.lang.String r5 = r11.getPackageName()     // Catch:{ Exception -> 0x034a }
            java.lang.String r4 = r4.getInstallerPackageName(r5)     // Catch:{ Exception -> 0x034a }
            if (r4 == 0) goto L_0x0351
            java.lang.String r5 = "installer_package"
            r2.put(r5, r4)     // Catch:{ Exception -> 0x034a }
            goto L_0x0351
        L_0x034a:
            r0 = move-exception
            r4 = r0
            java.lang.String r5 = "Exception while getting the app's installer package. "
            com.appsflyer.AFLogger.afErrorLog(r5, r4)     // Catch:{ all -> 0x0c4e }
        L_0x0351:
            java.lang.String r4 = "sdkExtension"
            r5 = r30
            java.lang.String r4 = r5.getString(r4)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x0366
            int r6 = r4.length()     // Catch:{ all -> 0x0c4e }
            if (r6 <= 0) goto L_0x0366
            java.lang.String r6 = "sdkExtension"
            r2.put(r6, r4)     // Catch:{ all -> 0x0c4e }
        L_0x0366:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0c4e }
            r4.<init>(r11)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = m1182((java.lang.ref.WeakReference<android.content.Context>) r4)     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = m1154((android.content.Context) r11, (java.lang.String) r4)     // Catch:{ all -> 0x0c4e }
            if (r6 == 0) goto L_0x037b
            boolean r7 = r6.equals(r4)     // Catch:{ all -> 0x0c4e }
            if (r7 == 0) goto L_0x037f
        L_0x037b:
            if (r6 != 0) goto L_0x0384
            if (r4 == 0) goto L_0x0384
        L_0x037f:
            java.lang.String r6 = "af_latestchannel"
            r2.put(r6, r4)     // Catch:{ all -> 0x0c4e }
        L_0x0384:
            android.content.Context r4 = r11.getApplicationContext()     // Catch:{ all -> 0x0c4e }
            r6 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r12, r6)     // Catch:{ all -> 0x0c4e }
            r6 = r21
            boolean r7 = r4.contains(r6)     // Catch:{ all -> 0x0c4e }
            if (r7 == 0) goto L_0x039d
            r7 = 0
            java.lang.String r4 = r4.getString(r6, r7)     // Catch:{ all -> 0x0c4e }
            r7 = r31
            goto L_0x03b9
        L_0x039d:
            android.content.Context r4 = r11.getApplicationContext()     // Catch:{ all -> 0x0c4e }
            r7 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r12, r7)     // Catch:{ all -> 0x0c4e }
            r7 = r31
            boolean r4 = r4.contains(r7)     // Catch:{ all -> 0x0c4e }
            r8 = 1
            r4 = r4 ^ r8
            if (r4 == 0) goto L_0x03b5
            java.lang.String r4 = m1137((android.content.Context) r11)     // Catch:{ all -> 0x0c4e }
            goto L_0x03b6
        L_0x03b5:
            r4 = 0
        L_0x03b6:
            m1174(r11, r6, r4)     // Catch:{ all -> 0x0c4e }
        L_0x03b9:
            if (r4 == 0) goto L_0x03c4
            java.lang.String r6 = "af_installstore"
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ all -> 0x0c4e }
            r2.put(r6, r4)     // Catch:{ all -> 0x0c4e }
        L_0x03c4:
            android.content.Context r4 = r11.getApplicationContext()     // Catch:{ all -> 0x0c4e }
            r6 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r12, r6)     // Catch:{ all -> 0x0c4e }
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            r8 = r23
            java.lang.String r6 = r6.getString(r8)     // Catch:{ all -> 0x0c4e }
            if (r6 != 0) goto L_0x0481
            boolean r9 = r4.contains(r8)     // Catch:{ all -> 0x0c4e }
            if (r9 == 0) goto L_0x03e7
            r6 = 0
            java.lang.String r4 = r4.getString(r8, r6)     // Catch:{ all -> 0x0c4e }
            r6 = r4
            goto L_0x0478
        L_0x03e7:
            android.content.Context r4 = r11.getApplicationContext()     // Catch:{ all -> 0x0c4e }
            r9 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r12, r9)     // Catch:{ all -> 0x0c4e }
            boolean r4 = r4.contains(r7)     // Catch:{ all -> 0x0c4e }
            r9 = 1
            r4 = r4 ^ r9
            if (r4 == 0) goto L_0x0473
            java.lang.String r4 = "ro.appsflyer.preinstall.path"
            java.lang.String r4 = m1163((java.lang.String) r4)     // Catch:{ all -> 0x0c4e }
            java.io.File r4 = m1135((java.lang.String) r4)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x040d
            boolean r6 = r4.exists()     // Catch:{ all -> 0x0c4e }
            if (r6 != 0) goto L_0x040b
            goto L_0x040d
        L_0x040b:
            r6 = 0
            goto L_0x040e
        L_0x040d:
            r6 = 1
        L_0x040e:
            if (r6 == 0) goto L_0x0422
            java.lang.String r4 = "AF_PRE_INSTALL_PATH"
            android.content.pm.PackageManager r6 = r11.getPackageManager()     // Catch:{ all -> 0x0c4e }
            java.lang.String r9 = r11.getPackageName()     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = m1164((java.lang.String) r4, (android.content.pm.PackageManager) r6, (java.lang.String) r9)     // Catch:{ all -> 0x0c4e }
            java.io.File r4 = m1135((java.lang.String) r4)     // Catch:{ all -> 0x0c4e }
        L_0x0422:
            if (r4 == 0) goto L_0x042d
            boolean r6 = r4.exists()     // Catch:{ all -> 0x0c4e }
            if (r6 != 0) goto L_0x042b
            goto L_0x042d
        L_0x042b:
            r6 = 0
            goto L_0x042e
        L_0x042d:
            r6 = 1
        L_0x042e:
            if (r6 == 0) goto L_0x0436
            java.lang.String r4 = "/data/local/tmp/pre_install.appsflyer"
            java.io.File r4 = m1135((java.lang.String) r4)     // Catch:{ all -> 0x0c4e }
        L_0x0436:
            if (r4 == 0) goto L_0x0441
            boolean r6 = r4.exists()     // Catch:{ all -> 0x0c4e }
            if (r6 != 0) goto L_0x043f
            goto L_0x0441
        L_0x043f:
            r6 = 0
            goto L_0x0442
        L_0x0441:
            r6 = 1
        L_0x0442:
            if (r6 == 0) goto L_0x044a
            java.lang.String r4 = "/etc/pre_install.appsflyer"
            java.io.File r4 = m1135((java.lang.String) r4)     // Catch:{ all -> 0x0c4e }
        L_0x044a:
            if (r4 == 0) goto L_0x0455
            boolean r6 = r4.exists()     // Catch:{ all -> 0x0c4e }
            if (r6 != 0) goto L_0x0453
            goto L_0x0455
        L_0x0453:
            r6 = 0
            goto L_0x0456
        L_0x0455:
            r6 = 1
        L_0x0456:
            if (r6 != 0) goto L_0x0463
            java.lang.String r6 = r11.getPackageName()     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = m1162((java.io.File) r4, (java.lang.String) r6)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x0463
            goto L_0x0464
        L_0x0463:
            r4 = 0
        L_0x0464:
            if (r4 == 0) goto L_0x0468
            r6 = r4
            goto L_0x0473
        L_0x0468:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0c4e }
            r4.<init>(r11)     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = "AF_PRE_INSTALL_NAME"
            java.lang.String r6 = m1165((java.lang.ref.WeakReference<android.content.Context>) r4, (java.lang.String) r6)     // Catch:{ all -> 0x0c4e }
        L_0x0473:
            if (r6 == 0) goto L_0x0478
            m1174(r11, r8, r6)     // Catch:{ all -> 0x0c4e }
        L_0x0478:
            if (r6 == 0) goto L_0x0481
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            r4.set((java.lang.String) r8, (java.lang.String) r6)     // Catch:{ all -> 0x0c4e }
        L_0x0481:
            if (r6 == 0) goto L_0x048c
            java.lang.String r4 = "af_preinstall_name"
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x0c4e }
            r2.put(r4, r6)     // Catch:{ all -> 0x0c4e }
        L_0x048c:
            java.lang.String r4 = m1137((android.content.Context) r11)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x049b
            java.lang.String r6 = "af_currentstore"
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ all -> 0x0c4e }
            r2.put(r6, r4)     // Catch:{ all -> 0x0c4e }
        L_0x049b:
            java.lang.String r4 = "appsflyerKey"
            if (r20 == 0) goto L_0x04ab
            int r6 = r20.length()     // Catch:{ all -> 0x0c4e }
            if (r6 <= 0) goto L_0x04ab
            r6 = r20
            r2.put(r4, r6)     // Catch:{ all -> 0x0c4e }
            goto L_0x04c0
        L_0x04ab:
            java.lang.String r6 = "AppsFlyerKey"
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = r8.getString(r6)     // Catch:{ all -> 0x0c4e }
            if (r6 == 0) goto L_0x0c42
            int r8 = r6.length()     // Catch:{ all -> 0x0c4e }
            if (r8 <= 0) goto L_0x0c42
            r2.put(r4, r6)     // Catch:{ all -> 0x0c4e }
        L_0x04c0:
            java.lang.String r6 = "AppUserId"
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = r8.getString(r6)     // Catch:{ all -> 0x0c4e }
            if (r6 == 0) goto L_0x04d1
            java.lang.String r8 = "appUserId"
            r2.put(r8, r6)     // Catch:{ all -> 0x0c4e }
        L_0x04d1:
            java.lang.String r6 = "userEmails"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x0c4e }
            if (r6 == 0) goto L_0x04e1
            java.lang.String r8 = "user_emails"
            r2.put(r8, r6)     // Catch:{ all -> 0x0c4e }
            goto L_0x04f8
        L_0x04e1:
            java.lang.String r6 = "userEmail"
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = r8.getString(r6)     // Catch:{ all -> 0x0c4e }
            if (r6 == 0) goto L_0x04f8
            java.lang.String r8 = "sha1_el"
            java.lang.String r6 = com.appsflyer.internal.af.m1229(r6)     // Catch:{ all -> 0x0c4e }
            r2.put(r8, r6)     // Catch:{ all -> 0x0c4e }
        L_0x04f8:
            if (r14 == 0) goto L_0x0506
            java.lang.String r6 = "eventName"
            r2.put(r6, r14)     // Catch:{ all -> 0x0c4e }
            if (r3 == 0) goto L_0x0506
            java.lang.String r6 = "eventValue"
            r2.put(r6, r3)     // Catch:{ all -> 0x0c4e }
        L_0x0506:
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            r6 = r19
            java.lang.String r3 = r3.getString(r6)     // Catch:{ all -> 0x0c4e }
            if (r3 == 0) goto L_0x051d
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = r3.getString(r6)     // Catch:{ all -> 0x0c4e }
            r2.put(r6, r3)     // Catch:{ all -> 0x0c4e }
        L_0x051d:
            java.lang.String r3 = "currencyCode"
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = r6.getString(r3)     // Catch:{ all -> 0x0c4e }
            if (r3 == 0) goto L_0x054b
            int r6 = r3.length()     // Catch:{ all -> 0x0c4e }
            r8 = 3
            if (r6 == r8) goto L_0x0546
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4e }
            java.lang.String r8 = "WARNING: currency code should be 3 characters!!! '"
            r6.<init>(r8)     // Catch:{ all -> 0x0c4e }
            r6.append(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r8 = "' is not a legal value."
            r6.append(r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0c4e }
            com.appsflyer.AFLogger.afWarnLog(r6)     // Catch:{ all -> 0x0c4e }
        L_0x0546:
            java.lang.String r6 = "currency"
            r2.put(r6, r3)     // Catch:{ all -> 0x0c4e }
        L_0x054b:
            java.lang.String r3 = "IS_UPDATE"
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = r6.getString(r3)     // Catch:{ all -> 0x0c4e }
            if (r3 == 0) goto L_0x055c
            java.lang.String r6 = "isUpdate"
            r2.put(r6, r3)     // Catch:{ all -> 0x0c4e }
        L_0x055c:
            boolean r3 = r1.isPreInstalledApp(r11)     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = "af_preinstalled"
            java.lang.String r3 = java.lang.Boolean.toString(r3)     // Catch:{ all -> 0x0c4e }
            r2.put(r6, r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = "collectFacebookAttrId"
            r6 = 1
            boolean r3 = r5.getBoolean(r3, r6)     // Catch:{ all -> 0x0c4e }
            if (r3 == 0) goto L_0x0597
            android.content.pm.PackageManager r3 = r11.getPackageManager()     // Catch:{ NameNotFoundException -> 0x058a, all -> 0x0581 }
            java.lang.String r6 = "com.facebook.katana"
            r8 = 0
            r3.getApplicationInfo(r6, r8)     // Catch:{ NameNotFoundException -> 0x058a, all -> 0x0581 }
            java.lang.String r3 = r1.getAttributionId(r11)     // Catch:{ NameNotFoundException -> 0x058a, all -> 0x0581 }
            goto L_0x0590
        L_0x0581:
            r0 = move-exception
            r3 = r0
            java.lang.String r6 = "Exception while collecting facebook's attribution ID. "
            com.appsflyer.AFLogger.afErrorLog(r6, r3)     // Catch:{ all -> 0x0c4e }
        L_0x0588:
            r3 = 0
            goto L_0x0590
        L_0x058a:
            java.lang.String r3 = "Exception while collecting facebook's attribution ID. "
            com.appsflyer.AFLogger.afWarnLog(r3)     // Catch:{ all -> 0x0c4e }
            goto L_0x0588
        L_0x0590:
            if (r3 == 0) goto L_0x0597
            java.lang.String r6 = "fb"
            r2.put(r6, r3)     // Catch:{ all -> 0x0c4e }
        L_0x0597:
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = "deviceTrackingDisabled"
            r8 = 0
            boolean r6 = r3.getBoolean(r6, r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r8 = "true"
            if (r6 == 0) goto L_0x05b2
            java.lang.String r3 = "deviceTrackingDisabled"
            r2.put(r3, r8)     // Catch:{ all -> 0x0c4e }
            r19 = r4
            r30 = r5
            goto L_0x0734
        L_0x05b2:
            android.content.Context r6 = r11.getApplicationContext()     // Catch:{ all -> 0x0c4e }
            r9 = 0
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r12, r9)     // Catch:{ all -> 0x0c4e }
            java.lang.String r9 = "collectIMEI"
            r10 = 1
            boolean r9 = r3.getBoolean(r9, r10)     // Catch:{ all -> 0x0c4e }
            java.lang.String r10 = "imeiCached"
            r13 = 0
            java.lang.String r10 = r6.getString(r10, r13)     // Catch:{ all -> 0x0c4e }
            if (r9 == 0) goto L_0x0651
            java.lang.String r9 = r1.f8599     // Catch:{ all -> 0x0c4e }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0c4e }
            if (r9 == 0) goto L_0x0651
            boolean r9 = m1196((android.content.Context) r11)     // Catch:{ all -> 0x0c4e }
            if (r9 == 0) goto L_0x064c
            java.lang.String r9 = "phone"
            java.lang.Object r9 = r11.getSystemService(r9)     // Catch:{ InvocationTargetException -> 0x0631, Exception -> 0x0614 }
            android.telephony.TelephonyManager r9 = (android.telephony.TelephonyManager) r9     // Catch:{ InvocationTargetException -> 0x0631, Exception -> 0x0614 }
            java.lang.Class r13 = r9.getClass()     // Catch:{ InvocationTargetException -> 0x0631, Exception -> 0x0614 }
            java.lang.String r15 = "getDeviceId"
            r19 = r4
            r30 = r5
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ InvocationTargetException -> 0x0635, Exception -> 0x0612 }
            java.lang.reflect.Method r5 = r13.getMethod(r15, r5)     // Catch:{ InvocationTargetException -> 0x0635, Exception -> 0x0612 }
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ InvocationTargetException -> 0x0635, Exception -> 0x0612 }
            java.lang.Object r4 = r5.invoke(r9, r13)     // Catch:{ InvocationTargetException -> 0x0635, Exception -> 0x0612 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ InvocationTargetException -> 0x0635, Exception -> 0x0612 }
            if (r4 == 0) goto L_0x05fe
            goto L_0x065b
        L_0x05fe:
            if (r10 == 0) goto L_0x065d
            java.lang.String r4 = java.lang.String.valueOf(r10)     // Catch:{ InvocationTargetException -> 0x0635, Exception -> 0x0612 }
            r5 = r18
            java.lang.String r4 = r5.concat(r4)     // Catch:{ InvocationTargetException -> 0x0610, Exception -> 0x060e }
            com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ InvocationTargetException -> 0x0610, Exception -> 0x060e }
            goto L_0x065e
        L_0x060e:
            r0 = move-exception
            goto L_0x061b
        L_0x0610:
            goto L_0x0637
        L_0x0612:
            r0 = move-exception
            goto L_0x0619
        L_0x0614:
            r0 = move-exception
            r19 = r4
            r30 = r5
        L_0x0619:
            r5 = r18
        L_0x061b:
            r4 = r0
            if (r10 == 0) goto L_0x062a
            java.lang.String r9 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0c4e }
            java.lang.String r5 = r5.concat(r9)     // Catch:{ all -> 0x0c4e }
            com.appsflyer.AFLogger.afDebugLog(r5)     // Catch:{ all -> 0x0c4e }
            goto L_0x062b
        L_0x062a:
            r10 = 0
        L_0x062b:
            java.lang.String r5 = "WARNING: other reason: "
            com.appsflyer.AFLogger.afErrorLog(r5, r4)     // Catch:{ all -> 0x0c4e }
            goto L_0x065e
        L_0x0631:
            r19 = r4
            r30 = r5
        L_0x0635:
            r5 = r18
        L_0x0637:
            if (r10 == 0) goto L_0x0645
            java.lang.String r4 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = r5.concat(r4)     // Catch:{ all -> 0x0c4e }
            com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ all -> 0x0c4e }
            goto L_0x0646
        L_0x0645:
            r10 = 0
        L_0x0646:
            java.lang.String r4 = "WARNING: READ_PHONE_STATE is missing."
            com.appsflyer.AFLogger.afWarnLog(r4)     // Catch:{ all -> 0x0c4e }
            goto L_0x065e
        L_0x064c:
            r19 = r4
            r30 = r5
            goto L_0x065d
        L_0x0651:
            r19 = r4
            r30 = r5
            java.lang.String r4 = r1.f8599     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x065d
            java.lang.String r4 = r1.f8599     // Catch:{ all -> 0x0c4e }
        L_0x065b:
            r10 = r4
            goto L_0x065e
        L_0x065d:
            r10 = 0
        L_0x065e:
            if (r10 == 0) goto L_0x066b
            java.lang.String r4 = "imeiCached"
            m1174(r11, r4, r10)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "imei"
            r2.put(r4, r10)     // Catch:{ all -> 0x0c4e }
            goto L_0x0670
        L_0x066b:
            java.lang.String r4 = "IMEI was not collected."
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x0c4e }
        L_0x0670:
            java.lang.String r4 = "collectAndroidId"
            r5 = 1
            boolean r4 = r3.getBoolean(r4, r5)     // Catch:{ all -> 0x0c4e }
            java.lang.String r5 = "androidIdCached"
            r9 = 0
            java.lang.String r5 = r6.getString(r5, r9)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x06cb
            java.lang.String r4 = r1.f8603     // Catch:{ all -> 0x0c4e }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x06cb
            boolean r4 = m1196((android.content.Context) r11)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x06d2
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch:{ Exception -> 0x06ae }
            java.lang.String r6 = "android_id"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r6)     // Catch:{ Exception -> 0x06ae }
            if (r4 == 0) goto L_0x069b
            goto L_0x06d3
        L_0x069b:
            if (r5 == 0) goto L_0x06ac
            java.lang.String r4 = "use cached AndroidId: "
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x06ae }
            java.lang.String r4 = r4.concat(r6)     // Catch:{ Exception -> 0x06ae }
            com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ Exception -> 0x06ae }
            goto L_0x06c9
        L_0x06ac:
            r5 = 0
            goto L_0x06c9
        L_0x06ae:
            r0 = move-exception
            r4 = r0
            if (r5 == 0) goto L_0x06c1
            java.lang.String r6 = "use cached AndroidId: "
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = r6.concat(r9)     // Catch:{ all -> 0x0c4e }
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ all -> 0x0c4e }
            goto L_0x06c2
        L_0x06c1:
            r5 = 0
        L_0x06c2:
            java.lang.String r6 = r4.getMessage()     // Catch:{ all -> 0x0c4e }
            com.appsflyer.AFLogger.afErrorLog(r6, r4)     // Catch:{ all -> 0x0c4e }
        L_0x06c9:
            r4 = r5
            goto L_0x06d3
        L_0x06cb:
            java.lang.String r4 = r1.f8603     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x06d2
            java.lang.String r4 = r1.f8603     // Catch:{ all -> 0x0c4e }
            goto L_0x06d3
        L_0x06d2:
            r4 = 0
        L_0x06d3:
            if (r4 == 0) goto L_0x06e0
            java.lang.String r5 = "androidIdCached"
            m1174(r11, r5, r4)     // Catch:{ all -> 0x0c4e }
            java.lang.String r5 = "android_id"
            r2.put(r5, r4)     // Catch:{ all -> 0x0c4e }
            goto L_0x06e5
        L_0x06e0:
            java.lang.String r4 = "Android ID was not collected."
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x0c4e }
        L_0x06e5:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0c4e }
            r4.<init>()     // Catch:{ all -> 0x0c4e }
            java.lang.String r5 = r1.f8602     // Catch:{ all -> 0x0c4e }
            if (r5 == 0) goto L_0x06f0
            r5 = 1
            goto L_0x06f1
        L_0x06f0:
            r5 = 0
        L_0x06f1:
            if (r5 == 0) goto L_0x06f7
            java.lang.String r3 = r1.f8602     // Catch:{ all -> 0x0c4e }
            r6 = r3
            goto L_0x071e
        L_0x06f7:
            java.lang.String r6 = "collectOAID"
            r9 = 0
            boolean r3 = r3.getBoolean(r6, r9)     // Catch:{ all -> 0x0c4e }
            if (r3 == 0) goto L_0x071d
            com.appsflyer.OaidClient$Info r3 = com.appsflyer.OaidClient.fetch(r11)     // Catch:{ all -> 0x0716 }
            if (r3 == 0) goto L_0x071d
            java.lang.String r6 = r3.getId()     // Catch:{ all -> 0x0716 }
            java.lang.Boolean r3 = r3.isLat()     // Catch:{ all -> 0x0717 }
            if (r3 == 0) goto L_0x071e
            java.lang.String r9 = "isLat"
            r4.put(r9, r3)     // Catch:{ all -> 0x0717 }
            goto L_0x071e
        L_0x0716:
            r6 = 0
        L_0x0717:
            java.lang.String r3 = "No OAID library"
            com.appsflyer.AFLogger.afDebugLog(r3)     // Catch:{ all -> 0x0c4e }
            goto L_0x071e
        L_0x071d:
            r6 = 0
        L_0x071e:
            if (r6 == 0) goto L_0x0734
            java.lang.String r3 = "isManual"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0c4e }
            r4.put(r3, r5)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = "val"
            r4.put(r3, r6)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = "oaid"
            r2.put(r3, r4)     // Catch:{ all -> 0x0c4e }
        L_0x0734:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x0747 }
            r3.<init>(r11)     // Catch:{ Exception -> 0x0747 }
            java.lang.String r3 = com.appsflyer.internal.ag.m1231(r3)     // Catch:{ Exception -> 0x0747 }
            r4 = r17
            if (r3 == 0) goto L_0x0760
            r2.put(r4, r3)     // Catch:{ Exception -> 0x0745 }
            goto L_0x0760
        L_0x0745:
            r0 = move-exception
            goto L_0x074a
        L_0x0747:
            r0 = move-exception
            r4 = r17
        L_0x074a:
            r3 = r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = "ERROR: could not get uid "
            r5.<init>(r6)     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = r3.getMessage()     // Catch:{ all -> 0x0c4e }
            r5.append(r6)     // Catch:{ all -> 0x0c4e }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0c4e }
            com.appsflyer.AFLogger.afErrorLog(r5, r3)     // Catch:{ all -> 0x0c4e }
        L_0x0760:
            java.lang.String r3 = "lang"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x076e }
            java.lang.String r5 = r5.getDisplayLanguage()     // Catch:{ Exception -> 0x076e }
            r2.put(r3, r5)     // Catch:{ Exception -> 0x076e }
            goto L_0x0775
        L_0x076e:
            r0 = move-exception
            r3 = r0
            java.lang.String r5 = "Exception while collecting display language name. "
            com.appsflyer.AFLogger.afErrorLog(r5, r3)     // Catch:{ all -> 0x0c4e }
        L_0x0775:
            java.lang.String r3 = "lang_code"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0783 }
            java.lang.String r5 = r5.getLanguage()     // Catch:{ Exception -> 0x0783 }
            r2.put(r3, r5)     // Catch:{ Exception -> 0x0783 }
            goto L_0x078a
        L_0x0783:
            r0 = move-exception
            r3 = r0
            java.lang.String r5 = "Exception while collecting display language code. "
            com.appsflyer.AFLogger.afErrorLog(r5, r3)     // Catch:{ all -> 0x0c4e }
        L_0x078a:
            java.lang.String r3 = "country"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0798 }
            java.lang.String r5 = r5.getCountry()     // Catch:{ Exception -> 0x0798 }
            r2.put(r3, r5)     // Catch:{ Exception -> 0x0798 }
            goto L_0x079f
        L_0x0798:
            r0 = move-exception
            r3 = r0
            java.lang.String r5 = "Exception while collecting country name. "
            com.appsflyer.AFLogger.afErrorLog(r5, r3)     // Catch:{ all -> 0x0c4e }
        L_0x079f:
            java.lang.String r3 = "platformextension"
            com.appsflyer.internal.ae r5 = r1.f8591     // Catch:{ all -> 0x0c4e }
            java.lang.String r5 = r5.m1222()     // Catch:{ all -> 0x0c4e }
            r2.put(r3, r5)     // Catch:{ all -> 0x0c4e }
            m1167((android.content.Context) r11, (java.util.Map<java.lang.String, ? super java.lang.String>) r2)     // Catch:{ all -> 0x0c4e }
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0c4e }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ all -> 0x0c4e }
            r6 = r16
            r3.<init>(r6, r5)     // Catch:{ all -> 0x0c4e }
            android.content.pm.PackageManager r5 = r11.getPackageManager()     // Catch:{ Exception -> 0x07dd }
            java.lang.String r9 = r11.getPackageName()     // Catch:{ Exception -> 0x07dd }
            r10 = 0
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r9, r10)     // Catch:{ Exception -> 0x07dd }
            long r9 = r5.firstInstallTime     // Catch:{ Exception -> 0x07dd }
            java.lang.String r5 = "installDate"
            java.lang.String r13 = "UTC"
            java.util.TimeZone r13 = java.util.TimeZone.getTimeZone(r13)     // Catch:{ Exception -> 0x07dd }
            r3.setTimeZone(r13)     // Catch:{ Exception -> 0x07dd }
            java.util.Date r13 = new java.util.Date     // Catch:{ Exception -> 0x07dd }
            r13.<init>(r9)     // Catch:{ Exception -> 0x07dd }
            java.lang.String r9 = r3.format(r13)     // Catch:{ Exception -> 0x07dd }
            r2.put(r5, r9)     // Catch:{ Exception -> 0x07dd }
            goto L_0x07e4
        L_0x07dd:
            r0 = move-exception
            r5 = r0
            java.lang.String r9 = "Exception while collecting install date. "
            com.appsflyer.AFLogger.afErrorLog(r9, r5)     // Catch:{ all -> 0x0c4e }
        L_0x07e4:
            android.content.pm.PackageManager r5 = r11.getPackageManager()     // Catch:{ all -> 0x087a }
            java.lang.String r9 = r11.getPackageName()     // Catch:{ all -> 0x087a }
            r10 = 0
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r9, r10)     // Catch:{ all -> 0x087a }
            java.lang.String r9 = "versionCode"
            r13 = r29
            int r9 = r13.getInt(r9, r10)     // Catch:{ all -> 0x0874 }
            int r10 = r5.versionCode     // Catch:{ all -> 0x0874 }
            if (r10 <= r9) goto L_0x0822
            java.lang.String r9 = "versionCode"
            int r10 = r5.versionCode     // Catch:{ all -> 0x081b }
            android.content.Context r15 = r11.getApplicationContext()     // Catch:{ all -> 0x081b }
            r17 = r4
            r4 = 0
            android.content.SharedPreferences r12 = r15.getSharedPreferences(r12, r4)     // Catch:{ all -> 0x0819 }
            android.content.SharedPreferences$Editor r4 = r12.edit()     // Catch:{ all -> 0x0819 }
            r4.putInt(r9, r10)     // Catch:{ all -> 0x0819 }
            r4.apply()     // Catch:{ all -> 0x0819 }
            goto L_0x0824
        L_0x0819:
            r0 = move-exception
            goto L_0x081e
        L_0x081b:
            r0 = move-exception
            r17 = r4
        L_0x081e:
            r3 = r0
            r16 = r14
            goto L_0x0882
        L_0x0822:
            r17 = r4
        L_0x0824:
            java.lang.String r4 = "app_version_code"
            int r9 = r5.versionCode     // Catch:{ all -> 0x0872 }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x0872 }
            r2.put(r4, r9)     // Catch:{ all -> 0x0872 }
            java.lang.String r4 = "app_version_name"
            java.lang.String r9 = r5.versionName     // Catch:{ all -> 0x0872 }
            r2.put(r4, r9)     // Catch:{ all -> 0x0872 }
            long r9 = r5.firstInstallTime     // Catch:{ all -> 0x0872 }
            long r4 = r5.lastUpdateTime     // Catch:{ all -> 0x0872 }
            java.lang.String r12 = "date1"
            java.text.SimpleDateFormat r15 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0872 }
            r16 = r14
            java.util.Locale r14 = java.util.Locale.US     // Catch:{ all -> 0x0870 }
            r15.<init>(r6, r14)     // Catch:{ all -> 0x0870 }
            java.util.Date r14 = new java.util.Date     // Catch:{ all -> 0x0870 }
            r14.<init>(r9)     // Catch:{ all -> 0x0870 }
            java.lang.String r9 = r15.format(r14)     // Catch:{ all -> 0x0870 }
            r2.put(r12, r9)     // Catch:{ all -> 0x0870 }
            java.lang.String r9 = "date2"
            java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0870 }
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ all -> 0x0870 }
            r10.<init>(r6, r12)     // Catch:{ all -> 0x0870 }
            java.util.Date r6 = new java.util.Date     // Catch:{ all -> 0x0870 }
            r6.<init>(r4)     // Catch:{ all -> 0x0870 }
            java.lang.String r4 = r10.format(r6)     // Catch:{ all -> 0x0870 }
            r2.put(r9, r4)     // Catch:{ all -> 0x0870 }
            java.lang.String r3 = m1156((java.text.SimpleDateFormat) r3, (android.content.Context) r11)     // Catch:{ all -> 0x0870 }
            java.lang.String r4 = "firstLaunchDate"
            r2.put(r4, r3)     // Catch:{ all -> 0x0870 }
            goto L_0x0887
        L_0x0870:
            r0 = move-exception
            goto L_0x0881
        L_0x0872:
            r0 = move-exception
            goto L_0x0877
        L_0x0874:
            r0 = move-exception
            r17 = r4
        L_0x0877:
            r16 = r14
            goto L_0x0881
        L_0x087a:
            r0 = move-exception
            r17 = r4
            r16 = r14
            r13 = r29
        L_0x0881:
            r3 = r0
        L_0x0882:
            java.lang.String r4 = "Exception while collecting app version data "
            com.appsflyer.AFLogger.afErrorLog(r4, r3)     // Catch:{ all -> 0x0c4e }
        L_0x0887:
            boolean r3 = com.appsflyer.internal.r.AnonymousClass3.m1283(r11)     // Catch:{ all -> 0x0c4e }
            r1.f8590 = r3     // Catch:{ all -> 0x0c4e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "didConfigureTokenRefreshService="
            r3.<init>(r4)     // Catch:{ all -> 0x0c4e }
            boolean r4 = r1.f8590     // Catch:{ all -> 0x0c4e }
            r3.append(r4)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0c4e }
            com.appsflyer.AFLogger.afDebugLog(r3)     // Catch:{ all -> 0x0c4e }
            boolean r3 = r1.f8590     // Catch:{ all -> 0x0c4e }
            if (r3 != 0) goto L_0x08ac
            java.lang.String r3 = "tokenRefreshConfigured"
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0c4e }
            r2.put(r3, r4)     // Catch:{ all -> 0x0c4e }
        L_0x08ac:
            if (r27 == 0) goto L_0x08da
            com.appsflyer.internal.f r3 = com.appsflyer.internal.f.m1271()     // Catch:{ all -> 0x0c4e }
            r4 = r22
            r3.m1274(r4, r11, r2)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = r1.f8588     // Catch:{ all -> 0x0c4e }
            if (r3 == 0) goto L_0x08d0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = r1.f8588     // Catch:{ all -> 0x0c4e }
            r3.<init>(r4)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "isPush"
            r3.put(r4, r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "af_deeplink"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0c4e }
            r2.put(r4, r3)     // Catch:{ all -> 0x0c4e }
        L_0x08d0:
            r3 = 0
            r1.f8588 = r3     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = "open_referrer"
            r4 = r33
            r2.put(r3, r4)     // Catch:{ all -> 0x0c4e }
        L_0x08da:
            java.lang.String r3 = "sensors"
            if (r27 != 0) goto L_0x091e
            com.appsflyer.internal.w r4 = com.appsflyer.internal.w.m1292((android.content.Context) r11)     // Catch:{ Exception -> 0x0907 }
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x0907 }
            r5.<init>()     // Catch:{ Exception -> 0x0907 }
            java.util.List r4 = r4.m1295()     // Catch:{ Exception -> 0x0907 }
            boolean r6 = r4.isEmpty()     // Catch:{ Exception -> 0x0907 }
            if (r6 != 0) goto L_0x08fe
            com.appsflyer.internal.g r6 = new com.appsflyer.internal.g     // Catch:{ Exception -> 0x0907 }
            r6.<init>()     // Catch:{ Exception -> 0x0907 }
            java.util.Map r4 = com.appsflyer.internal.g.m1277((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) r4)     // Catch:{ Exception -> 0x0907 }
            r5.put(r3, r4)     // Catch:{ Exception -> 0x0907 }
            goto L_0x0903
        L_0x08fe:
            java.lang.String r4 = "na"
            r5.put(r3, r4)     // Catch:{ Exception -> 0x0907 }
        L_0x0903:
            r2.putAll(r5)     // Catch:{ Exception -> 0x0907 }
            goto L_0x091e
        L_0x0907:
            r0 = move-exception
            r4 = r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = "Unexpected exception from AFSensorManager: "
            r5.<init>(r6)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0c4e }
            r5.append(r4)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0c4e }
            com.appsflyer.AFLogger.afRDLog(r4)     // Catch:{ all -> 0x0c4e }
        L_0x091e:
            boolean r4 = r1.f8586     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x0939
            java.lang.String r4 = "testAppMode_retargeting"
            r2.put(r4, r8)     // Catch:{ all -> 0x0c4e }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0c4e }
            r4.<init>(r2)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0c4e }
            m1173((android.content.Context) r11, (java.lang.String) r4)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "Sent retargeting params to test app"
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x0c4e }
        L_0x0939:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0c4e }
            long r9 = r1.f8585     // Catch:{ all -> 0x0c4e }
            long r4 = r4 - r9
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = r6.getReferrer(r11)     // Catch:{ all -> 0x0c4e }
            r9 = 30000(0x7530, double:1.4822E-319)
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x095a
            if (r6 == 0) goto L_0x095a
            java.lang.String r4 = "AppsFlyer_Test"
            boolean r4 = r6.contains(r4)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x095a
            r4 = 1
            goto L_0x095b
        L_0x095a:
            r4 = 0
        L_0x095b:
            if (r4 == 0) goto L_0x097d
            java.lang.String r4 = "testAppMode"
            r2.put(r4, r8)     // Catch:{ all -> 0x0c4e }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0c4e }
            r4.<init>(r2)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0c4e }
            m1173((android.content.Context) r11, (java.lang.String) r4)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "Sent params to test app"
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "Test mode ended!"
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x0c4e }
            r4 = 0
            r1.f8585 = r4     // Catch:{ all -> 0x0c4e }
        L_0x097d:
            java.lang.String r4 = "advertiserId"
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = r5.getString(r4)     // Catch:{ all -> 0x0c4e }
            if (r4 != 0) goto L_0x09a5
            com.appsflyer.internal.aa.m1217(r11, r2)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "advertiserId"
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = r5.getString(r4)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x099e
            java.lang.String r4 = "GAID_retry"
            r2.put(r4, r8)     // Catch:{ all -> 0x0c4e }
            goto L_0x09a5
        L_0x099e:
            java.lang.String r4 = "GAID_retry"
            java.lang.String r5 = "false"
            r2.put(r4, r5)     // Catch:{ all -> 0x0c4e }
        L_0x09a5:
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch:{ all -> 0x0c4e }
            com.appsflyer.internal.x r4 = com.appsflyer.internal.aa.m1216(r4)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x09c1
            java.lang.String r5 = "amazon_aid"
            java.lang.String r6 = r4.f8805     // Catch:{ all -> 0x0c4e }
            r2.put(r5, r6)     // Catch:{ all -> 0x0c4e }
            java.lang.String r5 = "amazon_aid_limit"
            boolean r4 = r4.f8804     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0c4e }
            r2.put(r5, r4)     // Catch:{ all -> 0x0c4e }
        L_0x09c1:
            java.lang.String r4 = "sentRegisterRequestToAF"
            r5 = 0
            boolean r4 = r13.getBoolean(r4, r5)     // Catch:{ all -> 0x0c4e }
            java.lang.String r5 = "registeredUninstall"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0c4e }
            r2.put(r5, r4)     // Catch:{ all -> 0x0c4e }
            r4 = r27
            int r5 = m1161((android.content.SharedPreferences) r13, (java.lang.String) r7, (boolean) r4)     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = "counter"
            java.lang.String r7 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x0c4e }
            r2.put(r6, r7)     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = "iaecounter"
            if (r16 == 0) goto L_0x09e6
            r7 = 1
            goto L_0x09e7
        L_0x09e6:
            r7 = 0
        L_0x09e7:
            java.lang.String r8 = "appsFlyerInAppEventCount"
            int r7 = m1161((android.content.SharedPreferences) r13, (java.lang.String) r8, (boolean) r7)     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0c4e }
            r2.put(r6, r7)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x0a16
            r6 = 1
            if (r5 != r6) goto L_0x0a16
            r30.setFirstLaunchCalled()     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = "waitForCustomerId"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c4e }
            r8 = 0
            boolean r6 = r7.getBoolean(r6, r8)     // Catch:{ all -> 0x0c4e }
            if (r6 == 0) goto L_0x0a16
            java.lang.String r6 = "wait_cid"
            r7 = 1
            java.lang.String r8 = java.lang.Boolean.toString(r7)     // Catch:{ all -> 0x0c4e }
            r2.put(r6, r8)     // Catch:{ all -> 0x0c4e }
            goto L_0x0a17
        L_0x0a16:
            r7 = 1
        L_0x0a17:
            java.lang.String r6 = "isFirstCall"
            java.lang.String r8 = "sentSuccessfully"
            r9 = 0
            java.lang.String r8 = r13.getString(r8, r9)     // Catch:{ all -> 0x0c4e }
            boolean r8 = java.lang.Boolean.parseBoolean(r8)     // Catch:{ all -> 0x0c4e }
            if (r8 != 0) goto L_0x0a27
            goto L_0x0a28
        L_0x0a27:
            r7 = 0
        L_0x0a28:
            java.lang.String r7 = java.lang.Boolean.toString(r7)     // Catch:{ all -> 0x0c4e }
            r2.put(r6, r7)     // Catch:{ all -> 0x0c4e }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0c4e }
            r6.<init>()     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = "cpu_abi"
            java.lang.String r8 = "ro.product.cpu.abi"
            java.lang.String r8 = m1163((java.lang.String) r8)     // Catch:{ all -> 0x0c4e }
            r6.put(r7, r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = "cpu_abi2"
            java.lang.String r8 = "ro.product.cpu.abi2"
            java.lang.String r8 = m1163((java.lang.String) r8)     // Catch:{ all -> 0x0c4e }
            r6.put(r7, r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = "arch"
            java.lang.String r8 = "os.arch"
            java.lang.String r8 = m1163((java.lang.String) r8)     // Catch:{ all -> 0x0c4e }
            r6.put(r7, r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = "build_display_id"
            java.lang.String r8 = "ro.build.display.id"
            java.lang.String r8 = m1163((java.lang.String) r8)     // Catch:{ all -> 0x0c4e }
            r6.put(r7, r8)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x0aed
            boolean r4 = r1.f8583     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x0aa7
            com.appsflyer.internal.q r4 = com.appsflyer.internal.q.a.f8772     // Catch:{ all -> 0x0c4e }
            android.location.Location r4 = com.appsflyer.internal.q.m1280(r11)     // Catch:{ all -> 0x0c4e }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0c4e }
            r8 = 3
            r7.<init>(r8)     // Catch:{ all -> 0x0c4e }
            if (r4 == 0) goto L_0x0a9c
            java.lang.String r8 = "lat"
            double r9 = r4.getLatitude()     // Catch:{ all -> 0x0c4e }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0c4e }
            r7.put(r8, r9)     // Catch:{ all -> 0x0c4e }
            java.lang.String r8 = "lon"
            double r9 = r4.getLongitude()     // Catch:{ all -> 0x0c4e }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0c4e }
            r7.put(r8, r9)     // Catch:{ all -> 0x0c4e }
            java.lang.String r8 = "ts"
            long r9 = r4.getTime()     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0c4e }
            r7.put(r8, r4)     // Catch:{ all -> 0x0c4e }
        L_0x0a9c:
            boolean r4 = r7.isEmpty()     // Catch:{ all -> 0x0c4e }
            if (r4 != 0) goto L_0x0aa7
            java.lang.String r4 = "loc"
            r6.put(r4, r7)     // Catch:{ all -> 0x0c4e }
        L_0x0aa7:
            com.appsflyer.internal.b r4 = com.appsflyer.internal.b.d.f8727     // Catch:{ all -> 0x0c4e }
            com.appsflyer.internal.b$a r4 = r4.m1254(r11)     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = "btl"
            float r8 = r4.f8725     // Catch:{ all -> 0x0c4e }
            java.lang.String r8 = java.lang.Float.toString(r8)     // Catch:{ all -> 0x0c4e }
            r6.put(r7, r8)     // Catch:{ all -> 0x0c4e }
            java.lang.String r7 = r4.f8726     // Catch:{ all -> 0x0c4e }
            if (r7 == 0) goto L_0x0ac3
            java.lang.String r7 = "btch"
            java.lang.String r4 = r4.f8726     // Catch:{ all -> 0x0c4e }
            r6.put(r7, r4)     // Catch:{ all -> 0x0c4e }
        L_0x0ac3:
            r4 = 2
            if (r5 > r4) goto L_0x0aed
            com.appsflyer.internal.w r4 = com.appsflyer.internal.w.m1292((android.content.Context) r11)     // Catch:{ all -> 0x0c4e }
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0c4e }
            r5.<init>()     // Catch:{ all -> 0x0c4e }
            java.util.List r7 = r4.m1296()     // Catch:{ all -> 0x0c4e }
            boolean r8 = r7.isEmpty()     // Catch:{ all -> 0x0c4e }
            if (r8 != 0) goto L_0x0add
            r5.put(r3, r7)     // Catch:{ all -> 0x0c4e }
            goto L_0x0aea
        L_0x0add:
            java.util.List r4 = r4.m1295()     // Catch:{ all -> 0x0c4e }
            boolean r7 = r4.isEmpty()     // Catch:{ all -> 0x0c4e }
            if (r7 != 0) goto L_0x0aea
            r5.put(r3, r4)     // Catch:{ all -> 0x0c4e }
        L_0x0aea:
            r6.putAll(r5)     // Catch:{ all -> 0x0c4e }
        L_0x0aed:
            java.util.Map r3 = com.appsflyer.AFExecutor.AnonymousClass5.m1119(r11)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "dim"
            r6.put(r4, r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = "deviceData"
            r2.put(r3, r6)     // Catch:{ all -> 0x0c4e }
            com.appsflyer.internal.af r3 = new com.appsflyer.internal.af     // Catch:{ all -> 0x0c4e }
            r3.<init>()     // Catch:{ all -> 0x0c4e }
            r3 = r19
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0c4e }
            r5 = r28
            java.lang.Object r6 = r2.get(r5)     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0c4e }
            r7 = r17
            java.lang.Object r8 = r2.get(r7)     // Catch:{ all -> 0x0c4e }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0c4e }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4e }
            r9.<init>()     // Catch:{ all -> 0x0c4e }
            r10 = 7
            r12 = 0
            java.lang.String r4 = r4.substring(r12, r10)     // Catch:{ all -> 0x0c4e }
            r9.append(r4)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = r8.substring(r12, r10)     // Catch:{ all -> 0x0c4e }
            r9.append(r4)     // Catch:{ all -> 0x0c4e }
            int r4 = r6.length()     // Catch:{ all -> 0x0c4e }
            int r4 = r4 - r10
            java.lang.String r4 = r6.substring(r4)     // Catch:{ all -> 0x0c4e }
            r9.append(r4)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = r9.toString()     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = com.appsflyer.internal.af.m1229(r4)     // Catch:{ all -> 0x0c4e }
            java.lang.String r6 = "af_v"
            r2.put(r6, r4)     // Catch:{ all -> 0x0c4e }
            com.appsflyer.internal.af r4 = new com.appsflyer.internal.af     // Catch:{ all -> 0x0c4e }
            r4.<init>()     // Catch:{ all -> 0x0c4e }
            java.lang.Object r3 = r2.get(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0c4e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4e }
            r4.<init>()     // Catch:{ all -> 0x0c4e }
            r4.append(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x0c4e }
            r4.append(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0c4e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4e }
            r4.<init>()     // Catch:{ all -> 0x0c4e }
            r4.append(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.Object r3 = r2.get(r7)     // Catch:{ all -> 0x0c4e }
            r4.append(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0c4e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4e }
            r4.<init>()     // Catch:{ all -> 0x0c4e }
            r4.append(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = "installDate"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ all -> 0x0c4e }
            r4.append(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0c4e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4e }
            r4.<init>()     // Catch:{ all -> 0x0c4e }
            r4.append(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = "counter"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ all -> 0x0c4e }
            r4.append(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0c4e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4e }
            r4.<init>()     // Catch:{ all -> 0x0c4e }
            r4.append(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = "iaecounter"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ all -> 0x0c4e }
            r4.append(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = com.appsflyer.internal.af.m1227(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = com.appsflyer.internal.af.m1229(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "af_v2"
            r2.put(r4, r3)     // Catch:{ all -> 0x0c4e }
            boolean r3 = m1153(r11)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "ivc"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0c4e }
            r2.put(r4, r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = "is_stop_tracking_used"
            boolean r3 = r13.contains(r3)     // Catch:{ all -> 0x0c4e }
            if (r3 == 0) goto L_0x0be8
            java.lang.String r3 = "istu"
            java.lang.String r4 = "is_stop_tracking_used"
            r5 = 0
            boolean r4 = r13.getBoolean(r4, r5)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0c4e }
            r2.put(r3, r4)     // Catch:{ all -> 0x0c4e }
        L_0x0be8:
            java.lang.String r3 = "consumeAfDeepLink"
            r4 = r30
            java.lang.Object r3 = r4.getObject(r3)     // Catch:{ all -> 0x0c4e }
            if (r3 == 0) goto L_0x0c02
            java.lang.String r3 = "consumeAfDeepLink"
            r5 = 0
            boolean r3 = r4.getBoolean(r3, r5)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "is_dp_api"
            r2.put(r4, r3)     // Catch:{ all -> 0x0c4e }
        L_0x0c02:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0c4e }
            r3.<init>()     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "mcc"
            android.content.res.Resources r5 = r11.getResources()     // Catch:{ all -> 0x0c4e }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ all -> 0x0c4e }
            int r5 = r5.mcc     // Catch:{ all -> 0x0c4e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0c4e }
            r3.put(r4, r5)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "mnc"
            android.content.res.Resources r5 = r11.getResources()     // Catch:{ all -> 0x0c4e }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ all -> 0x0c4e }
            int r5 = r5.mnc     // Catch:{ all -> 0x0c4e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0c4e }
            r3.put(r4, r5)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = "cell"
            r2.put(r4, r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = "sig"
            com.appsflyer.internal.EventDataCollector r4 = new com.appsflyer.internal.EventDataCollector     // Catch:{ all -> 0x0c4e }
            r4.<init>(r11)     // Catch:{ all -> 0x0c4e }
            java.lang.String r4 = r4.signature()     // Catch:{ all -> 0x0c4e }
            r2.put(r3, r4)     // Catch:{ all -> 0x0c4e }
            goto L_0x0c57
        L_0x0c42:
            java.lang.String r3 = "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. "
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ all -> 0x0c4e }
            java.lang.String r3 = "AppsFlyer will not track this event."
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ all -> 0x0c4e }
            r2 = 0
            return r2
        L_0x0c4e:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = r3.getLocalizedMessage()
            com.appsflyer.AFLogger.afErrorLog(r4, r3)
        L_0x0c57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m1198(com.appsflyer.AFEvent):java.util.Map");
    }

    /* renamed from: ˎ  reason: contains not printable characters */
    private static void m1167(Context context, Map<String, ? super String> map) {
        s sVar = s.d.f8774;
        s.e r2 = s.m1286(context);
        map.put("network", r2.f8776);
        if (r2.f8777 != null) {
            map.put("operator", r2.f8777);
        }
        if (r2.f8775 != null) {
            map.put("carrier", r2.f8775);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ˋ  reason: contains not printable characters */
    public static String m1154(Context context, String str) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        if (sharedPreferences.contains("CACHED_CHANNEL")) {
            return sharedPreferences.getString("CACHED_CHANNEL", (String) null);
        }
        m1174(context, "CACHED_CHANNEL", str);
        return str;
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    private static String m1156(SimpleDateFormat simpleDateFormat, Context context) {
        String str;
        String string = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getString("appsFlyerFirstInstall", (String) null);
        if (string == null) {
            if (!context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount")) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            } else {
                str = "";
            }
            string = str;
            m1174(context, "appsFlyerFirstInstall", string);
        }
        AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
        return string;
    }

    public String getAppsFlyerUID(Context context) {
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("public_api_call", "getAppsFlyerUID", new String[0]);
        return ag.m1231(new WeakReference(context));
    }

    /* JADX WARNING: type inference failed for: r16v2, types: [java.net.URLConnection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0239 A[Catch:{ ab -> 0x0217, all -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x024a  */
    /* renamed from: ॱॱ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1193(com.appsflyer.AFEvent r21) throws java.io.IOException {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.String r2 = "is_first_launch"
            java.lang.String r3 = "appsflyerConversionDataCacheExpiration"
            java.lang.String r4 = "appsflyer-data"
            java.net.URL r5 = new java.net.URL
            java.lang.String r6 = r0.f8543
            r5.<init>(r6)
            byte[] r6 = r0.f8546
            java.lang.String r7 = r0.f8536
            java.lang.String r8 = r0.f8547
            boolean r9 = r0.f8540
            android.content.Context r10 = r0.f8537
            if (r10 == 0) goto L_0x0020
            android.content.Context r10 = r0.f8537
            goto L_0x002e
        L_0x0020:
            java.lang.ref.WeakReference<android.content.Context> r10 = r0.f8541
            if (r10 == 0) goto L_0x002d
            java.lang.ref.WeakReference<android.content.Context> r10 = r0.f8541
            java.lang.Object r10 = r10.get()
            android.content.Context r10 = (android.content.Context) r10
            goto L_0x002e
        L_0x002d:
            r10 = 0
        L_0x002e:
            com.appsflyer.AppsFlyerTrackingRequestListener r12 = r0.f8542
            if (r9 == 0) goto L_0x0038
            com.appsflyer.AppsFlyerConversionListener r15 = f8579
            if (r15 == 0) goto L_0x0038
            r15 = 1
            goto L_0x0039
        L_0x0038:
            r15 = 0
        L_0x0039:
            java.net.URLConnection r16 = r5.openConnection()     // Catch:{ all -> 0x0245 }
            java.lang.Object r16 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r16)     // Catch:{ all -> 0x0245 }
            java.net.URLConnection r16 = (java.net.URLConnection) r16     // Catch:{ all -> 0x0245 }
            r11 = r16
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ all -> 0x0245 }
            java.lang.String r14 = "POST"
            r11.setRequestMethod(r14)     // Catch:{ all -> 0x0241 }
            int r14 = r6.length     // Catch:{ all -> 0x0241 }
            java.lang.String r13 = "Content-Length"
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0241 }
            r11.setRequestProperty(r13, r14)     // Catch:{ all -> 0x0241 }
            java.lang.String r13 = "Content-Type"
            boolean r0 = r21.isEncrypt()     // Catch:{ all -> 0x0241 }
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "application/octet-stream"
            goto L_0x0066
        L_0x0061:
            r0 = move-exception
            goto L_0x0248
        L_0x0064:
            java.lang.String r0 = "application/json"
        L_0x0066:
            r11.setRequestProperty(r13, r0)     // Catch:{ all -> 0x0241 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r11.setConnectTimeout(r0)     // Catch:{ all -> 0x0241 }
            r0 = 1
            r11.setDoOutput(r0)     // Catch:{ all -> 0x0241 }
            java.io.DataOutputStream r13 = new java.io.DataOutputStream     // Catch:{ all -> 0x022a }
            java.io.OutputStream r0 = r11.getOutputStream()     // Catch:{ all -> 0x022a }
            r13.<init>(r0)     // Catch:{ all -> 0x022a }
            r13.write(r6)     // Catch:{ all -> 0x0225 }
            r13.close()     // Catch:{ all -> 0x0241 }
            int r0 = r11.getResponseCode()     // Catch:{ all -> 0x0241 }
            java.lang.String r6 = m1170((java.net.HttpURLConnection) r11)     // Catch:{ all -> 0x0241 }
            com.appsflyer.internal.am r13 = com.appsflyer.internal.am.f8691     // Catch:{ all -> 0x0241 }
            if (r13 != 0) goto L_0x0094
            com.appsflyer.internal.am r13 = new com.appsflyer.internal.am     // Catch:{ all -> 0x0061 }
            r13.<init>()     // Catch:{ all -> 0x0061 }
            com.appsflyer.internal.am.f8691 = r13     // Catch:{ all -> 0x0061 }
        L_0x0094:
            com.appsflyer.internal.am r13 = com.appsflyer.internal.am.f8691     // Catch:{ all -> 0x0241 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0241 }
            java.lang.String r14 = "server_response"
            r18 = r11
            r11 = 2
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ all -> 0x023d }
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x023d }
            r16 = 0
            r11[r16] = r19     // Catch:{ all -> 0x023d }
            r17 = 1
            r11[r17] = r6     // Catch:{ all -> 0x023d }
            r13.m1247(r14, r5, r11)     // Catch:{ all -> 0x023d }
            java.lang.String r5 = "response code: "
            java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x023d }
            java.lang.String r5 = r5.concat(r11)     // Catch:{ all -> 0x023d }
            com.appsflyer.AFLogger.afInfoLog(r5)     // Catch:{ all -> 0x023d }
            android.content.Context r5 = r10.getApplicationContext()     // Catch:{ all -> 0x023d }
            r11 = 0
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r4, r11)     // Catch:{ all -> 0x023d }
            r11 = 200(0xc8, float:2.8E-43)
            if (r0 != r11) goto L_0x015f
            if (r10 == 0) goto L_0x00d4
            if (r9 == 0) goto L_0x00d4
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x023d }
            r1.f8580 = r13     // Catch:{ all -> 0x023d }
        L_0x00d4:
            if (r12 == 0) goto L_0x00d9
            r12.onTrackingRequestSuccess()     // Catch:{ all -> 0x023d }
        L_0x00d9:
            if (r8 == 0) goto L_0x00e2
            com.appsflyer.internal.z.m1303()     // Catch:{ all -> 0x023d }
            com.appsflyer.internal.z.m1305(r8, r10)     // Catch:{ all -> 0x023d }
            goto L_0x0118
        L_0x00e2:
            java.lang.String r0 = "sentSuccessfully"
            java.lang.String r8 = "true"
            m1174(r10, r0, r8)     // Catch:{ all -> 0x023d }
            boolean r0 = r1.f8604     // Catch:{ all -> 0x023d }
            if (r0 != 0) goto L_0x0118
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x023d }
            long r11 = r1.f8597     // Catch:{ all -> 0x023d }
            long r8 = r8 - r11
            r11 = 15000(0x3a98, double:7.411E-320)
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fc
            goto L_0x0118
        L_0x00fc:
            java.util.concurrent.ScheduledExecutorService r0 = r1.f8584     // Catch:{ all -> 0x023d }
            if (r0 != 0) goto L_0x0118
            com.appsflyer.AFExecutor r0 = com.appsflyer.AFExecutor.getInstance()     // Catch:{ all -> 0x023d }
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.m1118()     // Catch:{ all -> 0x023d }
            r1.f8584 = r0     // Catch:{ all -> 0x023d }
            com.appsflyer.AppsFlyerLibCore$c r0 = new com.appsflyer.AppsFlyerLibCore$c     // Catch:{ all -> 0x023d }
            r0.<init>(r10)     // Catch:{ all -> 0x023d }
            java.util.concurrent.ScheduledExecutorService r8 = r1.f8584     // Catch:{ all -> 0x023d }
            r11 = 1
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x023d }
            m1150(r8, r0, r11, r9)     // Catch:{ all -> 0x023d }
        L_0x0118:
            java.lang.String r0 = "afUninstallToken"
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x023d }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x014a
            java.lang.String r8 = "Uninstall Token exists: "
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x023d }
            java.lang.String r8 = r8.concat(r9)     // Catch:{ all -> 0x023d }
            com.appsflyer.AFLogger.afDebugLog(r8)     // Catch:{ all -> 0x023d }
            java.lang.String r8 = "sentRegisterRequestToAF"
            r9 = 0
            boolean r8 = r5.getBoolean(r8, r9)     // Catch:{ all -> 0x023d }
            if (r8 != 0) goto L_0x014a
            java.lang.String r8 = "Resending Uninstall token to AF servers: "
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x023d }
            java.lang.String r8 = r8.concat(r9)     // Catch:{ all -> 0x023d }
            com.appsflyer.AFLogger.afDebugLog(r8)     // Catch:{ all -> 0x023d }
            com.appsflyer.internal.r.AnonymousClass3.m1282(r10, r0)     // Catch:{ all -> 0x023d }
        L_0x014a:
            android.net.Uri r0 = r1.latestDeepLink     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0151
            r8 = 0
            r1.latestDeepLink = r8     // Catch:{ all -> 0x023d }
        L_0x0151:
            org.json.JSONObject r0 = com.appsflyer.ServerConfigHandler.m1212(r6)     // Catch:{ all -> 0x023d }
            java.lang.String r6 = "send_background"
            r8 = 0
            boolean r0 = r0.optBoolean(r6, r8)     // Catch:{ all -> 0x023d }
            r1.f8606 = r0     // Catch:{ all -> 0x023d }
            goto L_0x016e
        L_0x015f:
            if (r12 == 0) goto L_0x016e
            java.lang.String r6 = "Failure: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x023d }
            java.lang.String r0 = r6.concat(r0)     // Catch:{ all -> 0x023d }
            r12.onTrackingRequestFailure(r0)     // Catch:{ all -> 0x023d }
        L_0x016e:
            r8 = 0
            long r11 = r5.getLong(r3, r8)     // Catch:{ all -> 0x023d }
            java.lang.String r0 = "attributionId"
            int r6 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x01a6
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x023d }
            long r13 = r13 - r11
            r11 = 5184000000(0x134fd9000, double:2.561236308E-314)
            int r6 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x01a6
            java.lang.String r6 = "sixtyDayConversionData"
            android.content.Context r11 = r10.getApplicationContext()     // Catch:{ all -> 0x023d }
            r12 = 0
            android.content.SharedPreferences r4 = r11.getSharedPreferences(r4, r12)     // Catch:{ all -> 0x023d }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x023d }
            r11 = 1
            r4.putBoolean(r6, r11)     // Catch:{ all -> 0x023d }
            r4.apply()     // Catch:{ all -> 0x023d }
            r4 = 0
            m1174(r10, r0, r4)     // Catch:{ all -> 0x023d }
            m1146((android.content.Context) r10, (java.lang.String) r3, (long) r8)     // Catch:{ all -> 0x023d }
        L_0x01a6:
            r3 = 0
            java.lang.String r4 = r5.getString(r0, r3)     // Catch:{ all -> 0x023d }
            if (r4 != 0) goto L_0x01c7
            if (r7 == 0) goto L_0x01c7
            if (r15 == 0) goto L_0x01c7
            com.appsflyer.AppsFlyerLibCore$a r0 = new com.appsflyer.AppsFlyerLibCore$a     // Catch:{ all -> 0x023d }
            android.content.Context r2 = r10.getApplicationContext()     // Catch:{ all -> 0x023d }
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x023d }
            r3 = 0
            r0.<init>(r1, r2, r7, r3)     // Catch:{ all -> 0x023d }
            java.util.concurrent.ScheduledExecutorService r2 = r0.f8621     // Catch:{ all -> 0x023d }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x023d }
            r4 = 10
            m1150(r2, r0, r4, r3)     // Catch:{ all -> 0x023d }
            goto L_0x021f
        L_0x01c7:
            if (r7 != 0) goto L_0x01cf
            java.lang.String r0 = "AppsFlyer dev key is missing."
            com.appsflyer.AFLogger.afWarnLog(r0)     // Catch:{ all -> 0x023d }
            goto L_0x021f
        L_0x01cf:
            if (r15 == 0) goto L_0x021f
            r3 = 0
            java.lang.String r0 = r5.getString(r0, r3)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x021f
            java.lang.String r0 = "appsFlyerCount"
            r3 = 0
            int r0 = m1161((android.content.SharedPreferences) r5, (java.lang.String) r0, (boolean) r3)     // Catch:{ all -> 0x023d }
            r3 = 1
            if (r0 <= r3) goto L_0x021f
            java.util.Map r0 = m1192((android.content.Context) r10)     // Catch:{ ab -> 0x0217 }
            if (r0 == 0) goto L_0x021f
            boolean r3 = r0.containsKey(r2)     // Catch:{ all -> 0x020e }
            if (r3 != 0) goto L_0x01f3
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x020e }
            r0.put(r2, r3)     // Catch:{ all -> 0x020e }
        L_0x01f3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "Calling onConversionDataSuccess with:\n"
            r2.<init>(r3)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x020e }
            r2.append(r3)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x020e }
            com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x020e }
            com.appsflyer.AppsFlyerConversionListener r2 = f8579     // Catch:{ all -> 0x020e }
            r2.onConversionDataSuccess(r0)     // Catch:{ all -> 0x020e }
            goto L_0x021f
        L_0x020e:
            r0 = move-exception
            java.lang.String r2 = r0.getLocalizedMessage()     // Catch:{ ab -> 0x0217 }
            com.appsflyer.AFLogger.afErrorLog(r2, r0)     // Catch:{ ab -> 0x0217 }
            goto L_0x021f
        L_0x0217:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x023d }
            com.appsflyer.AFLogger.afErrorLog(r2, r0)     // Catch:{ all -> 0x023d }
        L_0x021f:
            if (r18 == 0) goto L_0x0224
            r18.disconnect()
        L_0x0224:
            return
        L_0x0225:
            r0 = move-exception
            r18 = r11
            r11 = r13
            goto L_0x022f
        L_0x022a:
            r0 = move-exception
            r18 = r11
            r3 = 0
            r11 = r3
        L_0x022f:
            if (r11 != 0) goto L_0x0239
            if (r12 == 0) goto L_0x023c
            java.lang.String r2 = "No Connectivity"
            r12.onTrackingRequestFailure(r2)     // Catch:{ all -> 0x023d }
            goto L_0x023c
        L_0x0239:
            r11.close()     // Catch:{ all -> 0x023d }
        L_0x023c:
            throw r0     // Catch:{ all -> 0x023d }
        L_0x023d:
            r0 = move-exception
            r11 = r18
            goto L_0x0248
        L_0x0241:
            r0 = move-exception
            r18 = r11
            goto L_0x0248
        L_0x0245:
            r0 = move-exception
            r3 = 0
            r11 = r3
        L_0x0248:
            if (r11 == 0) goto L_0x024d
            r11.disconnect()
        L_0x024d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m1193(com.appsflyer.AFEvent):void");
    }

    public void validateAndTrackInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Context context2 = context;
        String str6 = str3;
        String str7 = str4;
        String str8 = str5;
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am amVar = am.f8691;
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str6;
        strArr[3] = str7;
        strArr[4] = str8;
        strArr[5] = map == null ? "" : map.toString();
        amVar.m1247("public_api_call", "validateAndTrackInAppPurchase", strArr);
        if (!isTrackingStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str6);
            sb.append(" ");
            sb.append(str7);
            sb.append(" ");
            sb.append(str8);
            AFLogger.afInfoLog(sb.toString());
        }
        if (str == null || str7 == null || str2 == null || str8 == null || str6 == null) {
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = f8577;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return;
            }
            return;
        }
        m1150(AFExecutor.getInstance().m1118(), new u(context.getApplicationContext(), AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY), str, str2, str3, str4, str5, map, context2 instanceof Activity ? ((Activity) context2).getIntent() : null), 10, TimeUnit.MILLISECONDS);
    }

    public void setHost(String str, String str2) {
        if (str != null) {
            AppsFlyerProperties.getInstance().set("custom_host_prefix", str);
        }
        if (str2 == null || str2.isEmpty()) {
            AFLogger.afWarnLog("hostName cannot be null or empty");
        } else {
            AppsFlyerProperties.getInstance().set("custom_host", str2);
        }
    }

    public String getHostName() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host");
        return string != null ? string : ServerParameters.DEFAULT_HOST;
    }

    @Deprecated
    public void setHostName(String str) {
        AppsFlyerProperties.getInstance().set("custom_host", str);
    }

    public String getHostPrefix() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host_prefix");
        return string != null ? string : "";
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    static /* synthetic */ void m1159(AppsFlyerLibCore appsFlyerLibCore, Map map) {
        Map<String, Object> map2 = appsFlyerLibCore.f8605;
        if (map2 != null && map2.size() > 0) {
            appsFlyerLibCore.m1175(new NewGPReferrer(map).context(appsFlyerLibCore.f8594));
        }
    }

    /* renamed from: ˎ  reason: contains not printable characters */
    static /* synthetic */ boolean m1168(AppsFlyerLibCore appsFlyerLibCore) {
        Map<String, Object> map = appsFlyerLibCore.f8605;
        return map != null && map.size() > 0;
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    static /* synthetic */ boolean m1160(AppsFlyerLibCore appsFlyerLibCore) {
        Map<String, Object> map = appsFlyerLibCore.f8598;
        return map != null && !map.isEmpty();
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    static /* synthetic */ void m1176(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent) throws IOException {
        String str;
        StringBuilder sb = new StringBuilder("url: ");
        sb.append(aFEvent.f8543);
        AFLogger.afInfoLog(sb.toString());
        if (aFEvent.f8547 != null) {
            str = Base64.encodeToString(aFEvent.f8546, 2);
            AFLogger.afInfoLog("cached data: ".concat(String.valueOf(str)));
        } else {
            str = new JSONObject(aFEvent.f8539).toString();
            AFFacebookDeferredDeeplink.AnonymousClass4.m1122("data: ".concat(String.valueOf(str)));
        }
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247("server_request", aFEvent.f8543, str);
        try {
            appsFlyerLibCore.m1193(aFEvent);
        } catch (IOException e) {
            AFLogger.afErrorLog("Exception in sendRequestToServer. ", e);
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.USE_HTTP_FALLBACK, false)) {
                appsFlyerLibCore.m1193(aFEvent.urlString(aFEvent.f8543.replace(GriverJSAPIPermission.PROTOCOL_HTTPS, GriverJSAPIPermission.PROTOCOL_HTTP)));
                return;
            }
            StringBuilder sb2 = new StringBuilder("failed to send requeset to server. ");
            sb2.append(e.getLocalizedMessage());
            AFLogger.afInfoLog(sb2.toString());
            throw e;
        }
    }
}
