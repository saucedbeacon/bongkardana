package o;

import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RenderLoadingStatusChangePoint;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002*\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ2\u0010\n\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00050\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/domain/globalsearch/interactor/GetRecentSearch;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "Lid/dana/domain/core/usecase/NoParams;", "globalSearchRepository", "Lid/dana/domain/globalsearch/GlobalSearchRepository;", "(Lid/dana/domain/globalsearch/GlobalSearchRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class addInitSuccessListener extends APWebChromeClient<HashMap<String, Long>, onReceivedIcon> {
    private final RenderLoadingStatusChangePoint.LoadingStatusChangeListener globalSearchRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public addInitSuccessListener(@NotNull RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(loadingStatusChangeListener, "globalSearchRepository");
        this.globalSearchRepository = loadingStatusChangeListener;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<HashMap<String, Long>> buildUseCase(@NotNull onReceivedIcon onreceivedicon) {
        Intrinsics.checkNotNullParameter(onreceivedicon, "params");
        return this.globalSearchRepository.getRecentSearch();
    }
}
