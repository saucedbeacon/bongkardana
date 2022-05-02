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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/data/sendmoney/mapper/WithdrawInitMethodOptionResultMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lid/dana/data/sendmoney/model/WithdrawInitMethodViewResult;", "Lid/dana/domain/sendmoney/model/WithdrawInitMethodOption;", "withdrawSavedCardChannelViewResultMapper", "Lid/dana/data/sendmoney/mapper/WithdrawSavedCardChannelViewResultMapper;", "withdrawInitChannelOptionResultMapper", "Lid/dana/data/sendmoney/mapper/WithdrawInitChannelOptionResultMapper;", "(Lid/dana/data/sendmoney/mapper/WithdrawSavedCardChannelViewResultMapper;Lid/dana/data/sendmoney/mapper/WithdrawInitChannelOptionResultMapper;)V", "map", "oldItem", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isValueEqule extends setSpeed<List<? extends readToByte>, List<? extends fromLong>> {
    private final toJSONObject withdrawInitChannelOptionResultMapper;
    private final DomainUtil withdrawSavedCardChannelViewResultMapper;

    @Inject
    public isValueEqule(@NotNull DomainUtil domainUtil, @NotNull toJSONObject tojsonobject) {
        Intrinsics.checkNotNullParameter(domainUtil, "withdrawSavedCardChannelViewResultMapper");
        Intrinsics.checkNotNullParameter(tojsonobject, "withdrawInitChannelOptionResultMapper");
        this.withdrawSavedCardChannelViewResultMapper = domainUtil;
        this.withdrawInitChannelOptionResultMapper = tojsonobject;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final List<fromLong> map(@Nullable List<readToByte> list) {
        List<fromLong> list2;
        if (list != null) {
            Iterable<readToByte> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (readToByte readtobyte : iterable) {
                arrayList.add(new fromLong((List) this.withdrawSavedCardChannelViewResultMapper.apply(readtobyte.getWithdrawCardOptions()), (List) this.withdrawInitChannelOptionResultMapper.apply(readtobyte.getWithdrawChannelOptions()), readtobyte.getWithdrawMethod()));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 == null ? CollectionsKt.emptyList() : list2;
    }
}
