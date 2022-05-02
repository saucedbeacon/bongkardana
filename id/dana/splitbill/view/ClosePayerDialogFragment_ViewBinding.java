package id.dana.splitbill.view;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.LogoProgressView;
import o.drawDividersHorizontal;

public class ClosePayerDialogFragment_ViewBinding implements Unbinder {
    private ClosePayerDialogFragment setMin;

    @UiThread
    public ClosePayerDialogFragment_ViewBinding(ClosePayerDialogFragment closePayerDialogFragment, View view) {
        this.setMin = closePayerDialogFragment;
        closePayerDialogFragment.coordinatorLayout = (CoordinatorLayout) drawDividersHorizontal.setMin(view, R.id.f51802131363736, "field 'coordinatorLayout'", CoordinatorLayout.class);
        closePayerDialogFragment.cvpClosePayer = (ClosePayerView) drawDividersHorizontal.setMin(view, R.id.f41192131362605, "field 'cvpClosePayer'", ClosePayerView.class);
        closePayerDialogFragment.btnSubmitClosePayer = (Button) drawDividersHorizontal.setMin(view, R.id.f36892131362141, "field 'btnSubmitClosePayer'", Button.class);
        closePayerDialogFragment.lpvClosePayer = (LogoProgressView) drawDividersHorizontal.setMin(view, R.id.f57112131364288, "field 'lpvClosePayer'", LogoProgressView.class);
    }

    @CallSuper
    public final void setMax() {
        ClosePayerDialogFragment closePayerDialogFragment = this.setMin;
        if (closePayerDialogFragment != null) {
            this.setMin = null;
            closePayerDialogFragment.coordinatorLayout = null;
            closePayerDialogFragment.cvpClosePayer = null;
            closePayerDialogFragment.btnSubmitClosePayer = null;
            closePayerDialogFragment.lpvClosePayer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
