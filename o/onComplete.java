package o;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lid/dana/data/config/source/amcs/result/GeofenceConfigResult;", "Ljava/io/Serializable;", "enable", "", "cachedInterval", "", "maxRetry", "(ZII)V", "getCachedInterval", "()I", "getEnable", "()Z", "getMaxRetry", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onComplete implements Serializable {
    int cachedInterval;
    boolean enable;
    int maxRetry;

    public onComplete() {
        this(false, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ onComplete copy$default(onComplete oncomplete, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = oncomplete.enable;
        }
        if ((i3 & 2) != 0) {
            i = oncomplete.cachedInterval;
        }
        if ((i3 & 4) != 0) {
            i2 = oncomplete.maxRetry;
        }
        return oncomplete.copy(z, i, i2);
    }

    public final boolean component1() {
        return this.enable;
    }

    public final int component2() {
        return this.cachedInterval;
    }

    public final int component3() {
        return this.maxRetry;
    }

    @NotNull
    public final onComplete copy(boolean z, int i, int i2) {
        return new onComplete(z, i, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onComplete)) {
            return false;
        }
        onComplete oncomplete = (onComplete) obj;
        return this.enable == oncomplete.enable && this.cachedInterval == oncomplete.cachedInterval && this.maxRetry == oncomplete.maxRetry;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GeofenceConfigResult(enable=");
        sb.append(this.enable);
        sb.append(", cachedInterval=");
        sb.append(this.cachedInterval);
        sb.append(", maxRetry=");
        sb.append(this.maxRetry);
        sb.append(")");
        return sb.toString();
    }

    public onComplete(boolean z, int i, int i2) {
        this.enable = z;
        this.cachedInterval = i;
        this.maxRetry = i2;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getCachedInterval() {
        return this.cachedInterval;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onComplete(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    public final int getMaxRetry() {
        return this.maxRetry;
    }

    public final int hashCode() {
        boolean z = this.enable;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + Integer.valueOf(this.cachedInterval).hashCode()) * 31) + Integer.valueOf(this.maxRetry).hashCode();
    }
}
