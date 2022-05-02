package id.dana.home.tab;

import android.view.View;
import android.widget.ImageButton;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.Unbinder;
import com.google.android.material.tabs.TabLayout;
import id.dana.R;
import id.dana.popup.LockableViewPager;
import o.drawDividersHorizontal;

public class HomeTabFragment_ViewBinding implements Unbinder {
    private HomeTabFragment getMin;

    @UiThread
    public HomeTabFragment_ViewBinding(HomeTabFragment homeTabFragment, View view) {
        this.getMin = homeTabFragment;
        homeTabFragment.tabLayout = (TabLayout) drawDividersHorizontal.setMin(view, R.id.f35172131361963, "field 'tabLayout'", TabLayout.class);
        homeTabFragment.viewPager = (LockableViewPager) drawDividersHorizontal.setMin(view, R.id.f72802131365915, "field 'viewPager'", LockableViewPager.class);
        homeTabFragment.clContainer = (CoordinatorLayout) drawDividersHorizontal.setMin(view, R.id.f39192131362398, "field 'clContainer'", CoordinatorLayout.class);
        homeTabFragment.btnHomeTabPay = (ImageButton) drawDividersHorizontal.setMin(view, R.id.f36352131362085, "field 'btnHomeTabPay'", ImageButton.class);
        homeTabFragment.viewBottomNavSeparator = drawDividersHorizontal.getMax(view, R.id.f60572131364645, "field 'viewBottomNavSeparator'");
    }

    @CallSuper
    public final void setMax() {
        HomeTabFragment homeTabFragment = this.getMin;
        if (homeTabFragment != null) {
            this.getMin = null;
            homeTabFragment.tabLayout = null;
            homeTabFragment.viewPager = null;
            homeTabFragment.clContainer = null;
            homeTabFragment.btnHomeTabPay = null;
            homeTabFragment.viewBottomNavSeparator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
