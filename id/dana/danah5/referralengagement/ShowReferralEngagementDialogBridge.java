package id.dana.danah5.referralengagement;

import android.app.Application;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.di.modules.GContainerModule;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.Constants;
import o.PrepareException;
import o.saveSnapshot;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lid/dana/danah5/referralengagement/ShowReferralEngagementDialogBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "saveReferralEngagementDialogCache", "Lid/dana/domain/referral/interactor/SaveReferralEngagementDialogCache;", "getSaveReferralEngagementDialogCache", "()Lid/dana/domain/referral/interactor/SaveReferralEngagementDialogCache;", "setSaveReferralEngagementDialogCache", "(Lid/dana/domain/referral/interactor/SaveReferralEngagementDialogCache;)V", "onInitialized", "", "showReferralEngagementDialog", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "startReferralDialogWithTimer", "showDialog", "", "source", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ShowReferralEngagementDialogBridge extends SimpleBridgeExtension {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    private static final String SHOW_DIALOG_KEY = "showDialog";
    private static final String SOURCE_KEY = "source";
    @Inject
    public Constants saveReferralEngagementDialogCache;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ BridgeCallback $bridgeCallback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(BridgeCallback bridgeCallback) {
            super(1);
            this.$bridgeCallback = bridgeCallback;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.$bridgeCallback.sendBridgeResponse(BridgeResponse.newError(6, th.getMessage()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ BridgeCallback $bridgeCallback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(BridgeCallback bridgeCallback) {
            super(1);
            this.$bridgeCallback = bridgeCallback;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.$bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @NotNull
    public final Constants getSaveReferralEngagementDialogCache() {
        Constants constants = this.saveReferralEngagementDialogCache;
        if (constants == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saveReferralEngagementDialogCache");
        }
        return constants;
    }

    public final void setSaveReferralEngagementDialogCache(@NotNull Constants constants) {
        Intrinsics.checkNotNullParameter(constants, "<set-?>");
        this.saveReferralEngagementDialogCache = constants;
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void showReferralEngagementDialog(@NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        if (jSONObject.containsKey(SHOW_DIALOG_KEY) && jSONObject.containsKey("source")) {
            Boolean bool = jSONObject.getBoolean(SHOW_DIALOG_KEY);
            Intrinsics.checkNotNullExpressionValue(bool, "info.getBoolean(SHOW_DIALOG_KEY)");
            boolean booleanValue = bool.booleanValue();
            String string = jSONObject.getString("source");
            Intrinsics.checkNotNullExpressionValue(string, "info.getString(SOURCE_KEY)");
            startReferralDialogWithTimer(bridgeCallback, booleanValue, string);
        }
    }

    public final void startReferralDialogWithTimer(@NotNull BridgeCallback bridgeCallback, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(str, "source");
        Constants constants = this.saveReferralEngagementDialogCache;
        if (constants == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saveReferralEngagementDialogCache");
        }
        constants.execute(new Constants.getMax(str, z, System.currentTimeMillis() / 1000), new length(bridgeCallback), new getMin(bridgeCallback));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/danah5/referralengagement/ShowReferralEngagementDialogBridge$Companion;", "", "()V", "SHOW_DIALOG_KEY", "", "SOURCE_KEY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void onInitialized() {
        saveSnapshot.getMax getmax = new saveSnapshot.getMax((byte) 0);
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            if (applicationComponent != null) {
                getmax.setMin = applicationComponent;
                getmax.getMin = new GContainerModule();
                getmax.getMin().getMin(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }
}
