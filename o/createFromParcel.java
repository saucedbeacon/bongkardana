package o;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.griver.image.framework.meta.BaseReq;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, d2 = {"Lid/dana/data/config/model/Wifi;", "", "bssid", "", "frequency", "", "isCurrent", "", "level", "ssid", "(Ljava/lang/String;IZILjava/lang/String;)V", "getBssid", "()Ljava/lang/String;", "getFrequency", "()I", "()Z", "getLevel", "getSsid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class createFromParcel {
    @Nullable
    private final String bssid;
    private final int frequency;
    private final boolean isCurrent;
    private final int level;
    @NotNull
    private final String ssid;

    public static /* synthetic */ createFromParcel copy$default(createFromParcel createfromparcel, String str, int i, boolean z, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = createfromparcel.bssid;
        }
        if ((i3 & 2) != 0) {
            i = createfromparcel.frequency;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            z = createfromparcel.isCurrent;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            i2 = createfromparcel.level;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str2 = createfromparcel.ssid;
        }
        return createfromparcel.copy(str, i4, z2, i5, str2);
    }

    @Nullable
    public final String component1() {
        return this.bssid;
    }

    public final int component2() {
        return this.frequency;
    }

    public final boolean component3() {
        return this.isCurrent;
    }

    public final int component4() {
        return this.level;
    }

    @NotNull
    public final String component5() {
        return this.ssid;
    }

    @NotNull
    public final createFromParcel copy(@JSONField(name = "bssid") @Nullable String str, @JSONField(name = "frequency") int i, @JSONField(name = "isCurrent") boolean z, @JSONField(name = "level") int i2, @JSONField(name = "ssid") @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, BaseReq.KEY_SSID);
        return new createFromParcel(str, i, z, i2, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createFromParcel)) {
            return false;
        }
        createFromParcel createfromparcel = (createFromParcel) obj;
        return Intrinsics.areEqual((Object) this.bssid, (Object) createfromparcel.bssid) && this.frequency == createfromparcel.frequency && this.isCurrent == createfromparcel.isCurrent && this.level == createfromparcel.level && Intrinsics.areEqual((Object) this.ssid, (Object) createfromparcel.ssid);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Wifi(bssid=");
        sb.append(this.bssid);
        sb.append(", frequency=");
        sb.append(this.frequency);
        sb.append(", isCurrent=");
        sb.append(this.isCurrent);
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", ssid=");
        sb.append(this.ssid);
        sb.append(")");
        return sb.toString();
    }

    public createFromParcel(@JSONField(name = "bssid") @Nullable String str, @JSONField(name = "frequency") int i, @JSONField(name = "isCurrent") boolean z, @JSONField(name = "level") int i2, @JSONField(name = "ssid") @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, BaseReq.KEY_SSID);
        this.bssid = str;
        this.frequency = i;
        this.isCurrent = z;
        this.level = i2;
        this.ssid = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ createFromParcel(String str, int i, boolean z, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, i, z, i2, str2);
    }

    @Nullable
    public final String getBssid() {
        return this.bssid;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public final boolean isCurrent() {
        return this.isCurrent;
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getSsid() {
        return this.ssid;
    }

    public final int hashCode() {
        String str = this.bssid;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.frequency).hashCode()) * 31;
        boolean z = this.isCurrent;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + Integer.valueOf(this.level).hashCode()) * 31;
        String str2 = this.ssid;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}
