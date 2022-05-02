package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.social.adapter.friendsheader.LoadMoreViewHolder;
import id.dana.social.view.activity.detail.ShimmerViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AUBasicDialog;
import o.AUHorizontalListView;
import o.IMultiInstanceInvalidationCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022 \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u0003B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H\u0016J\u001e\u0010\u000e\u001a\u00020\b2\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0018\u00010\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\bJ\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\rH\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u0006\u0010\u001a\u001a\u00020\u0017J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\u0006\u0010\u001c\u001a\u00020\u0017J$\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\rH\u0016J$\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\rH&J\u0018\u0010\"\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H\u0016J\u001e\u0010#\u001a\u00020\b2\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\bH\u0002J\u0006\u0010&\u001a\u00020\bJ\b\u0010'\u001a\u00020\bH\u0002J\u0006\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020\bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lid/dana/social/view/BaseFeedRecyclerViewAdapter;", "T", "", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/state/ViewHolderState;", "loadMore", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "appendItem", "additionalItem", "position", "", "appendItems", "additionalItems", "", "appendLoadMore", "cleanupStates", "getItemCount", "getItemViewType", "getLastItemPosition", "isAnItem", "", "isEmptyState", "isFeedsAdapterEmpty", "isLastItemAShimmer", "isLastItemAnItem", "isLastItemLoadMore", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onCreateViewHolderChild", "prependItem", "prependItems", "", "removeEmptyState", "removeLoadMore", "removeShimmer", "showEmpty", "showShimmer", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class initCustomView<T> extends IMultiInstanceInvalidationCallback.Stub<Ignore<AUHorizontalListView.RecyclerListener<? extends T>>, AUHorizontalListView.RecyclerListener<? extends T>> {
    private final Function0<Unit> setMax;

    @NotNull
    public abstract Ignore<AUHorizontalListView.RecyclerListener<T>> setMax(@NotNull ViewGroup viewGroup);

    public final /* synthetic */ void getMax(Object obj) {
        AUHorizontalListView.RecyclerListener recyclerListener = (AUHorizontalListView.RecyclerListener) obj;
        if (!IsOverlapping() && values()) {
            getMax(getItemCount() - 1);
        }
        if (!IsOverlapping() && FastBitmap$CoordinateSystem()) {
            getMax(getItemCount() - 1);
        }
        if (!IsOverlapping() && setMin()) {
            getMax(getItemCount() - 1);
        }
        super.getMax(recyclerListener);
    }

    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Ignore ignore;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i == 2) {
            ignore = new LoadMoreViewHolder(viewGroup, this.setMax);
        } else if (i == 3) {
            ignore = new ShimmerViewHolder(viewGroup);
        } else if (i != 4) {
            ignore = setMax(viewGroup);
        } else {
            ignore = new AUBasicDialog.Priority(viewGroup);
        }
        return ignore;
    }

    public initCustomView(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "loadMore");
        this.setMax = function0;
    }

    public int getItemViewType(int i) {
        Object min = setMin(i);
        Intrinsics.checkNotNullExpressionValue(min, "getItem(position)");
        return scrapActiveViews.getMin((AUHorizontalListView.RecyclerListener) min);
    }

    public int getItemCount() {
        List max = getMax();
        if (max != null) {
            return max.size();
        }
        return 0;
    }

    public final boolean setMin() {
        return !IsOverlapping() && (setMin(getItemCount() - 1) instanceof AUHorizontalListView.RecyclerListener.getMax);
    }

    private final boolean toIntRange() {
        return !IsOverlapping() && (setMin(getItemCount() - 1) instanceof AUHorizontalListView.RecyclerListener.length);
    }

    private boolean FastBitmap$CoordinateSystem() {
        return !IsOverlapping() && (setMin(getItemCount() - 1) instanceof AUHorizontalListView.RecyclerListener.setMin);
    }

    public final boolean IsOverlapping() {
        return getItemCount() <= 0;
    }

    public final void isInside() {
        if (!IsOverlapping() && toIntRange() && !setMin()) {
            AUHorizontalListView.RecyclerListener recyclerListener = AUHorizontalListView.RecyclerListener.getMax.getMax;
            if (!IsOverlapping() && values()) {
                getMax(getItemCount() - 1);
            }
            if (!IsOverlapping() && FastBitmap$CoordinateSystem()) {
                getMax(getItemCount() - 1);
            }
            if (!IsOverlapping() && setMin()) {
                getMax(getItemCount() - 1);
            }
            super.getMax(recyclerListener);
        }
    }

    public final void equals() {
        AUHorizontalListView.RecyclerListener recyclerListener = AUHorizontalListView.RecyclerListener.getMin.getMax;
        if (!IsOverlapping() && values()) {
            getMax(getItemCount() - 1);
        }
        if (!IsOverlapping() && FastBitmap$CoordinateSystem()) {
            getMax(getItemCount() - 1);
        }
        if (!IsOverlapping() && setMin()) {
            getMax(getItemCount() - 1);
        }
        super.getMax(recyclerListener);
    }

    public final void toFloatRange() {
        if (IsOverlapping() && !FastBitmap$CoordinateSystem()) {
            AUHorizontalListView.RecyclerListener recyclerListener = AUHorizontalListView.RecyclerListener.setMin.setMin;
            if (!IsOverlapping() && values()) {
                getMax(getItemCount() - 1);
            }
            if (!IsOverlapping() && FastBitmap$CoordinateSystem()) {
                getMax(getItemCount() - 1);
            }
            if (!IsOverlapping() && setMin()) {
                getMax(getItemCount() - 1);
            }
            super.getMax(recyclerListener);
        }
    }

    private final boolean values() {
        return setMin(getItemCount() - 1) instanceof AUHorizontalListView.RecyclerListener.getMin;
    }

    public final boolean setMax() {
        AUHorizontalListView.RecyclerListener recyclerListener = (AUHorizontalListView.RecyclerListener) setMin(getItemCount() - 1);
        if (IsOverlapping()) {
            return false;
        }
        if ((recyclerListener instanceof AUHorizontalListView.RecyclerListener.length) || (recyclerListener instanceof AUHorizontalListView.RecyclerListener.getMax)) {
            return true;
        }
        return false;
    }

    /* renamed from: getMin */
    public final void setMin(@Nullable AUHorizontalListView.RecyclerListener<? extends T> recyclerListener) {
        if (!IsOverlapping() && values()) {
            getMax(getItemCount() - 1);
        }
        if (!IsOverlapping() && FastBitmap$CoordinateSystem()) {
            getMax(getItemCount() - 1);
        }
        if (!IsOverlapping() && setMin()) {
            getMax(getItemCount() - 1);
        }
        super.setMin(recyclerListener);
    }

    public final void setMin(@Nullable List<AUHorizontalListView.RecyclerListener<T>> list) {
        if (!IsOverlapping() && values()) {
            getMax(getItemCount() - 1);
        }
        if (!IsOverlapping() && FastBitmap$CoordinateSystem()) {
            getMax(getItemCount() - 1);
        }
        if (!IsOverlapping() && setMin()) {
            getMax(getItemCount() - 1);
        }
        super.setMin(list);
    }

    public final void length(@Nullable List<? extends AUHorizontalListView.RecyclerListener<? extends T>> list) {
        if (!IsOverlapping() && values()) {
            getMax(getItemCount() - 1);
        }
        if (!IsOverlapping() && FastBitmap$CoordinateSystem()) {
            getMax(getItemCount() - 1);
        }
        if (!IsOverlapping() && setMin()) {
            getMax(getItemCount() - 1);
        }
        super.length(list);
    }
}
