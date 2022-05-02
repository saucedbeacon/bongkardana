package o;

import id.dana.social.model.RelationshipItemModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"toRelationshipItemModelList", "", "Lid/dana/social/model/RelationshipItemModel;", "Lid/dana/domain/social/model/RelationshipItem;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setSelectionFromOffset {
    @NotNull
    public static final List<RelationshipItemModel> setMax(@NotNull List<processScanResult> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toRelationshipItemModelList");
        Iterable<processScanResult> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (processScanResult min : iterable) {
            arrayList.add(canAnimate.getMin(min));
        }
        return (List) arrayList;
    }
}
