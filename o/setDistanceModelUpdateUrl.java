package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J\t\u0010\u0017\u001a\u00020\u000bHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lid/dana/domain/saving/model/SavingUpdateInit;", "", "categoryCodes", "", "", "savingCategories", "", "Lid/dana/domain/saving/model/SavingCategory;", "maxTargetAmount", "Lid/dana/domain/nearbyme/model/MoneyView;", "savingGoalView", "Lid/dana/domain/saving/model/SavingGoalView;", "(Ljava/util/List;Ljava/util/List;Lid/dana/domain/nearbyme/model/MoneyView;Lid/dana/domain/saving/model/SavingGoalView;)V", "getCategoryCodes", "()Ljava/util/List;", "getMaxTargetAmount", "()Lid/dana/domain/nearbyme/model/MoneyView;", "getSavingCategories", "getSavingGoalView", "()Lid/dana/domain/saving/model/SavingGoalView;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setDistanceModelUpdateUrl {
    @NotNull
    private final List<String> categoryCodes;
    @NotNull
    private final getAppDir maxTargetAmount;
    @NotNull
    private final List<setDebug> savingCategories;
    @NotNull
    private final BeaconManager savingGoalView;

    public static /* synthetic */ setDistanceModelUpdateUrl copy$default(setDistanceModelUpdateUrl setdistancemodelupdateurl, List<String> list, List<setDebug> list2, getAppDir getappdir, BeaconManager beaconManager, int i, Object obj) {
        if ((i & 1) != 0) {
            list = setdistancemodelupdateurl.categoryCodes;
        }
        if ((i & 2) != 0) {
            list2 = setdistancemodelupdateurl.savingCategories;
        }
        if ((i & 4) != 0) {
            getappdir = setdistancemodelupdateurl.maxTargetAmount;
        }
        if ((i & 8) != 0) {
            beaconManager = setdistancemodelupdateurl.savingGoalView;
        }
        return setdistancemodelupdateurl.copy(list, list2, getappdir, beaconManager);
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
    public final BeaconManager component4() {
        return this.savingGoalView;
    }

    @NotNull
    public final setDistanceModelUpdateUrl copy(@NotNull List<String> list, @NotNull List<setDebug> list2, @NotNull getAppDir getappdir, @NotNull BeaconManager beaconManager) {
        Intrinsics.checkNotNullParameter(list, "categoryCodes");
        Intrinsics.checkNotNullParameter(list2, "savingCategories");
        Intrinsics.checkNotNullParameter(getappdir, "maxTargetAmount");
        Intrinsics.checkNotNullParameter(beaconManager, "savingGoalView");
        return new setDistanceModelUpdateUrl(list, list2, getappdir, beaconManager);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDistanceModelUpdateUrl)) {
            return false;
        }
        setDistanceModelUpdateUrl setdistancemodelupdateurl = (setDistanceModelUpdateUrl) obj;
        return Intrinsics.areEqual((Object) this.categoryCodes, (Object) setdistancemodelupdateurl.categoryCodes) && Intrinsics.areEqual((Object) this.savingCategories, (Object) setdistancemodelupdateurl.savingCategories) && Intrinsics.areEqual((Object) this.maxTargetAmount, (Object) setdistancemodelupdateurl.maxTargetAmount) && Intrinsics.areEqual((Object) this.savingGoalView, (Object) setdistancemodelupdateurl.savingGoalView);
    }

    public final int hashCode() {
        List<String> list = this.categoryCodes;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<setDebug> list2 = this.savingCategories;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        getAppDir getappdir = this.maxTargetAmount;
        int hashCode3 = (hashCode2 + (getappdir != null ? getappdir.hashCode() : 0)) * 31;
        BeaconManager beaconManager = this.savingGoalView;
        if (beaconManager != null) {
            i = beaconManager.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingUpdateInit(categoryCodes=");
        sb.append(this.categoryCodes);
        sb.append(", savingCategories=");
        sb.append(this.savingCategories);
        sb.append(", maxTargetAmount=");
        sb.append(this.maxTargetAmount);
        sb.append(", savingGoalView=");
        sb.append(this.savingGoalView);
        sb.append(")");
        return sb.toString();
    }

    public setDistanceModelUpdateUrl(@NotNull List<String> list, @NotNull List<setDebug> list2, @NotNull getAppDir getappdir, @NotNull BeaconManager beaconManager) {
        Intrinsics.checkNotNullParameter(list, "categoryCodes");
        Intrinsics.checkNotNullParameter(list2, "savingCategories");
        Intrinsics.checkNotNullParameter(getappdir, "maxTargetAmount");
        Intrinsics.checkNotNullParameter(beaconManager, "savingGoalView");
        this.categoryCodes = list;
        this.savingCategories = list2;
        this.maxTargetAmount = getappdir;
        this.savingGoalView = beaconManager;
    }

    @NotNull
    public final List<String> getCategoryCodes() {
        return this.categoryCodes;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setDistanceModelUpdateUrl(List list, List list2, getAppDir getappdir, BeaconManager beaconManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? new ArrayList() : list2, getappdir, beaconManager);
    }

    @NotNull
    public final List<setDebug> getSavingCategories() {
        return this.savingCategories;
    }

    @NotNull
    public final getAppDir getMaxTargetAmount() {
        return this.maxTargetAmount;
    }

    @NotNull
    public final BeaconManager getSavingGoalView() {
        return this.savingGoalView;
    }
}
