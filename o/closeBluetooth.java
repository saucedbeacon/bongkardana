package o;

import android.view.ViewGroup;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/explore/adapter/viewholder/ExploreServiceLoadingViewholder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/explore/model/ExploreServiceWrapper;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class closeBluetooth extends Ignore<getUUIDFromString> {
    private final ViewGroup getMin;
    private onDetachedFromLayoutParams setMax;

    public final /* synthetic */ void setMax(Object obj) {
        super.setMax((getUUIDFromString) obj);
        if (this.setMax == null) {
            this.setMax = containsFavoriteMenuItem.getMin(this.itemView, R.layout.view_explore_service_skeleton);
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public closeBluetooth(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.view_explore_service_skeleton, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.getMin = viewGroup;
    }
}
