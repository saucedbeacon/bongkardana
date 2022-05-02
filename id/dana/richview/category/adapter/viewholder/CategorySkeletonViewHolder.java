package id.dana.richview.category.adapter.viewholder;

import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.richview.EllipseTextView;
import id.dana.richview.category.model.CategoryModel;
import o.Ignore;
import o.IntRange;
import o.getInsetDodgeRect;

public class CategorySkeletonViewHolder extends Ignore<CategoryModel> {
    @BindView(2131362837)
    EllipseTextView etvSkeleton;

    public CategorySkeletonViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.view_skeleton_ellipse_text, viewGroup);
    }

    public final /* synthetic */ void setMax(Object obj) {
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.etvSkeleton);
        setmax.getMax = R.layout.view_skeleton_ellipse_text;
        setmax.setMax = 1500;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        setmax.isInside = 0;
        new getInsetDodgeRect(setmax, (byte) 0).getMin();
    }
}
