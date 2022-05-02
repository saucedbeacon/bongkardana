package o;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.customredirectto.CutomRedirectToBridge;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.b;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/danah5/bottomsheet/service/ServiceBridgeResponseFactory;", "", "()V", "FAIL_FETCH_AUTH_CODE", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "getFAIL_FETCH_AUTH_CODE", "()Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "FAIL_FETCH_AUTH_CODE$delegate", "Lkotlin/Lazy;", "FAIL_FETCH_SERVICES", "getFAIL_FETCH_SERVICES", "FAIL_FETCH_SERVICES$delegate", "USER_CANCEL", "getUSER_CANCEL", "USER_CANCEL$delegate", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class icon {
    @NotNull
    private static final Lazy FAIL_FETCH_AUTH_CODE$delegate = LazyKt.lazy(length.INSTANCE);
    @NotNull
    private static final Lazy FAIL_FETCH_SERVICES$delegate = LazyKt.lazy(getMax.INSTANCE);
    @NotNull
    public static final icon INSTANCE = new icon();
    @NotNull
    private static final Lazy USER_CANCEL$delegate = LazyKt.lazy(getMin.INSTANCE);

    @NotNull
    public final BridgeResponse getFAIL_FETCH_AUTH_CODE() {
        return (BridgeResponse) FAIL_FETCH_AUTH_CODE$delegate.getValue();
    }

    @NotNull
    public final BridgeResponse getFAIL_FETCH_SERVICES() {
        return (BridgeResponse) FAIL_FETCH_SERVICES$delegate.getValue();
    }

    @NotNull
    public final BridgeResponse getUSER_CANCEL() {
        return (BridgeResponse) USER_CANCEL$delegate.getValue();
    }

    private icon() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse$Error;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<BridgeResponse.Error> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(0);
        }

        public final BridgeResponse.Error invoke() {
            return BridgeResponse.newError(11, "user cancel");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse$Error;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<BridgeResponse.Error> {
        public static final length INSTANCE = new length();

        length() {
            super(0);
        }

        public final BridgeResponse.Error invoke() {
            return BridgeResponse.newError(12, "fail fetch auth code");
        }
    }

    /* renamed from: o.icon$default  reason: invalid class name */
    public final class Cdefault implements getBindingAdapter<CutomRedirectToBridge> {
        private final b.C0007b<setExitPerform> miniProgramPreferenceProvider;

        public Cdefault(b.C0007b<setExitPerform> bVar) {
            this.miniProgramPreferenceProvider = bVar;
        }

        public static getBindingAdapter<CutomRedirectToBridge> create(b.C0007b<setExitPerform> bVar) {
            return new Cdefault(bVar);
        }

        public final void injectMembers(CutomRedirectToBridge cutomRedirectToBridge) {
            injectMiniProgramPreference(cutomRedirectToBridge, this.miniProgramPreferenceProvider.get());
        }

        @InjectedFieldSignature("id.dana.danah5.customredirectto.CutomRedirectToBridge.miniProgramPreference")
        public static void injectMiniProgramPreference(CutomRedirectToBridge cutomRedirectToBridge, setExitPerform setexitperform) {
            cutomRedirectToBridge.miniProgramPreference = setexitperform;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse$Error;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<BridgeResponse.Error> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(0);
        }

        public final BridgeResponse.Error invoke() {
            return BridgeResponse.newError(13, "fail fetch services or services is empty");
        }
    }
}
