package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J/\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lid/dana/data/merchantmanagement/repository/source/network/result/BoundMerchantResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "merchantInfoList", "", "Lid/dana/data/merchantmanagement/model/MerchantInfoDTO;", "totalPageNumber", "", "currentPage", "(Ljava/util/List;II)V", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "getMerchantInfoList", "()Ljava/util/List;", "setMerchantInfoList", "(Ljava/util/List;)V", "getTotalPageNumber", "setTotalPageNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setNativeBridge extends BaseRpcResult {
    private int currentPage;
    @Nullable
    private List<getToggleButtonVisible> merchantInfoList;
    private int totalPageNumber;

    public static /* synthetic */ setNativeBridge copy$default(setNativeBridge setnativebridge, List<getToggleButtonVisible> list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = setnativebridge.merchantInfoList;
        }
        if ((i3 & 2) != 0) {
            i = setnativebridge.totalPageNumber;
        }
        if ((i3 & 4) != 0) {
            i2 = setnativebridge.currentPage;
        }
        return setnativebridge.copy(list, i, i2);
    }

    @Nullable
    public final List<getToggleButtonVisible> component1() {
        return this.merchantInfoList;
    }

    public final int component2() {
        return this.totalPageNumber;
    }

    public final int component3() {
        return this.currentPage;
    }

    @NotNull
    public final setNativeBridge copy(@Nullable List<getToggleButtonVisible> list, int i, int i2) {
        return new setNativeBridge(list, i, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setNativeBridge)) {
            return false;
        }
        setNativeBridge setnativebridge = (setNativeBridge) obj;
        return Intrinsics.areEqual((Object) this.merchantInfoList, (Object) setnativebridge.merchantInfoList) && this.totalPageNumber == setnativebridge.totalPageNumber && this.currentPage == setnativebridge.currentPage;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BoundMerchantResult(merchantInfoList=");
        sb.append(this.merchantInfoList);
        sb.append(", totalPageNumber=");
        sb.append(this.totalPageNumber);
        sb.append(", currentPage=");
        sb.append(this.currentPage);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final List<getToggleButtonVisible> getMerchantInfoList() {
        return this.merchantInfoList;
    }

    public final void setMerchantInfoList(@Nullable List<getToggleButtonVisible> list) {
        this.merchantInfoList = list;
    }

    public final int getTotalPageNumber() {
        return this.totalPageNumber;
    }

    public final void setTotalPageNumber(int i) {
        this.totalPageNumber = i;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final void setCurrentPage(int i) {
        this.currentPage = i;
    }

    public setNativeBridge(@Nullable List<getToggleButtonVisible> list, int i, int i2) {
        this.merchantInfoList = list;
        this.totalPageNumber = i;
        this.currentPage = i2;
    }

    public final int hashCode() {
        List<getToggleButtonVisible> list = this.merchantInfoList;
        return ((((list != null ? list.hashCode() : 0) * 31) + Integer.valueOf(this.totalPageNumber).hashCode()) * 31) + Integer.valueOf(this.currentPage).hashCode();
    }
}
