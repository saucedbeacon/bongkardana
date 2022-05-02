package id.dana.lib.gcontainer.app.bridge.share;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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
import id.dana.danah5.share.file.businessaccount.ShareBusinessAccountFileEvent;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import id.dana.lib.gcontainer.app.bridge.downloadfile.DownloadFileEntity;
import id.dana.lib.gcontainer.app.bridge.downloadfile.DownloadUtil;
import id.dana.lib.gcontainer.app.bridge.downloadfile.businessaccount.DownloadResultType;
import id.dana.lib.gcontainer.app.bridge.share.text.ShareTextEntity;
import java.io.File;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import o.TitleBarRightButtonView;
import o.WindowBridgeExtension;
import o.datePicker;
import o.getUrlIndex;
import o.onTimeSet;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0003J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J0\u0010\u0017\u001a\u00020\u00112\b\b\u0001\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J0\u0010\u001b\u001a\u00020\u00112\b\b\u0001\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/share/ShareBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "activity", "Landroid/app/Activity;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "downloadFileEntity", "Lid/dana/lib/gcontainer/app/bridge/downloadfile/DownloadFileEntity;", "createErrorResult", "Lcom/alibaba/fastjson/JSONObject;", "errorType", "", "createSuccessResult", "filePath", "generateTimeFormat", "handleEventShareFile", "", "info", "handleEventShareText", "mapDownloadResult", "downloadResult", "Lid/dana/lib/gcontainer/app/bridge/downloadfile/businessaccount/model/DownloadResult;", "share", "page", "Lcom/alibaba/ariver/app/api/Page;", "event", "shareFile", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class ShareBridge extends BaseBridge {
    private Activity activity;
    private BridgeCallback bridgeCallback;
    private DownloadFileEntity downloadFileEntity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends TypeReference<DownloadFileEntity> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends TypeReference<DownloadFileEntity> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class length extends TypeReference<ShareTextEntity> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends TypeReference<DownloadFileEntity> {
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void share(@NotNull @BindingNode(Page.class) Page page, @NotNull @BindingParam(name = {"event"}) String str, @NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback2) {
        Object obj;
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(str, "event");
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Activity activity2 = null;
        Activity activity3 = pageContext != null ? pageContext.getActivity() : null;
        if (activity3 != null) {
            this.activity = activity3;
            this.bridgeCallback = bridgeCallback2;
            try {
                obj = JSONObject.parseObject(jSONObject.toJSONString(), new getMin(), new Feature[0]);
            } catch (JSONException | NullPointerException unused) {
                obj = null;
            }
            DownloadFileEntity downloadFileEntity2 = (DownloadFileEntity) obj;
            if (downloadFileEntity2 != null) {
                this.downloadFileEntity = downloadFileEntity2;
                Intrinsics.checkNotNullParameter(page, "$this$activity");
                PageContext pageContext2 = page.getPageContext();
                if (pageContext2 != null) {
                    activity2 = pageContext2.getActivity();
                }
                if (activity2 != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != 3143036) {
                        if (hashCode == 3556653 && str.equals("text")) {
                            handleEventShareText(activity2, jSONObject, bridgeCallback2);
                        }
                    } else if (str.equals("file")) {
                        handleEventShareFile(activity2, jSONObject, bridgeCallback2);
                    }
                }
            }
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void shareFile(@NotNull @BindingNode(Page.class) Page page, @NotNull @BindingParam(name = {"event"}) String str, @NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback2) {
        Object obj;
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(str, "event");
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Activity activity2 = null;
        Activity activity3 = pageContext != null ? pageContext.getActivity() : null;
        if (activity3 != null) {
            this.activity = activity3;
            this.bridgeCallback = bridgeCallback2;
            try {
                obj = JSONObject.parseObject(jSONObject.toJSONString(), new setMin(), new Feature[0]);
            } catch (JSONException | NullPointerException unused) {
                obj = null;
            }
            DownloadFileEntity downloadFileEntity2 = (DownloadFileEntity) obj;
            if (downloadFileEntity2 != null) {
                this.downloadFileEntity = downloadFileEntity2;
                Intrinsics.checkNotNullParameter(page, "$this$activity");
                PageContext pageContext2 = page.getPageContext();
                if (pageContext2 != null) {
                    activity2 = pageContext2.getActivity();
                }
                if (activity2 != null && Intrinsics.areEqual((Object) str, (Object) ShareBusinessAccountFileEvent.BUSINESS_ACCOUNT_QR)) {
                    handleEventShareFile(activity2, jSONObject, bridgeCallback2);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "url", "", "fullFilePath", "<anonymous parameter 2>", "download"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements WindowBridgeExtension.AnonymousClass2 {
        final /* synthetic */ DownloadFileEntity getMin;

        setMax(DownloadFileEntity downloadFileEntity) {
            this.getMin = downloadFileEntity;
        }

        public final TitleBarRightButtonView.AnonymousClass1<File> download(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "url");
            Intrinsics.checkNotNullParameter(str2, "fullFilePath");
            Intrinsics.checkNotNullParameter(str3, "<anonymous parameter 2>");
            try {
                DownloadUtil downloadUtil = DownloadUtil.getMin;
                DownloadFileEntity downloadFileEntity = this.getMin;
                String fileType = downloadFileEntity != null ? downloadFileEntity.getFileType() : null;
                if (fileType == null) {
                    fileType = "";
                }
                return DownloadUtil.getMax(str, str2, fileType);
            } catch (MalformedURLException e) {
                return TitleBarRightButtonView.AnonymousClass1.error((Throwable) e);
            }
        }
    }

    @SuppressLint({"SimpleDateFormat"})
    private final String generateTimeFormat() {
        String format = new SimpleDateFormat("ddMMyy_HHmmss").format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"ddMMyy_HHmmss\").format(Date())");
        return format;
    }

    private final void handleEventShareText(Activity activity2, JSONObject jSONObject, BridgeCallback bridgeCallback2) {
        String str;
        Object obj = null;
        boolean z = false;
        try {
            obj = JSONObject.parseObject(jSONObject.toJSONString(), new length(), new Feature[0]);
        } catch (JSONException | NullPointerException unused) {
        }
        onTimeSet ontimeset = new onTimeSet(activity2, (ShareTextEntity) obj, bridgeCallback2);
        if (ontimeset.getMin != null) {
            ShareTextEntity shareTextEntity = ontimeset.getMin;
            CharSequence message = shareTextEntity.getMessage();
            if (message == null || message.length() == 0) {
                ontimeset.setMax.sendJSONResponse(onTimeSet.getMin("NO_MESSAGE"));
                return;
            }
            CharSequence title = shareTextEntity.getTitle();
            if (title == null || title.length() == 0) {
                z = true;
            }
            if (z) {
                str = ontimeset.getMax.getString(getUrlIndex.setMax.share_via);
            } else {
                str = shareTextEntity.getTitle();
            }
            Intent addFlags = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", shareTextEntity.getMessage()).addFlags(268435456);
            Intrinsics.checkNotNullExpressionValue(addFlags, "Intent(Intent.ACTION_SEN…t.FLAG_ACTIVITY_NEW_TASK)");
            if (DatePickerBridgeExtension.AnonymousClass8.length(addFlags, ontimeset.getMax)) {
                ontimeset.getMax.startActivity(Intent.createChooser(addFlags, str));
                ontimeset.setMax.sendJSONResponse(onTimeSet.getMin("SUCCESS"));
                return;
            }
            ontimeset.setMax.sendJSONResponse(onTimeSet.getMin("UNKNOWN_ERROR"));
            return;
        }
        ontimeset.setMax.sendJSONResponse(onTimeSet.getMin("NO_CONTENT_INFO"));
    }

    private final void handleEventShareFile(Activity activity2, JSONObject jSONObject, BridgeCallback bridgeCallback2) {
        Object obj;
        String str;
        String str2;
        boolean z = false;
        String str3 = null;
        try {
            obj = JSONObject.parseObject(jSONObject.toJSONString(), new getMax(), new Feature[0]);
        } catch (JSONException | NullPointerException unused) {
            obj = null;
        }
        DownloadFileEntity downloadFileEntity2 = (DownloadFileEntity) obj;
        if (downloadFileEntity2 == null || (str = downloadFileEntity2.getFilePath()) == null) {
            str = downloadFileEntity2 != null ? downloadFileEntity2.getSource() : null;
        }
        if (str == null) {
            str = downloadFileEntity2 != null ? downloadFileEntity2.getUrl() : null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            mapDownloadResult(new WindowBridgeExtension.AnonymousClass1.AnonymousClass1("GENERAL_ERROR", 2));
            return;
        }
        String businessName = downloadFileEntity2 != null ? downloadFileEntity2.getBusinessName() : null;
        if (businessName == null) {
            businessName = "";
        }
        if (businessName.length() > 0) {
            z = true;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            if (downloadFileEntity2 != null) {
                str3 = downloadFileEntity2.getBusinessName();
            }
            sb.append(str3);
            sb.append("_");
            sb.append(generateTimeFormat());
            str2 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("DANA_");
            sb2.append(System.currentTimeMillis());
            str2 = sb2.toString();
        }
        new datePicker(activity2, bridgeCallback2, new setMax(downloadFileEntity2)) {
            private final Activity getMin;
            @NotNull
            private final BridgeCallback setMin;

            {
                Intrinsics.checkNotNullParameter(r2, AkuEventParamsKey.KEY_ACTIVITY);
                Intrinsics.checkNotNullParameter(r3, "bridgeCallback");
                Intrinsics.checkNotNullParameter(r4, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                this.getMin = r2;
                this.setMin = r3;
            }

            public final void setMin(@NotNull File file, @NotNull String str) {
                Intrinsics.checkNotNullParameter(file, "imageFile");
                Intrinsics.checkNotNullParameter(str, "mimeType");
                Uri max = setLeftSelectedIndex.getMax(this.getMin, file);
                Intrinsics.checkNotNullExpressionValue(max, "FileUtil.getFileProvider(activity, imageFile)");
                Intent addFlags = new Intent("android.intent.action.SEND").setType("image/jpeg").putExtra("android.intent.extra.STREAM", max).addFlags(268435456).addFlags(1);
                Intrinsics.checkNotNullExpressionValue(addFlags, "Intent(Intent.ACTION_SEN…RANT_READ_URI_PERMISSION)");
                if (AnonymousClass8.length(addFlags, this.getMin)) {
                    Activity activity = this.getMin;
                    activity.startActivity(Intent.createChooser(addFlags, activity.getString(getUrlIndex.setMax.share_via)));
                    this.setMin.sendJSONResponse(length("SUCCESS"));
                    return;
                }
                this.setMin.sendJSONResponse(length("NO_APP_SUPPORTED_ERROR"));
            }

            private static JSONObject length(String str) {
                if (Intrinsics.areEqual((Object) str, (Object) "SUCCESS")) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("success", Boolean.TRUE);
                    return jSONObject;
                }
                JSONObject jSONObject2 = new JSONObject();
                Map map = jSONObject2;
                map.put("success", Boolean.FALSE);
                map.put("error", (str.hashCode() == 29646139 && str.equals("NO_APP_SUPPORTED_ERROR")) ? "002" : "001");
                return jSONObject2;
            }
        }.setMin(str, str2, ".jpg", "image/jpeg");
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
