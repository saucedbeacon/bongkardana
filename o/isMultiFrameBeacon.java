package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/domain/requestmoney/model/NameCheckConfig;", "", "retryLimit", "", "freezeTime", "(II)V", "getFreezeTime", "()I", "getRetryLimit", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isMultiFrameBeacon {
    private final int freezeTime;
    private final int retryLimit;

    public static /* synthetic */ isMultiFrameBeacon copy$default(isMultiFrameBeacon ismultiframebeacon, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ismultiframebeacon.retryLimit;
        }
        if ((i3 & 2) != 0) {
            i2 = ismultiframebeacon.freezeTime;
        }
        return ismultiframebeacon.copy(i, i2);
    }

    public final int component1() {
        return this.retryLimit;
    }

    public final int component2() {
        return this.freezeTime;
    }

    @NotNull
    public final isMultiFrameBeacon copy(int i, int i2) {
        return new isMultiFrameBeacon(i, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isMultiFrameBeacon)) {
            return false;
        }
        isMultiFrameBeacon ismultiframebeacon = (isMultiFrameBeacon) obj;
        return this.retryLimit == ismultiframebeacon.retryLimit && this.freezeTime == ismultiframebeacon.freezeTime;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NameCheckConfig(retryLimit=");
        sb.append(this.retryLimit);
        sb.append(", freezeTime=");
        sb.append(this.freezeTime);
        sb.append(")");
        return sb.toString();
    }

    public isMultiFrameBeacon(int i, int i2) {
        this.retryLimit = i;
        this.freezeTime = i2;
    }

    public final int getRetryLimit() {
        return this.retryLimit;
    }

    public final int getFreezeTime() {
        return this.freezeTime;
    }

    public final int hashCode() {
        return (Integer.valueOf(this.retryLimit).hashCode() * 31) + Integer.valueOf(this.freezeTime).hashCode();
    }
}
