package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lid/dana/data/geofence/model/PoiInfoEntity;", "", "poiId", "", "longitude", "", "latitude", "radius", "", "(Ljava/lang/String;DDI)V", "getLatitude", "()D", "getLongitude", "getPoiId", "()Ljava/lang/String;", "getRadius", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onBlankScreen {
    private final double latitude;
    private final double longitude;
    @NotNull
    private final String poiId;
    private final int radius;

    public onBlankScreen() {
        this((String) null, 0.0d, 0.0d, 0, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ onBlankScreen copy$default(onBlankScreen onblankscreen, String str, double d, double d2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = onblankscreen.poiId;
        }
        if ((i2 & 2) != 0) {
            d = onblankscreen.longitude;
        }
        double d3 = d;
        if ((i2 & 4) != 0) {
            d2 = onblankscreen.latitude;
        }
        double d4 = d2;
        if ((i2 & 8) != 0) {
            i = onblankscreen.radius;
        }
        return onblankscreen.copy(str, d3, d4, i);
    }

    @NotNull
    public final String component1() {
        return this.poiId;
    }

    public final double component2() {
        return this.longitude;
    }

    public final double component3() {
        return this.latitude;
    }

    public final int component4() {
        return this.radius;
    }

    @NotNull
    public final onBlankScreen copy(@NotNull String str, double d, double d2, int i) {
        Intrinsics.checkNotNullParameter(str, "poiId");
        return new onBlankScreen(str, d, d2, i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onBlankScreen)) {
            return false;
        }
        onBlankScreen onblankscreen = (onBlankScreen) obj;
        return Intrinsics.areEqual((Object) this.poiId, (Object) onblankscreen.poiId) && Double.compare(this.longitude, onblankscreen.longitude) == 0 && Double.compare(this.latitude, onblankscreen.latitude) == 0 && this.radius == onblankscreen.radius;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiInfoEntity(poiId=");
        sb.append(this.poiId);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.append(")");
        return sb.toString();
    }

    public onBlankScreen(@NotNull String str, double d, double d2, int i) {
        Intrinsics.checkNotNullParameter(str, "poiId");
        this.poiId = str;
        this.longitude = d;
        this.latitude = d2;
        this.radius = i;
    }

    @NotNull
    public final String getPoiId() {
        return this.poiId;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ onBlankScreen(java.lang.String r5, double r6, double r8, int r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
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
            if (r6 == 0) goto L_0x001e
            r10 = 100
            r12 = 100
            goto L_0x001f
        L_0x001e:
            r12 = r10
        L_0x001f:
            r6 = r4
            r7 = r5
            r8 = r2
            r10 = r0
            r6.<init>(r7, r8, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onBlankScreen.<init>(java.lang.String, double, double, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getRadius() {
        return this.radius;
    }

    public final int hashCode() {
        String str = this.poiId;
        return ((((((str != null ? str.hashCode() : 0) * 31) + Double.valueOf(this.longitude).hashCode()) * 31) + Double.valueOf(this.latitude).hashCode()) * 31) + Integer.valueOf(this.radius).hashCode();
    }
}
