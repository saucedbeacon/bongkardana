package com.alibaba.griver.file.jsapi;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.network.DownloadCallback;
import com.alibaba.griver.api.common.network.DownloadRequest;
import com.alibaba.griver.api.common.network.HttpRequest;
import com.alibaba.griver.api.common.network.HttpResponse;
import com.alibaba.griver.api.common.network.UploadRequest;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.network.GriverTransport;
import com.alibaba.griver.base.common.proxy.LocalIdTool;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.common.utils.FileCache;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import com.alibaba.griver.base.common.utils.OuterFileUtils;
import com.alibaba.griver.file.R;
import com.alibaba.griver.image.framework.api.APImageFormat;
import id.dana.lib.drawbitmap.invoice.InvoiceConstant;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

@Keep
public class FileMangerBridgeExtension extends SimpleBridgeExtension {
    private static final String BOUNDARY = "----WebKitFormBoundaryT1HoybnYeFOGFlBR";
    public static final int ERROR_CODE_DOWNLOAD_FAILED = 12;
    public static final int ERROR_CODE_DOWNLOAD_NO_PERMISSION = 13;
    public static final int ERROR_CODE_UPLOAD_FILE_FAILED = 12;
    public static final int ERROR_CODE_UPLOAD_FILE_NOT_EXIT = 11;
    public static final int ERROR_CODE_UPLOAD_FILE_NO_PERMISSION = 13;
    public static final int ERROR_WRITE_FILE_FAIL = 13;
    private static final String TAG = "FileMangerBridgeExtension";
    private static char[] getMax = {'I', 145, 138, 'v', 'o'};
    private static int setMax = 0;
    private static int setMin = 1;
    private FileCache cache;

    static /* synthetic */ Map access$000(Map map) {
        int i = setMin + 47;
        setMax = i % 128;
        if ((i % 2 != 0 ? 'a' : 1) != 'a') {
            return fixEmptyKeyHeader(map);
        }
        Map<String, List<String>> fixEmptyKeyHeader = fixEmptyKeyHeader(map);
        Object obj = null;
        super.hashCode();
        return fixEmptyKeyHeader;
    }

    @ThreadType(ExecutorType.NETWORK)
    @ActionFilter
    public void downloadFile(@BindingApiContext(required = true) ApiContext apiContext, @BindingNode(App.class) App app, @BindingParam(name = {"url"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        int i = setMin + 73;
        setMax = i % 128;
        int i2 = i % 2;
        Activity activity = apiContext.getActivity();
        if (activity == null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(12, "Context empty"));
        } else if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, activity.getString(R.string.griver_url_is_null)));
        } else {
            if (!(!str.startsWith("http"))) {
                downloadFileByHttp(activity, bridgeCallback, str, app);
                return;
            }
            try {
                int i3 = setMax + 11;
                try {
                    setMin = i3 % 128;
                    int i4 = i3 % 2;
                    downloadFileByBase64(activity, bridgeCallback, str, app);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    private void downloadFileByHttp(final Activity activity, final BridgeCallback bridgeCallback, String str, App app) {
        StringBuilder sb = new StringBuilder();
        sb.append(OuterFileUtils.getOuterRootFileDir(activity));
        sb.append(File.separator);
        sb.append(app.getAppId());
        File file = new File(sb.toString());
        if (!(file.exists())) {
            int i = setMin + 1;
            setMax = i % 128;
            int i2 = i % 2;
            file.mkdirs();
        }
        final File file2 = new File(file, String.valueOf(System.currentTimeMillis()));
        if ((file2.exists() ? 0 : '^') != '^') {
            try {
                int i3 = setMax + 85;
                try {
                    setMin = i3 % 128;
                    int i4 = i3 % 2;
                    file2.delete();
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        try {
            DownloadRequest downloadRequest = new DownloadRequest();
            downloadRequest.retryTime = 0;
            downloadRequest.downloadUrl = str;
            downloadRequest.downloadFilePath = file2.getAbsolutePath();
            downloadRequest.appId = app.getAppId();
            downloadRequest.version = AppInfoUtils.getDeveloperVersion((AppModel) app.getData(AppModel.class));
            downloadRequest.deployVersion = app.getAppVersion();
            GriverLogger.d(TAG, "start download file");
            GriverTransport.download(downloadRequest, new DownloadCallback() {
                public void onCancel(String str) {
                }

                public void onPrepare(String str) {
                }

                public void onProgress(String str, int i) {
                }

                public void onFinish(@Nullable String str) {
                    GriverLogger.d(FileMangerBridgeExtension.TAG, "download file success, path: ".concat(String.valueOf(str)));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("apFilePath", (Object) H5ResourceHandlerUtil.localIdToUrl(LocalIdTool.get().encodeToLocalId(file2.getPath()), H5ResourceHandlerUtil.IMAGE));
                    BridgeCallback bridgeCallback = bridgeCallback;
                    if (bridgeCallback != null && activity != null) {
                        bridgeCallback.sendJSONResponse(jSONObject);
                    }
                }

                public void onFailed(String str, int i, String str2) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.newError(12, activity.getString(R.string.griver_download_failed)));
                }
            });
            int i5 = setMin + 79;
            setMax = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception unused) {
            GriverLogger.e(TAG, "download file failed");
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(12, activity.getString(R.string.griver_download_failed)));
        }
    }

    private String getExtension(String str) {
        try {
            int i = setMax + 95;
            setMin = i % 128;
            int i2 = i % 2;
            boolean isEmpty = TextUtils.isEmpty(str);
            String str2 = APImageFormat.SUFFIX_PNG;
            if (!isEmpty) {
                try {
                    int i3 = setMax + 25;
                    setMin = i3 % 128;
                    int i4 = i3 % 2;
                    boolean z = false;
                    if (str.startsWith("image/gif")) {
                        str2 = APImageFormat.SUFFIX_GIF;
                    } else if (str.startsWith("image/png")) {
                        int i5 = setMax + 91;
                        setMin = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 83 / 0;
                        }
                    } else {
                        if (str.startsWith("image/jpg")) {
                            z = true;
                        }
                        if (z) {
                            str2 = APImageFormat.SUFFIX_JPG;
                        } else if (str.startsWith("image/x-icon")) {
                            int i7 = setMax + 53;
                            setMin = i7 % 128;
                            int i8 = i7 % 2;
                            str2 = "x-icon";
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            int i9 = setMax + 79;
            setMin = i9 % 128;
            int i10 = i9 % 2;
            return str2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void downloadFileByBase64(android.app.Activity r6, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r7, java.lang.String r8, com.alibaba.ariver.app.api.App r9) {
        /*
            r5 = this;
            int r0 = setMin
            int r0 = r0 + 59
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 81
            if (r0 == 0) goto L_0x0011
            r0 = 78
            goto L_0x0013
        L_0x0011:
            r0 = 81
        L_0x0013:
            java.lang.String r2 = "FileMangerBridgeExtension"
            r3 = 0
            if (r0 == r1) goto L_0x002c
            java.lang.String r0 = com.alibaba.griver.base.common.utils.ImageUtils.getMimeType(r8)     // Catch:{ Exception -> 0x002a }
            r5.getExtension(r0)     // Catch:{ Exception -> 0x002a }
            android.graphics.Bitmap r8 = com.alibaba.griver.base.common.utils.ImageUtils.base64ToBitmap(r8)     // Catch:{ Exception -> 0x002a }
            int r0 = r3.length     // Catch:{ Exception -> 0x0027, all -> 0x0025 }
            goto L_0x003e
        L_0x0025:
            r6 = move-exception
            throw r6
        L_0x0027:
            r0 = move-exception
            r3 = r8
            goto L_0x0038
        L_0x002a:
            r0 = move-exception
            goto L_0x0038
        L_0x002c:
            java.lang.String r0 = com.alibaba.griver.base.common.utils.ImageUtils.getMimeType(r8)     // Catch:{ Exception -> 0x002a }
            r5.getExtension(r0)     // Catch:{ Exception -> 0x002a }
            android.graphics.Bitmap r8 = com.alibaba.griver.base.common.utils.ImageUtils.base64ToBitmap(r8)     // Catch:{ Exception -> 0x002a }
            goto L_0x003e
        L_0x0038:
            java.lang.String r8 = "base64 to bitmap failed"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r2, r8, r0)
            r8 = r3
        L_0x003e:
            r0 = 27
            if (r8 != 0) goto L_0x0045
            r1 = 74
            goto L_0x0047
        L_0x0045:
            r1 = 27
        L_0x0047:
            if (r1 == r0) goto L_0x005c
            int r6 = setMax
            int r6 = r6 + 91
            int r8 = r6 % 128
            setMin = r8
            int r6 = r6 % 2
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r6 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.INVALID_PARAM     // Catch:{ Exception -> 0x0059 }
            r7.sendBridgeResponse(r6)     // Catch:{ Exception -> 0x0059 }
            return
        L_0x0059:
            r6 = move-exception
            goto L_0x00f3
        L_0x005c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.alibaba.griver.base.common.utils.OuterFileUtils.getOuterRootFileDir(r6)
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r9 = r9.getAppId()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            boolean r9 = r0.exists()
            if (r9 != 0) goto L_0x0086
            r0.mkdirs()
        L_0x0086:
            java.io.File r9 = new java.io.File
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r9.<init>(r0, r1)
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x009f
            r9.delete()     // Catch:{ Exception -> 0x009d }
            goto L_0x009f
        L_0x009d:
            r6 = move-exception
            throw r6
        L_0x009f:
            java.lang.String r9 = r9.getAbsolutePath()
            r0 = 1
            boolean r0 = com.alibaba.griver.base.common.utils.H5FileUtil.create(r9, r0)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x00d8
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject     // Catch:{ all -> 0x00d2 }
            r0.<init>()     // Catch:{ all -> 0x00d2 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x00d2 }
            com.alibaba.griver.base.common.utils.ImageUtils.writeImage(r8, r1, r9)     // Catch:{ all -> 0x00d2 }
            r8.getRowBytes()     // Catch:{ all -> 0x00d2 }
            r8.getHeight()     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = com.alibaba.griver.base.common.utils.AOMPFileTinyAppUtils.encodeToLocalId(r9)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "image"
            java.lang.String r8 = com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil.localIdToUrl(r8, r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "tempFilePath"
            r0.put((java.lang.String) r1, (java.lang.Object) r9)     // Catch:{ all -> 0x00d2 }
            java.lang.String r9 = "apFilePath"
            r0.put((java.lang.String) r9, (java.lang.Object) r8)     // Catch:{ all -> 0x00d2 }
            r7.sendJSONResponse(r0)     // Catch:{ all -> 0x00d2 }
            return
        L_0x00d2:
            r8 = move-exception
            java.lang.String r9 = "download file failed"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r2, r9, r8)
        L_0x00d8:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r8 = new com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error
            r9 = 13
            int r0 = com.alibaba.griver.file.R.string.griver_write_file_fail
            java.lang.String r6 = r6.getString(r0)
            r8.<init>(r9, r6)
            r7.sendBridgeResponse(r8)
            int r6 = setMax     // Catch:{ Exception -> 0x0059 }
            int r6 = r6 + 33
            int r7 = r6 % 128
            setMin = r7     // Catch:{ Exception -> 0x0059 }
            int r6 = r6 % 2
            return
        L_0x00f3:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.file.jsapi.FileMangerBridgeExtension.downloadFileByBase64(android.app.Activity, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback, java.lang.String, com.alibaba.ariver.app.api.App):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0128, code lost:
        if ((!r7 ? '%' : 12) != 12) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x012e, code lost:
        if (r7 == false) goto L_0x0130;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0114  */
    @com.alibaba.ariver.kernel.api.annotation.ThreadType(com.alibaba.ariver.kernel.common.service.executor.ExecutorType.NETWORK)
    @com.alibaba.ariver.kernel.api.annotation.ActionFilter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uploadFile(@com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext(required = true) com.alibaba.ariver.engine.api.bridge.model.ApiContext r17, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode(com.alibaba.ariver.app.api.App.class) com.alibaba.ariver.app.api.App r18, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"url"}) java.lang.String r19, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"filePath"}) java.lang.String r20, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"localId"}) java.lang.String r21, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"name"}) java.lang.String r22, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"type"}) java.lang.String r23, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"header"}) com.alibaba.fastjson.JSONObject r24, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"formData"}) com.alibaba.fastjson.JSONObject r25, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r26) {
        /*
            r16 = this;
            r0 = r26
            int r1 = setMax
            int r1 = r1 + 63
            int r2 = r1 % 128
            setMin = r2
            r2 = 2
            int r1 = r1 % r2
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            if (r1 == r4) goto L_0x0024
            boolean r1 = com.alibaba.griver.base.common.utils.BridgeUtils.contextIsValid(r26)     // Catch:{ Exception -> 0x0021 }
            if (r1 != 0) goto L_0x001c
            goto L_0x002e
        L_0x001c:
            r1 = r18
            r8 = r19
            goto L_0x002f
        L_0x0021:
            r0 = move-exception
            goto L_0x01d5
        L_0x0024:
            boolean r1 = com.alibaba.griver.base.common.utils.BridgeUtils.contextIsValid(r26)
            r5 = 0
            super.hashCode()     // Catch:{ all -> 0x01d6 }
            if (r1 != 0) goto L_0x001c
        L_0x002e:
            return
        L_0x002f:
            boolean r5 = com.alibaba.griver.base.common.utils.RequestAPIConfigUtils.canSendRequest((com.alibaba.ariver.app.api.App) r1, (java.lang.String) r8, (com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback) r0)
            if (r5 != 0) goto L_0x0036
            return
        L_0x0036:
            android.app.Application r5 = com.alibaba.griver.base.common.env.GriverEnv.getApplicationContext()
            boolean r6 = android.text.TextUtils.isEmpty(r20)
            if (r6 == 0) goto L_0x004c
            int r6 = setMax
            int r6 = r6 + 125
            int r7 = r6 % 128
            setMin = r7
            int r6 = r6 % r2
            r6 = r21
            goto L_0x004e
        L_0x004c:
            r6 = r20
        L_0x004e:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x006a
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r1 = new com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error
            r2 = 11
            int r3 = com.alibaba.griver.file.R.string.griver_file_path_is_empty
            java.lang.String r3 = r5.getString(r3)
            r1.<init>(r2, r3)
            r0.sendBridgeResponse(r1)
            java.lang.String r0 = "UploadFile filePath null"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r0)
            return
        L_0x006a:
            boolean r7 = com.alibaba.griver.base.common.utils.TinyAppFileUtils.isLocalPath(r6)     // Catch:{ Exception -> 0x0021 }
            if (r7 == 0) goto L_0x0072
            r7 = 1
            goto L_0x0073
        L_0x0072:
            r7 = 0
        L_0x0073:
            r9 = 12
            r10 = 15
            java.lang.String r11 = ""
            if (r7 == 0) goto L_0x0136
            java.lang.String r7 = "mini_upload_app_white_list"
            java.lang.String r7 = com.alibaba.griver.base.common.config.GriverConfig.getConfig(r7, r11)
            boolean r12 = android.text.TextUtils.isEmpty(r7)
            if (r12 != 0) goto L_0x00b9
            java.lang.String r12 = ","
            java.lang.String[] r7 = r7.split(r12)
            java.lang.String r1 = r18.getAppId()
            int r12 = r7.length
            r13 = 0
        L_0x0093:
            if (r13 >= r12) goto L_0x00b9
            r14 = r7[r13]
            boolean r14 = android.text.TextUtils.equals(r14, r1)
            r15 = 75
            if (r14 == 0) goto L_0x00a2
            r14 = 31
            goto L_0x00a4
        L_0x00a2:
            r14 = 75
        L_0x00a4:
            if (r14 == r15) goto L_0x00b6
            int r1 = setMax
            int r1 = r1 + 73
            int r7 = r1 % 128
            setMin = r7
            int r1 = r1 % r2
            if (r1 != 0) goto L_0x00b3
            r1 = 0
            goto L_0x00b4
        L_0x00b3:
            r1 = 1
        L_0x00b4:
            r1 = 1
            goto L_0x00ba
        L_0x00b6:
            int r13 = r13 + 1
            goto L_0x0093
        L_0x00b9:
            r1 = 0
        L_0x00ba:
            if (r1 != 0) goto L_0x0111
            java.lang.String r7 = "mini_upload_local_path_white_list"
            java.lang.String r7 = com.alibaba.griver.base.common.config.GriverConfig.getConfig(r7, r11)
            com.alibaba.fastjson.JSONArray r7 = com.alibaba.ariver.kernel.common.utils.JSONUtils.parseArray(r7)
            if (r7 == 0) goto L_0x00ca
            r12 = 1
            goto L_0x00cb
        L_0x00ca:
            r12 = 0
        L_0x00cb:
            if (r12 == 0) goto L_0x0111
            int r12 = setMax
            r13 = 13
            int r12 = r12 + r13
            int r14 = r12 % 128
            setMin = r14
            int r12 = r12 % r2
            boolean r12 = r7.isEmpty()
            if (r12 != 0) goto L_0x0111
            int r12 = setMax
            int r12 = r12 + r10
            int r14 = r12 % 128
            setMin = r14
            int r12 = r12 % r2
            if (r12 != 0) goto L_0x00f0
            java.util.Iterator r7 = r7.iterator()
            int r13 = r13 / r3
            goto L_0x00f4
        L_0x00ed:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00f0:
            java.util.Iterator r7 = r7.iterator()
        L_0x00f4:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x0111
            java.lang.Object r12 = r7.next()
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x00f4
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = r6.contains(r12)
            if (r12 == 0) goto L_0x010c
            r12 = 0
            goto L_0x010d
        L_0x010c:
            r12 = 1
        L_0x010d:
            if (r12 == r4) goto L_0x00f4
            r7 = 1
            goto L_0x0112
        L_0x0111:
            r7 = 0
        L_0x0112:
            if (r1 != 0) goto L_0x0136
            int r1 = setMax
            int r1 = r1 + 71
            int r12 = r1 % 128
            setMin = r12
            int r1 = r1 % r2
            if (r1 != 0) goto L_0x012e
            r1 = 6
            int r1 = r1 / r3
            if (r7 != 0) goto L_0x0126
            r1 = 37
            goto L_0x0128
        L_0x0126:
            r1 = 12
        L_0x0128:
            if (r1 == r9) goto L_0x0136
            goto L_0x0130
        L_0x012b:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x012e:
            if (r7 != 0) goto L_0x0136
        L_0x0130:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r1 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.INVALID_PARAM
            r0.sendBridgeResponse(r1)
            return
        L_0x0136:
            java.lang.String r1 = com.alibaba.griver.base.common.utils.AOMPFileTinyAppUtils.getLocalPathFromId(r6)
            boolean r6 = com.alibaba.griver.base.common.utils.TinyAppFileUtils.containsRelativeParentPath(r6)
            if (r6 == 0) goto L_0x0143
            r6 = 97
            goto L_0x0145
        L_0x0143:
            r6 = 15
        L_0x0145:
            if (r6 == r10) goto L_0x016d
            int r1 = setMax
            int r1 = r1 + 33
            int r4 = r1 % 128
            setMin = r4
            int r1 = r1 % r2
            r2 = 89
            if (r1 != 0) goto L_0x0157
            r1 = 89
            goto L_0x0159
        L_0x0157:
            r1 = 8
        L_0x0159:
            if (r1 == r2) goto L_0x0161
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r1 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.INVALID_PARAM     // Catch:{ Exception -> 0x0021 }
            r0.sendBridgeResponse(r1)     // Catch:{ Exception -> 0x0021 }
            return
        L_0x0161:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r1 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.INVALID_PARAM
            r0.sendBridgeResponse(r1)
            r0 = 28
            int r0 = r0 / r3
            return
        L_0x016a:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x016d:
            boolean r6 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x01d2 }
            if (r6 != 0) goto L_0x017f
            java.lang.String r6 = "file://"
            boolean r7 = r1.startsWith(r6)
            if (r7 == 0) goto L_0x017f
            java.lang.String r1 = r1.replaceAll(r6, r11)
        L_0x017f:
            r6 = r1
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x01be
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r6.split(r1)
            int r1 = r1.length
            if (r1 < r2) goto L_0x01be
            boolean r1 = android.text.TextUtils.isEmpty(r23)
            if (r1 != 0) goto L_0x0196
            goto L_0x0197
        L_0x0196:
            r3 = 1
        L_0x0197:
            if (r3 == 0) goto L_0x019a
            goto L_0x01be
        L_0x019a:
            int r1 = setMax
            int r1 = r1 + 83
            int r3 = r1 % 128
            setMin = r3
            int r1 = r1 % r2
            boolean r1 = android.text.TextUtils.isEmpty(r19)
            if (r1 == 0) goto L_0x01aa
            goto L_0x01be
        L_0x01aa:
            r1 = r16
            r2 = r5
            r3 = r26
            r4 = r25
            r5 = r6
            r6 = r22
            r7 = r23
            r8 = r19
            r9 = r24
            r1.uploadFileByHttp(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x01be:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r1 = new com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error
            int r2 = com.alibaba.griver.file.R.string.griver_argument_error
            java.lang.String r2 = r5.getString(r2)
            r1.<init>(r9, r2)
            r0.sendBridgeResponse(r1)
            java.lang.String r0 = "UploadFile arguments error"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r0)
            return
        L_0x01d2:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x01d5:
            throw r0
        L_0x01d6:
            r0 = move-exception
            r1 = r0
            goto L_0x01da
        L_0x01d9:
            throw r1
        L_0x01da:
            goto L_0x01d9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.file.jsapi.FileMangerBridgeExtension.uploadFile(com.alibaba.ariver.engine.api.bridge.model.ApiContext, com.alibaba.ariver.app.api.App, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }

    private void uploadFileByHttp(Context context, BridgeCallback bridgeCallback, Map<String, Object> map, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        Iterator<String> it;
        final Context context2 = context;
        final BridgeCallback bridgeCallback2 = bridgeCallback;
        Map<String, Object> map2 = map;
        String str5 = str;
        try {
            File file = new File(str5);
            String[] split = str5.split(File.separator);
            int i = 2;
            if (split.length >= 2) {
                str5 = split[split.length - 1];
            }
            StringBuilder sb = new StringBuilder();
            if (map2 != null) {
                if (!map.isEmpty()) {
                    int i2 = setMax + 39;
                    setMin = i2 % 128;
                    if (i2 % 2 == 0) {
                        it = map.keySet().iterator();
                        try {
                            int i3 = 10 / 0;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        it = map.keySet().iterator();
                    }
                    while (it.hasNext()) {
                        int i4 = setMax + 37;
                        setMin = i4 % 128;
                        int i5 = i4 % i;
                        String next = it.next();
                        if (map2.get(next) != null) {
                            String obj = map2.get(next).toString();
                            sb.append("------WebKitFormBoundaryT1HoybnYeFOGFlBR\r\n");
                            StringBuilder sb2 = new StringBuilder("Content-Disposition: form-data; name=\"");
                            sb2.append(next);
                            sb2.append("\"\r\n");
                            sb.append(sb2.toString());
                            sb.append("\r\n");
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(obj);
                            sb3.append("\r\n");
                            sb.append(sb3.toString());
                        }
                        i = 2;
                    }
                }
            }
            sb.append("------WebKitFormBoundaryT1HoybnYeFOGFlBR\r\n");
            StringBuilder sb4 = new StringBuilder("Content-Disposition: form-data; name=\"");
            sb4.append(str2);
            sb4.append("\"; filename=\"");
            sb4.append(str5);
            sb4.append("\"\r\n");
            sb.append(sb4.toString());
            if (TextUtils.equals(str3, "video")) {
                sb.append("Content-Type: video/mp4;\r\n");
            }
            sb.append("\r\n");
            byte[] bytes = sb.toString().getBytes(getMin(new int[]{0, 5, 61, 0}, !TextUtils.equals("", ""), new byte[]{0, 1, 0, 1, 1}).intern());
            byte[] bytes2 = "\r\n------WebKitFormBoundaryT1HoybnYeFOGFlBR--\r\n".getBytes(getMin(new int[]{0, 5, 61, 0}, !Process.supportsProcesses(), new byte[]{0, 1, 0, 1, 1}).intern());
            final HttpRequest httpRequest = new HttpRequest();
            httpRequest.setMethod("POST");
            httpRequest.setUrl(str4);
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundaryT1HoybnYeFOGFlBR");
            hashMap.put("Content-Length", String.valueOf(((long) bytes.length) + file.length() + ((long) bytes2.length)));
            if (jSONObject != null) {
                int i6 = setMax + 33;
                setMin = i6 % 128;
                int i7 = i6 % 2;
                Iterator<Map.Entry<String, Object>> it2 = jSONObject.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry next2 = it2.next();
                    hashMap.put(next2.getKey(), (String) next2.getValue());
                }
            }
            httpRequest.setHeaders(hashMap);
            UploadRequest uploadRequest = new UploadRequest();
            uploadRequest.setHeaders(bytes);
            uploadRequest.setEnds(bytes2);
            uploadRequest.setInputStream(new FileInputStream(file));
            httpRequest.setUploadRequest(uploadRequest);
            try {
                GriverExecutors.getExecutor(ExecutorType.NETWORK).execute(new Runnable() {
                    public void run() {
                        List list;
                        HttpResponse request = GriverTransport.request(httpRequest);
                        if (request == null || request.getStatusCode() != 200) {
                            bridgeCallback2.sendBridgeResponse(new BridgeResponse.Error(12, context2.getString(R.string.griver_upload_network_failed)));
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("statusCode", (Object) String.valueOf(request.getStatusCode()));
                        jSONObject.put("data", (Object) IOUtils.read(request.getInputStream()));
                        Map access$000 = FileMangerBridgeExtension.access$000(request.getHeaders());
                        HashMap hashMap = new HashMap();
                        for (String str : access$000.keySet()) {
                            if (!(str == null || (list = (List) access$000.get(str)) == null || list.size() <= 0)) {
                                hashMap.put(str, list.get(0));
                            }
                        }
                        jSONObject.put(InvoiceConstant.HEADER, (Object) hashMap);
                        jSONObject.put("success", (Object) Boolean.TRUE);
                        GriverLogger.d(FileMangerBridgeExtension.TAG, "upload file result: ".concat(String.valueOf(jSONObject)));
                        bridgeCallback2.sendJSONResponse(jSONObject);
                    }
                });
            } catch (Exception e) {
                e = e;
                GriverLogger.e(TAG, "upload file by http failed", e);
                bridgeCallback2.sendBridgeResponse(new BridgeResponse.Error(12, context2.getString(R.string.griver_upload_network_failed)));
            }
        } catch (Exception e2) {
            e = e2;
            GriverLogger.e(TAG, "upload file by http failed", e);
            bridgeCallback2.sendBridgeResponse(new BridgeResponse.Error(12, context2.getString(R.string.griver_upload_network_failed)));
        }
    }

    private static Map<String, List<String>> fixEmptyKeyHeader(Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            try {
                if ((it.hasNext() ? (char) 27 : 1) != 27) {
                    return hashMap;
                }
                try {
                    String next = it.next();
                    if (!TextUtils.isEmpty(next)) {
                        int i = setMax + 101;
                        setMin = i % 128;
                        int i2 = i % 2;
                        hashMap.put(next, map.get(next));
                        int i3 = setMin + 45;
                        setMax = i3 % 128;
                        int i4 = i3 % 2;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    private static String getMin(int[] iArr, boolean z, byte[] bArr) {
        int i;
        char[] cArr;
        char c;
        char[] cArr2;
        int i2 = setMin + 81;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        try {
            char[] cArr3 = new char[i5];
            try {
                System.arraycopy(getMax, i4, cArr3, 0, i5);
                if (bArr != null) {
                    int i8 = setMin + 45;
                    setMax = i8 % 128;
                    if (i8 % 2 != 0) {
                        cArr2 = new char[i5];
                        c = 1;
                    } else {
                        cArr2 = new char[i5];
                        c = 0;
                    }
                    int i9 = 0;
                    while (true) {
                        if ((i9 < i5 ? '+' : Typography.dollar) != '+') {
                            break;
                        }
                        int i10 = setMin + 123;
                        setMax = i10 % 128;
                        if ((i10 % 2 != 0 ? (char) 23 : 21) == 23 ? bArr[i9] != 1 : bArr[i9] != 1) {
                            cArr2[i9] = (char) ((cArr3[i9] << 1) - c);
                        } else {
                            cArr2[i9] = (char) (((cArr3[i9] << 1) + 1) - c);
                        }
                        c = cArr2[i9];
                        i9++;
                        int i11 = setMax + 93;
                        setMin = i11 % 128;
                        int i12 = i11 % 2;
                    }
                    cArr3 = cArr2;
                }
                if (i7 > 0) {
                    char[] cArr4 = new char[i5];
                    System.arraycopy(cArr3, 0, cArr4, 0, i5);
                    int i13 = i5 - i7;
                    System.arraycopy(cArr4, 0, cArr3, i13, i7);
                    System.arraycopy(cArr4, i7, cArr3, 0, i13);
                }
                if (z) {
                    int i14 = setMin + 101;
                    setMax = i14 % 128;
                    if (i14 % 2 != 0) {
                        cArr = new char[i5];
                        i = 1;
                    } else {
                        cArr = new char[i5];
                        i = 0;
                    }
                    while (i < i5) {
                        cArr[i] = cArr3[(i5 - i) - 1];
                        i++;
                    }
                    cArr3 = cArr;
                }
                if ((i6 > 0 ? 22 : 'c') == 22) {
                    int i15 = setMax + 7;
                    setMin = i15 % 128;
                    int i16 = i15 % 2;
                    for (int i17 = 0; i17 < i5; i17++) {
                        cArr3[i17] = (char) (cArr3[i17] - iArr[2]);
                    }
                }
                return new String(cArr3);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
