package o;

import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.savings.model.SavingCategoryModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lid/dana/savings/model/SavingCreateInitModel;", "", "categoryCodes", "", "", "savingCategories", "Lid/dana/savings/model/SavingCategoryModel;", "maxTargetAmount", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "(Ljava/util/List;Ljava/util/List;Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;)V", "getCategoryCodes", "()Ljava/util/List;", "getMaxTargetAmount", "()Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "getSavingCategories", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setViewType {
    @NotNull
    public final MoneyViewModel getMin;
    @NotNull
    private final List<String> length;
    @NotNull
    public final List<SavingCategoryModel> setMax;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setViewType)) {
            return false;
        }
        setViewType setviewtype = (setViewType) obj;
        return Intrinsics.areEqual((Object) this.length, (Object) setviewtype.length) && Intrinsics.areEqual((Object) this.setMax, (Object) setviewtype.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) setviewtype.getMin);
    }

    public final int hashCode() {
        List<String> list = this.length;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<SavingCategoryModel> list2 = this.setMax;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        MoneyViewModel moneyViewModel = this.getMin;
        if (moneyViewModel != null) {
            i = moneyViewModel.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingCreateInitModel(categoryCodes=");
        sb.append(this.length);
        sb.append(", savingCategories=");
        sb.append(this.setMax);
        sb.append(", maxTargetAmount=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public setViewType(@NotNull List<String> list, @NotNull List<SavingCategoryModel> list2, @NotNull MoneyViewModel moneyViewModel) {
        Intrinsics.checkNotNullParameter(list, "categoryCodes");
        Intrinsics.checkNotNullParameter(list2, "savingCategories");
        Intrinsics.checkNotNullParameter(moneyViewModel, "maxTargetAmount");
        this.length = list;
        this.setMax = list2;
        this.getMin = moneyViewModel;
    }
}
