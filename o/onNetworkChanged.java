package o;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/data/config/source/amcs/result/TwilioTimeoutConfigResult;", "Ljava/io/Serializable;", "timeout", "", "counter", "(II)V", "getCounter", "()I", "getTimeout", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onNetworkChanged implements Serializable {
    int counter;
    int timeout;

    public onNetworkChanged() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ onNetworkChanged copy$default(onNetworkChanged onnetworkchanged, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = onnetworkchanged.timeout;
        }
        if ((i3 & 2) != 0) {
            i2 = onnetworkchanged.counter;
        }
        return onnetworkchanged.copy(i, i2);
    }

    public final int component1() {
        return this.timeout;
    }

    public final int component2() {
        return this.counter;
    }

    @NotNull
    public final onNetworkChanged copy(int i, int i2) {
        return new onNetworkChanged(i, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onNetworkChanged)) {
            return false;
        }
        onNetworkChanged onnetworkchanged = (onNetworkChanged) obj;
        return this.timeout == onnetworkchanged.timeout && this.counter == onnetworkchanged.counter;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TwilioTimeoutConfigResult(timeout=");
        sb.append(this.timeout);
        sb.append(", counter=");
        sb.append(this.counter);
        sb.append(")");
        return sb.toString();
    }

    public onNetworkChanged(int i, int i2) {
        this.timeout = i;
        this.counter = i2;
    }

    public final int getTimeout() {
        return this.timeout;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onNetworkChanged(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i, (i3 & 2) != 0 ? 20 : i2);
    }

    public final int getCounter() {
        return this.counter;
    }

    public final int hashCode() {
        return (Integer.valueOf(this.timeout).hashCode() * 31) + Integer.valueOf(this.counter).hashCode();
    }
}
