package id.dana.richview.category.adapter.viewholder;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.EllipseTextView;
import o.drawDividersHorizontal;

public class CategorySkeletonViewHolder_ViewBinding implements Unbinder {
    private CategorySkeletonViewHolder getMin;

    @UiThread
    public CategorySkeletonViewHolder_ViewBinding(CategorySkeletonViewHolder categorySkeletonViewHolder, View view) {
        this.getMin = categorySkeletonViewHolder;
        categorySkeletonViewHolder.etvSkeleton = (EllipseTextView) drawDividersHorizontal.setMin(view, R.id.f43192131362837, "field 'etvSkeleton'", EllipseTextView.class);
    }

    @CallSuper
    public final void setMax() {
        CategorySkeletonViewHolder categorySkeletonViewHolder = this.getMin;
        if (categorySkeletonViewHolder != null) {
            this.getMin = null;
            categorySkeletonViewHolder.etvSkeleton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
