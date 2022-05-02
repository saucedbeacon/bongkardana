package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006%"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/request/NearbyQueryOtherShopListRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "merchantId", "", "latitude", "", "longitude", "pageSize", "", "pageNum", "searchKeyword", "searchType", "(Ljava/lang/String;DDIILjava/lang/String;Ljava/lang/String;)V", "getLatitude", "()D", "getLongitude", "getMerchantId", "()Ljava/lang/String;", "getPageNum", "()I", "getPageSize", "getSearchKeyword", "getSearchType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BindingRequest extends BaseRpcRequest {
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

    public static /* synthetic */ BindingRequest copy$default(BindingRequest bindingRequest, String str, double d, double d2, int i, int i2, String str2, String str3, int i3, Object obj) {
        BindingRequest bindingRequest2 = bindingRequest;
        return bindingRequest.copy((i3 & 1) != 0 ? bindingRequest2.merchantId : str, (i3 & 2) != 0 ? bindingRequest2.latitude : d, (i3 & 4) != 0 ? bindingRequest2.longitude : d2, (i3 & 8) != 0 ? bindingRequest2.pageSize : i, (i3 & 16) != 0 ? bindingRequest2.pageNum : i2, (i3 & 32) != 0 ? bindingRequest2.searchKeyword : str2, (i3 & 64) != 0 ? bindingRequest2.searchType : str3);
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

    @NotNull
    public final BindingRequest copy(@NotNull String str, double d, double d2, int i, int i2, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "merchantId");
        String str4 = str2;
        Intrinsics.checkNotNullParameter(str4, "searchKeyword");
        String str5 = str3;
        Intrinsics.checkNotNullParameter(str5, "searchType");
        return new BindingRequest(str, d, d2, i, i2, str4, str5);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindingRequest)) {
            return false;
        }
        BindingRequest bindingRequest = (BindingRequest) obj;
        return Intrinsics.areEqual((Object) this.merchantId, (Object) bindingRequest.merchantId) && Double.compare(this.latitude, bindingRequest.latitude) == 0 && Double.compare(this.longitude, bindingRequest.longitude) == 0 && this.pageSize == bindingRequest.pageSize && this.pageNum == bindingRequest.pageNum && Intrinsics.areEqual((Object) this.searchKeyword, (Object) bindingRequest.searchKeyword) && Intrinsics.areEqual((Object) this.searchType, (Object) bindingRequest.searchType);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyQueryOtherShopListRequest(merchantId=");
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
        sb.append(")");
        return sb.toString();
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BindingRequest(String str, double d, double d2, int i, int i2, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d, d2, i, i2, (i3 & 32) != 0 ? "" : str2, (i3 & 64) != 0 ? "" : str3);
    }

    @NotNull
    public final String getSearchType() {
        return this.searchType;
    }

    public BindingRequest(@NotNull String str, double d, double d2, int i, int i2, @NotNull String str2, @NotNull String str3) {
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
        return hashCode2 + i;
    }
}
