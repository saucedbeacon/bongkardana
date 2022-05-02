package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RunningAverageRssiFilter;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/social/interactor/GetFeedComment;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/social/model/FeedCommentResult;", "Lid/dana/domain/social/interactor/GetFeedComment$Params;", "socialMediaRepository", "Lid/dana/domain/social/SocialMediaRepository;", "(Lid/dana/domain/social/SocialMediaRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class infoLogger extends APWebChromeClient<RunningAverageRssiFilter.Measurement, setMin> {
    private final DistanceConfigFetcher socialMediaRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public infoLogger(@NotNull DistanceConfigFetcher distanceConfigFetcher) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(distanceConfigFetcher, "socialMediaRepository");
        this.socialMediaRepository = distanceConfigFetcher;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<RunningAverageRssiFilter.Measurement> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        return this.socialMediaRepository.getFeedComments(setmin.getActivityId(), setmin.getIdLastComment());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/social/interactor/GetFeedComment$Params;", "", "activityId", "", "idLastComment", "(Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getIdLastComment", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static class setMin {
        @NotNull
        private final String activityId;
        @NotNull
        private final String idLastComment;

        public setMin(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            Intrinsics.checkNotNullParameter(str2, "idLastComment");
            this.activityId = str;
            this.idLastComment = str2;
        }

        @NotNull
        public final String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ setMin(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2);
        }

        @NotNull
        public final String getIdLastComment() {
            return this.idLastComment;
        }
    }
}
