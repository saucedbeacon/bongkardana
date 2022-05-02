package id.dana.danah5.deeplink.scanQr;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.di.modules.GContainerModule;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import id.dana.scanner.handler.nativepages.ScannerSceneType;
import id.dana.tracker.TrackerKey;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.isTransitionRequired;
import o.saveSnapshot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J(\u0010\u0010\u001a\u00020\f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u0007J\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lid/dana/danah5/deeplink/scanQr/OpenScanQrBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "featureScanQR", "Lid/dana/contract/deeplink/path/FeatureScanQR;", "getFeatureScanQR", "()Lid/dana/contract/deeplink/path/FeatureScanQR;", "setFeatureScanQR", "(Lid/dana/contract/deeplink/path/FeatureScanQR;)V", "onInitialized", "", "onReceiveActivityResult", "event", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$ActivityResultMessageEvent;", "openQRScanner", "info", "Lcom/alibaba/fastjson/JSONObject;", "page", "Lcom/alibaba/ariver/app/api/Page;", "getSourceInfo", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class OpenScanQrBridge extends BaseBridge {
    @NotNull
    public static final String CLOSE_AFTER_SCAN = "closeAfterScan";
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String QRIS_TOP_UP_KYB = "qris_topup_kyb";
    @NotNull
    public static final String SOURCE = "source";
    private BridgeCallback bridgeCallback;
    @Inject
    public isTransitionRequired featureScanQR;

    @NotNull
    public final isTransitionRequired getFeatureScanQR() {
        isTransitionRequired istransitionrequired = this.featureScanQR;
        if (istransitionrequired == null) {
            Intrinsics.throwUninitializedPropertyAccessException("featureScanQR");
        }
        return istransitionrequired;
    }

    public final void setFeatureScanQR(@NotNull isTransitionRequired istransitionrequired) {
        Intrinsics.checkNotNullParameter(istransitionrequired, "<set-?>");
        this.featureScanQR = istransitionrequired;
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
                getmax.getMin().getMax(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void openQRScanner(@Nullable @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback2, @NotNull @BindingNode(Page.class) Page page) {
        String str;
        Boolean bool;
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        this.bridgeCallback = bridgeCallback2;
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        String str2 = null;
        Activity activity = pageContext != null ? pageContext.getActivity() : null;
        if (activity != null) {
            if (this.featureScanQR == null) {
                Intrinsics.throwUninitializedPropertyAccessException("featureScanQR");
            }
            if (jSONObject == null || (str = jSONObject.getString("Source")) == null) {
                str = TrackerKey.SourceType.JS_API;
            }
            boolean booleanValue = (jSONObject == null || (bool = jSONObject.getBoolean(CLOSE_AFTER_SCAN)) == null) ? false : bool.booleanValue();
            if (jSONObject != null) {
                str2 = getSourceInfo(jSONObject);
            }
            isTransitionRequired.length(activity, str, booleanValue, str2);
            if (activity != null) {
                return;
            }
        }
        bridgeCallback2.sendBridgeResponse(BridgeResponse.NATIVE_NODE_NULL);
        Unit unit = Unit.INSTANCE;
    }

    private final String getSourceInfo(JSONObject jSONObject) {
        if (Intrinsics.areEqual((Object) QRIS_TOP_UP_KYB, (Object) jSONObject.getString("source"))) {
            return ScannerSceneType.SCENE_QRIS_TOP_UP_KYB;
        }
        return jSONObject.getString("source");
    }

    public final void onReceiveActivityResult(@NotNull BaseBridge.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "event");
        super.onReceiveActivityResult(setmin);
        BridgeCallback bridgeCallback2 = this.bridgeCallback;
        if (bridgeCallback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
        }
        bridgeCallback2.sendBridgeResponse(BridgeResponse.SUCCESS);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/danah5/deeplink/scanQr/OpenScanQrBridge$Companion;", "", "()V", "CLOSE_AFTER_SCAN", "", "QRIS_TOP_UP_KYB", "SOURCE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
