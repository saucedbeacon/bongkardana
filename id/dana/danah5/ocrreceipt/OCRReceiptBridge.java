package id.dana.danah5.ocrreceipt;

import android.app.Activity;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J2\u0010\t\u001a\u00020\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0007J*\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0016"}, d2 = {"Lid/dana/danah5/ocrreceipt/OCRReceiptBridge;", "Lid/dana/danah5/ocrreceipt/BaseOCRBridge;", "()V", "getTag", "", "onReceiveActivityResult", "", "event", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$ActivityResultMessageEvent;", "recognizeTextMerchantReceipt", "info", "Lcom/alibaba/fastjson/JSONObject;", "isBackgroundProcess", "", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "page", "Lcom/alibaba/ariver/app/api/Page;", "tryUploadOCRReceipt", "activity", "Landroid/app/Activity;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OCRReceiptBridge extends BaseOCRBridge {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    private static final String TAG = OCRReceiptBridge.class.getSimpleName();

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void recognizeTextMerchantReceipt(@Nullable @BindingParam(name = {"info"}) JSONObject jSONObject, @BindingParam(name = {"doImageProcessOnBackground"}) boolean z, @NotNull @BindingCallback BridgeCallback bridgeCallback, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        handleOnMethodCalled(jSONObject, z, bridgeCallback, page);
    }

    public final void onReceiveActivityResult(@NotNull BaseBridge.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "event");
        getOcrReceiptManager().onGetResult(setmin.getMax, setmin.length);
    }

    @NotNull
    public final String getTag() {
        String str = TAG;
        Intrinsics.checkNotNullExpressionValue(str, "TAG");
        return str;
    }

    public final void tryUploadOCRReceipt(@Nullable Activity activity, boolean z, @NotNull JSONObject jSONObject, @NotNull BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        getOcrReceiptManager().setBridgeCallback(bridgeCallback);
        getOcrReceiptManager().execute(activity, createNewOCRRequestModel(jSONObject, z));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/danah5/ocrreceipt/OCRReceiptBridge$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
