package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lid/dana/domain/saving/model/SavingSummary;", "", "savingBalanceAmount", "Lid/dana/domain/nearbyme/model/MoneyView;", "maxSavingAmount", "maxSavingCount", "", "remainingAmount", "remainingCount", "savingGoalViews", "", "Lid/dana/domain/saving/model/SavingGoalView;", "hasNext", "", "(Lid/dana/domain/nearbyme/model/MoneyView;Lid/dana/domain/nearbyme/model/MoneyView;JLid/dana/domain/nearbyme/model/MoneyView;JLjava/util/List;Z)V", "getHasNext", "()Z", "getMaxSavingAmount", "()Lid/dana/domain/nearbyme/model/MoneyView;", "getMaxSavingCount", "()J", "getRemainingAmount", "getRemainingCount", "getSavingBalanceAmount", "getSavingGoalViews", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class logDebug {
    private final boolean hasNext;
    @NotNull
    private final getAppDir maxSavingAmount;
    private final long maxSavingCount;
    @NotNull
    private final getAppDir remainingAmount;
    private final long remainingCount;
    @NotNull
    private final getAppDir savingBalanceAmount;
    @NotNull
    private final List<BeaconManager> savingGoalViews;

    public static /* synthetic */ logDebug copy$default(logDebug logdebug, getAppDir getappdir, getAppDir getappdir2, long j, getAppDir getappdir3, long j2, List list, boolean z, int i, Object obj) {
        logDebug logdebug2 = logdebug;
        return logdebug.copy((i & 1) != 0 ? logdebug2.savingBalanceAmount : getappdir, (i & 2) != 0 ? logdebug2.maxSavingAmount : getappdir2, (i & 4) != 0 ? logdebug2.maxSavingCount : j, (i & 8) != 0 ? logdebug2.remainingAmount : getappdir3, (i & 16) != 0 ? logdebug2.remainingCount : j2, (i & 32) != 0 ? logdebug2.savingGoalViews : list, (i & 64) != 0 ? logdebug2.hasNext : z);
    }

    @NotNull
    public final getAppDir component1() {
        return this.savingBalanceAmount;
    }

    @NotNull
    public final getAppDir component2() {
        return this.maxSavingAmount;
    }

    public final long component3() {
        return this.maxSavingCount;
    }

    @NotNull
    public final getAppDir component4() {
        return this.remainingAmount;
    }

    public final long component5() {
        return this.remainingCount;
    }

    @NotNull
    public final List<BeaconManager> component6() {
        return this.savingGoalViews;
    }

    public final boolean component7() {
        return this.hasNext;
    }

    @NotNull
    public final logDebug copy(@NotNull getAppDir getappdir, @NotNull getAppDir getappdir2, long j, @NotNull getAppDir getappdir3, long j2, @NotNull List<BeaconManager> list, boolean z) {
        Intrinsics.checkNotNullParameter(getappdir, "savingBalanceAmount");
        Intrinsics.checkNotNullParameter(getappdir2, "maxSavingAmount");
        getAppDir getappdir4 = getappdir3;
        Intrinsics.checkNotNullParameter(getappdir4, "remainingAmount");
        List<BeaconManager> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "savingGoalViews");
        return new logDebug(getappdir, getappdir2, j, getappdir4, j2, list2, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof logDebug)) {
            return false;
        }
        logDebug logdebug = (logDebug) obj;
        return Intrinsics.areEqual((Object) this.savingBalanceAmount, (Object) logdebug.savingBalanceAmount) && Intrinsics.areEqual((Object) this.maxSavingAmount, (Object) logdebug.maxSavingAmount) && this.maxSavingCount == logdebug.maxSavingCount && Intrinsics.areEqual((Object) this.remainingAmount, (Object) logdebug.remainingAmount) && this.remainingCount == logdebug.remainingCount && Intrinsics.areEqual((Object) this.savingGoalViews, (Object) logdebug.savingGoalViews) && this.hasNext == logdebug.hasNext;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingSummary(savingBalanceAmount=");
        sb.append(this.savingBalanceAmount);
        sb.append(", maxSavingAmount=");
        sb.append(this.maxSavingAmount);
        sb.append(", maxSavingCount=");
        sb.append(this.maxSavingCount);
        sb.append(", remainingAmount=");
        sb.append(this.remainingAmount);
        sb.append(", remainingCount=");
        sb.append(this.remainingCount);
        sb.append(", savingGoalViews=");
        sb.append(this.savingGoalViews);
        sb.append(", hasNext=");
        sb.append(this.hasNext);
        sb.append(")");
        return sb.toString();
    }

    public logDebug(@NotNull getAppDir getappdir, @NotNull getAppDir getappdir2, long j, @NotNull getAppDir getappdir3, long j2, @NotNull List<BeaconManager> list, boolean z) {
        Intrinsics.checkNotNullParameter(getappdir, "savingBalanceAmount");
        Intrinsics.checkNotNullParameter(getappdir2, "maxSavingAmount");
        Intrinsics.checkNotNullParameter(getappdir3, "remainingAmount");
        Intrinsics.checkNotNullParameter(list, "savingGoalViews");
        this.savingBalanceAmount = getappdir;
        this.maxSavingAmount = getappdir2;
        this.maxSavingCount = j;
        this.remainingAmount = getappdir3;
        this.remainingCount = j2;
        this.savingGoalViews = list;
        this.hasNext = z;
    }

    @NotNull
    public final getAppDir getSavingBalanceAmount() {
        return this.savingBalanceAmount;
    }

    @NotNull
    public final getAppDir getMaxSavingAmount() {
        return this.maxSavingAmount;
    }

    public final long getMaxSavingCount() {
        return this.maxSavingCount;
    }

    @NotNull
    public final getAppDir getRemainingAmount() {
        return this.remainingAmount;
    }

    public final long getRemainingCount() {
        return this.remainingCount;
    }

    @NotNull
    public final List<BeaconManager> getSavingGoalViews() {
        return this.savingGoalViews;
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    public final int hashCode() {
        getAppDir getappdir = this.savingBalanceAmount;
        int i = 0;
        int hashCode = (getappdir != null ? getappdir.hashCode() : 0) * 31;
        getAppDir getappdir2 = this.maxSavingAmount;
        int hashCode2 = (((hashCode + (getappdir2 != null ? getappdir2.hashCode() : 0)) * 31) + Long.valueOf(this.maxSavingCount).hashCode()) * 31;
        getAppDir getappdir3 = this.remainingAmount;
        int hashCode3 = (((hashCode2 + (getappdir3 != null ? getappdir3.hashCode() : 0)) * 31) + Long.valueOf(this.remainingCount).hashCode()) * 31;
        List<BeaconManager> list = this.savingGoalViews;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.hasNext;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }
}
