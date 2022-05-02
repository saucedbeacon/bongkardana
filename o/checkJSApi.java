package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"toFollowerEntity", "Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;", "", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class checkJSApi {
    @NotNull
    public static final setErrorScopes toFollowerEntity(@NotNull List<AuthSkipResultModel> list) {
        List<AuthSkipResultModel> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "$this$toFollowerEntity");
        Iterable<AuthSkipResultModel> iterable = list2;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (AuthSkipResultModel add : iterable) {
            arrayList.add(add);
        }
        return new setErrorScopes((List) arrayList, new setAuthContentResult(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (ArrayList) null, 8176, (DefaultConstructorMarker) null));
    }
}
