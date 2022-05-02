package com.alibaba.griver.base.resource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.resource.api.PackageDownloadCallback;
import com.alibaba.ariver.resource.api.PackageInstallCallback;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.proxy.RVResourceManager;
import com.alibaba.ariver.resource.api.proxy.RVResourcePresetProxy;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.executor.AbstractPriorityRunnable;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.common.utils.ZipUtils;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import com.alibaba.griver.base.resource.preset.GriverResourcePreset;
import java.util.Map;

public class GriverResourceManager {
    public static void saveConfiguration(Map<String, AppModel> map, boolean z) {
        if (map == null || map.size() == 0) {
            GriverLogger.w("GriverResourceManager", "save configuration but app info map is null, return directly");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        GriverLogger.d("GriverResourceManager", "save configuration start");
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            AppModel appModel = (AppModel) next.getValue();
            if (!AppInfoUtils.isValid(appModel)) {
                GriverLogger.w("GriverResourceManager", "configuration is invalid, no need to save, appId: ".concat(String.valueOf(str)));
            } else if (!TextUtils.equals(str, appModel.getAppId())) {
                StringBuilder sb = new StringBuilder("configuration map key is not compatible with value id, do not save. key: ");
                sb.append(str);
                sb.append(", AppInfoId: ");
                sb.append(appModel.getAppId());
                GriverLogger.w("GriverResourceManager", sb.toString());
            } else {
                String appVersion = appModel.getAppVersion();
                AppModel queryHighestAppInfo = GriverAppCenter.queryHighestAppInfo(str);
                if (queryHighestAppInfo == null || RVResourceUtils.compareVersion(queryHighestAppInfo.getAppVersion(), appVersion) <= 0) {
                    if (z || queryHighestAppInfo == null || RVResourceUtils.compareVersion(queryHighestAppInfo.getAppVersion(), appVersion) < 0) {
                        StringBuilder sb2 = new StringBuilder("save configuration, appId: ");
                        sb2.append(str);
                        sb2.append(", version: ");
                        sb2.append(appVersion);
                        GriverLogger.d("GriverResourceManager", sb2.toString());
                        GriverAppCenter.saveAppInfo(appModel);
                    }
                    String config = GriverConfig.getConfig(GriverConfigConstants.KEY_H5_CONFIG_CONTROL);
                    String str2 = "NO";
                    if (!TextUtils.isEmpty(config)) {
                        try {
                            JSONObject parseObject = JSON.parseObject(config);
                            if (parseObject.containsKey(GriverConfigConstants.PARAM_DISABLE_AUTO_DOWNLOAD) && parseObject.getBoolean(GriverConfigConstants.PARAM_DISABLE_AUTO_DOWNLOAD).booleanValue()) {
                                str2 = "YES";
                            }
                        } catch (Exception e) {
                            GriverLogger.e("GriverResourceManager", "parse h5_config_control failed", e);
                        }
                    }
                    installPackage(appModel, "YES".equalsIgnoreCase(str2));
                } else {
                    StringBuilder sb3 = new StringBuilder("version is not the newest, no need to save, appId: ");
                    sb3.append(str);
                    sb3.append(", version: ");
                    sb3.append(appVersion);
                    GriverLogger.w("GriverResourceManager", sb3.toString());
                }
            }
        }
        StringBuilder sb4 = new StringBuilder("save configuration ends, cost: ");
        sb4.append(System.currentTimeMillis() - currentTimeMillis);
        GriverLogger.d("GriverResourceManager", sb4.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r4 = new java.lang.StringBuilder("parse configuration for appId: ");
        r4.append(r2);
        r4.append(", value: ");
        r4.append(r3);
        r4.append(" , failed");
        com.alibaba.griver.base.common.logger.GriverLogger.w("GriverResourceManager", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4 = new java.lang.StringBuilder("parse configuration for appId: ");
        r4.append(r2);
        r4.append(", value: ");
        r4.append(r3);
        r4.append(" , failed");
        com.alibaba.griver.base.common.logger.GriverLogger.w("GriverResourceManager", r4.toString());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0064 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0098 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, com.alibaba.ariver.resource.api.models.AppModel> parseAppInfoFromJSONString(java.lang.String r9) {
        /*
            java.lang.String r0 = "GriverResourceManager"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.alibaba.fastjson.JSONObject r9 = com.alibaba.fastjson.JSON.parseObject(r9)     // Catch:{ Exception -> 0x00b2 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ Exception -> 0x00b2 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x0013:
            boolean r2 = r9.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r2 == 0) goto L_0x00b8
            java.lang.Object r2 = r9.next()     // Catch:{ Exception -> 0x00b2 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Exception -> 0x00b2 }
            r3 = 0
            java.lang.Object r4 = r2.getValue()     // Catch:{ Exception -> 0x0028 }
            com.alibaba.fastjson.JSONObject r4 = (com.alibaba.fastjson.JSONObject) r4     // Catch:{ Exception -> 0x0028 }
            r3 = r4
            goto L_0x002e
        L_0x0028:
            r4 = move-exception
            java.lang.String r5 = "parse JSONObject failed"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r0, r5, r4)     // Catch:{ Exception -> 0x00b2 }
        L_0x002e:
            if (r3 == 0) goto L_0x0013
            java.lang.String r4 = "downloadURL"
            boolean r4 = r3.containsKey(r4)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r5 = " , failed"
            java.lang.String r6 = ", value: "
            java.lang.String r7 = "parse configuration for appId: "
            if (r4 == 0) goto L_0x007d
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r3)     // Catch:{ Exception -> 0x0064 }
            java.lang.Class<com.alibaba.griver.api.h5.appinfo.GriverH5AppInfo> r8 = com.alibaba.griver.api.h5.appinfo.GriverH5AppInfo.class
            java.lang.Object r4 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r4, r8)     // Catch:{ Exception -> 0x0064 }
            com.alibaba.griver.api.h5.appinfo.GriverH5AppInfo r4 = (com.alibaba.griver.api.h5.appinfo.GriverH5AppInfo) r4     // Catch:{ Exception -> 0x0064 }
            java.lang.Object r8 = r2.getKey()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0064 }
            r4.appId = r8     // Catch:{ Exception -> 0x0064 }
            com.alibaba.ariver.resource.api.models.AppModel r4 = com.alibaba.griver.base.common.utils.AppInfoUtils.convertToAppInfo(r4)     // Catch:{ Exception -> 0x0064 }
            boolean r8 = com.alibaba.griver.base.common.utils.AppInfoUtils.isValid(r4)     // Catch:{ Exception -> 0x0064 }
            if (r8 == 0) goto L_0x0013
            java.lang.Object r8 = r2.getKey()     // Catch:{ Exception -> 0x0064 }
            r1.put(r8, r4)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0013
        L_0x0064:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2 }
            r4.<init>(r7)     // Catch:{ Exception -> 0x00b2 }
            r4.append(r2)     // Catch:{ Exception -> 0x00b2 }
            r4.append(r6)     // Catch:{ Exception -> 0x00b2 }
            r4.append(r3)     // Catch:{ Exception -> 0x00b2 }
            r4.append(r5)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x00b2 }
            com.alibaba.griver.base.common.logger.GriverLogger.w(r0, r2)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0013
        L_0x007d:
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r3)     // Catch:{ Exception -> 0x0098 }
            java.lang.Class<com.alibaba.ariver.resource.api.models.AppModel> r8 = com.alibaba.ariver.resource.api.models.AppModel.class
            java.lang.Object r4 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r4, r8)     // Catch:{ Exception -> 0x0098 }
            com.alibaba.ariver.resource.api.models.AppModel r4 = (com.alibaba.ariver.resource.api.models.AppModel) r4     // Catch:{ Exception -> 0x0098 }
            boolean r8 = com.alibaba.griver.base.common.utils.AppInfoUtils.isValid(r4)     // Catch:{ Exception -> 0x0098 }
            if (r8 == 0) goto L_0x0013
            java.lang.Object r8 = r2.getKey()     // Catch:{ Exception -> 0x0098 }
            r1.put(r8, r4)     // Catch:{ Exception -> 0x0098 }
            goto L_0x0013
        L_0x0098:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2 }
            r4.<init>(r7)     // Catch:{ Exception -> 0x00b2 }
            r4.append(r2)     // Catch:{ Exception -> 0x00b2 }
            r4.append(r6)     // Catch:{ Exception -> 0x00b2 }
            r4.append(r3)     // Catch:{ Exception -> 0x00b2 }
            r4.append(r5)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x00b2 }
            com.alibaba.griver.base.common.logger.GriverLogger.w(r0, r2)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0013
        L_0x00b2:
            r9 = move-exception
            java.lang.String r2 = "parse config failed"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r0, r2, r9)
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.resource.GriverResourceManager.parseAppInfoFromJSONString(java.lang.String):java.util.Map");
    }

    public static void installPackage(AppModel appModel, boolean z) {
        if (!AppInfoUtils.isValid(appModel)) {
            GriverLogger.w("GriverResourceManager", "app info is invalid, do not install");
        } else if (!AppInfoUtils.shouldInstall(appModel)) {
            GriverLogger.w("GriverResourceManager", "app should not install, do not install");
        } else {
            Map<String, RVResourcePresetProxy.PresetPackage> presetPackage = GriverResourcePreset.getPresetPackage();
            if (presetPackage == null || !presetPackage.containsKey(appModel.getAppId()) || presetPackage.get(appModel.getAppId()) == null || !TextUtils.equals(presetPackage.get(appModel.getAppId()).getVersion(), appModel.getAppVersion())) {
                a(appModel, z);
            } else {
                a(appModel, presetPackage.get(appModel.getAppId()));
            }
        }
    }

    private static void a(final AppModel appModel, boolean z) {
        final RVResourceManager rVResourceManager = (RVResourceManager) RVProxy.get(RVResourceManager.class);
        if (rVResourceManager == null) {
            return;
        }
        if (rVResourceManager.isAvailable(appModel)) {
            GriverLogger.d("GriverResourceManager", "has installed already, do not download");
        } else if (rVResourceManager.isDownloaded(appModel)) {
            GriverLogger.d("GriverResourceManager", "has downloaded, install directly");
            rVResourceManager.installApp(appModel, new PackageInstallCallback() {
                public final void onResult(boolean z, String str) {
                    GriverLogger.d("GriverResourceManager", "install result: ".concat(String.valueOf(z)));
                }
            });
        } else if (z) {
            StringBuilder sb = new StringBuilder("skip download for : ");
            sb.append(appModel.getAppId());
            GriverLogger.w("GriverResourceManager", sb.toString());
        } else {
            rVResourceManager.downloadApp(appModel, false, new PackageDownloadCallback() {
                public final void onCancel(String str) {
                }

                public final void onFailed(String str, int i, String str2) {
                }

                public final void onPrepare(String str) {
                }

                public final void onProgress(String str, int i) {
                }

                public final void onFinish(@Nullable String str) {
                    GriverLogger.d("GriverResourceManager", "download success, then install: ".concat(String.valueOf(str)));
                    StringBuilder sb = new StringBuilder("install App: ");
                    sb.append(appModel.toString());
                    GriverLogger.d("GriverResourceManager", sb.toString());
                    rVResourceManager.installApp(appModel, new PackageInstallCallback() {
                        public void onResult(boolean z, String str) {
                            GriverLogger.d("GriverResourceManager", "install result: ".concat(String.valueOf(z)));
                        }
                    });
                }
            });
        }
    }

    private static void a(final AppModel appModel, final RVResourcePresetProxy.PresetPackage presetPackage) {
        GriverExecutors.getSingleOrderThreadExecutorByName(AppInfoUtils.getInstallThreadName(appModel.getAppId())).execute(new AbstractPriorityRunnable(5) {
            public final void runTask() {
                RVResourcePresetProxy.PresetPackage presetPackage = presetPackage;
                if (presetPackage == null) {
                    StringBuilder sb = new StringBuilder("preset package is null, do not install preset for appId: ");
                    sb.append(appModel.getAppId());
                    GriverLogger.w("GriverResourceManager", sb.toString());
                } else if (!TextUtils.equals(presetPackage.getVersion(), appModel.getAppVersion())) {
                    StringBuilder sb2 = new StringBuilder("preset package version is not match, do not install preset for appId: ");
                    sb2.append(appModel.getAppId());
                    sb2.append(", version: ");
                    sb2.append(appModel.getAppVersion());
                    sb2.append(", preset version: ");
                    sb2.append(presetPackage.getVersion());
                    GriverLogger.w("GriverResourceManager", sb2.toString());
                } else if (AppInfoUtils.isInstalled(appModel)) {
                    GriverLogger.d("GriverResourceManager", "app is installed, do not install preset");
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        String installPath = AppInfoUtils.getInstallPath(appModel);
                        if (ZipUtils.unZip(presetPackage.getInputStream(), installPath)) {
                            if (AppInfoUtils.installPathValid(installPath)) {
                                for (String next : AppInfoUtils.getAllInstallFiles(appModel.getAppId())) {
                                    if (!TextUtils.equals(next, installPath)) {
                                        GriverLogger.d("GriverResourceManager", "delete old install path: ".concat(String.valueOf(next)));
                                        FileUtils.delete(next);
                                    }
                                }
                                StringBuilder sb3 = new StringBuilder("install preset success for appId: ");
                                sb3.append(appModel.getAppId());
                                sb3.append(", version: ");
                                sb3.append(appModel.getAppVersion());
                                GriverLogger.d("GriverResourceManager", sb3.toString());
                                GriverMonitor.event(GriverMonitorConstants.EVENT_UNZIP_SUCCESS, "GriverAppContainer", new MonitorMap.Builder().appId(appModel.getAppId()).version(appModel).cost(String.valueOf(System.currentTimeMillis() - currentTimeMillis)).needAsynAppType(true).build());
                                return;
                            }
                        }
                        StringBuilder sb4 = new StringBuilder("unzip preset failed for appId: ");
                        sb4.append(appModel.getAppId());
                        sb4.append(", version: ");
                        sb4.append(appModel.getAppVersion());
                        GriverLogger.d("GriverResourceManager", sb4.toString());
                        FileUtils.delete(installPath);
                        MonitorMap.Builder builder = new MonitorMap.Builder();
                        builder.appId(appModel.getAppId()).version(appModel).cost(String.valueOf(System.currentTimeMillis() - currentTimeMillis)).message("unzip result fail for preset").installPath(installPath);
                        GriverMonitor.error(GriverMonitorConstants.ERROR_UNZIP_FAIL, "GriverAppContainer", builder.build());
                    } catch (Exception e) {
                        StringBuilder sb5 = new StringBuilder("install app failed, appId: ");
                        sb5.append(appModel.getAppId());
                        sb5.append(", version: ");
                        sb5.append(appModel.getAppVersion());
                        GriverLogger.e("GriverResourceManager", sb5.toString(), e);
                        GriverMonitor.error(GriverMonitorConstants.ERROR_UNZIP_FAIL, "GriverAppContainer", new MonitorMap.Builder().appId(appModel.getAppId()).version(appModel).cost(String.valueOf(System.currentTimeMillis() - currentTimeMillis)).exception(e).message(GriverMonitorConstants.MESSAGE_UNZIP_PRESET_ERROR).installPath(AppInfoUtils.getInstallPath(appModel)).needAsynAppType(true).build());
                        FileUtils.delete(AppInfoUtils.getInstallPath(appModel.getAppId(), appModel.getAppVersion(), appModel.getAppInfoModel().getPackageUrl()));
                    }
                }
            }
        });
    }
}
