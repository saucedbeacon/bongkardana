package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BaseGriverRpcRequest;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/domain/miniprogram/model/MiniProgram;", "kotlin.jvm.PlatformType", "entity", "Lid/dana/data/miniprogram/model/MiniProgramEntity;", "apply"}, k = 3, mv = {1, 4, 2})
final class getUserAgent$FastBitmap$CoordinateSystem<T, R> implements RedDotDrawable<List<? extends createEngineRouter>, List<? extends BaseGriverRpcRequest.DeviceInfo>> {
    public static final getUserAgent$FastBitmap$CoordinateSystem getMax = new getUserAgent$FastBitmap$CoordinateSystem();

    getUserAgent$FastBitmap$CoordinateSystem() {
    }

    public final /* synthetic */ Object apply(Object obj) {
        List list = (List) obj;
        Intrinsics.checkNotNullParameter(list, "entity");
        Iterable<createEngineRouter> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (createEngineRouter createenginerouter : iterable) {
            Intrinsics.checkNotNullParameter(createenginerouter, "$this$toMiniProgram");
            arrayList.add(new BaseGriverRpcRequest.DeviceInfo(createenginerouter.getMin, createenginerouter.getMax, createenginerouter.length, createenginerouter.setMin, false, false, 0, 96, (DefaultConstructorMarker) null));
        }
        return (List) arrayList;
    }
}
