package o;

import android.view.ViewGroup;
import id.dana.sendmoney.bank.all.BankViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/sendmoney_v2/recipient/bank/viewholder/SearchBankViewHolder;", "Lid/dana/sendmoney/bank/all/BankViewHolder;", "parent", "Landroid/view/ViewGroup;", "recipientSelectedListener", "Lid/dana/sendmoney/view/RecipientSelectedListener;", "(Landroid/view/ViewGroup;Lid/dana/sendmoney/view/RecipientSelectedListener;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class notifyVerticalEdgeReached extends BankViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public notifyVerticalEdgeReached(@NotNull ViewGroup viewGroup, @Nullable PhotoItem photoItem) {
        super(viewGroup, photoItem);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.ivChangeIcon.setVisibility(8);
        this.vDividerFull.setVisibility(8);
        this.vDividerWithMargin.setVisibility(0);
    }
}
