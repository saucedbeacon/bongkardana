package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/domain/social/interactor/SaveFeedsSharingLastCheckedState;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "activitySharingRepository", "Lid/dana/domain/social/ActivitySharingRepository;", "(Lid/dana/domain/social/ActivitySharingRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isTracked extends APWebChromeClient<Boolean, Boolean> {
    private final setModel activitySharingRepository;

    public final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 buildUseCase(Object obj) {
        return buildUseCase(((Boolean) obj).booleanValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isTracked(@NotNull setModel setmodel) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setmodel, "activitySharingRepository");
        this.activitySharingRepository = setmodel;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(boolean z) {
        return this.activitySharingRepository.saveFeedsSharingLastCheckedState(z);
    }
}
