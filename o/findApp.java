package o;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lid/dana/data/config/model/PromoAdsConfigResponse;", "", "enable", "", "numberOfItemBatch", "", "(ZI)V", "getEnable", "()Z", "getNumberOfItemBatch", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class findApp {
    private final boolean enable;
    @SerializedName("number_of_item_batch")
    private final int numberOfItemBatch;

    public findApp() {
        this(false, 0, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ findApp copy$default(findApp findapp, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = findapp.enable;
        }
        if ((i2 & 2) != 0) {
            i = findapp.numberOfItemBatch;
        }
        return findapp.copy(z, i);
    }

    public final boolean component1() {
        return this.enable;
    }

    public final int component2() {
        return this.numberOfItemBatch;
    }

    @NotNull
    public final findApp copy(boolean z, @JSONField(name = "number_of_item_batch") int i) {
        return new findApp(z, i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findApp)) {
            return false;
        }
        findApp findapp = (findApp) obj;
        return this.enable == findapp.enable && this.numberOfItemBatch == findapp.numberOfItemBatch;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoAdsConfigResponse(enable=");
        sb.append(this.enable);
        sb.append(", numberOfItemBatch=");
        sb.append(this.numberOfItemBatch);
        sb.append(")");
        return sb.toString();
    }

    public findApp(boolean z, @JSONField(name = "number_of_item_batch") int i) {
        this.enable = z;
        this.numberOfItemBatch = i;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ findApp(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 5 : i);
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
