package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0002\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/twilio/interactor/GetTwilioDialogDismissCount;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/twilio/model/TwilioDialogParam;", "", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "twilioDialogRepository", "Lid/dana/domain/twilio/TwilioDialogRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/twilio/TwilioDialogRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "(Lkotlin/Unit;)Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class UrlBeaconUrlCompressor extends parseFailed<openBluetoothAdapter, Unit> {
    private final clearDetections twilioDialogRepository;

    public final class TLDMapEntry implements getAdapterPosition<UrlBeaconUrlCompressor> {
        private final b.C0007b<getScheme> postExecutionThreadProvider;
        private final b.C0007b<appxLoadFailed> threadExecutorProvider;
        private final b.C0007b<clearDetections> twilioDialogRepositoryProvider;

        public TLDMapEntry(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<clearDetections> bVar3) {
            this.threadExecutorProvider = bVar;
            this.postExecutionThreadProvider = bVar2;
            this.twilioDialogRepositoryProvider = bVar3;
        }

        public final UrlBeaconUrlCompressor get() {
            return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.twilioDialogRepositoryProvider.get());
        }

        public static TLDMapEntry create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<clearDetections> bVar3) {
            return new TLDMapEntry(bVar, bVar2, bVar3);
        }

        public static UrlBeaconUrlCompressor newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, clearDetections cleardetections) {
            return new UrlBeaconUrlCompressor(appxloadfailed, getscheme, cleardetections);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public UrlBeaconUrlCompressor(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull clearDetections cleardetections) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(cleardetections, "twilioDialogRepository");
        this.twilioDialogRepository = cleardetections;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<openBluetoothAdapter> buildUseCaseObservable(@Nullable Unit unit) {
        return this.twilioDialogRepository.getTwilioDialogDismissCount();
    }
}
