package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import o.Render;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¨\u0006\u0004"}, d2 = {"toTag", "", "Lid/dana/domain/nearbyme/model/Tag;", "Lid/dana/data/nearbyme/model/TagEntity;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getRenderBridge {
    @NotNull
    public static final List<getExtensionFromMimeType> toTag(@Nullable List<Render.CaptureRange> list) {
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        Iterable<Render.CaptureRange> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Render.CaptureRange tag : iterable) {
            arrayList.add(tag.toTag());
        }
        return (List) arrayList;
    }
}
