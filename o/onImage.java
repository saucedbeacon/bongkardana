package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RenderLoadingStatusChangePoint;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/globalsearch/interactor/SetHintSwipeVisibilityState;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/globalsearch/interactor/SetHintSwipeVisibilityState$Params;", "globalSearchRepository", "Lid/dana/domain/globalsearch/GlobalSearchRepository;", "(Lid/dana/domain/globalsearch/GlobalSearchRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class onImage extends APWebChromeClient<Boolean, length> {
    private final RenderLoadingStatusChangePoint.LoadingStatusChangeListener globalSearchRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public onImage(@NotNull RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(loadingStatusChangeListener, "globalSearchRepository");
        this.globalSearchRepository = loadingStatusChangeListener;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        return this.globalSearchRepository.setHintSwipeVisibilityState(length2.isVisible());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/domain/globalsearch/interactor/SetHintSwipeVisibilityState$Params;", "", "isVisible", "", "(Z)V", "()Z", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private final boolean isVisible;

        public length(boolean z) {
            this.isVisible = z;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }
    }
}
