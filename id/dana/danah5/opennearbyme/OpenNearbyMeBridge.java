package id.dana.danah5.opennearbyme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import id.dana.nearbyme.NearbyMeActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001e\u0010\u0010\u001a\u00020\u0004*\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001e\u0010\u0012\u001a\u00020\u0004*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¨\u0006\u0016"}, d2 = {"Lid/dana/danah5/opennearbyme/OpenNearbyMeBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "openNearbyMe", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "page", "Lcom/alibaba/ariver/app/api/Page;", "startNearbyActivity", "context", "Landroid/content/Context;", "source", "", "composeExtras", "Landroid/content/Intent;", "putNonNullNonEmptyDataToIntent", "data", "key", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OpenNearbyMeBridge extends SimpleBridgeExtension {
    private static final String CATEGORY_KEY = "category";
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    private static final String KEYWORD_KEY = "keyword";
    private static final String LAT_KEY = "lat";
    private static final String LONG_KEY = "long";
    private static final String MERCHANT_ID_KEY = "merchantid";
    private static final String SHOP_ID_KEY = "shopid";
    private static final String SOURCE_KEY = "source";
    private static final String SOURCE_PARAM_NOT_FOUND = "source param must not be null or empty";

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void openNearbyMe(@Nullable @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        Activity activity = null;
        String string = jSONObject != null ? jSONObject.getString("source") : null;
        CharSequence charSequence = string;
        if (charSequence == null || charSequence.length() == 0) {
            JSONObject jSONObject2 = new JSONObject();
            Map map = jSONObject2;
            map.put("success", Boolean.FALSE);
            map.put("message", SOURCE_PARAM_NOT_FOUND);
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject2);
            return;
        }
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        if (pageContext != null) {
            activity = pageContext.getActivity();
        }
        if (activity != null) {
            startNearbyActivity(activity, string, jSONObject);
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            return;
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.NATIVE_NODE_NULL);
    }

    private final void startNearbyActivity(Context context, String str, JSONObject jSONObject) {
        Intent intent = new Intent(context, NearbyMeActivity.class);
        composeExtras(intent, str, jSONObject);
        context.startActivity(intent);
    }

    private final void composeExtras(Intent intent, String str, JSONObject jSONObject) {
        intent.putExtra("EXTRA_SOURCE", str);
        putNonNullNonEmptyDataToIntent(intent, jSONObject.getString("keyword"), NearbyMeActivity.EXTRA_SEARCH_KEYWORD);
        putNonNullNonEmptyDataToIntent(intent, jSONObject.getString("shopid"), "EXTRA_SHOP_ID");
        putNonNullNonEmptyDataToIntent(intent, jSONObject.getString(MERCHANT_ID_KEY), "EXTRA_MERCHANT_ID");
        putNonNullNonEmptyDataToIntent(intent, jSONObject.getString("category"), NearbyMeActivity.EXTRA_CATEGORY);
        putNonNullNonEmptyDataToIntent(intent, jSONObject.getString("category"), NearbyMeActivity.EXTRA_CATEGORY);
        Double d = jSONObject.getDouble("lat");
        if (d != null) {
            intent.putExtra(NearbyMeActivity.EXTRA_LOCATION_LAT, d.doubleValue());
        }
        Double d2 = jSONObject.getDouble("long");
        if (d2 != null) {
            intent.putExtra(NearbyMeActivity.EXTRA_LOCATION_LON, d2.doubleValue());
        }
    }

    private final void putNonNullNonEmptyDataToIntent(Intent intent, String str, String str2) {
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0)) {
            intent.putExtra(str2, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/danah5/opennearbyme/OpenNearbyMeBridge$Companion;", "", "()V", "CATEGORY_KEY", "", "KEYWORD_KEY", "LAT_KEY", "LONG_KEY", "MERCHANT_ID_KEY", "SHOP_ID_KEY", "SOURCE_KEY", "SOURCE_PARAM_NOT_FOUND", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
