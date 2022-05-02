package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"toFollowingEntity", "Lid/dana/data/social/repository/source/persistence/entity/FollowingEntity;", "", "Lid/dana/data/social/repository/source/persistence/entity/FollowingItemEntity;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class DomainConfigProxy {
    @NotNull
    public static final setAuthExecuteResult toFollowingEntity(@NotNull List<setShowType> list) {
        List<setShowType> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "$this$toFollowingEntity");
        Iterable<setShowType> iterable = list2;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (setShowType add : iterable) {
            arrayList.add(add);
        }
        return new setAuthExecuteResult((List) arrayList, new setAuthContentResult(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (ArrayList) null, 8176, (DefaultConstructorMarker) null));
    }
}
