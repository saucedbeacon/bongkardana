package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantPromoDanaDealResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "providerId", "", "productInfos", "", "Lid/dana/data/nearbyme/model/ProductInfoEntity;", "(Ljava/lang/String;Ljava/util/List;)V", "getProductInfos", "()Ljava/util/List;", "getProviderId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toProductInfoList", "Lid/dana/domain/nearbyme/model/MerchantProductInfo;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setPluginId extends BaseRpcResult {
    @Nullable
    private final List<getCapture> productInfos;
    @Nullable
    private final String providerId;

    public setPluginId() {
        this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setPluginId copy$default(setPluginId setpluginid, String str, List<getCapture> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setpluginid.providerId;
        }
        if ((i & 2) != 0) {
            list = setpluginid.productInfos;
        }
        return setpluginid.copy(str, list);
    }

    @Nullable
    public final String component1() {
        return this.providerId;
    }

    @Nullable
    public final List<getCapture> component2() {
        return this.productInfos;
    }

    @NotNull
    public final setPluginId copy(@Nullable String str, @Nullable List<getCapture> list) {
        return new setPluginId(str, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPluginId)) {
            return false;
        }
        setPluginId setpluginid = (setPluginId) obj;
        return Intrinsics.areEqual((Object) this.providerId, (Object) setpluginid.providerId) && Intrinsics.areEqual((Object) this.productInfos, (Object) setpluginid.productInfos);
    }

    public final int hashCode() {
        String str = this.providerId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<getCapture> list = this.productInfos;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantPromoDanaDealResult(providerId=");
        sb.append(this.providerId);
        sb.append(", productInfos=");
        sb.append(this.productInfos);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final String getProviderId() {
        return this.providerId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setPluginId(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    @Nullable
    public final List<getCapture> getProductInfos() {
        return this.productInfos;
    }

    public setPluginId(@Nullable String str, @Nullable List<getCapture> list) {
        this.providerId = str;
        this.productInfos = list;
    }

    @NotNull
    public final List<mediaMounted> toProductInfoList() {
        List<getCapture> list = this.productInfos;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        Iterable<getCapture> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (getCapture getcapture : iterable) {
            String goodsId = getcapture.getGoodsId();
            String provider = getcapture.getProvider();
            String type = getcapture.getType();
            String description = getcapture.getDescription();
            String goodsTitle = getcapture.getGoodsTitle();
            getAppDir moneyView = isReady.toMoneyView(getcapture.getPrice());
            getAppDir moneyView2 = isReady.toMoneyView(getcapture.getDenom());
            boolean available = getcapture.getAvailable();
            String productCode = getcapture.getProductCode();
            Map<String, String> extendInfo = getcapture.getExtendInfo();
            fileName voucherInfo = getcapture.getVoucherInfo().toVoucherInfo();
            double savingRate = getcapture.getSavingRate();
            mediaMounted mediamounted = r4;
            mediaMounted mediamounted2 = new mediaMounted(goodsId, provider, type, description, goodsTitle, moneyView, moneyView2, available, productCode, extendInfo, voucherInfo, savingRate);
            arrayList.add(mediamounted);
        }
        return (List) arrayList;
    }
}
