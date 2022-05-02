package id.dana.danah5.openallshop;

import android.app.Activity;
import android.content.Context;
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
import id.dana.nearbyme.OtherStoreListActivity;
import id.dana.nearbyme.enums.SearchType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0011"}, d2 = {"Lid/dana/danah5/openallshop/OpenAllShopBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "openAllShop", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "page", "Lcom/alibaba/ariver/app/api/Page;", "paramNotNullCheck", "", "data", "", "errorMessage", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OpenAllShopBridge extends SimpleBridgeExtension {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    private static final String MERCHANT_ID_KEY = "merchantid";
    private static final String MERCHANT_ID_PARAM_NOT_FOUND = "merchantid param must not be null or empty";
    private static final String MERCHANT_NAME_KEY = "merchantname";
    private static final String MERCHANT_NAME_PARAM_NOT_FOUND = "merchantname param must not be null or empty";
    private static final String SEARCH_KEYWORD_KEY = "searchkeyword";
    private static final String SEARCH_TYPE_KEY = "searchtype";
    private static final String SOURCE_KEY = "source";

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void openAllShop(@Nullable @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        Activity activity = null;
        if (!paramNotNullCheck(jSONObject != null ? jSONObject.getString(MERCHANT_ID_KEY) : null, MERCHANT_ID_PARAM_NOT_FOUND, bridgeCallback)) {
            if (!paramNotNullCheck(jSONObject != null ? jSONObject.getString(MERCHANT_NAME_KEY) : null, MERCHANT_NAME_PARAM_NOT_FOUND, bridgeCallback)) {
                Intrinsics.checkNotNullParameter(page, "$this$activity");
                PageContext pageContext = page.getPageContext();
                if (pageContext != null) {
                    activity = pageContext.getActivity();
                }
                if (activity != null) {
                    if (jSONObject != null) {
                        OtherStoreListActivity.length length = OtherStoreListActivity.Companion;
                        Context context = activity;
                        String string = jSONObject.getString(MERCHANT_ID_KEY);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(MERCHANT_ID_KEY)");
                        String string2 = jSONObject.getString(MERCHANT_NAME_KEY);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(MERCHANT_NAME_KEY)");
                        String string3 = jSONObject.getString(SEARCH_TYPE_KEY);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(SEARCH_TYPE_KEY)");
                        SearchType valueOf = SearchType.valueOf(string3);
                        String string4 = jSONObject.getString(SEARCH_KEYWORD_KEY);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(SEARCH_KEYWORD_KEY)");
                        String string5 = jSONObject.getString("source");
                        if (string5 == null) {
                            string5 = "";
                        }
                        OtherStoreListActivity.length.getMin(context, string, string2, valueOf, string4, string5);
                    }
                    bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                    return;
                }
                bridgeCallback.sendBridgeResponse(BridgeResponse.NATIVE_NODE_NULL);
            }
        }
    }

    private final boolean paramNotNullCheck(String str, String str2, BridgeCallback bridgeCallback) {
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0)) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        Map map = jSONObject;
        map.put("success", Boolean.FALSE);
        map.put("message", str2);
        Unit unit = Unit.INSTANCE;
        bridgeCallback.sendJSONResponse(jSONObject);
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/danah5/openallshop/OpenAllShopBridge$Companion;", "", "()V", "MERCHANT_ID_KEY", "", "MERCHANT_ID_PARAM_NOT_FOUND", "MERCHANT_NAME_KEY", "MERCHANT_NAME_PARAM_NOT_FOUND", "SEARCH_KEYWORD_KEY", "SEARCH_TYPE_KEY", "SOURCE_KEY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
