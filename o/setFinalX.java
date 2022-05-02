package o;

import android.view.ViewGroup;
import id.dana.R;
import id.dana.sendmoney.model.RecipientViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lid/dana/sendmoney_v2/recipient/bank/viewholder/EmptySearchRecentBankViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/sendmoney/model/RecipientViewModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "getParent", "()Landroid/view/ViewGroup;", "bindData", "", "data", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setFinalX extends Ignore<RecipientViewModel> {
    @NotNull
    private final ViewGroup getMin;

    public final void setMin(@NotNull Ignore.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "onItemClickListener");
    }

    public final /* synthetic */ void setMax(Object obj) {
        Intrinsics.checkNotNullParameter((RecipientViewModel) obj, "data");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setFinalX(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_empty_search_recent_bank, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.getMin = viewGroup;
    }
}
