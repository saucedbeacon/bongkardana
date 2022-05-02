package o;

import android.location.Location;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0014J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/data/nearbyme/mapper/OtherStoreListResultMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/data/nearbyme/repository/source/network/result/NearbyQueryOtherShopListResult;", "Lid/dana/domain/nearbyme/model/OtherStoreListResult;", "()V", "METER_TO_KM_DIVIDER", "", "currentLat", "", "currentLong", "apply", "sourceItem", "getDistanceBetweenShopAndMarkerPosition", "shop", "Lid/dana/domain/nearbyme/model/Shop;", "markerLocation", "Landroid/location/Location;", "getDistanceInKM", "distance", "map", "oldItem", "transformShopEntityListToShopList", "", "shopEntityList", "Lid/dana/data/nearbyme/model/ShopEntity;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getUserAgentSuffix extends setSpeed<EngineSetupCallback, getCachePath> {
    private final int METER_TO_KM_DIVIDER = 1000;
    private double currentLat;
    private double currentLong;

    @NotNull
    public final getCachePath apply(double d, double d2, @Nullable EngineSetupCallback engineSetupCallback) {
        this.currentLat = d;
        this.currentLong = d2;
        Object apply = super.apply(engineSetupCallback);
        Intrinsics.checkNotNullExpressionValue(apply, "super.apply(sourceItem)");
        return (getCachePath) apply;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final getCachePath map(@NotNull EngineSetupCallback engineSetupCallback) {
        Intrinsics.checkNotNullParameter(engineSetupCallback, "oldItem");
        return new getCachePath(transformShopEntityListToShopList(engineSetupCallback.getShops()), engineSetupCallback.getHasMore(), engineSetupCallback.getPromoFlag());
    }

    private final List<GriverConfigUtils> transformShopEntityListToShopList(List<? extends Render> list) {
        Iterable<Render> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Render shop : iterable) {
            arrayList.add(shop.toShop());
        }
        Iterable<GriverConfigUtils> iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        for (GriverConfigUtils griverConfigUtils : iterable2) {
            Intrinsics.checkNotNullExpressionValue(griverConfigUtils, "it");
            Location location = new Location("");
            location.setLatitude(this.currentLat);
            location.setLongitude(this.currentLong);
            Unit unit = Unit.INSTANCE;
            griverConfigUtils.setDistance(getDistanceBetweenShopAndMarkerPosition(griverConfigUtils, location));
            arrayList2.add(griverConfigUtils);
        }
        return (List) arrayList2;
    }

    private final double getDistanceBetweenShopAndMarkerPosition(GriverConfigUtils griverConfigUtils, Location location) {
        Location location2 = new Location("");
        location2.setLatitude(griverConfigUtils.getLatitude());
        location2.setLongitude(griverConfigUtils.getLongtitude());
        return getDistanceInKM((double) location.distanceTo(location2));
    }

    private final double getDistanceInKM(double d) {
        double d2 = (double) this.METER_TO_KM_DIVIDER;
        Double.isNaN(d2);
        return d / d2;
    }
}
