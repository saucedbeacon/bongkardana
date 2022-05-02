package id.dana.richview.category;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class CategoryView_ViewBinding implements Unbinder {
    private CategoryView getMax;

    @UiThread
    public CategoryView_ViewBinding(CategoryView categoryView, View view) {
        this.getMax = categoryView;
        categoryView.llCategory = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f52932131363849, "field 'llCategory'", LinearLayout.class);
        categoryView.rvCategory = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59152131364500, "field 'rvCategory'", RecyclerView.class);
        categoryView.viewDivider = drawDividersHorizontal.getMax(view, R.id.f72252131365860, "field 'viewDivider'");
    }

    @CallSuper
    public final void setMax() {
        CategoryView categoryView = this.getMax;
        if (categoryView != null) {
            this.getMax = null;
            categoryView.llCategory = null;
            categoryView.rvCategory = null;
            categoryView.viewDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
