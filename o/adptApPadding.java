package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.domain.registration.AuthenticationMethod;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.Embedded;
import o.GriverShareSchemeExtension;
import o.SplashEntryInfo;
import o.replaceLayoutParam;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001f B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\u001a\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0002J4\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u001e\u001a\u00020\fH\u0016J\u001a\u0010\u0004\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lid/dana/switchfaceauth/SwitchFaceAuthPresenter;", "Lid/dana/switchfaceauth/SwitchFaceAuthContract$Presenter;", "view", "Lid/dana/switchfaceauth/SwitchFaceAuthContract$View;", "switchFaceAuthentication", "Lid/dana/domain/auth/face/interactor/SwitchFaceAuthentication;", "getUserId", "Lid/dana/domain/account/interactor/GetUserId;", "faceAuthenticationProxy", "Lid/dana/auth/face/FaceAuthenticationProxy;", "(Lid/dana/switchfaceauth/SwitchFaceAuthContract$View;Lid/dana/domain/auth/face/interactor/SwitchFaceAuthentication;Lid/dana/domain/account/interactor/GetUserId;Lid/dana/auth/face/FaceAuthenticationProxy;)V", "actionMapper", "", "faceAuthNew", "", "faceAuthenticationResult", "Lid/dana/domain/auth/face/result/FaceAuthenticationResult;", "awakeFaceEnrollUAP", "verifyId", "", "awakeFaceQueryUAP", "userId", "doEnroll", "doFaceAuth", "securityId", "doRiskChallenge", "verificationMethods", "", "Lid/dana/domain/auth/face/result/VerificationMethodInfo;", "pubKey", "onDestroy", "ActionConstant", "VerificationMethodConstant", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class adptApPadding implements replaceLayoutParam.getMin {
    /* access modifiers changed from: private */
    public final replaceLayoutParam.length getMax;
    private final GriverCreateDialogParam getMin;
    private final Embedded setMax;
    private final GriverShareSchemeExtension setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/auth/face/result/FaceAuthenticationResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<GVTitleBar, Unit> {
        final /* synthetic */ boolean $faceAuthNew;
        final /* synthetic */ adptApPadding this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(adptApPadding adptappadding, boolean z) {
            super(1);
            this.this$0 = adptappadding;
            this.$faceAuthNew = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GVTitleBar) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GVTitleBar gVTitleBar) {
            Intrinsics.checkNotNullParameter(gVTitleBar, "it");
            this.this$0.getMax.dismissProgress();
            adptApPadding.setMax(this.this$0, this.$faceAuthNew, gVTitleBar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ adptApPadding this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(adptApPadding adptappadding) {
            super(1);
            this.this$0 = adptappadding;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.SWITCH_FACE_AUTHENTICATION_PREFIX);
            sb.append(this.this$0.getClass().getName());
            sb.append("onError");
            updateActionSheetContent.e(DanaLogConstants.TAG.SWITCH_FACE_AUTHENTICATION, sb.toString(), th);
            this.this$0.getMax.dismissProgress();
            this.this$0.getMax.onError(th.getMessage());
        }
    }

    @Inject
    public adptApPadding(@NotNull replaceLayoutParam.length length2, @NotNull GriverShareSchemeExtension griverShareSchemeExtension, @NotNull GriverCreateDialogParam griverCreateDialogParam, @NotNull Embedded embedded) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(griverShareSchemeExtension, "switchFaceAuthentication");
        Intrinsics.checkNotNullParameter(griverCreateDialogParam, "getUserId");
        Intrinsics.checkNotNullParameter(embedded, "faceAuthenticationProxy");
        this.getMax = length2;
        this.setMin = griverShareSchemeExtension;
        this.getMin = griverCreateDialogParam;
        this.setMax = embedded;
    }

    public final void getMax(boolean z, @Nullable String str) {
        this.getMax.showProgress();
        APWebChromeClient.execute$default(this.setMin, new GriverShareSchemeExtension.getMin(z, str), new getMax(this, z), new toIntRange(this), (Function0) null, new IsOverlapping(this), 8, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements removeStateDidChangeHandler {
        final /* synthetic */ adptApPadding length;

        IsOverlapping(adptApPadding adptappadding) {
            this.length = adptappadding;
        }

        public final void getMax() {
            this.length.getMax.dismissProgress();
        }
    }

    public final void setMax() {
        this.setMin.dispose();
        this.getMin.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"id/dana/switchfaceauth/SwitchFaceAuthPresenter$doFaceAuth$1$1", "Lid/dana/auth/face/StartFaceAuthCallback;", "onFailVerifyAuth", "", "errorCode", "", "onSuccessVerifyAuth", "securityId", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements entity {
        final /* synthetic */ adptApPadding length;
        final /* synthetic */ boolean setMax;

        length(adptApPadding adptappadding, boolean z) {
            this.length = adptappadding;
            this.setMax = z;
        }

        public final void onSuccessVerifyAuth(@Nullable String str) {
            if (str != null) {
                this.length.getMax(this.setMax, str);
            }
        }

        public final void onFailVerifyAuth(int i) {
            StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.UAP_FACE_AUTHENTICATION_PREFIX);
            sb.append(getClass().getName());
            sb.append("onError");
            updateActionSheetContent.e(DanaLogConstants.TAG.UAP_FACE_AUTHENTICATION, sb.toString(), new Throwable(String.valueOf(i)));
            this.length.getMax.onFailToggle();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/switchfaceauth/SwitchFaceAuthPresenter$doEnroll$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "userId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ adptApPadding getMin;

        setMax(adptApPadding adptappadding) {
            this.getMin = adptappadding;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "userId");
            this.getMin.setMax.getMin(str, (inheritSuperIndices) new getMin(this.getMin));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.getMin.getMax.onError(th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"id/dana/switchfaceauth/SwitchFaceAuthPresenter$awakeFaceQueryUAP$1", "Lid/dana/auth/face/StartFaceQueryCallback;", "onFailFaceQuery", "", "errorCode", "", "onSuccessFaceQuery", "verifyId", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements inheritSuperIndices {
        final /* synthetic */ adptApPadding length;

        getMin(adptApPadding adptappadding) {
            this.length = adptappadding;
        }

        public final void onSuccessFaceQuery(@Nullable String str) {
            if (str != null) {
                adptApPadding.setMin(this.length, str);
            }
        }

        public final void onFailFaceQuery(int i) {
            this.length.getMax.onFailFaceQuery();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"id/dana/switchfaceauth/SwitchFaceAuthPresenter$awakeFaceEnrollUAP$1", "Lid/dana/auth/face/StartFaceEnrolmentCallback;", "onFailVerifyEnrolment", "", "errorCode", "", "onSuccessVerifyEnrolment", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements viewName {
        final /* synthetic */ adptApPadding getMax;

        setMin(adptApPadding adptappadding) {
            this.getMax = adptappadding;
        }

        public final void onSuccessVerifyEnrolment() {
            this.getMax.getMax.onSuccessFaceSwitch(Boolean.TRUE);
        }

        public final void onFailVerifyEnrolment(int i) {
            this.getMax.getMax.onFailFaceEnroll();
        }
    }

    public static final /* synthetic */ void setMax(adptApPadding adptappadding, boolean z, GVTitleBar gVTitleBar) {
        String action = gVTitleBar.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1814255407:
                    if (action.equals("TO_KYC")) {
                        adptappadding.getMax.toKYC();
                        return;
                    }
                    return;
                case -795785494:
                    if (action.equals("TO_ENROLL")) {
                        adptappadding.getMin.execute(new setMax(adptappadding));
                        return;
                    }
                    return;
                case -407149037:
                    if (action.equals("TO_RISK")) {
                        List<GVTabBar> verificationMethods = gVTitleBar.getVerificationMethods();
                        String securityId = gVTitleBar.getSecurityId();
                        SplashEntryInfo.AnonymousClass1 securityContext = gVTitleBar.getSecurityContext();
                        String pubKey = securityContext != null ? securityContext.getPubKey() : null;
                        if (verificationMethods != null) {
                            for (GVTabBar verificationMethod : verificationMethods) {
                                String verificationMethod2 = verificationMethod.getVerificationMethod();
                                if (verificationMethod2 != null) {
                                    int hashCode = verificationMethod2.hashCode();
                                    if (hashCode != -871260811) {
                                        if (hashCode == 1999612571 && verificationMethod2.equals("PASSWORD")) {
                                            adptappadding.getMax.onFaceSwitchRiskChallenge(securityId, pubKey, z);
                                        }
                                    } else if (verificationMethod2.equals(AuthenticationMethod.FACE_LOGIN) && securityId != null) {
                                        Embedded embedded = adptappadding.setMax;
                                        entity length2 = new length(adptappadding, z);
                                        Intrinsics.checkNotNullParameter(securityId, "verifyId");
                                        Intrinsics.checkNotNullParameter(length2, "callback");
                                        embedded.length(securityId, new Embedded.getMax(embedded, length2));
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 321752684:
                    if (action.equals("SUCCESS_DISABLE")) {
                        adptappadding.getMax.onSuccessFaceSwitch(Boolean.FALSE);
                        return;
                    }
                    return;
                case 458732895:
                    if (action.equals("SUCCESS_ENABLE")) {
                        adptappadding.getMax.onSuccessFaceSwitch(Boolean.TRUE);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public static final /* synthetic */ void setMin(adptApPadding adptappadding, String str) {
        Embedded embedded = adptappadding.setMax;
        viewName setmin = new setMin(adptappadding);
        Intrinsics.checkNotNullParameter(str, "verifyId");
        Intrinsics.checkNotNullParameter(setmin, "callback");
        embedded.length(str, new Embedded.setMax(embedded, setmin));
    }
}
