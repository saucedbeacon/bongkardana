package id.dana.nearbyme;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.HomeWidgetBase;
import o.drawDividersHorizontal;

public class NewNearbyMeView_ViewBinding implements Unbinder {
    private NewNearbyMeView getMax;

    @UiThread
    public NewNearbyMeView_ViewBinding(NewNearbyMeView newNearbyMeView, View view) {
        this.getMax = newNearbyMeView;
        newNearbyMeView.clNearbyMeEntryPointParent = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39872131362467, "field 'clNearbyMeEntryPointParent'", ConstraintLayout.class);
        newNearbyMeView.homeWidgetBase = (HomeWidgetBase) drawDividersHorizontal.setMin(view, R.id.f45852131363130, "field 'homeWidgetBase'", HomeWidgetBase.class);
        newNearbyMeView.ivWidgetMap = (ImageView) drawDividersHorizontal.setMin(view, R.id.f51182131363673, "field 'ivWidgetMap'", ImageView.class);
        newNearbyMeView.llMapSection = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53332131363889, "field 'llMapSection'", LinearLayout.class);
        newNearbyMeView.nearbyWidgetEmptyStateView = (NewNearbyWidgetEmptyStateView) drawDividersHorizontal.setMin(view, R.id.f72672131365902, "field 'nearbyWidgetEmptyStateView'", NewNearbyWidgetEmptyStateView.class);
        newNearbyMeView.nearbyWidgetLocationPermissionStateView = (NearbyWidgetLocationPermissionStateView) drawDividersHorizontal.setMin(view, R.id.f72682131365903, "field 'nearbyWidgetLocationPermissionStateView'", NearbyWidgetLocationPermissionStateView.class);
        newNearbyMeView.rvNearbyShop = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59502131364535, "field 'rvNearbyShop'", RecyclerView.class);
        newNearbyMeView.tvCurrentLocation = (TextView) drawDividersHorizontal.setMin(view, R.id.f65392131365164, "field 'tvCurrentLocation'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        NewNearbyMeView newNearbyMeView = this.getMax;
        if (newNearbyMeView != null) {
            this.getMax = null;
            newNearbyMeView.clNearbyMeEntryPointParent = null;
            newNearbyMeView.homeWidgetBase = null;
            newNearbyMeView.ivWidgetMap = null;
            newNearbyMeView.llMapSection = null;
            newNearbyMeView.nearbyWidgetEmptyStateView = null;
            newNearbyMeView.nearbyWidgetLocationPermissionStateView = null;
            newNearbyMeView.rvNearbyShop = null;
            newNearbyMeView.tvCurrentLocation = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
