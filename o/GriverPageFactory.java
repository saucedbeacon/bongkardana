package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import id.dana.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lid/dana/nearbyme/adapter/viewholder/SeeMoreButtonViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/MerchantItemWrapper;", "parent", "Landroid/view/ViewGroup;", "onSeeMoreClick", "Lkotlin/Function0;", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverPageFactory extends Ignore<H5Worker> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GriverPageFactory(@NotNull ViewGroup viewGroup, @NotNull final Function0<Unit> function0) {
        super(viewGroup.getContext(), R.layout.item_see_more_button, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(function0, "onSeeMoreClick");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        Button button = (Button) view.findViewById(resetInternal.setMax.read);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    function0.invoke();
                }
            });
        }
    }
}
