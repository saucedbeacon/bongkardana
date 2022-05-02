package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lid/dana/domain/saving/model/SavingWithdrawInitResult;", "", "savingGoalView", "Lid/dana/domain/saving/model/SavingGoalView;", "savingGoalWithdrawMethods", "", "Lid/dana/domain/saving/model/SavingGoalWithdrawMethod;", "(Lid/dana/domain/saving/model/SavingGoalView;Ljava/util/List;)V", "getSavingGoalView", "()Lid/dana/domain/saving/model/SavingGoalView;", "getSavingGoalWithdrawMethods", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setUseTrackingCache {
    @NotNull
    private final BeaconManager savingGoalView;
    @NotNull
    private final List<getRssiFilterImplClass> savingGoalWithdrawMethods;

    public static /* synthetic */ setUseTrackingCache copy$default(setUseTrackingCache setusetrackingcache, BeaconManager beaconManager, List<getRssiFilterImplClass> list, int i, Object obj) {
        if ((i & 1) != 0) {
            beaconManager = setusetrackingcache.savingGoalView;
        }
        if ((i & 2) != 0) {
            list = setusetrackingcache.savingGoalWithdrawMethods;
        }
        return setusetrackingcache.copy(beaconManager, list);
    }

    @NotNull
    public final BeaconManager component1() {
        return this.savingGoalView;
    }

    @NotNull
    public final List<getRssiFilterImplClass> component2() {
        return this.savingGoalWithdrawMethods;
    }

    @NotNull
    public final setUseTrackingCache copy(@NotNull BeaconManager beaconManager, @NotNull List<getRssiFilterImplClass> list) {
        Intrinsics.checkNotNullParameter(beaconManager, "savingGoalView");
        Intrinsics.checkNotNullParameter(list, "savingGoalWithdrawMethods");
        return new setUseTrackingCache(beaconManager, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setUseTrackingCache)) {
            return false;
        }
        setUseTrackingCache setusetrackingcache = (setUseTrackingCache) obj;
        return Intrinsics.areEqual((Object) this.savingGoalView, (Object) setusetrackingcache.savingGoalView) && Intrinsics.areEqual((Object) this.savingGoalWithdrawMethods, (Object) setusetrackingcache.savingGoalWithdrawMethods);
    }

    public final int hashCode() {
        BeaconManager beaconManager = this.savingGoalView;
        int i = 0;
        int hashCode = (beaconManager != null ? beaconManager.hashCode() : 0) * 31;
        List<getRssiFilterImplClass> list = this.savingGoalWithdrawMethods;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingWithdrawInitResult(savingGoalView=");
        sb.append(this.savingGoalView);
        sb.append(", savingGoalWithdrawMethods=");
        sb.append(this.savingGoalWithdrawMethods);
        sb.append(")");
        return sb.toString();
    }

    public setUseTrackingCache(@NotNull BeaconManager beaconManager, @NotNull List<getRssiFilterImplClass> list) {
        Intrinsics.checkNotNullParameter(beaconManager, "savingGoalView");
        Intrinsics.checkNotNullParameter(list, "savingGoalWithdrawMethods");
        this.savingGoalView = beaconManager;
        this.savingGoalWithdrawMethods = list;
    }

    @NotNull
    public final BeaconManager getSavingGoalView() {
        return this.savingGoalView;
    }

    @NotNull
    public final List<getRssiFilterImplClass> getSavingGoalWithdrawMethods() {
        return this.savingGoalWithdrawMethods;
    }
}
