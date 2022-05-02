package id.dana.danah5.ocrreceipt;

import android.app.Activity;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import id.dana.ocr.model.OCRRequestModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.access$setDEFAULT_BEHAVIOR$cp;
import o.inferThemeIsLight;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\u000eH&J*\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J*\u0010\u0016\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0004J*\u0010\u0019\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H&R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"}, d2 = {"Lid/dana/danah5/ocrreceipt/BaseOCRBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "ocrReceiptManager", "Lid/dana/danah5/ocrreceipt/OCRReceiptManager;", "getOcrReceiptManager", "()Lid/dana/danah5/ocrreceipt/OCRReceiptManager;", "createNewOCRRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "info", "Lcom/alibaba/fastjson/JSONObject;", "isBackgroundProcess", "", "getRules", "", "getTag", "handleOCRReceipt", "", "activity", "Landroid/app/Activity;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "handleOnMethodCalled", "page", "Lcom/alibaba/ariver/app/api/Page;", "tryUploadOCRReceipt", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class BaseOCRBridge extends BaseBridge {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String EVENT_PARAM_IS_NULL = "event param is null";
    private static final String INFO_KEY_MERCHANT_ALIAS = "merchantNameAlias";
    private static final String INFO_KEY_MERCHANT_ID = "merchantId";
    private static final String INFO_KEY_RULES = "rules";
    private static final String INFO_KEY_TOKEN = "token";
    private static final String INFO_KEY_USER_LOYALTY_ID = "userLoyaltyId";
    @NotNull
    private final access$setDEFAULT_BEHAVIOR$cp ocrReceiptManager = new access$setDEFAULT_BEHAVIOR$cp();

    @NotNull
    public abstract String getTag();

    public abstract void tryUploadOCRReceipt(@Nullable Activity activity, boolean z, @NotNull JSONObject jSONObject, @NotNull BridgeCallback bridgeCallback);

    /* access modifiers changed from: protected */
    @NotNull
    public final access$setDEFAULT_BEHAVIOR$cp getOcrReceiptManager() {
        return this.ocrReceiptManager;
    }

    /* access modifiers changed from: protected */
    public final void handleOnMethodCalled(@Nullable JSONObject jSONObject, boolean z, @NotNull BridgeCallback bridgeCallback, @NotNull Page page) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        Map map = jSONObject;
        if (map == null || map.isEmpty()) {
            bridgeCallback.sendJSONResponse(inferThemeIsLight.getFailedResult("007"));
            updateActionSheetContent.e(getTag(), EVENT_PARAM_IS_NULL);
            return;
        }
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        handleOCRReceipt(pageContext != null ? pageContext.getActivity() : null, z, jSONObject, bridgeCallback);
    }

    private final void handleOCRReceipt(Activity activity, boolean z, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        String str;
        String str2;
        try {
            tryUploadOCRReceipt(activity, z, jSONObject, bridgeCallback);
        } catch (IllegalStateException e) {
            if (e instanceof OCRReceiptException) {
                str = e.getMessage();
                str2 = ((OCRReceiptException) e).getEvent();
            } else {
                str = EVENT_PARAM_IS_NULL;
                str2 = "007";
            }
            updateActionSheetContent.e(getTag(), str);
            bridgeCallback.sendJSONResponse(inferThemeIsLight.getFailedResult(str2));
        }
    }

    private final String getRules(JSONObject jSONObject) {
        String string = jSONObject.getString(INFO_KEY_RULES);
        Intrinsics.checkNotNullExpressionValue(string, "info.getString(INFO_KEY_RULES)");
        return string;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final OCRRequestModel createNewOCRRequestModel(@NotNull JSONObject jSONObject, boolean z) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        String string = jSONObject.getString("merchantId");
        String str3 = string == null ? "" : string;
        String string2 = jSONObject.getString(INFO_KEY_USER_LOYALTY_ID);
        if (string2 == null) {
            str = "";
        } else {
            str = string2;
        }
        String string3 = jSONObject.getString("token");
        if (string3 == null) {
            str2 = "";
        } else {
            str2 = string3;
        }
        List arrayList = new ArrayList();
        int i = 0;
        JSONArray jSONArray = jSONObject.getJSONArray(INFO_KEY_MERCHANT_ALIAS);
        Intrinsics.checkNotNullExpressionValue(jSONArray, "info.getJSONArray(INFO_KEY_MERCHANT_ALIAS)");
        for (Object next : jSONArray) {
            if (next != null) {
                arrayList.add(i, (String) next);
                i++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        OCRRequestModel oCRRequestModel = new OCRRequestModel(z, getRules(jSONObject), arrayList, str3, str, str2);
        if (!oCRRequestModel.getMax()) {
            return oCRRequestModel;
        }
        throw new OCRReceiptException(EVENT_PARAM_IS_NULL, "007");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/danah5/ocrreceipt/BaseOCRBridge$Companion;", "", "()V", "EVENT_PARAM_IS_NULL", "", "INFO_KEY_MERCHANT_ALIAS", "INFO_KEY_MERCHANT_ID", "INFO_KEY_RULES", "INFO_KEY_TOKEN", "INFO_KEY_USER_LOYALTY_ID", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
