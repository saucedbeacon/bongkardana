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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/sendmoney/mapper/WithdrawMethodOptionModelMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lid/dana/domain/withdraw/model/WithdrawMethodOption;", "Lid/dana/sendmoney/model/WithdrawMethodOptionModel;", "withdrawSavedCardChannelModelMapper", "Lid/dana/sendmoney/mapper/WithdrawSavedCardChannelModelMapper;", "withdrawChannelModelMapper", "Lid/dana/sendmoney/mapper/WithdrawChannelModelMapper;", "(Lid/dana/sendmoney/mapper/WithdrawSavedCardChannelModelMapper;Lid/dana/sendmoney/mapper/WithdrawChannelModelMapper;)V", "map", "oldItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onPhotoDelete extends setSpeed<List<? extends parseUuidFrom>, List<? extends onLoadCanceled>> {
    private final ViewHolder getMax;
    private final onPageClicked setMax;

    @Inject
    public onPhotoDelete(@NotNull onPageClicked onpageclicked, @NotNull ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(onpageclicked, "withdrawSavedCardChannelModelMapper");
        Intrinsics.checkNotNullParameter(viewHolder, "withdrawChannelModelMapper");
        this.setMax = onpageclicked;
        this.getMax = viewHolder;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: length */
    public final List<onLoadCanceled> map(@Nullable List<? extends parseUuidFrom> list) {
        List<onLoadCanceled> list2;
        if (list != null) {
            Iterable<parseUuidFrom> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (parseUuidFrom parseuuidfrom : iterable) {
                Object apply = this.setMax.apply(parseuuidfrom.getWithdrawCardOptions());
                Intrinsics.checkNotNullExpressionValue(apply, "withdrawSavedCardChannel…y(it.withdrawCardOptions)");
                Object apply2 = this.getMax.apply(parseuuidfrom.getWithdrawChannelOptions());
                Intrinsics.checkNotNullExpressionValue(apply2, "withdrawChannelModelMapp…t.withdrawChannelOptions)");
                String withdrawMethod = parseuuidfrom.getWithdrawMethod();
                Intrinsics.checkNotNullExpressionValue(withdrawMethod, "it.withdrawMethod");
                arrayList.add(new onLoadCanceled((List) apply, (List) apply2, withdrawMethod));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        return list2 == null ? CollectionsKt.emptyList() : list2;
    }
}
