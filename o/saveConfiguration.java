package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, d2 = {"Lid/dana/domain/promocenter/model/PromoCategoryRequest;", "", "pageSize", "", "pageNumber", "categories", "", "", "sortBy", "filters", "lat", "", "lon", "(IILjava/util/List;Ljava/lang/String;Ljava/lang/String;DD)V", "getCategories", "()Ljava/util/List;", "getFilters", "()Ljava/lang/String;", "getLat", "()D", "getLon", "getPageNumber", "()I", "getPageSize", "getSortBy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class saveConfiguration {
    @NotNull
    private final List<String> categories;
    @Nullable
    private final String filters;
    private final double lat;
    private final double lon;
    private final int pageNumber;
    private final int pageSize;
    @Nullable
    private final String sortBy;

    public static /* synthetic */ saveConfiguration copy$default(saveConfiguration saveconfiguration, int i, int i2, List list, String str, String str2, double d, double d2, int i3, Object obj) {
        saveConfiguration saveconfiguration2 = saveconfiguration;
        return saveconfiguration.copy((i3 & 1) != 0 ? saveconfiguration2.pageSize : i, (i3 & 2) != 0 ? saveconfiguration2.pageNumber : i2, (i3 & 4) != 0 ? saveconfiguration2.categories : list, (i3 & 8) != 0 ? saveconfiguration2.sortBy : str, (i3 & 16) != 0 ? saveconfiguration2.filters : str2, (i3 & 32) != 0 ? saveconfiguration2.lat : d, (i3 & 64) != 0 ? saveconfiguration2.lon : d2);
    }

    public final int component1() {
        return this.pageSize;
    }

    public final int component2() {
        return this.pageNumber;
    }

    @NotNull
    public final List<String> component3() {
        return this.categories;
    }

    @Nullable
    public final String component4() {
        return this.sortBy;
    }

    @Nullable
    public final String component5() {
        return this.filters;
    }

    public final double component6() {
        return this.lat;
    }

    public final double component7() {
        return this.lon;
    }

    @NotNull
    public final saveConfiguration copy(int i, int i2, @NotNull List<String> list, @Nullable String str, @Nullable String str2, double d, double d2) {
        Intrinsics.checkNotNullParameter(list, "categories");
        return new saveConfiguration(i, i2, list, str, str2, d, d2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof saveConfiguration)) {
            return false;
        }
        saveConfiguration saveconfiguration = (saveConfiguration) obj;
        return this.pageSize == saveconfiguration.pageSize && this.pageNumber == saveconfiguration.pageNumber && Intrinsics.areEqual((Object) this.categories, (Object) saveconfiguration.categories) && Intrinsics.areEqual((Object) this.sortBy, (Object) saveconfiguration.sortBy) && Intrinsics.areEqual((Object) this.filters, (Object) saveconfiguration.filters) && Double.compare(this.lat, saveconfiguration.lat) == 0 && Double.compare(this.lon, saveconfiguration.lon) == 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCategoryRequest(pageSize=");
        sb.append(this.pageSize);
        sb.append(", pageNumber=");
        sb.append(this.pageNumber);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", sortBy=");
        sb.append(this.sortBy);
        sb.append(", filters=");
        sb.append(this.filters);
        sb.append(", lat=");
        sb.append(this.lat);
        sb.append(", lon=");
        sb.append(this.lon);
        sb.append(")");
        return sb.toString();
    }

    public saveConfiguration(int i, int i2, @NotNull List<String> list, @Nullable String str, @Nullable String str2, double d, double d2) {
        Intrinsics.checkNotNullParameter(list, "categories");
        this.pageSize = i;
        this.pageNumber = i2;
        this.categories = list;
        this.sortBy = str;
        this.filters = str2;
        this.lat = d;
        this.lon = d2;
    }

    public final int getPageNumber() {
        return this.pageNumber;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ saveConfiguration(int i, int i2, List list, String str, String str2, double d, double d2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? CollectionsKt.emptyList() : list, str, str2, d, d2);
    }

    @NotNull
    public final List<String> getCategories() {
        return this.categories;
    }

    @Nullable
    public final String getSortBy() {
        return this.sortBy;
    }

    @Nullable
    public final String getFilters() {
        return this.filters;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public final int hashCode() {
        int hashCode = ((Integer.valueOf(this.pageSize).hashCode() * 31) + Integer.valueOf(this.pageNumber).hashCode()) * 31;
        List<String> list = this.categories;
        int i = 0;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.sortBy;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.filters;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode3 + i) * 31) + Double.valueOf(this.lat).hashCode()) * 31) + Double.valueOf(this.lon).hashCode();
    }
}
