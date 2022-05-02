package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/domain/twilio/interactor/SaveTwilioDialogDismissCount;", "Lid/dana/domain/UseCase;", "", "Lid/dana/domain/twilio/model/TwilioDialogParam;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "twilioDialogRepository", "Lid/dana/domain/twilio/TwilioDialogRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/twilio/TwilioDialogRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class StartupBroadcastReceiver extends parseFailed<Boolean, openBluetoothAdapter> {
    private final clearDetections twilioDialogRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public StartupBroadcastReceiver(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull clearDetections cleardetections) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(cleardetections, "twilioDialogRepository");
        this.twilioDialogRepository = cleardetections;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(@NotNull openBluetoothAdapter openbluetoothadapter) {
        Intrinsics.checkNotNullParameter(openbluetoothadapter, "param");
        return this.twilioDialogRepository.saveTwilioDialogDismissCount(openbluetoothadapter.getDismissCount(), openbluetoothadapter.getDateTimestamp());
    }
}
