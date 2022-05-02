package id.dana.savings.activity;

import id.dana.R;
import id.dana.base.EmptyStateRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.IntRange;
import o.getScrimColor;
import o.resetInternal;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
final class SavingsActivity$FastBitmap$CoordinateSystem extends Lambda implements Function0<getScrimColor> {
    final /* synthetic */ SavingsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SavingsActivity$FastBitmap$CoordinateSystem(SavingsActivity savingsActivity) {
        super(0);
        this.this$0 = savingsActivity;
    }

    public final getScrimColor invoke() {
        getScrimColor.getMax getmax = new getScrimColor.getMax((EmptyStateRecyclerView) this.this$0._$_findCachedViewById(resetInternal.setMax.AppCompatImageView));
        getmax.length = SavingsActivity.access$getSavingAdapter$p(this.this$0);
        getmax.getMax = R.layout.view_goal_list_skeleton;
        getmax.IsOverlapping = 1500;
        getmax.getMin = true;
        getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
        getmax.toIntRange = 20;
        getmax.setMin = 1;
        getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
        getscrimcolor.getMin();
        return getscrimcolor;
    }
}
