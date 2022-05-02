package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB#\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/social/interactor/GetFriendTimeline;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/social/model/SocialFeed;", "Lid/dana/domain/social/interactor/GetFriendTimeline$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "socialMediaRepository", "Lid/dana/domain/social/SocialMediaRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/social/SocialMediaRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class reloadParsers extends parseFailed<getScanCallbackIntent, getMax> {
    private final DistanceConfigFetcher socialMediaRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public reloadParsers(@Nullable appxLoadFailed appxloadfailed, @Nullable getScheme getscheme, @NotNull DistanceConfigFetcher distanceConfigFetcher) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(distanceConfigFetcher, "socialMediaRepository");
        this.socialMediaRepository = distanceConfigFetcher;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> buildUseCaseObservable(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        return this.socialMediaRepository.getFeeds(getmax.getUserId(), getmax.getPageSize(), getmax.getMaxId(), getmax.getMinId(), "userFeed", getmax.getFeedVersion(), getmax.getActivityIds());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, d2 = {"Lid/dana/domain/social/interactor/GetFriendTimeline$Params;", "", "pageSize", "", "maxId", "", "minId", "userId", "feedVersion", "activityIds", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getActivityIds", "()Ljava/util/List;", "getFeedVersion", "()I", "getMaxId", "()Ljava/lang/String;", "getMinId", "getPageSize", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        private final List<String> activityIds;
        private final int feedVersion;
        @Nullable
        private final String maxId;
        @Nullable
        private final String minId;
        private final int pageSize;
        @NotNull
        private final String userId;

        public static /* synthetic */ getMax copy$default(getMax getmax, int i, String str, String str2, String str3, int i2, List<String> list, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = getmax.pageSize;
            }
            if ((i3 & 2) != 0) {
                str = getmax.maxId;
            }
            String str4 = str;
            if ((i3 & 4) != 0) {
                str2 = getmax.minId;
            }
            String str5 = str2;
            if ((i3 & 8) != 0) {
                str3 = getmax.userId;
            }
            String str6 = str3;
            if ((i3 & 16) != 0) {
                i2 = getmax.feedVersion;
            }
            int i4 = i2;
            if ((i3 & 32) != 0) {
                list = getmax.activityIds;
            }
            return getmax.copy(i, str4, str5, str6, i4, list);
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
        public final String component4() {
            return this.userId;
        }

        public final int component5() {
            return this.feedVersion;
        }

        @NotNull
        public final List<String> component6() {
            return this.activityIds;
        }

        @NotNull
        public final getMax copy(int i, @Nullable String str, @Nullable String str2, @NotNull String str3, int i2, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(str3, "userId");
            Intrinsics.checkNotNullParameter(list, "activityIds");
            return new getMax(i, str, str2, str3, i2, list);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMax)) {
                return false;
            }
            getMax getmax = (getMax) obj;
            return this.pageSize == getmax.pageSize && Intrinsics.areEqual((Object) this.maxId, (Object) getmax.maxId) && Intrinsics.areEqual((Object) this.minId, (Object) getmax.minId) && Intrinsics.areEqual((Object) this.userId, (Object) getmax.userId) && this.feedVersion == getmax.feedVersion && Intrinsics.areEqual((Object) this.activityIds, (Object) getmax.activityIds);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(pageSize=");
            sb.append(this.pageSize);
            sb.append(", maxId=");
            sb.append(this.maxId);
            sb.append(", minId=");
            sb.append(this.minId);
            sb.append(", userId=");
            sb.append(this.userId);
            sb.append(", feedVersion=");
            sb.append(this.feedVersion);
            sb.append(", activityIds=");
            sb.append(this.activityIds);
            sb.append(")");
            return sb.toString();
        }

        public getMax(int i, @Nullable String str, @Nullable String str2, @NotNull String str3, int i2, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(str3, "userId");
            Intrinsics.checkNotNullParameter(list, "activityIds");
            this.pageSize = i;
            this.maxId = str;
            this.minId = str2;
            this.userId = str3;
            this.feedVersion = i2;
            this.activityIds = list;
        }

        @NotNull
        public final List<String> getActivityIds() {
            return this.activityIds;
        }

        public final int getFeedVersion() {
            return this.feedVersion;
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

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        public final int hashCode() {
            int hashCode = Integer.valueOf(this.pageSize).hashCode() * 31;
            String str = this.maxId;
            int i = 0;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.minId;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.userId;
            int hashCode4 = (((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.valueOf(this.feedVersion).hashCode()) * 31;
            List<String> list = this.activityIds;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode4 + i;
        }
    }
}
