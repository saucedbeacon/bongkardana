package o;

import id.dana.promocenter.views.PromoCenterActivity;
import id.dana.richview.category.CategoryView;
import id.dana.richview.category.model.CategoryModel;

public final class GriverDataCacheExtension implements CategoryView.setMin {
    private final PromoCenterActivity setMax;

    public GriverDataCacheExtension(PromoCenterActivity promoCenterActivity) {
        this.setMax = promoCenterActivity;
    }

    public final void setMin(CategoryModel categoryModel, boolean z) {
        PromoCenterActivity.getMax(this.setMax, categoryModel, z);
    }
}
