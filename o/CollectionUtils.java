package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/data/sendmoney/mapper/WithdrawInitBaseResultMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lid/dana/data/sendmoney/model/BaseWithdrawInit;", "Lid/dana/domain/sendmoney/model/WithdrawInitBase;", "withdrawInitMethodOptionResultMapper", "Lid/dana/data/sendmoney/mapper/WithdrawInitMethodOptionResultMapper;", "(Lid/dana/data/sendmoney/mapper/WithdrawInitMethodOptionResultMapper;)V", "map", "oldItem", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CollectionUtils extends setSpeed<List<? extends getTitleAndStatusBarHeight>, List<? extends byteArrayToFormattedString>> {
    private final isValueEqule withdrawInitMethodOptionResultMapper;

    @Inject
    public CollectionUtils(@NotNull isValueEqule isvalueequle) {
        Intrinsics.checkNotNullParameter(isvalueequle, "withdrawInitMethodOptionResultMapper");
        this.withdrawInitMethodOptionResultMapper = isvalueequle;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final List<byteArrayToFormattedString> map(@Nullable List<getTitleAndStatusBarHeight> list) {
        List<byteArrayToFormattedString> list2;
        if (list != null) {
            Iterable<getTitleAndStatusBarHeight> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (getTitleAndStatusBarHeight withdrawMethodViews : iterable) {
                Object apply = this.withdrawInitMethodOptionResultMapper.apply(withdrawMethodViews.getWithdrawMethodViews());
                Intrinsics.checkNotNullExpressionValue(apply, "withdrawInitMethodOption…y(it.withdrawMethodViews)");
                arrayList.add(new byteArrayToFormattedString((List) apply));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 == null ? CollectionsKt.emptyList() : list2;
    }
}
