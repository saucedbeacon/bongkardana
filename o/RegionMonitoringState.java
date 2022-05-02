package o;

import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/social/interactor/SubmitFeedCommentReport;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/social/interactor/SubmitFeedCommentReport$Params;", "socialMediaRepository", "Lid/dana/domain/social/SocialMediaRepository;", "(Lid/dana/domain/social/SocialMediaRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class RegionMonitoringState extends APWebChromeClient<Boolean, setMax> {
    private final DistanceConfigFetcher socialMediaRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public RegionMonitoringState(@NotNull DistanceConfigFetcher distanceConfigFetcher) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(distanceConfigFetcher, "socialMediaRepository");
        this.socialMediaRepository = distanceConfigFetcher;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        return this.socialMediaRepository.submitFeedCommentReport(setmax.getCommentId(), setmax.getReason(), setmax.getActivityId());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lid/dana/domain/social/interactor/SubmitFeedCommentReport$Params;", "", "commentId", "", "reason", "activityId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getCommentId", "getReason", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        private final String activityId;
        @NotNull
        private final String commentId;
        @NotNull
        private final String reason;

        public setMax(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "commentId");
            Intrinsics.checkNotNullParameter(str2, ZdocRecordService.REASON);
            Intrinsics.checkNotNullParameter(str3, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            this.commentId = str;
            this.reason = str2;
            this.activityId = str3;
        }

        @NotNull
        public final String getCommentId() {
            return this.commentId;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        @NotNull
        public final String getActivityId() {
            return this.activityId;
        }
    }
}
