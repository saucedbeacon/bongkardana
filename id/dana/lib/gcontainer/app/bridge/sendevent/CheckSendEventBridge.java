package id.dana.lib.gcontainer.app.bridge.sendevent;

import android.content.Context;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.WindowBridgeExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0017J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH$¨\u0006\f"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/sendevent/CheckSendEventBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "checkSendEvent", "", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "isEventValid", "", "context", "Landroid/content/Context;", "Companion", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public abstract class CheckSendEventBridge extends SimpleBridgeExtension {
    private static final String AVAILABLE = "available";
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    private static final String TAG = "CheckSendEventBridge";

    /* access modifiers changed from: protected */
    public abstract boolean isEventValid(@NotNull Context context);

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = true)
    public void checkSendEvent(@NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AVAILABLE, Boolean.valueOf(isEventValid(WindowBridgeExtension.AnonymousClass1.getMax())));
        Unit unit = Unit.INSTANCE;
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/sendevent/CheckSendEventBridge$Companion;", "", "()V", "AVAILABLE", "", "TAG", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
