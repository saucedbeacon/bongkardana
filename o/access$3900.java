package o;

import id.dana.social.model.ReactionCountModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Lid/dana/social/model/mapper/ReactionCountModelMapper;", "", "()V", "apply", "Lid/dana/social/model/ReactionCountModel;", "oldItem", "Lid/dana/domain/social/model/ReactionCount;", "ownReactions", "", "Lid/dana/domain/social/model/OwnReaction;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$3900 {
    @NotNull
    public static ReactionCountModel getMin(@NotNull stopAndroidOBackgroundScan stopandroidobackgroundscan, @NotNull List<getRangedRegionState> list) {
        String str;
        Object obj;
        Intrinsics.checkNotNullParameter(stopandroidobackgroundscan, "oldItem");
        Intrinsics.checkNotNullParameter(list, "ownReactions");
        String kind = stopandroidobackgroundscan.getKind();
        int count = stopandroidobackgroundscan.getCount();
        Iterable<getRangedRegionState> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (getRangedRegionState kind2 : iterable) {
            arrayList.add(kind2.getKind());
        }
        boolean contains = ((List) arrayList).contains(stopandroidobackgroundscan.getKind());
        Iterator it = iterable.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((getRangedRegionState) obj).getKind(), (Object) stopandroidobackgroundscan.getKind())) {
                break;
            }
        }
        getRangedRegionState getrangedregionstate = (getRangedRegionState) obj;
        if (getrangedregionstate != null) {
            str = getrangedregionstate.getId();
        }
        return new ReactionCountModel(kind, count, contains, str);
    }
}
