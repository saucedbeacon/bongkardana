package o;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"EMPTY_VIEW_TYPE", "", "ITEM_VIEW_TYPE", "LOADMORE_VIEW_TYPE", "SHIMMER_VIEW_TYPE", "getViewHolderStateViewType", "viewHolderState", "Lid/dana/social/state/ViewHolderState;", "", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class scrapActiveViews {
    public static final int getMin(@NotNull AUHorizontalListView.RecyclerListener<? extends Object> recyclerListener) {
        Intrinsics.checkNotNullParameter(recyclerListener, "viewHolderState");
        if (recyclerListener instanceof AUHorizontalListView.RecyclerListener.length) {
            return 1;
        }
        if (recyclerListener instanceof AUHorizontalListView.RecyclerListener.getMax) {
            return 2;
        }
        if (recyclerListener instanceof AUHorizontalListView.RecyclerListener.setMin) {
            return 3;
        }
        if (recyclerListener instanceof AUHorizontalListView.RecyclerListener.getMin) {
            return 4;
        }
        throw new NoWhenBranchMatchedException();
    }
}
