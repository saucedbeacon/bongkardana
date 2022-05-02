package o;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.R;
import id.dana.challenge.ChallengePinWithFaceActivity;
import id.dana.challenge.LoginFailureException;
import id.dana.danah5.bioutility.BioUtilityBridge;
import id.dana.data.base.NetworkException;
import id.dana.data.tracker.TrackerDataKey;
import id.dana.di.PerActivity;
import id.dana.domain.foundation.logger.LoginScenarioConstant;
import id.dana.domain.model.rpc.response.LoginResponse;
import id.dana.tracker.mixpanel.ChallengeEvent;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.GriverMonitor;
import o.b;
import o.isMainThread;
import o.setDatabasePath;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\b\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J(\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001cH\u0016J0\u0010!\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J(\u0010$\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001cH\u0016J \u0010&\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J(\u0010'\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001aH\u0016J\u0018\u0010*\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u000eH\u0016J\u001a\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u001a2\u0006\u00100\u001a\u00020\u0014H\u0002J\u001a\u00101\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u001a2\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u001cH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lid/dana/challenge/pin/PinReloginPresenter;", "Lid/dana/challenge/pin/AbstractPinContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/challenge/pin/AbstractPinContract$View;", "reLogin", "Lid/dana/domain/login/interactor/ReLogin;", "checkKnowledgeBasedAuthFeature", "Lid/dana/domain/featureconfig/interactor/CheckKnowledgeBasedAuthFeature;", "getUserId", "Lid/dana/domain/account/interactor/GetUserId;", "(Landroid/content/Context;Lid/dana/challenge/pin/AbstractPinContract$View;Lid/dana/domain/login/interactor/ReLogin;Lid/dana/domain/featureconfig/interactor/CheckKnowledgeBasedAuthFeature;Lid/dana/domain/account/interactor/GetUserId;)V", "userId", "", "()Lkotlin/Unit;", "checkFeatureFaceLoginEnable", "checkIsAppFirstLaunch", "handleLoginError", "e", "", "handleLoginSuccess", "loginResponse", "Lid/dana/domain/model/rpc/response/LoginResponse;", "input", "inputPin", "", "withMobileData", "", "inputAutoRoute", "pubKey", "securityId", "autoRouteStatus", "inputPaymentAuth", "authType", "authStatus", "inputSwitchFaceAuth", "faceAuthNew", "inputTrustRisk", "inputTwilio", "verificationMethod", "sendOtpStrategy", "inputWithData", "data", "Landroid/os/Bundle;", "onDestroy", "trackDisplayedErrorLogin", "errorMessage", "exception", "trackNetworkErrorLogin", "displayedMessage", "networkException", "Lid/dana/data/base/NetworkException;", "trackPinCompleted", "pinSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class createNewStatement implements isMainThread.getMax {
    private final GriverCreateDialogParam getMax;
    private final GriverMonitor.AnonymousClass2 getMin;
    private final setDatabasePath length;
    private final Context setMax;
    /* access modifiers changed from: private */
    public final isMainThread.getMin setMin;

    public final void getMax(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "inputPin");
        Intrinsics.checkNotNullParameter(str2, HummerConstants.AUTH_TYPE);
        Intrinsics.checkNotNullParameter(str3, "pubKey");
        Intrinsics.checkNotNullParameter(str4, BioUtilityBridge.SECURITY_ID);
    }

    public final void getMin(@NotNull String str, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "inputPin");
        Intrinsics.checkNotNullParameter(bundle, "data");
    }

    public final void getMin(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "inputPin");
        Intrinsics.checkNotNullParameter(str2, BioUtilityBridge.SECURITY_ID);
    }

    public final void setMax(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "inputPin");
        Intrinsics.checkNotNullParameter(str2, "verificationMethod");
        Intrinsics.checkNotNullParameter(str3, BioUtilityBridge.SECURITY_ID);
        Intrinsics.checkNotNullParameter(str4, "sendOtpStrategy");
    }

    public final void setMax(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "inputPin");
        Intrinsics.checkNotNullParameter(str2, "pubKey");
        Intrinsics.checkNotNullParameter(str3, BioUtilityBridge.SECURITY_ID);
    }

    public final void setMin() {
    }

    @Inject
    public createNewStatement(@NotNull Context context, @NotNull isMainThread.getMin getmin, @NotNull GriverMonitor.AnonymousClass2 r4, @NotNull setDatabasePath setdatabasepath, @NotNull GriverCreateDialogParam griverCreateDialogParam) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(r4, LoginScenarioConstant.RELOGIN);
        Intrinsics.checkNotNullParameter(setdatabasepath, "checkKnowledgeBasedAuthFeature");
        Intrinsics.checkNotNullParameter(griverCreateDialogParam, "getUserId");
        this.setMax = context;
        this.setMin = getmin;
        this.getMin = r4;
        this.length = setdatabasepath;
        this.getMax = griverCreateDialogParam;
    }

    public final /* synthetic */ void length(String str, String str2, String str3, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "inputPin");
        Intrinsics.checkNotNullParameter(str2, "pubKey");
        Intrinsics.checkNotNullParameter(str3, BioUtilityBridge.SECURITY_ID);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/challenge/pin/PinReloginPresenter$input$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/model/rpc/response/LoginResponse;", "onError", "", "e", "", "onNext", "loginResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<LoginResponse> {
        final /* synthetic */ createNewStatement length;

        setMin(createNewStatement createnewstatement) {
            this.length = createnewstatement;
        }

        public final /* synthetic */ void onNext(Object obj) {
            LoginResponse loginResponse = (LoginResponse) obj;
            Intrinsics.checkNotNullParameter(loginResponse, ChallengePinWithFaceActivity.LOGIN_RESPONSE);
            this.length.setMin.dismissProgress();
            this.length.getMax(loginResponse.isSuccess());
            createNewStatement.length(this.length, loginResponse);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.length.setMin.dismissProgress();
            createNewStatement.setMin(this.length, th);
            LoginFailureException loginFailureException = new LoginFailureException(th);
            Intrinsics.checkNotNullParameter(loginFailureException, "$this$logToCrashlytics");
            try {
                FirebaseCrashlytics.getInstance().recordException(loginFailureException);
            } catch (Exception unused) {
            }
        }
    }

    public final void getMax(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "inputPin");
        this.setMin.showProgress();
        this.getMin.execute(new setMin(this), GriverMonitor.AnonymousClass2.setMin.forReLogin(str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/challenge/pin/PinReloginPresenter$checkKnowledgeBasedAuthFeature$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "knowledgeBasedAuthEnable", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ createNewStatement setMin;

        setMax(createNewStatement createnewstatement) {
            this.setMin = createnewstatement;
        }

        public final /* synthetic */ void onNext(Object obj) {
            this.setMin.setMin.length(((Boolean) obj).booleanValue());
        }
    }

    public final void getMax() {
        this.length.execute(new setMax(this), setDatabasePath.length.forParams("forgot_pin"));
    }

    /* access modifiers changed from: private */
    public final void getMax(boolean z) {
        convertDipToPx max = new JavaBlurProcess(this.setMax, ChallengeEvent.Source.RELOGIN).getMax(z);
        List length2 = max.length != null ? max.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/challenge/pin/PinReloginPresenter$userId$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "userId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverAppVirtualHostProxy<String> {
        getMin() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "userId");
            if (!TextUtils.isEmpty(str)) {
                AppsFlyerLib.getInstance().setCustomerUserId(str);
            }
        }
    }

    public final void setMax() {
        this.length.dispose();
        this.getMin.dispose();
        this.getMax.dispose();
    }

    public static final /* synthetic */ void length(createNewStatement createnewstatement, LoginResponse loginResponse) {
        if (loginResponse.isSuccess()) {
            List<String> verificationMethods = loginResponse.getVerificationMethods();
            if (b.AnonymousClass12.isNeedChallenge(verificationMethods)) {
                createnewstatement.setMin.setMax(verificationMethods);
                return;
            }
            createnewstatement.setMin.getMin();
            createnewstatement.getMax.execute(new getMin());
            Unit unit = Unit.INSTANCE;
            return;
        }
        createnewstatement.setMin.onError(loginResponse.getErrorMessage());
        String errorMessage = loginResponse.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "loginResponse.errorMessage");
        LoginFailureException loginFailureException = new LoginFailureException(errorMessage);
        Intrinsics.checkNotNullParameter(loginFailureException, "$this$logToCrashlytics");
        try {
            FirebaseCrashlytics.getInstance().recordException(loginFailureException);
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder("[PinReLogin] login error: errorCode = ");
        sb.append(loginResponse.getErrorCode());
        sb.append(", errorMessage = ");
        sb.append(loginResponse.getErrorMessage());
        setStateOff.getMax("DanaLogin", sb.toString());
    }

    public static final /* synthetic */ void setMin(createNewStatement createnewstatement, Throwable th) {
        String str;
        th.getClass().getName();
        setStateOff.length("DanaLogin", "[PinReLogin] login error: ".concat(String.valueOf(th)), th);
        createnewstatement.getMax(false);
        boolean z = th instanceof NetworkException;
        if (z) {
            isMainThread.getMin getmin = createnewstatement.setMin;
            NetworkException networkException = (NetworkException) th;
            String errorCode = networkException.getErrorCode();
            String message = th.getMessage();
            int leftTimes = networkException.getLeftTimes();
            if (leftTimes == null) {
                leftTimes = 0;
            }
            getmin.getMin(errorCode, message, leftTimes);
            BlurProcess.length(createnewstatement.setMax, TrackerDataKey.NetworkErrorOperationTypeProperty.LOGIN, th.getMessage(), TrackerDataKey.Source.RELOGIN, networkException);
            return;
        }
        createnewstatement.setMin.onError(th.getMessage());
        String message2 = th.getMessage();
        Context context = createnewstatement.setMax;
        if (z) {
            str = ((NetworkException) th).getMessage();
        } else {
            str = context.getString(R.string.general_error_msg);
        }
        BlurProcess.getMin(context, TrackerDataKey.NetworkErrorOperationTypeProperty.LOGIN, message2, str, TrackerDataKey.Source.RELOGIN);
    }
}
