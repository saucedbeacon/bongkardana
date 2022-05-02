package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u0005"}, d2 = {"toTopUpView", "Lid/dana/domain/saving/model/TopUpView;", "Lid/dana/data/saving/model/TopUpViewEntity;", "toTopUpViews", "", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class isUseCache {
    @NotNull
    public static final List<setRssiFilterImplClass> toTopUpViews(@NotNull List<useSpdy> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toTopUpViews");
        Iterable<useSpdy> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (useSpdy topUpView : iterable) {
            arrayList.add(toTopUpView(topUpView));
        }
        return (List) arrayList;
    }

    private static final setRssiFilterImplClass toTopUpView(useSpdy usespdy) {
        String str;
        String str2;
        String str3;
        String topUpId = usespdy.getTopUpId();
        String str4 = topUpId == null ? "" : topUpId;
        getAppDir moneyView = isReady.toMoneyView(usespdy.getFundAmount());
        String status = usespdy.getStatus();
        if (status == null) {
            str = "";
        } else {
            str = status;
        }
        String createdTime = usespdy.getCreatedTime();
        if (createdTime == null) {
            str2 = "";
        } else {
            str2 = createdTime;
        }
        String bizOrderId = usespdy.getBizOrderId();
        if (bizOrderId == null) {
            str3 = "";
        } else {
            str3 = bizOrderId;
        }
        Map<String, String> extendInfo = usespdy.getExtendInfo();
        if (extendInfo == null) {
            extendInfo = new HashMap<>();
        }
        return new setRssiFilterImplClass(str4, moneyView, str, str2, str3, extendInfo);
    }
}
