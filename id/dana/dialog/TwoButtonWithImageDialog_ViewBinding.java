package id.dana.dialog;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.component.formcomponent.DanaCheckboxButtonView;
import id.dana.richview.LogoProgressView;
import o.drawDividersHorizontal;

public class TwoButtonWithImageDialog_ViewBinding implements Unbinder {
    private TwoButtonWithImageDialog length;

    @UiThread
    public TwoButtonWithImageDialog_ViewBinding(TwoButtonWithImageDialog twoButtonWithImageDialog, View view) {
        this.length = twoButtonWithImageDialog;
        twoButtonWithImageDialog.ivImage = (ImageView) drawDividersHorizontal.length(view, R.id.f49352131363490, "field 'ivImage'", ImageView.class);
        twoButtonWithImageDialog.tvTitle = (TextView) drawDividersHorizontal.length(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
        twoButtonWithImageDialog.tvMessage = (TextView) drawDividersHorizontal.length(view, R.id.f65682131365193, "field 'tvMessage'", TextView.class);
        twoButtonWithImageDialog.btnNegative = (Button) drawDividersHorizontal.length(view, R.id.f36492131362099, "field 'btnNegative'", Button.class);
        twoButtonWithImageDialog.btnNegativeGhost = (Button) drawDividersHorizontal.length(view, R.id.f36502131362100, "field 'btnNegativeGhost'", Button.class);
        twoButtonWithImageDialog.btnPositive = (Button) drawDividersHorizontal.length(view, R.id.f36602131362112, "field 'btnPositive'", Button.class);
        twoButtonWithImageDialog.lpvLoading = (LogoProgressView) drawDividersHorizontal.setMin(view, R.id.f54112131363968, "field 'lpvLoading'", LogoProgressView.class);
        twoButtonWithImageDialog.cbNoDialogAnymore = (DanaCheckboxButtonView) drawDividersHorizontal.setMin(view, R.id.f37722131362227, "field 'cbNoDialogAnymore'", DanaCheckboxButtonView.class);
        twoButtonWithImageDialog.tvDialogFooterText = (TextView) drawDividersHorizontal.setMin(view, R.id.f65792131365205, "field 'tvDialogFooterText'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        TwoButtonWithImageDialog twoButtonWithImageDialog = this.length;
        if (twoButtonWithImageDialog != null) {
            this.length = null;
            twoButtonWithImageDialog.ivImage = null;
            twoButtonWithImageDialog.tvTitle = null;
            twoButtonWithImageDialog.tvMessage = null;
            twoButtonWithImageDialog.btnNegative = null;
            twoButtonWithImageDialog.btnNegativeGhost = null;
            twoButtonWithImageDialog.btnPositive = null;
            twoButtonWithImageDialog.lpvLoading = null;
            twoButtonWithImageDialog.cbNoDialogAnymore = null;
            twoButtonWithImageDialog.tvDialogFooterText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
