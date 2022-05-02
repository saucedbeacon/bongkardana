package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/lib/electronicmoney/mandiri/model/EmoneyRequest;", "", "enable", "", "(Z)V", "getEnable", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
public final class hideOptionMenu {
    public final boolean getMin;

    public hideOptionMenu() {
        this((byte) 0);
    }

    private /* synthetic */ hideOptionMenu(byte b) {
        this(false);
    }

    public hideOptionMenu(boolean z) {
        this.getMin = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof hideOptionMenu) && this.getMin == ((hideOptionMenu) obj).getMin;
        }
        return true;
    }

    public final boolean getMax() {
        return this.getMin;
    }

    public final int hashCode() {
        boolean z = this.getMin;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EmoneyRequest(enable=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }
}
