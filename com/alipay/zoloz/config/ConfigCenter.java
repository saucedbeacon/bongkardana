package com.alipay.zoloz.config;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.griver.image.photo.PhotoContext;
import com.alipay.zoloz.config.util.ConfigLog;
import com.alipay.zoloz.config.util.ConfigZipUtil;
import com.alipay.zoloz.config.util.FileUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class ConfigCenter {
    public static final int ENV_ONLINE = 0;
    public static final int ENV_TEST = 1;
    public static final String TAG = "ConfigCenter";
    private static final long WAITING_CONFIG_TIME = 100;
    private static ConfigCenter sInstance;
    /* access modifiers changed from: private */
    public String assetsPath = "config";
    private String baseTargetPath;
    /* access modifiers changed from: private */
    public long configConsumeTime;
    /* access modifiers changed from: private */
    public ConfigDataParser configDataParser = new ConfigDataParser();
    private String endPath = "/zoloz_config/";
    /* access modifiers changed from: private */
    public boolean isConfigReady = false;
    private boolean isDebug = false;
    /* access modifiers changed from: private */
    public CountDownLatch lockCount = new CountDownLatch(1);
    /* access modifiers changed from: private */
    public Context mAppContext;
    private String mConfigPath;
    private String uiConfigPath;

    public static synchronized ConfigCenter getInstance() {
        ConfigCenter configCenter;
        synchronized (ConfigCenter.class) {
            if (sInstance == null) {
                sInstance = new ConfigCenter();
            }
            configCenter = sInstance;
        }
        return configCenter;
    }

    public Object getFrameworkValue(String str) {
        return this.configDataParser.getValueFromFramework(str);
    }

    public Object getFrameworkValueSync(String str) {
        if (this.isConfigReady) {
            return this.configDataParser.getValueFromFramework(str);
        }
        synchronized (this.lockCount) {
            try {
                this.lockCount.await(WAITING_CONFIG_TIME, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                ConfigLog.e(TAG, (Exception) e);
            }
        }
        return this.configDataParser.getValueFromFramework(str);
    }

    public Object getH5Value(String str) {
        if (this.isConfigReady) {
            return this.configDataParser.getValueFromH5(str);
        }
        synchronized (this.lockCount) {
            try {
                this.lockCount.await(WAITING_CONFIG_TIME, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                ConfigLog.e(TAG, (Exception) e);
            }
        }
        return this.configDataParser.getValueFromH5(str);
    }

    public String getUiConfigPath() {
        return this.uiConfigPath;
    }

    public String getFeUIConfig() {
        ConfigDataParser configDataParser2 = this.configDataParser;
        if (configDataParser2 != null) {
            return configDataParser2.getFeUIConfig();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        r1 = r2.mAppContext;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getRSAPublicKey(int r3) {
        /*
            r2 = this;
            java.util.HashMap r0 = r2.getBizConfig()
            java.lang.String r1 = "public_key"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0020
            r0 = 1
            if (r3 != r0) goto L_0x001a
            java.lang.String r0 = "public_key_t"
            java.lang.Object r0 = r2.getFrameworkValueSync(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0020
        L_0x001a:
            java.lang.Object r0 = r2.getFrameworkValueSync(r1)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0020:
            if (r0 != 0) goto L_0x002a
            android.content.Context r1 = r2.mAppContext
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = com.alipay.zoloz.config.RSAKeyParser.getPublicKey(r1, r3)
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.config.ConfigCenter.getRSAPublicKey(int):java.lang.String");
    }

    public String getRSAPublicKey() {
        Object frameworkValue = getFrameworkValue("env");
        if (frameworkValue == null) {
            frameworkValue = getFrameworkValue("ENV");
        }
        if (frameworkValue == null) {
            return getRSAPublicKey(0);
        }
        if (frameworkValue instanceof String) {
            return getRSAPublicKey(Integer.parseInt((String) frameworkValue));
        }
        if (frameworkValue instanceof Integer) {
            return getRSAPublicKey(((Integer) frameworkValue).intValue());
        }
        return getRSAPublicKey(0);
    }

    public void init(Context context, final String str, final IConfigCenterCallback iConfigCenterCallback) {
        this.mAppContext = context.getApplicationContext();
        this.mConfigPath = str;
        synchronized (this) {
            if (!this.isConfigReady) {
                new Thread(new Runnable() {
                    public void run() {
                        synchronized (ConfigCenter.this) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            ConfigCenter.this.deleteOldCache();
                            if (!TextUtils.isEmpty(str)) {
                                if (!str.contains("/")) {
                                    if (!str.contains(PhotoContext.FILE_SCHEME)) {
                                        String unused = ConfigCenter.this.assetsPath = str;
                                        boolean unused2 = ConfigCenter.this.unZipConfigByAssets(ConfigCenter.this.mAppContext, str);
                                    }
                                }
                                boolean unused3 = ConfigCenter.this.unzipConfigByLocalFile(ConfigCenter.this.mAppContext, str);
                            }
                            boolean unused4 = ConfigCenter.this.isConfigReady = ConfigCenter.this.configDataParser.parseAndVerifyConfig(iConfigCenterCallback);
                            long unused5 = ConfigCenter.this.configConsumeTime = SystemClock.uptimeMillis() - uptimeMillis;
                            long unused6 = ConfigCenter.this.configConsumeTime;
                            ConfigCenter.this.lockCount.countDown();
                        }
                    }
                }).start();
            } else {
                iConfigCenterCallback.onConfigSuccess();
            }
        }
    }

    /* access modifiers changed from: private */
    public void deleteOldCache() {
        if (this.baseTargetPath == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getApplicationContext().getFilesDir().getPath());
            sb.append(this.endPath);
            this.baseTargetPath = sb.toString();
        }
        FileUtil.delete(this.baseTargetPath);
    }

    public void init(Context context, IConfigCenterCallback iConfigCenterCallback) {
        init(context, (String) null, iConfigCenterCallback);
    }

    public String getBaseTargetPath() {
        return this.baseTargetPath;
    }

    public void addAll(HashMap hashMap) {
        this.configDataParser.addAll(hashMap);
    }

    public void add(String str, Object obj) {
        this.configDataParser.addOne(str, obj);
    }

    public void disableConfig() {
        this.isConfigReady = false;
        this.configDataParser.disable();
        this.lockCount = new CountDownLatch(1);
    }

    public void reloadConfigByPath(final String str, final IConfigCenterCallback iConfigCenterCallback) {
        this.isConfigReady = false;
        new Thread(new Runnable() {
            public void run() {
                synchronized (ConfigCenter.this) {
                    boolean unused = ConfigCenter.this.unZipConfig(str);
                    boolean unused2 = ConfigCenter.this.isConfigReady = ConfigCenter.this.configDataParser.parseAndVerifyConfig(iConfigCenterCallback);
                    ConfigCenter.this.lockCount.countDown();
                }
            }
        }).start();
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public boolean isConfigReady() {
        return this.isConfigReady;
    }

    public void setUiConfigPath(String str) {
        this.uiConfigPath = str;
    }

    /* access modifiers changed from: package-private */
    public boolean isUIConfigExist() {
        if (!TextUtils.isEmpty(this.mConfigPath)) {
            return true;
        }
        AssetManager assets = getInstance().getApplicationContext().getAssets();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(getInstance().getAssetsPath());
            sb.append("/");
            if (assets.list(sb.toString()).length > 0) {
                return true;
            }
            return false;
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: private */
    public boolean unZipConfigByAssets(Context context, String str) {
        boolean z;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-1329517236, oncanceled);
                onCancelLoad.getMin(-1329517236, oncanceled);
            }
        }
        ConfigLog.d(TAG, "unZipConfig");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        sb.append(this.endPath);
        sb.append(this.assetsPath);
        this.baseTargetPath = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir().getPath());
        sb2.append(this.endPath);
        String obj = sb2.toString();
        this.configDataParser.setBaseTargetPath(this.baseTargetPath);
        StringBuilder sb3 = new StringBuilder(" unzip base path ");
        sb3.append(this.baseTargetPath);
        ConfigLog.d(TAG, sb3.toString());
        if (str.contains(".zip")) {
            z = ConfigZipUtil.unzip(context, str, this.baseTargetPath);
        } else {
            z = ConfigZipUtil.copyAssetsToTarget(context, str, obj);
        }
        ConfigLog.d(TAG, " unzip base path ok? ".concat(String.valueOf(z)));
        this.isConfigReady = z;
        return z;
    }

    /* access modifiers changed from: private */
    public boolean unZipConfig(String str) {
        ConfigLog.d(TAG, " unZipConfig by hot reload from ".concat(String.valueOf(str)));
        boolean unzip = ConfigZipUtil.unzip(str, this.baseTargetPath);
        ConfigLog.d(TAG, " unzip base path ok? ".concat(String.valueOf(unzip)));
        this.isConfigReady = unzip;
        return unzip;
    }

    /* access modifiers changed from: private */
    public boolean unzipConfigByLocalFile(Context context, String str) {
        ConfigLog.d(TAG, "unZipConfig by local file path ".concat(String.valueOf(str)));
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        sb.append(this.endPath);
        sb.append(this.assetsPath);
        String obj = sb.toString();
        this.baseTargetPath = obj;
        this.configDataParser.setBaseTargetPath(obj);
        StringBuilder sb2 = new StringBuilder(" unzip base path ");
        sb2.append(this.baseTargetPath);
        ConfigLog.d(TAG, sb2.toString());
        boolean unzip = ConfigZipUtil.unzip(str, this.baseTargetPath);
        ConfigLog.d(TAG, " unzip base path ok? ".concat(String.valueOf(unzip)));
        this.isConfigReady = unzip;
        return unzip;
    }

    public Context getApplicationContext() {
        return this.mAppContext;
    }

    public void setApplicationContext(Context context) {
        if (context instanceof Activity) {
            this.mAppContext = context.getApplicationContext();
        } else {
            this.mAppContext = context;
        }
    }

    public void release() {
        disableConfig();
        sInstance = null;
    }

    public long getConfigConsumeTime() {
        return this.configConsumeTime;
    }

    public HashMap<String, Object> getBizConfig() {
        return this.configDataParser.getBizConfig();
    }

    public HashMap<String, Object> getFrameworkConfigs() {
        return this.configDataParser.getFrameworkConfigs();
    }

    public String getAssetsPath() {
        return this.assetsPath;
    }

    public void setAssetsPath(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1492413866, oncanceled);
            onCancelLoad.getMin(-1492413866, oncanceled);
        }
        this.assetsPath = str;
    }
}
