package id.dana.social.view;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.google.android.material.tabs.TabLayout;
import id.dana.R;
import o.drawDividersHorizontal;

public final class ActivityReactionsBottomSheetDialog_ViewBinding implements Unbinder {
    private ActivityReactionsBottomSheetDialog getMin;

    @UiThread
    public ActivityReactionsBottomSheetDialog_ViewBinding(ActivityReactionsBottomSheetDialog activityReactionsBottomSheetDialog, View view) {
        this.getMin = activityReactionsBottomSheetDialog;
        activityReactionsBottomSheetDialog.flActivityReactions = (FrameLayout) drawDividersHorizontal.setMin(view, R.id.f44152131362940, "field 'flActivityReactions'", FrameLayout.class);
        activityReactionsBottomSheetDialog.clActivityReactions = (CoordinatorLayout) drawDividersHorizontal.setMin(view, R.id.f39592131362438, "field 'clActivityReactions'", CoordinatorLayout.class);
        activityReactionsBottomSheetDialog.tabLayoutActivityReactions = (TabLayout) drawDividersHorizontal.setMin(view, R.id.f62412131364854, "field 'tabLayoutActivityReactions'", TabLayout.class);
        activityReactionsBottomSheetDialog.vpActivityReactions = (ViewPager) drawDividersHorizontal.setMin(view, R.id.f73642131365999, "field 'vpActivityReactions'", ViewPager.class);
    }

    public final void setMax() {
        ActivityReactionsBottomSheetDialog activityReactionsBottomSheetDialog = this.getMin;
        if (activityReactionsBottomSheetDialog != null) {
            this.getMin = null;
            activityReactionsBottomSheetDialog.flActivityReactions = null;
            activityReactionsBottomSheetDialog.clActivityReactions = null;
            activityReactionsBottomSheetDialog.tabLayoutActivityReactions = null;
            activityReactionsBottomSheetDialog.vpActivityReactions = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
