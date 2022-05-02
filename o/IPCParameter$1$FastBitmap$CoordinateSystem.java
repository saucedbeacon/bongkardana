package o;

import id.dana.domain.services.Category;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00010\u00012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "", "Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "kotlin.jvm.PlatformType", "serviceMap", "apply"}, k = 3, mv = {1, 4, 2})
final class IPCParameter$1$FastBitmap$CoordinateSystem<T, R> implements RedDotDrawable<Map<String, ? extends List<? extends TitleBar>>, Map<String, ? extends List<? extends TitleBar>>> {
    final /* synthetic */ List length;
    final /* synthetic */ String setMin;

    IPCParameter$1$FastBitmap$CoordinateSystem(String str, List list) {
        this.setMin = str;
        this.length = list;
    }

    public final /* synthetic */ Object apply(Object obj) {
        Collection collection;
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "serviceMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!Intrinsics.areEqual((Object) (String) entry.getKey(), (Object) Category.FEATURED)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map map2 = linkedHashMap;
        Map linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(map2.size()));
        for (Map.Entry entry2 : map2.entrySet()) {
            Object key = entry2.getKey();
            List list = (List) entry2.getValue();
            if (Intrinsics.areEqual((Object) this.setMin, (Object) "name")) {
                collection = new ArrayList();
                for (Object next : list) {
                    if (CollectionsKt.contains(this.length, ((TitleBar) next).getName())) {
                        collection.add(next);
                    }
                }
            } else {
                collection = new ArrayList();
                for (Object next2 : list) {
                    if (CollectionsKt.contains(this.length, ((TitleBar) next2).getKey())) {
                        collection.add(next2);
                    }
                }
            }
            linkedHashMap2.put(key, (List) collection);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            if (!((List) entry3.getValue()).isEmpty()) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        return linkedHashMap3;
    }
}
