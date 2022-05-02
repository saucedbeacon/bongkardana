package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lid/dana/domain/promocenter/model/PromoAdsConfig;", "", "enable", "", "numberOfItemBatch", "", "(ZI)V", "getEnable", "()Z", "getNumberOfItemBatch", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverRVResourceManagerImpl {
    private final boolean enable;
    private final int numberOfItemBatch;

    public static /* synthetic */ GriverRVResourceManagerImpl copy$default(GriverRVResourceManagerImpl griverRVResourceManagerImpl, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = griverRVResourceManagerImpl.enable;
        }
        if ((i2 & 2) != 0) {
            i = griverRVResourceManagerImpl.numberOfItemBatch;
        }
        return griverRVResourceManagerImpl.copy(z, i);
    }

    public final boolean component1() {
        return this.enable;
    }

    public final int component2() {
        return this.numberOfItemBatch;
    }

    @NotNull
    public final GriverRVResourceManagerImpl copy(boolean z, int i) {
        return new GriverRVResourceManagerImpl(z, i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverRVResourceManagerImpl)) {
            return false;
        }
        GriverRVResourceManagerImpl griverRVResourceManagerImpl = (GriverRVResourceManagerImpl) obj;
        return this.enable == griverRVResourceManagerImpl.enable && this.numberOfItemBatch == griverRVResourceManagerImpl.numberOfItemBatch;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoAdsConfig(enable=");
        sb.append(this.enable);
        sb.append(", numberOfItemBatch=");
        sb.append(this.numberOfItemBatch);
        sb.append(")");
        return sb.toString();
    }

    public GriverRVResourceManagerImpl(boolean z, int i) {
        this.enable = z;
        this.numberOfItemBatch = i;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getNumberOfItemBatch() {
        return this.numberOfItemBatch;
    }

    public final int hashCode() {
        boolean z = this.enable;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + Integer.valueOf(this.numberOfItemBatch).hashCode();
    }
}
