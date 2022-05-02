package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lid/dana/domain/nearbyme/model/NearbyAutoSearchConfig;", "", "enabled", "", "interval", "", "threshold", "(ZII)V", "getEnabled", "()Z", "getInterval", "()I", "getThreshold", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getCacheDir {
    private final boolean enabled;
    private final int interval;
    private final int threshold;

    public static /* synthetic */ getCacheDir copy$default(getCacheDir getcachedir, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = getcachedir.enabled;
        }
        if ((i3 & 2) != 0) {
            i = getcachedir.interval;
        }
        if ((i3 & 4) != 0) {
            i2 = getcachedir.threshold;
        }
        return getcachedir.copy(z, i, i2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final int component2() {
        return this.interval;
    }

    public final int component3() {
        return this.threshold;
    }

    @NotNull
    public final getCacheDir copy(boolean z, int i, int i2) {
        return new getCacheDir(z, i, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCacheDir)) {
            return false;
        }
        getCacheDir getcachedir = (getCacheDir) obj;
        return this.enabled == getcachedir.enabled && this.interval == getcachedir.interval && this.threshold == getcachedir.threshold;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyAutoSearchConfig(enabled=");
        sb.append(this.enabled);
        sb.append(", interval=");
        sb.append(this.interval);
        sb.append(", threshold=");
        sb.append(this.threshold);
        sb.append(")");
        return sb.toString();
    }

    public getCacheDir(boolean z, int i, int i2) {
        this.enabled = z;
        this.interval = i;
        this.threshold = i2;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getInterval() {
        return this.interval;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    public final int hashCode() {
        boolean z = this.enabled;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + Integer.valueOf(this.interval).hashCode()) * 31) + Integer.valueOf(this.threshold).hashCode();
    }
}
