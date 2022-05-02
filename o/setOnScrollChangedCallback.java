package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lid/dana/domain/featureconfig/model/GeofenceConfig;", "", "isFeatureEnable", "", "cachedInterval", "", "maxRetry", "(ZII)V", "getCachedInterval", "()I", "()Z", "getMaxRetry", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setOnScrollChangedCallback {
    private final int cachedInterval;
    private final boolean isFeatureEnable;
    private final int maxRetry;

    public static /* synthetic */ setOnScrollChangedCallback copy$default(setOnScrollChangedCallback setonscrollchangedcallback, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = setonscrollchangedcallback.isFeatureEnable;
        }
        if ((i3 & 2) != 0) {
            i = setonscrollchangedcallback.cachedInterval;
        }
        if ((i3 & 4) != 0) {
            i2 = setonscrollchangedcallback.maxRetry;
        }
        return setonscrollchangedcallback.copy(z, i, i2);
    }

    public final boolean component1() {
        return this.isFeatureEnable;
    }

    public final int component2() {
        return this.cachedInterval;
    }

    public final int component3() {
        return this.maxRetry;
    }

    @NotNull
    public final setOnScrollChangedCallback copy(boolean z, int i, int i2) {
        return new setOnScrollChangedCallback(z, i, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnScrollChangedCallback)) {
            return false;
        }
        setOnScrollChangedCallback setonscrollchangedcallback = (setOnScrollChangedCallback) obj;
        return this.isFeatureEnable == setonscrollchangedcallback.isFeatureEnable && this.cachedInterval == setonscrollchangedcallback.cachedInterval && this.maxRetry == setonscrollchangedcallback.maxRetry;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GeofenceConfig(isFeatureEnable=");
        sb.append(this.isFeatureEnable);
        sb.append(", cachedInterval=");
        sb.append(this.cachedInterval);
        sb.append(", maxRetry=");
        sb.append(this.maxRetry);
        sb.append(")");
        return sb.toString();
    }

    public setOnScrollChangedCallback(boolean z, int i, int i2) {
        this.isFeatureEnable = z;
        this.cachedInterval = i;
        this.maxRetry = i2;
    }

    public final boolean isFeatureEnable() {
        return this.isFeatureEnable;
    }

    public final int getCachedInterval() {
        return this.cachedInterval;
    }

    public final int getMaxRetry() {
        return this.maxRetry;
    }

    public final int hashCode() {
        boolean z = this.isFeatureEnable;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + Integer.valueOf(this.cachedInterval).hashCode()) * 31) + Integer.valueOf(this.maxRetry).hashCode();
    }
}
