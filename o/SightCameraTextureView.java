package o;

import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.savings.model.TopUpModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u0005"}, d2 = {"toTopUpModel", "Lid/dana/savings/model/TopUpModel;", "Lid/dana/domain/saving/model/TopUpView;", "toTopUpModels", "", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class SightCameraTextureView {
    @NotNull
    public static final List<TopUpModel> length(@NotNull List<setRssiFilterImplClass> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toTopUpModels");
        Iterable<setRssiFilterImplClass> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (setRssiFilterImplClass setrssifilterimplclass : iterable) {
            Intrinsics.checkNotNullParameter(setrssifilterimplclass, "$this$toTopUpModel");
            String topUpId = setrssifilterimplclass.getTopUpId();
            MoneyViewModel.length length = MoneyViewModel.length;
            arrayList.add(new TopUpModel(topUpId, MoneyViewModel.length.length(setrssifilterimplclass.getFundAmount()), setrssifilterimplclass.getStatus(), setrssifilterimplclass.getCreatedTime(), setrssifilterimplclass.getBizOrderId(), setrssifilterimplclass.getExtendInfo(), 0, 64));
        }
        return (List) arrayList;
    }
}
