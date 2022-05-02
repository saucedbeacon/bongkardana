package com.alibaba.griver.image.jsapi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
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
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.utils.AOMPFileTinyAppUtils;
import com.alibaba.griver.base.common.utils.FileCache;
import com.alibaba.griver.base.common.utils.H5FileUtil;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.base.common.utils.TinyUtils;
import com.alibaba.griver.image.GriverImageService;
import com.alibaba.griver.image.framework.meta.APImageInfo;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class ImageInfoBridgeExtension implements BridgeExtension {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f10490a = ImageInfoBridgeExtension.class.getSimpleName();
    private GriverImageService b;
    private FileCache c;

    public void onFinalized() {
    }

    public Permission permit() {
        return null;
    }

    @ActionFilter
    public void getImageInfo(@BindingNode(Page.class) Page page, @BindingParam({"src"}) String str, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        if (TextUtils.isEmpty(str)) {
            com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
            jSONObject2.put("error", (Object) 12);
            jSONObject2.put("errorMessage", (Object) "Path cannot be empty");
            bridgeCallback.sendJSONResponse(jSONObject2);
            return;
        }
        RVLogger.d(f10490a, "getImageInfo...path=".concat(String.valueOf(str)));
        try {
            if (str.startsWith(H5ResourceHandlerUtil.RESOURCE)) {
                if (str.endsWith(".image")) {
                    String transferApPathToLocalPath = AOMPFileTinyAppUtils.transferApPathToLocalPath(str);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(transferApPathToLocalPath, options);
                    if (options.outWidth > 0) {
                        if (options.outHeight > 0) {
                            com.alibaba.fastjson.JSONObject jSONObject3 = new com.alibaba.fastjson.JSONObject();
                            jSONObject3.put("width", (Object) Integer.valueOf(options.outWidth));
                            jSONObject3.put("height", (Object) Integer.valueOf(options.outHeight));
                            jSONObject3.put("path", (Object) str);
                            if (!TextUtils.isEmpty(transferApPathToLocalPath)) {
                                jSONObject3.put(GriverMonitorConstants.KEY_SIZE, (Object) Long.valueOf(new File(transferApPathToLocalPath).length()));
                            }
                            a(transferApPathToLocalPath, jSONObject3);
                            bridgeCallback.sendJSONResponse(jSONObject3);
                            return;
                        }
                    }
                    com.alibaba.fastjson.JSONObject jSONObject4 = new com.alibaba.fastjson.JSONObject();
                    jSONObject4.put("errorMessage", (Object) "Failed to get image information");
                    jSONObject4.put("error", (Object) 18);
                    bridgeCallback.sendJSONResponse(jSONObject4);
                    return;
                }
            }
            if (str.startsWith("http")) {
                RVLogger.d(f10490a, "getImageInfoFromNet == ".concat(String.valueOf(str)));
                a(page, str, bridgeCallback);
                return;
            }
            String a2 = a(str, page.getStartParams());
            RVLogger.d(f10490a, "getImageInfo realPath ".concat(String.valueOf(a2)));
            Resource load = ExtensionPoint.as(ResourceLoadPoint.class).node(page).create().load(ResourceLoadContext.newBuilder().originUrl(a2).build());
            if (load == null) {
                com.alibaba.fastjson.JSONObject jSONObject5 = new com.alibaba.fastjson.JSONObject();
                jSONObject5.put("error", (Object) 18);
                jSONObject5.put("errorMessage", (Object) "Failed to get image information");
                bridgeCallback.sendJSONResponse(jSONObject5);
                return;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(load.getStream());
            com.alibaba.fastjson.JSONObject jSONObject6 = new com.alibaba.fastjson.JSONObject();
            jSONObject6.put("width", (Object) Integer.valueOf(decodeStream.getWidth()));
            jSONObject6.put("height", (Object) Integer.valueOf(decodeStream.getHeight()));
            jSONObject6.put("type", (Object) H5FileUtil.getFileExtensionFromUrl(str));
            jSONObject6.put("path", (Object) a(str));
            jSONObject6.put("orientation", (Object) "up");
            bridgeCallback.sendJSONResponse(jSONObject6);
        } catch (Throwable th) {
            RVLogger.e(f10490a, "getImageInfo...e=".concat(String.valueOf(th)));
            com.alibaba.fastjson.JSONObject jSONObject7 = new com.alibaba.fastjson.JSONObject();
            jSONObject7.put("error", (Object) 18);
            jSONObject7.put("errorMessage", (Object) "Failed to get image information");
            bridgeCallback.sendJSONResponse(jSONObject7);
        }
    }

    private String a(String str, Bundle bundle) {
        String string = BundleUtils.getString(bundle, "url");
        if (!TextUtils.isEmpty(string)) {
            return TinyUtils.getAbsoluteUrlV2(string, str, (Bundle) null);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void a(String str, com.alibaba.fastjson.JSONObject jSONObject) {
        GriverImageService griverImageService = this.b;
        if (griverImageService != null) {
            try {
                APImageInfo parseImageInfo = griverImageService.parseImageInfo(str);
                String str2 = ImageFileType.sTypeSuffix.get(parseImageInfo.format);
                if (TextUtils.isEmpty(str2)) {
                    str2 = "unknown";
                }
                jSONObject.put("type", (Object) str2);
                String str3 = "up";
                if (parseImageInfo != null) {
                    switch (parseImageInfo.orientation) {
                        case 1:
                            break;
                        case 2:
                            str3 = "up-mirrored";
                            break;
                        case 3:
                            str3 = "down";
                            break;
                        case 4:
                            str3 = "down-mirrored";
                            break;
                        case 5:
                            str3 = "left-mirrored";
                            break;
                        case 6:
                            str3 = TtmlNode.RIGHT;
                            break;
                        case 7:
                            str3 = "right-mirrored";
                            break;
                        case 8:
                            str3 = TtmlNode.LEFT;
                            break;
                    }
                }
                jSONObject.put("orientation", (Object) str3);
            } catch (Exception e) {
                String str4 = f10490a;
                StringBuilder sb = new StringBuilder("parseTypeAndOrientation exception:");
                sb.append(e.getMessage());
                RVLogger.w(str4, sb.toString());
            }
        }
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("./")) {
            return str.substring(2);
        }
        return str.startsWith("/") ? str.substring(1) : str;
    }

    private void a(final Page page, final String str, final BridgeCallback bridgeCallback) {
        String fileExtensionFromUrl = H5FileUtil.getFileExtensionFromUrl(str);
        RVLogger.d(f10490a, "ext == ".concat(String.valueOf(fileExtensionFromUrl)));
        if (TextUtils.isEmpty(fileExtensionFromUrl) || ImageUtils.checkSuffixSupported(str)) {
            GriverExecutors.getExecutor(ExecutorType.IO).execute(new Runnable() {
                public void run() {
                    try {
                        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
                        uRLConnection.setConnectTimeout(60000);
                        uRLConnection.setReadTimeout(60000);
                        uRLConnection.connect();
                        Map<String, List<String>> headerFields = uRLConnection.getHeaderFields();
                        String str = "";
                        String str2 = str;
                        for (String next : headerFields.keySet()) {
                            String access$000 = ImageInfoBridgeExtension.f10490a;
                            StringBuilder sb = new StringBuilder();
                            sb.append(next);
                            sb.append("---->");
                            sb.append(headerFields.get(next));
                            RVLogger.d(access$000, sb.toString());
                            if ("Content-Type".equalsIgnoreCase(next) && headerFields.get(next) != null && headerFields.get(next).size() > 0) {
                                String str3 = (String) headerFields.get(next).get(0);
                                if (!TextUtils.isEmpty(str3)) {
                                    String typeFromMimeType = AOMPFileTinyAppUtils.getTypeFromMimeType(str3);
                                    str2 = typeFromMimeType;
                                    str = H5FileUtil.getExtensionFromMimeType(str3);
                                }
                            }
                        }
                        if (headerFields != null) {
                            String tempPath = ImageInfoBridgeExtension.this.a(page).getTempPath(GriverEnv.getApplicationContext(), str, str);
                            H5FileUtil.create(tempPath, true);
                            File file = new File(tempPath);
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            InputStream inputStream = uRLConnection.getInputStream();
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            inputStream.close();
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(tempPath, options);
                            if (options.outWidth > 0) {
                                if (options.outHeight > 0) {
                                    String localIdToUrl = H5ResourceHandlerUtil.localIdToUrl(AOMPFileTinyAppUtils.encodeToLocalId(tempPath), str2);
                                    com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                                    jSONObject.put("width", (Object) Integer.valueOf(options.outWidth));
                                    jSONObject.put("height", (Object) Integer.valueOf(options.outHeight));
                                    jSONObject.put("path", (Object) localIdToUrl);
                                    jSONObject.put(GriverMonitorConstants.KEY_SIZE, (Object) Long.valueOf(file.length()));
                                    jSONObject.put("type", (Object) str);
                                    ImageInfoBridgeExtension.this.a(tempPath, jSONObject);
                                    bridgeCallback.sendJSONResponse(jSONObject);
                                    return;
                                }
                            }
                            bridgeCallback.sendBridgeResponse(BridgeResponse.newValue("18", "Failed to get image information"));
                            return;
                        }
                        RVLogger.e(ImageInfoBridgeExtension.f10490a, "getImageInfoFromNet response error");
                        bridgeCallback.sendBridgeResponse(BridgeResponse.newValue("21", "Download image failed"));
                    } catch (Exception e) {
                        RVLogger.e(ImageInfoBridgeExtension.f10490a, "getImageInfoFromNet...e=".concat(String.valueOf(e)));
                        bridgeCallback.sendBridgeResponse(BridgeResponse.newValue("18", "Failed to get image information"));
                    }
                }
            });
            return;
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("error", (Object) 22);
        jSONObject.put("errorMessage", (Object) "unsupported format");
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    public void onInitialized() {
        this.b = (GriverImageService) RVProxy.get(GriverImageService.class);
    }

    /* access modifiers changed from: private */
    public FileCache a(Page page) {
        if (this.c == null) {
            String appId = page.getApp().getAppId();
            if (TextUtils.isEmpty(appId)) {
                appId = "20000067";
            }
            this.c = new FileCache(page.getPageContext().getActivity(), appId, GriverAccount.getUserId());
        }
        return this.c;
    }
}
