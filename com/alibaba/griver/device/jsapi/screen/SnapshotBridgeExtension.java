package com.alibaba.griver.device.jsapi.screen;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.permission.IPermissionRequestCallback;
import com.alibaba.ariver.app.api.point.biz.SnapshotPoint;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AndroidVersionUtils;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.base.common.utils.PermissionUtils;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.alibaba.griver.device.R;
import com.alibaba.griver.device.proxy.GriverImagePathProxy;
import com.iap.ac.android.common.log.ACMonitor;
import id.dana.util.media.MimeType;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

@Keep
public class SnapshotBridgeExtension implements BridgeExtension {
    private static final String DATAURL = "dataURL";
    private static final String FILEURL = "fileURL";
    private static final String RANGE_DOCUMENT = "document";
    private static final String RANGE_EMBEDVIEW = "embedview";
    private static final String RANGE_SCREEN = "screen";
    private static final String RANGE_VIEWPORT = "viewport";
    private static final int REQUEST_READ_EXTERNAL_STORAGE_PERMISSION = 2001;
    private static final String SNOPSHOT_JPG = "jpg";
    public static final String TAG = "SnapshotBridgeExtension";
    private String imagePath;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void snapshot(@BindingNode(Page.class) Page page, @BindingParam(intDefault = -1, value = {"maxWidth"}) int i, @BindingParam(intDefault = -1, value = {"maxHeight"}) int i2, @BindingParam(stringDefault = "screen", value = {"range"}) String str, @BindingParam(booleanDefault = true, value = {"handleSaveToGallery"}) boolean z, @BindingParam(stringDefault = "none", value = {"dataType"}) String str2, @BindingParam(stringDefault = "jpg", value = {"imageFormat"}) String str3, @BindingParam(intDefault = 75, value = {"quality"}) int i3, @BindingParam({"hasMapTitleBar"}) boolean z2, @BindingCallback BridgeCallback bridgeCallback) {
        Bitmap bitmap;
        Bitmap captureNXView;
        String str4 = str;
        BridgeCallback bridgeCallback2 = bridgeCallback;
        if (page != null) {
            Activity activity = page.getPageContext() != null ? page.getPageContext().getActivity() : null;
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.equals(str4, RANGE_SCREEN)) {
                captureNXView = captureScreen(activity);
            } else if (TextUtils.equals(str4, RANGE_VIEWPORT)) {
                if (page.getRender() != null) {
                    captureNXView = captureNXView(0, page.getRender(), activity);
                } else {
                    bridgeCallback2.sendBridgeResponse(new BridgeResponse.Error(2, "no webview"));
                    return;
                }
            } else if (TextUtils.equals(str4, RANGE_DOCUMENT)) {
                if (page.getRender() != null) {
                    captureNXView = captureNXView(1, page.getRender(), activity);
                } else {
                    bridgeCallback2.sendBridgeResponse(new BridgeResponse.Error(2, "no webview"));
                    return;
                }
            } else if (TextUtils.equals(str4, RANGE_EMBEDVIEW)) {
                captureEmbedView(page, activity, bridgeCallback, jSONObject, i, i2, z, str2, str3, i3, z2);
                return;
            } else {
                bitmap = null;
                handleSnapshot(bridgeCallback, activity, jSONObject, i, i2, z, str2, str3, i3, bitmap);
            }
            bitmap = captureNXView;
            handleSnapshot(bridgeCallback, activity, jSONObject, i, i2, z, str2, str3, i3, bitmap);
        }
    }

    @ActionFilter
    public void addScreenshotListener(@BindingNode(Page.class) final Page page, @BindingCallback final BridgeCallback bridgeCallback) {
        WeakReference<Activity> topActivity = GriverEnv.getTopActivity();
        if (topActivity == null || topActivity.get() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (!PermissionUtils.hasPermission("android.permission.READ_EXTERNAL_STORAGE")) {
            PermissionUtils.requestPermission("android.permission.READ_EXTERNAL_STORAGE", 2001, new IPermissionRequestCallback() {
                public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
                    if (PermissionUtils.positivePermissionResult(iArr)) {
                        SnapshotBridgeExtension.this.startListenScreenshot(page, bridgeCallback);
                    } else {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    }
                }
            });
        } else {
            startListenScreenshot(page, bridgeCallback);
        }
    }

    /* access modifiers changed from: private */
    public void startListenScreenshot(Page page, BridgeCallback bridgeCallback) {
        ExtensionPoint.as(SnapshotPoint.class).node(page).create().addScreenshotListener(page);
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleSnapshot(com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r12, android.app.Activity r13, com.alibaba.fastjson.JSONObject r14, int r15, int r16, boolean r17, java.lang.String r18, java.lang.String r19, int r20, android.graphics.Bitmap r21) {
        /*
            r11 = this;
            r3 = r13
            r4 = r14
            r0 = r20
            r1 = r21
            if (r1 == 0) goto L_0x00a6
            boolean r2 = r21.isRecycled()
            if (r2 == 0) goto L_0x0010
            goto L_0x00a6
        L_0x0010:
            if (r15 >= 0) goto L_0x0017
            int r2 = r21.getWidth()
            goto L_0x0018
        L_0x0017:
            r2 = r15
        L_0x0018:
            if (r16 >= 0) goto L_0x001f
            int r5 = r21.getHeight()
            goto L_0x0021
        L_0x001f:
            r5 = r16
        L_0x0021:
            int r6 = r21.getHeight()
            if (r5 != r6) goto L_0x002d
            int r6 = r21.getWidth()
            if (r2 == r6) goto L_0x0031
        L_0x002d:
            android.graphics.Bitmap r1 = com.alibaba.griver.base.common.utils.ImageUtils.scaleBitmap(r1, r2, r5)
        L_0x0031:
            if (r1 == 0) goto L_0x0047
            java.lang.String r2 = "jpg"
            r6 = r19
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0049
            r2 = 100
            if (r0 == r2) goto L_0x0049
            android.graphics.Bitmap r0 = com.alibaba.griver.base.common.utils.ImageUtils.imageQuality(r1, r0)
            r7 = r0
            goto L_0x004a
        L_0x0047:
            r6 = r19
        L_0x0049:
            r7 = r1
        L_0x004a:
            if (r17 == 0) goto L_0x009a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x008d
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r1 = r13.checkSelfPermission(r0)
            if (r1 == 0) goto L_0x0080
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r8 = 2002(0x7d2, float:2.805E-42)
            r13.requestPermissions(r0, r8)
            java.lang.Class<com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy> r0 = com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)
            r9 = r0
            com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy r9 = (com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy) r9
            if (r9 == 0) goto L_0x007f
            com.alibaba.griver.device.jsapi.screen.SnapshotBridgeExtension$2 r10 = new com.alibaba.griver.device.jsapi.screen.SnapshotBridgeExtension$2
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r18
            r6 = r19
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r9.addPermRequstCallback(r8, r10)
        L_0x007f:
            return
        L_0x0080:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r18
            r5 = r19
            r6 = r7
            r0.handleSaveToGallery(r1, r2, r3, r4, r5, r6)
            return
        L_0x008d:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r18
            r5 = r19
            r6 = r7
            r0.handleSaveToGallery(r1, r2, r3, r4, r5, r6)
            return
        L_0x009a:
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r18
            r4 = r19
            r5 = r7
            r0.handleSave(r1, r2, r3, r4, r5)
            return
        L_0x00a6:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "success"
            r14.put((java.lang.String) r1, (java.lang.Object) r0)
            java.lang.String r0 = "error"
            java.lang.String r1 = "2"
            r14.put((java.lang.String) r0, (java.lang.Object) r1)
            android.content.res.Resources r0 = com.alibaba.griver.base.common.env.GriverEnv.getResources()
            int r1 = com.alibaba.griver.device.R.string.griver_get_pic_failed
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "errorMessage"
            r14.put((java.lang.String) r1, (java.lang.Object) r0)
            r0 = r12
            r12.sendJSONResponse(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.device.jsapi.screen.SnapshotBridgeExtension.handleSnapshot(com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback, android.app.Activity, com.alibaba.fastjson.JSONObject, int, int, boolean, java.lang.String, java.lang.String, int, android.graphics.Bitmap):void");
    }

    private void handleSave(final BridgeCallback bridgeCallback, JSONObject jSONObject, String str, final String str2, final Bitmap bitmap) {
        if (FILEURL.equals(str)) {
            String imageTempDir = ImageUtils.getImageTempDir(GriverEnv.getApplicationContext());
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append(".");
            sb.append(str2);
            String obj = sb.toString();
            FileUtils.mkdirs(imageTempDir, true);
            Bitmap.CompressFormat compressFormat = str2.equals("jpg") ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(imageTempDir);
            sb2.append(obj);
            ImageUtils.writeImage(bitmap, compressFormat, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(imageTempDir);
            sb3.append(obj);
            if (!FileUtils.exists(sb3.toString())) {
                jSONObject.put("success", (Object) Boolean.FALSE);
                jSONObject.put("error", (Object) 11);
                jSONObject.put("errorMessage", (Object) GriverEnv.getResources().getString(R.string.griver_save_pic_failed));
            } else {
                jSONObject.put("success", (Object) Boolean.TRUE);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(imageTempDir);
                sb4.append(obj);
                jSONObject.put(FILEURL, (Object) sb4.toString());
            }
            bridgeCallback.sendJSONResponse(jSONObject);
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        } else if (DATAURL.equals(str)) {
            GriverExecutors.getExecutor(ExecutorType.URGENT).execute(new Runnable() {
                public void run() {
                    String bitmapToString = ImageUtils.bitmapToString(bitmap, str2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(SnapshotBridgeExtension.DATAURL, (Object) bitmapToString);
                    jSONObject.put("success", (Object) Boolean.TRUE);
                    bridgeCallback.sendJSONResponse(jSONObject);
                    Bitmap bitmap = bitmap;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            });
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    /* access modifiers changed from: private */
    public void handleSaveToGallery(BridgeCallback bridgeCallback, Activity activity, JSONObject jSONObject, String str, String str2, Bitmap bitmap) {
        String string;
        int saveImageToGallery = saveImageToGallery(bitmap, str2);
        if (saveImageToGallery == 0) {
            if (activity != null && !activity.isFinishing()) {
                GriverLogger.d("SnapshotBridgeExtension", "save to gallery success: ".concat(String.valueOf(GriverEnv.getResources().getString(R.string.griver_save_image_to, new Object[]{this.imagePath}))));
            }
            handleSave(bridgeCallback, jSONObject, str, str2, bitmap);
            return;
        }
        String string2 = GriverEnv.getResources().getString(R.string.griver_save_image_failed);
        if (activity != null && !activity.isFinishing()) {
            if (saveImageToGallery == 1) {
                string = GriverEnv.getResources().getString(R.string.griver_snap_sd_error);
            } else {
                if (saveImageToGallery == 10 || saveImageToGallery == 3) {
                    string = GriverEnv.getResources().getString(R.string.h5_snap_error);
                }
                ToastUtils.showToast(GriverEnv.getApplicationContext(), string2, 0);
            }
            string2 = string;
            ToastUtils.showToast(GriverEnv.getApplicationContext(), string2, 0);
        }
        jSONObject.put("success", (Object) Boolean.FALSE);
        jSONObject.put("error", (Object) Integer.valueOf(saveImageToGallery));
        jSONObject.put(ACMonitor.EVENT_PARAM_KEY_ERROR_MSG, (Object) string2);
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    private int saveImageToGallery(Bitmap bitmap, String str) {
        Bitmap bitmap2 = bitmap;
        String str2 = str;
        if (!TextUtils.equals(Environment.getExternalStorageState(), "mounted")) {
            return 1;
        }
        String str3 = "/Screenshots/";
        if (AndroidVersionUtils.isQAndAbove()) {
            GriverLogger.d("SnapshotBridgeExtension", "snapshot in Android Q and above");
            ContentResolver contentResolver = GriverEnv.getApplicationContext().getContentResolver();
            ContentValues contentValues = new ContentValues();
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis() + 46);
            sb.append(str2);
            contentValues.put("_display_name", sb.toString());
            contentValues.put("mime_type", "image/jpeg");
            String snapShotImagePath = ((GriverImagePathProxy) RVProxy.get(GriverImagePathProxy.class)).getSnapShotImagePath();
            if (!TextUtils.isEmpty(snapShotImagePath)) {
                str3 = snapShotImagePath;
            }
            if (!str3.startsWith("/")) {
                str3 = "/".concat(String.valueOf(str3));
            }
            if (!str3.endsWith("/")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append("/");
                str3 = sb2.toString();
            }
            contentValues.put("relative_path", "DCIM".concat(String.valueOf(str3)));
            Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (insert == null) {
                return 10;
            }
            try {
                OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                if (openOutputStream == null) {
                    return 10;
                }
                StringBuilder sb3 = new StringBuilder("path: ");
                sb3.append(insert.toString());
                GriverLogger.d("SnapshotBridgeExtension", sb3.toString());
                boolean compress = bitmap2.compress("jpg".equals(str2) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, 100, openOutputStream);
                openOutputStream.close();
                if (!compress) {
                    GriverLogger.e("SnapshotBridgeExtension", "snapshot bitmap to file failed");
                    return 10;
                }
            } catch (Exception e) {
                GriverLogger.e("SnapshotBridgeExtension", "snapshot in Android Q and above failed", e);
                return 1;
            }
        } else {
            try {
                GriverImagePathProxy griverImagePathProxy = (GriverImagePathProxy) RVProxy.get(GriverImagePathProxy.class);
                String snapShotImagePath2 = griverImagePathProxy != null ? griverImagePathProxy.getSnapShotImagePath() : null;
                if (!TextUtils.isEmpty(snapShotImagePath2)) {
                    str3 = snapShotImagePath2;
                }
                if (!str3.startsWith("/")) {
                    str3 = "/".concat(String.valueOf(str3));
                }
                if (!str3.endsWith("/")) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str3);
                    sb4.append("/");
                    str3 = sb4.toString();
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
                sb5.append(str3);
                sb5.append(System.currentTimeMillis());
                sb5.append(".");
                sb5.append(str2);
                String obj = sb5.toString();
                this.imagePath = obj;
                FileUtils.create(obj);
                FileOutputStream fileOutputStream = new FileOutputStream(this.imagePath);
                boolean compress2 = bitmap2.compress("jpg".equals(str2) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                if (!compress2) {
                    return 10;
                }
                MediaScannerConnection.scanFile(GriverEnv.getApplicationContext(), new String[]{this.imagePath}, new String[]{MimeType.IMAGE_ALL}, (MediaScannerConnection.OnScanCompletedListener) null);
            } catch (Exception e2) {
                RVLogger.e("SnapshotBridgeExtension", "saveImageToGallery exception.", e2);
                return 3;
            }
        }
        return 0;
    }

    public Bitmap captureScreen(Activity activity) {
        try {
            View decorView = activity.getWindow().getDecorView();
            decorView.buildDrawingCache();
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            int i = rect.top;
            decorView.setDrawingCacheEnabled(true);
            Bitmap drawingCache = decorView.getDrawingCache();
            Bitmap createBitmap = Bitmap.createBitmap(drawingCache, 0, i, drawingCache.getWidth(), drawingCache.getHeight() - i);
            decorView.destroyDrawingCache();
            return createBitmap;
        } catch (Exception e) {
            RVLogger.e("SnapshotBridgeExtension", (Throwable) e);
            return null;
        }
    }

    private Bitmap captureNXView(int i, Render render, Activity activity) {
        Bitmap capture = render.getCapture(i);
        if (capture != null) {
            return capture;
        }
        RVLogger.w("SnapshotBridgeExtension", "captureNXView got null bitmap!");
        return captureScreen(activity);
    }

    public void captureEmbedView(Page page, Activity activity, BridgeCallback bridgeCallback, JSONObject jSONObject, int i, int i2, boolean z, String str, String str2, int i3, boolean z2) {
        Activity activity2 = activity;
        try {
            handleSnapshot(bridgeCallback, activity, jSONObject, i, i2, z, str, str2, i3, captureScreen(activity));
        } catch (Exception e) {
            RVLogger.e("SnapshotBridgeExtension", (Throwable) e);
        }
    }
}
