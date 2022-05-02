package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006&"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/request/NearbyRadiusRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "Ljava/io/Serializable;", "latitude", "", "longitude", "radius", "", "pageSize", "pageNum", "searchKeyword", "", "searchType", "(DDIIILjava/lang/String;Ljava/lang/String;)V", "getLatitude", "()D", "getLongitude", "getPageNum", "()I", "getPageSize", "getRadius", "getSearchKeyword", "()Ljava/lang/String;", "getSearchType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class stringDefault extends BaseRpcRequest implements Serializable {
    private final double latitude;
    private final double longitude;
    private final int pageNum;
    private final int pageSize;
    private final int radius;
    @NotNull
    private final String searchKeyword;
    @NotNull
    private final String searchType;

    public static /* synthetic */ stringDefault copy$default(stringDefault stringdefault, double d, double d2, int i, int i2, int i3, String str, String str2, int i4, Object obj) {
        stringDefault stringdefault2 = stringdefault;
        return stringdefault.copy((i4 & 1) != 0 ? stringdefault2.latitude : d, (i4 & 2) != 0 ? stringdefault2.longitude : d2, (i4 & 4) != 0 ? stringdefault2.radius : i, (i4 & 8) != 0 ? stringdefault2.pageSize : i2, (i4 & 16) != 0 ? stringdefault2.pageNum : i3, (i4 & 32) != 0 ? stringdefault2.searchKeyword : str, (i4 & 64) != 0 ? stringdefault2.searchType : str2);
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final int component3() {
        return this.radius;
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
    public final stringDefault copy(double d, double d2, int i, int i2, int i3, @NotNull String str, @NotNull String str2) {
        String str3 = str;
        Intrinsics.checkNotNullParameter(str3, "searchKeyword");
        String str4 = str2;
        Intrinsics.checkNotNullParameter(str4, "searchType");
        return new stringDefault(d, d2, i, i2, i3, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stringDefault)) {
            return false;
        }
        stringDefault stringdefault = (stringDefault) obj;
        return Double.compare(this.latitude, stringdefault.latitude) == 0 && Double.compare(this.longitude, stringdefault.longitude) == 0 && this.radius == stringdefault.radius && this.pageSize == stringdefault.pageSize && this.pageNum == stringdefault.pageNum && Intrinsics.areEqual((Object) this.searchKeyword, (Object) stringdefault.searchKeyword) && Intrinsics.areEqual((Object) this.searchType, (Object) stringdefault.searchType);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyRadiusRequest(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", radius=");
        sb.append(this.radius);
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

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final int getRadius() {
        return this.radius;
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
    public /* synthetic */ stringDefault(double d, double d2, int i, int i2, int i3, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, i, (i4 & 8) != 0 ? 20 : i2, i3, (i4 & 32) != 0 ? "" : str, (i4 & 64) != 0 ? "" : str2);
    }

    @NotNull
    public final String getSearchType() {
        return this.searchType;
    }

    public stringDefault(double d, double d2, int i, int i2, int i3, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "searchKeyword");
        Intrinsics.checkNotNullParameter(str2, "searchType");
        this.latitude = d;
        this.longitude = d2;
        this.radius = i;
        this.pageSize = i2;
        this.pageNum = i3;
        this.searchKeyword = str;
        this.searchType = str2;
    }

    public final int hashCode() {
        int hashCode = ((((((((Double.valueOf(this.latitude).hashCode() * 31) + Double.valueOf(this.longitude).hashCode()) * 31) + Integer.valueOf(this.radius).hashCode()) * 31) + Integer.valueOf(this.pageSize).hashCode()) * 31) + Integer.valueOf(this.pageNum).hashCode()) * 31;
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
