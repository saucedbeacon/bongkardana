package com.alibaba.griver.file.jsapi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.Remote;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.proxy.RVFileAbilityProxy;
import com.alibaba.griver.base.common.utils.AOMPFileTinyAppUtils;
import com.alibaba.griver.base.common.utils.CommonUtils;
import com.alibaba.griver.base.common.utils.DiskUtil;
import com.alibaba.griver.base.common.utils.FileCache;
import com.alibaba.griver.base.common.utils.H5FileUtil;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import com.alibaba.griver.base.common.utils.H5SecurityUtil;
import com.alibaba.griver.base.common.utils.TinyAppFileUtils;
import com.alibaba.griver.file.R;
import com.alibaba.griver.file.utils.DownloadFileHandle;
import com.alibaba.griver.image.photo.PhotoContext;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class FileBridgeExtension implements BridgeExtension, NodeAware<App> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9093a = FileBridgeExtension.class.getSimpleName();
    private static String f;
    private Map<String, DownloadFileHandle> b = new ConcurrentHashMap();
    private FileCache c;
    private String d;
    private String e;

    public void onFinalized() {
    }

    public Permission permit() {
        return null;
    }

    public static boolean deleteFile(File file, String str) {
        if (file == null || !file.exists()) {
            return false;
        }
        try {
            String canonicalPath = file.getCanonicalPath();
            if (TextUtils.equals(canonicalPath, "/")) {
                return false;
            }
            try {
                String absolutePath = file.getAbsolutePath();
                if (TextUtils.equals(absolutePath, "/")) {
                    return false;
                }
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (!absolutePath.startsWith(str) && !canonicalPath.startsWith(str)) {
                            return false;
                        }
                    } catch (Exception e2) {
                        RVLogger.e(f9093a, (Throwable) e2);
                    }
                }
                return file.delete();
            } catch (Exception e3) {
                RVLogger.e(f9093a, (Throwable) e3);
                return false;
            }
        } catch (Exception e4) {
            RVLogger.e(f9093a, (Throwable) e4);
            return false;
        }
    }

    public static boolean isInAccessExternalPathWhiteList(Bundle bundle) {
        String config = GriverConfig.getConfig(GriverConfigConstants.KEY_ACCESS_EXTERNAL_PATH_WHITE_LIST, "");
        String string = BundleUtils.getString(bundle, "appId");
        if (!TextUtils.isEmpty(config) && !TextUtils.isEmpty(string)) {
            if (TextUtils.equals(config, "all")) {
                return true;
            }
            if (TextUtils.equals(config, "none")) {
                return false;
            }
            try {
                for (String trim : config.split(",")) {
                    if (string.equals(trim.trim())) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                GriverLogger.e(f9093a, "is in access external path white list exception", th);
            }
        }
        return false;
    }

    private static boolean a(JSONObject jSONObject, Context context) {
        try {
            String string = jSONObject.getString("tempFilePath");
            if (!TextUtils.isEmpty(string) && string.startsWith(PhotoContext.FILE_SCHEME)) {
                string = string.replaceAll(PhotoContext.FILE_SCHEME, "");
            }
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            File file = new File(string);
            if (!file.exists()) {
                return false;
            }
            if (TextUtils.isEmpty(f)) {
                f = context.getFilesDir().getParentFile().getCanonicalPath();
            }
            if (file.getCanonicalPath().startsWith(f)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            GriverLogger.e(f9093a, "limitAccessExternalStorage", th);
            return true;
        }
    }

    @ThreadType(ExecutorType.IO)
    @ActionFilter
    @Remote
    public void saveFile(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        JSONObject jSONObject2 = new JSONObject();
        String a2 = a(jSONObject, "tempFilePath");
        if (TextUtils.isEmpty(a2)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else if (TinyAppFileUtils.containsRelativeParentPath(a2)) {
            GriverLogger.w(f9093a, "tempFilePath has .. to traverse, forbidden");
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else if (a(jSONObject, (Context) apiContext.getActivity()) && !isInAccessExternalPathWhiteList(apiContext.getStartParams())) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(11, "not have permission to access external storage"));
        } else if (a(apiContext.getAppContext(), a2)) {
            jSONObject2.put("error", (Object) 19);
            jSONObject2.put("errorMessage", (Object) apiContext.getAppContext().getString(R.string.griver_exceed_file_size_limit));
            bridgeCallback.sendJSONResponse(jSONObject2);
        } else if (!a(a2)) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "not have permission to save"));
        } else {
            String cachePath = a().getCachePath(apiContext.getAppContext(), a2);
            boolean copy = H5FileUtil.copy(a2, cachePath, true);
            RVLogger.d(f9093a, "saveFile..result:".concat(String.valueOf(copy)));
            if (copy) {
                String a3 = a(cachePath, b(CommonUtils.getString(jSONObject, "apFilePath")));
                String str = f9093a;
                StringBuilder sb = new StringBuilder("apFilePath ");
                sb.append(a3);
                sb.append(" savedFilePath ");
                sb.append(cachePath);
                RVLogger.d(str, sb.toString());
                jSONObject2.put("apFilePath", (Object) a3);
                bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject2));
                return;
            }
            jSONObject2.put("error", (Object) 13);
            jSONObject2.put("errorMessage", (Object) apiContext.getAppContext().getString(R.string.griver_save_file_failed));
            bridgeCallback.sendJSONResponse(jSONObject2);
        }
    }

    private boolean a(String str) {
        File file = new File(str);
        RVFileAbilityProxy rVFileAbilityProxy = (RVFileAbilityProxy) RVProxy.get(RVFileAbilityProxy.class);
        if (rVFileAbilityProxy == null) {
            return false;
        }
        try {
            return rVFileAbilityProxy.hasFolderPermission(file.getCanonicalPath());
        } catch (IOException unused) {
            return false;
        }
    }

    @ThreadType(ExecutorType.IO)
    @ActionFilter
    @Remote
    public void getFileInfo(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        String str;
        String string = CommonUtils.getString(jSONObject, "filePath");
        if (TextUtils.isEmpty(string)) {
            string = CommonUtils.getString(jSONObject, "apFilePath");
        }
        if (TextUtils.isEmpty(string)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else if (TinyAppFileUtils.containsRelativeParentPath(string)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            String string2 = CommonUtils.getString(jSONObject, "digestAlgorithm");
            if (TextUtils.isEmpty(string2)) {
                string2 = "md5";
            }
            if (TextUtils.equals("md5", string2) || TextUtils.equals("sha1", string2)) {
                try {
                    String string3 = CommonUtils.getString(jSONObject, "filePath");
                    if (TextUtils.isEmpty(string3)) {
                        String string4 = CommonUtils.getString(jSONObject, "apFilePath");
                        if (!TextUtils.isEmpty(string4)) {
                            str = string4.startsWith(H5ResourceHandlerUtil.RESOURCE) ? a(jSONObject, "filePath") : a(apiContext, string4, jSONObject);
                        } else {
                            str = "";
                        }
                    } else if (string3.startsWith(H5ResourceHandlerUtil.RESOURCE)) {
                        jSONObject.remove("filePath");
                        jSONObject.put("apFilePath", (Object) string3);
                        str = a(jSONObject, "filePath");
                    } else {
                        str = a(apiContext, string3, jSONObject);
                    }
                    if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("error", (Object) 12);
                        jSONObject2.put("errorMessage", (Object) apiContext.getAppContext().getString(R.string.griver_file_not_exist));
                        bridgeCallback.sendJSONResponse(jSONObject2);
                        return;
                    }
                    String str2 = null;
                    if ("md5".equals(string2)) {
                        str2 = H5FileUtil.getFileMD5(str);
                    } else if ("sha1".equals(string2)) {
                        str2 = H5FileUtil.getFileSHA1(str);
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    if (TextUtils.isEmpty(str2)) {
                        jSONObject3.put("error", (Object) 17);
                        jSONObject3.put("errorMessage", (Object) apiContext.getAppContext().getString(R.string.griver_compute_digest_failed));
                    } else {
                        jSONObject3.put(GriverMonitorConstants.KEY_SIZE, (Object) Long.valueOf(H5FileUtil.size(str)));
                        jSONObject3.put("digest", (Object) str2);
                    }
                    bridgeCallback.sendJSONResponse(jSONObject3);
                    RVLogger.d(f9093a, "getFileInfo...");
                } catch (Exception e2) {
                    String str3 = f9093a;
                    StringBuilder sb = new StringBuilder("getFileInfo exception");
                    sb.append(e2.toString());
                    RVLogger.d(str3, sb.toString());
                }
            } else {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("error", (Object) 16);
                jSONObject4.put("errorMessage", (Object) apiContext.getAppContext().getString(R.string.griver_digest_algorithm_only_support_md5_or_sha1));
                bridgeCallback.sendJSONResponse(jSONObject4);
            }
        }
    }

    private String a(ApiContext apiContext, String str, JSONObject jSONObject) {
        String userId = AOMPFileTinyAppUtils.getUserId();
        if (TextUtils.isEmpty(userId)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("usr/");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.d);
        sb2.append(userId);
        sb.append(H5SecurityUtil.getMD5(sb2.toString()));
        String obj = sb.toString();
        String subPath = a().getSubPath();
        if (str.startsWith("https://usr/")) {
            String subDir = DiskUtil.getSubDir(apiContext.getAppContext(), obj);
            if (TextUtils.isEmpty(subDir)) {
                return null;
            }
            if (str.length() == 12) {
                return subDir;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(subDir);
            sb3.append("/");
            sb3.append(str.substring(12));
            return sb3.toString();
        } else if (str.contains(obj) || (!TextUtils.isEmpty(subPath) && str.contains(subPath))) {
            return str;
        } else {
            return null;
        }
    }

    @ThreadType(ExecutorType.IO)
    @ActionFilter
    @Remote
    public void getSavedFileInfo(@BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        String string = CommonUtils.getString(jSONObject, "filePath");
        if (TextUtils.isEmpty(string)) {
            string = CommonUtils.getString(jSONObject, "apFilePath");
        }
        if (TinyAppFileUtils.containsRelativeParentPath(string)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        String a2 = a(jSONObject, "filePath");
        if (TextUtils.isEmpty(a2)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else if (!a2.contains(a().getSubPath())) {
            jSONObject2.put("error", (Object) 12);
            jSONObject2.put("errorMessage", (Object) GriverEnv.getApplicationContext().getString(R.string.griver_file_not_exist));
            bridgeCallback.sendJSONResponse(jSONObject2);
        } else {
            long size = H5FileUtil.size(a2);
            long createTime = H5FileUtil.getCreateTime(a2);
            String str = f9093a;
            StringBuilder sb = new StringBuilder("filePath:");
            sb.append(a2);
            sb.append("size : ");
            sb.append(size);
            sb.append(", createTime: ");
            sb.append(createTime);
            RVLogger.d(str, sb.toString());
            if (size == 0 || createTime == 0) {
                jSONObject2.put("error", (Object) 12);
                bridgeCallback.sendJSONResponse(jSONObject2);
                return;
            }
            jSONObject2.put("success", (Object) Boolean.TRUE);
            jSONObject2.put(GriverMonitorConstants.KEY_SIZE, (Object) Long.valueOf(size));
            jSONObject2.put("createTime", (Object) Long.valueOf(createTime));
            bridgeCallback.sendJSONResponse(jSONObject2);
        }
    }

    @ThreadType(ExecutorType.IO)
    @ActionFilter
    @Remote
    public void removeSavedFile(@BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        String string = CommonUtils.getString(jSONObject, "filePath");
        if (TextUtils.isEmpty(string)) {
            string = CommonUtils.getString(jSONObject, "apFilePath");
        }
        if (TinyAppFileUtils.containsRelativeParentPath(string)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        String a2 = a(jSONObject, "filePath");
        if (TextUtils.isEmpty(a2)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else if (!a2.contains(a().getSubPath())) {
            jSONObject2.put("error", (Object) 12);
            jSONObject2.put("errorMessage", (Object) GriverEnv.getApplicationContext().getString(R.string.griver_file_not_exist));
            bridgeCallback.sendJSONResponse(jSONObject2);
        } else {
            boolean delete = H5FileUtil.delete(a2);
            if (delete) {
                String str = f9093a;
                StringBuilder sb = new StringBuilder("filePath is ");
                sb.append(a2);
                sb.append(", result is ");
                sb.append(delete);
                RVLogger.d(str, sb.toString());
                jSONObject2.put("success", (Object) Boolean.TRUE);
                bridgeCallback.sendJSONResponse(jSONObject2);
                return;
            }
            jSONObject2.put("error", (Object) 15);
            jSONObject2.put("errorMessage", (Object) GriverEnv.getApplicationContext().getString(R.string.griver_delete_file_failed));
            bridgeCallback.sendJSONResponse(jSONObject2);
        }
    }

    @ThreadType(ExecutorType.IO)
    @ActionFilter
    @Remote
    public void getSavedFileList(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        JSONObject jSONObject = new JSONObject();
        String cacheDir = a().getCacheDir(apiContext.getAppContext());
        RVLogger.d(f9093a, "getSavedFileList...".concat(String.valueOf(cacheDir)));
        File file = new File(cacheDir);
        JSONArray jSONArray = new JSONArray();
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    String path = file2.getPath();
                    String a2 = a(path, b(path));
                    JSONObject jSONObject2 = new JSONObject();
                    long size = H5FileUtil.size(file2);
                    long createTime = H5FileUtil.getCreateTime(path);
                    jSONObject2.put(GriverMonitorConstants.KEY_SIZE, (Object) Long.valueOf(size));
                    jSONObject2.put("apFilePath", (Object) a2);
                    jSONObject2.put("createTime", (Object) Long.valueOf(createTime));
                    jSONArray.add(jSONObject2);
                }
                jSONObject.put("success", (Object) Boolean.TRUE);
                jSONObject.put("fileList", (Object) jSONArray);
                bridgeCallback.sendJSONResponse(jSONObject);
                return;
            }
            jSONObject.put("error", (Object) 12);
            jSONObject.put("errorMessage", (Object) GriverEnv.getApplicationContext().getString(R.string.griver_file_not_exist));
            bridgeCallback.sendJSONResponse(jSONObject);
            return;
        }
        jSONObject.put("success", (Object) Boolean.TRUE);
        jSONObject.put("fileList", (Object) jSONArray);
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    private String a(String str, String str2) {
        String encodeToLocalId = AOMPFileTinyAppUtils.encodeToLocalId(str);
        String mimeType = H5FileUtil.getMimeType(str);
        if (!TextUtils.isEmpty(mimeType)) {
            str2 = mimeType;
        }
        if (str2 != null && str2.startsWith(H5ResourceHandlerUtil.IMAGE)) {
            return H5ResourceHandlerUtil.localIdToUrl(encodeToLocalId, H5ResourceHandlerUtil.IMAGE);
        }
        if (str2 != null && str2.startsWith("audio")) {
            return H5ResourceHandlerUtil.localIdToUrl(encodeToLocalId, "audio");
        }
        if (str2 == null || !str2.startsWith("video")) {
            return H5ResourceHandlerUtil.localIdToUrl(encodeToLocalId, H5ResourceHandlerUtil.OTHER);
        }
        return H5ResourceHandlerUtil.localIdToUrl(encodeToLocalId, "video");
    }

    private String b(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(".")) == -1) {
            return null;
        }
        String substring = str.substring(lastIndexOf + 1);
        RVLogger.d(f9093a, "filePath suffix: ".concat(String.valueOf(substring)));
        return substring;
    }

    private String a(JSONObject jSONObject, String str) {
        String string = CommonUtils.getString(jSONObject, str);
        if (TextUtils.isEmpty(string)) {
            string = CommonUtils.getString(jSONObject, "apFilePath");
            if (!TextUtils.isEmpty(string)) {
                string = AOMPFileTinyAppUtils.getLocalPathFromId(string);
            }
        }
        if (!TextUtils.isEmpty(string) && string.startsWith(PhotoContext.FILE_SCHEME)) {
            string = string.replaceAll(PhotoContext.FILE_SCHEME, "");
        }
        if (TextUtils.isEmpty(string) || !H5FileUtil.exists(string)) {
            return null;
        }
        return string;
    }

    private boolean a(Context context, String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.getMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 32);
                onCancelLoad.setMax(1968478113, oncanceled);
                onCancelLoad.getMin(1968478113, oncanceled);
            }
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long c2 = c(a().getCacheDir(context));
        long length2 = new File(str).length();
        String str2 = f9093a;
        StringBuilder sb = new StringBuilder("checkFolderSizeLimited appendSize=");
        sb.append(length2);
        sb.append(",folderSize=");
        sb.append(c2);
        RVLogger.d(str2, sb.toString());
        if (c2 + length2 <= 10485760) {
            return false;
        }
        RVLogger.d(f9093a, "checkFolderSizeLimited file exceed limited size");
        return true;
    }

    private long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return a(new File(str));
    }

    private long a(File file) {
        long j;
        long j2 = 0;
        if (file == null) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        try {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    j = a(file2);
                } else {
                    j = file2.length();
                }
                j2 += j;
            }
        } catch (Throwable th) {
            RVLogger.e(f9093a, "getFolderSize...e = ".concat(String.valueOf(th)));
        }
        return j2;
    }

    private FileCache a() {
        if (this.c == null) {
            this.c = new FileCache(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext(), this.d, this.e);
        }
        return this.c;
    }

    public void onInitialized() {
        RVFileAbilityProxy rVFileAbilityProxy = (RVFileAbilityProxy) RVProxy.get(RVFileAbilityProxy.class);
        if (rVFileAbilityProxy != null) {
            this.e = rVFileAbilityProxy.getUserId();
        }
    }

    public void setNode(WeakReference<App> weakReference) {
        if (weakReference.get() != null) {
            this.d = weakReference.get().getAppId();
        }
    }

    public Class<App> getNodeType() {
        return App.class;
    }
}
