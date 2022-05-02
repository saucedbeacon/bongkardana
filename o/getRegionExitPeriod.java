package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001a"}, d2 = {"Lid/dana/domain/saving/model/SavingCreateInit;", "", "categoryCodes", "", "", "savingCategories", "", "Lid/dana/domain/saving/model/SavingCategory;", "maxTargetAmount", "Lid/dana/domain/nearbyme/model/MoneyView;", "(Ljava/util/List;Ljava/util/List;Lid/dana/domain/nearbyme/model/MoneyView;)V", "getCategoryCodes", "()Ljava/util/List;", "getMaxTargetAmount", "()Lid/dana/domain/nearbyme/model/MoneyView;", "getSavingCategories", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getRegionExitPeriod {
    @NotNull
    private final List<String> categoryCodes;
    @NotNull
    private final getAppDir maxTargetAmount;
    @NotNull
    private final List<setDebug> savingCategories;

    public static /* synthetic */ getRegionExitPeriod copy$default(getRegionExitPeriod getregionexitperiod, List<String> list, List<setDebug> list2, getAppDir getappdir, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getregionexitperiod.categoryCodes;
        }
        if ((i & 2) != 0) {
            list2 = getregionexitperiod.savingCategories;
        }
        if ((i & 4) != 0) {
            getappdir = getregionexitperiod.maxTargetAmount;
        }
        return getregionexitperiod.copy(list, list2, getappdir);
    }

    @NotNull
    public final List<String> component1() {
        return this.categoryCodes;
    }

    @NotNull
    public final List<setDebug> component2() {
        return this.savingCategories;
    }

    @NotNull
    public final getAppDir component3() {
        return this.maxTargetAmount;
    }

    @NotNull
    public final getRegionExitPeriod copy(@NotNull List<String> list, @NotNull List<setDebug> list2, @NotNull getAppDir getappdir) {
        Intrinsics.checkNotNullParameter(list, "categoryCodes");
        Intrinsics.checkNotNullParameter(list2, "savingCategories");
        Intrinsics.checkNotNullParameter(getappdir, "maxTargetAmount");
        return new getRegionExitPeriod(list, list2, getappdir);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRegionExitPeriod)) {
            return false;
        }
        getRegionExitPeriod getregionexitperiod = (getRegionExitPeriod) obj;
        return Intrinsics.areEqual((Object) this.categoryCodes, (Object) getregionexitperiod.categoryCodes) && Intrinsics.areEqual((Object) this.savingCategories, (Object) getregionexitperiod.savingCategories) && Intrinsics.areEqual((Object) this.maxTargetAmount, (Object) getregionexitperiod.maxTargetAmount);
    }

    public final int hashCode() {
        List<String> list = this.categoryCodes;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<setDebug> list2 = this.savingCategories;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        getAppDir getappdir = this.maxTargetAmount;
        if (getappdir != null) {
            i = getappdir.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingCreateInit(categoryCodes=");
        sb.append(this.categoryCodes);
        sb.append(", savingCategories=");
        sb.append(this.savingCategories);
        sb.append(", maxTargetAmount=");
        sb.append(this.maxTargetAmount);
        sb.append(")");
        return sb.toString();
    }

    public getRegionExitPeriod(@NotNull List<String> list, @NotNull List<setDebug> list2, @NotNull getAppDir getappdir) {
        Intrinsics.checkNotNullParameter(list, "categoryCodes");
        Intrinsics.checkNotNullParameter(list2, "savingCategories");
        Intrinsics.checkNotNullParameter(getappdir, "maxTargetAmount");
        this.categoryCodes = list;
        this.savingCategories = list2;
        this.maxTargetAmount = getappdir;
    }

    @NotNull
    public final List<String> getCategoryCodes() {
        return this.categoryCodes;
    }

    @NotNull
    public final List<setDebug> getSavingCategories() {
        return this.savingCategories;
    }

    @NotNull
    public final getAppDir getMaxTargetAmount() {
        return this.maxTargetAmount;
    }
}
