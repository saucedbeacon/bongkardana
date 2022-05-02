package id.dana.richview;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class LogoListView_ViewBinding implements Unbinder {
    private LogoListView getMin;

    @UiThread
    public LogoListView_ViewBinding(LogoListView logoListView, View view) {
        this.getMin = logoListView;
        logoListView.rvLogo = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59372131364522, "field 'rvLogo'", RecyclerView.class);
    }

    @CallSuper
    public final void setMax() {
        LogoListView logoListView = this.getMin;
        if (logoListView != null) {
            this.getMin = null;
            logoListView.rvLogo = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
