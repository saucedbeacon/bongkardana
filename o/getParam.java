package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u0005"}, d2 = {"toNearbyTrendingKeyword", "Lid/dana/domain/nearbysearch/model/NearbyTrendingKeyword;", "Lid/dana/data/config/model/NearbyTrendingKeywordEntity;", "toNearbyTrendingKeywords", "", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getParam {
    @NotNull
    public static final List<isFolder> getMin(@NotNull List<AppManagerImpl> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toNearbyTrendingKeywords");
        Iterable<AppManagerImpl> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (AppManagerImpl appManagerImpl : iterable) {
            arrayList.add(new isFolder(appManagerImpl.getName(), appManagerImpl.getTag()));
        }
        return (List) arrayList;
    }
}
