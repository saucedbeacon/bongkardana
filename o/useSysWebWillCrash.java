package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverRVResourceManagerImpl;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/promocenter/interactor/GetPromoAds;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/promocenter/model/PromoAds;", "Lid/dana/domain/promocenter/interactor/GetPromoAds$PromoAdsParams;", "promoCenterRepository", "Lid/dana/domain/promocenter/repository/PromoCenterRepository;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "(Lid/dana/domain/promocenter/repository/PromoCenterRepository;Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "PromoAdsParams", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class useSysWebWillCrash extends parseFailed<GriverRVResourceManagerImpl.AnonymousClass1, getMin> {
    private final GriverResourceManager promoCenterRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public useSysWebWillCrash(@NotNull GriverResourceManager griverResourceManager, @Nullable appxLoadFailed appxloadfailed, @Nullable getScheme getscheme) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(griverResourceManager, "promoCenterRepository");
        this.promoCenterRepository = griverResourceManager;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lid/dana/domain/promocenter/interactor/GetPromoAds$PromoAdsParams;", "", "size", "", "lat", "", "lon", "(IDD)V", "getLat", "()D", "getLon", "getSize", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private final double lat;
        private final double lon;
        private final int size;

        public static /* synthetic */ getMin copy$default(getMin getmin, int i, double d, double d2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = getmin.size;
            }
            if ((i2 & 2) != 0) {
                d = getmin.lat;
            }
            double d3 = d;
            if ((i2 & 4) != 0) {
                d2 = getmin.lon;
            }
            return getmin.copy(i, d3, d2);
        }

        public final int component1() {
            return this.size;
        }

        public final double component2() {
            return this.lat;
        }

        public final double component3() {
            return this.lon;
        }

        @NotNull
        public final getMin copy(int i, double d, double d2) {
            return new getMin(i, d, d2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return this.size == getmin.size && Double.compare(this.lat, getmin.lat) == 0 && Double.compare(this.lon, getmin.lon) == 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("PromoAdsParams(size=");
            sb.append(this.size);
            sb.append(", lat=");
            sb.append(this.lat);
            sb.append(", lon=");
            sb.append(this.lon);
            sb.append(")");
            return sb.toString();
        }

        public getMin(int i, double d, double d2) {
            this.size = i;
            this.lat = d;
            this.lon = d2;
        }

        public final double getLat() {
            return this.lat;
        }

        public final double getLon() {
            return this.lon;
        }

        public final int getSize() {
            return this.size;
        }

        public final int hashCode() {
            return (((Integer.valueOf(this.size).hashCode() * 31) + Double.valueOf(this.lat).hashCode()) * 31) + Double.valueOf(this.lon).hashCode();
        }
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<GriverRVResourceManagerImpl.AnonymousClass1> buildUseCaseObservable(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        TitleBarRightButtonView.AnonymousClass1<GriverRVResourceManagerImpl.AnonymousClass1> promoAds = this.promoCenterRepository.getPromoAds(getmin.getSize(), getmin.getLat(), getmin.getLon());
        Intrinsics.checkNotNullExpressionValue(promoAds, "promoCenterRepository.ge…, params.lat, params.lon)");
        return promoAds;
    }
}
