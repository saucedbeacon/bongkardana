package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lid/dana/data/merchant/repository/source/network/response/BizDestinationInquiryResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "Ljava/io/Serializable;", "digitalDestinationInquiryInfos", "", "Lid/dana/data/merchant/repository/source/network/response/BizDestinationInquiryInfo;", "displayProvider", "", "aggregatorGoodsId", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAggregatorGoodsId", "()Ljava/lang/String;", "getDigitalDestinationInquiryInfos", "()Ljava/util/List;", "getDisplayProvider", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVDebugConsoleProxy extends BaseRpcResult implements Serializable {
    @Nullable
    private final String aggregatorGoodsId;
    @SerializedName("digitalDestinationInquiryInfos")
    @Nullable
    private final List<getNodeType> digitalDestinationInquiryInfos;
    @SerializedName("displayProvider")
    @Nullable
    private final String displayProvider;

    public RVDebugConsoleProxy() {
        this((List) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RVDebugConsoleProxy copy$default(RVDebugConsoleProxy rVDebugConsoleProxy, List<getNodeType> list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rVDebugConsoleProxy.digitalDestinationInquiryInfos;
        }
        if ((i & 2) != 0) {
            str = rVDebugConsoleProxy.displayProvider;
        }
        if ((i & 4) != 0) {
            str2 = rVDebugConsoleProxy.aggregatorGoodsId;
        }
        return rVDebugConsoleProxy.copy(list, str, str2);
    }

    @Nullable
    public final List<getNodeType> component1() {
        return this.digitalDestinationInquiryInfos;
    }

    @Nullable
    public final String component2() {
        return this.displayProvider;
    }

    @Nullable
    public final String component3() {
        return this.aggregatorGoodsId;
    }

    @NotNull
    public final RVDebugConsoleProxy copy(@Nullable List<getNodeType> list, @Nullable String str, @Nullable String str2) {
        return new RVDebugConsoleProxy(list, str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RVDebugConsoleProxy)) {
            return false;
        }
        RVDebugConsoleProxy rVDebugConsoleProxy = (RVDebugConsoleProxy) obj;
        return Intrinsics.areEqual((Object) this.digitalDestinationInquiryInfos, (Object) rVDebugConsoleProxy.digitalDestinationInquiryInfos) && Intrinsics.areEqual((Object) this.displayProvider, (Object) rVDebugConsoleProxy.displayProvider) && Intrinsics.areEqual((Object) this.aggregatorGoodsId, (Object) rVDebugConsoleProxy.aggregatorGoodsId);
    }

    public final int hashCode() {
        List<getNodeType> list = this.digitalDestinationInquiryInfos;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.displayProvider;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.aggregatorGoodsId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BizDestinationInquiryResult(digitalDestinationInquiryInfos=");
        sb.append(this.digitalDestinationInquiryInfos);
        sb.append(", displayProvider=");
        sb.append(this.displayProvider);
        sb.append(", aggregatorGoodsId=");
        sb.append(this.aggregatorGoodsId);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final List<getNodeType> getDigitalDestinationInquiryInfos() {
        return this.digitalDestinationInquiryInfos;
    }

    @Nullable
    public final String getDisplayProvider() {
        return this.displayProvider;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RVDebugConsoleProxy(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    @Nullable
    public final String getAggregatorGoodsId() {
        return this.aggregatorGoodsId;
    }

    public RVDebugConsoleProxy(@Nullable List<getNodeType> list, @Nullable String str, @Nullable String str2) {
        this.digitalDestinationInquiryInfos = list;
        this.displayProvider = str;
        this.aggregatorGoodsId = str2;
    }
}
