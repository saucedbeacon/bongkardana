package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lid/dana/data/nearbyme/mapper/MerchantInfoMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lid/dana/domain/nearbyme/model/MerchantInfo;", "", "Lid/dana/data/nearbyme/repository/source/network/request/NearbyPromoShopEntity;", "()V", "map", "merchantInfo", "oldItem", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class createEngine extends setSpeed<List<? extends getUtdidEncrypt>, List<ApiContext>> {
    @NotNull
    public final List<ApiContext> map(@Nullable List<getUtdidEncrypt> list) {
        List<ApiContext> arrayList = new ArrayList<>();
        if (list != null) {
            Iterable<getUtdidEncrypt> iterable = list;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (getUtdidEncrypt map : iterable) {
                arrayList2.add(Boolean.valueOf(arrayList.add(map(map))));
            }
        }
        return arrayList;
    }

    private final ApiContext map(getUtdidEncrypt getutdidencrypt) {
        ApiContext apiContext = new ApiContext();
        apiContext.merchantId = getutdidencrypt.getMerchantId();
        apiContext.shopId = getutdidencrypt.getShopId();
        return apiContext;
    }
}
