package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/twilio/interactor/TwilioBindEnrollment;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/twilio/model/BindEnrollInfo;", "Lid/dana/domain/twilio/interactor/TwilioBindEnrollment$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "twilioRepository", "Lid/dana/domain/twilio/TwilioRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/twilio/TwilioRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getPdus extends parseFailed<getActualLength, getMax> {
    private final onBatchScanResults twilioRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getPdus(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull onBatchScanResults onbatchscanresults) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(onbatchscanresults, "twilioRepository");
        this.twilioRepository = onbatchscanresults;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getActualLength> buildUseCaseObservable(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        return this.twilioRepository.submitBindEnrollment(getmax.getTwilioBindEnroll());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/domain/twilio/interactor/TwilioBindEnrollment$Params;", "", "twilioBindEnroll", "Lid/dana/domain/twilio/model/TwilioBindEnroll;", "(Lid/dana/domain/twilio/model/TwilioBindEnroll;)V", "getTwilioBindEnroll", "()Lid/dana/domain/twilio/model/TwilioBindEnroll;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        private final registerBLEState twilioBindEnroll;

        public getMax(@NotNull registerBLEState registerblestate) {
            Intrinsics.checkNotNullParameter(registerblestate, "twilioBindEnroll");
            this.twilioBindEnroll = registerblestate;
        }

        @NotNull
        public final registerBLEState getTwilioBindEnroll() {
            return this.twilioBindEnroll;
        }
    }
}
