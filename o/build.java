package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0003¨\u0006\u0005"}, d2 = {"toListNearbyLocation", "", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "Lid/dana/data/nearbyplaces/repository/source/network/result/PlacePredictionResult;", "toNearbyLocation", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class build {
    @NotNull
    public static final List<getCreateTime> toListNearbyLocation(@NotNull List<getAction> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toListNearbyLocation");
        Iterable<getAction> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (getAction nearbyLocation : iterable) {
            arrayList.add(toNearbyLocation(nearbyLocation));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final getCreateTime toNearbyLocation(@NotNull getAction getaction) {
        Intrinsics.checkNotNullParameter(getaction, "$this$toNearbyLocation");
        return new getCreateTime(getaction.getStructuredFormatting().getMainText(), getaction.getStructuredFormatting().getSecondaryText(), getaction.getPlaceId(), getaction.getDistanceInMeters());
    }
}
