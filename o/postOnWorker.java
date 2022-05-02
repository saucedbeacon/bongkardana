package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.EngineUtils;
import o.FileCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0004J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/data/nearbyme/mapper/NearbyPromoResultMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/data/nearbyme/repository/source/network/result/NearbyShopsPromoResult;", "", "Lid/dana/domain/nearbyme/model/NearbyShopsPromo;", "promoInfoEntityMapper", "Lid/dana/data/nearbyme/mapper/PromoInfoEntityMapper;", "(Lid/dana/data/nearbyme/mapper/PromoInfoEntityMapper;)V", "map", "nearbyPromoResult", "Lid/dana/data/nearbyme/model/NearbyPromoResult;", "oldItem", "", "Lid/dana/domain/nearbyme/model/PromoInfo;", "entities", "Lid/dana/data/nearbyme/model/PromoInfoEntity;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public class postOnWorker extends setSpeed<EngineInitCallback, List<getTempPath>> {
    private final sendToRender promoInfoEntityMapper;

    @Inject
    public postOnWorker(@NotNull sendToRender sendtorender) {
        Intrinsics.checkNotNullParameter(sendtorender, "promoInfoEntityMapper");
        this.promoInfoEntityMapper = sendtorender;
    }

    @NotNull
    public List<getTempPath> map(@Nullable EngineInitCallback engineInitCallback) {
        List<getTempPath> arrayList = new ArrayList<>();
        if (engineInitCallback != null) {
            Collection shops = engineInitCallback.getShops();
            if (!(shops == null || shops.isEmpty())) {
                List<EngineUtils.AnonymousClass2.AnonymousClass1> shops2 = engineInitCallback.getShops();
                Intrinsics.checkNotNullExpressionValue(shops2, "oldItem.shops");
                Iterable<EngineUtils.AnonymousClass2.AnonymousClass1> iterable = shops2;
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (EngineUtils.AnonymousClass2.AnonymousClass1 r2 : iterable) {
                    Intrinsics.checkNotNullExpressionValue(r2, "nearbyPromoResult");
                    arrayList2.add(Boolean.valueOf(arrayList.add(map(r2))));
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final getTempPath map(@NotNull EngineUtils.AnonymousClass2.AnonymousClass1 r8) {
        Intrinsics.checkNotNullParameter(r8, "nearbyPromoResult");
        getTempPath gettemppath = new getTempPath((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
        gettemppath.setMerchantId(r8.getMerchantId());
        gettemppath.setShopId(r8.getShopId());
        gettemppath.setPromoInfos(map((List<? extends setScrollChangedCallback>) r8.getPromoInfos()));
        return gettemppath;
    }

    private final List<FileCache.AnonymousClass1> map(List<? extends setScrollChangedCallback> list) {
        List<FileCache.AnonymousClass1> arrayList = new ArrayList<>();
        if (list != null) {
            Iterable<setScrollChangedCallback> iterable = list;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (setScrollChangedCallback map : iterable) {
                arrayList2.add(Boolean.valueOf(arrayList.add(this.promoInfoEntityMapper.map(map))));
            }
        }
        return arrayList;
    }
}
