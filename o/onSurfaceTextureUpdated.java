package o;

import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.requestmoney.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lid/dana/savings/model/SavingTopUpInitModel;", "", "maxAmount", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "currentAmount", "targetAmount", "(Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;)V", "getCurrentAmount", "()Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "getMaxAmount", "getTargetAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onSurfaceTextureUpdated {
    @NotNull
    public final MoneyViewModel getMax;
    @NotNull
    private final MoneyViewModel getMin;
    @NotNull
    private final MoneyViewModel length;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onSurfaceTextureUpdated)) {
            return false;
        }
        onSurfaceTextureUpdated onsurfacetextureupdated = (onSurfaceTextureUpdated) obj;
        return Intrinsics.areEqual((Object) this.getMax, (Object) onsurfacetextureupdated.getMax) && Intrinsics.areEqual((Object) this.getMin, (Object) onsurfacetextureupdated.getMin) && Intrinsics.areEqual((Object) this.length, (Object) onsurfacetextureupdated.length);
    }

    public final int hashCode() {
        MoneyViewModel moneyViewModel = this.getMax;
        int i = 0;
        int hashCode = (moneyViewModel != null ? moneyViewModel.hashCode() : 0) * 31;
        MoneyViewModel moneyViewModel2 = this.getMin;
        int hashCode2 = (hashCode + (moneyViewModel2 != null ? moneyViewModel2.hashCode() : 0)) * 31;
        MoneyViewModel moneyViewModel3 = this.length;
        if (moneyViewModel3 != null) {
            i = moneyViewModel3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingTopUpInitModel(maxAmount=");
        sb.append(this.getMax);
        sb.append(", currentAmount=");
        sb.append(this.getMin);
        sb.append(", targetAmount=");
        sb.append(this.length);
        sb.append(")");
        return sb.toString();
    }

    public onSurfaceTextureUpdated(@NotNull MoneyViewModel moneyViewModel, @NotNull MoneyViewModel moneyViewModel2, @NotNull MoneyViewModel moneyViewModel3) {
        Intrinsics.checkNotNullParameter(moneyViewModel, BundleKey.MAXIMUM_AMOUNT);
        Intrinsics.checkNotNullParameter(moneyViewModel2, "currentAmount");
        Intrinsics.checkNotNullParameter(moneyViewModel3, "targetAmount");
        this.getMax = moneyViewModel;
        this.getMin = moneyViewModel2;
        this.length = moneyViewModel3;
    }
}
