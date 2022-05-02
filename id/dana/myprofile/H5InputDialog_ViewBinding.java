package id.dana.myprofile;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class H5InputDialog_ViewBinding implements Unbinder {
    private View getMax;
    private H5InputDialog getMin;
    private View length;

    @UiThread
    public H5InputDialog_ViewBinding(final H5InputDialog h5InputDialog, View view) {
        this.getMin = h5InputDialog;
        h5InputDialog.etInputUrl = (EditText) drawDividersHorizontal.setMin(view, R.id.f43072131362825, "field 'etInputUrl'", EditText.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f65092131365134, "field 'tvCancel' and method 'onCancelClick'");
        h5InputDialog.tvCancel = (TextView) drawDividersHorizontal.getMin(max, R.id.f65092131365134, "field 'tvCancel'", TextView.class);
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                h5InputDialog.onCancelClick();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f66442131365271, "field 'tvGo' and method 'onGoClick'");
        h5InputDialog.tvGo = (TextView) drawDividersHorizontal.getMin(max2, R.id.f66442131365271, "field 'tvGo'", TextView.class);
        this.length = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                h5InputDialog.onGoClick();
            }
        });
        h5InputDialog.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        H5InputDialog h5InputDialog = this.getMin;
        if (h5InputDialog != null) {
            this.getMin = null;
            h5InputDialog.etInputUrl = null;
            h5InputDialog.tvCancel = null;
            h5InputDialog.tvGo = null;
            h5InputDialog.tvTitle = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
