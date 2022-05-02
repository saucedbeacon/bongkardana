package com.alibaba.ariver.resource.api.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.EmbedType;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.ariver.app.api.ui.titlebar.TitleBar;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVAccountService;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ImageUtil;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class RVSnapshotUtils {
    public static boolean isSnapshotEnabled(App app) {
        if (app != null && !app.isExited() && !TextUtils.isEmpty(app.getAppId())) {
            String appId = app.getAppId();
            if (RVProxy.get(ISnapshotProxy.class, true) != null) {
                return ((ISnapshotProxy) RVProxy.get(ISnapshotProxy.class)).isSnapshotEnable(app);
            }
            if ("YES".equalsIgnoreCase(BundleUtils.getString(app.getStartParams(), RVParams.APPX_ROUTE_FRAMEWORK))) {
                JSONArray configJSONArray = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONArray("ta_snapshotWhiteList_appxng");
                if (configJSONArray != null && (configJSONArray.contains("all") || configJSONArray.contains(appId))) {
                    RVLogger.d("AriverRes:SnapshotProvider", "ta_snapshotWhiteList_appxng hit, appId: ".concat(String.valueOf(appId)));
                    return true;
                }
            } else {
                JSONArray configJSONArray2 = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONArray("ta_snapshotWhiteList");
                JSONArray configJSONArray3 = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONArray("ta_snapshotBlackList");
                if (configJSONArray3 != null && (configJSONArray3.contains("all") || configJSONArray3.contains(appId))) {
                    RVLogger.d("AriverRes:SnapshotProvider", "ta_snapshotBlackList hit, appId: ".concat(String.valueOf(appId)));
                    return false;
                } else if (configJSONArray2 != null && (configJSONArray2.contains("all") || configJSONArray2.contains(appId))) {
                    RVLogger.d("AriverRes:SnapshotProvider", "ta_snapshotWhiteList hit, appId: ".concat(String.valueOf(appId)));
                    return true;
                }
            }
        }
        return false;
    }

    public static void saveSnapshot(App app, String str, String str2) {
        TitleBar titleBar;
        if (!isSnapshotEnabled(app)) {
            RVLogger.e("AriverRes:SnapshotProvider", "saveSnapshot, snapshot switch is disabled");
        } else if (!isValidSnapshot(str)) {
            RVLogger.e("AriverRes:SnapshotProvider", "saveSnapshot invalid snapshot string");
        } else {
            try {
                if (!(!isHomePage2(app, str2) || !app.isFirstPage() || app.getActivePage() == null || app.getActivePage().getPageContext() == null || (titleBar = app.getActivePage().getPageContext().getTitleBar()) == null)) {
                    JSONObject jSONObject = new JSONObject();
                    String title = titleBar.getTitle();
                    if (!TextUtils.isEmpty(title)) {
                        jSONObject.put("defaultTitle", (Object) title);
                    }
                    String subTitle = titleBar.getSubTitle();
                    if (!TextUtils.isEmpty(subTitle)) {
                        jSONObject.put(RVParams.LONG_SUB_TITLE, (Object) subTitle);
                    }
                    jSONObject.put("titleBarColor", (Object) Integer.valueOf(titleBar.getTitleColor() | -16777216));
                    String transparentTitle = titleBar.getTransparentTitle();
                    if (!TextUtils.isEmpty(transparentTitle)) {
                        jSONObject.put("transparentTitle", (Object) transparentTitle);
                    }
                    Bitmap imgTitle = titleBar.getImgTitle();
                    if (imgTitle != null) {
                        jSONObject.put("titleImage", (Object) ImageUtil.bitmapToString(imgTitle, "PNG"));
                    }
                    String jSONUtils = JSONUtils.toString(jSONObject);
                    String a2 = a(app, str2);
                    if (!TextUtils.isEmpty(a2)) {
                        writeToFile(jSONUtils, a2.replace("index.snapshot.html", "titleBar.snapshot.json"));
                    }
                }
            } catch (Throwable th) {
                RVLogger.e("AriverRes:SnapshotProvider", "saveSnapshot exception!", th);
            }
            try {
                writeToFile(str, a(app, str2));
            } catch (Throwable th2) {
                RVLogger.e("AriverRes:SnapshotProvider", "saveSnapshot exception: ", th2);
            }
        }
    }

    public static boolean deleteSnapshot(App app, String str) {
        if (!isSnapshotEnabled(app)) {
            RVLogger.d("AriverRes:SnapshotProvider", "deleteSnapshot, snapshot switch is disabled");
            return true;
        }
        try {
            String a2 = a(app, str);
            String replace = a2.replace("index.snapshot.html", "titleBar.snapshot.json");
            if (!TextUtils.isEmpty(a2)) {
                if (!TextUtils.isEmpty(replace)) {
                    File file = new File(a2);
                    File file2 = new File(replace);
                    if ((file.exists() || file2.exists()) && ((file.exists() && file.delete()) || (file2.exists() && file2.delete()))) {
                        RVLogger.d("AriverRes:SnapshotProvider", "deleteSnapshot, success: ".concat(String.valueOf(a2)));
                    }
                    return true;
                }
            }
            RVLogger.d("AriverRes:SnapshotProvider", "deleteSnapshot, snapshot pagePath is null");
            return true;
        } catch (Throwable th) {
            RVLogger.e("AriverRes:SnapshotProvider", "deleteSnapshot exception: ", th);
            return false;
        }
    }

    public static boolean hitPageLevelWhiteList(String str) {
        JSONArray configJSONArray;
        if (TextUtils.isEmpty(str) || (configJSONArray = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONArray("ta_snapshot2WhiteList")) == null || (!configJSONArray.contains("all") && !configJSONArray.contains(str))) {
            return false;
        }
        RVLogger.d("AriverRes:SnapshotProvider", "PageLevel snapshot hit whitelist, appId: ".concat(String.valueOf(str)));
        return true;
    }

    @Nullable
    public static byte[] loadSnapshotFile(App app, String str) {
        app.getAppId();
        String a2 = a(app, getPagePathFromPageUrl(str));
        if (!isSnapshotEnabled(app)) {
            RVLogger.e("AriverRes:SnapshotProvider", "snapshot switch is disabled");
            return null;
        } else if (TextUtils.isEmpty(a2)) {
            RVLogger.e("AriverRes:SnapshotProvider", "snapshotFilePath is null");
            return null;
        } else if (a(a2)) {
            return null;
        } else {
            try {
                File file = new File(a2);
                if (file.exists()) {
                    byte[] readFile = readFile(file);
                    if (readFile == null || readFile.length <= 100) {
                        return null;
                    }
                    RVLogger.d("AriverRes:SnapshotProvider", "snapshot file existed: ".concat(String.valueOf(a2)));
                    return readFile;
                }
                RVLogger.e("AriverRes:SnapshotProvider", "snapshot file not existed: ".concat(String.valueOf(a2)));
                return null;
            } catch (Throwable th) {
                RVLogger.e("AriverRes:SnapshotProvider", " loadSnapshotFile error: ".concat(String.valueOf(th)));
                return null;
            }
        }
    }

    public static String loadTitleBarSnapshot(App app, String str) {
        app.getAppId();
        if (!isHomePage(app, str)) {
            return null;
        }
        String a2 = a(app, getPagePathFromPageUrl(str));
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        String replace = a2.replace("index.snapshot.html", "titleBar.snapshot.json");
        if (!isSnapshotEnabled(app)) {
            RVLogger.e("AriverRes:SnapshotProvider", "titleBar snapshot switch is disabled");
            return null;
        } else if (TextUtils.isEmpty(replace)) {
            RVLogger.e("AriverRes:SnapshotProvider", "titleBar snapshotFilePath is null");
            return null;
        } else if (a(replace)) {
            return null;
        } else {
            try {
                File file = new File(replace);
                if (file.exists()) {
                    RVLogger.d("AriverRes:SnapshotProvider", "titleBar snapshot file existed: ".concat(String.valueOf(replace)));
                    byte[] readFile = readFile(file);
                    if (readFile == null) {
                        return null;
                    }
                    String str2 = new String(readFile, StandardCharsets.UTF_8);
                    RVLogger.d("AriverRes:SnapshotProvider", "titleBar snapshot file : ".concat(str2));
                    return str2;
                }
                RVLogger.e("AriverRes:SnapshotProvider", "titleBar snapshot file not existed: ".concat(String.valueOf(replace)));
                return null;
            } catch (Throwable th) {
                RVLogger.e("AriverRes:SnapshotProvider", "titleBar loadSnapshotFile error: ".concat(String.valueOf(th)));
                return null;
            }
        }
    }

    private static boolean a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return false;
            }
            String configWithProcessCache = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("ta_snapshotExpiredDays", "7");
            if (new Date().getTime() - file.lastModified() > ((long) (Integer.parseInt(configWithProcessCache) * 24 * 60 * 60 * 1000))) {
                file.delete();
                StringBuilder sb = new StringBuilder("snapshot file ");
                sb.append(str);
                sb.append(" expired ");
                sb.append(configWithProcessCache);
                sb.append(" days and delete success");
                RVLogger.d("AriverRes:SnapshotProvider", sb.toString());
                return true;
            }
            return false;
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("deleteFileIfExpired: ");
            sb2.append(str);
            sb2.append("  error: ");
            sb2.append(th);
            RVLogger.e("AriverRes:SnapshotProvider", sb2.toString());
        }
    }

    @Nullable
    public static String getPagePathFromPageUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parseUrl = UrlUtils.parseUrl(str);
        if (parseUrl == null) {
            return null;
        }
        try {
            String fragment = parseUrl.getFragment();
            if (fragment == null) {
                return null;
            }
            int indexOf = fragment.indexOf("?");
            return indexOf != -1 ? fragment.substring(0, indexOf) : fragment;
        } catch (Throwable th) {
            RVLogger.d("AriverRes:SnapshotProvider", "getPagePathFromPageUrl error: ".concat(String.valueOf(th)));
            return "";
        }
    }

    @Nullable
    private static String a(App app, String str) {
        String str2;
        String str3 = "YES".equalsIgnoreCase(BundleUtils.getString(app.getStartParams(), RVParams.APPX_ROUTE_FRAMEWORK)) ? "appxV2_" : "appxV1_";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String userId = ((RVAccountService) RVProxy.get(RVAccountService.class)).getUserId();
        if (TextUtils.isEmpty(userId)) {
            userId = "000";
        }
        ISnapshotProxy iSnapshotProxy = (ISnapshotProxy) RVProxy.get(ISnapshotProxy.class, true);
        if (iSnapshotProxy != null) {
            str2 = iSnapshotProxy.getSnapshotExtDir(app);
        } else {
            str2 = RVResourceUtils.getExtDirectory((AppModel) app.getData(AppModel.class), true).getAbsolutePath();
        }
        if (str2 == null) {
            str2 = RVResourceUtils.getExtDirectory((AppModel) app.getData(AppModel.class), true).getAbsolutePath();
        }
        if (str2 == null) {
            return null;
        }
        String replace = str.replace('/', '_');
        StringBuilder sb = new StringBuilder("snapshot_");
        sb.append(str3);
        sb.append(replace);
        sb.append("_");
        sb.append(userId);
        sb.append("_index.snapshot.html");
        return new File(str2, sb.toString()).getAbsolutePath();
    }

    public static boolean isValidSnapshot(String str) {
        if (TextUtils.isEmpty(str)) {
            RVLogger.w("AriverRes:SnapshotProvider", "isValidSnapshot...invalid snapshot, string is null");
            return false;
        } else if (!str.contains("<div id=\"__react-content\">")) {
            RVLogger.w("AriverRes:SnapshotProvider", "isValidSnapshot...invalid snapshot, string has no root node");
            return false;
        } else if (str.contains("<div class=\"a-cp-loading-indicator\" aria-hidden=\"true\">") && str.contains("<div class=\"a-cp-loading-item\"></div>")) {
            RVLogger.w("AriverRes:SnapshotProvider", "isValidSnapshot...invalid snapshot, snapshot is loading view");
            return false;
        } else if (!str.contains("<div id=\"__react-content\"><div class=\"a-page tiny-page\"></div></div>\n")) {
            return true;
        } else {
            RVLogger.w("AriverRes:SnapshotProvider", "isValidSnapshot...invalid snapshot, dom tree no ready");
            return false;
        }
    }

    public static void writeToFile(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2), false);
            fileOutputStream.write(str.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
            RVLogger.d("AriverRes:SnapshotProvider", "saveSnapshot success, file: ".concat(String.valueOf(str2)));
        }
    }

    public static byte[] readFile(File file) {
        if (file.isFile()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[1024];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } catch (IOException e) {
                RVLogger.e("AriverRes:SnapshotProvider", "readFile，error:".concat(String.valueOf(e)));
                return null;
            }
        } else {
            RVLogger.e("AriverRes:SnapshotProvider", "readFile failed");
            return null;
        }
    }

    private static String a(App app) {
        AppConfigModel appConfigModel = (AppConfigModel) app.getData(AppConfigModel.class);
        if (appConfigModel == null || appConfigModel.getPages() == null || appConfigModel.getPages().size() <= 0) {
            return null;
        }
        return appConfigModel.getPages().get(0);
    }

    public static void handleSnapshotEvent(Page page) {
        if (page != null && !page.isExited() && page.getApp() != null && !page.getApp().isExited() && page.getEmbedType() == EmbedType.NO) {
            if (!isSnapshotEnabled(page.getApp())) {
                RVLogger.e("AriverRes:SnapshotProvider", "snapshot switch is disabled");
                return;
            }
            String pageURI = page.getPageURI();
            if (!isHomePage(page.getApp(), pageURI)) {
                RVLogger.e("AriverRes:SnapshotProvider", "handleSnapshotEvent non first page, pageUrl: ".concat(String.valueOf(pageURI)));
                return;
            }
            Render render = page.getRender();
            if (render != null) {
                render.triggerSaveSnapshot();
            }
        }
    }

    public static boolean isHomePage(App app, String str) {
        if (app != null && !TextUtils.isEmpty(app.getAppId()) && !TextUtils.isEmpty(str)) {
            String a2 = a(app);
            try {
                if (!TextUtils.isEmpty(a2) && str.contains("index.html#".concat(String.valueOf(a2)))) {
                    return true;
                }
            } catch (Exception e) {
                RVLogger.e("AriverRes:SnapshotProvider", "isHomePage.. e: ".concat(String.valueOf(e)));
            }
        }
        return false;
    }

    public static boolean isHomePage2(App app, String str) {
        if (!TextUtils.isEmpty(app.getAppId()) && !TextUtils.isEmpty(str)) {
            String a2 = a(app);
            try {
                if (!TextUtils.isEmpty(a2) && str.equals(a2)) {
                    return true;
                }
            } catch (Exception e) {
                RVLogger.e("AriverRes:SnapshotProvider", "isHomePage.. e: ".concat(String.valueOf(e)));
            }
        }
        return false;
    }
}
