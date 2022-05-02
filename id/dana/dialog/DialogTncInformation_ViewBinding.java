package id.dana.dialog;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class DialogTncInformation_ViewBinding implements Unbinder {
    private DialogTncInformation length;

    @UiThread
    public DialogTncInformation_ViewBinding(DialogTncInformation dialogTncInformation, View view) {
        this.length = dialogTncInformation;
        dialogTncInformation.btnTncOk = (Button) drawDividersHorizontal.setMin(view, R.id.f36902131362142, "field 'btnTncOk'", Button.class);
    }

    @CallSuper
    public final void setMax() {
        DialogTncInformation dialogTncInformation = this.length;
        if (dialogTncInformation != null) {
            this.length = null;
            dialogTncInformation.btnTncOk = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
