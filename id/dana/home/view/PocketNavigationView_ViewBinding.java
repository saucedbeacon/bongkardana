package id.dana.home.view;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.UiThread;
import id.dana.R;
import o.drawDividersHorizontal;

public class PocketNavigationView_ViewBinding extends NavigationTabView_ViewBinding {
    private PocketNavigationView length;

    @UiThread
    public PocketNavigationView_ViewBinding(PocketNavigationView pocketNavigationView, View view) {
        super(pocketNavigationView, view);
        this.length = pocketNavigationView;
        pocketNavigationView.tabNotif = (ImageView) drawDividersHorizontal.length(view, R.id.f55702131364133, "field 'tabNotif'", ImageView.class);
    }

    public final void setMax() {
        PocketNavigationView pocketNavigationView = this.length;
        if (pocketNavigationView != null) {
            this.length = null;
            pocketNavigationView.tabNotif = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
