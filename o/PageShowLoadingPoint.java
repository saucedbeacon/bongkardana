package o;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import javax.annotation.Nonnull;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\rJB\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lid/dana/data/geofence/repository/source/persistence/entity/RecentPoiEntity;", "", "poiId", "", "radius", "", "longitude", "", "latitude", "lastPoiNotified", "", "(Ljava/lang/String;IDDLjava/lang/Long;)V", "getLastPoiNotified", "()Ljava/lang/Long;", "setLastPoiNotified", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "getPoiId", "()Ljava/lang/String;", "setPoiId", "(Ljava/lang/String;)V", "getRadius", "()I", "setRadius", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;IDDLjava/lang/Long;)Lid/dana/data/geofence/repository/source/persistence/entity/RecentPoiEntity;", "equals", "", "other", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Entity
public final class PageShowLoadingPoint {
    @Nullable
    private Long lastPoiNotified;
    private double latitude;
    private double longitude;
    @NotNull
    @PrimaryKey
    private String poiId;
    private int radius;

    public PageShowLoadingPoint() {
        this((String) null, 0, 0.0d, 0.0d, (Long) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PageShowLoadingPoint copy$default(PageShowLoadingPoint pageShowLoadingPoint, String str, int i, double d, double d2, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pageShowLoadingPoint.poiId;
        }
        if ((i2 & 2) != 0) {
            i = pageShowLoadingPoint.radius;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            d = pageShowLoadingPoint.longitude;
        }
        double d3 = d;
        if ((i2 & 8) != 0) {
            d2 = pageShowLoadingPoint.latitude;
        }
        double d4 = d2;
        if ((i2 & 16) != 0) {
            l = pageShowLoadingPoint.lastPoiNotified;
        }
        return pageShowLoadingPoint.copy(str, i3, d3, d4, l);
    }

    @NotNull
    public final String component1() {
        return this.poiId;
    }

    public final int component2() {
        return this.radius;
    }

    public final double component3() {
        return this.longitude;
    }

    public final double component4() {
        return this.latitude;
    }

    @Nullable
    public final Long component5() {
        return this.lastPoiNotified;
    }

    @NotNull
    public final PageShowLoadingPoint copy(@NotNull @Nonnull String str, int i, double d, double d2, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(str, "poiId");
        return new PageShowLoadingPoint(str, i, d, d2, l);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageShowLoadingPoint)) {
            return false;
        }
        PageShowLoadingPoint pageShowLoadingPoint = (PageShowLoadingPoint) obj;
        return Intrinsics.areEqual((Object) this.poiId, (Object) pageShowLoadingPoint.poiId) && this.radius == pageShowLoadingPoint.radius && Double.compare(this.longitude, pageShowLoadingPoint.longitude) == 0 && Double.compare(this.latitude, pageShowLoadingPoint.latitude) == 0 && Intrinsics.areEqual((Object) this.lastPoiNotified, (Object) pageShowLoadingPoint.lastPoiNotified);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentPoiEntity(poiId=");
        sb.append(this.poiId);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", lastPoiNotified=");
        sb.append(this.lastPoiNotified);
        sb.append(")");
        return sb.toString();
    }

    public PageShowLoadingPoint(@NotNull @Nonnull String str, int i, double d, double d2, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(str, "poiId");
        this.poiId = str;
        this.radius = i;
        this.longitude = d;
        this.latitude = d2;
        this.lastPoiNotified = l;
    }

    @NotNull
    public final String getPoiId() {
        return this.poiId;
    }

    public final void setPoiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.poiId = str;
    }

    public final int getRadius() {
        return this.radius;
    }

    public final void setRadius(int i) {
        this.radius = i;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PageShowLoadingPoint(java.lang.String r6, int r7, double r8, double r10, java.lang.Long r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0006
            java.lang.String r6 = ""
        L_0x0006:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000d
            r7 = 0
            r14 = 0
            goto L_0x000e
        L_0x000d:
            r14 = r7
        L_0x000e:
            r7 = r13 & 4
            r0 = 0
            if (r7 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r8
        L_0x0017:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r10
        L_0x001d:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0027
            r7 = 0
            java.lang.Long r12 = java.lang.Long.valueOf(r7)
        L_0x0027:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r2
            r12 = r0
            r14 = r4
            r7.<init>(r8, r9, r10, r12, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PageShowLoadingPoint.<init>(java.lang.String, int, double, double, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final Long getLastPoiNotified() {
        return this.lastPoiNotified;
    }

    public final void setLastPoiNotified(@Nullable Long l) {
        this.lastPoiNotified = l;
    }

    public final int hashCode() {
        String str = this.poiId;
        int i = 0;
        int hashCode = (((((((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.radius).hashCode()) * 31) + Double.valueOf(this.longitude).hashCode()) * 31) + Double.valueOf(this.latitude).hashCode()) * 31;
        Long l = this.lastPoiNotified;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
