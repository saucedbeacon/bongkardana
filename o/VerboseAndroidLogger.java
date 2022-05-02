package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/social/interactor/GetFeedNotification;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/social/model/SocialFeed;", "Lid/dana/domain/social/interactor/GetFeedNotification$Params;", "socialMediaRepository", "Lid/dana/domain/social/SocialMediaRepository;", "(Lid/dana/domain/social/SocialMediaRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class VerboseAndroidLogger extends APWebChromeClient<getScanCallbackIntent, getMax> {
    /* access modifiers changed from: private */
    public final DistanceConfigFetcher socialMediaRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/social/model/SocialFeed;", "kotlin.jvm.PlatformType", "feedVersion", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/ObservableSource;"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<Integer, TitleBarRightButtonView.AnonymousClass4<? extends getScanCallbackIntent>> {
        final /* synthetic */ getMax getMin;
        final /* synthetic */ VerboseAndroidLogger length;

        getMin(VerboseAndroidLogger verboseAndroidLogger, getMax getmax) {
            this.length = verboseAndroidLogger;
            this.getMin = getmax;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Integer num = (Integer) obj;
            Intrinsics.checkNotNullParameter(num, "feedVersion");
            return this.length.socialMediaRepository.getFeeds((String) null, this.getMin.getPageSize(), this.getMin.getMaxId(), this.getMin.getMinId(), "notificationFeed", num.intValue(), CollectionsKt.emptyList());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public VerboseAndroidLogger(@NotNull DistanceConfigFetcher distanceConfigFetcher) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(distanceConfigFetcher, "socialMediaRepository");
        this.socialMediaRepository = distanceConfigFetcher;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.socialMediaRepository.getFeedVersion().flatMap(new getMin(this, getmax));
        Intrinsics.checkNotNullExpressionValue(flatMap, "socialMediaRepository.ge…          )\n            }");
        return flatMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lid/dana/domain/social/interactor/GetFeedNotification$Params;", "", "pageSize", "", "maxId", "", "minId", "(ILjava/lang/String;Ljava/lang/String;)V", "getMaxId", "()Ljava/lang/String;", "getMinId", "getPageSize", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @Nullable
        private final String maxId;
        @Nullable
        private final String minId;
        private final int pageSize;

        public static /* synthetic */ getMax copy$default(getMax getmax, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = getmax.pageSize;
            }
            if ((i2 & 2) != 0) {
                str = getmax.maxId;
            }
            if ((i2 & 4) != 0) {
                str2 = getmax.minId;
            }
            return getmax.copy(i, str, str2);
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
        public final getMax copy(int i, @Nullable String str, @Nullable String str2) {
            return new getMax(i, str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMax)) {
                return false;
            }
            getMax getmax = (getMax) obj;
            return this.pageSize == getmax.pageSize && Intrinsics.areEqual((Object) this.maxId, (Object) getmax.maxId) && Intrinsics.areEqual((Object) this.minId, (Object) getmax.minId);
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

        public getMax(int i, @Nullable String str, @Nullable String str2) {
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
