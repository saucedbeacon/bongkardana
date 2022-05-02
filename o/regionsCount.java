package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0002\u0010\u000fR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/domain/social/interactor/GetReportReasonsConfig;", "Lid/dana/domain/UseCase;", "", "Lid/dana/domain/social/model/ReportReasons;", "", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "socialMediaRepository", "Lid/dana/domain/social/SocialMediaRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/social/SocialMediaRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "(Lkotlin/Unit;)Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class regionsCount extends parseFailed<List<setSimulatedScanData>, Unit> {
    private final DistanceConfigFetcher socialMediaRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public regionsCount(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull DistanceConfigFetcher distanceConfigFetcher) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(distanceConfigFetcher, "socialMediaRepository");
        this.socialMediaRepository = distanceConfigFetcher;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<setSimulatedScanData>> buildUseCaseObservable(@Nullable Unit unit) {
        return this.socialMediaRepository.getReportReasonsConfig();
    }
}
