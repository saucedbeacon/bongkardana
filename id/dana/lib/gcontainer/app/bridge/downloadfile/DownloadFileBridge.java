package id.dana.lib.gcontainer.app.bridge.downloadfile;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import id.dana.lib.gcontainer.app.bridge.downloadfile.businessaccount.DownloadResultType;
import id.dana.tracker.TrackerKey;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.FontRes;
import o.LocationBridgeExtension;
import o.TitleBarRightButtonView;
import o.WindowBridgeExtension;
import o.datePicker;
import o.getLeftSelectedOption;
import o.setLeftSelectedIndex;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\nH\u0002J0\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J0\u0010\u0017\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0018\u001a\u00020\nH\u0003J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/downloadfile/DownloadFileBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "activity", "Landroid/app/Activity;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "downloadFileEntity", "Lid/dana/lib/gcontainer/app/bridge/downloadfile/DownloadFileEntity;", "fileFormat", "", "mimeType", "createErrorResult", "Lcom/alibaba/fastjson/JSONObject;", "errorType", "createSuccessResult", "filePath", "download", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "event", "info", "downloadFile", "generateTimeFormat", "handleDownloadFile", "handleFile", "mapDownloadResult", "downloadResult", "Lid/dana/lib/gcontainer/app/bridge/downloadfile/businessaccount/model/DownloadResult;", "onReceivePermissionResult", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$PermissionResultMessageEvent;", "processDownload", "Companion", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class DownloadFileBridge extends BaseBridge {
    @NotNull
    public static final length Companion = new length((byte) 0);
    private static final int MINIMUM_STORAGE_AVAILABLE = 100;
    private static final String PDF_FILE_FORMAT = ".pdf";
    private static final String PDF_MIME_TYPE = "application/pdf";
    private static final String PNG_FILE_FORMAT = ".png";
    private static final String PNG_MIME_TYPE = "image/png";
    public static final int REQUEST_CODE_PERMISSION = 201;
    private static final String TAG;
    private Activity activity;
    private BridgeCallback bridgeCallback;
    private DownloadFileEntity downloadFileEntity;
    /* access modifiers changed from: private */
    public String fileFormat;
    private String mimeType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends TypeReference<DownloadFileEntity> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends TypeReference<DownloadFileEntity> {
    }

    public static final /* synthetic */ String access$getFileFormat$p(DownloadFileBridge downloadFileBridge) {
        String str = downloadFileBridge.fileFormat;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fileFormat");
        }
        return str;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void downloadFile(@NotNull @BindingNode(Page.class) Page page, @NotNull @BindingParam(name = {"event"}) String str, @NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback2) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(str, "event");
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Object obj = null;
        Activity activity2 = pageContext != null ? pageContext.getActivity() : null;
        if (activity2 != null) {
            this.activity = activity2;
            this.bridgeCallback = bridgeCallback2;
            try {
                obj = JSONObject.parseObject(jSONObject.toJSONString(), new setMin(), new Feature[0]);
            } catch (JSONException | NullPointerException unused) {
            }
            DownloadFileEntity downloadFileEntity2 = (DownloadFileEntity) obj;
            if (downloadFileEntity2 != null) {
                this.downloadFileEntity = downloadFileEntity2;
                int hashCode = str.hashCode();
                if (hashCode != -1124766330) {
                    if (hashCode == 3143036 && str.equals("file")) {
                        this.fileFormat = ".png";
                        this.mimeType = PNG_MIME_TYPE;
                        handleDownloadFile();
                        return;
                    }
                } else if (str.equals(DownloadFileEvent.BUSINESS_ACCOUNT_QR)) {
                    this.fileFormat = ".pdf";
                    this.mimeType = "application/pdf";
                    handleDownloadFile();
                    return;
                }
                createErrorResult("001");
            }
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void download(@NotNull @BindingNode(Page.class) Page page, @NotNull @BindingParam(name = {"event"}) String str, @NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback2) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(str, "event");
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Object obj = null;
        Activity activity2 = pageContext != null ? pageContext.getActivity() : null;
        if (activity2 != null) {
            this.activity = activity2;
            this.bridgeCallback = bridgeCallback2;
            try {
                obj = JSONObject.parseObject(jSONObject.toJSONString(), new getMax(), new Feature[0]);
            } catch (JSONException | NullPointerException unused) {
            }
            DownloadFileEntity downloadFileEntity2 = (DownloadFileEntity) obj;
            if (downloadFileEntity2 != null) {
                this.downloadFileEntity = downloadFileEntity2;
                int hashCode = str.hashCode();
                if (hashCode != -1124766330) {
                    if (hashCode == 3143036 && str.equals("file")) {
                        this.fileFormat = ".png";
                        this.mimeType = PNG_MIME_TYPE;
                        handleDownloadFile();
                        return;
                    }
                } else if (str.equals(DownloadFileEvent.BUSINESS_ACCOUNT_QR)) {
                    this.fileFormat = ".pdf";
                    this.mimeType = "application/pdf";
                    handleDownloadFile();
                    return;
                }
                createErrorResult("001");
            }
        }
    }

    private final void handleFile() {
        String str;
        DownloadFileEntity downloadFileEntity2 = this.downloadFileEntity;
        if (downloadFileEntity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadFileEntity");
        }
        String filePath = downloadFileEntity2.getFilePath();
        if (filePath == null) {
            DownloadFileEntity downloadFileEntity3 = this.downloadFileEntity;
            if (downloadFileEntity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("downloadFileEntity");
            }
            filePath = downloadFileEntity3.getSource();
        }
        if (filePath == null) {
            DownloadFileEntity downloadFileEntity4 = this.downloadFileEntity;
            if (downloadFileEntity4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("downloadFileEntity");
            }
            filePath = downloadFileEntity4.getUrl();
        }
        CharSequence charSequence = filePath;
        boolean z = false;
        if (charSequence == null || charSequence.length() == 0) {
            mapDownloadResult(new WindowBridgeExtension.AnonymousClass1.AnonymousClass1("GENERAL_ERROR", 2));
            return;
        }
        DownloadFileEntity downloadFileEntity5 = this.downloadFileEntity;
        if (downloadFileEntity5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadFileEntity");
        }
        String businessName = downloadFileEntity5.getBusinessName();
        if (businessName == null) {
            businessName = "";
        }
        if (businessName.length() > 0) {
            z = true;
        }
        if (z) {
            StringBuilder sb = new StringBuilder("QR_");
            DownloadFileEntity downloadFileEntity6 = this.downloadFileEntity;
            if (downloadFileEntity6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("downloadFileEntity");
            }
            sb.append(downloadFileEntity6.getBusinessName());
            sb.append("_");
            sb.append(generateTimeFormat());
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("DANA_");
            sb2.append(System.currentTimeMillis());
            str = sb2.toString();
        }
        Activity activity2 = this.activity;
        if (activity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
        }
        BridgeCallback bridgeCallback2 = this.bridgeCallback;
        if (bridgeCallback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
        }
        WindowBridgeExtension.AnonymousClass1.AnonymousClass2 r2 = new datePicker(activity2, bridgeCallback2, new setMax(this)) {
            private final Activity getMin;
            private final BridgeCallback setMax;

            {
                Intrinsics.checkNotNullParameter(r3, AkuEventParamsKey.KEY_ACTIVITY);
                Intrinsics.checkNotNullParameter(r4, "bridgeCallback");
                Intrinsics.checkNotNullParameter(r5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                Context applicationContext = r3.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
                this.getMin = r3;
                this.setMax = r4;
            }

            public final void setMin(@NotNull File file, @NotNull String str) {
                Uri uri;
                Intrinsics.checkNotNullParameter(file, "imageFile");
                Intrinsics.checkNotNullParameter(str, "mimeType");
                if (IntRange.length((Context) this.getMin, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    BridgeCallback bridgeCallback = this.setMax;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("success", Boolean.FALSE);
                    Unit unit = Unit.INSTANCE;
                    bridgeCallback.sendJSONResponse(jSONObject);
                    return;
                }
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "imageFile.name");
                getCurrentContentInsetRight getcurrentcontentinsetright = new getCurrentContentInsetRight(name, TrackerKey.DanaBalanceRecipientTypeProperty.DANA, str);
                if (Build.VERSION.SDK_INT >= 29) {
                    setContentInsetEndWithActions min = getCurrentContentInsetLeft.getMin(this.getMin, getcurrentcontentinsetright);
                    if (min == null || (uri = min.length) == null) {
                        return;
                    }
                } else {
                    uri = getContentInsetLeft.getMax(this.getMin, getcurrentcontentinsetright);
                    if (uri == null) {
                        return;
                    }
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    OutputStream max = getContentInsetRight.getMax(uri, this.getMin);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        } else if (max != null) {
                            max.write(bArr, 0, read);
                        }
                    }
                    fileInputStream.close();
                    if (max != null) {
                        max.flush();
                    }
                    if (max != null) {
                        max.close();
                    }
                    Context context = this.getMin;
                    context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                    if (Build.VERSION.SDK_INT > 28) {
                        new setContentInsetEndWithActions(context, uri).toFloatRange();
                    }
                    BridgeCallback bridgeCallback2 = this.setMax;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("success", Boolean.TRUE);
                    String str2 = Environment.DIRECTORY_DOWNLOADS;
                    Intrinsics.checkNotNullExpressionValue(str2, "Environment.DIRECTORY_DOWNLOADS");
                    StringBuilder sb = new StringBuilder("\"/");
                    sb.append(str2);
                    sb.append("\"");
                    String obj = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(obj, "StringBuilder()\n        … .append(\"\\\"\").toString()");
                    jSONObject2.put("filePath", obj);
                    Unit unit2 = Unit.INSTANCE;
                    bridgeCallback2.sendJSONResponse(jSONObject2);
                } catch (Exception unused) {
                    BridgeCallback bridgeCallback3 = this.setMax;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("success", Boolean.FALSE);
                    Unit unit3 = Unit.INSTANCE;
                    bridgeCallback3.sendJSONResponse(jSONObject3);
                }
            }
        };
        String str2 = this.fileFormat;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fileFormat");
        }
        String str3 = this.mimeType;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mimeType");
        }
        r2.setMin(filePath, str, str2, str3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "url", "", "fullFilePath", "<anonymous parameter 2>", "download"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements WindowBridgeExtension.AnonymousClass2 {
        final /* synthetic */ DownloadFileBridge getMax;

        setMax(DownloadFileBridge downloadFileBridge) {
            this.getMax = downloadFileBridge;
        }

        public final TitleBarRightButtonView.AnonymousClass1<File> download(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "url");
            Intrinsics.checkNotNullParameter(str2, "fullFilePath");
            Intrinsics.checkNotNullParameter(str3, "<anonymous parameter 2>");
            try {
                DownloadUtil downloadUtil = DownloadUtil.getMin;
                return DownloadUtil.getMax(str, str2, DownloadFileBridge.access$getFileFormat$p(this.getMax));
            } catch (MalformedURLException e) {
                return TitleBarRightButtonView.AnonymousClass1.error((Throwable) e);
            }
        }
    }

    private final void handleDownloadFile() {
        Activity activity2 = this.activity;
        if (activity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
        }
        if (getLeftSelectedOption.getMax(activity2, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            processDownload();
            return;
        }
        Activity activity3 = this.activity;
        if (activity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
        }
        FontRes.getMin(activity3, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 201);
    }

    private final void processDownload() {
        if (setLeftSelectedIndex.setMin() <= 100) {
            mapDownloadResult(new WindowBridgeExtension.AnonymousClass1.AnonymousClass1(DownloadResultType.STORAGE_LOW, 2));
            LocationBridgeExtension.length(TAG, "Insufficient memory, free up the space in your device");
            return;
        }
        handleFile();
    }

    @SuppressLint({"SimpleDateFormat"})
    private final String generateTimeFormat() {
        String format = new SimpleDateFormat("ddMMyy_HHmmss").format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"ddMMyy_HHmmss\").format(Date())");
        return format;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/downloadfile/DownloadFileBridge$Companion;", "", "()V", "MINIMUM_STORAGE_AVAILABLE", "", "PDF_FILE_FORMAT", "", "PDF_MIME_TYPE", "PNG_FILE_FORMAT", "PNG_MIME_TYPE", "REQUEST_CODE_PERMISSION", "TAG", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    static {
        String simpleName = DownloadFileBridge.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "DownloadFileBridge::class.java.simpleName");
        TAG = simpleName;
    }

    private final JSONObject createSuccessResult(String str) {
        JSONObject jSONObject = new JSONObject();
        Map map = jSONObject;
        map.put("success", Boolean.TRUE);
        map.put("filePath", str);
        return jSONObject;
    }

    private final JSONObject createErrorResult(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        Map map = jSONObject;
        map.put("success", Boolean.FALSE);
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 1252789005) {
                if (hashCode == 1628667728 && str.equals(DownloadResultType.STORAGE_LOW)) {
                    str2 = "002";
                    map.put("error", str2);
                    return jSONObject;
                }
            } else if (str.equals(DownloadResultType.NO_PERMISSION)) {
                str2 = "003";
                map.put("error", str2);
                return jSONObject;
            }
        }
        str2 = "001";
        map.put("error", str2);
        return jSONObject;
    }

    public final void onReceivePermissionResult(@NotNull BaseBridge.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "event");
        if (getmin.getMin != 201) {
            return;
        }
        if (getmin.length.get(0).setMax()) {
            processDownload();
            return;
        }
        mapDownloadResult(new WindowBridgeExtension.AnonymousClass1.AnonymousClass1(DownloadResultType.NO_PERMISSION, 2));
        LocationBridgeExtension.length(TAG, "onExternalStoragePermissionResult User not authorized");
    }

    private final void mapDownloadResult(WindowBridgeExtension.AnonymousClass1.AnonymousClass1 r3) {
        JSONObject jSONObject;
        if (Intrinsics.areEqual((Object) "SUCCESS", (Object) r3.setMin)) {
            String str = r3.setMax;
            if (str == null) {
                str = "";
            }
            jSONObject = createSuccessResult(str);
        } else {
            jSONObject = createErrorResult(r3.setMin);
        }
        BridgeCallback bridgeCallback2 = this.bridgeCallback;
        if (bridgeCallback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
        }
        bridgeCallback2.sendJSONResponse(jSONObject);
    }
}
