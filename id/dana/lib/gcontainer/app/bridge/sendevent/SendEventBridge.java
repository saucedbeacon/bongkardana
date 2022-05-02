package id.dana.lib.gcontainer.app.bridge.sendevent;

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
import id.dana.lib.gcontainer.app.bridge.sendevent.sendmoney.CheckoutFinishEntity;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import o.LocationBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017¨\u0006\u000e"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/sendevent/SendEventBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "sendEvent", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "event", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "Companion", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class SendEventBridge extends BaseBridge {
    private static final String CHECKOUT_FINISH_EVENT = "checkoutFinished";
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    private static final String TAG = "SendEventBridge";

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = true)
    public final void sendEvent(@NotNull @BindingNode(Page.class) Page page, @Nullable @BindingParam(name = {"event"}) String str, @NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        if (Intrinsics.areEqual((Object) str, (Object) CHECKOUT_FINISH_EVENT)) {
            DatePickerBridgeExtension.AnonymousClass4 r3 = DatePickerBridgeExtension.AnonymousClass4.setMax;
            Intrinsics.checkNotNullParameter(jSONObject, "info");
            CheckoutFinishEntity min = DatePickerBridgeExtension.AnonymousClass4.getMin(jSONObject);
            String str2 = DatePickerBridgeExtension.AnonymousClass4.setMin;
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(min != null);
            String format = String.format("Checkout finish entity exists: %s", Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
            LocationBridgeExtension.setMin(str2, format);
            DatePickerBridgeExtension.AnonymousClass4.getMax = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/sendevent/SendEventBridge$Companion;", "", "()V", "CHECKOUT_FINISH_EVENT", "", "TAG", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
