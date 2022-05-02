package id.dana.data.nearbyme.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/data/nearbyme/model/MerchantConfigEntity;", "", "enable", "", "(Z)V", "getEnable", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class MerchantConfigEntity {
    public boolean enable;

    public /* synthetic */ MerchantConfigEntity() {
    }

    public static /* synthetic */ MerchantConfigEntity copy$default(MerchantConfigEntity merchantConfigEntity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = merchantConfigEntity.enable;
        }
        return merchantConfigEntity.copy(z);
    }

    public final boolean component1() {
        return this.enable;
    }

    @NotNull
    public final MerchantConfigEntity copy(boolean z) {
        return new MerchantConfigEntity(z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof MerchantConfigEntity) && this.enable == ((MerchantConfigEntity) obj).enable;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.enable;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantConfigEntity(enable=");
        sb.append(this.enable);
        sb.append(")");
        return sb.toString();
    }

    public MerchantConfigEntity(boolean z) {
        this.enable = z;
    }

    public final boolean getEnable() {
        return this.enable;
    }
}
