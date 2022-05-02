package id.dana.richview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SelectedAccountView_ViewBinding implements Unbinder {
    private SelectedAccountView getMin;

    @UiThread
    public SelectedAccountView_ViewBinding(SelectedAccountView selectedAccountView, View view) {
        this.getMin = selectedAccountView;
        selectedAccountView.ivAccount = (ImageView) drawDividersHorizontal.setMin(view, R.id.f47892131363342, "field 'ivAccount'", ImageView.class);
        selectedAccountView.tvBody = (TextView) drawDividersHorizontal.setMin(view, R.id.f65042131365129, "field 'tvBody'", TextView.class);
        selectedAccountView.tvHeader = (TextView) drawDividersHorizontal.setMin(view, R.id.f66602131365287, "field 'tvHeader'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        SelectedAccountView selectedAccountView = this.getMin;
        if (selectedAccountView != null) {
            this.getMin = null;
            selectedAccountView.ivAccount = null;
            selectedAccountView.tvBody = null;
            selectedAccountView.tvHeader = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
