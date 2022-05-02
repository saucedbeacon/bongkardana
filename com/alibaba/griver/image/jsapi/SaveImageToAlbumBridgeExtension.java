package com.alibaba.griver.image.jsapi;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.permission.IPermissionRequestCallback;
import com.alibaba.ariver.app.api.point.dialog.CreateDialogParam;
import com.alibaba.ariver.app.api.point.dialog.DialogPoint;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.engine.api.resources.ResourceLoadPoint;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorManager;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.PermissionUtils;
import com.alibaba.griver.image.R;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

public class SaveImageToAlbumBridgeExtension implements BridgeExtension {
    public static final String TAG = "SaveImageToAlbumBridgeExtension";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f9097a;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void saveImageToPhotosAlbum(@BindingParam({"filePath"}) String str, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void saveImage(@BindingNode(Page.class) final Page page, @BindingParam({"src"}) final String str, @BindingParam(booleanDefault = true, value = {"showActionSheet"}) boolean z, @BindingCallback final BridgeCallback bridgeCallback) {
        if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else if (str.contains("../")) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            RVLogger.w(TAG, "Path invalid :".concat(String.valueOf(str)));
        } else {
            this.f9097a = new WeakReference<>(page.getPageContext().getActivity());
            if (z) {
                CreateDialogParam createDialogParam = new CreateDialogParam("", GriverEnv.getResources().getString(R.string.griver_image_save_to_phone), GriverEnv.getResources().getString(R.string.griver_base_confirm), GriverEnv.getResources().getString(R.string.griver_base_cancel), "");
                createDialogParam.positiveListener = new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (dialogInterface != null) {
                            dialogInterface.dismiss();
                        }
                        SaveImageToAlbumBridgeExtension.this.a(page, str, bridgeCallback);
                    }
                };
                createDialogParam.cancelListener = new DialogInterface.OnCancelListener() {
                    public void onCancel(DialogInterface dialogInterface) {
                        if (dialogInterface != null) {
                            dialogInterface.dismiss();
                        }
                    }
                };
                Dialog createDialog = ExtensionPoint.as(DialogPoint.class).create().createDialog(page.getPageContext().getActivity(), createDialogParam);
                if (createDialog != null) {
                    createDialog.show();
                    return;
                }
                return;
            }
            a(page, str, bridgeCallback);
        }
    }

    /* access modifiers changed from: private */
    public void a(final Page page, final String str, final BridgeCallback bridgeCallback) {
        if (!PermissionUtils.hasPermission("android.permission.WRITE_EXTERNAL_STORAGE")) {
            PermissionUtils.requestPermission("android.permission.WRITE_EXTERNAL_STORAGE", 2002, new IPermissionRequestCallback() {
                public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
                    if (PermissionUtils.positivePermissionResult(iArr) || bridgeCallback == null) {
                        GriverExecutors.getExecutor(ExecutorType.URGENT).execute(new ImageSaveRunner(page, str, bridgeCallback));
                        return;
                    }
                    com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                    jSONObject.put("error", (Object) "17");
                    bridgeCallback.sendJSONResponse(jSONObject);
                    bridgeCallback.sendJSONResponse(jSONObject);
                }
            });
        } else {
            GriverExecutors.getExecutor(ExecutorType.URGENT).execute(new ImageSaveRunner(page, str, bridgeCallback));
        }
    }

    class ImageSaveRunner implements Runnable {
        BridgeCallback callback;
        String filePath;
        Page page;
        String toastPath;
        String url;

        public ImageSaveRunner(Page page2, String str, BridgeCallback bridgeCallback) {
            this.url = str;
            this.callback = bridgeCallback;
            this.page = page2;
        }

        public void run() {
            final boolean a2 = a();
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    if (SaveImageToAlbumBridgeExtension.this.f9097a != null && SaveImageToAlbumBridgeExtension.this.f9097a.get() != null) {
                        if (a2) {
                            if (ImageSaveRunner.this.callback != null) {
                                ImageSaveRunner.this.callback.sendBridgeResponse(BridgeResponse.SUCCESS);
                            }
                        } else if (ImageSaveRunner.this.callback != null) {
                            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                            jSONObject.put("error", (Object) "17");
                            ImageSaveRunner.this.callback.sendJSONResponse(jSONObject);
                        }
                    }
                }
            });
        }

        private InputStream a(String str) {
            Resource load;
            if (this.page != null && (load = ExtensionPoint.as(ResourceLoadPoint.class).node(this.page).create().load(ResourceLoadContext.newBuilder().originUrl(str).build())) != null) {
                return load.getStream();
            }
            try {
                RVLogger.d(SaveImageToAlbumBridgeExtension.TAG, "load response from net");
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
                uRLConnection.setConnectTimeout(10000);
                uRLConnection.setReadTimeout(10000);
                StringBuilder sb = new StringBuilder("load response length ");
                sb.append(uRLConnection.getContentLength());
                RVLogger.d(SaveImageToAlbumBridgeExtension.TAG, sb.toString());
                return uRLConnection.getInputStream();
            } catch (Throwable th) {
                a(GriverMonitorConstants.MESSAGE_SAVE_IMAGE_HTTP_ERROR, th);
                StringBuilder sb2 = new StringBuilder("load response exception:");
                sb2.append(th.getMessage());
                RVLogger.e(SaveImageToAlbumBridgeExtension.TAG, sb2.toString());
                a(GriverMonitorConstants.MESSAGE_SAVE_IMAGE_HTTP_ERROR, (Throwable) null);
                return null;
            }
        }

        private void a(String str, Throwable th) {
            a(str, th, 0);
        }

        private void a(String str, Throwable th, long j) {
            MonitorMap.Builder builder = new MonitorMap.Builder();
            Page page2 = this.page;
            if (!(page2 == null || page2.getApp() == null)) {
                builder.appId(this.page.getApp().getAppId()).version(this.page.getApp()).needAsynAppType(true);
            }
            if (j > 0) {
                builder.size(String.valueOf(j)).threshold(String.valueOf(MonitorManager.getThreshold(GriverMonitorConstants.ERROR_SAVE_IMAGE_EXCEPTION)));
            }
            builder.message(str).exception(th).url(this.url).requestUrl(this.url).pageUrl(this.page.getOriginalURI());
            GriverMonitor.error(GriverMonitorConstants.ERROR_SAVE_IMAGE_EXCEPTION, "GriverAppContainer", builder.build());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
            r5 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
            r5 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ff, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0200, code lost:
            r5 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0202, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0203, code lost:
            r5 = null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005c A[ExcHandler: all (th java.lang.Throwable), PHI: r7 
          PHI: (r7v8 java.io.InputStream) = (r7v2 java.io.InputStream), (r7v2 java.io.InputStream), (r7v2 java.io.InputStream), (r7v2 java.io.InputStream), (r7v2 java.io.InputStream), (r7v2 java.io.InputStream), (r7v3 java.io.InputStream), (r7v3 java.io.InputStream), (r7v9 java.io.InputStream), (r7v9 java.io.InputStream), (r7v12 java.io.InputStream) binds: [B:40:0x009d, B:71:0x01ba, B:72:?, B:44:0x00a7, B:52:0x0108, B:57:0x0115, B:34:0x008f, B:35:?, B:16:0x0041, B:17:?, B:11:0x0036] A[DONT_GENERATE, DONT_INLINE], Splitter:B:11:0x0036] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01ff A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean a() {
            /*
                r16 = this;
                r1 = r16
                java.lang.String r0 = "file://"
                java.lang.String r2 = "SaveImageToAlbumBridgeExtension"
                r3 = 0
                r4 = 0
                java.lang.String r5 = "jpg"
                java.lang.String r6 = r1.url     // Catch:{ Exception -> 0x0202, all -> 0x01ff }
                java.lang.String r7 = "https://resource/"
                boolean r6 = r6.startsWith(r7)     // Catch:{ Exception -> 0x0202, all -> 0x01ff }
                if (r6 == 0) goto L_0x0066
                java.lang.String r6 = r1.url     // Catch:{ Exception -> 0x003f, all -> 0x01ff }
                java.lang.String r6 = com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil.apUrlToFilePath(r6)     // Catch:{ Exception -> 0x003f, all -> 0x01ff }
                boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x003f, all -> 0x01ff }
                if (r7 != 0) goto L_0x002c
                boolean r7 = r6.startsWith(r0)     // Catch:{ Exception -> 0x003f, all -> 0x01ff }
                if (r7 == 0) goto L_0x002c
                java.lang.String r7 = ""
                java.lang.String r6 = r6.replaceAll(r0, r7)     // Catch:{ Exception -> 0x003f, all -> 0x01ff }
            L_0x002c:
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003f, all -> 0x01ff }
                java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x003f, all -> 0x01ff }
                r0.<init>(r6)     // Catch:{ Exception -> 0x003f, all -> 0x01ff }
                r7.<init>(r0)     // Catch:{ Exception -> 0x003f, all -> 0x01ff }
                com.alibaba.griver.image.jsapi.SaveImageToAlbumBridgeExtension r0 = com.alibaba.griver.image.jsapi.SaveImageToAlbumBridgeExtension.this     // Catch:{ Exception -> 0x003d, all -> 0x005c }
                java.lang.String r5 = r0.a(r5, r6)     // Catch:{ Exception -> 0x003d, all -> 0x005c }
                goto L_0x0092
            L_0x003d:
                r0 = move-exception
                goto L_0x0041
            L_0x003f:
                r0 = move-exception
                r7 = r4
            L_0x0041:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r8 = "Failed to parse APFilePath :"
                r6.<init>(r8)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r8 = r0.getMessage()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r6.append(r8)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r2, (java.lang.String) r6)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r6 = "path exception"
                r1.a(r6, r0)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                goto L_0x0092
            L_0x005c:
                r0 = move-exception
                r5 = r4
            L_0x005e:
                r4 = r7
                goto L_0x0221
            L_0x0061:
                r0 = move-exception
                r5 = r4
            L_0x0063:
                r4 = r7
                goto L_0x0204
            L_0x0066:
                java.lang.String r0 = r1.url     // Catch:{ Exception -> 0x0202, all -> 0x01ff }
                java.lang.String r6 = "http"
                boolean r0 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0202, all -> 0x01ff }
                if (r0 == 0) goto L_0x0085
                java.lang.String r0 = r1.url     // Catch:{ Exception -> 0x0202, all -> 0x01ff }
                boolean r0 = com.alibaba.griver.base.common.utils.ImageUtils.isImage(r0)     // Catch:{ Exception -> 0x0202, all -> 0x01ff }
                if (r0 == 0) goto L_0x007e
                java.lang.String r0 = r1.url     // Catch:{ Exception -> 0x0202, all -> 0x01ff }
                java.lang.String r5 = com.alibaba.ariver.kernel.common.utils.FileUtils.getExtension(r0)     // Catch:{ Exception -> 0x0202, all -> 0x01ff }
            L_0x007e:
                java.lang.String r0 = r1.url     // Catch:{ Exception -> 0x0202, all -> 0x01ff }
                java.io.InputStream r7 = r1.a(r0)     // Catch:{ Exception -> 0x0202, all -> 0x01ff }
                goto L_0x0092
            L_0x0085:
                java.lang.String r0 = r1.url     // Catch:{ Exception -> 0x0202, all -> 0x01ff }
                java.io.InputStream r7 = com.alibaba.griver.base.common.utils.ImageUtils.base64ToInputStream(r0)     // Catch:{ Exception -> 0x0202, all -> 0x01ff }
                if (r7 != 0) goto L_0x0092
                java.lang.String r0 = "base64 decoding failed"
                r1.a(r0, r4)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
            L_0x0092:
                if (r7 != 0) goto L_0x009b
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r7)
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r4)
                return r3
            L_0x009b:
                r8 = 0
                boolean r0 = com.alibaba.griver.base.common.utils.AndroidVersionUtils.isQAndAbove()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r6 = 1024(0x400, float:1.435E-42)
                java.lang.String r10 = "."
                if (r0 == 0) goto L_0x0143
                android.app.Application r0 = com.alibaba.griver.base.common.env.GriverEnv.getApplicationContext()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r11.<init>()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r12 = "_display_name"
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r13.<init>()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r13.append(r14)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r13.append(r10)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r13.append(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r5 = r13.toString()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r11.put(r12, r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r5 = "mime_type"
                java.lang.String r10 = "image/jpeg"
                r11.put(r5, r10)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.Class<com.alibaba.griver.api.common.storage.GriverFilePathExtension> r5 = com.alibaba.griver.api.common.storage.GriverFilePathExtension.class
                java.lang.Object r5 = com.alibaba.ariver.kernel.common.RVProxy.get(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                com.alibaba.griver.api.common.storage.GriverFilePathExtension r5 = (com.alibaba.griver.api.common.storage.GriverFilePathExtension) r5     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r5 = r5.getSaveImageFilePathAboveQ()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                if (r10 == 0) goto L_0x00ea
                java.lang.String r5 = "/griver/"
            L_0x00ea:
                java.lang.String r10 = "relative_path"
                java.lang.String r12 = "DCIM"
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r5 = r12.concat(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r11.put(r10, r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                android.net.Uri r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                android.net.Uri r5 = r0.insert(r5, r11)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                if (r5 != 0) goto L_0x0108
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r7)
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r4)
                return r3
            L_0x0108:
                java.io.OutputStream r0 = r0.openOutputStream(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                if (r0 != 0) goto L_0x0115
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r7)
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r4)
                return r3
            L_0x0115:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r11 = "path: "
                r10.<init>(r11)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r10.append(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r5 = r10.toString()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                com.alibaba.griver.base.common.logger.GriverLogger.d(r2, r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                byte[] r5 = com.alibaba.ariver.kernel.common.utils.IOUtils.getBuf(r6)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
            L_0x012e:
                int r6 = r7.read(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                if (r6 <= 0) goto L_0x013a
                r0.write(r5, r3, r6)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                long r10 = (long) r6     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                long r8 = r8 + r10
                goto L_0x012e
            L_0x013a:
                com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r0.flush()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r5 = r4
                goto L_0x01e3
            L_0x0143:
                java.lang.Class<com.alibaba.griver.api.common.storage.GriverFilePathExtension> r0 = com.alibaba.griver.api.common.storage.GriverFilePathExtension.class
                java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                com.alibaba.griver.api.common.storage.GriverFilePathExtension r0 = (com.alibaba.griver.api.common.storage.GriverFilePathExtension) r0     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r0 = r0.getSaveImageFilePath()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                if (r11 == 0) goto L_0x016a
                java.lang.String r0 = "/DCIM/griver/"
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r11.<init>()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.io.File r12 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r11.append(r12)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r11.append(r0)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
            L_0x016a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r11.<init>()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r11.append(r0)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r11.append(r12)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r11.append(r10)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r11.append(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r1.filePath = r0     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r5 = "filePath "
                r0.<init>(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r5 = r1.filePath     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r0.append(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r0)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r0 = r1.filePath     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                boolean r0 = com.alibaba.griver.base.common.utils.H5FileUtil.create(r0)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                if (r0 != 0) goto L_0x01ba
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r5 = "failed to create file "
                r0.<init>(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r5 = r1.filePath     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r0.append(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                com.alibaba.ariver.kernel.common.utils.RVLogger.w(r2, r0)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r7)
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r4)
                return r3
            L_0x01ba:
                java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.lang.String r5 = r1.filePath     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r0.<init>(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                r5.<init>(r0)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
                byte[] r0 = com.alibaba.ariver.kernel.common.utils.IOUtils.getBuf(r6)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            L_0x01ca:
                int r6 = r7.read(r0)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
                if (r6 <= 0) goto L_0x01d6
                r5.write(r0, r3, r6)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
                long r10 = (long) r6     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
                long r8 = r8 + r10
                goto L_0x01ca
            L_0x01d6:
                com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r0)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
                r5.flush()     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
                java.lang.String r0 = r1.filePath     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
                java.lang.String r6 = "image/*"
                com.alibaba.griver.image.photo.utils.PhotoUtil.notifyScanner(r0, r6)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            L_0x01e3:
                java.lang.String r0 = "mini_save_image_exception"
                double r10 = (double) r8     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
                boolean r0 = com.alibaba.griver.base.common.monitor.MonitorManager.exceedThreshold(r0, r10)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
                if (r0 == 0) goto L_0x01f1
                java.lang.String r0 = "image size exceeds limit"
                r1.a(r0, r4, r8)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            L_0x01f1:
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r7)
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r5)
                r0 = 1
                return r0
            L_0x01f9:
                r0 = move-exception
                goto L_0x005e
            L_0x01fc:
                r0 = move-exception
                goto L_0x0063
            L_0x01ff:
                r0 = move-exception
                r5 = r4
                goto L_0x0221
            L_0x0202:
                r0 = move-exception
                r5 = r4
            L_0x0204:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0220 }
                java.lang.String r7 = "save image exception:"
                r6.<init>(r7)     // Catch:{ all -> 0x0220 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0220 }
                r6.append(r0)     // Catch:{ all -> 0x0220 }
                java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0220 }
                com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0220 }
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r4)
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r5)
                return r3
            L_0x0220:
                r0 = move-exception
            L_0x0221:
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r4)
                com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r5)
                goto L_0x0229
            L_0x0228:
                throw r0
            L_0x0229:
                goto L_0x0228
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.jsapi.SaveImageToAlbumBridgeExtension.ImageSaveRunner.a():boolean");
        }
    }

    /* access modifiers changed from: private */
    public String a(String str, String str2) {
        int lastIndexOf = str2.lastIndexOf(".");
        return (lastIndexOf <= 0 || lastIndexOf >= str2.length()) ? str : str2.substring(lastIndexOf + 1);
    }
}
