package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import id.dana.R;
import id.dana.nearbyme.model.ShopModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/nearbyrevamp/search/viewholder/NearbyMerchantLoadMoreViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/ShopModel;", "parent", "Landroid/view/ViewGroup;", "onLoadMoreClicked", "Lkotlin/Function0;", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "bindData", "item", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getDisplayPostal extends Ignore<ShopModel> {
    /* access modifiers changed from: private */
    public final Function0<Unit> setMax;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getDisplayPostal(@NotNull ViewGroup viewGroup, @NotNull Function0<Unit> function0) {
        super(viewGroup.getContext(), R.layout.item_nearby_search_load_more, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(function0, "onLoadMoreClicked");
        this.setMax = function0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ getDisplayPostal setMax;

        setMax(getDisplayPostal getdisplaypostal) {
            this.setMax = getdisplaypostal;
        }

        public final void onClick(View view) {
            this.setMax.setMax.invoke();
        }
    }

    public final /* synthetic */ void setMax(Object obj) {
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        Button button = (Button) view.findViewById(resetInternal.setMax.ICustomTabsCallback);
        if (button != null) {
            button.setOnClickListener(new setMax(this));
        }
    }
}
