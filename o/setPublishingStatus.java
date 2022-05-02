package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetOtherStoreList;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/nearbyme/model/OtherStoreListResult;", "Lid/dana/domain/nearbyme/interactor/GetOtherStoreList$Params;", "nearbyMeRepository", "Lid/dana/domain/nearbyme/NearbyMeRepository;", "(Lid/dana/domain/nearbyme/NearbyMeRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setPublishingStatus extends APWebChromeClient<getCachePath, setMax> {
    private final isRooted nearbyMeRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setPublishingStatus(@NotNull isRooted isrooted) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(isrooted, "nearbyMeRepository");
        this.nearbyMeRepository = isrooted;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetOtherStoreList$Params;", "", "merchantId", "", "latitude", "", "longitude", "pageSize", "", "pageNum", "searchKeyword", "searchType", "useNewMerchantCategories", "", "(Ljava/lang/String;DDIILjava/lang/String;Ljava/lang/String;Z)V", "getLatitude", "()D", "getLongitude", "getMerchantId", "()Ljava/lang/String;", "getPageNum", "()I", "getPageSize", "getSearchKeyword", "getSearchType", "getUseNewMerchantCategories", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private final double latitude;
        private final double longitude;
        @NotNull
        private final String merchantId;
        private final int pageNum;
        private final int pageSize;
        @NotNull
        private final String searchKeyword;
        @NotNull
        private final String searchType;
        private final boolean useNewMerchantCategories;

        public static /* synthetic */ setMax copy$default(setMax setmax, String str, double d, double d2, int i, int i2, String str2, String str3, boolean z, int i3, Object obj) {
            setMax setmax2 = setmax;
            int i4 = i3;
            return setmax.copy((i4 & 1) != 0 ? setmax2.merchantId : str, (i4 & 2) != 0 ? setmax2.latitude : d, (i4 & 4) != 0 ? setmax2.longitude : d2, (i4 & 8) != 0 ? setmax2.pageSize : i, (i4 & 16) != 0 ? setmax2.pageNum : i2, (i4 & 32) != 0 ? setmax2.searchKeyword : str2, (i4 & 64) != 0 ? setmax2.searchType : str3, (i4 & 128) != 0 ? setmax2.useNewMerchantCategories : z);
        }

        @NotNull
        public final String component1() {
            return this.merchantId;
        }

        public final double component2() {
            return this.latitude;
        }

        public final double component3() {
            return this.longitude;
        }

        public final int component4() {
            return this.pageSize;
        }

        public final int component5() {
            return this.pageNum;
        }

        @NotNull
        public final String component6() {
            return this.searchKeyword;
        }

        @NotNull
        public final String component7() {
            return this.searchType;
        }

        public final boolean component8() {
            return this.useNewMerchantCategories;
        }

        @NotNull
        public final setMax copy(@NotNull String str, double d, double d2, int i, int i2, @NotNull String str2, @NotNull String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "merchantId");
            String str4 = str2;
            Intrinsics.checkNotNullParameter(str4, "searchKeyword");
            String str5 = str3;
            Intrinsics.checkNotNullParameter(str5, "searchType");
            return new setMax(str, d, d2, i, i2, str4, str5, z);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMax)) {
                return false;
            }
            setMax setmax = (setMax) obj;
            return Intrinsics.areEqual((Object) this.merchantId, (Object) setmax.merchantId) && Double.compare(this.latitude, setmax.latitude) == 0 && Double.compare(this.longitude, setmax.longitude) == 0 && this.pageSize == setmax.pageSize && this.pageNum == setmax.pageNum && Intrinsics.areEqual((Object) this.searchKeyword, (Object) setmax.searchKeyword) && Intrinsics.areEqual((Object) this.searchType, (Object) setmax.searchType) && this.useNewMerchantCategories == setmax.useNewMerchantCategories;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(merchantId=");
            sb.append(this.merchantId);
            sb.append(", latitude=");
            sb.append(this.latitude);
            sb.append(", longitude=");
            sb.append(this.longitude);
            sb.append(", pageSize=");
            sb.append(this.pageSize);
            sb.append(", pageNum=");
            sb.append(this.pageNum);
            sb.append(", searchKeyword=");
            sb.append(this.searchKeyword);
            sb.append(", searchType=");
            sb.append(this.searchType);
            sb.append(", useNewMerchantCategories=");
            sb.append(this.useNewMerchantCategories);
            sb.append(")");
            return sb.toString();
        }

        public setMax(@NotNull String str, double d, double d2, int i, int i2, @NotNull String str2, @NotNull String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, "searchKeyword");
            Intrinsics.checkNotNullParameter(str3, "searchType");
            this.merchantId = str;
            this.latitude = d;
            this.longitude = d2;
            this.pageSize = i;
            this.pageNum = i2;
            this.searchKeyword = str2;
            this.searchType = str3;
            this.useNewMerchantCategories = z;
        }

        @NotNull
        public final String getMerchantId() {
            return this.merchantId;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final int getPageNum() {
            return this.pageNum;
        }

        @NotNull
        public final String getSearchKeyword() {
            return this.searchKeyword;
        }

        @NotNull
        public final String getSearchType() {
            return this.searchType;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ setMax(String str, double d, double d2, int i, int i2, String str2, String str3, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, d, d2, i, i2, str2, str3, (i3 & 128) != 0 ? false : z);
        }

        public final boolean getUseNewMerchantCategories() {
            return this.useNewMerchantCategories;
        }

        public final int hashCode() {
            String str = this.merchantId;
            int i = 0;
            int hashCode = (((((((((str != null ? str.hashCode() : 0) * 31) + Double.valueOf(this.latitude).hashCode()) * 31) + Double.valueOf(this.longitude).hashCode()) * 31) + Integer.valueOf(this.pageSize).hashCode()) * 31) + Integer.valueOf(this.pageNum).hashCode()) * 31;
            String str2 = this.searchKeyword;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.searchType;
            if (str3 != null) {
                i = str3.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.useNewMerchantCategories;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getCachePath> buildUseCase(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        return this.nearbyMeRepository.getOtherStoreList(setmax.getMerchantId(), setmax.getLatitude(), setmax.getLongitude(), setmax.getPageNum(), setmax.getPageSize(), setmax.getSearchKeyword(), setmax.getSearchType(), setmax.getUseNewMerchantCategories());
    }
}
