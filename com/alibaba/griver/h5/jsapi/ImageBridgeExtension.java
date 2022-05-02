package com.alibaba.griver.h5.jsapi;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import com.alibaba.griver.image.photo.PhotoContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import kotlin.text.Typography;

@Keep
public class ImageBridgeExtension extends SimpleBridgeExtension {
    public static final int ERR_FILE_NOT_FOUND_OR_NOT_READABLE = 103;
    public static final int ERR_INVALID_FILE_PATH = 101;
    public static final int ERR_MISSING_FILE_PATH = 100;
    public static final int ERR_UNKNOWN_IMAGE_FORMAT = 104;
    public static final int ERR_UNSUPPORTED_FILE_PATH = 102;
    public static final int NO_ERROR = 0;
    private static final String TAG = "LoadLocalImagePlugin";
    private static int getMax = 1;
    private static int length = 145;
    private static int setMin;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r0 != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        r6.sendBridgeResponse(com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.INVALID_PARAM);
        r4 = getMax + 105;
        setMin = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (android.text.TextUtils.isEmpty(r5) == false) goto L_0x0029;
     */
    @com.alibaba.ariver.kernel.api.annotation.ActionFilter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadLocalImage(@com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext(required = true) com.alibaba.ariver.engine.api.bridge.model.ApiContext r4, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"filePath"}) java.lang.String r5, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r6) {
        /*
            r3 = this;
            int r4 = setMin
            int r4 = r4 + 37
            int r0 = r4 % 128
            getMax = r0
            int r4 = r4 % 2
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L_0x0010
            r4 = 1
            goto L_0x0011
        L_0x0010:
            r4 = 0
        L_0x0011:
            if (r4 == r0) goto L_0x001c
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x001a }
            if (r4 != 0) goto L_0x002d
            goto L_0x0029
        L_0x001a:
            r4 = move-exception
            throw r4
        L_0x001c:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            r2 = 34
            int r2 = r2 / r1
            if (r4 != 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x002d
        L_0x0029:
            r3.loadLocalImageInternal(r5, r6)
            return
        L_0x002d:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r4 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.INVALID_PARAM
            r6.sendBridgeResponse(r4)
            int r4 = getMax
            int r4 = r4 + 105
            int r5 = r4 % 128
            setMin = r5
            int r4 = r4 % 2
            return
        L_0x003d:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.h5.jsapi.ImageBridgeExtension.loadLocalImage(com.alibaba.ariver.engine.api.bridge.model.ApiContext, java.lang.String, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public byte[] retrieveImageBytesFromFile(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[((int) file.length())];
            int read = fileInputStream.read(bArr);
            fileInputStream.close();
            if ((read > 0 ? 12 : 'T') == 12) {
                int i = getMax + 53;
                setMin = i % 128;
                int i2 = i % 2;
                return bArr;
            }
        } catch (FileNotFoundException e) {
            GriverLogger.e(TAG, "", e);
        } catch (IOException e2) {
            GriverLogger.e(TAG, "", e2);
        }
        int i3 = getMax + 19;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public String encodeImageBytesToString(byte[] bArr) {
        int i = setMin + 61;
        getMax = i % 128;
        int i2 = i % 2;
        if ((bArr != null ? 'C' : 15) != 15) {
            int i3 = setMin + 1;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            if (bArr.length > 0) {
                try {
                    return new String(Base64.encode(bArr, 0), getMin(PhoneNumberUtils.compare("", ""), View.resolveSizeAndState(0, 0, 0) + 5, 213 - (ViewConfiguration.getScrollBarSize() >> 8), 3 - TextUtils.getCapsMode("", 0, 0), new char[]{2, 65513, 65524, 17, 16}).intern());
                } catch (UnsupportedEncodingException e) {
                    GriverLogger.e(TAG, "", e);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CheckFilePathResult checkFilePath(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new CheckFilePathResult(100, "Missing filePath");
            }
            if (str.contains("/../")) {
                return new CheckFilePathResult(101, "Invalid filePath");
            }
            if ((!str.startsWith("/") ? 'T' : '8') == 'T') {
                int i = getMax + 13;
                setMin = i % 128;
                int i2 = i % 2;
                if (!str.startsWith(PhotoContext.FILE_SCHEME)) {
                    return new CheckFilePathResult(102, "Unsupported filePath");
                }
            }
            if (!pathIsInAppScope(str)) {
                return new CheckFilePathResult(102, "Unsupported filePath");
            }
            File file = new File(URI.create(str).getPath());
            if ((file.exists() ? '6' : Typography.quote) != '\"') {
                int i3 = getMax + 55;
                setMin = i3 % 128;
                int i4 = i3 % 2;
                if (file.canRead()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(fileInputStream, (Rect) null, options);
                        fileInputStream.close();
                        String str2 = options.outMimeType;
                        if ((str2 != null ? Typography.dollar : 'E') == '$') {
                            if (str2.contains(H5ResourceHandlerUtil.IMAGE)) {
                                int i5 = setMin + 51;
                                getMax = i5 % 128;
                                int i6 = i5 % 2;
                                return new CheckFilePathResult(file);
                            }
                        }
                        return new CheckFilePathResult(104, "Unknown image format");
                    } catch (FileNotFoundException unused) {
                        return new CheckFilePathResult(103, "File not found or not readable");
                    } catch (IOException e) {
                        GriverLogger.e(TAG, "", e);
                    }
                }
            }
            return new CheckFilePathResult(103, "File not found or not readable");
        } catch (Exception e2) {
            throw e2;
        }
    }

    private boolean pathIsInAppScope(String str) {
        String str2;
        String[] strArr;
        int i;
        String str3;
        try {
            GriverLogger.d(TAG, "check load local image path: ".concat(String.valueOf(str)));
            File file = new File(str.replace(PhotoContext.FILE_SCHEME, ""));
            String canonicalPath = GriverEnv.getApplicationContext().getFilesDir().getParentFile().getCanonicalPath();
            GriverLogger.d(TAG, "internal file path: ".concat(String.valueOf(canonicalPath)));
            if (!file.getCanonicalPath().startsWith(canonicalPath)) {
                File externalFilesDir = GriverEnv.getApplicationContext().getExternalFilesDir((String) null);
                if (externalFilesDir != null) {
                    str2 = externalFilesDir.getParentFile().getCanonicalPath();
                } else {
                    str2 = "";
                }
                GriverLogger.d(TAG, "external file path: ".concat(String.valueOf(str2)));
                if (!TextUtils.isEmpty(str2)) {
                    int i2 = getMax + 107;
                    setMin = i2 % 128;
                    int i3 = i2 % 2;
                    if (file.getCanonicalPath().startsWith(str2)) {
                        return true;
                    }
                }
                String config = GriverConfig.getConfig(GriverConfigConstants.KEY_LOAD_LOCAL_IMAGE_PATH_WHITE_LIST, "");
                if (!TextUtils.isEmpty(config)) {
                    int i4 = getMax + 17;
                    setMin = i4 % 128;
                    if (i4 % 2 != 0) {
                        try {
                            strArr = config.split(",");
                            i = strArr.length;
                        } catch (Exception e) {
                            GriverLogger.e(TAG, "parse white list failed", e);
                        }
                    } else {
                        strArr = config.split(",");
                        i = strArr.length;
                    }
                    int i5 = 0;
                    while (i5 < i) {
                        int i6 = getMax + 77;
                        setMin = i6 % 128;
                        if ((i6 % 2 != 0 ? (char) 9 : 19) != 19) {
                            str3 = strArr[i5];
                            int i7 = 40 / 0;
                            if ((file.getCanonicalPath().startsWith(str3) ? 'R' : 16) != 'R') {
                                i5++;
                            }
                        } else {
                            str3 = strArr[i5];
                            if (!file.getCanonicalPath().startsWith(str3)) {
                                i5++;
                            }
                        }
                        GriverLogger.d(TAG, "load local image use white list path: ".concat(String.valueOf(str3)));
                        return true;
                    }
                }
                return false;
            }
            try {
                int i8 = setMin + 59;
                try {
                    getMax = i8 % 128;
                    int i9 = i8 % 2;
                    return true;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Exception e3) {
                throw e3;
            }
        } catch (Exception e4) {
            GriverLogger.e(TAG, "check file path failed", e4);
        }
    }

    private void loadLocalImageInternal(final String str, final BridgeCallback bridgeCallback) {
        GriverExecutors.getExecutor(ExecutorType.IO).execute(new Runnable() {
            public void run() {
                CheckFilePathResult checkFilePath = ImageBridgeExtension.this.checkFilePath(str);
                if (checkFilePath.isSuccessful()) {
                    String encodeImageBytesToString = ImageBridgeExtension.this.encodeImageBytesToString(ImageBridgeExtension.this.retrieveImageBytesFromFile(checkFilePath.file));
                    if (encodeImageBytesToString != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("data", (Object) encodeImageBytesToString);
                        bridgeCallback.sendJSONResponse(jSONObject);
                        return;
                    }
                    return;
                }
                bridgeCallback.sendBridgeResponse(BridgeResponse.newError(checkFilePath.errorCode, checkFilePath.errorMessage));
            }
        });
        int i = setMin + 67;
        getMax = i % 128;
        if ((i % 2 == 0 ? Typography.less : '0') == '<') {
            Object obj = null;
            super.hashCode();
        }
    }

    static class CheckFilePathResult {
        public final int errorCode;
        public final String errorMessage;
        public final File file;

        /* access modifiers changed from: package-private */
        public boolean isSuccessful() {
            return this.errorCode == 0;
        }

        CheckFilePathResult(File file2) {
            this.errorCode = 0;
            this.errorMessage = "";
            this.file = file2;
        }

        CheckFilePathResult(int i, String str) {
            this.file = null;
            this.errorCode = i;
            this.errorMessage = str;
        }
    }

    private static String getMin(boolean z, int i, int i2, int i3, char[] cArr) {
        int i4;
        char[] cArr2;
        char[] cArr3;
        int i5;
        int i6 = setMin + 99;
        getMax = i6 % 128;
        int i7 = 0;
        if (i6 % 2 == 0) {
            cArr2 = new char[i];
            i4 = 1;
        } else {
            cArr2 = new char[i];
            i4 = 0;
        }
        while (i4 < i) {
            cArr2[i4] = (char) (cArr[i4] + i2);
            cArr2[i4] = (char) (cArr2[i4] - length);
            i4++;
        }
        if (i3 > 0) {
            try {
                int i8 = getMax + 47;
                setMin = i8 % 128;
                int i9 = i8 % 2;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr2, 0, cArr4, 0, i);
                int i10 = i - i3;
                System.arraycopy(cArr4, 0, cArr2, i10, i3);
                System.arraycopy(cArr4, i3, cArr2, 0, i10);
            } catch (Exception e) {
                throw e;
            }
        }
        if ((z ? (char) 1 : 27) != 27) {
            int i11 = getMax + 1;
            setMin = i11 % 128;
            if (i11 % 2 != 0) {
                cArr3 = new char[i];
                i7 = 1;
            } else {
                cArr3 = new char[i];
            }
            while (i5 < i) {
                int i12 = getMax + 107;
                setMin = i12 % 128;
                if ((i12 % 2 != 0 ? 'P' : 'V') != 'V') {
                    cArr3[i5] = cArr2[(i / i5) / 1];
                    i5 += 39;
                } else {
                    cArr3[i5] = cArr2[(i - i5) - 1];
                    i5++;
                }
            }
            cArr2 = cArr3;
        }
        return new String(cArr2);
    }
}
