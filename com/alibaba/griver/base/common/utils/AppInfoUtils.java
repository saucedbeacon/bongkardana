package com.alibaba.griver.base.common.utils;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.ContainerModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.h5.appinfo.GriverH5AppInfo;
import com.alibaba.griver.api.resource.appcenter.storage.AppInfoDao;
import com.alibaba.griver.api.resource.appinfo.AppInfoConstants;
import com.alibaba.griver.api.resource.appinfo.GriverAppVirtualHostProxy;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppInfoUtils {
    public static final String DEFAULT_VIRTUAL_HOST = "saas.mini-program.com";

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<AppInfoDao> f9055a = new Comparator<AppInfoDao>() {
        public final int compare(AppInfoDao appInfoDao, AppInfoDao appInfoDao2) {
            return RVResourceUtils.compareVersion(appInfoDao2.getVersion(), appInfoDao.getVersion());
        }
    };
    private static List<String> b = new ArrayList();
    private static String c = "griver/installed";
    private static String d = "griver/downloaded";
    private static String e = "griver/preDownloaded";
    private static GriverAppVirtualHostProxy f = new GriverAppVirtualHostProxy() {
        public final String getHost() {
            return AppInfoUtils.DEFAULT_VIRTUAL_HOST;
        }

        public final String getScheme() {
            return "https";
        }
    };

    public static int getDownloadType(AppModel appModel) {
        return 1;
    }

    static {
        b.add("66666692");
    }

    public static boolean isValid(AppModel appModel) {
        boolean z = appModel != null && !TextUtils.isEmpty(appModel.getAppId()) && !TextUtils.isEmpty(appModel.getAppInfoModel().getVersion());
        if (z) {
            if (appModel.getExtendInfos() != null && getAppType(appModel) == 2) {
                appModel.getExtendInfos().put("usePresetPopmenu", (Object) "YES");
            }
            if (TextUtils.isEmpty(appModel.getAppInfoModel().getVhost())) {
                AppInfoModel appInfoModel = appModel.getAppInfoModel();
                StringBuilder sb = new StringBuilder();
                sb.append(f.getScheme());
                sb.append("://");
                sb.append(appModel.getAppId());
                sb.append(".");
                sb.append(f.getHost());
                appInfoModel.setVhost(sb.toString());
            }
        }
        if (!isEmbeddedApp(appModel) || !TextUtils.isEmpty(getEmbeddedAppMainUrl(appModel))) {
            return z;
        }
        return false;
    }

    public static Comparator<AppInfoDao> getAppInfoDaoDescComparator() {
        return f9055a;
    }

    public static boolean isOutOfTime(String str, long j) {
        long currentTimeMillis = (System.currentTimeMillis() - GriverAppCenter.queryLastRefreshTimestamp(str)) / 1000;
        StringBuilder sb = new StringBuilder("last update period: ");
        sb.append(currentTimeMillis);
        sb.append(", appId: ");
        sb.append(str);
        GriverLogger.d("AppInfoUtils", sb.toString());
        return currentTimeMillis > j;
    }

    private static final String a() {
        Application applicationContext = GriverEnv.getApplicationContext();
        StringBuilder sb = new StringBuilder();
        sb.append(applicationContext.getFilesDir());
        sb.append(File.separator);
        sb.append(c);
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private static String b() {
        File file;
        String config = GriverConfig.getConfig(GriverConfigConstants.KEY_DOWNLOAD_APP_PATH, GriverConfigConstants.DEFAULT_DOWNLOAD_APP_PATH);
        Application applicationContext = GriverEnv.getApplicationContext();
        if (GriverConfigConstants.DEFAULT_DOWNLOAD_APP_PATH.equalsIgnoreCase(config)) {
            StringBuilder sb = new StringBuilder();
            sb.append(applicationContext.getFilesDir());
            sb.append(File.separator);
            sb.append(d);
            file = new File(sb.toString());
        } else {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(applicationContext.getExternalFilesDir(""));
                sb2.append(File.separator);
                sb2.append(d);
                file = new File(sb2.toString());
            } catch (Exception unused) {
                GriverLogger.w("AppInfoUtils", "external file is not available, use inner storage");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(applicationContext.getFilesDir());
                sb3.append(File.separator);
                sb3.append(d);
                file = new File(sb3.toString());
            }
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static String getInstallPath(@NonNull AppModel appModel) {
        if (appModel.getAppInfoModel() == null) {
            return null;
        }
        return getInstallPath(appModel.getAppId(), appModel.getAppVersion(), appModel.getAppInfoModel().getPackageUrl(), isEmbeddedApp(appModel));
    }

    public static String getInstallPath(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            return new File(new File(a(), str), a(str3, str2)).getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder("get install path, but parameter is empty, appId: ");
        sb.append(str);
        sb.append(", version: ");
        sb.append(str2);
        sb.append(", downloadUrl: ");
        sb.append(str3);
        GriverLogger.w("AppInfoUtils", sb.toString());
        return null;
    }

    public static String getInstallPath(String str, String str2, String str3, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (z || !TextUtils.isEmpty(str3))) {
            return new File(new File(a(), str), a(str3, str2)).getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder("get install path, but parameter is empty, appId: ");
        sb.append(str);
        sb.append(", version: ");
        sb.append(str2);
        sb.append(", downloadUrl: ");
        sb.append(str3);
        GriverLogger.w("AppInfoUtils", sb.toString());
        return null;
    }

    public static List<String> getAllInstallFiles(String str) {
        List<AppModel> queryAppInfo = GriverAppCenter.queryAppInfo(str);
        ArrayList arrayList = new ArrayList();
        if (queryAppInfo != null && queryAppInfo.size() > 0) {
            for (AppModel next : queryAppInfo) {
                String installPath = getInstallPath(next.getAppId(), next.getAppVersion(), next.getAppInfoModel().getPackageUrl());
                if (FileUtils.exists(installPath)) {
                    arrayList.add(installPath);
                }
            }
        }
        return arrayList;
    }

    public static boolean isInstalled(AppModel appModel) {
        if (appModel != null) {
            return installPathExist(appModel);
        }
        GriverLogger.w("AppInfoUtils", "check install status, app griver info is null, return false");
        return false;
    }

    public static boolean installPathExist(AppModel appModel) {
        if (appModel == null) {
            return false;
        }
        return installPathValid(getInstallPath(appModel));
    }

    public static boolean installPathValid(String str) {
        File[] listFiles;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.isDirectory() || !file.exists() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return false;
        }
        if (listFiles.length >= 4) {
            return true;
        }
        boolean z = false;
        for (File name : listFiles) {
            if (name.getName().contains("tar")) {
                z = true;
            }
        }
        return z;
    }

    public static File getDownloadFile(@NonNull AppModel appModel) {
        if (appModel.getAppInfoModel() == null) {
            return null;
        }
        String b2 = b();
        StringBuilder sb = new StringBuilder();
        sb.append(appModel.getAppId());
        sb.append("-");
        sb.append(a(appModel.getAppInfoModel().getPackageUrl(), appModel.getAppVersion()));
        return new File(b2, sb.toString());
    }

    public static boolean isEmbeddedApp(Page page) {
        if (page != null && page.getApp() != null) {
            return isEmbeddedApp((AppModel) page.getApp().getData(AppModel.class));
        }
        GriverLogger.w("AppInfoUtils", "check if embedded app but app model is null, return false");
        return false;
    }

    public static boolean isEmbeddedApp(AppModel appModel) {
        if (appModel != null && appModel.getExtendInfos() != null) {
            return "YES".equalsIgnoreCase(JSONUtils.getString(appModel.getExtendInfos(), GriverBaseConstants.GRIVER_IS_EMBEDDED_APP));
        }
        GriverLogger.w("AppInfoUtils", "check if embedded app but app model is null, return false");
        return false;
    }

    public static String getEmbeddedAppMainUrl(AppModel appModel) {
        if (appModel != null && appModel.getExtendInfos() != null) {
            return JSONUtils.getString(appModel.getExtendInfos(), GriverBaseConstants.GRIVER_EMBEDDED_URL);
        }
        GriverLogger.w("AppInfoUtils", "get embedded app main url but app model is null, return empty");
        return "";
    }

    private static String a(@Nullable String str, String str2) {
        return !TextUtils.isEmpty(str) ? FileUtils.getMD5(str) : str2;
    }

    public static boolean isCommonRes(String str) {
        return b.contains(str);
    }

    public static void setGriverAppVirtualHostProxy(GriverAppVirtualHostProxy griverAppVirtualHostProxy) {
        if (f != null) {
            f = griverAppVirtualHostProxy;
        }
    }

    public static GriverAppVirtualHostProxy getVhostProxy() {
        return f;
    }

    public static boolean isTinyApp(AppModel appModel) {
        return appModel != null && getAppType(appModel) == 2;
    }

    public static int getAppType(AppModel appModel) {
        if (appModel == null) {
            return 2;
        }
        try {
            if (appModel.getExtendInfos() != null && appModel.getExtendInfos().containsKey(AppInfoConstants.KEY_GRIVER_H5_EXTEND_KEY)) {
                return 1;
            }
            if (appModel.getExtendInfos().containsKey(AppInfoConstants.KEY_GRIVER_APP_SCENE)) {
                appModel.getExtendInfos().put("appType", (Object) Integer.valueOf(JSONUtils.getInt(appModel.getExtendInfos(), AppInfoConstants.KEY_GRIVER_APP_SCENE)));
            }
            int i = JSONUtils.getInt(appModel.getExtendInfos(), "appType");
            if (i == 2 || i == 1) {
                return i;
            }
            return 2;
        } catch (Throwable th) {
            RVLogger.e("AppInfoUtils", "isTiny..e=".concat(String.valueOf(th)));
        }
    }

    public static void setAppType(AppModel appModel, int i) {
        if (appModel != null) {
            if (appModel.getExtendInfos() == null) {
                appModel.setExtendInfos(new JSONObject());
            }
            appModel.getExtendInfos().put(AppInfoConstants.KEY_GRIVER_APP_SCENE, (Object) Integer.valueOf(i));
            appModel.getExtendInfos().put("appType", (Object) Integer.valueOf(i));
        }
    }

    public static String getPublishingStatus(AppModel appModel) {
        if (appModel == null) {
            return "PUBLISHED";
        }
        try {
            String string = JSONUtils.getString(appModel.getExtendInfos(), "publishingStatus");
            if (TextUtils.equals(string, "PUBLISHED") || TextUtils.equals(string, "REMOVED") || TextUtils.equals(string, "SUSPENDED")) {
                return string;
            }
            return "PUBLISHED";
        } catch (Throwable th) {
            RVLogger.e("AppInfoUtils", "isTiny..e=".concat(String.valueOf(th)));
        }
    }

    public static void setPublishingStatus(AppModel appModel, String str) {
        if (appModel != null) {
            if (appModel.getExtendInfos() == null) {
                appModel.setExtendInfos(new JSONObject());
            }
            appModel.getExtendInfos().put("publishingStatus", (Object) str);
        }
    }

    public static JSONObject getLanguages(AppModel appModel) {
        if (appModel == null) {
            return null;
        }
        try {
            return JSONUtils.getJSONObject(appModel.getExtendInfos(), "languages", (JSONObject) null);
        } catch (Throwable th) {
            RVLogger.e("AppInfoUtils", "isTiny..e=".concat(String.valueOf(th)));
            return null;
        }
    }

    public static void setLanguages(AppModel appModel, JSONObject jSONObject) {
        if (appModel != null) {
            if (appModel.getExtendInfos() == null) {
                appModel.setExtendInfos(new JSONObject());
            }
            appModel.getExtendInfos().put("languages", (Object) jSONObject);
        }
    }

    public static void setDownloadType(AppModel appModel, int i) {
        if (appModel != null) {
            if (appModel.getContainerInfo() == null) {
                appModel.setContainerInfo(new ContainerModel());
            }
            appModel.getContainerInfo().setDownloadType(i);
        }
    }

    public static String getInstallThreadName(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_install");
        return sb.toString();
    }

    public static AppModel convertToAppInfo(GriverH5AppInfo griverH5AppInfo) {
        AppModel appModel = new AppModel();
        if (griverH5AppInfo == null) {
            return appModel;
        }
        AppInfoModel appInfoModel = new AppInfoModel();
        appInfoModel.setAppId(griverH5AppInfo.appId);
        appInfoModel.setVersion(griverH5AppInfo.version);
        appInfoModel.setDeveloperVersion(griverH5AppInfo.version);
        appInfoModel.setVhost(a(griverH5AppInfo.remoteURLPrefix));
        setAppType(appModel, 1);
        appInfoModel.setPackageUrl(griverH5AppInfo.downloadURL);
        appInfoModel.setMainUrl(griverH5AppInfo.index);
        appModel.setAppInfoModel(appInfoModel);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppInfoConstants.KEY_GRIVER_H5_EXTEND_KEY, (Object) JSON.toJSONString(griverH5AppInfo));
        appModel.setExtendInfos(jSONObject);
        setPublishingStatus(appModel, griverH5AppInfo.publishingStatus);
        appModel.setContainerInfo(new ContainerModel());
        return appModel;
    }

    public static String getDeveloperVersion(AppModel appModel) {
        return (appModel == null || appModel.getAppInfoModel() == null) ? "" : appModel.getAppInfoModel().getDeveloperVersion();
    }

    public static GriverH5AppInfo getH5AppFromAppInfo(AppModel appModel) {
        JSONObject extendInfos;
        if (appModel == null || getAppType(appModel) != 1 || (extendInfos = appModel.getExtendInfos()) == null || !extendInfos.containsKey(AppInfoConstants.KEY_GRIVER_H5_EXTEND_KEY)) {
            return null;
        }
        try {
            return (GriverH5AppInfo) JSON.parseObject(extendInfos.getString(AppInfoConstants.KEY_GRIVER_H5_EXTEND_KEY), GriverH5AppInfo.class);
        } catch (Exception e2) {
            GriverLogger.e("AppInfoUtils", "get h5app from app failed", e2);
            return null;
        }
    }

    private static String a(String str) {
        try {
            Uri parse = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append(parse.getScheme());
            sb.append("://");
            sb.append(parse.getHost());
            String obj = sb.toString();
            GriverLogger.d("AppInfoUtils", "vhost = ".concat(String.valueOf(obj)));
            return obj;
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("getVhost");
            sb2.append(e2.getMessage());
            GriverLogger.w("AppInfoUtils", sb2.toString());
            return null;
        }
    }

    public static boolean shouldInstall(AppModel appModel) {
        GriverH5AppInfo h5AppFromAppInfo;
        if (appModel == null) {
            return false;
        }
        if (2 != getAppType(appModel) || (!TextUtils.equals(getPublishingStatus(appModel), "REMOVED") && !TextUtils.equals(getPublishingStatus(appModel), "SUSPENDED"))) {
            if (1 == getAppType(appModel) && (h5AppFromAppInfo = getH5AppFromAppInfo(appModel)) != null) {
                if (TextUtils.equals(h5AppFromAppInfo.publishingStatus, "REMOVED") || TextUtils.equals(h5AppFromAppInfo.publishingStatus, "SUSPENDED")) {
                    StringBuilder sb = new StringBuilder("app is not published, should not install, appId: ");
                    sb.append(h5AppFromAppInfo.appId);
                    sb.append(", version: ");
                    sb.append(h5AppFromAppInfo.version);
                    GriverLogger.d("AppInfoUtils", sb.toString());
                    return false;
                } else if (h5AppFromAppInfo.shouldLoadRemote) {
                    StringBuilder sb2 = new StringBuilder("app should load remote, should not install, appId: ");
                    sb2.append(h5AppFromAppInfo.appId);
                    sb2.append(", version: ");
                    sb2.append(h5AppFromAppInfo.version);
                    GriverLogger.d("AppInfoUtils", sb2.toString());
                    return false;
                }
            }
            return true;
        }
        StringBuilder sb3 = new StringBuilder("app is not published, should not install, appId: ");
        sb3.append(appModel.getAppId());
        sb3.append(", version: ");
        sb3.append(appModel.getAppVersion());
        GriverLogger.d("AppInfoUtils", sb3.toString());
        return false;
    }

    private static String c() {
        File file;
        String config = GriverConfig.getConfig(GriverConfigConstants.KEY_DOWNLOAD_APP_PATH, GriverConfigConstants.DEFAULT_DOWNLOAD_APP_PATH);
        Application applicationContext = GriverEnv.getApplicationContext();
        if (GriverConfigConstants.DEFAULT_DOWNLOAD_APP_PATH.equalsIgnoreCase(config)) {
            StringBuilder sb = new StringBuilder();
            sb.append(applicationContext.getFilesDir());
            sb.append(File.separator);
            sb.append(e);
            file = new File(sb.toString());
        } else {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(applicationContext.getExternalFilesDir(""));
                sb2.append(File.separator);
                sb2.append(e);
                file = new File(sb2.toString());
            } catch (Exception unused) {
                GriverLogger.w("AppInfoUtils", "preDownload external file is not available, use inner storage");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(applicationContext.getFilesDir());
                sb3.append(File.separator);
                sb3.append(e);
                file = new File(sb3.toString());
            }
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static File getPreDownloadFile(@NonNull AppModel appModel) {
        if (appModel.getAppInfoModel() == null) {
            return null;
        }
        String c2 = c();
        StringBuilder sb = new StringBuilder();
        sb.append(appModel.getAppId());
        sb.append("-");
        sb.append(a(appModel.getAppInfoModel().getPackageUrl(), appModel.getAppVersion()));
        return new File(c2, sb.toString());
    }

    public static void deletePreDownloadFileByAppId(@NonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(c());
            if (file.exists()) {
                for (File file2 : file.listFiles()) {
                    if (file2.getName().startsWith(str)) {
                        file2.delete();
                    }
                }
            }
        }
    }

    public static boolean isPreDownloadFileExists(@NonNull AppModel appModel) {
        if (appModel.getAppInfoModel() == null) {
            return false;
        }
        String c2 = c();
        StringBuilder sb = new StringBuilder();
        sb.append(appModel.getAppId());
        sb.append("-");
        sb.append(a(appModel.getAppInfoModel().getPackageUrl(), appModel.getAppVersion()));
        return new File(c2, sb.toString()).exists();
    }
}
