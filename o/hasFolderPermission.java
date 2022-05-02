package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lid/dana/domain/merchantmanagement/model/LinkedMerchantInfo;", "", "merchantList", "", "Lid/dana/domain/merchantmanagement/model/LinkedMerchant;", "totalPageNumber", "", "(Ljava/util/List;I)V", "getMerchantList", "()Ljava/util/List;", "setMerchantList", "(Ljava/util/List;)V", "getTotalPageNumber", "()I", "setTotalPageNumber", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class hasFolderPermission {
    @NotNull
    private List<decodeToPath> merchantList;
    private int totalPageNumber;

    public static /* synthetic */ hasFolderPermission copy$default(hasFolderPermission hasfolderpermission, List<decodeToPath> list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = hasfolderpermission.merchantList;
        }
        if ((i2 & 2) != 0) {
            i = hasfolderpermission.totalPageNumber;
        }
        return hasfolderpermission.copy(list, i);
    }

    @NotNull
    public final List<decodeToPath> component1() {
        return this.merchantList;
    }

    public final int component2() {
        return this.totalPageNumber;
    }

    @NotNull
    public final hasFolderPermission copy(@NotNull List<decodeToPath> list, int i) {
        Intrinsics.checkNotNullParameter(list, "merchantList");
        return new hasFolderPermission(list, i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasFolderPermission)) {
            return false;
        }
        hasFolderPermission hasfolderpermission = (hasFolderPermission) obj;
        return Intrinsics.areEqual((Object) this.merchantList, (Object) hasfolderpermission.merchantList) && this.totalPageNumber == hasfolderpermission.totalPageNumber;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkedMerchantInfo(merchantList=");
        sb.append(this.merchantList);
        sb.append(", totalPageNumber=");
        sb.append(this.totalPageNumber);
        sb.append(")");
        return sb.toString();
    }

    public hasFolderPermission(@NotNull List<decodeToPath> list, int i) {
        Intrinsics.checkNotNullParameter(list, "merchantList");
        this.merchantList = list;
        this.totalPageNumber = i;
    }

    @NotNull
    public final List<decodeToPath> getMerchantList() {
        return this.merchantList;
    }

    public final void setMerchantList(@NotNull List<decodeToPath> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.merchantList = list;
    }

    public final int getTotalPageNumber() {
        return this.totalPageNumber;
    }

    public final void setTotalPageNumber(int i) {
        this.totalPageNumber = i;
    }

    public final int hashCode() {
        List<decodeToPath> list = this.merchantList;
        return ((list != null ? list.hashCode() : 0) * 31) + Integer.valueOf(this.totalPageNumber).hashCode();
    }
}
