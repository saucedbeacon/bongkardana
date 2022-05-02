package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.danah5.bioutility.BioUtilityBridge;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.tracker.mixpanel.ChallengeEvent;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.endTransaction;
import o.forceFlush;
import o.setOutFilePathProxy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 *2\u00020\u0001:\u0001*B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002J0\u0010 \u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\u00132\b\u0010!\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0016J \u0010\"\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0013H\u0016J\b\u0010$\u001a\u00020\u0017H\u0016J\b\u0010\n\u001a\u00020\u0017H\u0016J&\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010\u00132\b\u0010'\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010(\u001a\u00020\u0017H\u0016J\b\u0010)\u001a\u00020\u0017H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lid/dana/challenge/otp/OtpTwilioPresenter;", "Lid/dana/challenge/otp/AbstractOtpContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/challenge/otp/AbstractOtpContract$View;", "sendOtp", "Lid/dana/domain/otp/interactor/SendOtp;", "twilioVerifySecurityProduct", "Lid/dana/domain/twilio/interactor/TwilioVerifySecurityProduct;", "receiveOtp", "Lid/dana/domain/otp/interactor/ReceiveOtp;", "(Landroid/content/Context;Lid/dana/challenge/otp/AbstractOtpContract$View;Lid/dana/domain/otp/interactor/SendOtp;Lid/dana/domain/twilio/interactor/TwilioVerifySecurityProduct;Lid/dana/domain/otp/interactor/ReceiveOtp;)V", "otpInput", "", "otpNumberOfRequest", "", "receiveOtpObserver", "Lid/dana/domain/DefaultObserver;", "", "trackOtpModel", "Lid/dana/tracker/model/TrackOtpModel;", "checkIsWhatsAppFeatureEnable", "", "convertParamToTwilioVerify", "Lid/dana/domain/twilio/model/TwilioVerify;", "securityId", "verificationMethod", "validateData", "sendOtpStrategy", "firstInput", "getReceiveOtpObserver", "input", "loginType", "inputOtpRisk", "phoneNumber", "onDestroy", "send", "sendStrategy", "serviceCode", "sendViaWhatsApp", "unsubscribeObserver", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class lambda$beginTransaction$0 implements endTransaction.setMax {
    @NotNull
    public static final setMin getMax = new setMin((byte) 0);
    private final PermissionUtils IsOverlapping;
    private final setOutFilePathProxy equals;
    /* access modifiers changed from: private */
    public boolean getMin;
    private GriverAppVirtualHostProxy<String> length;
    /* access modifiers changed from: private */
    public int setMax = 1;
    /* access modifiers changed from: private */
    public AUBubbleView setMin;
    private final forceFlush toFloatRange;
    /* access modifiers changed from: private */
    public final endTransaction.length toIntRange;

    public final void getMin(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "otpInput");
        Intrinsics.checkNotNullParameter(str2, BioUtilityBridge.SECURITY_ID);
        Intrinsics.checkNotNullParameter(str3, "phoneNumber");
    }

    @Inject
    public lambda$beginTransaction$0(@NotNull Context context, @NotNull endTransaction.length length2, @NotNull setOutFilePathProxy setoutfilepathproxy, @NotNull forceFlush forceflush, @NotNull PermissionUtils permissionUtils) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(setoutfilepathproxy, "sendOtp");
        Intrinsics.checkNotNullParameter(forceflush, "twilioVerifySecurityProduct");
        Intrinsics.checkNotNullParameter(permissionUtils, "receiveOtp");
        this.toIntRange = length2;
        this.equals = setoutfilepathproxy;
        this.toFloatRange = forceflush;
        this.IsOverlapping = permissionUtils;
        this.setMin = new AUBubbleView(context, "");
    }

    public final void getMax() {
        if (!this.getMin) {
            this.getMin = true;
            AUBubbleView aUBubbleView = this.setMin;
            convertDipToPx min = aUBubbleView != null ? aUBubbleView.setMin() : null;
            if (min != null) {
                List length2 = min.length != null ? min.length.length : new ArrayList();
                genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/challenge/otp/OtpTwilioPresenter$input$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/twilio/model/VerifySecurityInfo;", "onError", "", "e", "", "onNext", "verifySecurityInfo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverAppVirtualHostProxy<getConnectedBluetoothDevices> {
        final /* synthetic */ lambda$beginTransaction$0 getMax;

        getMin(lambda$beginTransaction$0 lambda_begintransaction_0) {
            this.getMax = lambda_begintransaction_0;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getConnectedBluetoothDevices getconnectedbluetoothdevices = (getConnectedBluetoothDevices) obj;
            Intrinsics.checkNotNullParameter(getconnectedbluetoothdevices, "verifySecurityInfo");
            this.getMax.toIntRange.dismissProgress();
            if (getconnectedbluetoothdevices.getSuccess()) {
                this.getMax.toIntRange.getMin();
            } else {
                StringBuilder sb = new StringBuilder("[OtpTwilio] input OTP error: errorCode = ");
                sb.append(getconnectedbluetoothdevices.getErrorCode());
                sb.append(", errorMessage = ");
                sb.append(getconnectedbluetoothdevices.getErrorMessage());
                setStateOff.getMax(DanaLogConstants.TAG.TWILIO_OTP_TAG, sb.toString());
            }
            AUBubbleView length = this.getMax.setMin;
            genTextSelector.getMax(length != null ? length.setMax(getconnectedbluetoothdevices.getSuccess(), getconnectedbluetoothdevices.getIdentFailedCount(), this.getMax.setMax) : null);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.getMax.toIntRange.dismissProgress();
            if (th instanceof NetworkException) {
                endTransaction.length min = this.getMax.toIntRange;
                NetworkException networkException = (NetworkException) th;
                String errorCode = networkException.getErrorCode();
                String message = th.getMessage();
                Integer leftTimes = networkException.getLeftTimes();
                Intrinsics.checkNotNullExpressionValue(leftTimes, "e.leftTimes");
                min.length(errorCode, message, leftTimes.intValue(), (String) null);
                return;
            }
            this.getMax.toIntRange.onError(th.getMessage());
            setStateOff.length(DanaLogConstants.TAG.TWILIO_OTP_TAG, "[OtpTwilio] input OTP  error: ".concat(String.valueOf(th)), th);
        }
    }

    public final void length(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.toIntRange.showProgress();
        forceFlush forceflush = this.toFloatRange;
        setGlobalUserData getmin = new getMin(this);
        if (str3 == null) {
            str3 = "";
        }
        if (str == null) {
            str = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        forceflush.execute(getmin, new forceFlush.setMax(new getBluetoothDevices(str3, "OTP_SMS", str, str4)));
    }

    public final void setMax(@Nullable String str, @Nullable String str2) {
        this.toIntRange.showProgress();
        AUBubbleView aUBubbleView = this.setMin;
        convertDipToPx min = aUBubbleView != null ? aUBubbleView.setMin(ChallengeEvent.Channel.SMS) : null;
        if (min != null) {
            List length2 = min.length != null ? min.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        }
        this.setMax++;
        this.equals.execute(new setMax(this), setOutFilePathProxy.getMax.forSendOtp(str, str2));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/challenge/otp/OtpTwilioPresenter$send$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/otp/model/SendOtpResponse;", "onError", "", "e", "", "onNext", "sendOtpResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<positivePermissionsResult> {
        final /* synthetic */ lambda$beginTransaction$0 length;

        setMax(lambda$beginTransaction$0 lambda_begintransaction_0) {
            this.length = lambda_begintransaction_0;
        }

        public final /* synthetic */ void onNext(Object obj) {
            positivePermissionsResult positivepermissionsresult = (positivePermissionsResult) obj;
            Intrinsics.checkNotNullParameter(positivepermissionsresult, "sendOtpResponse");
            this.length.toIntRange.dismissProgress();
            if (positivepermissionsresult.isSuccess()) {
                this.length.getMin = false;
                endTransaction.length min = this.length.toIntRange;
                positivepermissionsresult.getExpirySeconds();
                min.getMin(positivepermissionsresult.getRetrySendSeconds(), positivepermissionsresult.getOtpCodeLength());
                return;
            }
            StringBuilder sb = new StringBuilder("[OtpTwilio] send OTP error: errorCode = ");
            sb.append(positivepermissionsresult.getErrorCode());
            sb.append(", errorMessage = ");
            sb.append(positivepermissionsresult.getErrorMessage());
            setStateOff.getMax(DanaLogConstants.TAG.TWILIO_OTP_TAG, sb.toString());
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.length.toIntRange.dismissProgress();
            if (th instanceof NetworkException) {
                endTransaction.length min = this.length.toIntRange;
                NetworkException networkException = (NetworkException) th;
                String errorCode = networkException.getErrorCode();
                String message = th.getMessage();
                Integer leftTimes = networkException.getLeftTimes();
                Intrinsics.checkNotNullExpressionValue(leftTimes, "e.leftTimes");
                min.length(errorCode, message, leftTimes.intValue(), (String) null);
            } else {
                this.length.toIntRange.onError(th.getMessage());
            }
            setStateOff.length(DanaLogConstants.TAG.TWILIO_OTP_TAG, "[OtpTwilio] send OTP  error: ".concat(String.valueOf(th)), th);
        }
    }

    public final void getMin() {
        throw new UnsupportedOperationException();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/challenge/otp/OtpTwilioPresenter$getReceiveOtpObserver$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "otpCode", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ lambda$beginTransaction$0 getMax;

        length(lambda$beginTransaction$0 lambda_begintransaction_0) {
            this.getMax = lambda_begintransaction_0;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "otpCode");
            this.getMax.toIntRange.getMax(str);
        }
    }

    public final void length() {
        throw new UnsupportedOperationException();
    }

    public final void setMax() {
        this.equals.dispose();
        this.toFloatRange.dispose();
        this.IsOverlapping.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/challenge/otp/OtpTwilioPresenter$Companion;", "", "()V", "OTP_SMS", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final void setMin() {
        GriverAppVirtualHostProxy<String> griverAppVirtualHostProxy = this.length;
        if (griverAppVirtualHostProxy != null) {
            if (griverAppVirtualHostProxy != null) {
                griverAppVirtualHostProxy.dispose();
            }
            this.length = null;
        }
        PermissionUtils permissionUtils = this.IsOverlapping;
        if (this.length == null) {
            this.length = new length(this);
        }
        permissionUtils.execute(this.length);
    }
}
