package o;

import android.view.ViewGroup;
import id.dana.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lid/dana/explore/adapter/viewholder/ExploreProductLoadingViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/explore/model/ExploreProductWrapper;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "productSkeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getProductSkeletonScreen", "()Lcom/ethanhua/skeleton/SkeletonScreen;", "productSkeletonScreen$delegate", "Lkotlin/Lazy;", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BluetoothHelper extends Ignore<supportAdvertise> {
    private final Lazy setMax = LazyKt.lazy(new setMin(this));

    public final /* synthetic */ void setMax(Object obj) {
        super.setMax((supportAdvertise) obj);
        ((onDetachedFromLayoutParams) this.setMax.getValue()).getMin();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothHelper(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.view_explore_product_skeleton, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<getInsetDodgeRect> {
        final /* synthetic */ BluetoothHelper this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(BluetoothHelper bluetoothHelper) {
            super(0);
            this.this$0 = bluetoothHelper;
        }

        public final getInsetDodgeRect invoke() {
            return containsFavoriteMenuItem.getMin(this.this$0.itemView, R.layout.view_explore_service_skeleton);
        }
    }
}
