package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import id.dana.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/sendmoney_v2/landing/viewholder/MoreTransactionViewHolder;", "T", "Lid/dana/base/BaseRecyclerViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "setExpandAnimation", "", "setExpanded", "expanded", "", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CircleProgressBar<T> extends Ignore<T> {
    /* access modifiers changed from: private */
    public final ViewGroup setMax;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircleProgressBar(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_recent_transaction_more, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.setMax = viewGroup;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ CircleProgressBar length;

        setMin(CircleProgressBar circleProgressBar) {
            this.length = circleProgressBar;
        }

        public final void onClick(View view) {
            RecyclerView.Adapter<? extends RecyclerView.valueOf> bindingAdapter = this.length.getBindingAdapter();
            if (!(bindingAdapter instanceof isIndexValidInList)) {
                bindingAdapter = null;
            }
            isIndexValidInList isindexvalidinlist = (isIndexValidInList) bindingAdapter;
            if (isindexvalidinlist != null) {
                isindexvalidinlist.toFloatRange();
            }
            CircleProgressBar.setMin(this.length.setMax);
        }
    }

    public final void setMin(@Nullable Ignore.setMin setmin) {
        this.itemView.setOnClickListener(new setMin(this));
    }

    public static final /* synthetic */ void setMin(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewParent viewParent = null;
        ViewParent parent2 = parent != null ? parent.getParent() : null;
        if (parent2 instanceof ViewGroup) {
            viewParent = parent2;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewParent;
        if (viewGroup2 != null) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setInterpolator(new DecelerateInterpolator());
            Unit unit = Unit.INSTANCE;
            isHideOnContentScrollEnabled.getMin(viewGroup2, autoTransition);
        }
    }
}
