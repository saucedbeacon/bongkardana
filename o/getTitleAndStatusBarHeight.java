package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lid/dana/data/sendmoney/model/BaseWithdrawInit;", "", "withdrawMethodViews", "", "Lid/dana/data/sendmoney/model/WithdrawInitMethodViewResult;", "(Ljava/util/List;)V", "getWithdrawMethodViews", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getTitleAndStatusBarHeight {
    @NotNull
    private final List<readToByte> withdrawMethodViews;

    public static /* synthetic */ getTitleAndStatusBarHeight copy$default(getTitleAndStatusBarHeight gettitleandstatusbarheight, List<readToByte> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gettitleandstatusbarheight.withdrawMethodViews;
        }
        return gettitleandstatusbarheight.copy(list);
    }

    @NotNull
    public final List<readToByte> component1() {
        return this.withdrawMethodViews;
    }

    @NotNull
    public final getTitleAndStatusBarHeight copy(@NotNull List<readToByte> list) {
        Intrinsics.checkNotNullParameter(list, "withdrawMethodViews");
        return new getTitleAndStatusBarHeight(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof getTitleAndStatusBarHeight) && Intrinsics.areEqual((Object) this.withdrawMethodViews, (Object) ((getTitleAndStatusBarHeight) obj).withdrawMethodViews);
        }
        return true;
    }

    public final int hashCode() {
        List<readToByte> list = this.withdrawMethodViews;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseWithdrawInit(withdrawMethodViews=");
        sb.append(this.withdrawMethodViews);
        sb.append(")");
        return sb.toString();
    }

    public getTitleAndStatusBarHeight(@NotNull List<readToByte> list) {
        Intrinsics.checkNotNullParameter(list, "withdrawMethodViews");
        this.withdrawMethodViews = list;
    }

    @NotNull
    public final List<readToByte> getWithdrawMethodViews() {
        return this.withdrawMethodViews;
    }
}
