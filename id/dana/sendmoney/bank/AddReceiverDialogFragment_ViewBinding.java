package id.dana.sendmoney.bank;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.CustomEditText;
import id.dana.richview.LogoListView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class AddReceiverDialogFragment_ViewBinding implements Unbinder {
    private AddReceiverDialogFragment length;
    private View setMin;

    @UiThread
    public AddReceiverDialogFragment_ViewBinding(final AddReceiverDialogFragment addReceiverDialogFragment, View view) {
        this.length = addReceiverDialogFragment;
        addReceiverDialogFragment.coordinatorLayout = (CoordinatorLayout) drawDividersHorizontal.setMin(view, R.id.f51802131363736, "field 'coordinatorLayout'", CoordinatorLayout.class);
        addReceiverDialogFragment.clReceiverInputField = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40212131362501, "field 'clReceiverInputField'", ConstraintLayout.class);
        addReceiverDialogFragment.cetReceiverName = (CustomEditText) drawDividersHorizontal.setMin(view, R.id.f37942131362271, "field 'cetReceiverName'", CustomEditText.class);
        addReceiverDialogFragment.cetReceivePhoneNumber = (CustomEditText) drawDividersHorizontal.setMin(view, R.id.f37952131362272, "field 'cetReceivePhoneNumber'", CustomEditText.class);
        addReceiverDialogFragment.cetReceiverDateOfBirth = (CustomEditText) drawDividersHorizontal.setMin(view, R.id.f37932131362270, "field 'cetReceiverDateOfBirth'", CustomEditText.class);
        addReceiverDialogFragment.llvTransferAgents = (LogoListView) drawDividersHorizontal.setMin(view, R.id.f53912131363947, "field 'llvTransferAgents'", LogoListView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f36012131362047, "field 'btnAddReceiverInfo' and method 'onAddreceiverInfoClicked'");
        addReceiverDialogFragment.btnAddReceiverInfo = (Button) drawDividersHorizontal.getMin(max, R.id.f36012131362047, "field 'btnAddReceiverInfo'", Button.class);
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                addReceiverDialogFragment.onAddreceiverInfoClicked();
            }
        });
        addReceiverDialogFragment.nsContent = (NestedScrollView) drawDividersHorizontal.setMin(view, R.id.f56082131364174, "field 'nsContent'", NestedScrollView.class);
    }

    @CallSuper
    public final void setMax() {
        AddReceiverDialogFragment addReceiverDialogFragment = this.length;
        if (addReceiverDialogFragment != null) {
            this.length = null;
            addReceiverDialogFragment.coordinatorLayout = null;
            addReceiverDialogFragment.clReceiverInputField = null;
            addReceiverDialogFragment.cetReceiverName = null;
            addReceiverDialogFragment.cetReceivePhoneNumber = null;
            addReceiverDialogFragment.cetReceiverDateOfBirth = null;
            addReceiverDialogFragment.llvTransferAgents = null;
            addReceiverDialogFragment.btnAddReceiverInfo = null;
            addReceiverDialogFragment.nsContent = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
