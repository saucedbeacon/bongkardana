package id.dana.danah5.customredirectto;

import android.app.Application;
import android.os.Bundle;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.iap.ac.android.common.utils.security.RSAHelper;
import id.dana.DanaApplication;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.GContainerModule;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.PrepareException;
import o.attach;
import o.saveSnapshot;
import o.setCancelOnTouchOutside$core;
import o.setExitPerform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lid/dana/danah5/customredirectto/CutomRedirectToBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "miniProgramPreference", "Lid/dana/data/miniprogram/source/local/MiniProgramPreference;", "getMiniProgramPreference", "()Lid/dana/data/miniprogram/source/local/MiniProgramPreference;", "setMiniProgramPreference", "(Lid/dana/data/miniprogram/source/local/MiniProgramPreference;)V", "customRedirectTo", "", "url", "", "publicKey", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "handleCustomRedirect", "handleCustomRedirectBukalapak", "onInitialized", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CutomRedirectToBridge extends SimpleBridgeExtension {
    @Inject
    public setExitPerform miniProgramPreference;

    @NotNull
    public final setExitPerform getMiniProgramPreference() {
        setExitPerform setexitperform = this.miniProgramPreference;
        if (setexitperform == null) {
            Intrinsics.throwUninitializedPropertyAccessException("miniProgramPreference");
        }
        return setexitperform;
    }

    public final void setMiniProgramPreference(@NotNull setExitPerform setexitperform) {
        Intrinsics.checkNotNullParameter(setexitperform, "<set-?>");
        this.miniProgramPreference = setexitperform;
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
                getmax.getMin().length(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void customRedirectTo(@NotNull @BindingParam(name = {"url"}) String str, @Nullable @BindingParam(name = {"publicKey"}) String str2, @NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        CharSequence charSequence = str;
        if (!StringsKt.contains$default(charSequence, (CharSequence) "bukalapak", false, 2, (Object) null) && !StringsKt.contains$default(charSequence, (CharSequence) "dummy", false, 2, (Object) null)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else if (StringsKt.contains$default(charSequence, (CharSequence) "bukalapak", false, 2, (Object) null) || StringsKt.contains$default(charSequence, (CharSequence) "dummy", false, 2, (Object) null)) {
            handleCustomRedirectBukalapak(str, str2, bridgeCallback);
        } else {
            handleCustomRedirect(str, bridgeCallback);
        }
    }

    private final void handleCustomRedirectBukalapak(String str, String str2, BridgeCallback bridgeCallback) {
        setExitPerform setexitperform = this.miniProgramPreference;
        if (setexitperform == null) {
            Intrinsics.throwUninitializedPropertyAccessException("miniProgramPreference");
        }
        attach account = setexitperform.length.getAccount();
        String encrypt = RSAHelper.encrypt(account != null ? account.getPhoneNumber() : null, String.valueOf(str2));
        Intrinsics.checkNotNullExpressionValue(encrypt, "encrypted");
        DanaH5.startContainerFullUrl(StringsKt.replace$default(str, "{phonenumber}", encrypt, false, 4, (Object) null), new getMin(bridgeCallback));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/danah5/customredirectto/CutomRedirectToBridge$handleCustomRedirectBukalapak$1", "Lid/dana/danah5/DanaH5Listener;", "onContainerDestroyed", "", "bundle", "Landroid/os/Bundle;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements setCancelOnTouchOutside$core {
        final /* synthetic */ BridgeCallback $bridgeCallback;

        @JvmDefault
        public final void onContainerCreated(@Nullable Bundle bundle) {
        }

        getMin(BridgeCallback bridgeCallback) {
            this.$bridgeCallback = bridgeCallback;
        }

        public final void onContainerDestroyed(@Nullable Bundle bundle) {
            this.$bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/danah5/customredirectto/CutomRedirectToBridge$handleCustomRedirect$1", "Lid/dana/danah5/DanaH5Listener;", "onContainerDestroyed", "", "bundle", "Landroid/os/Bundle;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements setCancelOnTouchOutside$core {
        final /* synthetic */ BridgeCallback $bridgeCallback;

        @JvmDefault
        public final void onContainerCreated(@Nullable Bundle bundle) {
        }

        setMin(BridgeCallback bridgeCallback) {
            this.$bridgeCallback = bridgeCallback;
        }

        public final void onContainerDestroyed(@Nullable Bundle bundle) {
            this.$bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    private final void handleCustomRedirect(String str, BridgeCallback bridgeCallback) {
        DanaH5.startContainerFullUrl(str, new setMin(bridgeCallback));
    }
}
