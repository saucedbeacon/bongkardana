package id.dana.sendmoney.bank.savedcard;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.sendmoney.bank.other.OtherBankAccountView;
import o.drawDividersHorizontal;

public class AddOtherCardDialogFragment_ViewBinding implements Unbinder {
    private AddOtherCardDialogFragment getMax;

    @UiThread
    public AddOtherCardDialogFragment_ViewBinding(AddOtherCardDialogFragment addOtherCardDialogFragment, View view) {
        this.getMax = addOtherCardDialogFragment;
        addOtherCardDialogFragment.coordinatorLayout = (CoordinatorLayout) drawDividersHorizontal.setMin(view, R.id.f51802131363736, "field 'coordinatorLayout'", CoordinatorLayout.class);
        addOtherCardDialogFragment.nsContent = (NestedScrollView) drawDividersHorizontal.setMin(view, R.id.f56082131364174, "field 'nsContent'", NestedScrollView.class);
        addOtherCardDialogFragment.otherBankAccountView = (OtherBankAccountView) drawDividersHorizontal.setMin(view, R.id.f72782131365913, "field 'otherBankAccountView'", OtherBankAccountView.class);
    }

    @CallSuper
    public final void setMax() {
        AddOtherCardDialogFragment addOtherCardDialogFragment = this.getMax;
        if (addOtherCardDialogFragment != null) {
            this.getMax = null;
            addOtherCardDialogFragment.coordinatorLayout = null;
            addOtherCardDialogFragment.nsContent = null;
            addOtherCardDialogFragment.otherBankAccountView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
