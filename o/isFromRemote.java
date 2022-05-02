package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/request/NearbyQueryRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "latitude", "", "longitude", "pageNum", "", "pageSize", "searchKeyword", "", "searchType", "(DDIILjava/lang/String;Ljava/lang/String;)V", "getLatitude", "()D", "getLongitude", "getPageNum", "()I", "getPageSize", "getSearchKeyword", "()Ljava/lang/String;", "getSearchType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isFromRemote extends BaseRpcRequest {
    private final double latitude;
    private final double longitude;
    private final int pageNum;
    private final int pageSize;
    @NotNull
    private final String searchKeyword;
    @NotNull
    private final String searchType;

    public static /* synthetic */ isFromRemote copy$default(isFromRemote isfromremote, double d, double d2, int i, int i2, String str, String str2, int i3, Object obj) {
        isFromRemote isfromremote2 = isfromremote;
        return isfromremote.copy((i3 & 1) != 0 ? isfromremote2.latitude : d, (i3 & 2) != 0 ? isfromremote2.longitude : d2, (i3 & 4) != 0 ? isfromremote2.pageNum : i, (i3 & 8) != 0 ? isfromremote2.pageSize : i2, (i3 & 16) != 0 ? isfromremote2.searchKeyword : str, (i3 & 32) != 0 ? isfromremote2.searchType : str2);
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

    @NotNull
    public final String component6() {
        return this.searchType;
    }

    @NotNull
    public final isFromRemote copy(double d, double d2, int i, int i2, @NotNull String str, @NotNull String str2) {
        String str3 = str;
        Intrinsics.checkNotNullParameter(str3, "searchKeyword");
        String str4 = str2;
        Intrinsics.checkNotNullParameter(str4, "searchType");
        return new isFromRemote(d, d2, i, i2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isFromRemote)) {
            return false;
        }
        isFromRemote isfromremote = (isFromRemote) obj;
        return Double.compare(this.latitude, isfromremote.latitude) == 0 && Double.compare(this.longitude, isfromremote.longitude) == 0 && this.pageNum == isfromremote.pageNum && this.pageSize == isfromremote.pageSize && Intrinsics.areEqual((Object) this.searchKeyword, (Object) isfromremote.searchKeyword) && Intrinsics.areEqual((Object) this.searchType, (Object) isfromremote.searchType);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyQueryRequest(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", pageNum=");
        sb.append(this.pageNum);
        sb.append(", pageSize=");
        sb.append(this.pageSize);
        sb.append(", searchKeyword=");
        sb.append(this.searchKeyword);
        sb.append(", searchType=");
        sb.append(this.searchType);
        sb.append(")");
        return sb.toString();
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
    public /* synthetic */ isFromRemote(double d, double d2, int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, i, i2, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? "" : str2);
    }

    @NotNull
    public final String getSearchType() {
        return this.searchType;
    }

    public isFromRemote(double d, double d2, int i, int i2, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "searchKeyword");
        Intrinsics.checkNotNullParameter(str2, "searchType");
        this.latitude = d;
        this.longitude = d2;
        this.pageNum = i;
        this.pageSize = i2;
        this.searchKeyword = str;
        this.searchType = str2;
    }

    public final int hashCode() {
        int hashCode = ((((((Double.valueOf(this.latitude).hashCode() * 31) + Double.valueOf(this.longitude).hashCode()) * 31) + Integer.valueOf(this.pageNum).hashCode()) * 31) + Integer.valueOf(this.pageSize).hashCode()) * 31;
        String str = this.searchKeyword;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.searchType;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}
