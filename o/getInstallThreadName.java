package o;

import android.location.Location;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetNearbyShopsWithRadius;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/nearbyme/model/ShopsPage;", "Lid/dana/domain/nearbyme/interactor/GetNearbyShopsWithRadius$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "nearbyMeRepository", "Lid/dana/domain/nearbyme/NearbyMeRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/nearbyme/NearbyMeRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getInstallThreadName extends parseFailed<H5FileUtil, setMin> {
    private final isRooted nearbyMeRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getInstallThreadName(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull isRooted isrooted) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(isrooted, "nearbyMeRepository");
        this.nearbyMeRepository = isrooted;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<H5FileUtil> buildUseCaseObservable(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        return this.nearbyMeRepository.getNearbyShopByRadius(setmin.getCurrentLocation(), setmin.getRadius(), setmin.getPageNum(), setmin.getPageSize(), setmin.getOnInit(), setmin.getUseNewMerchantCategory(), setmin.getSearchKeyword(), setmin.getSearchType());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006("}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetNearbyShopsWithRadius$Params;", "", "currentLocation", "Landroid/location/Location;", "radius", "", "pageNum", "pageSize", "onInit", "", "useNewMerchantCategory", "searchKeyword", "", "searchType", "(Landroid/location/Location;IIIZZLjava/lang/String;Ljava/lang/String;)V", "getCurrentLocation", "()Landroid/location/Location;", "getOnInit", "()Z", "getPageNum", "()I", "getPageSize", "getRadius", "getSearchKeyword", "()Ljava/lang/String;", "getSearchType", "getUseNewMerchantCategory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        private final Location currentLocation;
        private final boolean onInit;
        private final int pageNum;
        private final int pageSize;
        private final int radius;
        @NotNull
        private final String searchKeyword;
        @NotNull
        private final String searchType;
        private final boolean useNewMerchantCategory;

        public static /* synthetic */ setMin copy$default(setMin setmin, Location location, int i, int i2, int i3, boolean z, boolean z2, String str, String str2, int i4, Object obj) {
            setMin setmin2 = setmin;
            int i5 = i4;
            return setmin.copy((i5 & 1) != 0 ? setmin2.currentLocation : location, (i5 & 2) != 0 ? setmin2.radius : i, (i5 & 4) != 0 ? setmin2.pageNum : i2, (i5 & 8) != 0 ? setmin2.pageSize : i3, (i5 & 16) != 0 ? setmin2.onInit : z, (i5 & 32) != 0 ? setmin2.useNewMerchantCategory : z2, (i5 & 64) != 0 ? setmin2.searchKeyword : str, (i5 & 128) != 0 ? setmin2.searchType : str2);
        }

        @NotNull
        public final Location component1() {
            return this.currentLocation;
        }

        public final int component2() {
            return this.radius;
        }

        public final int component3() {
            return this.pageNum;
        }

        public final int component4() {
            return this.pageSize;
        }

        public final boolean component5() {
            return this.onInit;
        }

        public final boolean component6() {
            return this.useNewMerchantCategory;
        }

        @NotNull
        public final String component7() {
            return this.searchKeyword;
        }

        @NotNull
        public final String component8() {
            return this.searchType;
        }

        @NotNull
        public final setMin copy(@NotNull Location location, int i, int i2, int i3, boolean z, boolean z2, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(location, "currentLocation");
            String str3 = str;
            Intrinsics.checkNotNullParameter(str3, "searchKeyword");
            String str4 = str2;
            Intrinsics.checkNotNullParameter(str4, "searchType");
            return new setMin(location, i, i2, i3, z, z2, str3, str4);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMin)) {
                return false;
            }
            setMin setmin = (setMin) obj;
            return Intrinsics.areEqual((Object) this.currentLocation, (Object) setmin.currentLocation) && this.radius == setmin.radius && this.pageNum == setmin.pageNum && this.pageSize == setmin.pageSize && this.onInit == setmin.onInit && this.useNewMerchantCategory == setmin.useNewMerchantCategory && Intrinsics.areEqual((Object) this.searchKeyword, (Object) setmin.searchKeyword) && Intrinsics.areEqual((Object) this.searchType, (Object) setmin.searchType);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(currentLocation=");
            sb.append(this.currentLocation);
            sb.append(", radius=");
            sb.append(this.radius);
            sb.append(", pageNum=");
            sb.append(this.pageNum);
            sb.append(", pageSize=");
            sb.append(this.pageSize);
            sb.append(", onInit=");
            sb.append(this.onInit);
            sb.append(", useNewMerchantCategory=");
            sb.append(this.useNewMerchantCategory);
            sb.append(", searchKeyword=");
            sb.append(this.searchKeyword);
            sb.append(", searchType=");
            sb.append(this.searchType);
            sb.append(")");
            return sb.toString();
        }

        public setMin(@NotNull Location location, int i, int i2, int i3, boolean z, boolean z2, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(location, "currentLocation");
            Intrinsics.checkNotNullParameter(str, "searchKeyword");
            Intrinsics.checkNotNullParameter(str2, "searchType");
            this.currentLocation = location;
            this.radius = i;
            this.pageNum = i2;
            this.pageSize = i3;
            this.onInit = z;
            this.useNewMerchantCategory = z2;
            this.searchKeyword = str;
            this.searchType = str2;
        }

        @NotNull
        public final Location getCurrentLocation() {
            return this.currentLocation;
        }

        public final int getRadius() {
            return this.radius;
        }

        public final int getPageNum() {
            return this.pageNum;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final boolean getOnInit() {
            return this.onInit;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ setMin(Location location, int i, int i2, int i3, boolean z, boolean z2, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(location, i, i2, i3, z, (i4 & 32) != 0 ? false : z2, str, str2);
        }

        public final boolean getUseNewMerchantCategory() {
            return this.useNewMerchantCategory;
        }

        @NotNull
        public final String getSearchKeyword() {
            return this.searchKeyword;
        }

        @NotNull
        public final String getSearchType() {
            return this.searchType;
        }

        public final int hashCode() {
            Location location = this.currentLocation;
            int i = 0;
            int hashCode = (((((((location != null ? location.hashCode() : 0) * 31) + Integer.valueOf(this.radius).hashCode()) * 31) + Integer.valueOf(this.pageNum).hashCode()) * 31) + Integer.valueOf(this.pageSize).hashCode()) * 31;
            boolean z = this.onInit;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.useNewMerchantCategory;
            if (!z3) {
                z2 = z3;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            String str = this.searchKeyword;
            int hashCode2 = (i3 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.searchType;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }
    }
}
