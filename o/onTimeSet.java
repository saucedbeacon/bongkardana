package o;

import android.app.Activity;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.lib.gcontainer.app.bridge.share.text.ShareTextEntity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0002J\u0006\u0010\u0011\u001a\u00020\u000eJ\b\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/share/text/ShareTextManager;", "", "activity", "Landroid/app/Activity;", "shareTextEntity", "Lid/dana/lib/gcontainer/app/bridge/share/text/ShareTextEntity;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "(Landroid/app/Activity;Lid/dana/lib/gcontainer/app/bridge/share/text/ShareTextEntity;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "getResult", "Lcom/alibaba/fastjson/JSONObject;", "resultType", "", "openChooseDialog", "", "extraMessage", "title", "processEvent", "sendUnknownError", "shareText", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class onTimeSet {
    public final Activity getMax;
    public final ShareTextEntity getMin;
    public final BridgeCallback setMax;

    public onTimeSet(@NotNull Activity activity, @Nullable ShareTextEntity shareTextEntity, @NotNull BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        this.getMax = activity;
        this.getMin = shareTextEntity;
        this.setMax = bridgeCallback;
    }

    public static JSONObject getMin(String str) {
        String str2;
        if (Intrinsics.areEqual((Object) str, (Object) "SUCCESS")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", Boolean.TRUE);
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        Map map = jSONObject2;
        map.put("success", Boolean.FALSE);
        int hashCode = str.hashCode();
        if (hashCode != 532999017) {
            if (hashCode == 1415358098 && str.equals("NO_CONTENT_INFO")) {
                str2 = "002";
                map.put("error", str2);
                return jSONObject2;
            }
        } else if (str.equals("NO_MESSAGE")) {
            str2 = "003";
            map.put("error", str2);
            return jSONObject2;
        }
        str2 = "001";
        map.put("error", str2);
        return jSONObject2;
    }
}
