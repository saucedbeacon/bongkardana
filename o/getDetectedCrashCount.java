package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/twilio/interactor/TwilioConsultEnrollment;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/twilio/model/TwilioInfo;", "Lid/dana/domain/twilio/interactor/TwilioConsultEnrollment$Params;", "twilioRepository", "Lid/dana/domain/twilio/TwilioRepository;", "(Lid/dana/domain/twilio/TwilioRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getDetectedCrashCount extends APWebChromeClient<disableBluetooth, setMin> {
    private final onBatchScanResults twilioRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getDetectedCrashCount(@NotNull onBatchScanResults onbatchscanresults) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(onbatchscanresults, "twilioRepository");
        this.twilioRepository = onbatchscanresults;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<disableBluetooth> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        return this.twilioRepository.consultEnrollmentStatus(setmin.getTwilioConsult());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/domain/twilio/interactor/TwilioConsultEnrollment$Params;", "", "twilioConsult", "Lid/dana/domain/twilio/model/TwilioConsult;", "(Lid/dana/domain/twilio/model/TwilioConsult;)V", "getTwilioConsult", "()Lid/dana/domain/twilio/model/TwilioConsult;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        private final closeBluetoothAdapter twilioConsult;

        public setMin(@NotNull closeBluetoothAdapter closebluetoothadapter) {
            Intrinsics.checkNotNullParameter(closebluetoothadapter, "twilioConsult");
            this.twilioConsult = closebluetoothadapter;
        }

        @NotNull
        public final closeBluetoothAdapter getTwilioConsult() {
            return this.twilioConsult;
        }
    }
}
