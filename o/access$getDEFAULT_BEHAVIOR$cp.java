package o;

import id.dana.lib.electronicmoney.bri.model.BrizziHistoryResult;
import id.dana.lib.electronicmoney.bri.model.ReversalResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"toBrizziHistoryInfo", "Lid/dana/domain/electronicmoney/model/request/BrizziHistoryInfo;", "Lid/dana/lib/electronicmoney/bri/model/BrizziHistoryResult;", "toBrizziReversalInfo", "Lid/dana/domain/electronicmoney/model/request/BrizziReversalInfo;", "Lid/dana/lib/electronicmoney/bri/model/ReversalResult;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class access$getDEFAULT_BEHAVIOR$cp {
    @NotNull
    public static final setTextZoom toBrizziHistoryInfo(@NotNull BrizziHistoryResult brizziHistoryResult) {
        Intrinsics.checkNotNullParameter(brizziHistoryResult, "$this$toBrizziHistoryInfo");
        return new setTextZoom(brizziHistoryResult.setMin, brizziHistoryResult.getMin, brizziHistoryResult.setMax, brizziHistoryResult.length, brizziHistoryResult.getMax, brizziHistoryResult.toIntRange, brizziHistoryResult.IsOverlapping, brizziHistoryResult.equals);
    }

    @NotNull
    public static final getTextSize toBrizziReversalInfo(@NotNull ReversalResult reversalResult) {
        Intrinsics.checkNotNullParameter(reversalResult, "$this$toBrizziReversalInfo");
        String str = reversalResult.setMin;
        String str2 = reversalResult.getMax;
        String str3 = reversalResult.setMax;
        String str4 = reversalResult.getMin;
        String str5 = reversalResult.length;
        String str6 = reversalResult.equals;
        Iterable<BrizziHistoryResult> iterable = reversalResult.toFloatRange;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (BrizziHistoryResult brizziHistoryInfo : iterable) {
            arrayList.add(toBrizziHistoryInfo(brizziHistoryInfo));
        }
        return new getTextSize(str, str2, str3, str4, str5, str6, (List) arrayList);
    }
}
