package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lid/dana/domain/saving/model/SavingDetail;", "", "savingGoalView", "Lid/dana/domain/saving/model/SavingGoalView;", "topUpViews", "", "Lid/dana/domain/saving/model/TopUpView;", "hasNext", "", "(Lid/dana/domain/saving/model/SavingGoalView;Ljava/util/List;Z)V", "getHasNext", "()Z", "getSavingGoalView", "()Lid/dana/domain/saving/model/SavingGoalView;", "getTopUpViews", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setRegionExitPeriod {
    private final boolean hasNext;
    @NotNull
    private final BeaconManager savingGoalView;
    @NotNull
    private final List<setRssiFilterImplClass> topUpViews;

    public static /* synthetic */ setRegionExitPeriod copy$default(setRegionExitPeriod setregionexitperiod, BeaconManager beaconManager, List<setRssiFilterImplClass> list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            beaconManager = setregionexitperiod.savingGoalView;
        }
        if ((i & 2) != 0) {
            list = setregionexitperiod.topUpViews;
        }
        if ((i & 4) != 0) {
            z = setregionexitperiod.hasNext;
        }
        return setregionexitperiod.copy(beaconManager, list, z);
    }

    @NotNull
    public final BeaconManager component1() {
        return this.savingGoalView;
    }

    @NotNull
    public final List<setRssiFilterImplClass> component2() {
        return this.topUpViews;
    }

    public final boolean component3() {
        return this.hasNext;
    }

    @NotNull
    public final setRegionExitPeriod copy(@NotNull BeaconManager beaconManager, @NotNull List<setRssiFilterImplClass> list, boolean z) {
        Intrinsics.checkNotNullParameter(beaconManager, "savingGoalView");
        Intrinsics.checkNotNullParameter(list, "topUpViews");
        return new setRegionExitPeriod(beaconManager, list, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRegionExitPeriod)) {
            return false;
        }
        setRegionExitPeriod setregionexitperiod = (setRegionExitPeriod) obj;
        return Intrinsics.areEqual((Object) this.savingGoalView, (Object) setregionexitperiod.savingGoalView) && Intrinsics.areEqual((Object) this.topUpViews, (Object) setregionexitperiod.topUpViews) && this.hasNext == setregionexitperiod.hasNext;
    }

    public final int hashCode() {
        BeaconManager beaconManager = this.savingGoalView;
        int i = 0;
        int hashCode = (beaconManager != null ? beaconManager.hashCode() : 0) * 31;
        List<setRssiFilterImplClass> list = this.topUpViews;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.hasNext;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingDetail(savingGoalView=");
        sb.append(this.savingGoalView);
        sb.append(", topUpViews=");
        sb.append(this.topUpViews);
        sb.append(", hasNext=");
        sb.append(this.hasNext);
        sb.append(")");
        return sb.toString();
    }

    public setRegionExitPeriod(@NotNull BeaconManager beaconManager, @NotNull List<setRssiFilterImplClass> list, boolean z) {
        Intrinsics.checkNotNullParameter(beaconManager, "savingGoalView");
        Intrinsics.checkNotNullParameter(list, "topUpViews");
        this.savingGoalView = beaconManager;
        this.topUpViews = list;
        this.hasNext = z;
    }

    @NotNull
    public final BeaconManager getSavingGoalView() {
        return this.savingGoalView;
    }

    @NotNull
    public final List<setRssiFilterImplClass> getTopUpViews() {
        return this.topUpViews;
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }
}
