package com.alibaba.griver.core.jsapi.device.system;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.DisplayUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.bridge.GriverAppLanguageExtension;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import io.reactivex.annotations.SchedulerSupport;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Keep
public class SystemInfoBridgeExtension implements BridgeExtension {
    private static final float DEFAULT_TEXT_SIZE = 16.0f;
    private static final String GET_SYSTEM_INFO = "getSystemInfo";
    private static final String KEY_CACHE_TIME = "time";
    private static final int SYSTEM_INFO_CACHE_TIME = 60000;
    private static final String TAG = "SystemInfoBridge";
    private boolean mBatteryBroadcastRegistered = false;
    private BatteryBroadcastReceiver mBroadcastReceiver;
    /* access modifiers changed from: private */
    public int mCachedBatteryPercentage;
    private Map<String, JSONObject> mCachedResult = new ConcurrentHashMap();

    private float getFontSizeSetting() {
        return DEFAULT_TEXT_SIZE;
    }

    public Permission permit() {
        return null;
    }

    private static String getInternalMemorySize() {
        if (Build.VERSION.SDK_INT < 18) {
            return "";
        }
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return FileUtils.formatFileSize(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            RVLogger.e(TAG, "getInternalMemorySize...", th);
            return "";
        }
    }

    public void onInitialized() {
        RVLogger.d(TAG, "onInitialized");
    }

    public void onFinalized() {
        BatteryBroadcastReceiver batteryBroadcastReceiver;
        RVLogger.d(TAG, "onFinalized");
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext != null && (batteryBroadcastReceiver = this.mBroadcastReceiver) != null) {
            applicationContext.unregisterReceiver(batteryBroadcastReceiver);
            this.mBroadcastReceiver = null;
        }
    }

    @AutoCallback
    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    public BridgeResponse getSystemInfo(@BindingNode(App.class) App app, @BindingNode(Page.class) Page page, @BindingParam(booleanDefault = true, value = {"needCache"}) boolean z) {
        App app2 = app;
        RVLogger.d(TAG, "nebulaX getSystemInfo");
        if (app2 == null) {
            RVLogger.e(TAG, "getSystemInfo app null");
            return BridgeResponse.INVALID_PARAM;
        }
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext == null) {
            RVLogger.e(TAG, "getSystemInfo getContext null");
            return BridgeResponse.INVALID_PARAM;
        }
        if (z) {
            JSONObject jSONObject = this.mCachedResult.get(GET_SYSTEM_INFO);
            long j = JSONUtils.getLong(jSONObject, "time", -1);
            if (j > 0 && System.currentTimeMillis() - j < DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS) {
                RVLogger.d(TAG, "getSystemInfo return cache cacheTime ".concat(String.valueOf(j)));
                return new BridgeResponse(jSONObject.getJSONObject("data"));
            }
        }
        JSONObject systemInfoInner = getSystemInfoInner(applicationContext, app2, page);
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
            jSONObject2.put("data", (Object) systemInfoInner);
            this.mCachedResult.put(GET_SYSTEM_INFO, jSONObject2);
        }
        StringBuilder sb = new StringBuilder("getSystemInfo  ");
        sb.append(systemInfoInner.toJSONString());
        RVLogger.e(TAG, sb.toString());
        return new BridgeResponse(systemInfoInner);
    }

    private JSONObject getSystemInfoInner(Context context, App app, Page page) {
        int i;
        float f;
        JSONObject jSONObject = new JSONObject();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Activity activity = (Activity) app.getAppContext().getContext();
        if (displayMetrics != null) {
            f = displayMetrics.density;
            i = Math.round(((float) displayMetrics.widthPixels) / f);
            jSONObject.put("screenWidth", (Object) Integer.valueOf(displayMetrics.widthPixels));
            jSONObject.put("screenHeight", (Object) Integer.valueOf(displayMetrics.heightPixels));
        } else {
            f = 0.0f;
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(" ");
        sb.append(Build.MODEL);
        jSONObject.put(H5GetLogInfoBridge.RESULT_MODEL, (Object) sb.toString());
        jSONObject.put("pixelRatio", (Object) Float.valueOf(f));
        jSONObject.put("windowWidth", (Object) Integer.valueOf(i));
        jSONObject.put("windowHeight", (Object) Integer.valueOf(getHeight(page, activity, f, displayMetrics)));
        jSONObject.put("system", (Object) Build.VERSION.RELEASE);
        jSONObject.put(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_PLATFORM, (Object) "Android");
        jSONObject.put("apiLevel", (Object) Integer.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put("storage", (Object) getInternalMemorySize());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getCurrentBatteryPercentage(context));
        sb2.append("%");
        jSONObject.put("currentBattery", (Object) sb2.toString());
        jSONObject.put(H5GetLogInfoBridge.RESULT_BRAND, (Object) Build.BRAND);
        if (page == null) {
            jSONObject.put("transparentTitle", (Object) Boolean.FALSE);
        } else {
            String string = BundleUtils.getString(page.getStartParams(), "transparentTitle");
            if (TextUtils.equals(string, "auto") || TextUtils.equals(string, RVStartParams.TRANSPARENT_TITLE_ALWAYS) || TextUtils.equals(string, SchedulerSupport.CUSTOM)) {
                jSONObject.put("transparentTitle", (Object) Boolean.TRUE);
            } else {
                jSONObject.put("transparentTitle", (Object) Boolean.FALSE);
            }
        }
        jSONObject.put("titleBarHeight", (Object) Integer.valueOf(getTitleBarHeight(activity)));
        jSONObject.put("statusBarHeight", (Object) Integer.valueOf(getStatusBarHeight(activity)));
        appendExtraSystemInfo(jSONObject);
        return jSONObject;
    }

    private void appendExtraSystemInfo(JSONObject jSONObject) {
        jSONObject.put("language", (Object) ((GriverAppLanguageExtension) RVProxy.get(GriverAppLanguageExtension.class)).getAppLanguage());
        jSONObject.put("fontSizeSetting", (Object) Float.valueOf(getFontSizeSetting()));
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        jSONObject.put("version", (Object) rVEnvironmentService != null ? rVEnvironmentService.getProductVersion() : "");
        jSONObject.put("app", (Object) GriverEnv.getAppName());
    }

    private int getHeight(Page page, Activity activity, float f, DisplayMetrics displayMetrics) {
        Render render;
        int round;
        int round2 = displayMetrics != null ? Math.round(((float) (displayMetrics.heightPixels - DisplayUtils.getTitleAndStatusBarHeight(activity))) / f) : 0;
        return (page == null || (render = page.getRender()) == null || (round = Math.round(((float) render.getView().getHeight()) / f)) <= 0) ? round2 : round;
    }

    private int getTitleBarHeight(Activity activity) {
        int dip2px = DimensionUtil.dip2px(activity, 1.0f);
        return Math.round(dip2px > 0 ? (float) (DimensionUtil.dip2px(activity, 48.0f) / dip2px) : 0.0f);
    }

    private int getStatusBarHeight(Activity activity) {
        if (activity == null) {
            return 0;
        }
        int dip2px = DimensionUtil.dip2px(activity, 1.0f);
        Rect rect = new Rect();
        if (dip2px <= 0) {
            return 0;
        }
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.top > 0) {
            return rect.top / dip2px;
        }
        return 0;
    }

    private int getCurrentBatteryPercentage(Context context) {
        if (this.mBatteryBroadcastRegistered) {
            return this.mCachedBatteryPercentage;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            if (this.mBroadcastReceiver != null) {
                context.unregisterReceiver(this.mBroadcastReceiver);
                this.mBroadcastReceiver = null;
            }
            BatteryBroadcastReceiver batteryBroadcastReceiver = new BatteryBroadcastReceiver();
            this.mBroadcastReceiver = batteryBroadcastReceiver;
            Intent registerReceiver = context.registerReceiver(batteryBroadcastReceiver, intentFilter);
            this.mBatteryBroadcastRegistered = true;
            int parseBatteryPercentage = parseBatteryPercentage(registerReceiver);
            if (parseBatteryPercentage > 0) {
                this.mCachedBatteryPercentage = parseBatteryPercentage;
            }
            return this.mCachedBatteryPercentage;
        } catch (Exception e) {
            RVLogger.e("getCurrentBatteryPercentage...e=".concat(String.valueOf(e)));
            return this.mCachedBatteryPercentage;
        }
    }

    /* access modifiers changed from: private */
    public int parseBatteryPercentage(Intent intent) {
        if (!"android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            return -1;
        }
        return (intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, 0) * 100) / intent.getIntExtra("scale", 100);
    }

    class BatteryBroadcastReceiver extends BroadcastReceiver {
        private BatteryBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            int access$100 = SystemInfoBridgeExtension.this.parseBatteryPercentage(intent);
            if (access$100 > 0) {
                int unused = SystemInfoBridgeExtension.this.mCachedBatteryPercentage = access$100;
            }
            StringBuilder sb = new StringBuilder("ACTION_BATTERY_CHANGED...");
            sb.append(SystemInfoBridgeExtension.this.mCachedBatteryPercentage);
            RVLogger.d(SystemInfoBridgeExtension.TAG, sb.toString());
        }
    }
}
