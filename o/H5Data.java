package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lid/dana/domain/geofence/model/Poi;", "", "poiId", "", "latitude", "", "longitude", "radius", "", "(Ljava/lang/String;DDI)V", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "getPoiId", "()Ljava/lang/String;", "setPoiId", "(Ljava/lang/String;)V", "getRadius", "()I", "setRadius", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class H5Data {
    private double latitude;
    private double longitude;
    @NotNull
    private String poiId;
    private int radius;

    public H5Data() {
        this((String) null, 0.0d, 0.0d, 0, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ H5Data copy$default(H5Data h5Data, String str, double d, double d2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = h5Data.poiId;
        }
        if ((i2 & 2) != 0) {
            d = h5Data.latitude;
        }
        double d3 = d;
        if ((i2 & 4) != 0) {
            d2 = h5Data.longitude;
        }
        double d4 = d2;
        if ((i2 & 8) != 0) {
            i = h5Data.radius;
        }
        return h5Data.copy(str, d3, d4, i);
    }

    @NotNull
    public final String component1() {
        return this.poiId;
    }

    public final double component2() {
        return this.latitude;
    }

    public final double component3() {
        return this.longitude;
    }

    public final int component4() {
        return this.radius;
    }

    @NotNull
    public final H5Data copy(@NotNull String str, double d, double d2, int i) {
        Intrinsics.checkNotNullParameter(str, "poiId");
        return new H5Data(str, d, d2, i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H5Data)) {
            return false;
        }
        H5Data h5Data = (H5Data) obj;
        return Intrinsics.areEqual((Object) this.poiId, (Object) h5Data.poiId) && Double.compare(this.latitude, h5Data.latitude) == 0 && Double.compare(this.longitude, h5Data.longitude) == 0 && this.radius == h5Data.radius;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Poi(poiId=");
        sb.append(this.poiId);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.append(")");
        return sb.toString();
    }

    public H5Data(@NotNull String str, double d, double d2, int i) {
        Intrinsics.checkNotNullParameter(str, "poiId");
        this.poiId = str;
        this.latitude = d;
        this.longitude = d2;
        this.radius = i;
    }

    @NotNull
    public final String getPoiId() {
        return this.poiId;
    }

    public final void setPoiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.poiId = str;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ H5Data(java.lang.String r5, double r6, double r8, int r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.lang.String r5 = ""
        L_0x0006:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto L_0x000e
            r2 = r0
            goto L_0x000f
        L_0x000e:
            r2 = r6
        L_0x000f:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = r8
        L_0x0015:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001c
            r10 = 0
            r12 = 0
            goto L_0x001d
        L_0x001c:
            r12 = r10
        L_0x001d:
            r6 = r4
            r7 = r5
            r8 = r2
            r10 = r0
            r6.<init>(r7, r8, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.H5Data.<init>(java.lang.String, double, double, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getRadius() {
        return this.radius;
    }

    public final void setRadius(int i) {
        this.radius = i;
    }

    public final int hashCode() {
        String str = this.poiId;
        return ((((((str != null ? str.hashCode() : 0) * 31) + Double.valueOf(this.latitude).hashCode()) * 31) + Double.valueOf(this.longitude).hashCode()) * 31) + Integer.valueOf(this.radius).hashCode();
    }
}
