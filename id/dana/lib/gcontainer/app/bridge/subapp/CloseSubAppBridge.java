package id.dana.lib.gcontainer.app.bridge.subapp;

import android.app.Activity;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.WindowBridgeExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J&\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/subapp/CloseSubAppBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "closeSubApp", "", "activity", "Landroid/app/Activity;", "event", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class CloseSubAppBridge extends SimpleBridgeExtension {
    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void closeSubApp(@NotNull @BindingNode(Page.class) Page page, @NotNull @BindingParam(name = {"event"}) String str, @NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(str, "event");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        if (str.length() == 0) {
            JSONObject jSONObject = new JSONObject();
            Map map = jSONObject;
            map.put("success", Boolean.FALSE);
            map.put("error", "001");
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
            return;
        }
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Activity activity = pageContext != null ? pageContext.getActivity() : null;
        if (activity != null) {
            closeSubApp(activity, str);
        }
    }

    private final void closeSubApp(Activity activity, String str) {
        if (Intrinsics.areEqual((Object) str, (Object) CloseSubAppEvent.TOP)) {
            activity.finish();
        } else {
            WindowBridgeExtension.AnonymousClass1.length();
        }
    }
}
