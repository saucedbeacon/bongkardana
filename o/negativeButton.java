package o;

import android.app.Activity;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import id.dana.challenge.ChallengeControl;
import id.dana.constants.ErrorCode;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.danah5.extension.DanaGriverUserAgentExtension;
import id.dana.danah5.faceverificationenablement.FaceVerificationEnablementBridge;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.registration.AuthenticationMethod;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.Embedded;
import o.GriverShareSchemeExtension;
import o.SplashEntryInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class negativeButton implements getAdapterPosition<DanaGriverUserAgentExtension> {
    public final DanaGriverUserAgentExtension get() {
        return newInstance();
    }

    public static negativeButton create() {
        return getMin.INSTANCE;
    }

    public static DanaGriverUserAgentExtension newInstance() {
        return new DanaGriverUserAgentExtension();
    }

    static final class getMin {
        /* access modifiers changed from: private */
        public static final negativeButton INSTANCE = new negativeButton();

        private getMin() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\fH\u0002J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\u001a\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0002J4\u0010 \u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\fH\u0002J$\u0010%\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010&\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010&\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lid/dana/danah5/faceverificationenablement/FaceVerificationEnablementManager;", "", "switchFaceAuthentication", "Lid/dana/domain/auth/face/interactor/SwitchFaceAuthentication;", "getUserId", "Lid/dana/domain/account/interactor/GetUserId;", "(Lid/dana/domain/auth/face/interactor/SwitchFaceAuthentication;Lid/dana/domain/account/interactor/GetUserId;)V", "activity", "Landroid/app/Activity;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "eventName", "", "faceAuthenticationProxy", "Lid/dana/auth/face/FaceAuthenticationProxy;", "getFaceAuthenticationProxy", "()Lid/dana/auth/face/FaceAuthenticationProxy;", "faceAuthenticationProxy$delegate", "Lkotlin/Lazy;", "awakeFaceEnrollUAP", "", "verifyId", "awakeFaceQueryUAP", "userId", "decideAction", "faceAuthNew", "", "faceAuthenticationResult", "Lid/dana/domain/auth/face/result/FaceAuthenticationResult;", "doEnroll", "doFaceAuth", "securityId", "doRiskChallenge", "verificationMethods", "", "Lid/dana/domain/auth/face/result/VerificationMethodInfo;", "pubKey", "onFaceSwitchRiskChallenge", "switchFaceAuth", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.negativeButton$default  reason: invalid class name */
    public final class Cdefault {
        @NotNull
        public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public Activity activity;
        /* access modifiers changed from: private */
        public BridgeCallback bridgeCallback;
        /* access modifiers changed from: private */
        public String eventName;
        private final Lazy faceAuthenticationProxy$delegate = LazyKt.lazy(new equals(this));
        private final GriverCreateDialogParam getUserId;
        private final GriverShareSchemeExtension switchFaceAuthentication;

        private final Embedded getFaceAuthenticationProxy() {
            return (Embedded) this.faceAuthenticationProxy$delegate.getValue();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/auth/face/result/FaceAuthenticationResult;", "invoke"}, k = 3, mv = {1, 4, 2})
        /* renamed from: o.negativeButton$default$isInside */
        static final class isInside extends Lambda implements Function1<GVTitleBar, Unit> {
            final /* synthetic */ boolean $faceAuthNew;
            final /* synthetic */ Cdefault this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            isInside(Cdefault defaultR, boolean z) {
                super(1);
                this.this$0 = defaultR;
                this.$faceAuthNew = z;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GVTitleBar) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GVTitleBar gVTitleBar) {
                Intrinsics.checkNotNullParameter(gVTitleBar, "it");
                this.this$0.decideAction(this.$faceAuthNew, gVTitleBar);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        /* renamed from: o.negativeButton$default$toIntRange */
        static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ Cdefault this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            toIntRange(Cdefault defaultR) {
                super(1);
                this.this$0 = defaultR;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                if (th instanceof NetworkException) {
                    String errorCode = ((NetworkException) th).getErrorCode();
                    if (errorCode != null && errorCode.hashCode() == 408588712 && errorCode.equals(ErrorCode.RISK_CONSULT_REJECT)) {
                        Cdefault.access$getBridgeCallback$p(this.this$0).sendJSONResponse(neutralButton.INSTANCE.getError(12));
                        return;
                    }
                    return;
                }
                String access$getEventName$p = Cdefault.access$getEventName$p(this.this$0);
                int hashCode = access$getEventName$p.hashCode();
                if (hashCode != -2087889508) {
                    if (hashCode == 1381638251 && access$getEventName$p.equals(FaceVerificationEnablementBridge.EVENT_NAME_ENROLL_FACE_AUTH)) {
                        Cdefault.access$getBridgeCallback$p(this.this$0).sendJSONResponse(neutralButton.INSTANCE.getError(14));
                    }
                } else if (access$getEventName$p.equals(FaceVerificationEnablementBridge.EVENT_NAME_ENABLE_FACE_AUTH_SWITCH)) {
                    Cdefault.access$getBridgeCallback$p(this.this$0).sendJSONResponse(neutralButton.INSTANCE.getError(15));
                }
            }
        }

        @Inject
        public Cdefault(@NotNull GriverShareSchemeExtension griverShareSchemeExtension, @NotNull GriverCreateDialogParam griverCreateDialogParam) {
            Intrinsics.checkNotNullParameter(griverShareSchemeExtension, "switchFaceAuthentication");
            Intrinsics.checkNotNullParameter(griverCreateDialogParam, "getUserId");
            this.switchFaceAuthentication = griverShareSchemeExtension;
            this.getUserId = griverCreateDialogParam;
        }

        public static final /* synthetic */ Activity access$getActivity$p(Cdefault defaultR) {
            Activity activity2 = defaultR.activity;
            if (activity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
            }
            return activity2;
        }

        public static final /* synthetic */ BridgeCallback access$getBridgeCallback$p(Cdefault defaultR) {
            BridgeCallback bridgeCallback2 = defaultR.bridgeCallback;
            if (bridgeCallback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
            }
            return bridgeCallback2;
        }

        public static final /* synthetic */ String access$getEventName$p(Cdefault defaultR) {
            String str = defaultR.eventName;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException(IpcMessageConstants.EXTRA_EVENT);
            }
            return str;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/auth/face/FaceAuthenticationProxy;", "invoke"}, k = 3, mv = {1, 4, 2})
        /* renamed from: o.negativeButton$default$equals */
        static final class equals extends Lambda implements Function0<Embedded> {
            final /* synthetic */ Cdefault this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            equals(Cdefault defaultR) {
                super(0);
                this.this$0 = defaultR;
            }

            @NotNull
            public final Embedded invoke() {
                return new Embedded(Cdefault.access$getActivity$p(this.this$0));
            }
        }

        public final void switchFaceAuth(@NotNull Activity activity2, @NotNull BridgeCallback bridgeCallback2, @NotNull String str) {
            Intrinsics.checkNotNullParameter(activity2, AkuEventParamsKey.KEY_ACTIVITY);
            Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
            Intrinsics.checkNotNullParameter(str, IpcMessageConstants.EXTRA_EVENT);
            this.activity = activity2;
            this.bridgeCallback = bridgeCallback2;
            this.eventName = str;
            switchFaceAuth$default(this, false, (String) null, 3, (Object) null);
        }

        static /* synthetic */ void switchFaceAuth$default(Cdefault defaultR, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                str = "";
            }
            defaultR.switchFaceAuth(z, str);
        }

        /* access modifiers changed from: private */
        public final void switchFaceAuth(boolean z, String str) {
            this.switchFaceAuthentication.execute(new GriverShareSchemeExtension.getMin(z, str), new isInside(this, z), new toIntRange(this));
        }

        /* access modifiers changed from: private */
        public final void decideAction(boolean z, GVTitleBar gVTitleBar) {
            String action = gVTitleBar.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -795785494) {
                    if (hashCode != -407149037) {
                        if (hashCode == 458732895 && action.equals("SUCCESS_ENABLE")) {
                            BridgeCallback bridgeCallback2 = this.bridgeCallback;
                            if (bridgeCallback2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
                            }
                            bridgeCallback2.sendBridgeResponse(BridgeResponse.SUCCESS);
                        }
                    } else if (action.equals("TO_RISK")) {
                        List<GVTabBar> verificationMethods = gVTitleBar.getVerificationMethods();
                        String securityId = gVTitleBar.getSecurityId();
                        SplashEntryInfo.AnonymousClass1 securityContext = gVTitleBar.getSecurityContext();
                        doRiskChallenge(z, verificationMethods, securityId, securityContext != null ? securityContext.getPubKey() : null);
                    }
                } else if (action.equals("TO_ENROLL")) {
                    doEnroll();
                }
            }
        }

        private final void doRiskChallenge(boolean z, List<GVTabBar> list, String str, String str2) {
            if (list != null) {
                for (GVTabBar verificationMethod : list) {
                    String verificationMethod2 = verificationMethod.getVerificationMethod();
                    if (verificationMethod2 != null) {
                        int hashCode = verificationMethod2.hashCode();
                        if (hashCode != -871260811) {
                            if (hashCode == 1999612571 && verificationMethod2.equals("PASSWORD")) {
                                onFaceSwitchRiskChallenge(str, str2, z);
                            }
                        } else if (verificationMethod2.equals(AuthenticationMethod.FACE_LOGIN)) {
                            doFaceAuth(z, str);
                        }
                    }
                }
            }
        }

        private final void onFaceSwitchRiskChallenge(String str, String str2, boolean z) {
            Activity activity2 = this.activity;
            if (activity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
            }
            ChallengeControl.length length2 = new ChallengeControl.length(activity2);
            length2.getMin = "face_activation";
            ChallengeControl.length length3 = length2;
            length3.setMax = "face_activation";
            new ChallengeControl(length3.getMin(false, str, str2, z), (byte) 0).getMin();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"id/dana/danah5/faceverificationenablement/FaceVerificationEnablementManager$doFaceAuth$1$1", "Lid/dana/auth/face/StartFaceAuthCallback;", "onFailVerifyAuth", "", "errorCode", "", "onSuccessVerifyAuth", "securityId", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.negativeButton$default$getMin */
        public static final class getMin implements entity {
            final /* synthetic */ boolean $faceAuthNew$inlined;
            final /* synthetic */ Cdefault this$0;

            getMin(Cdefault defaultR, boolean z) {
                this.this$0 = defaultR;
                this.$faceAuthNew$inlined = z;
            }

            public final void onSuccessVerifyAuth(@Nullable String str) {
                if (str != null) {
                    this.this$0.switchFaceAuth(this.$faceAuthNew$inlined, str);
                }
            }

            public final void onFailVerifyAuth(int i) {
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.UAP_FACE_AUTHENTICATION_PREFIX);
                sb.append(getClass().getName());
                sb.append("onError");
                updateActionSheetContent.e(DanaLogConstants.TAG.UAP_FACE_AUTHENTICATION, sb.toString(), new Throwable(String.valueOf(i)));
                Cdefault.access$getBridgeCallback$p(this.this$0).sendJSONResponse(neutralButton.INSTANCE.getError(15));
            }
        }

        private final void doFaceAuth(boolean z, String str) {
            if (str != null) {
                Embedded faceAuthenticationProxy = getFaceAuthenticationProxy();
                entity getmin = new getMin(this, z);
                Intrinsics.checkNotNullParameter(str, "verifyId");
                Intrinsics.checkNotNullParameter(getmin, "callback");
                faceAuthenticationProxy.length(str, new Embedded.getMax(faceAuthenticationProxy, getmin));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/danah5/faceverificationenablement/FaceVerificationEnablementManager$doEnroll$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "userId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.negativeButton$default$setMax */
        public static final class setMax extends GriverAppVirtualHostProxy<String> {
            final /* synthetic */ Cdefault this$0;

            setMax(Cdefault defaultR) {
                this.this$0 = defaultR;
            }

            public final void onNext(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "userId");
                this.this$0.awakeFaceQueryUAP(str);
            }

            public final void onError(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "e");
                Cdefault.access$getBridgeCallback$p(this.this$0).sendJSONResponse(neutralButton.INSTANCE.getError(14));
            }
        }

        private final void doEnroll() {
            this.getUserId.execute(new setMax(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"id/dana/danah5/faceverificationenablement/FaceVerificationEnablementManager$awakeFaceQueryUAP$1", "Lid/dana/auth/face/StartFaceQueryCallback;", "onFailFaceQuery", "", "errorCode", "", "onSuccessFaceQuery", "verifyId", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.negativeButton$default$getMax */
        public static final class getMax implements inheritSuperIndices {
            final /* synthetic */ Cdefault this$0;

            getMax(Cdefault defaultR) {
                this.this$0 = defaultR;
            }

            public final void onSuccessFaceQuery(@Nullable String str) {
                if (str != null) {
                    this.this$0.awakeFaceEnrollUAP(str);
                }
            }

            public final void onFailFaceQuery(int i) {
                Cdefault.access$getBridgeCallback$p(this.this$0).sendJSONResponse(neutralButton.INSTANCE.getError(14));
            }
        }

        /* access modifiers changed from: private */
        public final void awakeFaceQueryUAP(String str) {
            getFaceAuthenticationProxy().getMin(str, (inheritSuperIndices) new getMax(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"id/dana/danah5/faceverificationenablement/FaceVerificationEnablementManager$awakeFaceEnrollUAP$1", "Lid/dana/auth/face/StartFaceEnrolmentCallback;", "onFailVerifyEnrolment", "", "errorCode", "", "onSuccessVerifyEnrolment", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.negativeButton$default$length */
        public static final class length implements viewName {
            final /* synthetic */ Cdefault this$0;

            length(Cdefault defaultR) {
                this.this$0 = defaultR;
            }

            public final void onSuccessVerifyEnrolment() {
                Cdefault.access$getBridgeCallback$p(this.this$0).sendBridgeResponse(BridgeResponse.SUCCESS);
            }

            public final void onFailVerifyEnrolment(int i) {
                int max = dispatchOnCancelled.setMax(i);
                if (i != max) {
                    onCanceled oncanceled = new onCanceled(i, max, 1);
                    onCancelLoad.setMax(1588267595, oncanceled);
                    onCancelLoad.getMin(1588267595, oncanceled);
                }
                Cdefault.access$getBridgeCallback$p(this.this$0).sendJSONResponse(neutralButton.INSTANCE.getError(14));
            }
        }

        /* access modifiers changed from: private */
        public final void awakeFaceEnrollUAP(String str) {
            Embedded faceAuthenticationProxy = getFaceAuthenticationProxy();
            viewName length2 = new length(this);
            Intrinsics.checkNotNullParameter(str, "verifyId");
            Intrinsics.checkNotNullParameter(length2, "callback");
            faceAuthenticationProxy.length(str, new Embedded.setMax(faceAuthenticationProxy, length2));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lid/dana/danah5/faceverificationenablement/FaceVerificationEnablementManager$Companion;", "", "()V", "ActionConstant", "VerificationMethodConstant", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.negativeButton$default$setMin */
        public static final class setMin {
            private setMin() {
            }

            public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
