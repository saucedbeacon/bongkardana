package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lid/dana/data/autoroute/model/UserAutoRouteSwitchAttributeResult;", "", "identFailedCount", "", "maxFailedLimit", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getIdentFailedCount", "()Ljava/lang/Integer;", "setIdentFailedCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMaxFailedLimit", "setMaxFailedLimit", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lid/dana/data/autoroute/model/UserAutoRouteSwitchAttributeResult;", "equals", "", "other", "hashCode", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isMergePathsEnabledForKitKatAndAbove {
    @Nullable
    private Integer identFailedCount;
    @Nullable
    private Integer maxFailedLimit;

    public isMergePathsEnabledForKitKatAndAbove() {
        this((Integer) null, (Integer) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ isMergePathsEnabledForKitKatAndAbove copy$default(isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = ismergepathsenabledforkitkatandabove.identFailedCount;
        }
        if ((i & 2) != 0) {
            num2 = ismergepathsenabledforkitkatandabove.maxFailedLimit;
        }
        return ismergepathsenabledforkitkatandabove.copy(num, num2);
    }

    @Nullable
    public final Integer component1() {
        return this.identFailedCount;
    }

    @Nullable
    public final Integer component2() {
        return this.maxFailedLimit;
    }

    @NotNull
    public final isMergePathsEnabledForKitKatAndAbove copy(@Nullable Integer num, @Nullable Integer num2) {
        return new isMergePathsEnabledForKitKatAndAbove(num, num2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isMergePathsEnabledForKitKatAndAbove)) {
            return false;
        }
        isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove = (isMergePathsEnabledForKitKatAndAbove) obj;
        return Intrinsics.areEqual((Object) this.identFailedCount, (Object) ismergepathsenabledforkitkatandabove.identFailedCount) && Intrinsics.areEqual((Object) this.maxFailedLimit, (Object) ismergepathsenabledforkitkatandabove.maxFailedLimit);
    }

    public final int hashCode() {
        Integer num = this.identFailedCount;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.maxFailedLimit;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAutoRouteSwitchAttributeResult(identFailedCount=");
        sb.append(this.identFailedCount);
        sb.append(", maxFailedLimit=");
        sb.append(this.maxFailedLimit);
        sb.append(")");
        return sb.toString();
    }

    public isMergePathsEnabledForKitKatAndAbove(@Nullable Integer num, @Nullable Integer num2) {
        this.identFailedCount = num;
        this.maxFailedLimit = num2;
    }

    @Nullable
    public final Integer getIdentFailedCount() {
        return this.identFailedCount;
    }

    public final void setIdentFailedCount(@Nullable Integer num) {
        this.identFailedCount = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ isMergePathsEnabledForKitKatAndAbove(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }

    @Nullable
    public final Integer getMaxFailedLimit() {
        return this.maxFailedLimit;
    }

    public final void setMaxFailedLimit(@Nullable Integer num) {
        this.maxFailedLimit = num;
    }
}
