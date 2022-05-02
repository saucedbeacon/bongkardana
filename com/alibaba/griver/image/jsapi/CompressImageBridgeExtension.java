package com.alibaba.griver.image.jsapi;

import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.network.NetworkUtil;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.proxy.LocalIdTool;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import com.alibaba.griver.image.GriverImageService;
import com.alibaba.griver.image.framework.encode.APEncodeOptions;
import com.alibaba.griver.image.framework.encode.APEncodeResult;
import com.alibaba.griver.image.framework.meta.APImageInfo;
import com.alibaba.griver.image.framework.mode.APMaxLenMode;
import com.alibaba.griver.image.framework.utils.FileUtils;
import com.alibaba.griver.image.framework.utils.PathToLocalUtil;
import com.alibaba.griver.image.photo.PhotoContext;
import java.io.File;
import org.json.JSONObject;

public class CompressImageBridgeExtension implements BridgeExtension {
    public static final int COMPRESS_LEVEL_AUTO = 4;
    public static final int COMPRESS_LEVEL_HIGH = 2;
    public static final int COMPRESS_LEVEL_LOW = 0;
    public static final int COMPRESS_LEVEL_NONE = 3;
    public static final int COMPRESS_LEVEL_NORMAL = 1;

    /* renamed from: a  reason: collision with root package name */
    private int f10489a;
    private int b;
    private GriverImageService c;

    public void onFinalized() {
    }

    public Permission permit() {
        return null;
    }

    @ActionFilter
    public void compressImage(@BindingParam({"apFilePaths"}) String[] strArr, @BindingParam({"maxWidth"}) int i, @BindingParam({"maxHeight"}) int i2, @BindingParam({"compress"}) int i3, @BindingParam(intDefault = 4, value = {"compressLevel"}) int i4, @BindingParam({"business"}) String str, @BindingParam({"data"}) String str2, @BindingParam({"dataType"}) String str3, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        String[] strArr2 = strArr;
        int i5 = i4;
        BridgeCallback bridgeCallback2 = bridgeCallback;
        StringBuilder sb = new StringBuilder("compressImage params: ");
        sb.append(JSON.toJSONString(jSONObject));
        RVLogger.d("H5CompressImage", sb.toString());
        if (strArr2 != null) {
            try {
                if (strArr2.length != 0) {
                    if (i5 >= 0) {
                        if (i5 <= 4) {
                            final String[] strArr3 = strArr;
                            final int i6 = i4;
                            final String str4 = str;
                            final BridgeCallback bridgeCallback3 = bridgeCallback;
                            GriverExecutors.getExecutor(ExecutorType.IO).execute(new Runnable() {
                                public void run() {
                                    try {
                                        CompressImageBridgeExtension.this.a(strArr3, Integer.MAX_VALUE, Integer.MAX_VALUE, i6, str4, bridgeCallback3);
                                    } catch (Exception e) {
                                        RVLogger.e("H5CompressImage", "handleEvent error", e);
                                        CompressImageBridgeExtension.this.a(bridgeCallback3, 2);
                                    }
                                }
                            });
                            return;
                        }
                    }
                    bridgeCallback2.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                    return;
                }
            } catch (Throwable th) {
                RVLogger.e("H5CompressImage", "handleEvent.file patch error:", th);
                bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder("handleEvent error, array: ");
        sb2.append(strArr);
        sb2.append(", data: ");
        sb2.append(str2);
        sb2.append(", dataType: ");
        sb2.append(str3);
        sb2.append(",business=");
        sb2.append(str);
        RVLogger.d("H5CompressImage", sb2.toString());
        bridgeCallback2.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
    }

    public static String trimFilePath(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.startsWith(PhotoContext.FILE_SCHEME) ? trim.substring(7) : trim;
    }

    /* access modifiers changed from: private */
    public void a(String[] strArr, int i, int i2, int i3, String str, BridgeCallback bridgeCallback) {
        String[] a2 = a(strArr, i, i2, i3, str);
        if (a2 != null) {
            a(bridgeCallback, a2);
        } else {
            a(bridgeCallback, 2);
        }
    }

    private String[] a(String[] strArr, int i, int i2, int i3, String str) {
        String[] strArr2 = new String[strArr.length];
        int max = Math.max(i, i2);
        GriverImageService griverImageService = (GriverImageService) RVProxy.get(GriverImageService.class);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = strArr[i4];
            strArr2[i4] = str2;
            if (i3 != 3) {
                String trimFilePath = trimFilePath(b(str2));
                String a2 = a(i3, max, griverImageService, TextUtils.isEmpty(trimFilePath) ? null : new File(trimFilePath));
                if (a2 == null) {
                    a2 = str2;
                }
                strArr2[i4] = a2;
            }
            StringBuilder sb = new StringBuilder("compressFiles item: ");
            sb.append(str2);
            sb.append(", result: ");
            sb.append(strArr2[i4]);
            sb.append(", biz: ");
            sb.append(str);
            sb.append(", cost: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            RVLogger.d("H5CompressImage", sb.toString());
        }
        return strArr2;
    }

    private String a(int i, int i2, GriverImageService griverImageService, File file) {
        String str = null;
        if (file != null && file.exists()) {
            long j = 0;
            if (file.length() > 0) {
                int a2 = a(i2, file);
                int a3 = a(i);
                String a4 = a(file.getName(), a2, a3);
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (FileUtils.checkFile(a4)) {
                        a4 = a(a4);
                        str = H5ResourceHandlerUtil.localIdToUrl(a4, H5ResourceHandlerUtil.IMAGE);
                    } else {
                        APEncodeOptions aPEncodeOptions = new APEncodeOptions();
                        aPEncodeOptions.mode = new APMaxLenMode(a2);
                        aPEncodeOptions.quality = a3;
                        aPEncodeOptions.outputFile = a4;
                        APEncodeResult compress = griverImageService.compress(file, aPEncodeOptions);
                        if (compress.isSuccess()) {
                            a4 = a(compress.encodeFilePath);
                            str = H5ResourceHandlerUtil.localIdToUrl(a4, H5ResourceHandlerUtil.IMAGE);
                        }
                    }
                    StringBuilder sb = new StringBuilder("compressFile in: ");
                    sb.append(file);
                    sb.append(", len: ");
                    sb.append(file.length());
                    sb.append(", outPath: ");
                    sb.append(a4);
                    sb.append(", length: ");
                    if (!TextUtils.isEmpty(a4)) {
                        j = new File(a4).length();
                    }
                    sb.append(j);
                    sb.append(", cost: ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    RVLogger.d("H5CompressImage", sb.toString());
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder("compressFiles file: ");
                    sb2.append(file);
                    sb2.append(", quality: ");
                    sb2.append(a3);
                    sb2.append(", out: ");
                    sb2.append((String) null);
                    sb2.append(" error!!");
                    RVLogger.e("H5CompressImage", sb2.toString(), e);
                }
            }
        }
        return str;
    }

    private int a(int i, File file) {
        int i2 = this.f10489a;
        int i3 = this.b;
        if (this.c == null) {
            this.c = (GriverImageService) RVProxy.get(GriverImageService.class);
        }
        GriverImageService griverImageService = this.c;
        if (griverImageService != null) {
            APImageInfo parseImageInfo = griverImageService.parseImageInfo(file.getAbsolutePath());
            if (parseImageInfo == null || parseImageInfo.width <= 0 || parseImageInfo.height <= 0) {
                StringBuilder sb = new StringBuilder("Parse image info failed @");
                sb.append(file.getAbsolutePath());
                RVLogger.d("H5CompressImage", sb.toString());
                return i;
            }
            if (i2 > parseImageInfo.width) {
                i2 = parseImageInfo.width;
            }
            if (i3 > parseImageInfo.height) {
                i3 = parseImageInfo.height;
            }
            StringBuilder sb2 = new StringBuilder("Parsed width = ");
            sb2.append(parseImageInfo.width);
            sb2.append(",height = ");
            sb2.append(parseImageInfo.height);
            sb2.append("maxWidth =");
            sb2.append(this.f10489a);
            sb2.append(",maxHeight = ");
            sb2.append(this.b);
            sb2.append("After adjust w = ");
            sb2.append(i2);
            sb2.append(",h = ");
            sb2.append(i3);
            RVLogger.d("H5CompressImage", sb2.toString());
            float f = ((float) i2) / ((float) parseImageInfo.width);
            float f2 = ((float) i3) / ((float) parseImageInfo.height);
            if (f > f2) {
                i2 = (int) (f2 * ((float) parseImageInfo.width));
            } else {
                i3 = (int) (f * ((float) parseImageInfo.height));
            }
            return Math.max(i2, i3);
        }
        RVLogger.d("H5CompressImage", "ImageProcessor null!");
        return i;
    }

    private int a(int i) {
        int i2 = 1;
        if (i == 0) {
            i2 = 4;
        } else if (!(i == 2 || (i == 4 && NetworkUtil.getCurrentNetworkType(GriverEnv.getApplicationContext(), false) == NetworkUtil.Network.NETWORK_WIFI))) {
            i2 = 0;
        }
        RVLogger.d("H5CompressImage", "calcQuality compressLevel: ".concat(String.valueOf(i)));
        return i2;
    }

    private String a(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(GriverEnv.getApplicationContext().getCacheDir());
        sb.append(File.separator);
        sb.append("apm-h5");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        sb2.append("_");
        sb2.append(i2);
        sb2.append("_");
        sb2.append(str);
        File file = new File(obj, sb2.toString());
        file.getParentFile().mkdirs();
        RVLogger.d("H5CompressImage", "makeOutputPath: ".concat(String.valueOf(file)));
        return file.getAbsolutePath();
    }

    private void a(BridgeCallback bridgeCallback, String[] strArr) {
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put(PathToLocalUtil.AL_MEDIA_FILES, (Object) strArr);
        a(bridgeCallback, jSONObject);
    }

    private void a(BridgeCallback bridgeCallback, com.alibaba.fastjson.JSONObject jSONObject) {
        RVLogger.d("H5CompressImage", "sendResult result: ".concat(String.valueOf(jSONObject)));
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    /* access modifiers changed from: private */
    public void a(BridgeCallback bridgeCallback, int i) {
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("error", (Object) Integer.valueOf(i));
        a(bridgeCallback, jSONObject);
    }

    private String a(String str) {
        return LocalIdTool.get().encodeToLocalId(str);
    }

    private String b(String str) {
        if (str == null || !str.startsWith(H5ResourceHandlerUtil.RESOURCE)) {
            return LocalIdTool.get().decodeToPath(str);
        }
        return H5ResourceHandlerUtil.apUrlToFilePath(str);
    }

    public void onInitialized() {
        this.c = (GriverImageService) RVProxy.get(GriverImageService.class);
    }
}
