package id.dana.danah5.bioutility;

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
import com.alibaba.fastjson.JSONObject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Embedded;
import o.entity;
import o.getDismissListeners$core;
import o.getPreShowListeners$core;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J \u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¨\u0006\u0015"}, d2 = {"Lid/dana/danah5/bioutility/BioUtilityBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "bioUtility", "", "eventName", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "page", "Lcom/alibaba/ariver/app/api/Page;", "doInvokeFaceAuth", "activity", "Landroid/app/Activity;", "securityId", "errorResult", "errorCode", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BioUtilityBridge extends SimpleBridgeExtension {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    @NotNull
    public static final String FACE_AUTHENTICATION = "faceAuthentication";
    @NotNull
    public static final String SECURITY_ID = "securityId";

    /* access modifiers changed from: private */
    public final String errorResult(int i) {
        return i != 1001 ? i != 1003 ? i != 1005 ? i != 1006 ? "001" : "005" : "004" : "003" : "002";
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void bioUtility(@NotNull @BindingParam(name = {"event"}) String str, @NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(str, IpcMessageConstants.EXTRA_EVENT);
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        if (Intrinsics.areEqual((Object) str, (Object) FACE_AUTHENTICATION)) {
            String string = jSONObject.getString(SECURITY_ID);
            CharSequence charSequence = string;
            if (charSequence == null || charSequence.length() == 0) {
                bridgeCallback.sendJSONResponse(getDismissListeners$core.getError("005"));
                return;
            }
            Intrinsics.checkNotNullParameter(page, "$this$activity");
            PageContext pageContext = page.getPageContext();
            Activity activity = pageContext != null ? pageContext.getActivity() : null;
            if (activity != null) {
                doInvokeFaceAuth(activity, string, bridgeCallback);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"id/dana/danah5/bioutility/BioUtilityBridge$doInvokeFaceAuth$1$1", "Lid/dana/auth/face/StartFaceAuthCallback;", "onFailVerifyAuth", "", "errorCode", "", "onSuccessVerifyAuth", "securityId", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements entity {
        final /* synthetic */ BridgeCallback $bridgeCallback$inlined;
        final /* synthetic */ String $securityId$inlined;
        final /* synthetic */ BioUtilityBridge this$0;

        setMax(BioUtilityBridge bioUtilityBridge, String str, BridgeCallback bridgeCallback) {
            this.this$0 = bioUtilityBridge;
            this.$securityId$inlined = str;
            this.$bridgeCallback$inlined = bridgeCallback;
        }

        public final void onSuccessVerifyAuth(@Nullable String str) {
            this.$bridgeCallback$inlined.sendJSONResponse(getDismissListeners$core.getResult(new getPreShowListeners$core(str)));
        }

        public final void onFailVerifyAuth(int i) {
            this.$bridgeCallback$inlined.sendJSONResponse(getDismissListeners$core.getError(this.this$0.errorResult(i)));
        }
    }

    private final void doInvokeFaceAuth(Activity activity, String str, BridgeCallback bridgeCallback) {
        Embedded embedded = new Embedded(activity);
        entity setmax = new setMax(this, str, bridgeCallback);
        Intrinsics.checkNotNullParameter(str, "verifyId");
        Intrinsics.checkNotNullParameter(setmax, "callback");
        embedded.length(str, new Embedded.getMax(embedded, setmax));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/danah5/bioutility/BioUtilityBridge$Companion;", "", "()V", "FACE_AUTHENTICATION", "", "SECURITY_ID", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
