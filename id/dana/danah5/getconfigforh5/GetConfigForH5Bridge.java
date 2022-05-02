package id.dana.danah5.getconfigforh5;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.getPrepareData;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lid/dana/danah5/getconfigforh5/GetConfigForH5Bridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "assembleConfig", "Lcom/alibaba/fastjson/JSONObject;", "getConfigForH5", "", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GetConfigForH5Bridge extends SimpleBridgeExtension {
    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void getConfigForH5(@NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        try {
            bridgeCallback.sendJSONResponse(assembleConfig());
        } catch (Exception unused) {
            JSONObject jSONObject = new JSONObject();
            Map map = jSONObject;
            map.put("success", Boolean.FALSE);
            map.put("error", "001");
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    private final JSONObject assembleConfig() {
        JSONObject featureSwitchJSONObject = getPrepareData.getFeatureSwitchJSONObject("feature_h5_config");
        Intrinsics.checkNotNullExpressionValue(featureSwitchJSONObject, "FeatureSwitch.getFeature…igData.FEATURE_H5_CONFIG)");
        return featureSwitchJSONObject;
    }
}
