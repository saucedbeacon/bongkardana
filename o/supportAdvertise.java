package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lid/dana/explore/model/ExploreProductWrapper;", "", "itemType", "", "exploreProductModel", "Lid/dana/explore/model/ExploreProductModel;", "(ILid/dana/explore/model/ExploreProductModel;)V", "getExploreProductModel", "()Lid/dana/explore/model/ExploreProductModel;", "setExploreProductModel", "(Lid/dana/explore/model/ExploreProductModel;)V", "getItemType", "()I", "setItemType", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class supportAdvertise {
    @NotNull
    public static final setMin setMin = new setMin((byte) 0);
    public int getMin;
    @NotNull
    public openBluetooth setMax;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof supportAdvertise)) {
            return false;
        }
        supportAdvertise supportadvertise = (supportAdvertise) obj;
        return this.getMin == supportadvertise.getMin && Intrinsics.areEqual((Object) this.setMax, (Object) supportadvertise.setMax);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExploreProductWrapper(itemType=");
        sb.append(this.getMin);
        sb.append(", exploreProductModel=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public supportAdvertise(int i, @NotNull openBluetooth openbluetooth) {
        Intrinsics.checkNotNullParameter(openbluetooth, "exploreProductModel");
        this.getMin = i;
        this.setMax = openbluetooth;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/explore/model/ExploreProductWrapper$Companion;", "", "()V", "LOADING_SKELETON", "", "PRODUCT_ITEM", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final int hashCode() {
        int hashCode = Integer.valueOf(this.getMin).hashCode() * 31;
        openBluetooth openbluetooth = this.setMax;
        return hashCode + (openbluetooth != null ? openbluetooth.hashCode() : 0);
    }
}
