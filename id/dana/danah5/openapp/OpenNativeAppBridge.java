package id.dana.danah5.openapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import o.dispatchOnCancelled;
import o.message;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¨\u0006\u0015"}, d2 = {"Lid/dana/danah5/openapp/OpenNativeAppBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "openNativeApp", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "page", "Lcom/alibaba/ariver/app/api/Page;", "openPlayStore", "", "packageName", "", "context", "Landroid/content/Context;", "resolveLink", "urischeme", "packagename", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OpenNativeAppBridge extends SimpleBridgeExtension {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    private static final String MARKET_DETAILS_URL_SCHEME = "market://details";
    private static final String PACKAGE_NAME_KEY = "packagename";
    private static final String URI_HANDLER_NOT_FOUND = "Uri handler not found";
    private static final String URI_SCHEME_KEY = "urischeme";

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void openNativeApp(@Nullable @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback, @NotNull @BindingNode(Page.class) Page page) {
        Context applicationContext;
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        Activity activity = null;
        String string = jSONObject != null ? jSONObject.getString(URI_SCHEME_KEY) : null;
        String str = "";
        if (string == null) {
            string = str;
        }
        boolean z = true;
        if (string.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        String string2 = jSONObject != null ? jSONObject.getString(PACKAGE_NAME_KEY) : null;
        if (string2 != null) {
            str = string2;
        }
        if (str.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        if (pageContext != null) {
            activity = pageContext.getActivity();
        }
        if (activity == null || (applicationContext = activity.getApplicationContext()) == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.NATIVE_NODE_NULL);
        } else if (resolveLink(applicationContext, string, str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        } else {
            JSONObject jSONObject2 = new JSONObject();
            Map map = jSONObject2;
            map.put("success", Boolean.FALSE);
            map.put("message", URI_HANDLER_NOT_FOUND);
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject2);
        }
    }

    private final boolean resolveLink(Context context, String str, String str2) {
        return message.Cdefault.resolveUrl(context, str) || openPlayStore(str2, context);
    }

    private final boolean openPlayStore(String str, Context context) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-1797465937, oncanceled);
                onCancelLoad.getMin(-1797465937, oncanceled);
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(String.valueOf(str))));
        if (!DatePickerBridgeExtension.AnonymousClass8.length(intent, context)) {
            return false;
        }
        intent.setFlags(268435456);
        context.startActivity(intent);
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/danah5/openapp/OpenNativeAppBridge$Companion;", "", "()V", "MARKET_DETAILS_URL_SCHEME", "", "PACKAGE_NAME_KEY", "URI_HANDLER_NOT_FOUND", "URI_SCHEME_KEY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
