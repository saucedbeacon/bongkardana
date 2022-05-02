package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lid/dana/domain/maintenance/model/BroadcastSavingStateResult;", "", "shouldShowBroadcast", "", "(Z)V", "getShouldShowBroadcast", "()Z", "setShouldShowBroadcast", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class overTime {
    private boolean shouldShowBroadcast;

    public static /* synthetic */ overTime copy$default(overTime overtime, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = overtime.shouldShowBroadcast;
        }
        return overtime.copy(z);
    }

    public final boolean component1() {
        return this.shouldShowBroadcast;
    }

    @NotNull
    public final overTime copy(boolean z) {
        return new overTime(z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof overTime) && this.shouldShowBroadcast == ((overTime) obj).shouldShowBroadcast;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.shouldShowBroadcast;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BroadcastSavingStateResult(shouldShowBroadcast=");
        sb.append(this.shouldShowBroadcast);
        sb.append(")");
        return sb.toString();
    }

    public overTime(boolean z) {
        this.shouldShowBroadcast = z;
    }

    public final boolean getShouldShowBroadcast() {
        return this.shouldShowBroadcast;
    }

    public final void setShouldShowBroadcast(boolean z) {
        this.shouldShowBroadcast = z;
    }
}
