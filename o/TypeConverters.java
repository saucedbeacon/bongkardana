package o;

import android.os.Bundle;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.forceFlush;
import o.isMainThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J.\u0010\u0016\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J8\u0010\u0019\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J5\u0010\u001c\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u001eJ$\u0010\u001f\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J0\u0010 \u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010!\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lid/dana/challenge/pin/PinTwilioPresenter;", "Lid/dana/challenge/pin/AbstractPinContract$Presenter;", "twilioVerifySecurityProduct", "Lid/dana/domain/twilio/interactor/TwilioVerifySecurityProduct;", "view", "Lid/dana/challenge/pin/AbstractPinContract$View;", "(Lid/dana/domain/twilio/interactor/TwilioVerifySecurityProduct;Lid/dana/challenge/pin/AbstractPinContract$View;)V", "checkFeatureFaceLoginEnable", "", "checkIsAppFirstLaunch", "checkKnowledgeBasedAuthFeature", "convertParamToTwilioVerify", "Lid/dana/domain/twilio/model/TwilioVerify;", "securityId", "", "verificationMethod", "validateData", "sendOtpStrategy", "input", "inputPin", "withMobileData", "", "inputAutoRoute", "pubKey", "autoRouteStatus", "inputPaymentAuth", "authType", "authStatus", "inputSwitchFaceAuth", "faceAuthNew", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "inputTrustRisk", "inputTwilio", "inputWithData", "data", "Landroid/os/Bundle;", "onDestroy", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TypeConverters implements isMainThread.getMax {
    @NotNull
    public static final setMax length = new setMax((byte) 0);
    private final forceFlush setMax;
    /* access modifiers changed from: private */
    public final isMainThread.getMin setMin;

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

    public final void length(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
    }

    public final void setMax(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z) {
    }

    public final void setMin() {
    }

    @Inject
    public TypeConverters(@NotNull forceFlush forceflush, @NotNull isMainThread.getMin getmin) {
        Intrinsics.checkNotNullParameter(forceflush, "twilioVerifySecurityProduct");
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.setMax = forceflush;
        this.setMin = getmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/challenge/pin/PinTwilioPresenter$inputTwilio$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/twilio/model/VerifySecurityInfo;", "onError", "", "e", "", "onNext", "verifySecurityInfo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverAppVirtualHostProxy<getConnectedBluetoothDevices> {
        final /* synthetic */ TypeConverters getMin;

        length(TypeConverters typeConverters) {
            this.getMin = typeConverters;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getConnectedBluetoothDevices getconnectedbluetoothdevices = (getConnectedBluetoothDevices) obj;
            Intrinsics.checkNotNullParameter(getconnectedbluetoothdevices, "verifySecurityInfo");
            this.getMin.setMin.dismissProgress();
            if (getconnectedbluetoothdevices.getSuccess()) {
                this.getMin.setMin.getMin();
                return;
            }
            this.getMin.setMin.onError(getconnectedbluetoothdevices.getErrorMessage());
            StringBuilder sb = new StringBuilder("[OtpTwilio] input OTP error: errorCode = ");
            sb.append(getconnectedbluetoothdevices.getErrorCode());
            sb.append(", errorMessage = ");
            sb.append(getconnectedbluetoothdevices.getErrorMessage());
            setStateOff.getMax(DanaLogConstants.TAG.TWILIO_PIN_TAG, sb.toString());
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.getMin.setMin.dismissProgress();
            if (th instanceof NetworkException) {
                isMainThread.getMin max = this.getMin.setMin;
                NetworkException networkException = (NetworkException) th;
                String errorCode = networkException.getErrorCode();
                String message = th.getMessage();
                int leftTimes = networkException.getLeftTimes();
                if (leftTimes == null) {
                    leftTimes = 0;
                }
                max.getMin(errorCode, message, leftTimes);
                return;
            }
            this.getMin.setMin.onError(th.getMessage());
            setStateOff.length(DanaLogConstants.TAG.TWILIO_PIN_TAG, "[OtpTwilio] input OTP  error: ".concat(String.valueOf(th)), th);
        }
    }

    public final void setMax(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.setMin.showProgress();
        forceFlush forceflush = this.setMax;
        setGlobalUserData length2 = new length(this);
        if (str3 == null) {
            str3 = "";
        }
        if (str == null) {
            str = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        forceflush.execute(length2, new forceFlush.setMax(new getBluetoothDevices(str3, "PASSWORD", str, str4)));
    }

    public final void setMax() {
        this.setMax.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/challenge/pin/PinTwilioPresenter$Companion;", "", "()V", "PASSWORD", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
