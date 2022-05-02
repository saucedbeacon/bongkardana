package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/social/interactor/DeleteReaction;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/social/model/DeleteReactionResult;", "Lid/dana/domain/social/interactor/DeleteReaction$Params;", "socialGeneralRepository", "Lid/dana/domain/social/SocialGeneralRepository;", "(Lid/dana/domain/social/SocialGeneralRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class AbstractAndroidLogger extends APWebChromeClient<RunningAverageRssiFilter, getMin> {
    private final getResponseCode socialGeneralRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public AbstractAndroidLogger(@NotNull getResponseCode getresponsecode) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getresponsecode, "socialGeneralRepository");
        this.socialGeneralRepository = getresponsecode;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<RunningAverageRssiFilter> buildUseCase(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        return this.socialGeneralRepository.deleteActivityReaction(getmin.getReactionId(), getmin.getActivityId());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/domain/social/interactor/DeleteReaction$Params;", "", "reactionId", "", "activityId", "(Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getReactionId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        private final String activityId;
        @NotNull
        private final String reactionId;

        public static /* synthetic */ getMin copy$default(getMin getmin, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmin.reactionId;
            }
            if ((i & 2) != 0) {
                str2 = getmin.activityId;
            }
            return getmin.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.reactionId;
        }

        @NotNull
        public final String component2() {
            return this.activityId;
        }

        @NotNull
        public final getMin copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_REACTION_ID);
            Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            return new getMin(str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return Intrinsics.areEqual((Object) this.reactionId, (Object) getmin.reactionId) && Intrinsics.areEqual((Object) this.activityId, (Object) getmin.activityId);
        }

        public final int hashCode() {
            String str = this.reactionId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.activityId;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(reactionId=");
            sb.append(this.reactionId);
            sb.append(", activityId=");
            sb.append(this.activityId);
            sb.append(")");
            return sb.toString();
        }

        public getMin(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_REACTION_ID);
            Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            this.reactionId = str;
            this.activityId = str2;
        }

        @NotNull
        public final String getReactionId() {
            return this.reactionId;
        }

        @NotNull
        public final String getActivityId() {
            return this.activityId;
        }
    }
}
