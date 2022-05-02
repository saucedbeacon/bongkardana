package o;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.R;
import id.dana.challenge.ChallengePinWithFaceActivity;
import id.dana.challenge.LoginFailureException;
import id.dana.danah5.bioutility.BioUtilityBridge;
import id.dana.data.base.NetworkException;
import id.dana.data.tracker.TrackerDataKey;
import id.dana.domain.foundation.logger.LoginScenarioConstant;
import id.dana.domain.model.rpc.UserInfo;
import id.dana.domain.model.rpc.response.LoginResponse;
import id.dana.tracker.constant.TrackerType;
import id.dana.tracker.mixpanel.ChallengeEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.GriverMonitor;
import o.ShareRecyclerAdapter;
import o.convertDipToPx;
import o.endTransaction;
import o.getTypefaceByCat;
import o.setOutFilePathProxy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0007J\b\u0010'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\u0010\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0002J0\u0010-\u001a\u00020\u001d2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00192\b\u0010.\u001a\u0004\u0018\u00010\u00192\b\u0010/\u001a\u0004\u0018\u00010\u00192\b\u00100\u001a\u0004\u0018\u00010\u0019H\u0016J \u00101\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0019H\u0016J\u0012\u00103\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u000104H\u0002J\u0010\u00105\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,H\u0002J\b\u00106\u001a\u00020\u001dH\u0016J\b\u0010\b\u001a\u00020\u001dH\u0016J&\u00107\u001a\u00020\u001d2\b\u00108\u001a\u0004\u0018\u00010\u00192\b\u00109\u001a\u0004\u0018\u00010\u00192\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010:\u001a\u00020\u001dH\u0016J\u001a\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u00192\b\u0010=\u001a\u0004\u0018\u00010\u0019H\u0007J\"\u0010>\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u00192\b\u0010?\u001a\u0004\u0018\u00010\u00192\u0006\u0010@\u001a\u00020AH\u0007J\b\u0010B\u001a\u00020\u001dH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001d8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u001eR$\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 @GX.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lid/dana/challenge/otp/OtpLoginPresenter;", "Lid/dana/challenge/otp/AbstractOtpContract$Presenter;", "view", "Lid/dana/challenge/otp/AbstractOtpContract$View;", "otpLogin", "Lid/dana/domain/login/interactor/OtpLogin;", "sendOtp", "Lid/dana/domain/otp/interactor/SendOtp;", "receiveOtp", "Lid/dana/domain/otp/interactor/ReceiveOtp;", "getUserInfo", "Lid/dana/domain/user/interactor/GetUserInfo;", "context", "Landroid/content/Context;", "deviceInformationProvider", "Lid/dana/data/config/DeviceInformationProvider;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "(Lid/dana/challenge/otp/AbstractOtpContract$View;Lid/dana/domain/login/interactor/OtpLogin;Lid/dana/domain/otp/interactor/SendOtp;Lid/dana/domain/otp/interactor/ReceiveOtp;Lid/dana/domain/user/interactor/GetUserInfo;Landroid/content/Context;Lid/dana/data/config/DeviceInformationProvider;Lid/dana/data/toggle/SplitFacade;)V", "otpInput", "", "otpNumberOfRequest", "", "receiveOtpObserver", "Lid/dana/domain/DefaultObserver;", "", "trackOtpModel", "Lid/dana/tracker/model/TrackOtpModel;", "userInfo", "", "()Lkotlin/Unit;", "<set-?>", "Lid/dana/myprofile/UserInfoMapper;", "userInfoMapper", "getUserInfoMapper", "()Lid/dana/myprofile/UserInfoMapper;", "setUserInfoMapper", "(Lid/dana/myprofile/UserInfoMapper;)V", "buildOtpLoginPresenterDependencies", "checkIsWhatsAppFeatureEnable", "firstInput", "getReceiveOtpObserver", "initMixpanelEventConfig", "loginResponse", "Lid/dana/domain/model/rpc/response/LoginResponse;", "input", "loginType", "securityId", "sendOtpStrategy", "inputOtpRisk", "phoneNumber", "isKycLevelExist", "Lid/dana/model/UserInfo;", "isLoginResponseValuesExist", "onDestroy", "send", "sendStrategy", "serviceCode", "sendViaWhatsApp", "trackDisplayedErrorLogin", "operationType", "errorMessage", "trackNetworkErrorLogin", "displayedMessage", "networkException", "Lid/dana/data/base/NetworkException;", "unsubscribeObserver", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class internalBeginTransaction implements endTransaction.setMax {
    private final sendData FastBitmap$CoordinateSystem;
    private final PermissionUtils IsOverlapping;
    /* access modifiers changed from: private */
    public int equals = 1;
    public ShareRecyclerAdapter.ShareViewHolder getMax;
    private GriverAppVirtualHostProxy<String> getMin;
    private final setOutFilePathProxy isInside;
    /* access modifiers changed from: private */
    public boolean length;
    /* access modifiers changed from: private */
    public final AUBubbleView setMax = new AUBubbleView(this.setMin, "Login");
    /* access modifiers changed from: package-private */
    public final Context setMin;
    private final GriverMonitor.AnonymousClass3 toFloatRange;
    /* access modifiers changed from: private */
    public final endTransaction.length toIntRange;
    /* access modifiers changed from: private */
    public final UpdateAppCallback toString;
    /* access modifiers changed from: private */
    public final getPerformanceTracker values;

    public final void getMin(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "otpInput");
        Intrinsics.checkNotNullParameter(str2, BioUtilityBridge.SECURITY_ID);
        Intrinsics.checkNotNullParameter(str3, "phoneNumber");
    }

    @Inject
    public internalBeginTransaction(@NotNull endTransaction.length length2, @NotNull GriverMonitor.AnonymousClass3 r3, @NotNull setOutFilePathProxy setoutfilepathproxy, @NotNull PermissionUtils permissionUtils, @NotNull sendData senddata, @NotNull Context context, @NotNull getPerformanceTracker getperformancetracker, @NotNull UpdateAppCallback updateAppCallback) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(r3, LoginScenarioConstant.OTPLOGIN);
        Intrinsics.checkNotNullParameter(setoutfilepathproxy, "sendOtp");
        Intrinsics.checkNotNullParameter(permissionUtils, "receiveOtp");
        Intrinsics.checkNotNullParameter(senddata, "getUserInfo");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getperformancetracker, "deviceInformationProvider");
        Intrinsics.checkNotNullParameter(updateAppCallback, "splitFacade");
        this.toIntRange = length2;
        this.toFloatRange = r3;
        this.isInside = setoutfilepathproxy;
        this.IsOverlapping = permissionUtils;
        this.FastBitmap$CoordinateSystem = senddata;
        this.setMin = context;
        this.values = getperformancetracker;
        this.toString = updateAppCallback;
    }

    public final void getMax() {
        if (!this.length) {
            this.length = true;
            convertDipToPx min = this.setMax.setMin();
            List length2 = min.length != null ? min.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/challenge/otp/OtpLoginPresenter$input$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/model/rpc/response/LoginResponse;", "onError", "", "e", "", "onNext", "loginResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<LoginResponse> {
        final /* synthetic */ internalBeginTransaction length;

        setMin(internalBeginTransaction internalbegintransaction) {
            this.length = internalbegintransaction;
        }

        public final /* synthetic */ void onNext(Object obj) {
            LoginResponse loginResponse = (LoginResponse) obj;
            Intrinsics.checkNotNullParameter(loginResponse, ChallengePinWithFaceActivity.LOGIN_RESPONSE);
            this.length.toIntRange.dismissProgress();
            if (loginResponse.isSuccess()) {
                this.length.toIntRange.getMin();
                this.length.FastBitmap$CoordinateSystem.execute(new getMax(this.length, loginResponse));
                Unit unused = this.length.FastBitmap$CoordinateSystem.execute(new getMin(this.length));
            } else {
                String errorMessage = loginResponse.getErrorMessage();
                Intrinsics.checkNotNullExpressionValue(errorMessage, "loginResponse.errorMessage");
                LoginFailureException loginFailureException = new LoginFailureException(errorMessage);
                Intrinsics.checkNotNullParameter(loginFailureException, "$this$logToCrashlytics");
                try {
                    FirebaseCrashlytics.getInstance().recordException(loginFailureException);
                } catch (Exception unused2) {
                }
                StringBuilder sb = new StringBuilder("[OtpLogin] login error: errorCode = ");
                sb.append(loginResponse.getErrorCode());
                sb.append(", errorMessage = ");
                sb.append(loginResponse.getErrorMessage());
                setStateOff.getMax("DanaLogin", sb.toString());
            }
            AUBubbleView min = this.length.setMax;
            boolean isSuccess = loginResponse.isSuccess();
            Integer failedCount = loginResponse.getFailedCount();
            Intrinsics.checkNotNullExpressionValue(failedCount, "loginResponse.failedCount");
            genTextSelector.getMax(min.setMax(isSuccess, failedCount.intValue(), this.length.equals));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.length.toIntRange.dismissProgress();
            LoginFailureException loginFailureException = new LoginFailureException(th);
            Intrinsics.checkNotNullParameter(loginFailureException, "$this$logToCrashlytics");
            try {
                FirebaseCrashlytics.getInstance().recordException(loginFailureException);
            } catch (Exception unused) {
            }
            setStateOff.length("DanaLogin", "[OtpLogin] login error: ".concat(String.valueOf(th)), th);
            if (th instanceof NetworkException) {
                endTransaction.length max = this.length.toIntRange;
                NetworkException networkException = (NetworkException) th;
                String errorCode = networkException.getErrorCode();
                String message = th.getMessage();
                Integer leftTimes = networkException.getLeftTimes();
                Intrinsics.checkNotNullExpressionValue(leftTimes, "e.leftTimes");
                max.length(errorCode, message, leftTimes.intValue(), TrackerDataKey.NetworkErrorOperationTypeProperty.LOGIN);
                internalBeginTransaction internalbegintransaction = this.length;
                String message2 = th.getMessage();
                Intrinsics.checkNotNullParameter(TrackerDataKey.NetworkErrorOperationTypeProperty.LOGIN, "operationType");
                Intrinsics.checkNotNullParameter(networkException, "networkException");
                BlurProcess.length(internalbegintransaction.setMin, TrackerDataKey.NetworkErrorOperationTypeProperty.LOGIN, message2, "Login", networkException);
                return;
            }
            this.length.toIntRange.onError(th.getMessage());
            internalBeginTransaction internalbegintransaction2 = this.length;
            String message3 = th.getMessage();
            Intrinsics.checkNotNullParameter(TrackerDataKey.NetworkErrorOperationTypeProperty.LOGIN, "operationType");
            BlurProcess.getMin(internalbegintransaction2.setMin, TrackerDataKey.NetworkErrorOperationTypeProperty.LOGIN, message3, internalbegintransaction2.setMin.getString(R.string.challenge_error), "Login");
        }
    }

    public final void length(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.toIntRange.showProgress();
        this.toFloatRange.execute(new setMin(this), GriverMonitor.AnonymousClass3.setMin.forOtpLogin(str, str2));
    }

    public final void setMax(@Nullable String str, @Nullable String str2) {
        this.toIntRange.showProgress();
        convertDipToPx min = this.setMax.setMin(ChallengeEvent.Channel.SMS);
        List length2 = min.length != null ? min.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        this.equals++;
        this.isInside.execute(new setMax(this), setOutFilePathProxy.getMax.forSendOtp(str, str2));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/challenge/otp/OtpLoginPresenter$send$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/otp/model/SendOtpResponse;", "onError", "", "e", "", "onNext", "sendOtpResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<positivePermissionsResult> {
        final /* synthetic */ internalBeginTransaction getMax;

        setMax(internalBeginTransaction internalbegintransaction) {
            this.getMax = internalbegintransaction;
        }

        public final /* synthetic */ void onNext(Object obj) {
            positivePermissionsResult positivepermissionsresult = (positivePermissionsResult) obj;
            Intrinsics.checkNotNullParameter(positivepermissionsresult, "sendOtpResponse");
            this.getMax.toIntRange.dismissProgress();
            if (positivepermissionsresult.isSuccess()) {
                this.getMax.length = false;
                endTransaction.length max = this.getMax.toIntRange;
                positivepermissionsresult.getExpirySeconds();
                max.getMin(positivepermissionsresult.getRetrySendSeconds(), positivepermissionsresult.getOtpCodeLength());
                return;
            }
            StringBuilder sb = new StringBuilder("[OtpLogin]  send OTP error: errorCode = ");
            sb.append(positivepermissionsresult.getErrorCode());
            sb.append(", errorMessage = ");
            sb.append(positivepermissionsresult.getErrorMessage());
            setStateOff.getMax("DanaLogin", sb.toString());
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.getMax.toIntRange.dismissProgress();
            if (th instanceof NetworkException) {
                endTransaction.length max = this.getMax.toIntRange;
                NetworkException networkException = (NetworkException) th;
                String errorCode = networkException.getErrorCode();
                String message = th.getMessage();
                Integer leftTimes = networkException.getLeftTimes();
                Intrinsics.checkNotNullExpressionValue(leftTimes, "e.leftTimes");
                max.length(errorCode, message, leftTimes.intValue(), TrackerDataKey.NetworkErrorOperationTypeProperty.SEND_OTP);
                internalBeginTransaction internalbegintransaction = this.getMax;
                String message2 = th.getMessage();
                Intrinsics.checkNotNullParameter(TrackerDataKey.NetworkErrorOperationTypeProperty.SEND_OTP, "operationType");
                Intrinsics.checkNotNullParameter(networkException, "networkException");
                BlurProcess.length(internalbegintransaction.setMin, TrackerDataKey.NetworkErrorOperationTypeProperty.SEND_OTP, message2, "Login", networkException);
            } else {
                this.getMax.toIntRange.onError(th.getMessage());
                internalBeginTransaction internalbegintransaction2 = this.getMax;
                String message3 = th.getMessage();
                Intrinsics.checkNotNullParameter(TrackerDataKey.NetworkErrorOperationTypeProperty.SEND_OTP, "operationType");
                BlurProcess.getMin(internalbegintransaction2.setMin, TrackerDataKey.NetworkErrorOperationTypeProperty.SEND_OTP, message3, internalbegintransaction2.setMin.getString(R.string.challenge_error), "Login");
            }
            setStateOff.length("DanaLogin", "[OtpLogin]  send OTP  error: ".concat(String.valueOf(th)), th);
        }
    }

    public final void getMin() {
        throw new UnsupportedOperationException();
    }

    public final void length() {
        throw new UnsupportedOperationException();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/challenge/otp/OtpLoginPresenter$initMixpanelEventConfig$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/user/UserInfoResponse;", "onNext", "", "userInfoResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<disconnect> {
        final /* synthetic */ internalBeginTransaction getMax;
        final /* synthetic */ LoginResponse getMin;

        getMax(internalBeginTransaction internalbegintransaction, LoginResponse loginResponse) {
            this.getMax = internalbegintransaction;
            this.getMin = loginResponse;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str;
            disconnect disconnect = (disconnect) obj;
            Intrinsics.checkNotNullParameter(disconnect, "userInfoResponse");
            ShareRecyclerAdapter.ShareViewHolder shareViewHolder = this.getMax.getMax;
            if (shareViewHolder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userInfoMapper");
            }
            getPagePerfKey min = shareViewHolder.setMin(disconnect);
            getTypefaceByCat.setMin setmin = new getTypefaceByCat.setMin();
            setmin.getMax = this.getMax.setMin;
            setmin.equals = BlurProcess.length();
            if (internalBeginTransaction.setMax(this.getMin)) {
                UserInfo userInfo = this.getMin.getUserInfo();
                Intrinsics.checkNotNullExpressionValue(userInfo, "loginResponse.userInfo");
                setmin.setMin = userInfo.getUserId();
            }
            if (internalBeginTransaction.length(min)) {
                activityGetScreenOrientation activitygetscreenorientation = min.setMax;
                if (activitygetscreenorientation != null) {
                    str = activitygetscreenorientation.getMax;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                setmin.setMin(str);
            }
            judgeRes.setMin(new getTypefaceByCat(setmin, (byte) 0), TrackerType.MIXPANEL, this.getMax.values).length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/challenge/otp/OtpLoginPresenter$getReceiveOtpObserver$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "otpCode", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ internalBeginTransaction setMin;

        length(internalBeginTransaction internalbegintransaction) {
            this.setMin = internalbegintransaction;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "otpCode");
            this.setMin.toIntRange.getMax(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/challenge/otp/OtpLoginPresenter$userInfo$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/user/UserInfoResponse;", "onNext", "", "userInfoResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverAppVirtualHostProxy<disconnect> {
        final /* synthetic */ internalBeginTransaction length;

        getMin(internalBeginTransaction internalbegintransaction) {
            this.length = internalbegintransaction;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str;
            activityGetScreenOrientation activitygetscreenorientation;
            disconnect disconnect = (disconnect) obj;
            Intrinsics.checkNotNullParameter(disconnect, "userInfoResponse");
            ShareRecyclerAdapter.ShareViewHolder shareViewHolder = this.length.getMax;
            if (shareViewHolder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userInfoMapper");
            }
            getPagePerfKey min = shareViewHolder.setMin(disconnect);
            Map hashMap = new HashMap();
            UserInfoManager instance = UserInfoManager.instance();
            Intrinsics.checkNotNullExpressionValue(instance, "UserInfoManager.instance()");
            String userId = instance.getUserId();
            if (userId == null) {
                userId = "";
            }
            hashMap.put("$user_id", userId);
            hashMap.put("Login Type", "Normal");
            if (internalBeginTransaction.length(min)) {
                if (min == null || (activitygetscreenorientation = min.setMax) == null) {
                    str = null;
                } else {
                    str = activitygetscreenorientation.getMax;
                }
                Intrinsics.checkNotNull(str);
                hashMap.put("KYC Level", str);
            }
            convertDipToPx.length length2 = new convertDipToPx.length(this.length.setMin);
            length2.getMax = "Login";
            convertDipToPx.length length3 = length2.setMax("Login Challenge", "OTP SMS").length((Map<String, String>) hashMap);
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            if (ScreenBrightnessBridgeExtension.Grayscale$Algorithm().length() > 0) {
                ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
                length3.setMax("Merchant Name", ScreenBrightnessBridgeExtension.Grayscale$Algorithm());
            } else {
                length3.setMax("Merchant Name", this.length.setMin.getString(R.string.dana_string));
            }
            length3.setMin();
            genTextSelector.getMax(new convertDipToPx(length3, (byte) 0));
            UpdateAppCallback unused = this.length.toString;
            UpdateAppCallback.getMin("login_challenge_type", "OTP SMS");
        }
    }

    /* access modifiers changed from: private */
    public static boolean setMax(LoginResponse loginResponse) {
        if (loginResponse.getUserInfo() == null) {
            return false;
        }
        UserInfo userInfo = loginResponse.getUserInfo();
        Intrinsics.checkNotNullExpressionValue(userInfo, "loginResponse.userInfo");
        if (TextUtils.isEmpty(userInfo.getUserId())) {
            return false;
        }
        UserInfo userInfo2 = loginResponse.getUserInfo();
        Intrinsics.checkNotNullExpressionValue(userInfo2, "loginResponse.userInfo");
        return !TextUtils.isEmpty(userInfo2.getNickname());
    }

    public final void setMax() {
        this.toFloatRange.dispose();
        this.isInside.dispose();
        this.IsOverlapping.dispose();
        this.FastBitmap$CoordinateSystem.dispose();
    }

    public final void setMin() {
        GriverAppVirtualHostProxy<String> griverAppVirtualHostProxy = this.getMin;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
        }
        this.getMin = null;
        PermissionUtils permissionUtils = this.IsOverlapping;
        if (0 == 0) {
            this.getMin = new length(this);
        }
        permissionUtils.execute(this.getMin);
    }

    /* access modifiers changed from: private */
    public static boolean length(getPagePerfKey getpageperfkey) {
        String str;
        activityGetScreenOrientation activitygetscreenorientation;
        if (getpageperfkey == null || (activitygetscreenorientation = getpageperfkey.setMax) == null) {
            str = null;
        } else {
            str = activitygetscreenorientation.getMax;
        }
        CharSequence charSequence = str;
        return !(charSequence == null || charSequence.length() == 0);
    }
}
