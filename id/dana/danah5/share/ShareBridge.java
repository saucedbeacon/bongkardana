package id.dana.danah5.share;

import android.app.Activity;
import android.app.Application;
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
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.danah5.share.directtext.ShareDirectTextEntity;
import id.dana.danah5.share.file.businessaccount.ShareBusinessAccountFileEvent;
import id.dana.data.risk.riskevent.sharetextbroadcast.ShareTextBroadcastReceiver;
import id.dana.data.util.download.DownloadUtil;
import id.dana.di.modules.GContainerModule;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import id.dana.lib.gcontainer.app.bridge.share.constant.ShareEvent;
import id.dana.lib.gcontainer.app.bridge.share.text.ShareTextEntity;
import java.io.File;
import java.net.MalformedURLException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DialogActionButtonLayout;
import o.PrepareException;
import o.TitleBarRightButtonView;
import o.WindowBridgeExtension;
import o.customView;
import o.isCheckPromptChecked;
import o.onShow;
import o.saveSnapshot;
import o.updateTextColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\nH\u0016J2\u0010\u0015\u001a\u00020\n2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0007J2\u0010\u001a\u001a\u00020\n2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001b"}, d2 = {"Lid/dana/danah5/share/ShareBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "shareTextBroadcastReceiver", "Lid/dana/data/risk/riskevent/sharetextbroadcast/ShareTextBroadcastReceiver;", "getShareTextBroadcastReceiver", "()Lid/dana/data/risk/riskevent/sharetextbroadcast/ShareTextBroadcastReceiver;", "setShareTextBroadcastReceiver", "(Lid/dana/data/risk/riskevent/sharetextbroadcast/ShareTextBroadcastReceiver;)V", "handleEventShareDirectText", "", "activity", "Landroid/app/Activity;", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "handleEventShareText", "handleShareFile", "handleShareQrEvent", "onInitialized", "share", "eventName", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "shareFile", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ShareBridge extends BaseBridge {
    @Inject
    public ShareTextBroadcastReceiver shareTextBroadcastReceiver;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends TypeReference<ShareDirectTextEntity> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends TypeReference<ShareTextEntity> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class length extends TypeReference<isCheckPromptChecked> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends TypeReference<customView.Cdefault> {
    }

    @NotNull
    public final ShareTextBroadcastReceiver getShareTextBroadcastReceiver() {
        ShareTextBroadcastReceiver shareTextBroadcastReceiver2 = this.shareTextBroadcastReceiver;
        if (shareTextBroadcastReceiver2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareTextBroadcastReceiver");
        }
        return shareTextBroadcastReceiver2;
    }

    public final void setShareTextBroadcastReceiver(@NotNull ShareTextBroadcastReceiver shareTextBroadcastReceiver2) {
        Intrinsics.checkNotNullParameter(shareTextBroadcastReceiver2, "<set-?>");
        this.shareTextBroadcastReceiver = shareTextBroadcastReceiver2;
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void share(@Nullable @BindingParam(name = {"event"}) String str, @NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Activity activity = pageContext != null ? pageContext.getActivity() : null;
        if (activity != null && str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3143036) {
                if (hashCode != 3556653) {
                    if (hashCode == 223819958 && str.equals(ShareEvent.SHARE_DIRECT_TEXT)) {
                        handleEventShareDirectText(activity, jSONObject, bridgeCallback);
                    }
                } else if (str.equals("text")) {
                    handleEventShareText(activity, jSONObject, bridgeCallback);
                }
            } else if (str.equals("file")) {
                handleShareFile(activity, jSONObject, bridgeCallback);
            }
        }
    }

    public final void onInitialized() {
        super.onInitialized();
        saveSnapshot.getMax getmax = new saveSnapshot.getMax((byte) 0);
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            if (applicationComponent != null) {
                getmax.setMin = applicationComponent;
                getmax.getMin = new GContainerModule();
                getmax.getMin().getMin(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void shareFile(@Nullable @BindingParam(name = {"event"}) String str, @NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        if (Intrinsics.areEqual((Object) ShareBusinessAccountFileEvent.BUSINESS_ACCOUNT_QR, (Object) str)) {
            Intrinsics.checkNotNullParameter(page, "$this$activity");
            PageContext pageContext = page.getPageContext();
            Activity activity = pageContext != null ? pageContext.getActivity() : null;
            if (activity != null) {
                handleShareQrEvent(activity, jSONObject, bridgeCallback);
            }
        }
    }

    private final void handleEventShareDirectText(Activity activity, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        ShareTextBroadcastReceiver shareTextBroadcastReceiver2 = this.shareTextBroadcastReceiver;
        if (shareTextBroadcastReceiver2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareTextBroadcastReceiver");
        }
        updateTextColor updatetextcolor = new updateTextColor(activity, bridgeCallback, shareTextBroadcastReceiver2);
        Object obj = null;
        try {
            obj = JSONObject.parseObject(jSONObject.toJSONString(), new getMax(), new Feature[0]);
        } catch (JSONException | NullPointerException unused) {
        }
        updatetextcolor.processEvent((ShareDirectTextEntity) obj);
    }

    private final void handleEventShareText(Activity activity, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        ShareTextBroadcastReceiver shareTextBroadcastReceiver2 = this.shareTextBroadcastReceiver;
        if (shareTextBroadcastReceiver2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareTextBroadcastReceiver");
        }
        updateTextColor updatetextcolor = new updateTextColor(activity, bridgeCallback, shareTextBroadcastReceiver2);
        Object obj = null;
        try {
            obj = JSONObject.parseObject(jSONObject.toJSONString(), new getMin(), new Feature[0]);
        } catch (JSONException | NullPointerException unused) {
        }
        updatetextcolor.processEvent((ShareTextEntity) obj);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "url", "", "fullFilePath", "<anonymous parameter 2>", "download"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements WindowBridgeExtension.AnonymousClass2 {
        final /* synthetic */ customView.Cdefault $shareFileEntity;

        setMin(customView.Cdefault defaultR) {
            this.$shareFileEntity = defaultR;
        }

        public final TitleBarRightButtonView.AnonymousClass1<File> download(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "url");
            Intrinsics.checkNotNullParameter(str2, "fullFilePath");
            Intrinsics.checkNotNullParameter(str3, "<anonymous parameter 2>");
            try {
                customView.Cdefault defaultR = this.$shareFileEntity;
                String fileType = defaultR != null ? defaultR.getFileType() : null;
                if (fileType == null) {
                    fileType = "";
                }
                return DownloadUtil.downloadFile(str, str2, fileType);
            } catch (MalformedURLException e) {
                return TitleBarRightButtonView.AnonymousClass1.error((Throwable) e);
            }
        }
    }

    private final void handleShareQrEvent(Activity activity, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        Object obj = null;
        try {
            obj = JSONObject.parseObject(jSONObject.toJSONString(), new length(), new Feature[0]);
        } catch (JSONException | NullPointerException unused) {
        }
        new onShow(activity, (isCheckPromptChecked) obj, bridgeCallback).processEvent();
    }

    private final void handleShareFile(Activity activity, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        Object obj = null;
        try {
            obj = JSONObject.parseObject(jSONObject.toJSONString(), new setMax(), new Feature[0]);
        } catch (JSONException | NullPointerException unused) {
        }
        customView.Cdefault defaultR = (customView.Cdefault) obj;
        DialogActionButtonLayout dialogActionButtonLayout = new DialogActionButtonLayout(bridgeCallback, activity, new setMin(defaultR));
        dialogActionButtonLayout.setInfo(defaultR);
        dialogActionButtonLayout.processEvent();
    }
}
