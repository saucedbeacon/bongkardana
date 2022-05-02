package id.dana.danah5.tooltip;

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
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.getActionButtons;
import o.getVisibleButtons;
import o.setCheckBoxPrompt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J0\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014"}, d2 = {"Lid/dana/danah5/tooltip/TooltipBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "createTooltipPluginManager", "Lid/dana/danah5/tooltip/manager/TooltipPluginManager;", "activity", "Landroid/app/Activity;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "handleBottomSheet", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "handleShowcase", "", "tooltip", "eventName", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TooltipBridge extends SimpleBridgeExtension {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends TypeReference<getVisibleButtons> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends TypeReference<setCheckBoxPrompt> {
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void tooltip(@NotNull @BindingParam(name = {"event"}) String str, @NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(str, IpcMessageConstants.EXTRA_EVENT);
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Activity activity = pageContext != null ? pageContext.getActivity() : null;
        if (activity != null) {
            int hashCode = str.hashCode();
            if (hashCode != -620399116) {
                if (hashCode == -338391123 && str.equals(TooltipEvent.SHOW_CASE)) {
                    handleShowcase(activity, bridgeCallback, jSONObject);
                }
            } else if (str.equals("bottomSheet")) {
                handleBottomSheet(activity, bridgeCallback, jSONObject);
            }
        }
    }

    private final void handleShowcase(Activity activity, BridgeCallback bridgeCallback, JSONObject jSONObject) {
        getActionButtons createTooltipPluginManager = createTooltipPluginManager(activity, bridgeCallback);
        Object obj = null;
        try {
            obj = JSONObject.parseObject(jSONObject.toJSONString(), new getMax(), new Feature[0]);
        } catch (JSONException | NullPointerException unused) {
        }
        createTooltipPluginManager.openShowCase((getVisibleButtons) obj);
    }

    private final boolean handleBottomSheet(Activity activity, BridgeCallback bridgeCallback, JSONObject jSONObject) {
        getActionButtons createTooltipPluginManager = createTooltipPluginManager(activity, bridgeCallback);
        Object obj = null;
        try {
            obj = JSONObject.parseObject(jSONObject.toJSONString(), new getMin(), new Feature[0]);
        } catch (JSONException | NullPointerException unused) {
        }
        return createTooltipPluginManager.openBottomSheet((setCheckBoxPrompt) obj);
    }

    private final getActionButtons createTooltipPluginManager(Activity activity, BridgeCallback bridgeCallback) {
        return new getActionButtons(activity, bridgeCallback);
    }
}
