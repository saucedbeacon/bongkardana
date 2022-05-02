package id.dana.danah5.twilioverifysecurityproduct;

import android.app.Application;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.di.modules.GContainerModule;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.disableItems;
import o.saveSnapshot;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J0\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lid/dana/danah5/twilioverifysecurityproduct/TwilioVerifySecurityProductBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "twilioVerifySecurityProductManager", "Lid/dana/danah5/twilioverifysecurityproduct/TwilioVerifySecurityProductManager;", "getTwilioVerifySecurityProductManager", "()Lid/dana/danah5/twilioverifysecurityproduct/TwilioVerifySecurityProductManager;", "setTwilioVerifySecurityProductManager", "(Lid/dana/danah5/twilioverifysecurityproduct/TwilioVerifySecurityProductManager;)V", "onFinalized", "", "onInitialized", "twilioVerifySecurityProduct", "eventName", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "page", "Lcom/alibaba/ariver/app/api/Page;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TwilioVerifySecurityProductBridge extends BaseBridge {
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    private static final String SECURITY_ID = "securityId";
    private static final String TIMEOUT = "timeout";
    private static final String VERIFICATION_METHOD = "verificationMethod";
    @Inject
    public disableItems twilioVerifySecurityProductManager;

    @NotNull
    public final disableItems getTwilioVerifySecurityProductManager() {
        disableItems disableitems = this.twilioVerifySecurityProductManager;
        if (disableitems == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioVerifySecurityProductManager");
        }
        return disableitems;
    }

    public final void setTwilioVerifySecurityProductManager(@NotNull disableItems disableitems) {
        Intrinsics.checkNotNullParameter(disableitems, "<set-?>");
        this.twilioVerifySecurityProductManager = disableitems;
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void twilioVerifySecurityProduct(@NotNull @BindingParam(name = {"event"}) String str, @NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(str, IpcMessageConstants.EXTRA_EVENT);
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        String string = jSONObject.getString("securityId");
        String string2 = jSONObject.getString(VERIFICATION_METHOD);
        Integer integer = jSONObject.getInteger("timeout");
        disableItems disableitems = this.twilioVerifySecurityProductManager;
        if (disableitems == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioVerifySecurityProductManager");
        }
        Intrinsics.checkNotNullExpressionValue(string, "securityId");
        Intrinsics.checkNotNullExpressionValue(string2, VERIFICATION_METHOD);
        Intrinsics.checkNotNullExpressionValue(integer, "timeout");
        disableitems.doVerify(str, bridgeCallback, string, string2, integer.intValue(), page);
    }

    public final void onInitialized() {
        super.onInitialized();
        saveSnapshot.getMax getmax = new saveSnapshot.getMax((byte) 0);
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            if (applicationComponent != null) {
                getmax.setMin = applicationComponent;
                getmax.getMin = new GContainerModule();
                getmax.getMin().setMin(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    public final void onFinalized() {
        super.onFinalized();
        disableItems disableitems = this.twilioVerifySecurityProductManager;
        if (disableitems == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioVerifySecurityProductManager");
        }
        disableitems.disposeAllObservable();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/danah5/twilioverifysecurityproduct/TwilioVerifySecurityProductBridge$Companion;", "", "()V", "SECURITY_ID", "", "TIMEOUT", "VERIFICATION_METHOD", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
