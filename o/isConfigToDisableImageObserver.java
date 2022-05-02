package o;

import id.dana.sendmoney.model.ExternalWithdrawChannelModel;
import id.dana.sendmoney.model.WithdrawChannelModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u0005"}, d2 = {"toExternalWithdrawChannelModel", "Lid/dana/sendmoney/model/ExternalWithdrawChannelModel;", "Lid/dana/sendmoney/model/WithdrawChannelModel;", "toExternalWithdrawChannelModels", "", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class isConfigToDisableImageObserver {
    @NotNull
    public static final List<ExternalWithdrawChannelModel> setMax(@NotNull List<WithdrawChannelModel> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toExternalWithdrawChannelModels");
        Iterable<WithdrawChannelModel> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (WithdrawChannelModel max : iterable) {
            arrayList.add(getMax(max));
        }
        return (List) arrayList;
    }

    private static final ExternalWithdrawChannelModel getMax(WithdrawChannelModel withdrawChannelModel) {
        String str = withdrawChannelModel.setMin;
        String str2 = withdrawChannelModel.getMin;
        String str3 = withdrawChannelModel.length;
        String str4 = withdrawChannelModel.setMax;
        String str5 = withdrawChannelModel.equals;
        Boolean bool = withdrawChannelModel.getMax;
        return new ExternalWithdrawChannelModel(str, str2, str3, str4, str5, bool != null ? Boolean.valueOf(!bool.booleanValue()) : null, (String) null, (String) null, (String) null, 448);
    }
}
