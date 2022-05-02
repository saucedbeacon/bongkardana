package com.alibaba.griver.core.jsapi.share;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.resource.appinfo.AppInfoConstants;
import com.alibaba.griver.api.ui.share.BaseShareItem;
import com.alibaba.griver.api.ui.share.GriverShareExtension;
import com.alibaba.griver.api.ui.share.GriverShareMenuExtension;
import com.alibaba.griver.api.ui.share.GriverShareSchemeExtension;
import com.alibaba.griver.api.ui.share.ShareParam;
import com.alibaba.griver.api.ui.share.ShareResultListener;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.google.common.base.Ascii;
import java.net.URLEncoder;
import java.util.List;
import kotlin.text.Typography;
import o.getTabbarModel;

@Keep
public class ShareBridgeExtension extends SimpleBridgeExtension {
    private static final String TAG = "ShareBridgeExtension";
    private static int getMax = 122;
    private static int getMin = -1623978896;
    private static int isInside = 1;
    private static int length = 1930490826;
    private static short[] setMax;
    private static byte[] setMin = {Ascii.DLE, -20, -9, 4, 0};
    private static int toIntRange;

    static /* synthetic */ void access$000(ShareBridgeExtension shareBridgeExtension, ShareParam shareParam, BridgeCallback bridgeCallback) {
        try {
            int i = isInside + 65;
            toIntRange = i % 128;
            if ((i % 2 != 0 ? '!' : '3') != '3') {
                shareBridgeExtension.startShare(shareParam, bridgeCallback);
                Object obj = null;
                super.hashCode();
                return;
            }
            shareBridgeExtension.startShare(shareParam, bridgeCallback);
        } catch (Exception e) {
            throw e;
        }
    }

    static /* synthetic */ void access$100(ShareBridgeExtension shareBridgeExtension, BridgeCallback bridgeCallback, String str, boolean z) {
        int i = toIntRange + 69;
        isInside = i % 128;
        int i2 = i % 2;
        shareBridgeExtension.sendShareResult(bridgeCallback, str, z);
        int i3 = toIntRange + 45;
        isInside = i3 % 128;
        int i4 = i3 % 2;
    }

    static /* synthetic */ void access$200(ShareBridgeExtension shareBridgeExtension, String str, Page page, String str2, String str3, String str4, String str5, String str6) {
        int i = isInside + 95;
        toIntRange = i % 128;
        int i2 = i % 2;
        shareBridgeExtension.sendMonitor(str, page, str2, str3, str4, str5, str6);
        int i3 = isInside + 45;
        toIntRange = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 16 : 6) != 6) {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void shareTinyAppMsg(@BindingNode(Page.class) Page page, @BindingParam({"page"}) String str, @BindingParam({"title"}) String str2, @BindingParam({"desc"}) String str3, @BindingParam({"content"}) String str4, @BindingParam({"imageUrl"}) String str5, @BindingParam({"bgImgUrl"}) String str6, @BindingParam({"from"}) String str7, @BindingCallback BridgeCallback bridgeCallback) {
        String str8;
        String str9;
        String str10;
        String str11;
        Page page2 = page;
        final BridgeCallback bridgeCallback2 = bridgeCallback;
        boolean z = false;
        if ((page2 == null) || page.getPageContext() == null) {
            bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        AppModel appModel = (AppModel) page.getApp().getData(AppModel.class);
        if ((appModel == null ? Typography.amp : '1') != '1') {
            int i = isInside + 113;
            toIntRange = i % 128;
            int i2 = i % 2;
            bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        Activity activity = page.getPageContext().getActivity();
        if (activity == null) {
            bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        if ((TextUtils.isEmpty(((GriverShareSchemeExtension) RVProxy.get(GriverShareSchemeExtension.class)).getScheme()) ? 15 : 'P') != 'P') {
            int i3 = toIntRange + 81;
            isInside = i3 % 128;
            int i4 = i3 % 2;
            try {
                bridgeCallback2.sendBridgeResponse(BridgeResponse.newError(3, "Share is not available"));
            } catch (Exception e) {
                throw e;
            }
        } else {
            Bundle startParams = page.getApp().getStartParams();
            if (!AppInfoScene.isDevSource(startParams) || !"DEBUG".equalsIgnoreCase(startParams.getString(AppInfoScene.PARAM_SCENE))) {
                if ((TextUtils.isEmpty(str2) ? 'Z' : 25) != 25) {
                    int i5 = isInside + 49;
                    toIntRange = i5 % 128;
                    int i6 = i5 % 2;
                    str8 = appModel.getAppInfoModel().getName();
                } else {
                    str8 = str2;
                }
                if (TextUtils.isEmpty(str3)) {
                    z = true;
                }
                if (z) {
                    str9 = appModel.getAppInfoModel().getDesc();
                    int i7 = toIntRange + 119;
                    isInside = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    str9 = str3;
                }
                if (TextUtils.isEmpty(str5)) {
                    str11 = appModel.getAppInfoModel().getLogo();
                    str10 = str;
                } else {
                    str10 = str;
                    str11 = str5;
                }
                String encodeURIComponent = encodeURIComponent(str10);
                String appId = appModel.getAppId();
                StringBuilder sb = new StringBuilder();
                sb.append(((GriverShareSchemeExtension) RVProxy.get(GriverShareSchemeExtension.class)).getScheme());
                sb.append("?_ariver_appid=");
                sb.append(appId);
                String obj = sb.toString();
                if (!TextUtils.isEmpty(encodeURIComponent)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append("&_ariver_path=");
                    sb2.append(encodeURIComponent);
                    obj = sb2.toString();
                }
                if (AppInfoScene.isDevSource(startParams)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj);
                    sb3.append("&_ariver_source=debug&_ariver_scene=");
                    sb3.append(startParams.getString(AppInfoScene.PARAM_SCENE));
                    sb3.append("&_ariver_token=");
                    sb3.append(startParams.getString(AppInfoConstants.ARIVER_TOKEN));
                    obj = sb3.toString();
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(obj);
                sb4.append("&_ariver_version=");
                sb4.append(appModel.getAppVersion());
                String obj2 = sb4.toString();
                final ShareParam shareParam = new ShareParam();
                shareParam.page = page2;
                shareParam.activity = activity;
                shareParam.title = str8;
                shareParam.desc = str9;
                shareParam.content = str4;
                shareParam.imageUrl = str11;
                shareParam.url = obj2;
                shareParam.bgImgUrl = str6;
                shareParam.from = str7;
                if (TextUtils.isEmpty(str6)) {
                    final Bitmap captureScreen = captureScreen(activity);
                    GriverExecutors.getExecutor(ExecutorType.IO).execute(new Runnable() {
                        public void run() {
                            String imageTempDir = ImageUtils.getImageTempDir(GriverEnv.getApplicationContext());
                            StringBuilder sb = new StringBuilder();
                            sb.append(System.currentTimeMillis());
                            sb.append(".png");
                            String obj = sb.toString();
                            FileUtils.mkdirs(imageTempDir, true);
                            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                            Bitmap bitmap = captureScreen;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(imageTempDir);
                            sb2.append(obj);
                            ImageUtils.writeImage(bitmap, compressFormat, sb2.toString());
                            ShareParam shareParam = shareParam;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(imageTempDir);
                            sb3.append(obj);
                            shareParam.bgImgUrl = sb3.toString();
                            GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() {
                                public void run() {
                                    ShareBridgeExtension.access$000(ShareBridgeExtension.this, shareParam, bridgeCallback2);
                                }
                            });
                        }
                    });
                    return;
                }
                startShare(shareParam, bridgeCallback2);
                int i9 = isInside + 5;
                toIntRange = i9 % 128;
                int i10 = i9 % 2;
                return;
            }
            bridgeCallback2.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.graphics.Bitmap] */
    public Bitmap captureScreen(Activity activity) {
        ? r0 = 0;
        try {
            View decorView = activity.getWindow().getDecorView();
            decorView.buildDrawingCache();
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            int i = rect.top;
            boolean z = true;
            decorView.setDrawingCacheEnabled(true);
            Bitmap drawingCache = decorView.getDrawingCache();
            Bitmap createBitmap = Bitmap.createBitmap(drawingCache, 0, i, drawingCache.getWidth(), drawingCache.getHeight() - i);
            decorView.destroyDrawingCache();
            int i2 = isInside + 19;
            toIntRange = i2 % 128;
            if (i2 % 2 != 0) {
                z = false;
            }
            if (z) {
                return createBitmap;
            }
            int length2 = r0.length;
            return createBitmap;
        } catch (Exception e) {
            RVLogger.e(TAG, (Throwable) e);
            return r0;
        }
    }

    private void startShare(ShareParam shareParam, BridgeCallback bridgeCallback) {
        List<BaseShareItem> shareItems = ((GriverShareMenuExtension) RVProxy.get(GriverShareMenuExtension.class)).getShareItems();
        final String str = shareParam.url;
        final Page page = shareParam.page;
        final String str2 = shareParam.from;
        final BridgeCallback bridgeCallback2 = bridgeCallback;
        ((GriverShareExtension) RVProxy.get(GriverShareExtension.class)).startShare(shareParam, shareItems, new ShareResultListener() {
            public void success(String str) {
                ShareBridgeExtension.access$100(ShareBridgeExtension.this, bridgeCallback2, str, true);
                ShareBridgeExtension.access$200(ShareBridgeExtension.this, str, page, str, str2, "success", (String) null, (String) null);
            }

            public void cancel() {
                ShareBridgeExtension.access$100(ShareBridgeExtension.this, bridgeCallback2, (String) null, false);
                ShareBridgeExtension.access$200(ShareBridgeExtension.this, (String) null, page, str, str2, "cancel", (String) null, (String) null);
            }

            public void fail(String str, String str2, String str3) {
                ShareBridgeExtension.access$100(ShareBridgeExtension.this, bridgeCallback2, str, false);
                ShareBridgeExtension.access$200(ShareBridgeExtension.this, str, page, str, str2, "fail", str2, str3);
            }
        });
        try {
            int i = isInside + 33;
            toIntRange = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private void sendMonitor(String str, Page page, String str2, String str3, String str4, String str5, String str6) {
        MonitorMap.Builder builder = new MonitorMap.Builder();
        try {
            String pageURI = page.getPageURI();
            try {
                pageURI = URLEncoder.encode(pageURI, getTabbarModel.ENC);
                int i = isInside + 111;
                toIntRange = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                GriverLogger.w(TAG, "encode pageUrl failed, just print", e);
            }
            builder.appId(page.getApp().getAppId());
            builder.version(page.getApp()).pageUrl(pageURI);
            builder.append("from", str3);
            try {
                str2 = URLEncoder.encode(str2, getTabbarModel.ENC);
                int i3 = toIntRange + 71;
                isInside = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e2) {
                GriverLogger.w(TAG, "encode shareUrl failed, just print", e2);
            }
            builder.append(GriverMonitorConstants.KEY_SHARE_URL, str2);
            builder.append("result", str4);
            builder.append("channel", str);
            if ("fail".equalsIgnoreCase(str4)) {
                try {
                    builder.append("errorCode", str5);
                    builder.append("errorMessage", str6);
                    int i5 = isInside + 61;
                    toIntRange = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Exception e3) {
                    throw e3;
                }
            }
            GriverMonitor.error(GriverMonitorConstants.EVENT_APP_SHARE, "GriverAppContainer", builder.build());
        } catch (Exception e4) {
            throw e4;
        }
    }

    private void sendShareResult(BridgeCallback bridgeCallback, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shareResult", (Object) Boolean.valueOf(z));
            if (!(TextUtils.isEmpty(str))) {
                int i = toIntRange + 69;
                isInside = i % 128;
                if ((i % 2 == 0 ? 17 : ')') != ')') {
                    jSONObject.put("channelName", (Object) str);
                    int i2 = 18 / 0;
                } else {
                    jSONObject.put("channelName", (Object) str);
                }
            }
            bridgeCallback.sendJSONResponse(jSONObject);
        } catch (Exception e) {
            throw e;
        }
    }

    private String encodeURIComponent(String str) {
        try {
            int i = toIntRange + 79;
            isInside = i % 128;
            int i2 = i % 2;
            try {
                str = URLEncoder.encode(str, setMin(View.combineMeasuredStates(0, 0) - 1930490741, (short) (-5 - TextUtils.getOffsetAfter("", 0)), View.resolveSize(0, 0) - 117, (byte) KeyEvent.keyCodeFromString(""), View.combineMeasuredStates(0, 0) + 1623978896).intern());
                int i3 = isInside + 91;
                toIntRange = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable th) {
                GriverLogger.e(TAG, "shareTinyAppMsg...e=".concat(String.valueOf(th)));
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String setMin(int i, short s, int i2, byte b, int i3) {
        boolean z;
        short s2;
        int i4;
        StringBuilder sb = new StringBuilder();
        int i5 = i2 + getMax;
        int i6 = 0;
        int i7 = 1;
        if (!(i5 != -1)) {
            int i8 = isInside + 81;
            toIntRange = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((setMin != null ? 14 : 'S') != 14) {
                try {
                    try {
                        i5 = (short) (setMax[getMin + i3] + getMax);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                int i10 = isInside + 59;
                toIntRange = i10 % 128;
                i5 = (byte) (i10 % 2 != 0 ? setMin[i3 >>> getMin] * getMax : setMin[getMin + i3] + getMax);
            }
        }
        if ((i5 > 0 ? ',' : '.') == ',') {
            int i11 = ((i3 + i5) - 2) + getMin;
            if (z) {
                int i12 = toIntRange + 37;
                isInside = i12 % 128;
                int i13 = i12 % 2;
                i6 = 1;
            }
            int i14 = i11 + i6;
            char c = (char) (i + length);
            sb.append(c);
            while (true) {
                if ((i7 < i5 ? 9 : 'J') != 9) {
                    break;
                }
                if (setMin != null) {
                    i4 = i14 - 1;
                    s2 = (byte) (setMin[i14] + s);
                } else {
                    i4 = i14 - 1;
                    s2 = (short) (setMax[i14] + s);
                }
                c = (char) (c + (s2 ^ b));
                i14 = i4;
                sb.append(c);
                i7++;
            }
        }
        return sb.toString();
    }
}
