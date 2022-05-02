package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/domain/deeplink/interactor/RemoveDeepLinkPayload;", "Lid/dana/domain/SynchronizedUseCase;", "", "", "deepLinkRepository", "Lid/dana/domain/deeplink/repository/DeepLinkRepository;", "(Lid/dana/domain/deeplink/repository/DeepLinkRepository;)V", "buildUseCaseObservable", "params", "(Lkotlin/Unit;)Ljava/lang/Boolean;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setWebMessageCallback extends GriverAppxLoadFailedPoint<Boolean, Unit> {
    private final setSupportZoom deepLinkRepository;

    @Inject
    public setWebMessageCallback(@NotNull setSupportZoom setsupportzoom) {
        Intrinsics.checkNotNullParameter(setsupportzoom, "deepLinkRepository");
        this.deepLinkRepository = setsupportzoom;
    }

    @NotNull
    public final Boolean buildUseCaseObservable(@Nullable Unit unit) {
        return Boolean.valueOf(this.deepLinkRepository.removeDeeplinkPayload());
    }
}
