package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/social/interactor/AddReactions;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/social/model/ReactionResult;", "Lid/dana/domain/social/interactor/AddReactions$Params;", "socialGeneralRepository", "Lid/dana/domain/social/SocialGeneralRepository;", "(Lid/dana/domain/social/SocialGeneralRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class doInBackground extends APWebChromeClient<createCycledLeScanner, getMax> {
    private final getResponseCode socialGeneralRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public doInBackground(@NotNull getResponseCode getresponsecode) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getresponsecode, "socialGeneralRepository");
        this.socialGeneralRepository = getresponsecode;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<createCycledLeScanner> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        return this.socialGeneralRepository.addActivityReaction(getmax.getUserId(), getmax.getActivityId(), getmax.getKind());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/domain/social/interactor/AddReactions$Params;", "", "userId", "", "activityId", "kind", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getKind", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        private final String activityId;
        @NotNull
        private final String kind;
        @Nullable
        private final String userId;

        public static /* synthetic */ getMax copy$default(getMax getmax, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmax.userId;
            }
            if ((i & 2) != 0) {
                str2 = getmax.activityId;
            }
            if ((i & 4) != 0) {
                str3 = getmax.kind;
            }
            return getmax.copy(str, str2, str3);
        }

        @Nullable
        public final String component1() {
            return this.userId;
        }

        @NotNull
        public final String component2() {
            return this.activityId;
        }

        @NotNull
        public final String component3() {
            return this.kind;
        }

        @NotNull
        public final getMax copy(@Nullable String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            Intrinsics.checkNotNullParameter(str3, "kind");
            return new getMax(str, str2, str3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMax)) {
                return false;
            }
            getMax getmax = (getMax) obj;
            return Intrinsics.areEqual((Object) this.userId, (Object) getmax.userId) && Intrinsics.areEqual((Object) this.activityId, (Object) getmax.activityId) && Intrinsics.areEqual((Object) this.kind, (Object) getmax.kind);
        }

        public final int hashCode() {
            String str = this.userId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.activityId;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.kind;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(userId=");
            sb.append(this.userId);
            sb.append(", activityId=");
            sb.append(this.activityId);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(")");
            return sb.toString();
        }

        public getMax(@Nullable String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            Intrinsics.checkNotNullParameter(str3, "kind");
            this.userId = str;
            this.activityId = str2;
            this.kind = str3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ getMax(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, str2, str3);
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getActivityId() {
            return this.activityId;
        }

        @NotNull
        public final String getKind() {
            return this.kind;
        }
    }
}
