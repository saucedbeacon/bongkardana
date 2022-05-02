package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB#\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/social/interactor/GetTimeline;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/social/model/SocialFeed;", "Lid/dana/domain/social/interactor/GetTimeline$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "socialMediaRepository", "Lid/dana/domain/social/SocialMediaRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/social/SocialMediaRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class stateOf extends parseFailed<getScanCallbackIntent, setMin> {
    /* access modifiers changed from: private */
    public final DistanceConfigFetcher socialMediaRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/social/model/SocialFeed;", "kotlin.jvm.PlatformType", "feedVersion", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/ObservableSource;"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<Integer, TitleBarRightButtonView.AnonymousClass4<? extends getScanCallbackIntent>> {
        final /* synthetic */ stateOf getMin;
        final /* synthetic */ setMin length;

        getMax(stateOf stateof, setMin setmin) {
            this.getMin = stateof;
            this.length = setmin;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Integer num = (Integer) obj;
            Intrinsics.checkNotNullParameter(num, "feedVersion");
            return this.getMin.socialMediaRepository.getFeeds((String) null, this.length.getPageSize(), this.length.getMaxId(), this.length.getMinId(), "timelineFeed", num.intValue(), this.length.getActivityIds());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public stateOf(@Nullable appxLoadFailed appxloadfailed, @Nullable getScheme getscheme, @NotNull DistanceConfigFetcher distanceConfigFetcher) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(distanceConfigFetcher, "socialMediaRepository");
        this.socialMediaRepository = distanceConfigFetcher;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> buildUseCaseObservable(@NotNull setMin setmin) {
        TitleBarRightButtonView.AnonymousClass1<Integer> r0;
        Intrinsics.checkNotNullParameter(setmin, "params");
        Integer feedVersion = setmin.getFeedVersion();
        if (feedVersion == null || (r0 = TitleBarRightButtonView.AnonymousClass1.just(Integer.valueOf(feedVersion.intValue()))) == null) {
            r0 = this.socialMediaRepository.getFeedVersion();
        }
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = r0.flatMap(new getMax(this, setmin));
        Intrinsics.checkNotNullExpressionValue(flatMap, "( params.feedVersion?.le…ctivityIds)\n            }");
        return flatMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003JL\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lid/dana/domain/social/interactor/GetTimeline$Params;", "", "pageSize", "", "maxId", "", "minId", "feedVersion", "activityIds", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getActivityIds", "()Ljava/util/List;", "getFeedVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxId", "()Ljava/lang/String;", "getMinId", "getPageSize", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lid/dana/domain/social/interactor/GetTimeline$Params;", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        private final List<String> activityIds;
        @Nullable
        private final Integer feedVersion;
        @Nullable
        private final String maxId;
        @Nullable
        private final String minId;
        private final int pageSize;

        public static /* synthetic */ setMin copy$default(setMin setmin, int i, String str, String str2, Integer num, List<String> list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = setmin.pageSize;
            }
            if ((i2 & 2) != 0) {
                str = setmin.maxId;
            }
            String str3 = str;
            if ((i2 & 4) != 0) {
                str2 = setmin.minId;
            }
            String str4 = str2;
            if ((i2 & 8) != 0) {
                num = setmin.feedVersion;
            }
            Integer num2 = num;
            if ((i2 & 16) != 0) {
                list = setmin.activityIds;
            }
            return setmin.copy(i, str3, str4, num2, list);
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

        @Nullable
        public final Integer component4() {
            return this.feedVersion;
        }

        @NotNull
        public final List<String> component5() {
            return this.activityIds;
        }

        @NotNull
        public final setMin copy(int i, @Nullable String str, @Nullable String str2, @Nullable Integer num, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "activityIds");
            return new setMin(i, str, str2, num, list);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMin)) {
                return false;
            }
            setMin setmin = (setMin) obj;
            return this.pageSize == setmin.pageSize && Intrinsics.areEqual((Object) this.maxId, (Object) setmin.maxId) && Intrinsics.areEqual((Object) this.minId, (Object) setmin.minId) && Intrinsics.areEqual((Object) this.feedVersion, (Object) setmin.feedVersion) && Intrinsics.areEqual((Object) this.activityIds, (Object) setmin.activityIds);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(pageSize=");
            sb.append(this.pageSize);
            sb.append(", maxId=");
            sb.append(this.maxId);
            sb.append(", minId=");
            sb.append(this.minId);
            sb.append(", feedVersion=");
            sb.append(this.feedVersion);
            sb.append(", activityIds=");
            sb.append(this.activityIds);
            sb.append(")");
            return sb.toString();
        }

        public setMin(int i, @Nullable String str, @Nullable String str2, @Nullable Integer num, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "activityIds");
            this.pageSize = i;
            this.maxId = str;
            this.minId = str2;
            this.feedVersion = num;
            this.activityIds = list;
        }

        @NotNull
        public final List<String> getActivityIds() {
            return this.activityIds;
        }

        @Nullable
        public final Integer getFeedVersion() {
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

        public final int hashCode() {
            int hashCode = Integer.valueOf(this.pageSize).hashCode() * 31;
            String str = this.maxId;
            int i = 0;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.minId;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Integer num = this.feedVersion;
            int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
            List<String> list = this.activityIds;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode4 + i;
        }
    }
}
