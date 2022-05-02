package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lid/dana/domain/recentbank/interactor/GetMaxSavedBank;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/core/usecase/NoParams;", "repository", "Lid/dana/domain/recentrecipient/repository/RecentRecipientRepository;", "(Lid/dana/domain/recentrecipient/repository/RecentRecipientRepository;)V", "getRepository", "()Lid/dana/domain/recentrecipient/repository/RecentRecipientRepository;", "setRepository", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class packagePathForURLString extends APWebChromeClient<Integer, onReceivedIcon> {
    @NotNull
    private GriverWhiteScreenStageMonitor repository;

    @NotNull
    public final GriverWhiteScreenStageMonitor getRepository() {
        return this.repository;
    }

    public final void setRepository(@NotNull GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        Intrinsics.checkNotNullParameter(griverWhiteScreenStageMonitor, "<set-?>");
        this.repository = griverWhiteScreenStageMonitor;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public packagePathForURLString(@NotNull GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverWhiteScreenStageMonitor, "repository");
        this.repository = griverWhiteScreenStageMonitor;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> buildUseCase(@NotNull onReceivedIcon onreceivedicon) {
        Intrinsics.checkNotNullParameter(onreceivedicon, "params");
        TitleBarRightButtonView.AnonymousClass1<Integer> maxSavedBank = this.repository.getMaxSavedBank();
        Intrinsics.checkNotNullExpressionValue(maxSavedBank, "repository.maxSavedBank");
        return maxSavedBank;
    }
}
