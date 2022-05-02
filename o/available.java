package o;

import android.content.Context;
import com.alipay.iap.android.common.utils.security.RSAHelper;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NetworkStream;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001+B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0014J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000e2\u0006\u0010#\u001a\u00020$H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000e2\u0006\u0010'\u001a\u00020(H\u0016J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¨\u0006,"}, d2 = {"Lid/dana/data/twilio/repository/source/network/NetworkTwilioEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/twilio/repository/source/network/VerifyPushFacade;", "Lid/dana/data/twilio/repository/source/TwilioEntityData;", "context", "Landroid/content/Context;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "securityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "(Landroid/content/Context;Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;)V", "bindEnrollment", "Lio/reactivex/Observable;", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushBindEnrollmentResult;", "verifyPushBindEnrollmentRequest", "Lid/dana/data/twilio/repository/source/network/request/VerifyPushBindEnrollmentRequest;", "consultEnrollment", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushConsultResult;", "verifyPushConsultRequest", "Lid/dana/data/twilio/repository/source/network/request/VerifyPushConsultRequest;", "encryptPin", "Lid/dana/data/twilio/repository/source/network/request/VerifySecurityProductRequest;", "verifySecurityProductRequest", "publicKey", "", "getFacadeClass", "Ljava/lang/Class;", "requestChallenge", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushRequestChallengeResult;", "verifyPushRequestChallengeRequest", "Lid/dana/data/twilio/repository/source/network/request/VerifyPushRequestChallengeRequest;", "submitDerollment", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushDerollResult;", "verifyPushDerollRequest", "Lid/dana/data/twilio/repository/source/network/request/VerifyPushDerollRequest;", "submitEnrollment", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushEnrollResult;", "verifyPushEnrollRequest", "Lid/dana/data/twilio/repository/source/network/request/VerifyPushEnrollRequest;", "verifySecurityProduct", "Lid/dana/data/twilio/repository/source/network/result/VerifySecurityProductResult;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class available extends setRepeatCount<mark> implements getRealStream {
    @NotNull
    public static final length length = new length((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushEnrollResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/twilio/repository/source/network/VerifyPushFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class equals<F, S> implements addAnimatorUpdateListener.getMax<mark, teardown> {
        final /* synthetic */ onInputException length;
        final /* synthetic */ available setMin;

        equals(available available, onInputException oninputexception) {
            this.setMin = available;
            this.length = oninputexception;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            onInputException oninputexception = this.length;
            oninputexception.envInfo = this.setMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((mark) obj).register(oninputexception);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushConsultResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/twilio/repository/source/network/VerifyPushFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMax<F, S> implements addAnimatorUpdateListener.getMax<mark, OnlineResource> {
        final /* synthetic */ OfflineResource getMax;
        final /* synthetic */ available setMax;

        getMax(available available, OfflineResource offlineResource) {
            this.setMax = available;
            this.getMax = offlineResource;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            OfflineResource offlineResource = this.getMax;
            offlineResource.envInfo = this.setMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((mark) obj).consult(offlineResource);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushRequestChallengeResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/twilio/repository/source/network/VerifyPushFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMin<F, S> implements addAnimatorUpdateListener.getMax<mark, setBelongsPackage> {
        final /* synthetic */ available length;
        final /* synthetic */ onInputClose setMin;

        getMin(available available, onInputClose oninputclose) {
            this.length = available;
            this.setMin = oninputclose;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            onInputClose oninputclose = this.setMin;
            oninputclose.envInfo = this.length.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((mark) obj).requestChallenge(oninputclose);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/twilio/repository/source/network/result/VerifySecurityProductResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/twilio/repository/source/network/VerifyPushFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class isInside<F, S> implements addAnimatorUpdateListener.getMax<mark, needWaitForSetup> {
        final /* synthetic */ available getMax;
        final /* synthetic */ onResourceError getMin;

        isInside(available available, onResourceError onresourceerror) {
            this.getMax = available;
            this.getMin = onresourceerror;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            onResourceError onresourceerror = this.getMin;
            onresourceerror.envInfo = this.getMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((mark) obj).verifySecurityProduct(onresourceerror);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushDerollResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/twilio/repository/source/network/VerifyPushFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMax<F, S> implements addAnimatorUpdateListener.getMax<mark, ResourcePackage> {
        final /* synthetic */ available getMax;
        final /* synthetic */ onInputOpen setMax;

        setMax(available available, onInputOpen oninputopen) {
            this.getMax = available;
            this.setMax = oninputopen;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            onInputOpen oninputopen = this.setMax;
            oninputopen.envInfo = this.getMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((mark) obj).unregister(oninputopen);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushBindEnrollmentResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/twilio/repository/source/network/VerifyPushFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMin<F, S> implements addAnimatorUpdateListener.getMax<mark, getBelongsPackage> {
        final /* synthetic */ available getMax;
        final /* synthetic */ NetworkStream.Listener length;

        setMin(available available, NetworkStream.Listener listener) {
            this.getMax = available;
            this.length = listener;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            NetworkStream.Listener listener = this.length;
            listener.envInfo = this.getMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((mark) obj).bindEnrollment(listener);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/twilio/repository/source/network/result/VerifySecurityProductResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/twilio/repository/source/network/VerifyPushFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<F, S> implements addAnimatorUpdateListener.getMax<mark, needWaitForSetup> {
        final /* synthetic */ available getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ onResourceError setMin;

        toIntRange(available available, onResourceError onresourceerror, String str) {
            this.getMax = available;
            this.setMin = onresourceerror;
            this.getMin = str;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            onResourceError max = available.getMax(this.setMin, this.getMin);
            max.envInfo = this.getMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((mark) obj).verifySecurityProduct(max);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public available(@NotNull Context context, @NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "securityFacade");
    }

    @NotNull
    public final Class<mark> getFacadeClass() {
        return mark.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<OnlineResource> getMax(@NotNull OfflineResource offlineResource) {
        Intrinsics.checkNotNullParameter(offlineResource, "verifyPushConsultRequest");
        TitleBarRightButtonView.AnonymousClass1<OnlineResource> wrapper = wrapper(new getMax(this, offlineResource));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade ->\n    …\n            })\n        }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<teardown> setMax(@NotNull onInputException oninputexception) {
        Intrinsics.checkNotNullParameter(oninputexception, "verifyPushEnrollRequest");
        TitleBarRightButtonView.AnonymousClass1<teardown> timeout = wrapper(new equals(this, oninputexception)).timeout(3000, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(timeout, "wrapper { facade ->\n    …T, TimeUnit.MILLISECONDS)");
        return timeout;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getBelongsPackage> setMin(@NotNull NetworkStream.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "verifyPushBindEnrollmentRequest");
        TitleBarRightButtonView.AnonymousClass1<getBelongsPackage> timeout = wrapper(new setMin(this, listener)).timeout(3000, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(timeout, "wrapper { facade ->\n    …T, TimeUnit.MILLISECONDS)");
        return timeout;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<ResourcePackage> length(@NotNull onInputOpen oninputopen) {
        Intrinsics.checkNotNullParameter(oninputopen, "verifyPushDerollRequest");
        TitleBarRightButtonView.AnonymousClass1<ResourcePackage> wrapper = wrapper(new setMax(this, oninputopen));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade ->\n    …\n            })\n        }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setBelongsPackage> length(@NotNull onInputClose oninputclose) {
        Intrinsics.checkNotNullParameter(oninputclose, "verifyPushRequestChallengeRequest");
        TitleBarRightButtonView.AnonymousClass1<setBelongsPackage> wrapper = wrapper(new getMin(this, oninputclose));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade ->\n    …\n            })\n        }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<needWaitForSetup> setMin(@NotNull onResourceError onresourceerror, @NotNull String str) {
        Intrinsics.checkNotNullParameter(onresourceerror, "verifySecurityProductRequest");
        Intrinsics.checkNotNullParameter(str, "publicKey");
        if (Intrinsics.areEqual((Object) onresourceerror.getVerificationMethod(), (Object) "PASSWORD")) {
            TitleBarRightButtonView.AnonymousClass1<needWaitForSetup> wrapper = wrapper(new toIntRange(this, onresourceerror, str));
            Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade ->\n    …         })\n            }");
            return wrapper;
        }
        TitleBarRightButtonView.AnonymousClass1<needWaitForSetup> wrapper2 = wrapper(new isInside(this, onresourceerror));
        Intrinsics.checkNotNullExpressionValue(wrapper2, "wrapper { facade ->\n    …\n            })\n        }");
        return wrapper2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/data/twilio/repository/source/network/NetworkTwilioEntityData$Companion;", "", "()V", "PIN_VERIFICATION_METHOD", "", "REQUEST_NETWORK_TIMEOUT", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public static final /* synthetic */ onResourceError getMax(onResourceError onresourceerror, String str) {
        String encrypt = RSAHelper.encrypt(onresourceerror.getValidateData(), str);
        String securityId = onresourceerror.getSecurityId();
        String verificationMethod = onresourceerror.getVerificationMethod();
        Intrinsics.checkNotNullExpressionValue(encrypt, "pinValidateData");
        return new onResourceError(securityId, verificationMethod, encrypt, (String) null, 8, (DefaultConstructorMarker) null);
    }
}
