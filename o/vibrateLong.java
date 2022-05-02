package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lid/dana/onboarding/referral/model/ReferralEngagementDialogModel;", "", "showDialog", "", "dialogTitle", "", "dialogDescription", "timerDuration", "", "scenario", "(ZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getDialogDescription", "()Ljava/lang/String;", "getDialogTitle", "getScenario", "getShowDialog", "()Z", "getTimerDuration", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class vibrateLong {
    private final boolean getMax;
    @NotNull
    public final String getMin;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    public final long setMin;

    public vibrateLong() {
        this((byte) 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vibrateLong)) {
            return false;
        }
        vibrateLong vibratelong = (vibrateLong) obj;
        return this.getMax == vibratelong.getMax && Intrinsics.areEqual((Object) this.getMin, (Object) vibratelong.getMin) && Intrinsics.areEqual((Object) this.length, (Object) vibratelong.length) && this.setMin == vibratelong.setMin && Intrinsics.areEqual((Object) this.setMax, (Object) vibratelong.setMax);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReferralEngagementDialogModel(showDialog=");
        sb.append(this.getMax);
        sb.append(", dialogTitle=");
        sb.append(this.getMin);
        sb.append(", dialogDescription=");
        sb.append(this.length);
        sb.append(", timerDuration=");
        sb.append(this.setMin);
        sb.append(", scenario=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public vibrateLong(boolean z, @NotNull String str, @NotNull String str2, long j, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "dialogTitle");
        Intrinsics.checkNotNullParameter(str2, "dialogDescription");
        Intrinsics.checkNotNullParameter(str3, "scenario");
        this.getMax = z;
        this.getMin = str;
        this.length = str2;
        this.setMin = j;
        this.setMax = str3;
    }

    public final boolean setMin() {
        return this.getMax;
    }

    private /* synthetic */ vibrateLong(byte b) {
        this(false, "", "", -1, "NPS");
    }

    public final int hashCode() {
        boolean z = this.getMax;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.getMin;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.length;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.valueOf(this.setMin).hashCode()) * 31;
        String str3 = this.setMax;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }
}
