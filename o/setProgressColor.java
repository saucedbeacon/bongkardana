package o;

import android.view.ViewGroup;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/sendmoney_v2/landing/viewholder/recepient/PlaceholderRecipientViewHolder;", "T", "Lid/dana/base/BaseRecyclerViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setProgressColor<T> extends Ignore<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setProgressColor(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_recipient_placeholder, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }
}
