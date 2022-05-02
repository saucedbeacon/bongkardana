package id.dana.danah5.akulaku;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.api.H5Event;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getShowListeners$core;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Lid/dana/danah5/akulaku/AkuDeviceInfoBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "getAkuDeviceInfo", "", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "page", "Lcom/alibaba/ariver/app/api/Page;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AkuDeviceInfoBridge extends SimpleBridgeExtension {
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
    @NotNull
    public static final String UNKNOWN_ERROR = "unknown error!";

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void getAkuDeviceInfo(@NotNull @BindingCallback BridgeCallback bridgeCallback, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        try {
            Intrinsics.checkNotNullParameter(page, "$this$activity");
            PageContext pageContext = page.getPageContext();
            Object json = JSON.toJSON(getShowListeners$core.assembleDeviceInfo(pageContext != null ? pageContext.getActivity() : null));
            if (json != null) {
                bridgeCallback.sendJSONResponse((JSONObject) json);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
        } catch (Exception unused) {
            JSONObject jSONObject = new JSONObject();
            Map map = jSONObject;
            map.put("success", Boolean.FALSE);
            map.put("message", UNKNOWN_ERROR);
            map.put("error", H5Event.Error.UNKNOWN_ERROR);
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/danah5/akulaku/AkuDeviceInfoBridge$Companion;", "", "()V", "UNKNOWN_ERROR", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
