package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/domain/nearbysearch/interactor/GetNearbyTrendingKeyword;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/nearbysearch/model/NearbyTrendingKeyword;", "", "nearbySearchRepository", "Lid/dana/domain/nearbysearch/repository/NearbySearchRepository;", "(Lid/dana/domain/nearbysearch/repository/NearbySearchRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "(Lkotlin/Unit;)Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getFileMD5 extends APWebChromeClient<List<? extends isFolder>, Unit> {
    private final localIdToUrl nearbySearchRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getFileMD5(@NotNull localIdToUrl localidtourl) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(localidtourl, "nearbySearchRepository");
        this.nearbySearchRepository = localidtourl;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<isFolder>> buildUseCase(@NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "params");
        return this.nearbySearchRepository.getTrendingKeyword();
    }
}
