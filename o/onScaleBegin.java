package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.GriverRVResourceManagerImpl;
import o.ZoomRecyclerView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007¨\u0006\b"}, d2 = {"toPromoActionModel", "Lid/dana/promocenter/model/PromoActionModel;", "Lid/dana/domain/promocenter/model/PromoAction;", "toPromoActionModelList", "", "toPromoModel", "Lid/dana/promocenter/model/PromoModel;", "Lid/dana/domain/promocenter/model/Promo;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class onScaleBegin {
    @NotNull
    public static final DownloadFileHandle getMin(@NotNull GriverRVResourceManagerImpl.AnonymousClass2 r3) {
        Intrinsics.checkNotNullParameter(r3, "$this$toPromoModel");
        DownloadFileHandle downloadFileHandle = new DownloadFileHandle();
        downloadFileHandle.length = r3.getId();
        downloadFileHandle.getMax = r3.getName();
        downloadFileHandle.setMin = r3.getExpiryDate();
        downloadFileHandle.getMin = r3.getBannerUrl();
        List<GriverRVPluginResourceManagerImpl> promoActions = r3.getPromoActions();
        Intrinsics.checkNotNullExpressionValue(promoActions, "promoActions");
        downloadFileHandle.setMax = length(promoActions);
        downloadFileHandle.equals = r3.getPromoPriority();
        downloadFileHandle.toFloatRange = r3.getPromoIndexId();
        downloadFileHandle.isInside = r3.getPromoBannerVerticalImageUrl();
        downloadFileHandle.IsOverlapping = r3.getMerchantType();
        return downloadFileHandle;
    }

    @NotNull
    private static List<ZoomRecyclerView.ScaleListener> length(@NotNull List<? extends GriverRVPluginResourceManagerImpl> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toPromoActionModelList");
        Iterable<GriverRVPluginResourceManagerImpl> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (GriverRVPluginResourceManagerImpl max : iterable) {
            arrayList.add(setMax(max));
        }
        return (List) arrayList;
    }

    @NotNull
    private static ZoomRecyclerView.ScaleListener setMax(@NotNull GriverRVPluginResourceManagerImpl griverRVPluginResourceManagerImpl) {
        Intrinsics.checkNotNullParameter(griverRVPluginResourceManagerImpl, "$this$toPromoActionModel");
        ZoomRecyclerView.ScaleListener scaleListener = new ZoomRecyclerView.ScaleListener();
        scaleListener.setMax = griverRVPluginResourceManagerImpl.getType();
        scaleListener.length = griverRVPluginResourceManagerImpl.getName();
        scaleListener.getMax = griverRVPluginResourceManagerImpl.getRedirectUrl();
        return scaleListener;
    }
}
