package id.dana.dialog;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class DialogInform_ViewBinding implements Unbinder {
    private DialogInform length;

    @UiThread
    public DialogInform_ViewBinding(DialogInform dialogInform, View view) {
        this.length = dialogInform;
        dialogInform.btnLeft = (TextView) drawDividersHorizontal.setMin(view, R.id.f36412131362091, "field 'btnLeft'", TextView.class);
        dialogInform.btnRight = (TextView) drawDividersHorizontal.setMin(view, R.id.f36732131362125, "field 'btnRight'", TextView.class);
        dialogInform.tvBody = (TextView) drawDividersHorizontal.setMin(view, R.id.f65042131365129, "field 'tvBody'", TextView.class);
        dialogInform.tvHeader = (TextView) drawDividersHorizontal.setMin(view, R.id.f66602131365287, "field 'tvHeader'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        DialogInform dialogInform = this.length;
        if (dialogInform != null) {
            this.length = null;
            dialogInform.btnLeft = null;
            dialogInform.btnRight = null;
            dialogInform.tvBody = null;
            dialogInform.tvHeader = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
