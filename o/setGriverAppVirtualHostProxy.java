package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetNearbyShopsWithPagination;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/nearbyme/model/ShopsPage;", "Lid/dana/domain/nearbyme/interactor/GetNearbyShopsWithPagination$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "nearbyMeRepository", "Lid/dana/domain/nearbyme/NearbyMeRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/nearbyme/NearbyMeRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setGriverAppVirtualHostProxy extends parseFailed<H5FileUtil, length> {
    private final isRooted nearbyMeRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setGriverAppVirtualHostProxy(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull isRooted isrooted) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(isrooted, "nearbyMeRepository");
        this.nearbyMeRepository = isrooted;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<H5FileUtil> buildUseCaseObservable(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        return this.nearbyMeRepository.getNearbyShops(length2.getLatitude(), length2.getLongitude(), length2.getPageNum(), length2.getPageSize(), length2.getSearchKeyword(), length2.getUseNewMerchantCategory(), length2.getSource());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetNearbyShopsWithPagination$Params;", "", "latitude", "", "longitude", "pageNum", "", "pageSize", "searchKeyword", "", "useNewMerchantCategory", "", "source", "(DDIILjava/lang/String;ZLjava/lang/String;)V", "getLatitude", "()D", "getLongitude", "getPageNum", "()I", "getPageSize", "getSearchKeyword", "()Ljava/lang/String;", "getSource", "getUseNewMerchantCategory", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private final double latitude;
        private final double longitude;
        private final int pageNum;
        private final int pageSize;
        @NotNull
        private final String searchKeyword;
        @NotNull
        private final String source;
        private final boolean useNewMerchantCategory;

        public static /* synthetic */ length copy$default(length length, double d, double d2, int i, int i2, String str, boolean z, String str2, int i3, Object obj) {
            length length2 = length;
            return length.copy((i3 & 1) != 0 ? length2.latitude : d, (i3 & 2) != 0 ? length2.longitude : d2, (i3 & 4) != 0 ? length2.pageNum : i, (i3 & 8) != 0 ? length2.pageSize : i2, (i3 & 16) != 0 ? length2.searchKeyword : str, (i3 & 32) != 0 ? length2.useNewMerchantCategory : z, (i3 & 64) != 0 ? length2.source : str2);
        }

        public final double component1() {
            return this.latitude;
        }

        public final double component2() {
            return this.longitude;
        }

        public final int component3() {
            return this.pageNum;
        }

        public final int component4() {
            return this.pageSize;
        }

        @NotNull
        public final String component5() {
            return this.searchKeyword;
        }

        public final boolean component6() {
            return this.useNewMerchantCategory;
        }

        @NotNull
        public final String component7() {
            return this.source;
        }

        @NotNull
        public final length copy(double d, double d2, int i, int i2, @NotNull String str, boolean z, @NotNull String str2) {
            String str3 = str;
            Intrinsics.checkNotNullParameter(str3, "searchKeyword");
            String str4 = str2;
            Intrinsics.checkNotNullParameter(str4, "source");
            return new length(d, d2, i, i2, str3, z, str4);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof length)) {
                return false;
            }
            length length = (length) obj;
            return Double.compare(this.latitude, length.latitude) == 0 && Double.compare(this.longitude, length.longitude) == 0 && this.pageNum == length.pageNum && this.pageSize == length.pageSize && Intrinsics.areEqual((Object) this.searchKeyword, (Object) length.searchKeyword) && this.useNewMerchantCategory == length.useNewMerchantCategory && Intrinsics.areEqual((Object) this.source, (Object) length.source);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(latitude=");
            sb.append(this.latitude);
            sb.append(", longitude=");
            sb.append(this.longitude);
            sb.append(", pageNum=");
            sb.append(this.pageNum);
            sb.append(", pageSize=");
            sb.append(this.pageSize);
            sb.append(", searchKeyword=");
            sb.append(this.searchKeyword);
            sb.append(", useNewMerchantCategory=");
            sb.append(this.useNewMerchantCategory);
            sb.append(", source=");
            sb.append(this.source);
            sb.append(")");
            return sb.toString();
        }

        public length(double d, double d2, int i, int i2, @NotNull String str, boolean z, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "searchKeyword");
            Intrinsics.checkNotNullParameter(str2, "source");
            this.latitude = d;
            this.longitude = d2;
            this.pageNum = i;
            this.pageSize = i2;
            this.searchKeyword = str;
            this.useNewMerchantCategory = z;
            this.source = str2;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public final int getPageNum() {
            return this.pageNum;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        @NotNull
        public final String getSearchKeyword() {
            return this.searchKeyword;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ length(double d, double d2, int i, int i2, String str, boolean z, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(d, d2, i, i2, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? false : z, str2);
        }

        public final boolean getUseNewMerchantCategory() {
            return this.useNewMerchantCategory;
        }

        @NotNull
        public final String getSource() {
            return this.source;
        }

        public final int hashCode() {
            int hashCode = ((((((Double.valueOf(this.latitude).hashCode() * 31) + Double.valueOf(this.longitude).hashCode()) * 31) + Integer.valueOf(this.pageNum).hashCode()) * 31) + Integer.valueOf(this.pageSize).hashCode()) * 31;
            String str = this.searchKeyword;
            int i = 0;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.useNewMerchantCategory;
            if (z) {
                z = true;
            }
            int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
            String str2 = this.source;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i2 + i;
        }
    }
}
