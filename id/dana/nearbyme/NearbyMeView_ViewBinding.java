package id.dana.nearbyme;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class NearbyMeView_ViewBinding implements Unbinder {
    private View getMin;
    private NearbyMeView length;

    @UiThread
    public NearbyMeView_ViewBinding(final NearbyMeView nearbyMeView, View view) {
        this.length = nearbyMeView;
        nearbyMeView.btnCheckMyArea = (Button) drawDividersHorizontal.setMin(view, R.id.f36102131362057, "field 'btnCheckMyArea'", Button.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f37062131362158, "field 'btnViewAll' and method 'onViewAllClicked'");
        nearbyMeView.btnViewAll = (DanaButtonSecondaryView) drawDividersHorizontal.getMin(max, R.id.f37062131362158, "field 'btnViewAll'", DanaButtonSecondaryView.class);
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                nearbyMeView.onViewAllClicked();
            }
        });
        nearbyMeView.clNearbyMeEntryPointParent = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39872131362467, "field 'clNearbyMeEntryPointParent'", ConstraintLayout.class);
        nearbyMeView.clNoPermissionContainer = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39932131362473, "field 'clNoPermissionContainer'", ConstraintLayout.class);
        nearbyMeView.nearbyWidgetEmptyStateView = (NearbyWidgetEmptyStateView) drawDividersHorizontal.setMin(view, R.id.f72672131365902, "field 'nearbyWidgetEmptyStateView'", NearbyWidgetEmptyStateView.class);
        nearbyMeView.rvNearbyShop = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59502131364535, "field 'rvNearbyShop'", RecyclerView.class);
    }

    @CallSuper
    public final void setMax() {
        NearbyMeView nearbyMeView = this.length;
        if (nearbyMeView != null) {
            this.length = null;
            nearbyMeView.btnCheckMyArea = null;
            nearbyMeView.btnViewAll = null;
            nearbyMeView.clNearbyMeEntryPointParent = null;
            nearbyMeView.clNoPermissionContainer = null;
            nearbyMeView.nearbyWidgetEmptyStateView = null;
            nearbyMeView.rvNearbyShop = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
