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
import id.dana.ocr.model.ReuploadReceiptTaskModel;
import id.dana.ocr.views.SnapReceiptService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J*\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J2\u0010\u000f\u001a\u00020\u00062\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/danah5/ocrreceipt/UploadLocalImageBridge;", "Lid/dana/danah5/ocrreceipt/BaseOCRBridge;", "()V", "getTag", "", "tryUploadOCRReceipt", "", "activity", "Landroid/app/Activity;", "isBackgroundProcess", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "uploadLocalImage", "page", "Lcom/alibaba/ariver/app/api/Page;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class UploadLocalImageBridge extends BaseOCRBridge {
    private static final String ACVITITY_NULL = "Activity is Null";
    @NotNull
    public static final setMin Companion;
    private static final String TAG;

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void uploadLocalImage(@Nullable @BindingParam(name = {"info"}) JSONObject jSONObject, @BindingParam(name = {"doImageProcessOnBackground"}) boolean z, @NotNull @BindingCallback BridgeCallback bridgeCallback, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        handleOnMethodCalled(jSONObject, z, bridgeCallback, page);
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
        String obj = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "UUID.randomUUID().toString()");
        ReuploadReceiptTaskModel reuploadReceiptTaskModel = new ReuploadReceiptTaskModel(obj, createNewOCRRequestModel(jSONObject, z));
        getOcrReceiptManager().setBridgeCallback(bridgeCallback);
        if (activity != null) {
            SnapReceiptService.Companion companion = SnapReceiptService.Companion;
            SnapReceiptService.Companion.getMax(activity, reuploadReceiptTaskModel);
            return;
        }
        throw new OCRReceiptException(ACVITITY_NULL, "001");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/danah5/ocrreceipt/UploadLocalImageBridge$Companion;", "", "()V", "ACVITITY_NULL", "", "TAG", "kotlin.jvm.PlatformType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        setMin setmin = new setMin((DefaultConstructorMarker) null);
        Companion = setmin;
        TAG = setmin.getClass().getSimpleName();
    }
}
