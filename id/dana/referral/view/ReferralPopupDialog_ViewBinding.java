package id.dana.referral.view;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class ReferralPopupDialog_ViewBinding implements Unbinder {
    private ReferralPopupDialog length;

    @UiThread
    public ReferralPopupDialog_ViewBinding(ReferralPopupDialog referralPopupDialog, View view) {
        this.length = referralPopupDialog;
        referralPopupDialog.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
        referralPopupDialog.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvDescription'", TextView.class);
        referralPopupDialog.btnPrimaryAction = (Button) drawDividersHorizontal.setMin(view, R.id.f36632131362115, "field 'btnPrimaryAction'", Button.class);
        referralPopupDialog.btnSecondaryAction = (Button) drawDividersHorizontal.setMin(view, R.id.f36762131362128, "field 'btnSecondaryAction'", Button.class);
        referralPopupDialog.cbDialogReferral = (CheckBox) drawDividersHorizontal.setMin(view, R.id.f37692131362224, "field 'cbDialogReferral'", CheckBox.class);
        referralPopupDialog.tvCheckboxDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65192131365144, "field 'tvCheckboxDescription'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        ReferralPopupDialog referralPopupDialog = this.length;
        if (referralPopupDialog != null) {
            this.length = null;
            referralPopupDialog.tvTitle = null;
            referralPopupDialog.tvDescription = null;
            referralPopupDialog.btnPrimaryAction = null;
            referralPopupDialog.btnSecondaryAction = null;
            referralPopupDialog.cbDialogReferral = null;
            referralPopupDialog.tvCheckboxDescription = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
