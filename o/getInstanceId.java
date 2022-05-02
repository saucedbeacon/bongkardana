package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lid/dana/data/nearbyme/model/ShopOpenHourEntity;", "", "()V", "day", "", "openHour", "", "closeHour", "(Ljava/lang/String;JJ)V", "getCloseHour", "()J", "getDay", "()Ljava/lang/String;", "getOpenHour", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toShopOpenHour", "Lid/dana/domain/nearbyme/model/ShopOpenHour;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getInstanceId {
    private final long closeHour;
    @NotNull
    private final String day;
    private final long openHour;

    public static /* synthetic */ getInstanceId copy$default(getInstanceId getinstanceid, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getinstanceid.day;
        }
        if ((i & 2) != 0) {
            j = getinstanceid.openHour;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = getinstanceid.closeHour;
        }
        return getinstanceid.copy(str, j3, j2);
    }

    @NotNull
    public final String component1() {
        return this.day;
    }

    public final long component2() {
        return this.openHour;
    }

    public final long component3() {
        return this.closeHour;
    }

    @NotNull
    public final getInstanceId copy(@NotNull String str, long j, long j2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-256239498, oncanceled);
            onCancelLoad.getMin(-256239498, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "day");
        return new getInstanceId(str, j, j2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInstanceId)) {
            return false;
        }
        getInstanceId getinstanceid = (getInstanceId) obj;
        return Intrinsics.areEqual((Object) this.day, (Object) getinstanceid.day) && this.openHour == getinstanceid.openHour && this.closeHour == getinstanceid.closeHour;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShopOpenHourEntity(day=");
        sb.append(this.day);
        sb.append(", openHour=");
        sb.append(this.openHour);
        sb.append(", closeHour=");
        sb.append(this.closeHour);
        sb.append(")");
        return sb.toString();
    }

    public getInstanceId(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "day");
        this.day = str;
        this.openHour = j;
        this.closeHour = j2;
    }

    @NotNull
    public final String getDay() {
        return this.day;
    }

    public final long getOpenHour() {
        return this.openHour;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getInstanceId(java.lang.String r5, long r6, long r8, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L_0x0006
            java.lang.String r5 = ""
        L_0x0006:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto L_0x000e
            r2 = r0
            goto L_0x000f
        L_0x000e:
            r2 = r6
        L_0x000f:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x0015
            r10 = r0
            goto L_0x0016
        L_0x0015:
            r10 = r8
        L_0x0016:
            r6 = r4
            r7 = r5
            r8 = r2
            r6.<init>(r7, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getInstanceId.<init>(java.lang.String, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final long getCloseHour() {
        return this.closeHour;
    }

    public getInstanceId() {
        this("", 0, 0);
    }

    @NotNull
    public final getWebSetting toShopOpenHour() {
        return new getWebSetting(this.day, this.openHour, this.closeHour);
    }

    public final int hashCode() {
        String str = this.day;
        return ((((str != null ? str.hashCode() : 0) * 31) + Long.valueOf(this.openHour).hashCode()) * 31) + Long.valueOf(this.closeHour).hashCode();
    }
}
