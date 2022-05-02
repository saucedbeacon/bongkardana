package id.dana.richview;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class InputPhoneView_ViewBinding implements Unbinder {
    private InputPhoneView getMin;

    @UiThread
    public InputPhoneView_ViewBinding(InputPhoneView inputPhoneView, View view) {
        this.getMin = inputPhoneView;
        inputPhoneView.prefix = (TextView) drawDividersHorizontal.setMin(view, R.id.f56952131364271, "field 'prefix'", TextView.class);
        inputPhoneView.input = (EditText) drawDividersHorizontal.setMin(view, R.id.f46642131363211, "field 'input'", EditText.class);
        inputPhoneView.separator = drawDividersHorizontal.getMax(view, R.id.f60572131364645, "field 'separator'");
    }

    @CallSuper
    public final void setMax() {
        InputPhoneView inputPhoneView = this.getMin;
        if (inputPhoneView != null) {
            this.getMin = null;
            inputPhoneView.prefix = null;
            inputPhoneView.input = null;
            inputPhoneView.separator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
