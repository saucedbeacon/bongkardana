package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Lid/dana/domain/twilio/TwilioRepository;", "", "consultEnrollmentStatus", "Lio/reactivex/Observable;", "Lid/dana/domain/twilio/model/TwilioInfo;", "twilioConsult", "Lid/dana/domain/twilio/model/TwilioConsult;", "requestChallenge", "Lid/dana/domain/twilio/model/RequestChallengeInfo;", "twilioChallenge", "Lid/dana/domain/twilio/model/TwilioChallenge;", "submitBindEnrollment", "Lid/dana/domain/twilio/model/BindEnrollInfo;", "twilioBindEnroll", "Lid/dana/domain/twilio/model/TwilioBindEnroll;", "submitDerollment", "Lid/dana/domain/twilio/model/DerollInfo;", "twilioDeroll", "Lid/dana/domain/twilio/model/TwilioDeroll;", "submitEnrollment", "Lid/dana/domain/twilio/model/EnrollInfo;", "twilioEnroll", "Lid/dana/domain/twilio/model/TwilioEnroll;", "verifySecurityProduct", "Lid/dana/domain/twilio/model/VerifySecurityInfo;", "twilioVerify", "Lid/dana/domain/twilio/model/TwilioVerify;", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface onBatchScanResults {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<disableBluetooth> consultEnrollmentStatus(@NotNull closeBluetoothAdapter closebluetoothadapter);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<setBetterBleListener> requestChallenge(@NotNull BLEManager bLEManager);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getActualLength> submitBindEnrollment(@NotNull registerBLEState registerblestate);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getEndIndex> submitDerollment(@NotNull isOpened isopened);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<enableBluetooth> submitEnrollment(@NotNull isDiscovering isdiscovering);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getConnectedBluetoothDevices> verifySecurityProduct(@NotNull getBluetoothDevices getbluetoothdevices);
}
