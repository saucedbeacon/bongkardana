package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/social/interactor/GetMyFeeds;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/social/model/SocialFeed;", "Lid/dana/domain/social/interactor/GetMyFeeds$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "socialMediaRepository", "Lid/dana/domain/social/SocialMediaRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/social/SocialMediaRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class DetectionTracker extends parseFailed<getScanCallbackIntent, length> {
    private final DistanceConfigFetcher socialMediaRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public DetectionTracker(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull DistanceConfigFetcher distanceConfigFetcher) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(distanceConfigFetcher, "socialMediaRepository");
        this.socialMediaRepository = distanceConfigFetcher;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> buildUseCaseObservable(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        return this.socialMediaRepository.getMyFeeds(length2.getPageSize(), length2.getMaxId(), length2.getMinId());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lid/dana/domain/social/interactor/GetMyFeeds$Params;", "", "pageSize", "", "maxId", "", "minId", "(ILjava/lang/String;Ljava/lang/String;)V", "getMaxId", "()Ljava/lang/String;", "getMinId", "getPageSize", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @Nullable
        private final String maxId;
        @Nullable
        private final String minId;
        private final int pageSize;

        public static /* synthetic */ length copy$default(length length, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = length.pageSize;
            }
            if ((i2 & 2) != 0) {
                str = length.maxId;
            }
            if ((i2 & 4) != 0) {
                str2 = length.minId;
            }
            return length.copy(i, str, str2);
        }

        public final int component1() {
            return this.pageSize;
        }

        @Nullable
        public final String component2() {
            return this.maxId;
        }

        @Nullable
        public final String component3() {
            return this.minId;
        }

        @NotNull
        public final length copy(int i, @Nullable String str, @Nullable String str2) {
            return new length(i, str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof length)) {
                return false;
            }
            length length = (length) obj;
            return this.pageSize == length.pageSize && Intrinsics.areEqual((Object) this.maxId, (Object) length.maxId) && Intrinsics.areEqual((Object) this.minId, (Object) length.minId);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(pageSize=");
            sb.append(this.pageSize);
            sb.append(", maxId=");
            sb.append(this.maxId);
            sb.append(", minId=");
            sb.append(this.minId);
            sb.append(")");
            return sb.toString();
        }

        public length(int i, @Nullable String str, @Nullable String str2) {
            this.pageSize = i;
            this.maxId = str;
            this.minId = str2;
        }

        @Nullable
        public final String getMaxId() {
            return this.maxId;
        }

        @Nullable
        public final String getMinId() {
            return this.minId;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final int hashCode() {
            int hashCode = Integer.valueOf(this.pageSize).hashCode() * 31;
            String str = this.maxId;
            int i = 0;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.minId;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }
    }
}
