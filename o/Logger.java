package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/social/interactor/GetActivityReactions;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/social/model/ActivityReactions;", "Lid/dana/domain/social/interactor/GetActivityReactions$Params;", "activityReactionsRepository", "Lid/dana/domain/social/ActivityReactionsRepository;", "(Lid/dana/domain/social/ActivityReactionsRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class Logger extends APWebChromeClient<markInside, setMin> {
    private final requestBeaconData activityReactionsRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public Logger(@NotNull requestBeaconData requestbeacondata) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(requestbeacondata, "activityReactionsRepository");
        this.activityReactionsRepository = requestbeacondata;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<markInside> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        return this.activityReactionsRepository.getActivityReactions(setmin.getActivityId(), setmin.getKind(), setmin.getMaxId());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/domain/social/interactor/GetActivityReactions$Params;", "", "activityId", "", "kind", "maxId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getKind", "getMaxId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        private final String activityId;
        @NotNull
        private final String kind;
        @NotNull
        private final String maxId;

        public static /* synthetic */ setMin copy$default(setMin setmin, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setmin.activityId;
            }
            if ((i & 2) != 0) {
                str2 = setmin.kind;
            }
            if ((i & 4) != 0) {
                str3 = setmin.maxId;
            }
            return setmin.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.activityId;
        }

        @NotNull
        public final String component2() {
            return this.kind;
        }

        @NotNull
        public final String component3() {
            return this.maxId;
        }

        @NotNull
        public final setMin copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            Intrinsics.checkNotNullParameter(str2, "kind");
            Intrinsics.checkNotNullParameter(str3, "maxId");
            return new setMin(str, str2, str3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMin)) {
                return false;
            }
            setMin setmin = (setMin) obj;
            return Intrinsics.areEqual((Object) this.activityId, (Object) setmin.activityId) && Intrinsics.areEqual((Object) this.kind, (Object) setmin.kind) && Intrinsics.areEqual((Object) this.maxId, (Object) setmin.maxId);
        }

        public final int hashCode() {
            String str = this.activityId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.kind;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.maxId;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(activityId=");
            sb.append(this.activityId);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", maxId=");
            sb.append(this.maxId);
            sb.append(")");
            return sb.toString();
        }

        public setMin(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            Intrinsics.checkNotNullParameter(str2, "kind");
            Intrinsics.checkNotNullParameter(str3, "maxId");
            this.activityId = str;
            this.kind = str2;
            this.maxId = str3;
        }

        @NotNull
        public final String getActivityId() {
            return this.activityId;
        }

        @NotNull
        public final String getKind() {
            return this.kind;
        }

        @NotNull
        public final String getMaxId() {
            return this.maxId;
        }
    }
}
