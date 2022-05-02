package o;

import id.dana.requestmoney.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lid/dana/domain/saving/model/SavingTopUpInit;", "", "maxAmount", "Lid/dana/domain/nearbyme/model/MoneyView;", "currentAmount", "targetAmount", "(Lid/dana/domain/nearbyme/model/MoneyView;Lid/dana/domain/nearbyme/model/MoneyView;Lid/dana/domain/nearbyme/model/MoneyView;)V", "getCurrentAmount", "()Lid/dana/domain/nearbyme/model/MoneyView;", "getMaxAmount", "getTargetAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getDistanceModelUpdateUrl {
    @NotNull
    private final getAppDir currentAmount;
    @NotNull
    private final getAppDir maxAmount;
    @NotNull
    private final getAppDir targetAmount;

    public static /* synthetic */ getDistanceModelUpdateUrl copy$default(getDistanceModelUpdateUrl getdistancemodelupdateurl, getAppDir getappdir, getAppDir getappdir2, getAppDir getappdir3, int i, Object obj) {
        if ((i & 1) != 0) {
            getappdir = getdistancemodelupdateurl.maxAmount;
        }
        if ((i & 2) != 0) {
            getappdir2 = getdistancemodelupdateurl.currentAmount;
        }
        if ((i & 4) != 0) {
            getappdir3 = getdistancemodelupdateurl.targetAmount;
        }
        return getdistancemodelupdateurl.copy(getappdir, getappdir2, getappdir3);
    }

    @NotNull
    public final getAppDir component1() {
        return this.maxAmount;
    }

    @NotNull
    public final getAppDir component2() {
        return this.currentAmount;
    }

    @NotNull
    public final getAppDir component3() {
        return this.targetAmount;
    }

    @NotNull
    public final getDistanceModelUpdateUrl copy(@NotNull getAppDir getappdir, @NotNull getAppDir getappdir2, @NotNull getAppDir getappdir3) {
        Intrinsics.checkNotNullParameter(getappdir, BundleKey.MAXIMUM_AMOUNT);
        Intrinsics.checkNotNullParameter(getappdir2, "currentAmount");
        Intrinsics.checkNotNullParameter(getappdir3, "targetAmount");
        return new getDistanceModelUpdateUrl(getappdir, getappdir2, getappdir3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDistanceModelUpdateUrl)) {
            return false;
        }
        getDistanceModelUpdateUrl getdistancemodelupdateurl = (getDistanceModelUpdateUrl) obj;
        return Intrinsics.areEqual((Object) this.maxAmount, (Object) getdistancemodelupdateurl.maxAmount) && Intrinsics.areEqual((Object) this.currentAmount, (Object) getdistancemodelupdateurl.currentAmount) && Intrinsics.areEqual((Object) this.targetAmount, (Object) getdistancemodelupdateurl.targetAmount);
    }

    public final int hashCode() {
        getAppDir getappdir = this.maxAmount;
        int i = 0;
        int hashCode = (getappdir != null ? getappdir.hashCode() : 0) * 31;
        getAppDir getappdir2 = this.currentAmount;
        int hashCode2 = (hashCode + (getappdir2 != null ? getappdir2.hashCode() : 0)) * 31;
        getAppDir getappdir3 = this.targetAmount;
        if (getappdir3 != null) {
            i = getappdir3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingTopUpInit(maxAmount=");
        sb.append(this.maxAmount);
        sb.append(", currentAmount=");
        sb.append(this.currentAmount);
        sb.append(", targetAmount=");
        sb.append(this.targetAmount);
        sb.append(")");
        return sb.toString();
    }

    public getDistanceModelUpdateUrl(@NotNull getAppDir getappdir, @NotNull getAppDir getappdir2, @NotNull getAppDir getappdir3) {
        Intrinsics.checkNotNullParameter(getappdir, BundleKey.MAXIMUM_AMOUNT);
        Intrinsics.checkNotNullParameter(getappdir2, "currentAmount");
        Intrinsics.checkNotNullParameter(getappdir3, "targetAmount");
        this.maxAmount = getappdir;
        this.currentAmount = getappdir2;
        this.targetAmount = getappdir3;
    }

    @NotNull
    public final getAppDir getMaxAmount() {
        return this.maxAmount;
    }

    @NotNull
    public final getAppDir getCurrentAmount() {
        return this.currentAmount;
    }

    @NotNull
    public final getAppDir getTargetAmount() {
        return this.targetAmount;
    }
}
