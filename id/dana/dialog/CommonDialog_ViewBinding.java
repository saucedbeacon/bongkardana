package id.dana.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class CommonDialog_ViewBinding implements Unbinder {
    private CommonDialog getMin;

    @UiThread
    public CommonDialog_ViewBinding(CommonDialog commonDialog, View view) {
        this.getMin = commonDialog;
        commonDialog.icImage = (ImageView) drawDividersHorizontal.length(view, R.id.f46062131363151, "field 'icImage'", ImageView.class);
        commonDialog.icImageFg = (ImageView) drawDividersHorizontal.length(view, R.id.f46072131363152, "field 'icImageFg'", ImageView.class);
        commonDialog.tvTitle = (TextView) drawDividersHorizontal.length(view, R.id.f69812131365610, "field 'tvTitle'", TextView.class);
        commonDialog.tvMessage = (TextView) drawDividersHorizontal.length(view, R.id.f67292131365356, "field 'tvMessage'", TextView.class);
        commonDialog.llSimpleDialog = (LinearLayout) drawDividersHorizontal.length(view, R.id.f53762131363932, "field 'llSimpleDialog'", LinearLayout.class);
    }

    @CallSuper
    public final void setMax() {
        CommonDialog commonDialog = this.getMin;
        if (commonDialog != null) {
            this.getMin = null;
            commonDialog.icImage = null;
            commonDialog.icImageFg = null;
            commonDialog.tvTitle = null;
            commonDialog.tvMessage = null;
            commonDialog.llSimpleDialog = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
