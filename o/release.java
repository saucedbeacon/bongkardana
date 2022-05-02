package o;

import android.content.Context;
import android.os.Bundle;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.Embedded;
import o.createSplashFragment;
import o.isMainThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001,B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u001a\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J.\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J8\u0010\u001f\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010 \u001a\u0004\u0018\u00010\u00102\u0006\u0010!\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0016J.\u0010\"\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010#\u001a\u00020\u001aH\u0016J$\u0010$\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J0\u0010%\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010&\u001a\u0004\u0018\u00010\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0010H\u0016J\u001c\u0010(\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lid/dana/challenge/pin/PinSwitchFaceAuthPresenter;", "Lid/dana/challenge/pin/AbstractPinContract$Presenter;", "context", "Landroid/content/Context;", "verifyFaceAuthentication", "Lid/dana/domain/auth/face/interactor/VerifyFaceAuthentication;", "getUserId", "Lid/dana/domain/account/interactor/GetUserId;", "faceAuthenticationProxy", "Lid/dana/auth/face/FaceAuthenticationProxy;", "view", "Lid/dana/challenge/pin/AbstractPinContract$View;", "(Landroid/content/Context;Lid/dana/domain/auth/face/interactor/VerifyFaceAuthentication;Lid/dana/domain/account/interactor/GetUserId;Lid/dana/auth/face/FaceAuthenticationProxy;Lid/dana/challenge/pin/AbstractPinContract$View;)V", "awakeFaceEnrollUAP", "", "verifyId", "", "awakeFaceQueryUAP", "userId", "checkFeatureFaceLoginEnable", "checkIsAppFirstLaunch", "checkKnowledgeBasedAuthFeature", "doEnroll", "input", "inputPin", "withMobileData", "", "inputAutoRoute", "pubKey", "securityId", "autoRouteStatus", "inputPaymentAuth", "authType", "authStatus", "inputSwitchFaceAuth", "faceAuthNew", "inputTrustRisk", "inputTwilio", "verificationMethod", "sendOtpStrategy", "inputWithData", "data", "Landroid/os/Bundle;", "onDestroy", "ActionConstant", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class release implements isMainThread.getMax {
    private final Embedded getMax;
    /* access modifiers changed from: private */
    public final Context getMin;
    private final createSplashFragment length;
    /* access modifiers changed from: private */
    public final isMainThread.getMin setMax;
    private final GriverCreateDialogParam setMin;

    public final void getMax() {
    }

    public final void getMax(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, @Nullable String str4) {
    }

    public final void getMax(@Nullable String str, boolean z) {
    }

    public final void getMin(@Nullable String str, @Nullable Bundle bundle) {
    }

    public final void getMin(@Nullable String str, @Nullable String str2, boolean z) {
    }

    public final void setMax(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
    }

    public final void setMax(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z) {
    }

    public final void setMin() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ release this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(release release) {
            super(1);
            this.this$0 = release;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            String str;
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMax.dismissProgress();
            boolean z = th instanceof NetworkException;
            if (z) {
                isMainThread.getMin min = this.this$0.setMax;
                NetworkException networkException = (NetworkException) th;
                String errorCode = networkException.getErrorCode();
                String message = th.getMessage();
                int leftTimes = networkException.getLeftTimes();
                if (leftTimes == null) {
                    leftTimes = 0;
                }
                min.getMin(errorCode, message, leftTimes);
            } else {
                isMainThread.getMin min2 = this.this$0.setMax;
                Context length = this.this$0.getMin;
                if (z) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = length.getString(R.string.general_error_msg);
                }
                min2.onError(str);
            }
            StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.SWITCH_FACE_AUTHENTICATION_PREFIX);
            sb.append(this.this$0.getClass().getName());
            sb.append("onError");
            updateActionSheetContent.e(DanaLogConstants.TAG.SWITCH_FACE_AUTHENTICATION, sb.toString(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/auth/face/result/FaceAuthenticationResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<GVTitleBar, Unit> {
        final /* synthetic */ release this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(release release) {
            super(1);
            this.this$0 = release;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GVTitleBar) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GVTitleBar gVTitleBar) {
            Intrinsics.checkNotNullParameter(gVTitleBar, "it");
            this.this$0.setMax.dismissProgress();
            if (Intrinsics.areEqual((Object) "TO_ENROLL", (Object) gVTitleBar.getAction())) {
                this.this$0.setMin.execute(new getMax(this.this$0));
            } else {
                this.this$0.setMax.getMin();
            }
        }
    }

    @Inject
    public release(@NotNull Context context, @NotNull createSplashFragment createsplashfragment, @NotNull GriverCreateDialogParam griverCreateDialogParam, @NotNull Embedded embedded, @NotNull isMainThread.getMin getmin) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(createsplashfragment, "verifyFaceAuthentication");
        Intrinsics.checkNotNullParameter(griverCreateDialogParam, "getUserId");
        Intrinsics.checkNotNullParameter(embedded, "faceAuthenticationProxy");
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.getMin = context;
        this.length = createsplashfragment;
        this.setMin = griverCreateDialogParam;
        this.getMax = embedded;
        this.setMax = getmin;
    }

    public final /* synthetic */ void length(String str, String str2, String str3, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        this.setMax.showProgress();
        this.length.execute(new createSplashFragment.setMax(booleanValue, str3, str, str2), new setMax(this), new length(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/challenge/pin/PinSwitchFaceAuthPresenter$doEnroll$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "userId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ release length;

        getMax(release release) {
            this.length = release;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "userId");
            this.length.getMax.getMin(str, (inheritSuperIndices) new getMin(this.length));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.length.setMax.onError(th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"id/dana/challenge/pin/PinSwitchFaceAuthPresenter$awakeFaceQueryUAP$1", "Lid/dana/auth/face/StartFaceQueryCallback;", "onFailFaceQuery", "", "errorCode", "", "onSuccessFaceQuery", "verifyId", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements inheritSuperIndices {
        final /* synthetic */ release getMin;

        getMin(release release) {
            this.getMin = release;
        }

        public final void onSuccessFaceQuery(@Nullable String str) {
            if (str != null) {
                release.setMin(this.getMin, str);
            }
        }

        public final void onFailFaceQuery(int i) {
            this.getMin.setMax.onError(String.valueOf(i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"id/dana/challenge/pin/PinSwitchFaceAuthPresenter$awakeFaceEnrollUAP$1", "Lid/dana/auth/face/StartFaceEnrolmentCallback;", "onFailVerifyEnrolment", "", "errorCode", "", "onSuccessVerifyEnrolment", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements viewName {
        final /* synthetic */ release setMin;

        setMin(release release) {
            this.setMin = release;
        }

        public final void onSuccessVerifyEnrolment() {
            this.setMin.setMax.getMin();
        }

        public final void onFailVerifyEnrolment(int i) {
            this.setMin.setMax.onError(String.valueOf(i));
        }
    }

    public final void setMax() {
        this.length.dispose();
        this.setMin.dispose();
    }

    public static final /* synthetic */ void setMin(release release, String str) {
        Embedded embedded = release.getMax;
        viewName setmin = new setMin(release);
        Intrinsics.checkNotNullParameter(str, "verifyId");
        Intrinsics.checkNotNullParameter(setmin, "callback");
        embedded.length(str, new Embedded.setMax(embedded, setmin));
    }
}
