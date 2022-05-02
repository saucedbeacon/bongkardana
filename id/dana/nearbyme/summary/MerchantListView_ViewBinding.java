package id.dana.nearbyme.summary;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.nearbyme.NearbyMerchantLocationSearchView;
import o.drawDividersHorizontal;

public class MerchantListView_ViewBinding implements Unbinder {
    private MerchantListView getMax;

    @UiThread
    public MerchantListView_ViewBinding(MerchantListView merchantListView, View view) {
        this.getMax = merchantListView;
        merchantListView.clMerchantList = (CoordinatorLayout) drawDividersHorizontal.setMin(view, R.id.f39792131362459, "field 'clMerchantList'", CoordinatorLayout.class);
        merchantListView.clToolbarContent = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40442131362524, "field 'clToolbarContent'", ConstraintLayout.class);
        merchantListView.etNearbySearch = (EditText) drawDividersHorizontal.setMin(view, R.id.f43092131362827, "field 'etNearbySearch'", EditText.class);
        merchantListView.llMerchantListEmptyState = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53342131363890, "field 'llMerchantListEmptyState'", LinearLayout.class);
        merchantListView.nearbyMerchantLocationSearchView = (NearbyMerchantLocationSearchView) drawDividersHorizontal.setMin(view, R.id.f72702131365905, "field 'nearbyMerchantLocationSearchView'", NearbyMerchantLocationSearchView.class);
        merchantListView.nestedScrollView = (NestedScrollView) drawDividersHorizontal.setMin(view, R.id.f55822131364145, "field 'nestedScrollView'", NestedScrollView.class);
        merchantListView.rvMerchantCategory = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59402131364525, "field 'rvMerchantCategory'", RecyclerView.class);
        merchantListView.rvMerchantList = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59432131364528, "field 'rvMerchantList'", RecyclerView.class);
        merchantListView.viewDivider = drawDividersHorizontal.getMax(view, R.id.f72252131365860, "field 'viewDivider'");
        merchantListView.viewSpacer = drawDividersHorizontal.getMax(view, R.id.f73262131365961, "field 'viewSpacer'");
    }

    @CallSuper
    public final void setMax() {
        MerchantListView merchantListView = this.getMax;
        if (merchantListView != null) {
            this.getMax = null;
            merchantListView.clMerchantList = null;
            merchantListView.clToolbarContent = null;
            merchantListView.etNearbySearch = null;
            merchantListView.llMerchantListEmptyState = null;
            merchantListView.nearbyMerchantLocationSearchView = null;
            merchantListView.nestedScrollView = null;
            merchantListView.rvMerchantCategory = null;
            merchantListView.rvMerchantList = null;
            merchantListView.viewDivider = null;
            merchantListView.viewSpacer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
