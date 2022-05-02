package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lid/dana/domain/nearbyme/model/ShopOpenHour;", "", "day", "", "openHour", "", "closeHour", "(Ljava/lang/String;JJ)V", "getCloseHour", "()J", "getDay", "()Ljava/lang/String;", "getOpenHour", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getWebSetting {
    private final long closeHour;
    @NotNull
    private final String day;
    private final long openHour;

    public getWebSetting() {
        this((String) null, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getWebSetting copy$default(getWebSetting getwebsetting, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getwebsetting.day;
        }
        if ((i & 2) != 0) {
            j = getwebsetting.openHour;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = getwebsetting.closeHour;
        }
        return getwebsetting.copy(str, j3, j2);
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
    public final getWebSetting copy(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "day");
        return new getWebSetting(str, j, j2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getWebSetting)) {
            return false;
        }
        getWebSetting getwebsetting = (getWebSetting) obj;
        return Intrinsics.areEqual((Object) this.day, (Object) getwebsetting.day) && this.openHour == getwebsetting.openHour && this.closeHour == getwebsetting.closeHour;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShopOpenHour(day=");
        sb.append(this.day);
        sb.append(", openHour=");
        sb.append(this.openHour);
        sb.append(", closeHour=");
        sb.append(this.closeHour);
        sb.append(")");
        return sb.toString();
    }

    public getWebSetting(@NotNull String str, long j, long j2) {
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
    public /* synthetic */ getWebSetting(java.lang.String r5, long r6, long r8, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: o.getWebSetting.<init>(java.lang.String, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final long getCloseHour() {
        return this.closeHour;
    }

    public final int hashCode() {
        String str = this.day;
        return ((((str != null ? str.hashCode() : 0) * 31) + Long.valueOf(this.openHour).hashCode()) * 31) + Long.valueOf(this.closeHour).hashCode();
    }
}
