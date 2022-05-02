package id.dana.home.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class NavigationTabView_ViewBinding implements Unbinder {
    private NavigationTabView length;

    @UiThread
    public NavigationTabView_ViewBinding(NavigationTabView navigationTabView, View view) {
        this.length = navigationTabView;
        navigationTabView.clViewNav = (ConstraintLayout) drawDividersHorizontal.length(view, R.id.f40502131362530, "field 'clViewNav'", ConstraintLayout.class);
        navigationTabView.iconIv = (ImageView) drawDividersHorizontal.setMin(view, R.id.f55682131364131, "field 'iconIv'", ImageView.class);
        navigationTabView.titleTv = (TextView) drawDividersHorizontal.setMin(view, R.id.f55712131364134, "field 'titleTv'", TextView.class);
        navigationTabView.tabNotif = (TextView) drawDividersHorizontal.length(view, R.id.f55692131364132, "field 'tabNotif'", TextView.class);
    }

    @CallSuper
    public void setMax() {
        NavigationTabView navigationTabView = this.length;
        if (navigationTabView != null) {
            this.length = null;
            navigationTabView.clViewNav = null;
            navigationTabView.iconIv = null;
            navigationTabView.titleTv = null;
            navigationTabView.tabNotif = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
