package o;

import android.view.View;
import android.view.ViewGroup;
import id.dana.R;
import id.dana.richview.EllipseTextView;
import id.dana.richview.category.model.CategoryModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002¨\u0006\r"}, d2 = {"Lid/dana/richview/category/adapter/viewholder/ChipCategoryViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/richview/category/model/CategoryModel;", "parent", "Landroid/view/ViewGroup;", "onClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "(Landroid/view/ViewGroup;Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;)V", "bindData", "", "data", "selectedView", "unSelectView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class compressJpg extends Ignore<CategoryModel> {
    public final /* synthetic */ void setMax(Object obj) {
        CategoryModel categoryModel = (CategoryModel) obj;
        Intrinsics.checkNotNullParameter(categoryModel, "data");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        EllipseTextView ellipseTextView = (EllipseTextView) view.findViewById(resetInternal.setMax.MainThread);
        if (ellipseTextView != null) {
            String str = categoryModel.setMax;
            if (str == null) {
                str = categoryModel.getMin;
            }
            ellipseTextView.setText(str);
            if (categoryModel.length()) {
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                EllipseTextView ellipseTextView2 = (EllipseTextView) view2.findViewById(resetInternal.setMax.MainThread);
                if (ellipseTextView2 != null) {
                    ellipseTextView2.setBackgroundColor(IntRange.setMax(ellipseTextView2.getContext(), R.color.f18392131099713));
                    ellipseTextView2.setTextColor(IntRange.setMax(ellipseTextView2.getContext(), R.color.f24762131100430));
                    ellipseTextView2.setStrokeColor(IntRange.setMax(ellipseTextView2.getContext(), R.color.f18392131099713));
                    return;
                }
                return;
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            EllipseTextView ellipseTextView3 = (EllipseTextView) view3.findViewById(resetInternal.setMax.MainThread);
            if (ellipseTextView3 != null) {
                ellipseTextView3.setBackgroundColor(IntRange.setMax(ellipseTextView3.getContext(), R.color.f24762131100430));
                ellipseTextView3.setTextColor(IntRange.setMax(ellipseTextView3.getContext(), R.color.f18782131099765));
                ellipseTextView3.setStrokeColor(IntRange.setMax(ellipseTextView3.getContext(), R.color.f24642131100414));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public compressJpg(@NotNull ViewGroup viewGroup, @Nullable Ignore.setMin setmin) {
        super(viewGroup.getContext(), R.layout.view_ellipse_text, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        setMin(setmin);
    }
}
